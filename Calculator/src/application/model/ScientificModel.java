package application.model;

import java.lang.Math;

public class ScientificModel
{
    public static boolean rad = true;

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