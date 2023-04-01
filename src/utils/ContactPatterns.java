package utils;

import java.util.regex.Pattern;

public final class ContactPatterns {
    public static final Pattern DATE;
    public static final Pattern GENDER;
    public static final Pattern NUMBER_PHONE;

    public ContactPatterns() {
        throw new AssertionError();
    }

    static {
        DATE = Pattern.compile("(^| +?)\\d{2}\\.\\d{2}\\.\\d{4}( +?|$)");
        GENDER = Pattern.compile("(^| +?)f( +?|$)|(^| +?)m( +?|$)");
        NUMBER_PHONE = Pattern.compile("(^| +?)\\d{6,}( +?|$)");
    }
}