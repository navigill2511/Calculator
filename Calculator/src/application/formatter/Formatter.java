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


    public static String round(double number, int maxDigits)
    {
        String stringNum = Double.toString(number);

        // Separate the integers from decimals.
        int integerPlaces = stringNum.indexOf(Object.DECIMAL);
        int decimalPlaces = stringNum.length() - integerPlaces - 1;

        if (integerPlaces + decimalPlaces <= maxDigits) return stringNum;

        return Double.toString(Math.round(number));
    }
}
