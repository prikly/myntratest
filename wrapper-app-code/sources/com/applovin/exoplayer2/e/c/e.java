package com.applovin.exoplayer2.e.c;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.e.c.d;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.l.v;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.m.a;
import com.applovin.exoplayer2.v;
import com.unity3d.services.core.device.MimeTypes;

final class e extends d {

    /* renamed from: b  reason: collision with root package name */
    private final y f11867b = new y(v.f13581a);

    /* renamed from: c  reason: collision with root package name */
    private final y f11868c = new y(4);

    /* renamed from: d  reason: collision with root package name */
    private int f11869d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f11870e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f11871f;

    /* renamed from: g  reason: collision with root package name */
    private int f11872g;

    public e(x xVar) {
        super(xVar);
    }

    /* access modifiers changed from: protected */
    public boolean a(y yVar) throws d.a {
        int h2 = yVar.h();
        int i = (h2 >> 4) & 15;
        int i2 = h2 & 15;
        if (i2 == 7) {
            this.f11872g = i;
            return i != 5;
        }
        throw new d.a("Video format not supported: " + i2);
    }

    /* access modifiers changed from: protected */
    public boolean a(y yVar, long j) throws ai {
        int h2 = yVar.h();
        long n = j + (((long) yVar.n()) * 1000);
        if (h2 == 0 && !this.f11870e) {
            y yVar2 = new y(new byte[yVar.a()]);
            yVar.a(yVar2.d(), 0, yVar.a());
            a a2 = a.a(yVar2);
            this.f11869d = a2.f13622b;
            this.f11866a.a(new v.a().f(MimeTypes.VIDEO_H264).d(a2.f13626f).g(a2.f13623c).h(a2.f13624d).b(a2.f13625e).a(a2.f13621a).a());
            this.f11870e = true;
            return false;
        } else if (h2 != 1 || !this.f11870e) {
            return false;
        } else {
            int i = this.f11872g == 1 ? 1 : 0;
            if (!this.f11871f && i == 0) {
                return false;
            }
            byte[] d2 = this.f11868c.d();
            d2[0] = 0;
            d2[1] = 0;
            d2[2] = 0;
            int i2 = 4 - this.f11869d;
            int i3 = 0;
            while (yVar.a() > 0) {
                yVar.a(this.f11868c.d(), i2, this.f11869d);
                this.f11868c.d(0);
                int w = this.f11868c.w();
                this.f11867b.d(0);
                this.f11866a.a(this.f11867b, 4);
                this.f11866a.a(yVar, w);
                i3 = i3 + 4 + w;
            }
            this.f11866a.a(n, i, i3, 0, (x.a) null);
            this.f11871f = true;
            return true;
        }
    }
}
