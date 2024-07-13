package com.com.bytedance.overseas.sdk.a;

import android.content.Context;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.utils.u;

/* compiled from: TTDownloadFactory */
public class d {
    public static c a(Context context, n nVar, String str) {
        if (u.l(context)) {
            return new b(context, nVar, str);
        }
        return new a(context, nVar, str);
    }
}
