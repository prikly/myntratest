package com.bytedance.sdk.openadsdk.utils;

import android.os.Build;
import com.bytedance.sdk.openadsdk.core.e.n;

/* compiled from: SlotUtils */
public class o {
    public static boolean a(n nVar) {
        int e2;
        if (nVar == null || (e2 = u.e(nVar)) == 8 || e2 == 7 || nVar.G() == null || Build.VERSION.SDK_INT > 27) {
            return false;
        }
        return true;
    }
}
