package com.bytedance.sdk.openadsdk.i;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.sdk.component.e.a;
import com.bytedance.sdk.openadsdk.core.e.k;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.i.a.c;
import java.util.concurrent.TimeUnit;

/* compiled from: TTNetClient */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static volatile d f2013a;

    /* renamed from: b  reason: collision with root package name */
    private Context f2014b;

    /* renamed from: c  reason: collision with root package name */
    private final a f2015c;

    /* renamed from: d  reason: collision with root package name */
    private c f2016d;

    public static d a() {
        if (f2013a == null) {
            synchronized (d.class) {
                if (f2013a == null) {
                    f2013a = new d(m.a());
                }
            }
        }
        return f2013a;
    }

    private d(Context context) {
        this.f2014b = context == null ? m.a() : context.getApplicationContext();
        a a2 = new a.C0232a().a(10000, TimeUnit.MILLISECONDS).b(10000, TimeUnit.MILLISECONDS).c(10000, TimeUnit.MILLISECONDS).a(true).a();
        this.f2015c = a2;
        com.bytedance.sdk.component.b.a.d a3 = a2.e().a();
        if (a3 != null) {
            a3.a(32);
        }
    }

    public a b() {
        return this.f2015c;
    }

    public c c() {
        d();
        return this.f2016d;
    }

    public void a(String str, ImageView imageView) {
        com.bytedance.sdk.openadsdk.d.a.a(str).a(imageView);
    }

    public void a(k kVar, ImageView imageView) {
        if (kVar != null && !TextUtils.isEmpty(kVar.a()) && imageView != null) {
            com.bytedance.sdk.openadsdk.d.a.a(kVar).a(imageView);
        }
    }

    private void d() {
        if (this.f2016d == null) {
            this.f2016d = new c();
        }
    }
}
