package com.criteo.publisher.context;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.core.content.ContextCompat;
import com.criteo.publisher.logging.g;
import com.criteo.publisher.logging.h;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConnectionTypeFetcher.kt */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final g f2369a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f2370b;

    public a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f2370b = context;
        g b2 = h.b(a.class);
        Intrinsics.checkExpressionValueIsNotNull(b2, "LoggerFactory.getLogger(…nTypeFetcher::class.java)");
        this.f2369a = b2;
    }

    public C0020a b() {
        Object systemService = this.f2370b.getSystemService("connectivity");
        if (!(systemService instanceof ConnectivityManager)) {
            systemService = null;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        if (connectivityManager == null) {
            return null;
        }
        try {
            return a(connectivityManager);
        } catch (LinkageError e2) {
            this.f2369a.a("Deprecated way to get connection type is not available, fallback on new API", (Throwable) e2);
            return b(connectivityManager);
        }
    }

    private C0020a b(ConnectivityManager connectivityManager) {
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        TelephonyManager telephonyManager = null;
        if (networkCapabilities == null) {
            return null;
        }
        if (c(networkCapabilities)) {
            return C0020a.WIRED;
        }
        if (b(networkCapabilities)) {
            return C0020a.WIFI;
        }
        if (!a(networkCapabilities)) {
            return null;
        }
        Object systemService = this.f2370b.getSystemService("phone");
        if (systemService instanceof TelephonyManager) {
            telephonyManager = systemService;
        }
        return a(telephonyManager);
    }

    public boolean c(NetworkCapabilities networkCapabilities) {
        Intrinsics.checkParameterIsNotNull(networkCapabilities, "networkCapabilities");
        return networkCapabilities.hasTransport(3);
    }

    public boolean b(NetworkCapabilities networkCapabilities) {
        Intrinsics.checkParameterIsNotNull(networkCapabilities, "networkCapabilities");
        return networkCapabilities.hasTransport(1);
    }

    public boolean a(NetworkCapabilities networkCapabilities) {
        Intrinsics.checkParameterIsNotNull(networkCapabilities, "networkCapabilities");
        return networkCapabilities.hasTransport(0);
    }

    private C0020a a(ConnectivityManager connectivityManager) {
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        Integer valueOf = activeNetworkInfo != null ? Integer.valueOf(activeNetworkInfo.getType()) : null;
        if (valueOf != null && valueOf.intValue() == 9) {
            return C0020a.WIRED;
        }
        if (valueOf != null && valueOf.intValue() == 1) {
            return C0020a.WIFI;
        }
        if (valueOf != null && valueOf.intValue() == 0) {
            return a(activeNetworkInfo.getSubtype());
        }
        return null;
    }

    public C0020a a(TelephonyManager telephonyManager) {
        if (telephonyManager == null || !a()) {
            return C0020a.CELLULAR_UNKNOWN;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return a(telephonyManager.getDataNetworkType());
        }
        return a(telephonyManager.getNetworkType());
    }

    private boolean a() {
        return ContextCompat.checkSelfPermission(this.f2370b, "android.permission.READ_PHONE_STATE") == 0;
    }

    private C0020a a(int i) {
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return C0020a.CELLULAR_2G;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return C0020a.CELLULAR_3G;
            case 13:
            case 18:
            case 19:
                return C0020a.CELLULAR_4G;
            case 20:
                return C0020a.CELLULAR_5G;
            default:
                return C0020a.CELLULAR_UNKNOWN;
        }
    }

    /* renamed from: com.criteo.publisher.context.a$a  reason: collision with other inner class name */
    /* compiled from: ConnectionTypeFetcher.kt */
    public enum C0020a {
        WIRED(1),
        WIFI(2),
        CELLULAR_UNKNOWN(3),
        CELLULAR_2G(4),
        CELLULAR_3G(5),
        CELLULAR_4G(6),
        CELLULAR_5G(7);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f2378a;

        private C0020a(int i2) {
            this.f2378a = i2;
        }

        public final int a() {
            return this.f2378a;
        }
    }
}
