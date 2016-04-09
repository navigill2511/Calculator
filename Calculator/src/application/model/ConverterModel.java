package application.model;

import application.formatter.Object;

/***********************************************************************************************************************
 * Created by Navi on 4/8/2016.
 *
 * Class ConverterModel
 ***********************************************************************************************************************/
public class ConverterModel
{
    /**************** Area conversion factors ****************/
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

    /**************** Energy conversion factors ****************/
    private static final double CAL_TO_CAL         = 1.0;
    private static final double CAL_TO_KCAL        = 1000.0;
    private static final double CAL_TO_JOULES      = 1000.0;
    private static final double CAL_TO_KJOULES     = 1000.0;
    private static final double CAL_TO_MJOULES     = 1000.0;
    private static final double CAL_TO_WHATT       = 1000.0;
    private static final double CAL_TO_KWHATT      = 1000.0;
    private static final double KCAL_TO_CAL        = 1.0;
    private static final double KCAL_TO_KCAL       = 1000.0;
    private static final double KCAL_TO_JOULES     = 1000.0;
    private static final double KCAL_TO_KJOULES    = 1000.0;
    private static final double KCAL_TO_MJOULES    = 1000.0;
    private static final double KCAL_TO_WHATT      = 1000.0;
    private static final double KCAL_TO_KWHATT     = 1000.0;
    private static final double JOULES_TO_CAL      = 1.0;
    private static final double JOULES_TO_KCAL     = 1000.0;
    private static final double JOULES_TO_JOULES   = 1000.0;
    private static final double JOULES_TO_KJOULES  = 1000.0;
    private static final double JOULES_TO_MJOULES  = 1000.0;
    private static final double JOULES_TO_WHATT    = 1000.0;
    private static final double JOULES_TO_KWHATT   = 1000.0;
    private static final double KJOULES_TO_CAL     = 1.0;
    private static final double KJOULES_TO_KCAL    = 1000.0;
    private static final double KJOULES_TO_JOULES  = 1000.0;
    private static final double KJOULES_TO_KJOULES = 1000.0;
    private static final double KJOULES_TO_MJOULES = 1000.0;
    private static final double KJOULES_TO_WHATT   = 1000.0;
    private static final double KJOULES_TO_KWHATT  = 1000.0;
    private static final double MJOULES_TO_CAL     = 1.0;
    private static final double MJOULES_TO_KCAL    = 1000.0;
    private static final double MJOULES_TO_JOULES  = 1000.0;
    private static final double MJOULES_TO_KJOULES = 1000.0;
    private static final double MJOULES_TO_MJOULES = 1000.0;
    private static final double MJOULES_TO_WHATT   = 1000.0;
    private static final double MJOULES_TO_KWHATT  = 1000.0;
    private static final double WHATT_TO_CAL       = 1.0;
    private static final double WHATT_TO_KCAL      = 1000.0;
    private static final double WHATT_TO_JOULES    = 1000.0;
    private static final double WHATT_TO_KJOULES   = 1000.0;
    private static final double WHATT_TO_MJOULES   = 1000.0;
    private static final double WHATT_TO_WHATT     = 1000.0;
    private static final double WHATT_TO_KWHATT    = 1000.0;
    private static final double KWHATT_TO_CAL      = 1.0;
    private static final double KWHATT_TO_KCAL     = 1000.0;
    private static final double KWHATT_TO_JOULES   = 1000.0;
    private static final double KWHATT_TO_KJOULES  = 1000.0;
    private static final double KWHATT_TO_MJOULES  = 1000.0;
    private static final double KWHATT_TO_WHATT    = 1000.0;
    private static final double KWHATT_TO_KWHATT   = 1000.0;

    /**************** Force conversion factors ****************/
    private static final double NEWTON_TO_NEWTON   = 1000.0;
    private static final double NEWTON_TO_KNEWTON  = 1000.0;
    private static final double NEWTON_TO_MNEWTON  = 1000.0;
    private static final double KNEWTON_TO_NEWTON  = 1000.0;
    private static final double KNEWTON_TO_KNEWTON = 1000.0;
    private static final double KNEWTON_TO_MNEWTON = 1000.0;
    private static final double MNEWTON_TO_NEWTON  = 1000.0;
    private static final double MNEWTON_TO_KNEWTON = 1000.0;
    private static final double MNEWTON_TO_MNEWTON = 1000.0;


    /*******************************************************************************************************************
     *
     * @param number
     * @param from
     * @param to
     * @return
     *******************************************************************************************************************/
    public static double areaConverter(double number, String from, String to)
    {
        double result = -1.0;
        if (from.equals(Object.KM_SQ))
        {
            switch (to)
            {
                case (Object.KM_SQ)   :result = (number * KMSQ_TO_KMSQ);   break;
                case (Object.M_SQ)    :result = (number * KMSQ_TO_MSQ);    break;
                case (Object.MILE_SQ) :result = (number * KMSQ_TO_MILESQ); break;
                case (Object.YARD_SQ) :result = (number * KMSQ_TO_YARDSQ); break;
                case (Object.FEET_SQ) :result = (number * KMSQ_TO_FEETSQ); break;
                case (Object.INCH_SQ) :result = (number * KMSQ_TO_INCHSQ); break;
                case (Object.ACRE)    :result = (number * KMSQ_TO_ACRE);   break;
            }
        }

        if (from.equals(Object.M_SQ))
        {
            switch (to)
            {
                case (Object.KM_SQ)   :result = (number * MSQ_TO_KMSQ);   break;
                case (Object.M_SQ)    :result = (number * MSQ_TO_MSQ);    break;
                case (Object.MILE_SQ) :result = (number * MSQ_TO_MILESQ); break;
                case (Object.YARD_SQ) :result = (number * MSQ_TO_YARDSQ); break;
                case (Object.FEET_SQ) :result = (number * MSQ_TO_FEETSQ); break;
                case (Object.INCH_SQ) :result = (number * MSQ_TO_INCHSQ); break;
                case (Object.ACRE)    :result = (number * MSQ_TO_ACRE);   break;
            }
        }

        if (from.equals(Object.MILE_SQ))
        {
            switch (to)
            {
                case (Object.KM_SQ)   :result = (number * MILESQ_TO_KMSQ);   break;
                case (Object.M_SQ)    :result = (number * MILESQ_TO_MSQ);    break;
                case (Object.MILE_SQ) :result = (number * MILESQ_TO_MILESQ); break;
                case (Object.YARD_SQ) :result = (number * MILESQ_TO_YARDSQ); break;
                case (Object.FEET_SQ) :result = (number * MILESQ_TO_FEETSQ); break;
                case (Object.INCH_SQ) :result = (number * MILESQ_TO_INCHSQ); break;
                case (Object.ACRE)    :result = (number * MILESQ_TO_ACRE);   break;
            }
        }

        if (from.equals(Object.YARD_SQ))
        {
            switch (to)
            {
                case (Object.KM_SQ)   :result = (number * YARDSQ_TO_KMSQ);   break;
                case (Object.M_SQ)    :result = (number * YARDSQ_TO_MSQ);    break;
                case (Object.MILE_SQ) :result = (number * YARDSQ_TO_MILESQ); break;
                case (Object.YARD_SQ) :result = (number * YARDSQ_TO_YARDSQ); break;
                case (Object.FEET_SQ) :result = (number * YARDSQ_TO_FEETSQ); break;
                case (Object.INCH_SQ) :result = (number * YARDSQ_TO_INCHSQ); break;
                case (Object.ACRE)    :result = (number * YARDSQ_TO_ACRE);   break;
            }
        }

        if (from.equals(Object.FEET_SQ))
        {
            switch (to)
            {
                case (Object.KM_SQ)   :result = (number * FEETSQ_TO_KMSQ);   break;
                case (Object.M_SQ)    :result = (number * FEETSQ_TO_MSQ);    break;
                case (Object.MILE_SQ) :result = (number * FEETSQ_TO_MILESQ); break;
                case (Object.YARD_SQ) :result = (number * FEETSQ_TO_YARDSQ); break;
                case (Object.FEET_SQ) :result = (number * FEETSQ_TO_FEETSQ); break;
                case (Object.INCH_SQ) :result = (number * FEETSQ_TO_INCHSQ); break;
                case (Object.ACRE)    :result = (number * FEETSQ_TO_ACRE);   break;
            }
        }

        if (from.equals(Object.INCH_SQ))
        {
            switch (to)
            {
                case (Object.KM_SQ)   :result = (number * INCHSQ_TO_KMSQ);   break;
                case (Object.M_SQ)    :result = (number * INCHSQ_TO_MSQ);    break;
                case (Object.MILE_SQ) :result = (number * INCHSQ_TO_MILESQ); break;
                case (Object.YARD_SQ) :result = (number * INCHSQ_TO_YARDSQ); break;
                case (Object.FEET_SQ) :result = (number * INCHSQ_TO_FEETSQ); break;
                case (Object.INCH_SQ) :result = (number * INCHSQ_TO_INCHSQ); break;
                case (Object.ACRE)    :result = (number * INCHSQ_TO_ACRE);   break;
            }
        }

        if (from.equals(Object.ACRE))
        {
            switch (to)
            {
                case (Object.KM_SQ)   :result = (number * ACRE_TO_KMSQ);   break;
                case (Object.M_SQ)    :result = (number * ACRE_TO_MSQ);    break;
                case (Object.MILE_SQ) :result = (number * ACRE_TO_MILESQ); break;
                case (Object.YARD_SQ) :result = (number * ACRE_TO_YARDSQ); break;
                case (Object.FEET_SQ) :result = (number * ACRE_TO_FEETSQ); break;
                case (Object.INCH_SQ) :result = (number * ACRE_TO_INCHSQ); break;
                case (Object.ACRE)    :result = (number * ACRE_TO_ACRE);   break;
            }
        }

        return result;
    }

    /*******************************************************************************************************************
     *
     * @param number
     * @param from
     * @param to
     * @return
     *******************************************************************************************************************/
    public static double energyConverter(double number, String from, String to)
    {
        double result = -1;
        if (from.equals(Object.CAL))
        {
            switch (to)
            {
                case (Object.CAL)     :result = (number * CAL_TO_CAL);     break;
                case (Object.KCAL)    :result = (number * CAL_TO_KCAL);    break;
                case (Object.JOULES)  :result = (number * CAL_TO_JOULES);  break;
                case (Object.KJOULES) :result = (number * CAL_TO_KJOULES); break;
                case (Object.MJOULES) :result = (number * CAL_TO_MJOULES); break;
                case (Object.WHATT)   :result = (number * CAL_TO_WHATT);   break;
                case (Object.KWHATT)  :result = (number * CAL_TO_KWHATT);  break;
            }
        }

        if (from.equals(Object.KCAL))
        {
            switch (to)
            {
                case (Object.CAL)     :result = (number * KCAL_TO_CAL);     break;
                case (Object.KCAL)    :result = (number * KCAL_TO_KCAL);    break;
                case (Object.JOULES)  :result = (number * KCAL_TO_JOULES);  break;
                case (Object.KJOULES) :result = (number * KCAL_TO_KJOULES); break;
                case (Object.MJOULES) :result = (number * KCAL_TO_MJOULES); break;
                case (Object.WHATT)   :result = (number * KCAL_TO_WHATT);   break;
                case (Object.KWHATT)  :result = (number * KCAL_TO_KWHATT);  break;
            }
        }

        if (from.equals(Object.JOULES))
        {
            switch (to)
            {
                case (Object.CAL)     :result = (number * JOULES_TO_CAL);     break;
                case (Object.KCAL)    :result = (number * JOULES_TO_KCAL);    break;
                case (Object.JOULES)  :result = (number * JOULES_TO_JOULES);  break;
                case (Object.KJOULES) :result = (number * JOULES_TO_KJOULES); break;
                case (Object.MJOULES) :result = (number * JOULES_TO_MJOULES); break;
                case (Object.WHATT)   :result = (number * JOULES_TO_WHATT);   break;
                case (Object.KWHATT)  :result = (number * JOULES_TO_KWHATT);  break;
            }
        }

        if (from.equals(Object.KJOULES))
        {
            switch (to)
            {
                case (Object.CAL)     :result = (number * KJOULES_TO_CAL);     break;
                case (Object.KCAL)    :result = (number * KJOULES_TO_KCAL);    break;
                case (Object.JOULES)  :result = (number * KJOULES_TO_JOULES);  break;
                case (Object.KJOULES) :result = (number * KJOULES_TO_KJOULES); break;
                case (Object.MJOULES) :result = (number * KJOULES_TO_MJOULES); break;
                case (Object.WHATT)   :result = (number * KJOULES_TO_WHATT);   break;
                case (Object.KWHATT)  :result = (number * KJOULES_TO_KWHATT);  break;
            }
        }

        if (from.equals(Object.MJOULES))
        {
            switch (to)
            {
                case (Object.CAL)     :result = (number * MJOULES_TO_CAL);     break;
                case (Object.KCAL)    :result = (number * MJOULES_TO_KCAL);    break;
                case (Object.JOULES)  :result = (number * MJOULES_TO_JOULES);  break;
                case (Object.KJOULES) :result = (number * MJOULES_TO_KJOULES); break;
                case (Object.MJOULES) :result = (number * MJOULES_TO_MJOULES); break;
                case (Object.WHATT)   :result = (number * MJOULES_TO_WHATT);   break;
                case (Object.KWHATT)  :result = (number * MJOULES_TO_KWHATT);  break;
            }
        }

        if (from.equals(Object.WHATT))
        {
            switch (to)
            {
                case (Object.CAL)     :result = (number * WHATT_TO_CAL);     break;
                case (Object.KCAL)    :result = (number * WHATT_TO_KCAL);    break;
                case (Object.JOULES)  :result = (number * WHATT_TO_JOULES);  break;
                case (Object.KJOULES) :result = (number * WHATT_TO_KJOULES); break;
                case (Object.MJOULES) :result = (number * WHATT_TO_MJOULES); break;
                case (Object.WHATT)   :result = (number * WHATT_TO_WHATT);   break;
                case (Object.KWHATT)  :result = (number * WHATT_TO_KWHATT);  break;
            }
        }

        if (from.equals(Object.KWHATT))
        {
            switch (to)
            {
                case (Object.CAL)     :result = (number * KWHATT_TO_CAL);     break;
                case (Object.KCAL)    :result = (number * KWHATT_TO_KCAL);    break;
                case (Object.JOULES)  :result = (number * KWHATT_TO_JOULES);  break;
                case (Object.KJOULES) :result = (number * KWHATT_TO_KJOULES); break;
                case (Object.MJOULES) :result = (number * KWHATT_TO_MJOULES); break;
                case (Object.WHATT)   :result = (number * KWHATT_TO_WHATT);   break;
                case (Object.KWHATT)  :result = (number * KWHATT_TO_KWHATT);  break;
            }
        }

        return result;
    }

    /*******************************************************************************************************************
     *
     * @param number
     * @param from
     * @param to
     * @return
     *******************************************************************************************************************/
    public static double forceConverter(double number, String from, String to)
    {
        double result = -1;
        if (from.equals(Object.NEWTON))
        {
            switch (to)
            {
                case (Object.NEWTON)  :result = (number * NEWTON_TO_NEWTON);  break;
                case (Object.KNEWTON) :result = (number * NEWTON_TO_KNEWTON); break;
                case (Object.MNEWTON) :result = (number * NEWTON_TO_MNEWTON); break;
            }
        }

        if (from.equals(Object.KNEWTON))
        {
            switch (to)
            {
                case (Object.NEWTON)  :result = (number * KNEWTON_TO_NEWTON);  break;
                case (Object.KNEWTON) :result = (number * KNEWTON_TO_KNEWTON); break;
                case (Object.MNEWTON) :result = (number * KNEWTON_TO_MNEWTON); break;
            }
        }

        if (from.equals(Object.MNEWTON))
        {
            switch (to)
            {
                case (Object.NEWTON)  :result = (number * MNEWTON_TO_NEWTON);  break;
                case (Object.KNEWTON) :result = (number * MNEWTON_TO_KNEWTON); break;
                case (Object.MNEWTON) :result = (number * MNEWTON_TO_MNEWTON); break;
            }
        }

        return result;
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
