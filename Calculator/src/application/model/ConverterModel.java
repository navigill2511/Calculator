package application.model;

import application.formatter.Object;

/***********************************************************************************************************************
 * TODO: Area conversion factors are not assigned correct values yet.
 *
 * Created by Navi on 4/8/2016.
 *
 * Class ConverterModl models the unit conversion functionality of the application. The constants represent the factors
 * that are needed to for conversions. ConverterModel has the followinf methods:
 *  areaConverter()         |   handles convertions related to area.
 *  energyConverter()       |   handles convertions related to energy.
 *  forceConverter()        |   handles convertions related to force.
 *  lengthConverter()       |   handles convertions related to length.
 *  speedConverter()        |   handles convertions related to speed.
 *  temperatureConverter()  |   handles convertions related to temperature.
 *  weightConverter()       |   handles convertions related to weight.
 ***********************************************************************************************************************/
public class ConverterModel
{
    /**************** AREA CONVERSION FACTORS ****************/
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

    /**************** ENERGY CONVERSION FACTORS ****************/
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

    /**************** FORCE CONVERSION FACTORS ****************/
    private static final double NEWTON_TO_NEWTON   = 1000.0;
    private static final double NEWTON_TO_KNEWTON  = 1000.0;
    private static final double NEWTON_TO_MNEWTON  = 1000.0;
    private static final double KNEWTON_TO_NEWTON  = 1000.0;
    private static final double KNEWTON_TO_KNEWTON = 1000.0;
    private static final double KNEWTON_TO_MNEWTON = 1000.0;
    private static final double MNEWTON_TO_NEWTON  = 1000.0;
    private static final double MNEWTON_TO_KNEWTON = 1000.0;
    private static final double MNEWTON_TO_MNEWTON = 1000.0;

    /**************** LENGTH CONVERSION FACTORS ****************/
    private static final double KM_TO_KM       = 1000.0;
    private static final double KM_TO_METER    = 1000.0;
    private static final double KM_TO_CM       = 1000.0;
    private static final double KM_TO_MM       = 1000.0;
    private static final double KM_TO_MILE     = 1000.0;
    private static final double KM_TO_YARD     = 1000.0;
    private static final double KM_TO_FEET     = 1000.0;
    private static final double KM_TO_INCH     = 1000.0;
    private static final double METER_TO_KM    = 1000.0;
    private static final double METER_TO_METER = 1000.0;
    private static final double METER_TO_CM    = 1000.0;
    private static final double METER_TO_MM    = 1000.0;
    private static final double METER_TO_MILE  = 1000.0;
    private static final double METER_TO_YARD  = 1000.0;
    private static final double METER_TO_FEET  = 1000.0;
    private static final double METER_TO_INCH  = 1000.0;
    private static final double CM_TO_KM       = 1000.0;
    private static final double CM_TO_METER    = 1000.0;
    private static final double CM_TO_CM       = 1000.0;
    private static final double CM_TO_MM       = 1000.0;
    private static final double CM_TO_MILE     = 1000.0;
    private static final double CM_TO_YARD     = 1000.0;
    private static final double CM_TO_FEET     = 1000.0;
    private static final double CM_TO_INCH     = 1000.0;
    private static final double MM_TO_KM       = 1000.0;
    private static final double MM_TO_METER    = 1000.0;
    private static final double MM_TO_CM       = 1000.0;
    private static final double MM_TO_MM       = 1000.0;
    private static final double MM_TO_MILE     = 1000.0;
    private static final double MM_TO_YARD     = 1000.0;
    private static final double MM_TO_FEET     = 1000.0;
    private static final double MM_TO_INCH     = 1000.0;
    private static final double MILE_TO_KM     = 1000.0;
    private static final double MILE_TO_METER  = 1000.0;
    private static final double MILE_TO_CM     = 1000.0;
    private static final double MILE_TO_MM     = 1000.0;
    private static final double MILE_TO_MILE   = 1000.0;
    private static final double MILE_TO_YARD   = 1000.0;
    private static final double MILE_TO_FEET   = 1000.0;
    private static final double MILE_TO_INCH   = 1000.0;
    private static final double YARD_TO_KM     = 1000.0;
    private static final double YARD_TO_METER  = 1000.0;
    private static final double YARD_TO_CM     = 1000.0;
    private static final double YARD_TO_MM     = 1000.0;
    private static final double YARD_TO_MILE   = 1000.0;
    private static final double YARD_TO_YARD   = 1000.0;
    private static final double YARD_TO_FEET   = 1000.0;
    private static final double YARD_TO_INCH   = 1000.0;
    private static final double FEET_TO_KM     = 1000.0;
    private static final double FEET_TO_METER  = 1000.0;
    private static final double FEET_TO_CM     = 1000.0;
    private static final double FEET_TO_MM     = 1000.0;
    private static final double FEET_TO_MILE   = 1000.0;
    private static final double FEET_TO_YARD   = 1000.0;
    private static final double FEET_TO_FEET   = 1000.0;
    private static final double FEET_TO_INCH   = 1000.0;
    private static final double INCH_TO_KM     = 1000.0;
    private static final double INCH_TO_METER  = 1000.0;
    private static final double INCH_TO_CM     = 1000.0;
    private static final double INCH_TO_MM     = 1000.0;
    private static final double INCH_TO_MILE   = 1000.0;
    private static final double INCH_TO_YARD   = 1000.0;
    private static final double INCH_TO_FEET   = 1000.0;
    private static final double INCH_TO_INCH   = 1000.0;

    /**************** SPEED CONVERSION FACTORS ****************/
    private static final double MPH_TO_MPH    = 1000.0;
    private static final double MPH_TO_KPH    = 1000.0;
    private static final double MPH_TO_MPS    = 1000.0;
    private static final double KPH_TO_MPH    = 1000.0;
    private static final double KPH_TO_KPH    = 1000.0;
    private static final double KPH_TO_MPS    = 1000.0;
    private static final double MPS_TO_MPH    = 1000.0;
    private static final double MPS_TO_KPH    = 1000.0;
    private static final double MPS_TO_MPS    = 1000.0;

    /************* TEMPERATURE CONVERSION FACTORS *************/
    private static final double CEL_TO_CEL = 1.0;
    private static final double CEL_TO_FEH = 1000.0;
    private static final double CEL_TO_KAL = 1000.0;
    private static final double FEH_TO_CEL = 1.0;
    private static final double FEH_TO_FEH = 1000.0;
    private static final double FEH_TO_KAL = 1000.0;
    private static final double KAL_TO_CEL = 1.0;
    private static final double KAL_TO_FEH = 1000.0;
    private static final double KAL_TO_KAL = 1000.0;

    /*************** WEIGHT CONVERSION FACTORS ****************/
    private static final double KGRAM_TO_KGRAM = 1000.0;
    private static final double KGRAM_TO_GRAM  = 1000.0;
    private static final double KGRAM_TO_MGRAM = 1000.0;
    private static final double KGRAM_TO_POUND = 1000.0;
    private static final double GRAM_TO_KGRAM  = 1000.0;
    private static final double GRAM_TO_GRAM   = 1000.0;
    private static final double GRAM_TO_MGRAM  = 1000.0;
    private static final double GRAM_TO_POUND  = 1000.0;
    private static final double MGRAM_TO_KGRAM = 1000.0;
    private static final double MGRAM_TO_GRAM  = 1000.0;
    private static final double MGRAM_TO_MGRAM = 1000.0;
    private static final double MGRAM_TO_POUND = 1000.0;
    private static final double POUND_TO_KGRAM = 1000.0;
    private static final double POUND_TO_GRAM  = 1000.0;
    private static final double POUND_TO_MGRAM = 1000.0;
    private static final double POUND_TO_POUND = 1000.0;


    /*******************************************************************************************************************
     * Handles conversions related to area. Can perform conversions between kilometer sq, meter sq, mile sq, yard sq,
     * feet sq, inch sq and acres.
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
     * Handles energy conversions. Can convert between calories, kilocalories, joules, kilo joules, megajoules, whatts
     * and kilo whatts.
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
     * Hansles conversions related to force. Can convert between newtons, kilonewtons and meganewtons.
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

    /*******************************************************************************************************************
     * Handles convertions related to length. Can convert between kilometers, meters, centimeters,  millimeters,
     * miles, yards, feet and inches.
     * @param number
     * @param from
     * @param to
     * @return
     *******************************************************************************************************************/
    public static double lengthConverter(double number, String from, String to)
    {
        double result = -1;
        if (from.equals(Object.KM))
        {
            switch (to)
            {
                case (Object.KM)   :result = (number * KM_TO_KM);    break;
                case (Object.METER):result = (number * KM_TO_METER); break;
                case (Object.CM)   :result = (number * KM_TO_CM);    break;
                case (Object.MM)   :result = (number * KM_TO_MM);    break;
                case (Object.MILE) :result = (number * KM_TO_MILE);  break;
                case (Object.YARD) :result = (number * KM_TO_YARD);  break;
                case (Object.FEET) :result = (number * KM_TO_FEET);  break;
                case (Object.INCH) :result = (number * KM_TO_INCH);  break;
            }
        }

        if (from.equals(Object.METER))
        {
            switch (to)
            {
                case (Object.KM)   :result = (number * METER_TO_KM);    break;
                case (Object.METER):result = (number * METER_TO_METER); break;
                case (Object.CM)   :result = (number * METER_TO_CM);    break;
                case (Object.MM)   :result = (number * METER_TO_MM);    break;
                case (Object.MILE) :result = (number * METER_TO_MILE);  break;
                case (Object.YARD) :result = (number * METER_TO_YARD);  break;
                case (Object.FEET) :result = (number * METER_TO_FEET);  break;
                case (Object.INCH) :result = (number * METER_TO_INCH);  break;
            }
        }

        if (from.equals(Object.CM))
        {
            switch (to)
            {
                case (Object.KM)   :result = (number * CM_TO_KM);    break;
                case (Object.METER):result = (number * CM_TO_METER); break;
                case (Object.CM)   :result = (number * CM_TO_CM);    break;
                case (Object.MM)   :result = (number * CM_TO_MM);    break;
                case (Object.MILE) :result = (number * CM_TO_MILE);  break;
                case (Object.YARD) :result = (number * CM_TO_YARD);  break;
                case (Object.FEET) :result = (number * CM_TO_FEET);  break;
                case (Object.INCH) :result = (number * CM_TO_INCH);  break;
            }
        }

        if (from.equals(Object.MM))
        {
            switch (to)
            {
                case (Object.KM)   :result = (number * MM_TO_KM);    break;
                case (Object.METER):result = (number * MM_TO_METER); break;
                case (Object.CM)   :result = (number * MM_TO_CM);    break;
                case (Object.MM)   :result = (number * MM_TO_MM);    break;
                case (Object.MILE) :result = (number * MM_TO_MILE);  break;
                case (Object.YARD) :result = (number * MM_TO_YARD);  break;
                case (Object.FEET) :result = (number * MM_TO_FEET);  break;
                case (Object.INCH) :result = (number * MM_TO_INCH);  break;
            }
        }

        if (from.equals(Object.MILE))
        {
            switch (to)
            {
                case (Object.KM)   :result = (number * MILE_TO_KM);    break;
                case (Object.METER):result = (number * MILE_TO_METER); break;
                case (Object.CM)   :result = (number * MILE_TO_CM);    break;
                case (Object.MM)   :result = (number * MILE_TO_MM);    break;
                case (Object.MILE) :result = (number * MILE_TO_MILE);  break;
                case (Object.YARD) :result = (number * MILE_TO_YARD);  break;
                case (Object.FEET) :result = (number * MILE_TO_FEET);  break;
                case (Object.INCH) :result = (number * MILE_TO_INCH);  break;
            }
        }

        if (from.equals(Object.YARD))
        {
            switch (to)
            {
                case (Object.KM)   :result = (number * YARD_TO_KM);    break;
                case (Object.METER):result = (number * YARD_TO_METER); break;
                case (Object.CM)   :result = (number * YARD_TO_CM);    break;
                case (Object.MM)   :result = (number * YARD_TO_MM);    break;
                case (Object.MILE) :result = (number * YARD_TO_MILE);  break;
                case (Object.YARD) :result = (number * YARD_TO_YARD);  break;
                case (Object.FEET) :result = (number * YARD_TO_FEET);  break;
                case (Object.INCH) :result = (number * YARD_TO_INCH);  break;
            }
        }

        if (from.equals(Object.FEET))
        {
            switch (to)
            {
                case (Object.KM)   :result = (number * FEET_TO_KM);    break;
                case (Object.METER):result = (number * FEET_TO_METER); break;
                case (Object.CM)   :result = (number * FEET_TO_CM);    break;
                case (Object.MM)   :result = (number * FEET_TO_MM);    break;
                case (Object.MILE) :result = (number * FEET_TO_MILE);  break;
                case (Object.YARD) :result = (number * FEET_TO_YARD);  break;
                case (Object.FEET) :result = (number * FEET_TO_FEET);  break;
                case (Object.INCH) :result = (number * FEET_TO_INCH);  break;
            }
        }

        if (from.equals(Object.INCH))
        {
            switch (to)
            {
                case (Object.KM)   :result = (number * INCH_TO_KM);    break;
                case (Object.METER):result = (number * INCH_TO_METER); break;
                case (Object.CM)   :result = (number * INCH_TO_CM);    break;
                case (Object.MM)   :result = (number * INCH_TO_MM);    break;
                case (Object.MILE) :result = (number * INCH_TO_MILE);  break;
                case (Object.YARD) :result = (number * INCH_TO_YARD);  break;
                case (Object.FEET) :result = (number * INCH_TO_FEET);  break;
                case (Object.INCH) :result = (number * INCH_TO_INCH);  break;
            }
        }
        return result;
    }

    /*******************************************************************************************************************
     * Handles convertions related to speed. Can convert between miles per hour, kilometers per hour and
     * meters per second.
     * @param number
     * @param from
     * @param to
     * @return
     *******************************************************************************************************************/
    public static double speedConverter(double number, String from, String to)
    {
        double result = -1;
        if (from.equals(Object.MPH))
        {
            switch (to)
            {
                case (Object.MPH) :result = (number * MPH_TO_MPH); break;
                case (Object.KPH) :result = (number * MPH_TO_KPH); break;
                case (Object.MPS) :result = (number * MPH_TO_MPS); break;
            }
        }

        if (from.equals(Object.KPH))
        {
            switch (to)
            {
                case (Object.MPH) :result = (number * KPH_TO_MPH); break;
                case (Object.KPH) :result = (number * KPH_TO_KPH); break;
                case (Object.MPS) :result = (number * KPH_TO_MPS); break;
            }
        }

        if (from.equals(Object.MPS))
        {
            switch (to)
            {
                case (Object.MPH) :result = (number * MPS_TO_MPH); break;
                case (Object.KPH) :result = (number * MPS_TO_KPH); break;
                case (Object.MPS) :result = (number * MPS_TO_MPS); break;
            }
        }
        return -1;
    }

    /*******************************************************************************************************************
     * Handles temperature related conversions. Can cinvert between celius, fahrenheit and kalvin.
     * @param number
     * @param from
     * @param to
     * @return
     *******************************************************************************************************************/
    public static double tempConverter(double number, String from, String to)
    {
        double result = -1;
        if (from.equals(Object.CEL))
        {
            switch (to)
            {
                case (Object.CEL) :result = (number * CEL_TO_CEL); break;
                case (Object.FEH) :result = (number * CEL_TO_FEH); break;
                case (Object.KAL) :result = (number * CEL_TO_KAL); break;
            }
        }

        if (from.equals(Object.FEH))
        {
            switch (to)
            {
                case (Object.CEL) :result = (number * FEH_TO_CEL); break;
                case (Object.FEH) :result = (number * FEH_TO_FEH); break;
                case (Object.KAL) :result = (number * FEH_TO_KAL); break;
            }
        }

        if (from.equals(Object.KAL))
        {
            switch (to)
            {
                case (Object.CEL) :result = (number * KAL_TO_CEL); break;
                case (Object.FEH) :result = (number * KAL_TO_FEH); break;
                case (Object.KAL) :result = (number * KAL_TO_KAL); break;
            }
        }
        return result;
    }

    /*******************************************************************************************************************
     * Handles convertions related to weight. Can convert between kilograms, grams, milligrams and pounds.
     * @param number
     * @param from
     * @param to
     * @return
     *******************************************************************************************************************/
    public static double weightConverter(double number, String from, String to)
    {
        double result = -1;
        if (from.equals(Object.KGRAM))
        {
            switch (to)
            {
                case (Object.KGRAM) :result = (number * KGRAM_TO_KGRAM); break;
                case (Object.GRAM)  :result = (number * KGRAM_TO_GRAM);  break;
                case (Object.MGRAM) :result = (number * KGRAM_TO_MGRAM); break;
                case (Object.POUND) :result = (number * KGRAM_TO_POUND); break;
            }
        }

        if (from.equals(Object.KGRAM))
        {
            switch (to)
            {
                case (Object.KGRAM) :result = (number * GRAM_TO_KGRAM); break;
                case (Object.GRAM)  :result = (number * GRAM_TO_GRAM);  break;
                case (Object.MGRAM) :result = (number * GRAM_TO_MGRAM); break;
                case (Object.POUND) :result = (number * GRAM_TO_POUND); break;
            }
        }

        if (from.equals(Object.KGRAM))
        {
            switch (to)
            {
                case (Object.KGRAM) :result = (number * MGRAM_TO_KGRAM); break;
                case (Object.GRAM)  :result = (number * MGRAM_TO_GRAM);  break;
                case (Object.MGRAM) :result = (number * MGRAM_TO_MGRAM); break;
                case (Object.POUND) :result = (number * MGRAM_TO_POUND); break;
            }
        }

        if (from.equals(Object.KGRAM))
        {
            switch (to)
            {
                case (Object.KGRAM) :result = (number * POUND_TO_KGRAM); break;
                case (Object.GRAM)  :result = (number * POUND_TO_GRAM);  break;
                case (Object.MGRAM) :result = (number * POUND_TO_MGRAM); break;
                case (Object.POUND) :result = (number * POUND_TO_POUND); break;
            }
        }

        return result;
    }

}
