package com.applovin.exoplayer2.h;

import android.net.Uri;
import com.applovin.exoplayer2.k.aa;
import com.applovin.exoplayer2.k.l;
import com.applovin.exoplayer2.l.y;
import java.io.IOException;
import java.util.List;
import java.util.Map;

final class i implements com.applovin.exoplayer2.k.i {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.exoplayer2.k.i f12789a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12790b;

    /* renamed from: c  reason: collision with root package name */
    private final a f12791c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f12792d;

    /* renamed from: e  reason: collision with root package name */
    private int f12793e;

    public interface a {
        void a(y yVar);
    }

    public i(com.applovin.exoplayer2.k.i iVar, int i, a aVar) {
        com.applovin.exoplayer2.l.a.a(i > 0);
        this.f12789a = iVar;
        this.f12790b = i;
        this.f12791c = aVar;
        this.f12792d = new byte[1];
        this.f12793e = i;
    }

    private boolean d() throws IOException {
        if (this.f12789a.a(this.f12792d, 0, 1) == -1) {
            return false;
        }
        int i = (this.f12792d[0] & 255) << 4;
        if (i == 0) {
            return true;
        }
        byte[] bArr = new byte[i];
        int i2 = i;
        int i3 = 0;
        while (i2 > 0) {
            int a2 = this.f12789a.a(bArr, i3, i2);
            if (a2 == -1) {
                return false;
            }
            i3 += a2;
            i2 -= a2;
        }
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        if (i > 0) {
            this.f12791c.a(new y(bArr, i));
        }
        return true;
    }

    public int a(byte[] bArr, int i, int i2) throws IOException {
        if (this.f12793e == 0) {
            if (!d()) {
                return -1;
            }
            this.f12793e = this.f12790b;
        }
        int a2 = this.f12789a.a(bArr, i, Math.min(this.f12793e, i2));
        if (a2 != -1) {
            this.f12793e -= a2;
        }
        return a2;
    }

    public long a(l lVar) {
        throw new UnsupportedOperationException();
    }

    public Uri a() {
        return this.f12789a.a();
    }

    public void a(aa aaVar) {
        com.applovin.exoplayer2.l.a.b(aaVar);
        this.f12789a.a(aaVar);
    }

    public Map<String, List<String>> b() {
        return this.f12789a.b();
    }

    public void c() {
        throw new UnsupportedOperationException();
    }
}
