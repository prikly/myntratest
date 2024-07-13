package com.bytedance.sdk.openadsdk.k;

import android.text.TextUtils;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.j;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.utils.u;
import com.com.bytedance.overseas.sdk.b.a;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: TrackAdUrlUtils */
public class e {
    private static int a(int i) {
        int i2 = 2;
        if (i != 2) {
            i2 = 3;
            if (i != 3) {
                i2 = 4;
                if (i != 4) {
                    i2 = 5;
                    if (i == 5 || i == 15) {
                        return i2;
                    }
                    return -1;
                }
            }
        }
        return i2;
    }

    public static List<String> a(List<String> list, boolean z) {
        String a2 = j.a(m.a());
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.contains("{TS}") || next.contains("__TS__")) {
                long currentTimeMillis = System.currentTimeMillis();
                next = next.replace("{TS}", String.valueOf(currentTimeMillis)).replace("__TS__", String.valueOf(currentTimeMillis));
            }
            if ((next.contains("{UID}") || next.contains("__UID__")) && !TextUtils.isEmpty(a2)) {
                next = next.replace("{UID}", a2).replace("__UID__", a2);
            }
            if (z) {
                next = a(next);
            }
            arrayList.add(next);
        }
        return arrayList;
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return str.replace("[ss_random]", String.valueOf(new SecureRandom().nextLong())).replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
        } catch (Exception e2) {
            e2.printStackTrace();
            return str;
        }
    }

    public static List<String> a(List<String> list, boolean z, n nVar) {
        String a2 = j.a(m.a());
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.contains("{TS}") || next.contains("__TS__")) {
                long currentTimeMillis = System.currentTimeMillis();
                next = next.replace("{TS}", String.valueOf(currentTimeMillis)).replace("__TS__", String.valueOf(currentTimeMillis));
            }
            if ((next.contains("{UID}") || next.contains("__UID__")) && !TextUtils.isEmpty(a2)) {
                next = next.replace("{UID}", a2).replace("__UID__", a2);
            }
            if (next.contains("__CID__") && nVar != null && !TextUtils.isEmpty(nVar.Y())) {
                next = next.replace("__CID__", nVar.Y());
            }
            if (next.contains("__CTYPE__") && nVar != null) {
                next = next.replace("__CTYPE__", String.valueOf(a(nVar.ad())));
            }
            if (next.contains("__GAID__")) {
                next = next.replace("__GAID__", a.a().b());
            }
            if (next.contains("__OS__")) {
                next = next.replace("__OS__", BuildConfig.ADAPTER_VERSION);
            }
            if (next.contains("__UA1__")) {
                next = next.replace("__UA1__", URLEncoder.encode(u.b()));
            }
            if (z) {
                next = a(next);
            }
            arrayList.add(next);
        }
        return arrayList;
    }
}
