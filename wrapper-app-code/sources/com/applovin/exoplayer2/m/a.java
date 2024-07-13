package com.applovin.exoplayer2.m;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.l.e;
import com.applovin.exoplayer2.l.v;
import com.applovin.exoplayer2.l.y;
import java.util.ArrayList;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final List<byte[]> f13621a;

    /* renamed from: b  reason: collision with root package name */
    public final int f13622b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13623c;

    /* renamed from: d  reason: collision with root package name */
    public final int f13624d;

    /* renamed from: e  reason: collision with root package name */
    public final float f13625e;

    /* renamed from: f  reason: collision with root package name */
    public final String f13626f;

    private a(List<byte[]> list, int i, int i2, int i3, float f2, String str) {
        this.f13621a = list;
        this.f13622b = i;
        this.f13623c = i2;
        this.f13624d = i3;
        this.f13625e = f2;
        this.f13626f = str;
    }

    public static a a(y yVar) throws ai {
        String str;
        float f2;
        int i;
        try {
            yVar.e(4);
            int h2 = (yVar.h() & 3) + 1;
            if (h2 != 3) {
                ArrayList arrayList = new ArrayList();
                int h3 = yVar.h() & 31;
                for (int i2 = 0; i2 < h3; i2++) {
                    arrayList.add(b(yVar));
                }
                int h4 = yVar.h();
                for (int i3 = 0; i3 < h4; i3++) {
                    arrayList.add(b(yVar));
                }
                int i4 = -1;
                if (h3 > 0) {
                    v.b a2 = v.a((byte[]) arrayList.get(0), h2, ((byte[]) arrayList.get(0)).length);
                    int i5 = a2.f13592e;
                    int i6 = a2.f13593f;
                    float f3 = a2.f13594g;
                    str = e.a(a2.f13588a, a2.f13589b, a2.f13590c);
                    i4 = i5;
                    i = i6;
                    f2 = f3;
                } else {
                    str = null;
                    i = -1;
                    f2 = 1.0f;
                }
                return new a(arrayList, h2, i4, i, f2, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw ai.b("Error parsing AVC config", e2);
        }
    }

    private static byte[] b(y yVar) {
        int i = yVar.i();
        int c2 = yVar.c();
        yVar.e(i);
        return e.a(yVar.d(), c2, i);
    }
}
