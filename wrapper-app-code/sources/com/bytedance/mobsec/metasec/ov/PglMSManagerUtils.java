package com.bytedance.mobsec.metasec.ov;

import android.content.Context;
import ms.bd.o.Pgl.l0;

public final class PglMSManagerUtils {
    private PglMSManagerUtils() {
    }

    public static synchronized PglMSManager get(String str) {
        PglMSManager pglMSManager;
        synchronized (PglMSManagerUtils.class) {
            l0.pgla a2 = l0.a(str);
            pglMSManager = a2 != null ? new PglMSManager(a2) : null;
        }
        return pglMSManager;
    }

    public static synchronized boolean init(Context context, PglMSConfig pglMSConfig) {
        boolean a2;
        synchronized (PglMSManagerUtils.class) {
            a2 = l0.a(context, pglMSConfig.a(), "Pglmetasec_ov", "ms_sensor_ov");
        }
        return a2;
    }

    public static String versionInfo() {
        return l0.a();
    }
}
