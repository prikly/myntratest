package com.applovin.exoplayer2.c;

import android.media.MediaCodec;
import com.applovin.exoplayer2.l.ai;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f11400a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f11401b;

    /* renamed from: c  reason: collision with root package name */
    public int f11402c;

    /* renamed from: d  reason: collision with root package name */
    public int[] f11403d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f11404e;

    /* renamed from: f  reason: collision with root package name */
    public int f11405f;

    /* renamed from: g  reason: collision with root package name */
    public int f11406g;

    /* renamed from: h  reason: collision with root package name */
    public int f11407h;
    private final MediaCodec.CryptoInfo i = new MediaCodec.CryptoInfo();
    private final a j;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final MediaCodec.CryptoInfo f11408a;

        /* renamed from: b  reason: collision with root package name */
        private final MediaCodec.CryptoInfo.Pattern f11409b;

        private a(MediaCodec.CryptoInfo cryptoInfo) {
            this.f11408a = cryptoInfo;
            this.f11409b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }

        /* access modifiers changed from: private */
        public void a(int i, int i2) {
            this.f11409b.set(i, i2);
            this.f11408a.setPattern(this.f11409b);
        }
    }

    public c() {
        this.j = ai.f13525a >= 24 ? new a(this.i) : null;
    }

    public MediaCodec.CryptoInfo a() {
        return this.i;
    }

    public void a(int i2) {
        if (i2 != 0) {
            if (this.f11403d == null) {
                int[] iArr = new int[1];
                this.f11403d = iArr;
                this.i.numBytesOfClearData = iArr;
            }
            int[] iArr2 = this.f11403d;
            iArr2[0] = iArr2[0] + i2;
        }
    }

    public void a(int i2, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i3, int i4, int i5) {
        this.f11405f = i2;
        this.f11403d = iArr;
        this.f11404e = iArr2;
        this.f11401b = bArr;
        this.f11400a = bArr2;
        this.f11402c = i3;
        this.f11406g = i4;
        this.f11407h = i5;
        this.i.numSubSamples = i2;
        this.i.numBytesOfClearData = iArr;
        this.i.numBytesOfEncryptedData = iArr2;
        this.i.key = bArr;
        this.i.iv = bArr2;
        this.i.mode = i3;
        if (ai.f13525a >= 24) {
            ((a) com.applovin.exoplayer2.l.a.b(this.j)).a(i4, i5);
        }
    }
}
