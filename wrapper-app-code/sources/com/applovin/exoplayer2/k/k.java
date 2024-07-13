package com.applovin.exoplayer2.k;

import com.applovin.exoplayer2.l.a;
import java.io.IOException;
import java.io.InputStream;

public final class k extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    private final i f13364a;

    /* renamed from: b  reason: collision with root package name */
    private final l f13365b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f13366c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f13367d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f13368e = false;

    /* renamed from: f  reason: collision with root package name */
    private long f13369f;

    public k(i iVar, l lVar) {
        this.f13364a = iVar;
        this.f13365b = lVar;
        this.f13366c = new byte[1];
    }

    private void a() throws IOException {
        if (!this.f13367d) {
            this.f13364a.a(this.f13365b);
            this.f13367d = true;
        }
    }

    public void close() throws IOException {
        if (!this.f13368e) {
            this.f13364a.c();
            this.f13368e = true;
        }
    }

    public int read() throws IOException {
        if (read(this.f13366c) == -1) {
            return -1;
        }
        return this.f13366c[0] & 255;
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        a.b(!this.f13368e);
        a();
        int a2 = this.f13364a.a(bArr, i, i2);
        if (a2 == -1) {
            return -1;
        }
        this.f13369f += (long) a2;
        return a2;
    }
}
