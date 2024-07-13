package com.bytedance.sdk.openadsdk.component.g;

import android.content.Context;
import android.os.Build;
import android.widget.FrameLayout;
import com.bykv.vk.openvk.component.video.api.c.c;
import com.bykv.vk.openvk.component.video.api.d.c;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.b.b.b.o;
import com.bytedance.sdk.openadsdk.component.f.a;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.utils.u;

/* compiled from: TTAppOpenVideoManager */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private Context f582a;

    /* renamed from: b  reason: collision with root package name */
    private FrameLayout f583b;

    /* renamed from: c  reason: collision with root package name */
    private n f584c;

    /* renamed from: d  reason: collision with root package name */
    private a f585d;

    public b(Context context) {
        this.f582a = context.getApplicationContext();
    }

    public void a(FrameLayout frameLayout, n nVar) {
        this.f583b = frameLayout;
        this.f584c = nVar;
        this.f585d = new a(this.f582a, frameLayout, nVar);
    }

    public boolean a() {
        String str;
        int f2 = u.f(this.f584c);
        if (Build.VERSION.SDK_INT >= 23) {
            str = a.a(m.a(), f2);
        } else {
            try {
                str = a.a();
            } catch (Throwable unused) {
                str = "";
            }
        }
        c a2 = n.a(str, this.f584c);
        a2.b(this.f584c.Y());
        a2.a(this.f583b.getWidth());
        a2.b(this.f583b.getHeight());
        a2.c(this.f584c.ac());
        a2.a(0);
        a2.a(true);
        return this.f585d.a(a2);
    }

    public boolean b() {
        a aVar = this.f585d;
        return (aVar == null || aVar.n() == null || !this.f585d.n().l()) ? false : true;
    }

    public boolean c() {
        a aVar = this.f585d;
        return (aVar == null || aVar.n() == null || !this.f585d.n().m()) ? false : true;
    }

    public void a(c.a aVar) {
        a aVar2 = this.f585d;
        if (aVar2 != null) {
            aVar2.a(aVar);
        }
    }

    public void d() {
        try {
            if (b()) {
                this.f585d.b();
            }
        } catch (Throwable th) {
            l.b("AppOpenVideoManager onPause throw Exception :" + th.getMessage());
        }
    }

    public void e() {
        a aVar = this.f585d;
        if (aVar != null) {
            aVar.d();
        }
    }

    public void f() {
        a aVar = this.f585d;
        if (aVar != null) {
            this.f582a = null;
            aVar.e();
            this.f585d = null;
        }
    }

    public long g() {
        a aVar = this.f585d;
        if (aVar != null) {
            return aVar.g();
        }
        return 0;
    }

    public long h() {
        a aVar = this.f585d;
        if (aVar != null) {
            return aVar.h();
        }
        return 0;
    }

    public long i() {
        a aVar = this.f585d;
        if (aVar != null) {
            return aVar.j() + this.f585d.h();
        }
        return 0;
    }

    public void a(int i) {
        if (this.f585d != null) {
            o.a aVar = new o.a();
            aVar.a(g());
            aVar.c(i());
            aVar.b(h());
            aVar.e(i);
            aVar.f(this.f585d.i());
            this.f585d.a(aVar);
        }
    }
}
