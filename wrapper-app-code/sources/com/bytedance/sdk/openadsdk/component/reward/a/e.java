package com.bytedance.sdk.openadsdk.component.reward.a;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.bykv.vk.openvk.component.video.api.b.a;
import com.bykv.vk.openvk.component.video.api.d.c;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.b.b.b.o;
import com.bytedance.sdk.openadsdk.b.j;
import com.bytedance.sdk.openadsdk.component.reward.d;
import com.bytedance.sdk.openadsdk.component.reward.h;
import com.bytedance.sdk.openadsdk.component.reward.i;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.video.c.b;
import com.bytedance.sdk.openadsdk.utils.u;
import java.io.File;
import java.util.Map;

/* compiled from: RewardFullVideoPlayerManager */
public class e {

    /* renamed from: a  reason: collision with root package name */
    long f621a;

    /* renamed from: b  reason: collision with root package name */
    protected boolean f622b = false;

    /* renamed from: c  reason: collision with root package name */
    boolean f623c = false;

    /* renamed from: d  reason: collision with root package name */
    String f624d;

    /* renamed from: e  reason: collision with root package name */
    boolean f625e;

    /* renamed from: f  reason: collision with root package name */
    protected boolean f626f = false;

    /* renamed from: g  reason: collision with root package name */
    c f627g;

    /* renamed from: h  reason: collision with root package name */
    long f628h;
    private Activity i;
    private n j;
    private FrameLayout k;
    private String l;
    private boolean m = false;
    private j n;

    public j a() {
        return this.n;
    }

    public e(Activity activity) {
        this.i = activity;
    }

    public void a(FrameLayout frameLayout, n nVar, String str, boolean z, j jVar) {
        if (!this.m) {
            this.m = true;
            this.j = nVar;
            this.k = frameLayout;
            this.l = str;
            this.f625e = z;
            this.n = jVar;
            if (z) {
                this.f627g = new h(this.i, frameLayout, nVar, jVar);
            } else {
                this.f627g = new com.bytedance.sdk.openadsdk.component.reward.c(this.i, frameLayout, nVar, jVar);
            }
        }
    }

    public boolean b() {
        c cVar = this.f627g;
        return (cVar == null || cVar.n() == null || !this.f627g.n().l()) ? false : true;
    }

    public a c() {
        c cVar = this.f627g;
        if (cVar != null) {
            return cVar.o();
        }
        return null;
    }

    public boolean d() {
        c cVar = this.f627g;
        return (cVar == null || cVar.n() == null || !this.f627g.n().m()) ? false : true;
    }

    public boolean e() {
        c cVar = this.f627g;
        return cVar != null && cVar.r();
    }

    public void a(long j2) {
        this.f628h = j2;
    }

    public long f() {
        return this.f628h;
    }

    public boolean g() {
        return this.f622b;
    }

    public long h() {
        return this.f621a;
    }

    public void b(long j2) {
        this.f621a = j2;
    }

    public void a(boolean z) {
        this.f622b = z;
    }

    public void i() {
        try {
            if (b()) {
                this.f627g.b();
            }
        } catch (Throwable th) {
            l.b("RewardFullVideoPlayerManager onPause throw Exception :" + th.getMessage());
        }
    }

    public void a(int i2, int i3) {
        if (this.f627g != null) {
            o.a aVar = new o.a();
            aVar.b(j());
            aVar.c(u());
            aVar.a(s());
            aVar.c(i2);
            aVar.d(i3);
            com.bytedance.sdk.openadsdk.b.b.a.a.d(this.f627g.o(), aVar);
        }
    }

    public long j() {
        c cVar = this.f627g;
        if (cVar != null) {
            return cVar.h();
        }
        return 0;
    }

    private void F() {
        c cVar = this.f627g;
        if (cVar != null && cVar.n() != null) {
            this.f621a = this.f627g.g();
            if (this.f627g.n().i() || !this.f627g.n().h()) {
                this.f627g.b();
                this.f627g.e();
                this.f622b = true;
            }
        }
    }

    public void k() {
        c cVar = this.f627g;
        if (cVar != null) {
            cVar.e();
            this.f627g = null;
        }
    }

    public void l() {
        c cVar = this.f627g;
        if (cVar != null) {
            cVar.c();
            this.f627g.f();
        }
    }

    public void m() {
        c cVar = this.f627g;
        if (cVar != null) {
            cVar.f();
        }
    }

    public void n() {
        c cVar = this.f627g;
        if (cVar != null) {
            cVar.d();
        }
    }

    public void o() {
        c cVar = this.f627g;
        if (cVar != null) {
            cVar.b();
        }
    }

    public void a(Map<String, Object> map) {
        c cVar = this.f627g;
        if (cVar != null) {
            cVar.a(map);
        }
    }

    public void a(c.a aVar) {
        c cVar = this.f627g;
        if (cVar != null) {
            cVar.a(aVar);
        }
    }

    public void b(boolean z) {
        c cVar = this.f627g;
        if (cVar != null) {
            cVar.b(z);
        }
    }

    public long p() {
        c cVar = this.f627g;
        if (cVar != null) {
            return cVar.j();
        }
        return 0;
    }

    public int q() {
        c cVar = this.f627g;
        if (cVar != null) {
            return cVar.l();
        }
        return 0;
    }

    public int r() {
        c cVar = this.f627g;
        if (cVar != null) {
            return cVar.i();
        }
        return 0;
    }

    public long s() {
        c cVar = this.f627g;
        if (cVar != null) {
            return cVar.g();
        }
        return this.f621a;
    }

    public void t() {
        c cVar = this.f627g;
        if (cVar != null && cVar.n() != null) {
            this.f627g.n().c();
        }
    }

    public long u() {
        c cVar = this.f627g;
        if (cVar != null) {
            return cVar.j() + this.f627g.h();
        }
        return 0;
    }

    public void a(String str, Map<String, Object> map) {
        c cVar = this.f627g;
        if (cVar != null) {
            Map<String, Object> a2 = u.a(this.j, cVar.h(), this.f627g.n());
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    a2.put(next.getKey(), next.getValue());
                }
            }
            com.bytedance.sdk.openadsdk.b.e.a((Context) this.i, this.j, this.l, str, u(), q(), a2, this.n);
            l.b("TTBaseVideoActivity", "event tag:" + this.l + ", TotalPlayDuration=" + u() + ",mBasevideoController.getPct()=" + q());
        }
    }

    public long v() {
        c cVar = this.f627g;
        if (cVar != null) {
            return cVar.j();
        }
        return 0;
    }

    public boolean w() {
        c cVar = this.f627g;
        if (cVar != null) {
            if (cVar.n() != null) {
                com.bykv.vk.openvk.component.video.api.a n2 = this.f627g.n();
                if (n2.m() || n2.n()) {
                    ((com.bytedance.sdk.openadsdk.core.video.c.a) this.f627g).I();
                    return true;
                }
            } else if (g()) {
                a(false);
                ((com.bytedance.sdk.openadsdk.core.video.c.a) this.f627g).I();
                return true;
            }
        }
        return false;
    }

    public boolean x() {
        return this.f627g != null;
    }

    public boolean y() {
        c cVar = this.f627g;
        return cVar != null && cVar.n() == null;
    }

    public boolean a(long j2, boolean z) {
        l.b("TTBaseVideoActivity", "playVideo start");
        if (this.f627g == null || this.j.J() == null) {
            l.b("TTBaseVideoActivity", "playVideo controller is Empty");
            return false;
        }
        File file = new File(CacheDirFactory.getICacheDir(this.j.aD()).b(), this.j.J().l());
        if (file.exists() && file.length() > 0) {
            this.f623c = true;
        }
        com.bykv.vk.openvk.component.video.api.c.c a2 = n.a(CacheDirFactory.getICacheDir(this.j.aD()).b(), this.j);
        a2.b(this.j.Y());
        a2.a(this.k.getWidth());
        a2.b(this.k.getHeight());
        a2.c(this.j.ac());
        a2.a(j2);
        a2.a(z);
        return this.f627g.a(a2);
    }

    public void a(String str) {
        this.f624d = str;
    }

    public String z() {
        return this.f624d;
    }

    public void c(boolean z) {
        k();
        if (!TextUtils.isEmpty(this.f624d)) {
            return;
        }
        if (z) {
            i.a(m.a()).a();
        } else {
            d.a(m.a()).b();
        }
    }

    public void A() {
        try {
            if (b()) {
                this.f626f = true;
                o();
            }
        } catch (Throwable th) {
            l.e("TTBaseVideoActivity", "onPause throw Exception :" + th.getMessage());
        }
    }

    public void a(boolean z, b bVar) {
        try {
            this.f626f = false;
            if (g()) {
                F();
                a(bVar);
            } else if (d()) {
                n();
            }
        } catch (Throwable th) {
            l.e("TTBaseVideoActivity", "onContinue throw Exception :" + th.getMessage());
        }
    }

    public void a(boolean z, b bVar, boolean z2) {
        if (z2 && !z && !this.f626f) {
            if (d()) {
                n();
                Log.i("TTBaseVideoActivity", "resumeOrRestartVideo: continue play");
                return;
            }
            F();
            a(bVar);
            Log.i("TTBaseVideoActivity", "resumeOrRestartVideo: recreate video player & exec play");
        }
    }

    public boolean B() {
        c cVar = this.f627g;
        if (cVar == null || cVar.n() == null) {
            return false;
        }
        return this.f627g.n().e();
    }

    /* access modifiers changed from: protected */
    public void a(b bVar) {
        if (w() && bVar != null) {
            bVar.a(h(), true);
        }
    }

    public double C() {
        if (com.bytedance.sdk.openadsdk.core.e.l.c(this.j) && this.j.a() != null) {
            return (double) this.j.a().b();
        }
        n nVar = this.j;
        if (nVar == null || nVar.J() == null) {
            return 0.0d;
        }
        return this.j.J().f();
    }

    public void D() {
        c cVar = this.f627g;
        if (cVar instanceof com.bytedance.sdk.openadsdk.core.video.c.a) {
            ((com.bytedance.sdk.openadsdk.core.video.c.a) cVar).H();
        }
    }

    public View E() {
        c cVar = this.f627g;
        if (cVar instanceof com.bytedance.sdk.openadsdk.core.video.c.a) {
            return (View) ((com.bytedance.sdk.openadsdk.core.video.c.a) cVar).J();
        }
        return null;
    }
}
