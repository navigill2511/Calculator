package application;

import java.lang.Math;

public class StandardScientificModel
{
    private boolean rad;

    public StandardScientificModel()
    {
        this.rad = true;
    }

    public StandardScientificModel(boolean rad)
    {
        this.rad = rad;
    }

    public double add(double x, double y)
    {
        return x + y;
    }

    public double subtract(double x, double y)
    {
        return x - y;
    }

    public double multipy(double x, double y)
    {
        return x * y;
    }

    public double divide(double x, double y)
    {
        return x / y;
    }

    public double remainder(double x, double y)
    {
        return x % y;
    }

    public double sin(double x)
    {
        return (rad) ? Math.sin(x) : Math.toDegrees(Math.sin(Math.toRadians(x)));
    }

    public double cos(double x)
    {
        return (rad) ? Math.cos(x) : Math.toDegrees(Math.cos(Math.toRadians(x)));
    }

    public double tan(double x)
    {
        return (rad) ? Math.tan(x) : Math.toDegrees(Math.tan(Math.toRadians(x)));
    }

    public double sinh(double x)
    {
        return (rad) ? Math.sinh(x) : Math.toDegrees(Math.sinh(Math.toRadians(x)));
    }

    public double cosh(double x)
    {
        return (rad) ? Math.cosh(x) : Math.toDegrees(Math.cosh(Math.toRadians(x)));
    }

    public double tanh(double x)
    {
        return (rad) ? Math.tanh(x) : Math.toDegrees(Math.tanh(Math.toRadians(x)));
    }

    public double invSin(double x)
    {
        return (rad) ? Math.asin(x) : Math.toDegrees(Math.asin(Math.toRadians(x)));
    }

    public double inCos(double x)
    {
        return (rad) ? Math.acos(x) : Math.toDegrees(Math.acos(Math.toRadians(x)));
    }

    public double invTan(double x)
    {
        return (rad) ? Math.atan(x) : Math.toDegrees(Math.atan(Math.toRadians(x)));
    }

    public double invSinh(double x)
    {
        if (!rad) x = Math.toRadians(x);
        x = x + (Math.sqrt(x * x + 1.0));

        return (rad) ? x : Math.toDegrees(x);
    }

    public double invCosh(double x)
    {
        if (!rad) x= Math.toRadians(x);
        x = x + (Math.sqrt(x * x - 1.0));

        return (rad) ? x : Math.toDegrees(x);
    }

    public double invTanh(double x)
    {
        if (!rad) x= Math.toRadians(x);
        x = x * ((x + 1.0) / (x - 1));

        return (rad) ? x : Math.toDegrees(x);
    }

    public double square(double num)
    {
        return num * num;
    }

    public double cube(double num)
    {
        return num * num * num;
    }

    public double toThePower(double base, int exponent)
    {
        return Math.pow(base, exponent);
    }

    public double tenToThePower(double x)
    {
        if (x == 0) return 1;

        double num = 10;

        if (x < 0) for (int i = 1; i < x; i++) num = num / 10;
        if (x > 0) for (int i = 1; i < x; i++) num = num * 10;

        return num;
    }

    public double eToThePower(double x)
    {
        return Math.exp(x);
    }

    public double ln(double x)
    {
        return Math.log(x);
    }

    public double log(double x)
    {
        return Math.log10(x);
    }

    public double log2(double x)
    {
        return (Math.log10(x) / Math.log10(2));
    }

    public double logx(double x, int base)
    {
        return (Math.log10(x) / Math.log10(base));
    }

    public double sqrt(double x)
    {
        return Math.sqrt(x);
    }

    public double cbrt(double x)
    {
        return Math.cbrt(x);
    }

    public double nroot(double x, int n)
    {
        return Math.pow(x, 1 / n);
    }
}