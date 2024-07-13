package com.bytedance.sdk.component.e;

import android.content.Context;
import com.bytedance.sdk.component.b.a.g;
import com.bytedance.sdk.component.b.a.i;
import com.bytedance.sdk.component.e.b.d;
import com.bytedance.sdk.component.e.c.b;
import com.bytedance.sdk.component.e.c.f;
import com.bytedance.sdk.component.e.d.b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: NetClient */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private i f19111a;

    /* renamed from: b  reason: collision with root package name */
    private f f19112b;

    /* renamed from: c  reason: collision with root package name */
    private int f19113c;

    private a(C0232a aVar) {
        i.a b2 = new i.a().a((long) aVar.f19114a, TimeUnit.MILLISECONDS).c((long) aVar.f19116c, TimeUnit.MILLISECONDS).b((long) aVar.f19115b, TimeUnit.MILLISECONDS);
        if (aVar.f19117d) {
            f fVar = new f();
            this.f19112b = fVar;
            b2.a(fVar);
        }
        if (aVar.f19118e != null && aVar.f19118e.size() > 0) {
            for (g a2 : aVar.f19118e) {
                b2.a(a2);
            }
        }
        this.f19111a = b2.a();
    }

    public void a(Context context, boolean z, boolean z2, b bVar) {
        if (context == null) {
            throw new IllegalArgumentException("tryInitAdTTNet context is null");
        } else if (bVar != null) {
            int a2 = bVar.a();
            this.f19113c = a2;
            f fVar = this.f19112b;
            if (fVar != null) {
                fVar.a(a2);
            }
            com.bytedance.sdk.component.e.c.g.a().a(this.f19113c).a(z2);
            com.bytedance.sdk.component.e.c.g.a().a(this.f19113c).a(bVar);
            com.bytedance.sdk.component.e.c.g.a().a(this.f19113c).a(context, com.bytedance.sdk.component.e.d.f.b(context));
            if (com.bytedance.sdk.component.e.d.f.a(context) || (!com.bytedance.sdk.component.e.d.f.b(context) && z)) {
                com.bytedance.sdk.component.e.c.g.a().a(this.f19113c, context).d();
                com.bytedance.sdk.component.e.c.g.a().a(this.f19113c, context).a();
            }
            if (com.bytedance.sdk.component.e.d.f.b(context)) {
                com.bytedance.sdk.component.e.c.g.a().a(this.f19113c, context).d();
                com.bytedance.sdk.component.e.c.g.a().a(this.f19113c, context).a();
            }
        } else {
            throw new IllegalArgumentException("tryInitAdTTNet ITTAdNetDepend is null");
        }
    }

    public static void a() {
        com.bytedance.sdk.component.e.d.b.a(b.a.DEBUG);
    }

    public d b() {
        return new d(this.f19111a);
    }

    public com.bytedance.sdk.component.e.b.b c() {
        return new com.bytedance.sdk.component.e.b.b(this.f19111a);
    }

    public com.bytedance.sdk.component.e.b.a d() {
        return new com.bytedance.sdk.component.e.b.a(this.f19111a);
    }

    public i e() {
        return this.f19111a;
    }

    /* renamed from: com.bytedance.sdk.component.e.a$a  reason: collision with other inner class name */
    /* compiled from: NetClient */
    public static final class C0232a {

        /* renamed from: a  reason: collision with root package name */
        int f19114a = 10000;

        /* renamed from: b  reason: collision with root package name */
        int f19115b = 10000;

        /* renamed from: c  reason: collision with root package name */
        int f19116c = 10000;

        /* renamed from: d  reason: collision with root package name */
        boolean f19117d = true;

        /* renamed from: e  reason: collision with root package name */
        final List<g> f19118e = new ArrayList();

        public C0232a a(long j, TimeUnit timeUnit) {
            this.f19114a = a("timeout", j, timeUnit);
            return this;
        }

        public C0232a b(long j, TimeUnit timeUnit) {
            this.f19115b = a("timeout", j, timeUnit);
            return this;
        }

        public C0232a c(long j, TimeUnit timeUnit) {
            this.f19116c = a("timeout", j, timeUnit);
            return this;
        }

        public C0232a a(boolean z) {
            this.f19117d = z;
            return this;
        }

        private static int a(String str, long j, TimeUnit timeUnit) {
            int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            if (i < 0) {
                throw new IllegalArgumentException(str + " < 0");
            } else if (timeUnit != null) {
                long millis = timeUnit.toMillis(j);
                if (millis > 2147483647L) {
                    throw new IllegalArgumentException(str + " too large.");
                } else if (millis != 0 || i <= 0) {
                    return (int) millis;
                } else {
                    throw new IllegalArgumentException(str + " too small.");
                }
            } else {
                throw new NullPointerException("unit == null");
            }
        }

        public a a() {
            return new a(this);
        }
    }
}
