package application.model;
import java.math.BigInteger;
import java.util.ArrayList;

/***********************************************************************************************************************
 * Created by Navi on 4/5/2016.
 *
 * Class StatisticsModel models the statistics functionality of the application. It has the folloeing methods:
 *  permutation()           |   evaulates nPr
 *  combination()           |   evaualtes nCr
 *  singleEventProbability()|   finds the probabilty or some occurance
 *  standardDeviation()     |   finds the standard deviation given a data set.
 ***********************************************************************************************************************/
public class StatisticsModel
{
    /**
     * Calculates permutations using formula below.
     * nPr = n! / (n - r)!
     * @param n number of occurrences.
     * @param r number of
     * @return
     */
    public static BigInteger permutation(BigInteger n, BigInteger r)
    {
        return factorial(n).divide(factorial(n.subtract(r)));
    }

    /**
     * Calculates combination using formula below
     * nCr = n! / r!(n - r)!
     * @param n
     * @param r
     * @return
     */
    public static BigInteger combination(BigInteger n, BigInteger r)
    {
        return factorial(n).divide(factorial(r).multiply(factorial(n.subtract(r))));
    }

    /**
     * Calculates factorial of a given integer. Uses recursion.
     * @param x
     * @return
     */
    private static BigInteger factorial(BigInteger x)
    {
        BigInteger one = new BigInteger("1");
        if (x.equals(one)) return x;
        return x.multiply(factorial(x.subtract(one)));
    }

    /**
     * Single event probability of an event A, P(A) = (#occurences / #outcomes).
     * @param occurrences
     * @param outcomes
     * @return
     */
    public static double singleEventProbability(double occurrences, double outcomes)
    {
        return (occurrences / outcomes);
    }

    /**
     * Finds the probability of A and B (Union). Formula: P(A)*P(B)
     * @param occurrencesInA
     * @param occurrencesInB
     * @param outcomes
     * @return
     */
    public static double A_and_B_probability(double occurrencesInA, double occurrencesInB, double outcomes)
    {
        double probability_A = singleEventProbability(occurrencesInA, outcomes);
        double probability_B = singleEventProbability(occurrencesInB, outcomes);
        return probability_A * probability_B;
    }

    /**
     * Finds the probability of A or B. Formula: P(A)/P(B)
     * @param occurrencesInA
     * @param occurrencesInB
     * @param outcomes
     * @return
     */
    public static double A_or_B_Probability(double occurrencesInA, double occurrencesInB, double outcomes)
    {
        double probability_A_and_B = A_and_B_probability(occurrencesInA, occurrencesInB, outcomes);
        double probability_B = singleEventProbability(occurrencesInB, outcomes);
        return probability_A_and_B / probability_B;
    }

    /**
     * Finds the sum of all the integers in an ArrayList of double
     * @param tokens
     * @return
     */
    public static double sum(ArrayList<Double> tokens)
    {
        return sum(tokens, tokens.size() - 1);
    }

    /**
     * A recursive helper for the previous, 'sum()'
     * @param tokens
     * @param last
     * @return
     */
    private static double sum(ArrayList<Double> tokens, int last)
    {
        if (last == 0) return tokens.get(last);
        return tokens.get(last) + sum(tokens, last - 1);
    }

    /**
     * Finds the mean given the sum and the number of elements.
     * @param sum
     * @param length
     * @return
     */
    public static double mean(double sum, double length)
    {
        return sum / length;
    }

    /**
     * Finds the standard deviation given an arrayList of dataset, their count and mean.
     * @param tokens
     * @param count
     * @param mean
     * @return
     */
    public static double standardDeviation(ArrayList<Double> tokens, double count, double mean)
    {
        int sum = 0;
        for (double current : tokens) sum += ((current - mean) * (current - mean));

        return Math.sqrt(sum / count);
    }
}