package application.model;

import java.math.BigInteger;

/**
 * Created by Navi on 4/5/2016.
 */
public class StatisticsModel
{
    public static void main(String[] args)
    {
        System.out.println(permutation(new BigInteger("34"), new BigInteger("4")));
       // System.out.println(factorial(new BigInteger("34")) );/// factorial(34 - 4));
        //System.out.println(factorial(34 - 4));
    }

    /**
     *
     * @param n
     * @param r
     * @return
     */
    public static BigInteger permutation(BigInteger n, BigInteger r)
    {
        return factorial(n).divide(factorial(n.subtract(r)));
    }

    /**
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
     *
     * @param x
     * @return
     */
    private static BigInteger factorial(BigInteger x)
    {
        BigInteger one = new BigInteger("1");
        if (x.equals(one)) return x;
        return x.multiply(factorial(x.subtract(one)));
    }
}
