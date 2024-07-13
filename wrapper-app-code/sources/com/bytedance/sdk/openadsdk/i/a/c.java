package com.bytedance.sdk.openadsdk.i.a;

import com.bytedance.sdk.component.d.g;
import com.bytedance.sdk.component.d.j;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.core.e.q;
import com.bytedance.sdk.openadsdk.i.a.a;

/* compiled from: SplashGifLoader */
public class c extends a {

    /* renamed from: a  reason: collision with root package name */
    public static volatile int f2007a;

    /* renamed from: b  reason: collision with root package name */
    private q f2008b;

    private void a(j jVar) {
        g e2 = jVar.e();
        if (e2 != null && c()) {
            if (jVar.d()) {
                l.b("splashLoadAd", " GiftLoader doTask  缓存存在，直接返回缓存数据");
                f2007a = 1;
                a(true);
            } else {
                l.b("splashLoadAd", " GiftLoader doTask  缓存存在，直接返回缓存数据");
                f2007a = 2;
                a(false);
            }
            a(e2.a());
        }
    }

    private boolean c() {
        q qVar = this.f2008b;
        return qVar != null && qVar.c();
    }

    private void a(long j) {
        this.f2008b.d(j);
        q qVar = this.f2008b;
        qVar.b(j - qVar.b());
    }

    private void a(boolean z) {
        if (c()) {
            this.f2008b.a(z);
        }
    }

    private void d() {
        if (c()) {
            long currentTimeMillis = System.currentTimeMillis();
            q qVar = this.f2008b;
            qVar.a(currentTimeMillis - qVar.a());
            this.f2008b.c(currentTimeMillis);
        }
    }

    /* access modifiers changed from: protected */
    public void a(j jVar, a.b bVar) {
        a(jVar);
        super.a(jVar, bVar);
    }

    /* access modifiers changed from: protected */
    public void a() {
        d();
    }
}
