package com.applovin.exoplayer2.e.c;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.b.a;
import com.applovin.exoplayer2.e.c.d;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;
import java.util.Collections;
import java.util.List;

final class a extends d {

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f11851b = {5512, 11025, 22050, 44100};

    /* renamed from: c  reason: collision with root package name */
    private boolean f11852c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f11853d;

    /* renamed from: e  reason: collision with root package name */
    private int f11854e;

    public a(x xVar) {
        super(xVar);
    }

    /* access modifiers changed from: protected */
    public boolean a(y yVar) throws d.a {
        v.a l;
        if (!this.f11852c) {
            int h2 = yVar.h();
            int i = (h2 >> 4) & 15;
            this.f11854e = i;
            if (i == 2) {
                l = new v.a().f("audio/mpeg").k(1).l(f11851b[(h2 >> 2) & 3]);
            } else if (i == 7 || i == 8) {
                l = new v.a().f(this.f11854e == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").k(1).l(8000);
            } else {
                if (i != 10) {
                    throw new d.a("Audio format not supported: " + this.f11854e);
                }
                this.f11852c = true;
            }
            this.f11866a.a(l.a());
            this.f11853d = true;
            this.f11852c = true;
        } else {
            yVar.e(1);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean a(y yVar, long j) throws ai {
        if (this.f11854e == 2) {
            int a2 = yVar.a();
            this.f11866a.a(yVar, a2);
            this.f11866a.a(j, 1, a2, 0, (x.a) null);
            return true;
        }
        int h2 = yVar.h();
        if (h2 == 0 && !this.f11853d) {
            int a3 = yVar.a();
            byte[] bArr = new byte[a3];
            yVar.a(bArr, 0, a3);
            a.C0106a a4 = com.applovin.exoplayer2.b.a.a(bArr);
            this.f11866a.a(new v.a().f("audio/mp4a-latm").d(a4.f11192c).k(a4.f11191b).l(a4.f11190a).a((List<byte[]>) Collections.singletonList(bArr)).a());
            this.f11853d = true;
            return false;
        } else if (this.f11854e == 10 && h2 != 1) {
            return false;
        } else {
            int a5 = yVar.a();
            this.f11866a.a(yVar, a5);
            this.f11866a.a(j, 1, a5, 0, (x.a) null);
            return true;
        }
    }
}
