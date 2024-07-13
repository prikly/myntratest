package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.text.TextUtils;
import java.util.Locale;

public final class H1 {

    /* renamed from: a  reason: collision with root package name */
    private static final C0565mn f4072a = new C0565mn();

    /* renamed from: b  reason: collision with root package name */
    private static final Zl<Integer, d> f4073b;

    /* renamed from: c  reason: collision with root package name */
    private static final Zl<Integer, d> f4074c;

    /* renamed from: d  reason: collision with root package name */
    private static final Zl<d, Integer> f4075d = new c(2);

    class a extends Zl<Integer, d> {
        a(d dVar) {
            super(dVar);
            a(1, d.WIFI);
            a(0, d.CELL);
            a(7, d.BLUETOOTH);
            a(9, d.ETHERNET);
            a(4, d.MOBILE_DUN);
            a(5, d.MOBILE_HIPRI);
            a(2, d.MOBILE_MMS);
            a(3, d.MOBILE_SUPL);
            a(6, d.WIMAX);
            if (A2.a(21)) {
                a(17, d.VPN);
            }
        }
    }

    class b extends Zl<Integer, d> {
        b(d dVar) {
            super(dVar);
            a(1, d.WIFI);
            a(0, d.CELL);
            a(3, d.ETHERNET);
            a(2, d.BLUETOOTH);
            a(4, d.VPN);
            if (A2.a(27)) {
                a(6, d.LOWPAN);
            }
            if (A2.a(26)) {
                a(5, d.WIFI_AWARE);
            }
        }
    }

    class c extends Zl<d, Integer> {
        c(Integer num) {
            super(num);
            a(d.CELL, 0);
            a(d.WIFI, 1);
            a(d.BLUETOOTH, 3);
            a(d.ETHERNET, 4);
            a(d.MOBILE_DUN, 5);
            a(d.MOBILE_HIPRI, 6);
            a(d.MOBILE_MMS, 7);
            a(d.MOBILE_SUPL, 8);
            a(d.VPN, 9);
            a(d.WIMAX, 10);
            a(d.LOWPAN, 11);
            a(d.WIFI_AWARE, 12);
        }
    }

    public enum d {
        WIFI,
        CELL,
        ETHERNET,
        BLUETOOTH,
        VPN,
        LOWPAN,
        WIFI_AWARE,
        MOBILE_DUN,
        MOBILE_HIPRI,
        MOBILE_MMS,
        MOBILE_SUPL,
        WIMAX,
        OFFLINE,
        UNDEFINED
    }

    static {
        d dVar = d.UNDEFINED;
        f4073b = new a(dVar);
        f4074c = new b(dVar);
    }

    public static com.yandex.metrica.b a(Context context, Point point) {
        float f2;
        try {
            f2 = context.getResources().getDisplayMetrics().density;
        } catch (Throwable unused) {
            f2 = 0.0f;
        }
        if (f2 == 0.0f) {
            return com.yandex.metrica.b.PHONE;
        }
        float f3 = (float) point.x;
        float f4 = (float) point.y;
        float min = Math.min(f3 / f2, f4 / f2);
        float f5 = f2 * 160.0f;
        float f6 = f3 / f5;
        float f7 = f4 / f5;
        double sqrt = Math.sqrt((double) ((f6 * f6) + (f7 * f7)));
        if (sqrt >= 15.0d && !f4072a.a(context, "android.hardware.touchscreen")) {
            return com.yandex.metrica.b.TV;
        }
        if (sqrt >= 7.0d || min >= 600.0f) {
            return com.yandex.metrica.b.TABLET;
        }
        return com.yandex.metrica.b.PHONE;
    }

    static d b(ConnectivityManager connectivityManager) {
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return d.OFFLINE;
        }
        return f4073b.a(Integer.valueOf(activeNetworkInfo.getType()));
    }

    public static int b(Context context) {
        return f4075d.a(a(context)).intValue();
    }

    public static String a(Locale locale) {
        String language = locale.getLanguage();
        String country = locale.getCountry();
        StringBuilder sb = new StringBuilder(language);
        if (A2.a(21)) {
            String script = locale.getScript();
            if (!TextUtils.isEmpty(script)) {
                sb.append('-');
                sb.append(script);
            }
        }
        if (!TextUtils.isEmpty(country)) {
            sb.append('_');
            sb.append(country);
        }
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.yandex.metrica.impl.ob.H1.d a(android.content.Context r2) {
        /*
            java.lang.String r0 = "connectivity"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2
            com.yandex.metrica.impl.ob.H1$d r0 = com.yandex.metrica.impl.ob.H1.d.UNDEFINED
            if (r2 == 0) goto L_0x001e
            r1 = 23
            boolean r1 = com.yandex.metrica.impl.ob.A2.a((int) r1)     // Catch:{ all -> 0x001e }
            if (r1 == 0) goto L_0x0019
            com.yandex.metrica.impl.ob.H1$d r2 = a((android.net.ConnectivityManager) r2)     // Catch:{ all -> 0x001e }
            goto L_0x001f
        L_0x0019:
            com.yandex.metrica.impl.ob.H1$d r2 = b((android.net.ConnectivityManager) r2)     // Catch:{ all -> 0x001e }
            goto L_0x001f
        L_0x001e:
            r2 = 0
        L_0x001f:
            if (r2 != 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r0 = r2
        L_0x0023:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.H1.a(android.content.Context):com.yandex.metrica.impl.ob.H1$d");
    }

    static d a(ConnectivityManager connectivityManager) {
        d dVar = d.UNDEFINED;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (a(connectivityManager, activeNetwork)) {
            return d.OFFLINE;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null) {
            return dVar;
        }
        for (Integer next : f4074c.a()) {
            if (networkCapabilities.hasTransport(next.intValue())) {
                return f4074c.a(next);
            }
        }
        return dVar;
    }

    private static boolean a(ConnectivityManager connectivityManager, Network network) {
        if (A2.a(29)) {
            return network == null;
        }
        if (network == null) {
            return true;
        }
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(network);
        if (networkInfo == null || networkInfo.isConnected()) {
            return false;
        }
        return true;
    }
}
