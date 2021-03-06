package application.formatter;

/************************************************************************************************************************
 * Defines all the objects, buttons as constants for the application so they dont have to be redifed in each class.
 ************************************************************************************************************************/
public class Object
{
    public static final String EMPTY   = "";
    public static final String CLEAR   = "";
    public static final String DECIMAL = ".";

    /**************** STANDARD BUTTONS ****************/
    public static final String ADD               = "+";
    public static final String SUBTRACT          = "-";
    public static final String DIVIDE            = "/";
    public static final String MULTIPLY          = "*";
    public static final String REMAINDER         = "%";
    public static final String NEGATIVE          = "-";
    public static final String ADD_OR_SUBTRACT   = ADD + SUBTRACT;
    public static final String ALL_OPERATORS     = ADD + SUBTRACT + MULTIPLY + DIVIDE + REMAINDER;

    public static final String LEFT_PARENTHESIS  = "(";
    public static final String RIGHT_PARENTHESIS = ")";
    public static final String WHITESPACE        = "\\s+";

    public static final String PLUS_MINUS = "+/-";

    public static final String DIGITS = "1234567890";

    /**************** SCIENTIFIC BUTTONS ****************/
    public static final String DELETE = "DEL";

    public static final String RADIANS = "RAD";
    public static final String DEGREES = "DEG";

    public static final String SIN = "sin";
    public static final String COS = "cos";
    public static final String TAN = "tan";

    public static final String INV_SIN = "sin-¹";
    public static final String INV_COS = "cos-¹";
    public static final String INV_TAN = "tan-¹";

    public static final String SINH = "sinh";
    public static final String COSH = "cosh";
    public static final String TANH = "tanh";

    public static final String INV_SINH = "sinh-¹";
    public static final String INV_COSH = "cosh-¹";
    public static final String INV_TANH = "tanh-¹";

    public static final String LOG = "log";
    public static final String LOG_TWO = "log2";
    public static final String LN = "ln";

    public static final String SQUARED = "x²";
    public static final String SQUARE = "2";
    public static final String CUBED = "x³";
    public static final String CUBE = "3";
    public static final String POWER_N = "xⁿ";
    public static final String EXPONENT = "eⁿ";
    public static final String E = "e";
    public static final String TO_POWER_TEN = "10ⁿ";
    public static final String TEN = "10";
    public static final String SQUARE_ROOT = "√";
    public static final String CUBE_ROOT = "³√";

    public static final String POWER = "^";

    /**************** UNIT CONVERTER DEFINATIONS ****************/
    // AREA
    public static final String KM_SQ   = "Km²";
    public static final String M_SQ    = "m²";
    public static final String MILE_SQ = "mile²";
    public static final String YARD_SQ = "yard²";
    public static final String FEET_SQ = "feet²";
    public static final String INCH_SQ = "in²";
    public static final String ACRE    = "acre";

    // ENERGY
    public static final String CAL     = "cal";
    public static final String KCAL    = "Kcal";
    public static final String JOULES  = "J";
    public static final String KJOULES = "KJ";
    public static final String MJOULES = "MJ";
    public static final String WHATT   = "Wh";
    public static final String KWHATT  = "KWh";

    // FORCE
    public static final String NEWTON  = "N";
    public static final String KNEWTON = "KN";
    public static final String MNEWTON = "MN";

    // LENGTH
    public static final String KM      = "Km";
    public static final String METER   = "m";
    public static final String CM      = "cm";
    public static final String MM      = "mm";
    public static final String MILE    = "mile";
    public static final String YARD    = "yard";
    public static final String FEET    = "feet";
    public static final String INCH    = "in";

    // SPEED
    public static final String MPH     = "miles/hr";
    public static final String KPH     = "Km/hr";
    public static final String MPS     = "m/s";

    // TEMPERATURE
    public static final String CEL     = "celcius";
    public static final String FEH     = "Fahrenheit";
    public static final String KAL     = "Kalvin";

    // WEIGHT
    public static final String KGRAM   = "Kg";
    public static final String GRAM    = "g";
    public static final String MGRAM   = "mg";
    public static final String POUND   = "pound";
}
