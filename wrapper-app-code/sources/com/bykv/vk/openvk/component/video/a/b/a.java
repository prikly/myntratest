package com.bykv.vk.openvk.component.video.a.b;

import com.bykv.vk.openvk.component.video.a.b.b.c;
import com.bykv.vk.openvk.component.video.a.b.e.b;
import com.bykv.vk.openvk.component.video.a.b.e.e;
import com.bykv.vk.openvk.component.video.a.b.i;
import com.bykv.vk.openvk.component.video.a.b.l;
import com.ironsource.mediationsdk.config.VersionInfo;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: AbsTask */
abstract class a implements k {
    private static final AtomicLong m = new AtomicLong();

    /* renamed from: a  reason: collision with root package name */
    protected volatile com.bykv.vk.openvk.component.video.a.b.a.a f17939a;

    /* renamed from: b  reason: collision with root package name */
    protected final c f17940b;

    /* renamed from: c  reason: collision with root package name */
    protected final AtomicInteger f17941c = new AtomicInteger();

    /* renamed from: d  reason: collision with root package name */
    protected final AtomicLong f17942d = new AtomicLong();

    /* renamed from: e  reason: collision with root package name */
    protected com.bykv.vk.openvk.component.video.a.b.d.a f17943e;

    /* renamed from: f  reason: collision with root package name */
    protected volatile List<i.b> f17944f;

    /* renamed from: g  reason: collision with root package name */
    protected volatile String f17945g;

    /* renamed from: h  reason: collision with root package name */
    protected volatile String f17946h;
    protected volatile i i;
    protected volatile l j;
    protected volatile boolean k = false;
    public final long l = m.incrementAndGet();
    private final AtomicInteger n = new AtomicInteger(0);
    /* access modifiers changed from: private */
    public int o = -1;

    /* access modifiers changed from: protected */
    public void a(Boolean bool, String str, Throwable th) {
    }

    public a(com.bykv.vk.openvk.component.video.a.b.a.a aVar, c cVar) {
        this.f17939a = aVar;
        this.f17940b = cVar;
    }

    public void a() {
        this.n.compareAndSet(0, 1);
    }

    public boolean b() {
        return this.n.get() == 1;
    }

    /* access modifiers changed from: protected */
    public void c() {
        this.n.compareAndSet(0, 2);
    }

    public boolean d() {
        return this.n.get() == 2;
    }

    /* access modifiers changed from: protected */
    public void e() throws com.bykv.vk.openvk.component.video.a.b.c.a {
        if (b()) {
            throw new com.bykv.vk.openvk.component.video.a.b.c.a();
        }
    }

    /* access modifiers changed from: protected */
    public com.bykv.vk.openvk.component.video.a.b.e.a a(l.a aVar, int i2, int i3, String str) throws IOException {
        b b2 = com.bykv.vk.openvk.component.video.a.b.e.c.a().b();
        e eVar = new e();
        HashMap hashMap = new HashMap();
        eVar.f18028b = aVar.f18100a;
        eVar.f18027a = 0;
        if (VersionInfo.GIT_BRANCH.equalsIgnoreCase(str)) {
            eVar.f18027a = 4;
        }
        List<i.b> list = this.f17944f;
        if (list != null && !list.isEmpty()) {
            for (i.b next : list) {
                if (!"Range".equalsIgnoreCase(next.f18084a) && !"Connection".equalsIgnoreCase(next.f18084a) && !"Proxy-Connection".equalsIgnoreCase(next.f18084a) && !"Host".equalsIgnoreCase(next.f18084a)) {
                    hashMap.put(next.f18084a, next.f18085b);
                }
            }
        }
        String a2 = com.bykv.vk.openvk.component.video.a.c.a.a(i2, i3);
        if (a2 != null) {
            hashMap.put("Range", a2);
        }
        if (e.f18020f) {
            hashMap.put("Cache-Control", "no-cache");
        }
        d c2 = d.c();
        f a3 = f.a();
        boolean z = this.i == null;
        c a4 = z ? c2.a() : a3.b();
        c b3 = z ? c2.b() : a3.c();
        if (!(a4 == null && b3 == null)) {
            if (a4 != null) {
                eVar.f18029c = a4.a(aVar.f18101b);
            }
            if (b3 != null) {
                eVar.f18030d = b3.a(aVar.f18101b);
            }
        }
        eVar.f18031e = hashMap;
        if (!this.k) {
            return b2.a(eVar);
        }
        this.k = false;
        return null;
    }

    /* access modifiers changed from: protected */
    public int f() {
        if (this.i != null) {
            return this.i.f18076c.f18077a;
        }
        return this.f17939a instanceof com.bykv.vk.openvk.component.video.a.b.a.b ? 1 : 0;
    }

    /* access modifiers changed from: protected */
    public boolean g() {
        return f() == 1;
    }

    /* access modifiers changed from: protected */
    public void a(int i2, int i3) {
        if (i2 > 0 && i3 >= 0) {
            int i4 = e.f18021g;
            int f2 = f();
            if (i4 == 1 || (i4 == 2 && f2 == 1)) {
                int i5 = (int) ((((float) i3) / ((float) i2)) * 100.0f);
                if (i5 > 100) {
                    i5 = 100;
                }
                synchronized (this) {
                    if (i5 > this.o) {
                        this.o = i5;
                        com.bykv.vk.openvk.component.video.a.c.a.a((Runnable) new Runnable() {
                            public void run() {
                                if (a.this.f17943e != null) {
                                    a.this.f17943e.a(a.this.j, a.this.o);
                                }
                            }
                        });
                    }
                }
            }
        }
    }
}
