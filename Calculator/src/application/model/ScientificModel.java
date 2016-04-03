package application.model;
import application.formatter.Object;

import java.lang.Math;
import java.util.ArrayList;

public class ScientificModel
{
    private static final String ADD = "+";                // Token for addition operator.
    private static final String SUBTRACT = "-";           // Token for subtraction operator.
    private static final String MULTIPLY = "*";           // Token for multiplication operator.
    private static final String DIVIDE = "/";             // Token for division operator.
    private static final String ADD_OR_SUBTRACT = ADD + SUBTRACT;
    private static final String ALL_OPERATORS = ADD + SUBTRACT + MULTIPLY + DIVIDE;
    private static final String LEFT_PARENTHESIS = "(";   // Token for a left parenthesis.
    private static final String RIGHT_PARENTHESIS = ")";  // Token for a right parenthesis.
    private static final String WHITESPACE = "\\s+";      // Regular expression for whitespace.

    public static boolean rad = true;

    /**
     * Evaluate a postfix expression.
     * @param postfix A String that contains an expression in postfix notation.
     *                The allowable operators are +, -, *, and /.  Operands are
     *                integers (signed or unsigned).  The operators and operands
     *                must be surrounded by at least one space.
     * @return The value of the postfix expression.
     */
    public static int evaluate(String postfix) {

        // Obtain the tokens as an array of strings.
        String[] tokens = postfix.split(WHITESPACE);
        System.out.println(postfix);

        // Create a stack for the operands.
        Stack<Integer> operands = new Stack<>();

        // Process the tokens.
        for (String token : tokens) {		// for each token in the array of tokens do something.



            // If the token is an integer, it is an operand and can be placed on the stack.
            try {
                operands.push(Integer.parseInt(token));
            }

            // If the token is not an operand, it must be an operator.  Remove the top two
            catch (NumberFormatException nfe) {
                int operand2 = operands.pop();
                int operand1 = operands.pop();
                if (token.equals(ADD)) operands.push(operand1 + operand2);
                if (token.equals(SUBTRACT)) operands.push(operand1 - operand2);
                if (token.equals(MULTIPLY)) operands.push(operand1 * operand2);
                if (token.equals(DIVIDE)) operands.push(operand1 / operand2);
            }
            // operands, perform the appropriate operation, and place the result on the stack.
        }
        // The expression value is on the stack.
        return operands.pop();
    }

    /**
     * Convert an infix expression to postfix notation.
     * @param infix A String that contains an expression in infix notation.
     *              Operators, operands, and brackets must be surrounded by
     *              at least one space.
     * @return The postfix expression, as a String, that is equivalent to the infix expression.
     */
    public static String convertToPostfix(String infix)
    {
        // Obtain the infix expression tokens as an array of strings.
        ArrayList<String> tokens = new ArrayList<>();

        // Convert the expression into an array of operands and operators first.
        int left = 0, right = 0;
        while (right < infix.length())
        {
            String nextCharacter = infix.substring(right, right + 1);

            if (!isOperator(nextCharacter)) { right++; continue; }

            tokens.add(infix.substring(left, right));
            tokens.add(nextCharacter);
            right = left = right + 1;
        }

        if (left != right) tokens.add(infix.substring(left, right));

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
    public static String convertToPostfix(ArrayList<String> infix, int first, int last)
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
            if (token.equals(LEFT_PARENTHESIS))
            {
                int match = findMatchingParenthesis(infix, first + 1, last);
                output += convertToPostfix(infix, first + 1, match - 1) + " ";
                first = match;
            }
            else
            {
                // If the token is an operand, just output the operand.
                if (ALL_OPERATORS.indexOf(token) < 0) output += token + " ";
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
            if (token.equals(LEFT_PARENTHESIS)) left++;

            // When a right parenthesis is encountered, it is the matching one
            // only after all the intervening left parentheses have been matched.
            if (token.equals(RIGHT_PARENTHESIS))
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
        // does the same thing in a different way!
        /**if (ADD_OR_SUBTRACT.indexOf(operator) >= 0) return 0;
         else return 1; **/
        return ADD_OR_SUBTRACT.indexOf(operator) >= 0 ? 0 : 1;
    }

    private static boolean isOperator(String token)
    {
        return (token.equals(Object.ADD)      || token.equals(Object.SUBTRACT) ||
                token.equals(Object.MULTIPLY) || token.equals(Object.DIVIDE)   ||
                token.equals(Object.REMAINDER));
    }


    public static double sin(double x)
    {
        return (rad) ? Math.sin(x) : Math.toDegrees(Math.sin(Math.toRadians(x)));
    }

    public static double cos(double x)
    {
        return (rad) ? Math.cos(x) : Math.toDegrees(Math.cos(Math.toRadians(x)));
    }

    public static double tan(double x)
    {
        return (rad) ? Math.tan(x) : Math.toDegrees(Math.tan(Math.toRadians(x)));
    }

    public static double sinh(double x)
    {
        return (rad) ? Math.sinh(x) : Math.toDegrees(Math.sinh(Math.toRadians(x)));
    }

    public static double cosh(double x)
    {
        return (rad) ? Math.cosh(x) : Math.toDegrees(Math.cosh(Math.toRadians(x)));
    }

    public static double tanh(double x)
    {
        return (rad) ? Math.tanh(x) : Math.toDegrees(Math.tanh(Math.toRadians(x)));
    }

    public static double invSin(double x)
    {
        return (rad) ? Math.asin(x) : Math.toDegrees(Math.asin(Math.toRadians(x)));
    }

    public static double inCos(double x)
    {
        return (rad) ? Math.acos(x) : Math.toDegrees(Math.acos(Math.toRadians(x)));
    }

    public static double invTan(double x)
    {
        return (rad) ? Math.atan(x) : Math.toDegrees(Math.atan(Math.toRadians(x)));
    }

    public static double invSinh(double x)
    {
        if (!rad) x = Math.toRadians(x);
        x = x + (Math.sqrt(x * x + 1.0));

        return (rad) ? x : Math.toDegrees(x);
    }

    public static double invCosh(double x)
    {
        if (!rad) x= Math.toRadians(x);
        x = x + (Math.sqrt(x * x - 1.0));

        return (rad) ? x : Math.toDegrees(x);
    }

    public static double invTanh(double x)
    {
        if (!rad) x= Math.toRadians(x);
        x = x * ((x + 1.0) / (x - 1));

        return (rad) ? x : Math.toDegrees(x);
    }

    public static double square(double num)
    {
        return num * num;
    }

    public static double cube(double num)
    {
        return num * num * num;
    }

    public static double toThePower(double base, int exponent)
    {
        return Math.pow(base, exponent);
    }

    public static double tenToThePower(double x)
    {
        if (x == 0) return 1;

        double num = 10;

        if (x < 0) for (int i = 1; i < x; i++) num = num / 10;
        if (x > 0) for (int i = 1; i < x; i++) num = num * 10;

        return num;
    }

    public static double eToThePower(double x)
    {
        return Math.exp(x);
    }

    public static double ln(double x)
    {
        return Math.log(x);
    }

    public static double log(double x)
    {
        return Math.log10(x);
    }

    public static double log2(double x)
    {
        return (Math.log10(x) / Math.log10(2));
    }

    public static double logx(double x, int base)
    {
        return (Math.log10(x) / Math.log10(base));
    }

    public static double sqrt(double x)
    {
        return Math.sqrt(x);
    }

    public static double cbrt(double x)
    {
        return Math.cbrt(x);
    }

    public static double nroot(double x, int n)
    {
        return Math.pow(x, 1 / n);
    }
}