package com.applovin.exoplayer2.k;

import android.content.Context;
import android.net.Uri;
import com.applovin.exoplayer2.k.i;
import com.applovin.exoplayer2.k.q;
import com.applovin.exoplayer2.l.ai;
import com.applovin.sdk.AppLovinEventTypes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class o implements i {

    /* renamed from: a  reason: collision with root package name */
    private final Context f13407a;

    /* renamed from: b  reason: collision with root package name */
    private final List<aa> f13408b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final i f13409c;

    /* renamed from: d  reason: collision with root package name */
    private i f13410d;

    /* renamed from: e  reason: collision with root package name */
    private i f13411e;

    /* renamed from: f  reason: collision with root package name */
    private i f13412f;

    /* renamed from: g  reason: collision with root package name */
    private i f13413g;

    /* renamed from: h  reason: collision with root package name */
    private i f13414h;
    private i i;
    private i j;
    private i k;

    public static final class a implements i.a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f13415a;

        /* renamed from: b  reason: collision with root package name */
        private final i.a f13416b;

        /* renamed from: c  reason: collision with root package name */
        private aa f13417c;

        public a(Context context) {
            this(context, new q.a());
        }

        public a(Context context, i.a aVar) {
            this.f13415a = context.getApplicationContext();
            this.f13416b = aVar;
        }

        /* renamed from: b */
        public o a() {
            o oVar = new o(this.f13415a, this.f13416b.a());
            aa aaVar = this.f13417c;
            if (aaVar != null) {
                oVar.a(aaVar);
            }
            return oVar;
        }
    }

    public o(Context context, i iVar) {
        this.f13407a = context.getApplicationContext();
        this.f13409c = (i) com.applovin.exoplayer2.l.a.b(iVar);
    }

    private void a(i iVar) {
        for (int i2 = 0; i2 < this.f13408b.size(); i2++) {
            iVar.a(this.f13408b.get(i2));
        }
    }

    private void a(i iVar, aa aaVar) {
        if (iVar != null) {
            iVar.a(aaVar);
        }
    }

    private i d() {
        if (this.f13414h == null) {
            ab abVar = new ab();
            this.f13414h = abVar;
            a((i) abVar);
        }
        return this.f13414h;
    }

    private i e() {
        if (this.f13410d == null) {
            s sVar = new s();
            this.f13410d = sVar;
            a((i) sVar);
        }
        return this.f13410d;
    }

    private i f() {
        if (this.f13411e == null) {
            c cVar = new c(this.f13407a);
            this.f13411e = cVar;
            a((i) cVar);
        }
        return this.f13411e;
    }

    private i g() {
        if (this.f13412f == null) {
            f fVar = new f(this.f13407a);
            this.f13412f = fVar;
            a((i) fVar);
        }
        return this.f13412f;
    }

    private i h() {
        if (this.f13413g == null) {
            try {
                i iVar = (i) Class.forName("com.applovin.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                this.f13413g = iVar;
                a(iVar);
            } catch (ClassNotFoundException unused) {
                com.applovin.exoplayer2.l.q.c("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e2) {
                throw new RuntimeException("Error instantiating RTMP extension", e2);
            }
            if (this.f13413g == null) {
                this.f13413g = this.f13409c;
            }
        }
        return this.f13413g;
    }

    private i i() {
        if (this.i == null) {
            h hVar = new h();
            this.i = hVar;
            a((i) hVar);
        }
        return this.i;
    }

    private i j() {
        if (this.j == null) {
            x xVar = new x(this.f13407a);
            this.j = xVar;
            a((i) xVar);
        }
        return this.j;
    }

    public int a(byte[] bArr, int i2, int i3) throws IOException {
        return ((i) com.applovin.exoplayer2.l.a.b(this.k)).a(bArr, i2, i3);
    }

    public long a(l lVar) throws IOException {
        i iVar;
        com.applovin.exoplayer2.l.a.b(this.k == null);
        String scheme = lVar.f13370a.getScheme();
        if (ai.a(lVar.f13370a)) {
            String path = lVar.f13370a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                iVar = e();
                this.k = iVar;
                return this.k.a(lVar);
            }
        } else if (!"asset".equals(scheme)) {
            iVar = AppLovinEventTypes.USER_VIEWED_CONTENT.equals(scheme) ? g() : "rtmp".equals(scheme) ? h() : "udp".equals(scheme) ? d() : "data".equals(scheme) ? i() : ("rawresource".equals(scheme) || "android.resource".equals(scheme)) ? j() : this.f13409c;
            this.k = iVar;
            return this.k.a(lVar);
        }
        iVar = f();
        this.k = iVar;
        return this.k.a(lVar);
    }

    public Uri a() {
        i iVar = this.k;
        if (iVar == null) {
            return null;
        }
        return iVar.a();
    }

    public void a(aa aaVar) {
        com.applovin.exoplayer2.l.a.b(aaVar);
        this.f13409c.a(aaVar);
        this.f13408b.add(aaVar);
        a(this.f13410d, aaVar);
        a(this.f13411e, aaVar);
        a(this.f13412f, aaVar);
        a(this.f13413g, aaVar);
        a(this.f13414h, aaVar);
        a(this.i, aaVar);
        a(this.j, aaVar);
    }

    public Map<String, List<String>> b() {
        i iVar = this.k;
        return iVar == null ? Collections.emptyMap() : iVar.b();
    }

    public void c() throws IOException {
        i iVar = this.k;
        if (iVar != null) {
            try {
                iVar.c();
            } finally {
                this.k = null;
            }
        }
    }
}
