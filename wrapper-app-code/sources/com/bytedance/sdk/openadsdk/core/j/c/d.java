package com.bytedance.sdk.openadsdk.core.j.c;

import java.util.Arrays;
import java.util.List;

/* compiled from: VastUtils */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public static final List<String> f1340a = Arrays.asList(new String[]{"video/mp4", "video/3gpp"});

    public static double a(int i, double d2, int i2, int i3, int i4, String str) {
        double a2 = a(i, d2, i2, i3);
        return a(str) * (1.0d / ((a2 + 1.0d) + a(i4)));
    }

    private static double a(int i, double d2, int i2, int i3) {
        double d3 = 0.0d;
        double abs = d2 != Double.MIN_VALUE ? Math.abs(d2 - (i3 != 0 ? ((double) i2) / ((double) i3) : 0.0d)) : 0.0d;
        if (!(i == Integer.MIN_VALUE || i == 0)) {
            d3 = (double) Math.abs((i - i2) / i);
        }
        return abs + d3;
    }

    private static double a(int i) {
        int max = Math.max(i, 0);
        if (700 > max || max > 1500) {
            return Math.min((double) (((float) Math.abs(700 - max)) / 700.0f), (double) (((float) Math.abs(1500 - max)) / 1500.0f));
        }
        return 0.0d;
    }

    private static double a(String str) {
        if (str == null) {
            str = "";
        }
        char c2 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1664118616) {
            if (hashCode == 1331848029 && str.equals("video/mp4")) {
                c2 = 0;
            }
        } else if (str.equals("video/3gpp")) {
            c2 = 1;
        }
        return c2 != 0 ? 1.0d : 1.5d;
    }
}
