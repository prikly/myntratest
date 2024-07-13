package com.yandex.metrica.billing_interface;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class c {

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f3553c = Pattern.compile("P(\\d+)(\\S+)");

    /* renamed from: a  reason: collision with root package name */
    public final int f3554a;

    /* renamed from: b  reason: collision with root package name */
    public final a f3555b;

    public enum a {
        TIME_UNIT_UNKNOWN,
        DAY,
        WEEK,
        MONTH,
        YEAR
    }

    public c(int i, a aVar) {
        this.f3554a = i;
        this.f3555b = aVar;
    }

    public static c a(String str) {
        a aVar;
        Matcher matcher = f3553c.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        String group = matcher.group(1);
        String group2 = matcher.group(2);
        if (group == null || group2 == null) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(group);
            char charAt = group2.charAt(0);
            if (charAt == 'D') {
                aVar = a.DAY;
            } else if (charAt == 'M') {
                aVar = a.MONTH;
            } else if (charAt == 'W') {
                aVar = a.WEEK;
            } else if (charAt != 'Y') {
                aVar = a.TIME_UNIT_UNKNOWN;
            } else {
                aVar = a.YEAR;
            }
            return new c(parseInt, aVar);
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f3554a == cVar.f3554a && this.f3555b == cVar.f3555b;
    }

    public int hashCode() {
        return ((this.f3554a + 0) * 31) + this.f3555b.hashCode();
    }

    public String toString() {
        return "Period{number=" + this.f3554a + "timeUnit=" + this.f3555b + "}";
    }
}
