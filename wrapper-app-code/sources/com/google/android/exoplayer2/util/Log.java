package com.google.android.exoplayer2.util;

import android.text.TextUtils;
import java.net.UnknownHostException;

public final class Log {
    private static int logLevel = 0;
    private static boolean logStackTraces = true;

    public static void w(String str, String str2) {
        if (logLevel <= 2) {
            android.util.Log.w(str, str2);
        }
    }

    public static void e(String str, String str2) {
        if (logLevel <= 3) {
            android.util.Log.e(str, str2);
        }
    }

    public static void e(String str, String str2, Throwable th) {
        e(str, appendThrowableString(str2, th));
    }

    public static String getThrowableString(Throwable th) {
        if (th == null) {
            return null;
        }
        if (isCausedByUnknownHostException(th)) {
            return "UnknownHostException (no network)";
        }
        if (!logStackTraces) {
            return th.getMessage();
        }
        return android.util.Log.getStackTraceString(th).trim().replace("\t", "    ");
    }

    private static String appendThrowableString(String str, Throwable th) {
        String throwableString = getThrowableString(th);
        if (TextUtils.isEmpty(throwableString)) {
            return str;
        }
        String valueOf = String.valueOf(str);
        String replace = throwableString.replace("\n", "\n  ");
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 4 + String.valueOf(replace).length());
        sb.append(valueOf);
        sb.append("\n  ");
        sb.append(replace);
        sb.append(10);
        return sb.toString();
    }

    private static boolean isCausedByUnknownHostException(Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }
}
