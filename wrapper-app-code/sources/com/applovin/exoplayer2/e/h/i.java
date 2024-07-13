package com.applovin.exoplayer2.e.h;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.e.h.h;
import com.applovin.exoplayer2.e.z;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.KotlinVersion;

final class i extends h {

    /* renamed from: a  reason: collision with root package name */
    private a f12136a;

    /* renamed from: b  reason: collision with root package name */
    private int f12137b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f12138c;

    /* renamed from: d  reason: collision with root package name */
    private z.d f12139d;

    /* renamed from: e  reason: collision with root package name */
    private z.b f12140e;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final z.d f12141a;

        /* renamed from: b  reason: collision with root package name */
        public final z.b f12142b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f12143c;

        /* renamed from: d  reason: collision with root package name */
        public final z.c[] f12144d;

        /* renamed from: e  reason: collision with root package name */
        public final int f12145e;

        public a(z.d dVar, z.b bVar, byte[] bArr, z.c[] cVarArr, int i) {
            this.f12141a = dVar;
            this.f12142b = bVar;
            this.f12143c = bArr;
            this.f12144d = cVarArr;
            this.f12145e = i;
        }
    }

    i() {
    }

    static int a(byte b2, int i, int i2) {
        return (b2 >> i2) & (KotlinVersion.MAX_COMPONENT_VALUE >>> (8 - i));
    }

    private static int a(byte b2, a aVar) {
        return !aVar.f12144d[a(b2, aVar.f12145e, 1)].f12475a ? aVar.f12141a.f12485g : aVar.f12141a.f12486h;
    }

    static void a(y yVar, long j) {
        if (yVar.e() < yVar.b() + 4) {
            yVar.a(Arrays.copyOf(yVar.d(), yVar.b() + 4));
        } else {
            yVar.c(yVar.b() + 4);
        }
        byte[] d2 = yVar.d();
        d2[yVar.b() - 4] = (byte) ((int) (j & 255));
        d2[yVar.b() - 3] = (byte) ((int) ((j >>> 8) & 255));
        d2[yVar.b() - 2] = (byte) ((int) ((j >>> 16) & 255));
        d2[yVar.b() - 1] = (byte) ((int) ((j >>> 24) & 255));
    }

    public static boolean a(y yVar) {
        try {
            return z.a(1, yVar, true);
        } catch (ai unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public void a(boolean z) {
        super.a(z);
        if (z) {
            this.f12136a = null;
            this.f12139d = null;
            this.f12140e = null;
        }
        this.f12137b = 0;
        this.f12138c = false;
    }

    /* access modifiers changed from: protected */
    public boolean a(y yVar, long j, h.a aVar) throws IOException {
        if (this.f12136a != null) {
            com.applovin.exoplayer2.l.a.b(aVar.f12134a);
            return false;
        }
        a c2 = c(yVar);
        this.f12136a = c2;
        if (c2 == null) {
            return true;
        }
        z.d dVar = c2.f12141a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(dVar.j);
        arrayList.add(c2.f12143c);
        aVar.f12134a = new v.a().f("audio/vorbis").d(dVar.f12483e).e(dVar.f12482d).k(dVar.f12480b).l(dVar.f12481c).a((List<byte[]>) arrayList).a();
        return true;
    }

    /* access modifiers changed from: protected */
    public long b(y yVar) {
        int i = 0;
        if ((yVar.d()[0] & 1) == 1) {
            return -1;
        }
        int a2 = a(yVar.d()[0], (a) com.applovin.exoplayer2.l.a.a(this.f12136a));
        if (this.f12138c) {
            i = (this.f12137b + a2) / 4;
        }
        long j = (long) i;
        a(yVar, j);
        this.f12138c = true;
        this.f12137b = a2;
        return j;
    }

    /* access modifiers changed from: package-private */
    public a c(y yVar) throws IOException {
        z.d dVar = this.f12139d;
        if (dVar == null) {
            this.f12139d = z.a(yVar);
            return null;
        }
        z.b bVar = this.f12140e;
        if (bVar == null) {
            this.f12140e = z.b(yVar);
            return null;
        }
        byte[] bArr = new byte[yVar.b()];
        System.arraycopy(yVar.d(), 0, bArr, 0, yVar.b());
        z.c[] a2 = z.a(yVar, dVar.f12480b);
        return new a(dVar, bVar, bArr, a2, z.a(a2.length - 1));
    }

    /* access modifiers changed from: protected */
    public void c(long j) {
        super.c(j);
        int i = 0;
        this.f12138c = j != 0;
        z.d dVar = this.f12139d;
        if (dVar != null) {
            i = dVar.f12485g;
        }
        this.f12137b = i;
    }
}
