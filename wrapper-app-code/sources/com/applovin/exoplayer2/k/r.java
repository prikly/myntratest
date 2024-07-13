package com.applovin.exoplayer2.k;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.k.t;
import com.applovin.exoplayer2.k.v;
import com.applovin.exoplayer2.k.w;
import java.io.FileNotFoundException;
import java.io.IOException;

public class r implements v {

    /* renamed from: a  reason: collision with root package name */
    private final int f13436a;

    public r() {
        this(-1);
    }

    public r(int i) {
        this.f13436a = i;
    }

    public int a(int i) {
        int i2 = this.f13436a;
        return i2 == -1 ? i == 7 ? 6 : 3 : i2;
    }

    public long a(v.a aVar) {
        IOException iOException = aVar.f13455c;
        if ((iOException instanceof ai) || (iOException instanceof FileNotFoundException) || (iOException instanceof t.a) || (iOException instanceof w.g) || j.a(iOException)) {
            return -9223372036854775807L;
        }
        return (long) Math.min((aVar.f13456d - 1) * 1000, 5000);
    }

    public /* synthetic */ void a(long j) {
        v.CC.$default$a(this, j);
    }
}
