package application.model;
import application.formatter.Formatter;
import application.formatter.Object;
import java.util.ArrayList;

/***********************************************************************************************************************
 * Created by Navi on 01/04/2016.
 *
 * Class StandardModel models the standard functionality of the application. It used a stack to evaluate a given
 * expression. StandardModel has the following functions:
 *  evaluate()          |   Given an infix expression, it is first converted to prefix so it can be evaluated
 *                      |   using a stack.
 ***********************************************************************************************************************/
public class StandardModel {

    public static void main (String[] args)
    {
        //if (Object.DIGITS.contains("*")) System.out.println("yay");

        System.out.println(evaluate("23-3"));
    }

    /**
     * Evaluate a postfix expression.
     * @param infix A String that contains an expression in postfix notation.
     *                The allowable operators are +, -, *, and /.  Operands are
     *                integers (signed or unsigned).  The operators and operands
     *                must be surrounded by at least one space.
     * @return The value of the postfix expression.
     */
    public static double evaluate(String infix)
    {
        // 1. Convert to postfix and put the tokens into an array.
        String postfix = convertToPostfix(infix);

        System.out.println(postfix);

        String[] tokens = postfix.split(Object.WHITESPACE);

        // 2. Create a stack for the operands.
        Stack<Double> operands = new Stack<>();

        // 3. Process the tokens.
        for (String token : tokens)
        {
            System.out.println(token);

            // If the token is an integer, it is an operand and can be placed on the stack.
            try
            {
                operands.push(Double.parseDouble(token));
            }

            // If the token is not an operand, it must be an operator.  Remove the top two
            catch (NumberFormatException nfe)
            {
                double operand2 = operands.pop();
                double operand1 = operands.pop();
                if (token.equals(Object.ADD))      operands.push(operand1 + operand2);
                if (token.equals(Object.SUBTRACT)) operands.push(operand1 - operand2);
                if (token.equals(Object.MULTIPLY)) operands.push(operand1 * operand2);
                if (token.equals(Object.DIVIDE))   operands.push(operand1 / operand2);
                if (token.equals(Object.REMAINDER))operands.push(operand1 % operand2);
            }
            // operands, perform the appropriate operation, and place the result on the stack.
        }
        // The expression value is on the stack.
        return operands.pop();
    }

    /**
     * Convert an infix expression to postfix notation.
     * @param infix A String that contains an expression in infix notation.
     * @return The postfix expression, as a String, that is equivalent to the infix expression.
     */
    private static String convertToPostfix(String infix)
    {
        // Obtain the infix expression tokens as an array of strings.
        ArrayList<String> tokens = new ArrayList<>();

        // Convert the expression into an array of operands and operators first.
        int digitBeginFlag = 0;
        for (int i = 0; i < infix.length(); i++)
        {
            String currentChar = infix.substring(i, i + 1);

            // If the current character is not a digit or a decimal, add it to 'tokens'
            if (!Formatter.isDigit(currentChar))
            {
                digitBeginFlag = i + 1; // Flags the beginning of digits.
                tokens.add(currentChar);
                continue;
            }

            // Get the next number up until the operator.
            while (i < infix.length())
            {
                currentChar = infix.substring(i, i + 1);

                // If current object is not a digit or not a decimal, break loop.
                if (!Formatter.isDigit(currentChar)) break;
                i++;
            }

            // Add the number to the 'tokens'.
            tokens.add(infix.substring(digitBeginFlag, i));
            i--;
        }

        // Convert to postfix and return expression as string.
        return convertToPostfix(tokens, 0, tokens.size() - 1);
    }

    /**
     * Convert an infix expression to postfix notation.
     * @param infix A String[] for the infix expression where each element of the array contains
     *              one token of the infix expression.
     * @param first The index of the first token to be processed.
     * @param last The index of the last token to be processed.
     * @return The postfix expression, as a String, that is equivalent to the infix expression.
     */
    private static String convertToPostfix(ArrayList<String> infix, int first, int last)
    {
        // Create a stack for the operators and a string for the output expression.
        Stack<String> operators = new Stack<>();
        String output = "";

        // Process the tokens.
        while (first <= last)
        {
            String token = infix.get(first);

            // If the token is a left parenthesis, find the matching parenthesis and
            // convert the tokens between the matching parentheses.
            if (token.equals(Object.LEFT_PARENTHESIS))
            {
                int match = findMatchingParenthesis(infix, first + 1, last);
                output += convertToPostfix(infix, first + 1, match - 1) + " ";
                first = match;
            }
            else
            {
                // If the token is an operand, just output the operand.
                if (!Object.ALL_OPERATORS.contains(token)) output += token + " ";
                else
                {
                    // The token is an operator.  Output those operators on the stack
                    // that have equal or higher precedence than the token
                    while (!operators.isEmpty() && (precedence(operators.peek()) >= precedence(token)))
                    {
                        output += operators.pop() + " ";
                    }
                    operators.push(token);
                }
            }
            // Advance to the next token in the infix expression.
            first++;
        }

        // Output any remaining operators.
        while (!operators.isEmpty()) output += operators.pop() + " ";

        return output;
    }

    /**
     * Find the matching parenthesis.
     * @param tokens A String[] of tokens to be searched.
     * @param first The index of the first token to be searched.
     * @param last The index of the last token to be searched.
     * @return The index number for the matching closing parenthesis token.
     */
    private static int findMatchingParenthesis(ArrayList<String> tokens, int first, int last) {
        int left = 0;

        while (first <= last)
        {
            String token = tokens.get(first);

            // Count the number of left parentheses encountered.
            if (token.equals(Object.LEFT_PARENTHESIS)) left++;

            // When a right parenthesis is encountered, it is the matching one
            // only after all the intervening left parentheses have been matched.
            if (token.equals(Object.RIGHT_PARENTHESIS))
            {
                if (left == 0) return first;
                else left--;
            }
            first++;
        }
        return -1;	// No matching parenthesis.
    }

    /**
     * Determine the precedence for an operator.
     * @param operator An operator.
     * @return 0 if the operator is + or -; otherwise, return 1.
     */
    private static int precedence(String operator)
    {
        return Object.ADD_OR_SUBTRACT.indexOf(operator) >= 0 ? 0 : 1;
    }
}