package com.amazon.aps.shared.util;

public class APSSharedUtil {
    public static final String EMPTY_STRING = "";
    public static final String TRUNCATE_SEPARATOR = "...";

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.equals("");
    }

    public static boolean isNull(Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return true;
        }
        for (Object obj : objArr) {
            if (obj == null) {
                return true;
            }
        }
        return false;
    }

    public static void checkNullAndThrowException(Object... objArr) throws IllegalArgumentException {
        if (isNull(objArr)) {
            throw new IllegalArgumentException("Invalid parameters passed");
        }
    }
}
