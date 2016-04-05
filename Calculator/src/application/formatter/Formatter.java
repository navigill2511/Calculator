package application.formatter;

import application.model.StandardModel;

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
 *
 ***********************************************************************************************************************/
public class Formatter
{
    public static void main(String[] args)
    {
        System.out.println(round(Double.toString(StandardModel.evaluate("2.06+3"))));
    }

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

    public static boolean isDigit(String character)
    {
        return (character.equals("1") || character.equals("2") || character.equals("3") ||
                character.equals("4") || character.equals("5") || character.equals("6") ||
                character.equals("7") || character.equals("8") || character.equals("9") ||
                character.equals("0") || character.equals("."));
    }

    public static boolean isOperator(String character)
    {
        return (character.equals(Object.ADD)      || character.equals(Object.SUBTRACT) ||
                character.equals(Object.MULTIPLY) || character.equals(Object.DIVIDE)   ||
                character.equals(Object.REMAINDER));
    }
}