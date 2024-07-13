package com.applovin.impl.sdk.utils;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.impl.sdk.c.b;
import com.applovin.impl.sdk.c.d;
import com.applovin.impl.sdk.c.e;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.v;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    private final n f15940a;

    /* renamed from: b  reason: collision with root package name */
    private String f15941b;

    /* renamed from: c  reason: collision with root package name */
    private final String f15942c;

    /* renamed from: d  reason: collision with root package name */
    private final String f15943d;

    public q(n nVar) {
        this.f15940a = nVar;
        this.f15942c = a(d.f15358g, (String) e.b(d.f15357f, null, nVar.P()));
        this.f15943d = a(d.f15359h, (String) nVar.a(b.aa));
        a(d());
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.applovin.impl.sdk.c.d, com.applovin.impl.sdk.c.d<java.lang.String>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String a(com.applovin.impl.sdk.c.d<java.lang.String> r3, java.lang.String r4) {
        /*
            r2 = this;
            com.applovin.impl.sdk.n r0 = r2.f15940a
            android.content.Context r0 = r0.P()
            r1 = 0
            java.lang.Object r0 = com.applovin.impl.sdk.c.e.b(r3, r1, (android.content.Context) r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r0)
            if (r1 == 0) goto L_0x0014
            return r0
        L_0x0014:
            boolean r0 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r4)
            if (r0 == 0) goto L_0x001b
            goto L_0x0029
        L_0x001b:
            java.util.UUID r4 = java.util.UUID.randomUUID()
            java.lang.String r4 = r4.toString()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r0)
        L_0x0029:
            com.applovin.impl.sdk.n r0 = r2.f15940a
            android.content.Context r0 = r0.P()
            com.applovin.impl.sdk.c.e.a(r3, r4, (android.content.Context) r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.utils.q.a(com.applovin.impl.sdk.c.d, java.lang.String):java.lang.String");
    }

    public static String a(n nVar) {
        String str = (String) nVar.a(d.i);
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String valueOf = String.valueOf(((int) (Math.random() * 100.0d)) + 1);
        nVar.a(d.i, valueOf);
        return valueOf;
    }

    private String d() {
        if (!((Boolean) this.f15940a.a(b.dH)).booleanValue()) {
            this.f15940a.b(d.f15356e);
        }
        String str = (String) this.f15940a.a(d.f15356e);
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        this.f15940a.D();
        if (v.a()) {
            v D = this.f15940a.D();
            D.b("AppLovinSdk", "Using identifier (" + str + ") from previous session");
        }
        return str;
    }

    public String a() {
        return this.f15941b;
    }

    public void a(String str) {
        if (((Boolean) this.f15940a.a(b.dH)).booleanValue()) {
            this.f15940a.a(d.f15356e, str);
        }
        this.f15941b = str;
        Bundle bundle = new Bundle(2);
        bundle.putString("user_id", StringUtils.emptyIfNull(str));
        bundle.putString("applovin_random_token", c());
        this.f15940a.aj().a(bundle, "user_info");
    }

    public String b() {
        return this.f15942c;
    }

    public String c() {
        return this.f15943d;
    }
}
