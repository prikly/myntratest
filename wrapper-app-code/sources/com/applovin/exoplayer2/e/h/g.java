package com.applovin.exoplayer2.e.h;

import com.applovin.exoplayer2.b.s;
import com.applovin.exoplayer2.e.h.h;
import com.applovin.exoplayer2.l.a;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;

final class g extends h {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f12124a = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: b  reason: collision with root package name */
    private boolean f12125b;

    g() {
    }

    private long a(byte[] bArr) {
        byte b2 = bArr[0] & 255;
        byte b3 = b2 & 3;
        byte b4 = 2;
        if (b3 == 0) {
            b4 = 1;
        } else if (!(b3 == 1 || b3 == 2)) {
            b4 = bArr[1] & 63;
        }
        int i = b2 >> 3;
        int i2 = i & 3;
        return ((long) b4) * ((long) (i >= 16 ? IronSourceConstants.IS_INSTANCE_NOT_FOUND << i2 : i >= 12 ? 10000 << (i2 & 1) : i2 == 3 ? 60000 : 10000 << i2));
    }

    public static boolean a(y yVar) {
        int a2 = yVar.a();
        byte[] bArr = f12124a;
        if (a2 < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        yVar.a(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, f12124a);
    }

    /* access modifiers changed from: protected */
    public void a(boolean z) {
        super.a(z);
        if (z) {
            this.f12125b = false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean a(y yVar, long j, h.a aVar) {
        boolean z = true;
        if (!this.f12125b) {
            byte[] copyOf = Arrays.copyOf(yVar.d(), yVar.b());
            int a2 = s.a(copyOf);
            aVar.f12134a = new v.a().f("audio/opus").k(a2).l(48000).a(s.b(copyOf)).a();
            this.f12125b = true;
            return true;
        }
        a.b(aVar.f12134a);
        if (yVar.q() != 1332770163) {
            z = false;
        }
        yVar.d(0);
        return z;
    }

    /* access modifiers changed from: protected */
    public long b(y yVar) {
        return b(a(yVar.d()));
    }
}
