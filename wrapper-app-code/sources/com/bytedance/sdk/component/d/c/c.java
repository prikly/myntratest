package com.bytedance.sdk.component.d.c;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;
import com.bytedance.sdk.component.d.d.i;
import com.bytedance.sdk.component.d.g;
import com.bytedance.sdk.component.d.h;
import com.bytedance.sdk.component.d.j;
import com.bytedance.sdk.component.d.n;
import com.bytedance.sdk.component.d.r;
import com.bytedance.sdk.component.d.s;
import com.bytedance.sdk.component.d.t;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: ImageRequest */
public class c implements h {

    /* renamed from: a  reason: collision with root package name */
    Future<?> f19027a;

    /* renamed from: b  reason: collision with root package name */
    private String f19028b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public String f19029c;

    /* renamed from: d  reason: collision with root package name */
    private String f19030d;

    /* renamed from: e  reason: collision with root package name */
    private n f19031e;

    /* renamed from: f  reason: collision with root package name */
    private ImageView.ScaleType f19032f;

    /* renamed from: g  reason: collision with root package name */
    private Bitmap.Config f19033g;

    /* renamed from: h  reason: collision with root package name */
    private int f19034h;
    private int i;
    /* access modifiers changed from: private */
    public t j;
    /* access modifiers changed from: private */
    public WeakReference<ImageView> k;
    /* access modifiers changed from: private */
    public volatile boolean l;
    private boolean m;
    private boolean n;
    /* access modifiers changed from: private */
    public r o;
    /* access modifiers changed from: private */
    public s p;
    /* access modifiers changed from: private */
    public Queue<i> q;
    /* access modifiers changed from: private */
    public final Handler r;
    private boolean s;
    private g t;
    private int u;
    private f v;
    private a w;
    private com.bytedance.sdk.component.d.b x;

    private c(b bVar) {
        s sVar;
        this.q = new LinkedBlockingQueue();
        this.r = new Handler(Looper.getMainLooper());
        this.s = true;
        this.f19028b = bVar.f19050d;
        this.f19031e = new a(bVar.f19047a);
        this.k = new WeakReference<>(bVar.f19048b);
        this.f19032f = bVar.f19051e;
        this.f19033g = bVar.f19052f;
        this.f19034h = bVar.f19053g;
        this.i = bVar.f19054h;
        this.j = bVar.i == null ? t.AUTO : bVar.i;
        if (bVar.j == null) {
            sVar = s.MAIN;
        } else {
            sVar = bVar.j;
        }
        this.p = sVar;
        this.o = bVar.k;
        this.x = a(bVar);
        if (!TextUtils.isEmpty(bVar.f19049c)) {
            b(bVar.f19049c);
            a(bVar.f19049c);
        }
        this.m = bVar.l;
        this.n = bVar.m;
        this.v = bVar.p;
        this.q.add(new com.bytedance.sdk.component.d.d.c());
    }

    private com.bytedance.sdk.component.d.b a(b bVar) {
        if (bVar.o != null) {
            return bVar.o;
        }
        if (!TextUtils.isEmpty(bVar.n)) {
            return com.bytedance.sdk.component.d.c.a.a.a(new File(bVar.n));
        }
        return com.bytedance.sdk.component.d.c.a.a.f();
    }

    public String a() {
        return this.f19028b;
    }

    public n f() {
        return this.f19031e;
    }

    public String g() {
        return this.f19030d;
    }

    public void a(String str) {
        this.f19030d = str;
    }

    public String e() {
        return this.f19029c;
    }

    public void b(String str) {
        WeakReference<ImageView> weakReference = this.k;
        if (!(weakReference == null || weakReference.get() == null)) {
            ((ImageView) this.k.get()).setTag(1094453505, str);
        }
        this.f19029c = str;
    }

    public ImageView.ScaleType d() {
        return this.f19032f;
    }

    public Bitmap.Config h() {
        return this.f19033g;
    }

    public int b() {
        return this.f19034h;
    }

    public int c() {
        return this.i;
    }

    public t i() {
        return this.j;
    }

    public boolean j() {
        return this.m;
    }

    public boolean k() {
        return this.n;
    }

    public void a(boolean z) {
        this.s = z;
    }

    public boolean l() {
        return this.s;
    }

    public g m() {
        return this.t;
    }

    public void a(g gVar) {
        this.t = gVar;
    }

    public int n() {
        return this.u;
    }

    public void a(int i2) {
        this.u = i2;
    }

    public a o() {
        return this.w;
    }

    public void a(a aVar) {
        this.w = aVar;
    }

    public f p() {
        return this.v;
    }

    public com.bytedance.sdk.component.d.b q() {
        return this.x;
    }

    public boolean a(i iVar) {
        if (this.l) {
            return false;
        }
        return this.q.add(iVar);
    }

    /* access modifiers changed from: private */
    public h s() {
        try {
            if (this.v == null) {
                if (this.f19031e != null) {
                    this.f19031e.a(1005, "not init !", (Throwable) null);
                }
                return this;
            }
            ExecutorService e2 = this.v.e();
            if (e2 != null) {
                this.f19027a = e2.submit(new Runnable() {
                    public void run() {
                        while (true) {
                            try {
                                if (c.this.l) {
                                    break;
                                }
                                i iVar = (i) c.this.q.poll();
                                if (iVar == null) {
                                    break;
                                }
                                if (c.this.o != null) {
                                    c.this.o.a(iVar.a(), c.this);
                                }
                                iVar.a(c.this);
                                if (c.this.o != null) {
                                    c.this.o.b(iVar.a(), c.this);
                                }
                            } catch (Throwable th) {
                                c.this.a(2000, th.getMessage(), th);
                                if (c.this.o != null) {
                                    c.this.o.b("exception", c.this);
                                    return;
                                }
                                return;
                            }
                        }
                        if (c.this.l) {
                            c.this.a(1003, "canceled", (Throwable) null);
                        }
                    }
                });
            }
            return this;
        } catch (Exception e3) {
            Log.e("ImageRequest", e3.getMessage());
        }
    }

    /* access modifiers changed from: private */
    public void a(int i2, String str, Throwable th) {
        new com.bytedance.sdk.component.d.d.h(i2, str, th).a(this);
        this.q.clear();
    }

    public String r() {
        return e() + i();
    }

    /* compiled from: ImageRequest */
    public static class b implements com.bytedance.sdk.component.d.i {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public n f19047a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public ImageView f19048b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public String f19049c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public String f19050d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public ImageView.ScaleType f19051e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public Bitmap.Config f19052f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public int f19053g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public int f19054h;
        /* access modifiers changed from: private */
        public t i;
        /* access modifiers changed from: private */
        public s j;
        /* access modifiers changed from: private */
        public r k;
        /* access modifiers changed from: private */
        public boolean l;
        /* access modifiers changed from: private */
        public boolean m;
        /* access modifiers changed from: private */
        public String n;
        /* access modifiers changed from: private */
        public com.bytedance.sdk.component.d.b o;
        /* access modifiers changed from: private */
        public f p;

        public b(f fVar) {
            this.p = fVar;
        }

        public com.bytedance.sdk.component.d.i c(String str) {
            this.f19050d = str;
            return this;
        }

        public com.bytedance.sdk.component.d.i a(String str) {
            this.f19049c = str;
            return this;
        }

        public com.bytedance.sdk.component.d.i a(ImageView.ScaleType scaleType) {
            this.f19051e = scaleType;
            return this;
        }

        public com.bytedance.sdk.component.d.i a(Bitmap.Config config) {
            this.f19052f = config;
            return this;
        }

        public com.bytedance.sdk.component.d.i a(int i2) {
            this.f19053g = i2;
            return this;
        }

        public com.bytedance.sdk.component.d.i b(int i2) {
            this.f19054h = i2;
            return this;
        }

        public com.bytedance.sdk.component.d.i a(t tVar) {
            this.i = tVar;
            return this;
        }

        public com.bytedance.sdk.component.d.i a(r rVar) {
            this.k = rVar;
            return this;
        }

        public com.bytedance.sdk.component.d.i a(boolean z) {
            this.m = z;
            return this;
        }

        public com.bytedance.sdk.component.d.i b(String str) {
            this.n = str;
            return this;
        }

        public h a(n nVar) {
            this.f19047a = nVar;
            return new c(this).s();
        }

        public h a(ImageView imageView) {
            this.f19048b = imageView;
            return new c(this).s();
        }
    }

    /* compiled from: ImageRequest */
    private class a implements n {
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public n f19037b;

        public a(n nVar) {
            this.f19037b = nVar;
        }

        public void a(final j jVar) {
            final ImageView imageView = (ImageView) c.this.k.get();
            if (imageView != null && c.this.j != t.RAW && a(imageView) && (jVar.b() instanceof Bitmap)) {
                final Bitmap bitmap = (Bitmap) jVar.b();
                c.this.r.post(new Runnable() {
                    public void run() {
                        imageView.setImageBitmap(bitmap);
                    }
                });
            }
            if (c.this.p == s.MAIN) {
                c.this.r.post(new Runnable() {
                    public void run() {
                        if (a.this.f19037b != null) {
                            a.this.f19037b.a(jVar);
                        }
                    }
                });
                return;
            }
            n nVar = this.f19037b;
            if (nVar != null) {
                nVar.a(jVar);
            }
        }

        private boolean a(ImageView imageView) {
            Object tag;
            if (imageView == null || (tag = imageView.getTag(1094453505)) == null || !tag.equals(c.this.f19029c)) {
                return false;
            }
            return true;
        }

        public void a(final int i, final String str, final Throwable th) {
            if (c.this.p == s.MAIN) {
                c.this.r.post(new Runnable() {
                    public void run() {
                        if (a.this.f19037b != null) {
                            a.this.f19037b.a(i, str, th);
                        }
                    }
                });
                return;
            }
            n nVar = this.f19037b;
            if (nVar != null) {
                nVar.a(i, str, th);
            }
        }
    }
}
