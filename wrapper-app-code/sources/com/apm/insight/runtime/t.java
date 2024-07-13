package com.apm.insight.runtime;

import android.content.Context;
import android.text.TextUtils;
import com.apm.insight.h;
import com.appodeal.ads.adapters.admob.BuildConfig;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    private String f10909a = null;

    /* renamed from: b  reason: collision with root package name */
    private int f10910b = -1;

    public t(Context context) {
    }

    public String a() {
        if (!TextUtils.isEmpty(this.f10909a) && !BuildConfig.ADAPTER_VERSION.equals(this.f10909a)) {
            return this.f10909a;
        }
        String d2 = h.a().d();
        this.f10909a = d2;
        if (!TextUtils.isEmpty(d2) && !BuildConfig.ADAPTER_VERSION.equals(this.f10909a)) {
            return this.f10909a;
        }
        String b2 = s.a().b();
        this.f10909a = b2;
        return b2;
    }

    public void a(String str) {
        this.f10909a = str;
        s.a().b(str);
    }

    public boolean b() {
        return this.f10909a != null;
    }
}
