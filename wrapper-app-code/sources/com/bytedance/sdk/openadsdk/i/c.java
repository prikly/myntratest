package com.bytedance.sdk.openadsdk.i;

import android.content.Context;
import android.location.Address;
import android.text.TextUtils;
import com.bytedance.sdk.component.e.c.b;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.j;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.multipro.d.a;
import com.bytedance.sdk.openadsdk.utils.u;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.util.Map;

/* compiled from: TTAdNetDepend */
public class c implements b {

    /* renamed from: a  reason: collision with root package name */
    String f2011a = "sp_multi_ttadnet_config";

    /* renamed from: b  reason: collision with root package name */
    private Context f2012b;

    public Address a(Context context) {
        return null;
    }

    public String b() {
        return "pangle_sdk";
    }

    public String c() {
        return MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID;
    }

    public int d() {
        return BuildConfig.VERSION_CODE;
    }

    public c(Context context) {
        this.f2012b = context;
    }

    public int a() {
        return Integer.parseInt("1371");
    }

    public String e() {
        return j.a(this.f2012b);
    }

    public String a(Context context, String str, String str2) {
        return a.b(this.f2011a, str, str2);
    }

    public void a(Context context, Map<String, ?> map) {
        if (map != null) {
            try {
                for (Map.Entry next : map.entrySet()) {
                    Object value = next.getValue();
                    if (value instanceof Integer) {
                        a.a(this.f2011a, (String) next.getKey(), (Integer) value);
                    } else if (value instanceof Long) {
                        a.a(this.f2011a, (String) next.getKey(), (Long) value);
                    } else if (value instanceof Float) {
                        a.a(this.f2011a, (String) next.getKey(), (Float) value);
                    } else if (value instanceof Boolean) {
                        a.a(this.f2011a, (String) next.getKey(), (Boolean) value);
                    } else if (value instanceof String) {
                        a.a(this.f2011a, (String) next.getKey(), (String) value);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public String[] f() {
        String[] strArr = {"tnc16-useast1a.isnssdk.com", "tnc16-useast1a.byteoversea.com", "tnc16-alisg.isnssdk.com", "tnc16-alisg.byteoversea.com"};
        String w = m.h().w();
        if (!TextUtils.isEmpty(w)) {
            return ("SG".equals(w) || "CN".equals(w)) ? new String[]{"tnc16-alisg.isnssdk.com", "tnc16-alisg.byteoversea.com", "tnc16-useast1a.isnssdk.com", "tnc16-useast1a.byteoversea.com"} : strArr;
        }
        int o = u.o();
        return (o == 2 || o == 1) ? new String[]{"tnc16-alisg.isnssdk.com", "tnc16-alisg.byteoversea.com", "tnc16-useast1a.isnssdk.com", "tnc16-useast1a.byteoversea.com"} : strArr;
    }
}
