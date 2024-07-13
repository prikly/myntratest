package com.com.bytedance.overseas.sdk.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.b.e;
import com.bytedance.sdk.openadsdk.b.p;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.utils.u;
import java.util.Map;

/* compiled from: AndroidRGPDownLoader */
class a extends b {
    public a(Context context, n nVar, String str) {
        super(context, nVar, str);
    }

    public boolean a() {
        Intent a2;
        if ((this.f2266b != null && this.f2266b.as() == 0) || this.f2265a == null) {
            return false;
        }
        try {
            String c2 = this.f2265a.c();
            if (TextUtils.isEmpty(c2) || (a2 = u.a(c(), c2)) == null) {
                return false;
            }
            a2.putExtra("START_ONLY_FOR_ANDROID", true);
            if (!(c() instanceof Activity)) {
                a2.addFlags(268435456);
            }
            c().startActivity(a2);
            e.d(c(), this.f2266b, this.f2267c, "click_open", (Map<String, Object>) null);
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public boolean b() {
        if (this.f2266b.ab() == null) {
            return false;
        }
        try {
            String a2 = this.f2266b.ab().a();
            if (!TextUtils.isEmpty(a2)) {
                Uri parse = Uri.parse(a2);
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(parse);
                if (!(c() instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                e.d(m.a(), this.f2266b, this.f2267c, "open_url_app", (Map<String, Object>) null);
                c().startActivity(intent);
                p.a().a(this.f2266b, this.f2267c);
                return true;
            }
        } catch (Throwable unused) {
        }
        if (this.f2268d && !this.f2269e.get()) {
            return false;
        }
        this.f2268d = true;
        e.d(c(), this.f2266b, this.f2267c, "open_fallback_url", (Map<String, Object>) null);
        return false;
    }
}
