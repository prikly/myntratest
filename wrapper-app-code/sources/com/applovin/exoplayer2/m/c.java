package com.applovin.exoplayer2.m;

import com.applovin.exoplayer2.l.y;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final int f13678a;

    /* renamed from: b  reason: collision with root package name */
    public final int f13679b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13680c;

    private c(int i, int i2, String str) {
        this.f13678a = i;
        this.f13679b = i2;
        this.f13680c = str;
    }

    public static c a(y yVar) {
        String str;
        yVar.e(2);
        int h2 = yVar.h();
        int i = h2 >> 1;
        int h3 = ((yVar.h() >> 3) & 31) | ((h2 & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else if (i != 9) {
            return null;
        } else {
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str2 = ".0";
        sb.append(str2);
        sb.append(i);
        if (h3 >= 10) {
            str2 = ".";
        }
        sb.append(str2);
        sb.append(h3);
        return new c(i, h3, sb.toString());
    }
}
