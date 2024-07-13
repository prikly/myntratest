package com.applovin.exoplayer2.i.i;

import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.y;
import java.util.regex.Pattern;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f13196a = Pattern.compile("^NOTE([ \t].*)?$");

    public static long a(String str) throws NumberFormatException {
        String[] b2 = ai.b(str, "\\.");
        long j = 0;
        for (String parseLong : ai.a(b2[0], ":")) {
            j = (j * 60) + Long.parseLong(parseLong);
        }
        long j2 = j * 1000;
        if (b2.length == 2) {
            j2 += Long.parseLong(b2[1]);
        }
        return j2 * 1000;
    }

    public static void a(y yVar) throws com.applovin.exoplayer2.ai {
        int c2 = yVar.c();
        if (!b(yVar)) {
            yVar.d(c2);
            throw com.applovin.exoplayer2.ai.b("Expected WEBVTT. Got " + yVar.C(), (Throwable) null);
        }
    }

    public static float b(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static boolean b(y yVar) {
        String C = yVar.C();
        return C != null && C.startsWith("WEBVTT");
    }
}
