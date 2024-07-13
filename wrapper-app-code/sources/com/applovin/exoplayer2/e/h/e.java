package com.applovin.exoplayer2.e.h;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.e.k;
import com.applovin.exoplayer2.l.a;
import com.applovin.exoplayer2.l.y;
import java.io.IOException;
import kotlin.KotlinVersion;

final class e {

    /* renamed from: a  reason: collision with root package name */
    public int f12116a;

    /* renamed from: b  reason: collision with root package name */
    public int f12117b;

    /* renamed from: c  reason: collision with root package name */
    public long f12118c;

    /* renamed from: d  reason: collision with root package name */
    public long f12119d;

    /* renamed from: e  reason: collision with root package name */
    public long f12120e;

    /* renamed from: f  reason: collision with root package name */
    public long f12121f;

    /* renamed from: g  reason: collision with root package name */
    public int f12122g;

    /* renamed from: h  reason: collision with root package name */
    public int f12123h;
    public int i;
    public final int[] j = new int[KotlinVersion.MAX_COMPONENT_VALUE];
    private final y k = new y((int) KotlinVersion.MAX_COMPONENT_VALUE);

    e() {
    }

    public void a() {
        this.f12116a = 0;
        this.f12117b = 0;
        this.f12118c = 0;
        this.f12119d = 0;
        this.f12120e = 0;
        this.f12121f = 0;
        this.f12122g = 0;
        this.f12123h = 0;
        this.i = 0;
    }

    public boolean a(i iVar) throws IOException {
        return a(iVar, -1);
    }

    public boolean a(i iVar, long j2) throws IOException {
        int i2;
        a.a(iVar.c() == iVar.b());
        this.k.a(4);
        while (true) {
            i2 = (j2 > -1 ? 1 : (j2 == -1 ? 0 : -1));
            if ((i2 == 0 || iVar.c() + 4 < j2) && k.a(iVar, this.k.d(), 0, 4, true)) {
                this.k.d(0);
                if (this.k.o() == 1332176723) {
                    iVar.a();
                    return true;
                }
                iVar.b(1);
            }
        }
        do {
            if ((i2 != 0 && iVar.c() >= j2) || iVar.a(1) == -1) {
                return false;
            }
            break;
        } while (iVar.a(1) == -1);
        return false;
    }

    public boolean a(i iVar, boolean z) throws IOException {
        a();
        this.k.a(27);
        if (!k.a(iVar, this.k.d(), 0, 27, z) || this.k.o() != 1332176723) {
            return false;
        }
        int h2 = this.k.h();
        this.f12116a = h2;
        if (h2 == 0) {
            this.f12117b = this.k.h();
            this.f12118c = this.k.t();
            this.f12119d = this.k.p();
            this.f12120e = this.k.p();
            this.f12121f = this.k.p();
            int h3 = this.k.h();
            this.f12122g = h3;
            this.f12123h = h3 + 27;
            this.k.a(h3);
            if (!k.a(iVar, this.k.d(), 0, this.f12122g, z)) {
                return false;
            }
            for (int i2 = 0; i2 < this.f12122g; i2++) {
                this.j[i2] = this.k.h();
                this.i += this.j[i2];
            }
            return true;
        } else if (z) {
            return false;
        } else {
            throw ai.a("unsupported bit stream revision");
        }
    }
}
