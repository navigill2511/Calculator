package application.model;

import application.formatter.Object;

/**
 * Created by Navi on 4/8/2016.
 */
public class ConverterModel
{
    /************ Area conversion factors ************/
    private static final double KMSQ_TO_KMSQ     = 1.0;
    private static final double KMSQ_TO_MSQ      = 1000000.0;
    private static final double KMSQ_TO_MILESQ   = 1000000.0;
    private static final double KMSQ_TO_YARDSQ   = 1000000.0;
    private static final double KMSQ_TO_FEETSQ   = 1000000.0;
    private static final double KMSQ_TO_INCHSQ   = 1000000.0;
    private static final double KMSQ_TO_ACRE     = 1000000.0;
    private static final double MSQ_TO_KMSQ      = 1000000.0;
    private static final double MSQ_TO_MSQ       = 1.0;
    private static final double MSQ_TO_MILESQ    = 1000000.0;
    private static final double MSQ_TO_YARDSQ    = 1000000.0;
    private static final double MSQ_TO_FEETSQ    = 1000000.0;
    private static final double MSQ_TO_INCHSQ    = 1000000.0;
    private static final double MSQ_TO_ACRE      = 1000000.0;
    private static final double MILESQ_TO_KMSQ   = 1000000.0;
    private static final double MILESQ_TO_MSQ    = 1000000.0;
    private static final double MILESQ_TO_MILESQ = 1.0;
    private static final double MILESQ_TO_YARDSQ = 1000000.0;
    private static final double MILESQ_TO_FEETSQ = 1000000.0;
    private static final double MILESQ_TO_INCHSQ = 1000000.0;
    private static final double MILESQ_TO_ACRE   = 1000000.0;
    private static final double YARDSQ_TO_KMSQ   = 1000000.0;
    private static final double YARDSQ_TO_MSQ    = 1000000.0;
    private static final double YARDSQ_TO_MILESQ = 1000000.0;
    private static final double YARDSQ_TO_YARDSQ = 1.0;
    private static final double YARDSQ_TO_FEETSQ = 1000000.0;
    private static final double YARDSQ_TO_INCHSQ = 1000000.0;
    private static final double YARDSQ_TO_ACRE   = 1000000.0;
    private static final double FEETSQ_TO_KMSQ   = 1000000.0;
    private static final double FEETSQ_TO_MSQ    = 1000000.0;
    private static final double FEETSQ_TO_MILESQ = 1000000.0;
    private static final double FEETSQ_TO_YARDSQ = 1000000.0;
    private static final double FEETSQ_TO_FEETSQ = 1.0;
    private static final double FEETSQ_TO_INCHSQ = 1000000.0;
    private static final double FEETSQ_TO_ACRE   = 1000000.0;
    private static final double INCHSQ_TO_KMSQ   = 1000000.0;
    private static final double INCHSQ_TO_MSQ    = 1000000.0;
    private static final double INCHSQ_TO_MILESQ = 1000000.0;
    private static final double INCHSQ_TO_YARDSQ = 1000000.0;
    private static final double INCHSQ_TO_FEETSQ = 1000000.0;
    private static final double INCHSQ_TO_INCHSQ = 1.0;
    private static final double INCHSQ_TO_ACRE   = 1000000.0;
    private static final double ACRE_TO_KMSQ     = 1000000.0;
    private static final double ACRE_TO_MSQ      = 1000000.0;
    private static final double ACRE_TO_MILESQ   = 1000000.0;
    private static final double ACRE_TO_YARDSQ   = 1000000.0;
    private static final double ACRE_TO_FEETSQ   = 1000000.0;
    private static final double ACRE_TO_INCHSQ   = 1000000.0;
    private static final double ACRE_TO_ACRE     = 1.0;

    public static double areaConverter(double number, String from, String to)
    {
        double result = -1.0;
        if (from.equals(Object.KM_SQ))
        {
            switch (to)
            {
                case (Object.KM_SQ)   : result = (number * KMSQ_TO_KMSQ);   break;
                case (Object.M_SQ)    : result = (number * KMSQ_TO_MSQ);    break;
                case (Object.MILE_SQ) : result = (number * KMSQ_TO_MILESQ); break;
                case (Object.YARD_SQ) : result = (number * KMSQ_TO_YARDSQ); break;
                case (Object.FEET_SQ) : result = (number * KMSQ_TO_FEETSQ); break;
                case (Object.INCH_SQ) : result = (number * KMSQ_TO_INCHSQ); break;
                case (Object.ACRE)    : result = (number * KMSQ_TO_ACRE);   break;
            }
        }

        if (from.equals(Object.M_SQ))
        {
            switch (to)
            {
                case (Object.KM_SQ)   : result = (number * MSQ_TO_KMSQ);   break;
                case (Object.M_SQ)    : result = (number * MSQ_TO_MSQ);    break;
                case (Object.MILE_SQ) : result = (number * MSQ_TO_MILESQ); break;
                case (Object.YARD_SQ) : result = (number * MSQ_TO_YARDSQ); break;
                case (Object.FEET_SQ) : result = (number * MSQ_TO_FEETSQ); break;
                case (Object.INCH_SQ) : result = (number * MSQ_TO_INCHSQ); break;
                case (Object.ACRE)    : result = (number * MSQ_TO_ACRE);   break;
            }
        }

        if (from.equals(Object.MILE_SQ))
        {
            switch (to)
            {
                case (Object.KM_SQ)   : result = (number * MILESQ_TO_KMSQ);   break;
                case (Object.M_SQ)    : result = (number * MILESQ_TO_MSQ);    break;
                case (Object.MILE_SQ) : result = (number * MILESQ_TO_MILESQ); break;
                case (Object.YARD_SQ) : result = (number * MILESQ_TO_YARDSQ); break;
                case (Object.FEET_SQ) : result = (number * MILESQ_TO_FEETSQ); break;
                case (Object.INCH_SQ) : result = (number * MILESQ_TO_INCHSQ); break;
                case (Object.ACRE)    : result = (number * MILESQ_TO_ACRE);   break;
            }
        }

        if (from.equals(Object.YARD_SQ))
        {
            switch (to)
            {
                case (Object.KM_SQ)   : result = (number * YARDSQ_TO_KMSQ);   break;
                case (Object.M_SQ)    : result = (number * YARDSQ_TO_MSQ);    break;
                case (Object.MILE_SQ) : result = (number * YARDSQ_TO_MILESQ); break;
                case (Object.YARD_SQ) : result = (number * YARDSQ_TO_YARDSQ); break;
                case (Object.FEET_SQ) : result = (number * YARDSQ_TO_FEETSQ); break;
                case (Object.INCH_SQ) : result = (number * YARDSQ_TO_INCHSQ); break;
                case (Object.ACRE)    : result = (number * YARDSQ_TO_ACRE);   break;
            }
        }

        if (from.equals(Object.FEET_SQ))
        {
            switch (to)
            {
                case (Object.KM_SQ)   : result = (number * FEETSQ_TO_KMSQ);   break;
                case (Object.M_SQ)    : result = (number * FEETSQ_TO_MSQ);    break;
                case (Object.MILE_SQ) : result = (number * FEETSQ_TO_MILESQ); break;
                case (Object.YARD_SQ) : result = (number * FEETSQ_TO_YARDSQ); break;
                case (Object.FEET_SQ) : result = (number * FEETSQ_TO_FEETSQ); break;
                case (Object.INCH_SQ) : result = (number * FEETSQ_TO_INCHSQ); break;
                case (Object.ACRE)    : result = (number * FEETSQ_TO_ACRE);   break;
            }
        }

        if (from.equals(Object.INCH_SQ))
        {
            switch (to)
            {
                case (Object.KM_SQ)   : result = (number * INCHSQ_TO_KMSQ);   break;
                case (Object.M_SQ)    : result = (number * INCHSQ_TO_MSQ);    break;
                case (Object.MILE_SQ) : result = (number * INCHSQ_TO_MILESQ); break;
                case (Object.YARD_SQ) : result = (number * INCHSQ_TO_YARDSQ); break;
                case (Object.FEET_SQ) : result = (number * INCHSQ_TO_FEETSQ); break;
                case (Object.INCH_SQ) : result = (number * INCHSQ_TO_INCHSQ); break;
                case (Object.ACRE)    : result = (number * INCHSQ_TO_ACRE);   break;
            }
        }

        if (from.equals(Object.ACRE))
        {
            switch (to)
            {
                case (Object.KM_SQ)   : result = (number * ACRE_TO_KMSQ);   break;
                case (Object.M_SQ)    : result = (number * ACRE_TO_MSQ);    break;
                case (Object.MILE_SQ) : result = (number * ACRE_TO_MILESQ); break;
                case (Object.YARD_SQ) : result = (number * ACRE_TO_YARDSQ); break;
                case (Object.FEET_SQ) : result = (number * ACRE_TO_FEETSQ); break;
                case (Object.INCH_SQ) : result = (number * ACRE_TO_INCHSQ); break;
                case (Object.ACRE)    : result = (number * ACRE_TO_ACRE);   break;
            }
        }

        return result;
    }

    public static double energyConverter(double number, String from, String to)
    {
        return 0;
    }

    public static double forceConverter(double number, String from, String to)
    {
        return 0;
    }

    public static double lengthConverter(double number, String from, String to)
    {
        return 0;
    }

    public static double speedConverter(double number, String from, String to)
    {
        return 0;
    }

    public static double tempConverter(double number, String from, String to)
    {
        return 0;
    }

    public static double weightConverter(double number, String from, String to)
    {
        return 0;
    }

}
