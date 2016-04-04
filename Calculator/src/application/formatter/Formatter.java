package application.formatter;

/**
 * Created by Navi on 01/04/2016.
 */
public class Formatter
{
    /**
     * Returns an empty string to clear screen.
     * @return
     */
    public static String clearScreen()
    {
        return Object.EMPTY;
    }

    /**
     * Adds a decimal to the end of a number.
     * If a decimal already exists in a number, it is not added.
     * @param number
     * @return String
     */
    public static String addDecimal(String number)
    {
        // If a number already has a decimal, decimal can not be added.
        for (char x : number.toCharArray()) if (x == Object.DECIMAL.toCharArray()[0]) return number;

        // Otherwise add the decimal at the end of the number.
        return number += Object.DECIMAL;
    }

/********************************
TODO: Not working at this point
********************************/
    public static String round(double number, int maxDigits)
    {
        String stringNum = Double.toString(number);

        // Separate the integers from decimals.
        int integerPlaces = stringNum.indexOf(Object.DECIMAL);
        int decimalPlaces = stringNum.length() - integerPlaces - 1;

        if (integerPlaces + decimalPlaces <= maxDigits) return stringNum;

        return Double.toString(Math.round(number));
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
}
