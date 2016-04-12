package application.formatter;

import java.util.ArrayList;
import java.util.stream.Collectors;

/***********************************************************************************************************************
 * Created by Navi on 01/04/2016.
 *
 * Class Formatter is a static class used to format a given string. It can do the following:
 *
 *  addDecimal()                |   adds a decimal to the end if not already added.
 *  negativePositive()          |   makes a number negative if positive and positive if negative.
 *  addLeftParenthesis()        |   adds a left parenthesis.
 *  addRightParenthesis()       |   adds a right parenthesis.
 *  surroundWithParenthesis()   |   surrounds the string with parenthesis.
 *  delete()                    |   deletes the last character from a string.
 *  isOperator()                |   checks if a given character is an operator.
 *  isDigit()                   |   checks if a given character is a digit.
 *  toArrayList()               |   converts a given string of numbers into an arrayList of numbers.
 *
 ***********************************************************************************************************************/
public class Formatter
{
    /**
     * Adds a decimal to the end of a number or an expression with operators.
     * If a decimal already exists in a number, it is not added.
     * @param number
     * @return String
     */
    public static String addDecimal(String number)
    {
        for (int i = number.length() - 1; i >= 0; i--)
        {
            String current = number.substring(i, i + 1);
            if (isOperator(current)) break;
            if (current.equals(Object.DECIMAL)) return number;
        }

        // Otherwise add the decimal at the end of the number.
        return number += Object.DECIMAL;
    }

    /**
     * Makes a number negative if it is positive and positive if it is negative.
     * @param number
     * @return
     */
    public static String negativePositive(String number)
    {
        // Check if the number has a negative sign in it.
        boolean negative = (number.substring(0, 1).equals(Object.NEGATIVE));

        // If the number has a negative sign, remove it otherwise add it.
        return (negative) ? number.substring(1, number.length()) : (Object.NEGATIVE + number);
    }

    /**
     * Adds a left parenthesis to a number.
     * @param number
     * @return
     */
    public static String addLeftParenthesis(String number)
    {
        // If the string is empty add left parenthesis.
        if (number.equals(Object.EMPTY)) return Object.LEFT_PARENTHESIS;

        // If the object to the immediate left is a digit, add right parenthesis.
        if (Object.DIGITS.contains(number.substring(number.length() - 1, number.length())))
        {
            return number + Object.MULTIPLY + Object.LEFT_PARENTHESIS;
        }

        return number + Object.LEFT_PARENTHESIS;
    }

    /**
     * Adds a right parenthesis to a number.
     * @param number
     * @return
     */
    public static String addRightParenthesis(String number)
    {
        // If the string is empty or the immediate left is an operator, right parenthesis can not be added.
        if (Object.ALL_OPERATORS.contains(number.charAt(number.length() - 1) + "")) return number;

        // Right parenthesis can only be added if their number is less than the left parenthesis.
        // Count the number of parenthesis first.
        int rightParenthesis = 0;
        for (String s : number.split(""))
        {
            if (s.equals(Object.LEFT_PARENTHESIS))  rightParenthesis--;
            if (s.equals(Object.RIGHT_PARENTHESIS)) rightParenthesis++;
        }
        if (rightParenthesis < 0) return number + Object.RIGHT_PARENTHESIS;

        // Don't add the parenthesis.
        return number;
    }

    /**
     * Given a string, this method surrounds it with parenthesis.
     * @param number
     * @return String
     */
    public static String surroundWithParenthesis(String number)
    {
        return Object.LEFT_PARENTHESIS + number + Object.RIGHT_PARENTHESIS;
    }

    /**
     * Deletes the last digit from a number
     * @param number
     * @return String with the deleted digit.
     */
    public static String delete(String number)
    {
        return number.substring(0, number.length() - 1);
    }

    /**
     * Removes a decimal if a number has a decimal value of zero.
     * @param number
     * @return
     */
    public static String round(String number)
    {
        System.out.println(number);

        // Get the decimal value.
        int decimalIndex = number.indexOf(Object.DECIMAL);
        long decimal = Long.parseLong(number.substring(decimalIndex + 1, number.length()));

        // Only remove the decimal if the decimal value is zero.
        return (decimal == 0) ? number.substring(0, decimalIndex) : number;
    }

    /**
     * Determines if a given character is an integer. A decimal and a "-" is consodered an integer.
     * @param character
     * @return
     */
    public static boolean isDigit(String character)
    {
        return (character.equals("1") || character.equals("2") || character.equals("3") ||
                character.equals("4") || character.equals("5") || character.equals("6") ||
                character.equals("7") || character.equals("8") || character.equals("9") ||
                character.equals("0") || character.equals(".") );
    }

    /**
     * Determines if a given operator is an operator.
     * @param character
     * @return
     */
    public static boolean isOperator(String character)
    {
        return (character.equals(Object.ADD)      || character.equals(Object.SUBTRACT) ||
                character.equals(Object.MULTIPLY) || character.equals(Object.DIVIDE)   ||
                character.equals(Object.REMAINDER));
    }

    /**
     * Converts a data given in the form of, "1, 2, 3, 4" or "1 2 3 4" into an
     * arrayList of numbers. numbers are kept as a string, they are not parsed.
     * @param data
     * @return
     */
    public static ArrayList<String> toArrayList(String data)
    {
        // Obtain the infix expression tokens as an array of strings.
        ArrayList<String> tokens = new ArrayList<>();

        // Convert the expression into an array of operands and operators first.
        int digitBeginFlag = 0;
        for (int i = 0; i < data.length(); i++)
        {
            String currentChar = data.substring(i, i + 1);

            // If the current character is not a digit or a decimal, add it to 'tokens'
            if (!isDigit(currentChar))
            {
                digitBeginFlag = i + 1; // Flags the beginning of digits.
                continue;
            }

            // Get the next number up until the operator.
            while (i < data.length())
            {
                currentChar = data.substring(i, i + 1);

                // If current object is not a digit or not a decimal, break loop.
                if (!isDigit(currentChar)) break;
                i++;
            }

            // Add the number to the 'tokens'.
            tokens.add(data.substring(digitBeginFlag, i));
            i--;
        }

        return tokens;
    }

    /**
     * Converts a given arrayList of numbers as a String into an arrayList of Double.
     * @param tokens
     * @return
     */
    public static ArrayList<Double> toDouble(ArrayList<String> tokens)
    {
        return tokens.stream().map(Double::parseDouble).collect(Collectors.toCollection(ArrayList::new));
    }
}