package com.apm.insight.runtime;

import com.apm.insight.h;
import com.apm.insight.l.i;
import com.apm.insight.l.o;
import com.appodeal.ads.modules.common.internal.Constants;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private static long f10837a = -30000;

    /* renamed from: b  reason: collision with root package name */
    private static File f10838b;

    public static String a(long j, String str) {
        try {
            String j2 = o.j(h.g());
            return i.c(new File(j2, "apminsight/TrackInfo/" + ((j - (j % Constants.MILLIS_IN_DAY)) / Constants.MILLIS_IN_DAY) + "/" + str));
        } catch (Throwable th) {
            return th.getMessage();
        }
    }

    public static void a() {
        File file = new File(o.j(h.g()), "apminsight/TrackInfo/");
        String[] list = file.list();
        if (list != null && list.length > 5) {
            Arrays.sort(list);
            for (int i = 0; i < list.length - 5; i++) {
                i.a(new File(file, list[i]));
            }
        }
    }

    public static void a(long j) {
        if (j - f10837a >= 30000) {
            f10837a = j;
            try {
                i.a(b(), String.valueOf(System.currentTimeMillis()), false);
            } catch (IOException unused) {
            }
        }
    }

    private static File b() {
        if (f10838b == null) {
            long currentTimeMillis = System.currentTimeMillis();
            String j = o.j(h.g());
            f10838b = new File(j, "apminsight/TrackInfo/" + ((currentTimeMillis - (currentTimeMillis % Constants.MILLIS_IN_DAY)) / Constants.MILLIS_IN_DAY) + "/" + h.f());
        }
        return f10838b;
    }
}
