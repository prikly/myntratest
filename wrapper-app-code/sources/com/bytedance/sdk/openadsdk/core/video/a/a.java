package com.bytedance.sdk.openadsdk.core.video.a;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.view.SurfaceHolder;
import android.view.View;
import com.bykv.vk.openvk.component.video.api.d.b;
import com.bykv.vk.openvk.component.video.api.d.c;
import com.bykv.vk.openvk.component.video.api.renderview.SSRenderTextureView;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.x;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.h;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.d;
import com.bytedance.sdk.openadsdk.utils.m;
import com.bytedance.sdk.openadsdk.utils.o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: BaseController */
public abstract class a implements c, x.a, com.bytedance.sdk.openadsdk.core.video.nativevideo.a {

    /* renamed from: a  reason: collision with root package name */
    protected SurfaceHolder f1585a;

    /* renamed from: b  reason: collision with root package name */
    protected SurfaceTexture f1586b;
    /* access modifiers changed from: protected */

    /* renamed from: c  reason: collision with root package name */
    public com.bykv.vk.openvk.component.video.api.a f1587c;
    /* access modifiers changed from: protected */

    /* renamed from: d  reason: collision with root package name */
    public d f1588d;
    /* access modifiers changed from: protected */

    /* renamed from: e  reason: collision with root package name */
    public n f1589e;
    /* access modifiers changed from: protected */

    /* renamed from: f  reason: collision with root package name */
    public long f1590f = 0;

    /* renamed from: g  reason: collision with root package name */
    protected long f1591g = 0;
    /* access modifiers changed from: protected */

    /* renamed from: h  reason: collision with root package name */
    public WeakReference<Context> f1592h;
    protected List<Runnable> i;
    protected boolean j = false;
    /* access modifiers changed from: protected */
    public final x k = new x(Looper.getMainLooper(), this);
    protected boolean l = false;
    /* access modifiers changed from: protected */
    public boolean m = true;
    /* access modifiers changed from: protected */
    public boolean n = false;
    protected boolean o = false;
    protected boolean p = false;
    /* access modifiers changed from: protected */
    public long q;
    protected Runnable r = new Runnable() {
        public void run() {
            l.a("CSJ_VIDEO_Controller", "resumeVideo: run ", Boolean.valueOf(a.this.j));
            a.this.E();
        }
    };
    private long s = 0;

    public void a(Message message) {
    }

    public void a(b bVar, SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
    }

    public void f(b bVar, View view) {
    }

    /* access modifiers changed from: protected */
    public void A() {
        if (this.f1587c != null) {
            if (B()) {
                SurfaceTexture surfaceTexture = this.f1586b;
                if (surfaceTexture != null && surfaceTexture != this.f1587c.g()) {
                    this.f1587c.a(this.f1586b);
                    return;
                }
                return;
            }
            SurfaceHolder surfaceHolder = this.f1585a;
            if (surfaceHolder != null && surfaceHolder != this.f1587c.f()) {
                this.f1587c.a(this.f1585a);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean B() {
        d dVar = this.f1588d;
        if (dVar != null) {
            return dVar.q() instanceof SSRenderTextureView;
        }
        return false;
    }

    public boolean s() {
        if (Build.VERSION.SDK_INT < 14) {
            return false;
        }
        n nVar = this.f1589e;
        if (nVar != null && nVar.aD() == 1 && Build.VERSION.SDK_INT < 23) {
            return true;
        }
        if ((!m.e() || Build.VERSION.SDK_INT < 30) && !o.a(this.f1589e)) {
            return h.d().q();
        }
        return true;
    }

    public long g() {
        return this.f1590f;
    }

    public void a(long j2) {
        this.f1590f = j2;
        long j3 = this.f1591g;
        if (j3 > j2) {
            j2 = j3;
        }
        this.f1591g = j2;
    }

    /* access modifiers changed from: protected */
    public boolean C() {
        WeakReference<Context> weakReference = this.f1592h;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    /* access modifiers changed from: protected */
    public void a(Runnable runnable) {
        if (runnable != null) {
            if (!this.f1588d.m() || !this.j) {
                b(runnable);
            } else {
                runnable.run();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void b(Runnable runnable) {
        if (this.i == null) {
            this.i = new ArrayList();
        }
        this.i.add(runnable);
    }

    /* access modifiers changed from: protected */
    public void D() {
        l.c("CSJ_VIDEO_Controller", "execPendingActions: before ");
        List<Runnable> list = this.i;
        if (list != null && !list.isEmpty()) {
            l.c("CSJ_VIDEO_Controller", "execPendingActions:  exec");
            Iterator it = new ArrayList(this.i).iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            this.i.clear();
        }
    }

    public void a(b bVar, SurfaceHolder surfaceHolder) {
        this.j = true;
        this.f1585a = surfaceHolder;
        com.bykv.vk.openvk.component.video.api.a aVar = this.f1587c;
        if (aVar != null) {
            if (aVar != null) {
                aVar.a(surfaceHolder);
            }
            l.c("CSJ_VIDEO_Controller", "surfaceCreated: ");
            D();
        }
    }

    public void b(b bVar, SurfaceHolder surfaceHolder) {
        this.j = false;
        this.f1585a = null;
        com.bykv.vk.openvk.component.video.api.a aVar = this.f1587c;
        if (aVar != null) {
            aVar.b(false);
        }
    }

    public void a(b bVar, SurfaceTexture surfaceTexture) {
        this.j = true;
        this.f1586b = surfaceTexture;
        com.bykv.vk.openvk.component.video.api.a aVar = this.f1587c;
        if (aVar != null) {
            aVar.a(surfaceTexture);
            this.f1587c.b(this.j);
        }
        l.c("CSJ_VIDEO_Controller", "surfaceTextureCreated: ");
        D();
    }

    public void b(b bVar, SurfaceTexture surfaceTexture) {
        this.j = false;
        l.c("CSJ_VIDEO_Controller", "surfaceTextureDestroyed: ");
        com.bykv.vk.openvk.component.video.api.a aVar = this.f1587c;
        if (aVar != null) {
            aVar.b(false);
        }
        this.f1586b = null;
        D();
    }

    /* access modifiers changed from: protected */
    public void E() {
        this.k.postAtFrontOfQueue(new Runnable() {
            public void run() {
                if (a.this.f1587c != null) {
                    l.a("CSJ_VIDEO_Controller", "resumeVideo: execResumePlay", Boolean.valueOf(a.this.j));
                    a.this.f1587c.a();
                }
            }
        });
    }

    public com.bykv.vk.openvk.component.video.api.a n() {
        return this.f1587c;
    }

    /* renamed from: F */
    public d o() {
        return this.f1588d;
    }

    public void a(boolean z) {
        this.m = z;
        d dVar = this.f1588d;
        if (dVar != null) {
            dVar.d(z);
        }
    }

    public boolean G() {
        return this.m;
    }

    public boolean m() {
        return this.o;
    }

    public void b(long j2) {
        this.s = j2;
    }

    public void c(long j2) {
        this.q = j2;
    }

    public long h() {
        if (n() == null) {
            return 0;
        }
        return n().o();
    }

    public int i() {
        com.bykv.vk.openvk.component.video.api.a aVar = this.f1587c;
        if (aVar == null) {
            return 0;
        }
        return aVar.p();
    }

    public boolean p() {
        return this.n;
    }

    public void b(boolean z) {
        this.n = z;
        com.bykv.vk.openvk.component.video.api.a aVar = this.f1587c;
        if (aVar != null) {
            aVar.a(z);
        }
    }

    public long j() {
        com.bykv.vk.openvk.component.video.api.a aVar = this.f1587c;
        if (aVar == null) {
            return 0;
        }
        return aVar.q();
    }

    public boolean q() {
        return this.l;
    }

    public void c(boolean z) {
        this.l = z;
    }

    /* access modifiers changed from: protected */
    public void f(boolean z) {
        this.p = z;
    }

    public void c() {
        com.bykv.vk.openvk.component.video.api.a aVar = this.f1587c;
        if (aVar != null) {
            aVar.c();
        }
    }
}
