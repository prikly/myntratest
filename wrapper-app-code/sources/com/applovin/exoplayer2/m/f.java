package com.applovin.exoplayer2.m;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.l.e;
import com.applovin.exoplayer2.l.v;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.l.z;
import java.util.Collections;
import java.util.List;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final List<byte[]> f13705a;

    /* renamed from: b  reason: collision with root package name */
    public final int f13706b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13707c;

    private f(List<byte[]> list, int i, String str) {
        this.f13705a = list;
        this.f13706b = i;
        this.f13707c = str;
    }

    public static f a(y yVar) throws ai {
        y yVar2 = yVar;
        try {
            yVar2.e(21);
            int h2 = yVar.h() & 3;
            int h3 = yVar.h();
            int c2 = yVar.c();
            int i = 0;
            for (int i2 = 0; i2 < h3; i2++) {
                yVar2.e(1);
                int i3 = yVar.i();
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = yVar.i();
                    i += i5 + 4;
                    yVar2.e(i5);
                }
            }
            yVar2.d(c2);
            byte[] bArr = new byte[i];
            String str = null;
            int i6 = 0;
            for (int i7 = 0; i7 < h3; i7++) {
                int h4 = yVar.h() & 127;
                int i8 = yVar.i();
                for (int i9 = 0; i9 < i8; i9++) {
                    int i10 = yVar.i();
                    System.arraycopy(v.f13581a, 0, bArr, i6, v.f13581a.length);
                    int length = i6 + v.f13581a.length;
                    System.arraycopy(yVar.d(), yVar.c(), bArr, length, i10);
                    if (h4 == 33 && i9 == 0) {
                        str = e.a(new z(bArr, length, length + i10));
                    }
                    i6 = length + i10;
                    yVar2.e(i10);
                }
            }
            return new f(i == 0 ? null : Collections.singletonList(bArr), h2 + 1, str);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw ai.b("Error parsing HEVC config", e2);
        }
    }
}
