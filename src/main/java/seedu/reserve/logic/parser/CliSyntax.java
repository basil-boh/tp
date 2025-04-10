package seedu.reserve.logic.parser;

/**
 * Contains Command Line Interface (CLI) syntax definitions common to multiple commands
 */
public class CliSyntax {

    /* Prefix definitions */
    public static final Prefix PREFIX_NAME = new Prefix("n/");
    public static final Prefix PREFIX_PHONE = new Prefix("p/");
    public static final Prefix PREFIX_EMAIL = new Prefix("e/");
    public static final Prefix PREFIX_OCCASION = new Prefix("o/");
    public static final Prefix PREFIX_DATE_TIME = new Prefix("d/");
    public static final Prefix PREFIX_NUMBER_OF_DINERS = new Prefix("x/");
    public static final Prefix PREFIX_START_DATE = new Prefix("sd/");
    public static final Prefix PREFIX_END_DATE = new Prefix("ed/");
}
