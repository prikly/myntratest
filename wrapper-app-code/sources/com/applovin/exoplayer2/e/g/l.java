package com.applovin.exoplayer2.e.g;

import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.l.a;
import com.applovin.exoplayer2.l.q;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f12071a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12072b;

    /* renamed from: c  reason: collision with root package name */
    public final x.a f12073c;

    /* renamed from: d  reason: collision with root package name */
    public final int f12074d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f12075e;

    public l(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        boolean z2 = true;
        a.a((bArr2 != null ? false : z2) ^ (i == 0));
        this.f12071a = z;
        this.f12072b = str;
        this.f12074d = i;
        this.f12075e = bArr2;
        this.f12073c = new x.a(a(str), bArr, i2, i3);
    }

    private static int a(String str) {
        if (str == null) {
            return 1;
        }
        char c2 = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    c2 = 2;
                    break;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    c2 = 3;
                    break;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    c2 = 0;
                    break;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    c2 = 1;
                    break;
                }
                break;
        }
        if (c2 == 0 || c2 == 1) {
            return 1;
        }
        if (c2 == 2 || c2 == 3) {
            return 2;
        }
        q.c("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
        return 1;
    }
}
