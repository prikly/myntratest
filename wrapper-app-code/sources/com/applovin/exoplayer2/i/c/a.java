package com.applovin.exoplayer2.i.c;

import android.graphics.Bitmap;
import com.applovin.exoplayer2.i.a;
import com.applovin.exoplayer2.i.d;
import com.applovin.exoplayer2.i.f;
import com.applovin.exoplayer2.i.h;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;
import kotlin.KotlinVersion;

public final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    private final y f13033a = new y();

    /* renamed from: b  reason: collision with root package name */
    private final y f13034b = new y();

    /* renamed from: c  reason: collision with root package name */
    private final C0130a f13035c = new C0130a();

    /* renamed from: d  reason: collision with root package name */
    private Inflater f13036d;

    /* renamed from: com.applovin.exoplayer2.i.c.a$a  reason: collision with other inner class name */
    private static final class C0130a {

        /* renamed from: a  reason: collision with root package name */
        private final y f13037a = new y();

        /* renamed from: b  reason: collision with root package name */
        private final int[] f13038b = new int[256];

        /* renamed from: c  reason: collision with root package name */
        private boolean f13039c;

        /* renamed from: d  reason: collision with root package name */
        private int f13040d;

        /* renamed from: e  reason: collision with root package name */
        private int f13041e;

        /* renamed from: f  reason: collision with root package name */
        private int f13042f;

        /* renamed from: g  reason: collision with root package name */
        private int f13043g;

        /* renamed from: h  reason: collision with root package name */
        private int f13044h;
        private int i;

        /* access modifiers changed from: private */
        public void a(y yVar, int i2) {
            if (i2 % 5 == 2) {
                yVar.e(2);
                Arrays.fill(this.f13038b, 0);
                int i3 = i2 / 5;
                int i4 = 0;
                while (i4 < i3) {
                    int h2 = yVar.h();
                    int h3 = yVar.h();
                    int h4 = yVar.h();
                    int h5 = yVar.h();
                    int h6 = yVar.h();
                    double d2 = (double) h3;
                    double d3 = (double) (h4 - 128);
                    int i5 = i4;
                    double d4 = (double) (h5 - 128);
                    int[] iArr = this.f13038b;
                    int a2 = ai.a((int) ((d2 - (0.34414d * d4)) - (d3 * 0.71414d)), 0, (int) KotlinVersion.MAX_COMPONENT_VALUE) << 8;
                    iArr[h2] = ai.a((int) (d2 + (d4 * 1.772d)), 0, (int) KotlinVersion.MAX_COMPONENT_VALUE) | a2 | (h6 << 24) | (ai.a((int) ((1.402d * d3) + d2), 0, (int) KotlinVersion.MAX_COMPONENT_VALUE) << 16);
                    i4 = i5 + 1;
                }
                this.f13039c = true;
            }
        }

        /* access modifiers changed from: private */
        public void b(y yVar, int i2) {
            int m;
            if (i2 >= 4) {
                yVar.e(3);
                int i3 = i2 - 4;
                if ((yVar.h() & 128) != 0) {
                    if (i3 >= 7 && (m = yVar.m()) >= 4) {
                        this.f13044h = yVar.i();
                        this.i = yVar.i();
                        this.f13037a.a(m - 4);
                        i3 -= 7;
                    } else {
                        return;
                    }
                }
                int c2 = this.f13037a.c();
                int b2 = this.f13037a.b();
                if (c2 < b2 && i3 > 0) {
                    int min = Math.min(i3, b2 - c2);
                    yVar.a(this.f13037a.d(), c2, min);
                    this.f13037a.d(c2 + min);
                }
            }
        }

        /* access modifiers changed from: private */
        public void c(y yVar, int i2) {
            if (i2 >= 19) {
                this.f13040d = yVar.i();
                this.f13041e = yVar.i();
                yVar.e(11);
                this.f13042f = yVar.i();
                this.f13043g = yVar.i();
            }
        }

        public com.applovin.exoplayer2.i.a a() {
            int h2;
            if (this.f13040d == 0 || this.f13041e == 0 || this.f13044h == 0 || this.i == 0 || this.f13037a.b() == 0 || this.f13037a.c() != this.f13037a.b() || !this.f13039c) {
                return null;
            }
            this.f13037a.d(0);
            int i2 = this.f13044h * this.i;
            int[] iArr = new int[i2];
            int i3 = 0;
            while (i3 < i2) {
                int h3 = this.f13037a.h();
                if (h3 != 0) {
                    h2 = i3 + 1;
                    iArr[i3] = this.f13038b[h3];
                } else {
                    int h4 = this.f13037a.h();
                    if (h4 != 0) {
                        h2 = ((h4 & 64) == 0 ? h4 & 63 : ((h4 & 63) << 8) | this.f13037a.h()) + i3;
                        Arrays.fill(iArr, i3, h2, (h4 & 128) == 0 ? 0 : this.f13038b[this.f13037a.h()]);
                    }
                }
                i3 = h2;
            }
            return new a.C0125a().a(Bitmap.createBitmap(iArr, this.f13044h, this.i, Bitmap.Config.ARGB_8888)).a(((float) this.f13042f) / ((float) this.f13040d)).b(0).a(((float) this.f13043g) / ((float) this.f13041e), 0).a(0).b(((float) this.f13044h) / ((float) this.f13040d)).c(((float) this.i) / ((float) this.f13041e)).e();
        }

        public void b() {
            this.f13040d = 0;
            this.f13041e = 0;
            this.f13042f = 0;
            this.f13043g = 0;
            this.f13044h = 0;
            this.i = 0;
            this.f13037a.a(0);
            this.f13039c = false;
        }
    }

    public a() {
        super("PgsDecoder");
    }

    private static com.applovin.exoplayer2.i.a a(y yVar, C0130a aVar) {
        int b2 = yVar.b();
        int h2 = yVar.h();
        int i = yVar.i();
        int c2 = yVar.c() + i;
        com.applovin.exoplayer2.i.a aVar2 = null;
        if (c2 > b2) {
            yVar.d(b2);
            return null;
        }
        if (h2 != 128) {
            switch (h2) {
                case 20:
                    aVar.a(yVar, i);
                    break;
                case 21:
                    aVar.b(yVar, i);
                    break;
                case 22:
                    aVar.c(yVar, i);
                    break;
            }
        } else {
            aVar2 = aVar.a();
            aVar.b();
        }
        yVar.d(c2);
        return aVar2;
    }

    private void a(y yVar) {
        if (yVar.a() > 0 && yVar.f() == 120) {
            if (this.f13036d == null) {
                this.f13036d = new Inflater();
            }
            if (ai.a(yVar, this.f13034b, this.f13036d)) {
                yVar.a(this.f13034b.d(), this.f13034b.b());
            }
        }
    }

    /* access modifiers changed from: protected */
    public f a(byte[] bArr, int i, boolean z) throws h {
        this.f13033a.a(bArr, i);
        a(this.f13033a);
        this.f13035c.b();
        ArrayList arrayList = new ArrayList();
        while (this.f13033a.a() >= 3) {
            com.applovin.exoplayer2.i.a a2 = a(this.f13033a, this.f13035c);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return new b(Collections.unmodifiableList(arrayList));
    }
}
