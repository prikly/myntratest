package com.apm.insight.runtime;

import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.q;
import java.util.Comparator;

public class g {

    /* renamed from: a  reason: collision with root package name */
    private static final Comparator<a> f10856a = new Comparator<a>() {
        /* renamed from: a */
        public final int compare(a aVar, a aVar2) {
            int i = aVar.f10859b + aVar.f10860c;
            int i2 = aVar2.f10859b + aVar2.f10860c;
            if (i != i2) {
                return i > i2 ? -1 : 1;
            }
            return 0;
        }
    };

    /* renamed from: b  reason: collision with root package name */
    private static byte[] f10857b = new byte[4096];

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f10858a = DtbDeviceDataRetriever.ORIENTATION_UNKNOWN;

        /* renamed from: b  reason: collision with root package name */
        public int f10859b;

        /* renamed from: c  reason: collision with root package name */
        public int f10860c;

        a() {
        }
    }

    public static long a(int i) {
        return NativeImpl.c(i) * q.a.a();
    }
}
