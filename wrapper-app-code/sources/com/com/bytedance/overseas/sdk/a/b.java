package com.com.bytedance.overseas.sdk.a;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.b.e;
import com.bytedance.sdk.openadsdk.b.p;
import com.bytedance.sdk.openadsdk.core.e.c;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.y;
import com.bytedance.sdk.openadsdk.utils.u;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: GPDownLoader */
public class b implements c {

    /* renamed from: a  reason: collision with root package name */
    protected c f2265a;

    /* renamed from: b  reason: collision with root package name */
    protected n f2266b;

    /* renamed from: c  reason: collision with root package name */
    protected String f2267c;

    /* renamed from: d  reason: collision with root package name */
    protected boolean f2268d = false;

    /* renamed from: e  reason: collision with root package name */
    protected final AtomicBoolean f2269e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    private WeakReference<Context> f2270f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f2271g = false;

    public b(Context context, n nVar, String str) {
        this.f2270f = new WeakReference<>(context);
        this.f2266b = nVar;
        this.f2265a = nVar.aa();
        this.f2267c = str;
        l.c("GPDownLoader", "====tag===" + str);
        if (m.a() == null) {
            m.a(context);
        }
    }

    public void a(boolean z) {
        this.f2271g = z;
    }

    public boolean a(Context context, String str) {
        return b(context, str);
    }

    public static boolean b(Context context, String str) {
        Intent launchIntentForPackage;
        if (!(context == null || str == null || TextUtils.isEmpty(str))) {
            l.c("GPDownLoader", "gotoGooglePlay :market://details?id=" + str);
            Intent intent = new Intent("android.intent.action.VIEW");
            Uri parse = Uri.parse("market://details?id=" + str);
            intent.setData(parse);
            for (ResolveInfo next : context.getPackageManager().queryIntentActivities(intent, 65536)) {
                if (next.activityInfo.packageName.equals("com.android.vending") && (launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage("com.android.vending")) != null) {
                    launchIntentForPackage.setComponent(new ComponentName(next.activityInfo.packageName, next.activityInfo.name));
                    launchIntentForPackage.setData(parse);
                    if (!(context instanceof Activity)) {
                        launchIntentForPackage.setFlags(268435456);
                    }
                    context.startActivity(launchIntentForPackage);
                    return true;
                }
            }
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + str));
                intent2.setFlags(268435456);
                context.startActivity(intent2);
                return true;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public Context c() {
        WeakReference<Context> weakReference = this.f2270f;
        return (weakReference == null || weakReference.get() == null) ? m.a() : (Context) this.f2270f.get();
    }

    public void d() {
        if (c() != null) {
            if (b()) {
                this.f2269e.set(true);
            } else if (!a() && !e() && this.f2266b.aa() == null && this.f2266b.O() != null) {
                y.a(c(), this.f2266b.O(), this.f2266b, u.a(this.f2267c), this.f2267c, true);
            }
        }
    }

    public boolean b() {
        if (this.f2266b.ab() == null) {
            return false;
        }
        String a2 = this.f2266b.ab().a();
        if (!TextUtils.isEmpty(a2)) {
            Uri parse = Uri.parse(a2);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(parse);
            if (u.a(c(), intent)) {
                if (!(c() instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                try {
                    e.d(m.a(), this.f2266b, this.f2267c, "open_url_app", (Map<String, Object>) null);
                    c().startActivity(intent);
                    p.a().a(this.f2266b, this.f2267c);
                    return true;
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
        if (this.f2268d && !this.f2269e.get()) {
            return false;
        }
        this.f2268d = true;
        e.d(c(), this.f2266b, this.f2267c, "open_fallback_url", (Map<String, Object>) null);
        return false;
    }

    public boolean e() {
        this.f2269e.set(true);
        if (this.f2265a == null || !a(c(), this.f2265a.c())) {
            return false;
        }
        return true;
    }

    public boolean a() {
        Intent a2;
        if (this.f2265a == null) {
            return false;
        }
        n nVar = this.f2266b;
        if (nVar != null && nVar.as() == 0) {
            return false;
        }
        String c2 = this.f2265a.c();
        if (TextUtils.isEmpty(c2) || !u.b(c(), c2) || (a2 = u.a(c(), c2)) == null) {
            return false;
        }
        a2.putExtra("START_ONLY_FOR_ANDROID", true);
        try {
            c().startActivity(a2);
            e.d(c(), this.f2266b, this.f2267c, "click_open", (Map<String, Object>) null);
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }
}
