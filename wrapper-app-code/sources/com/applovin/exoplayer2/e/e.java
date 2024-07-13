package com.applovin.exoplayer2.e;

import com.applovin.exoplayer2.k.g;
import com.applovin.exoplayer2.l.ai;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

public final class e implements i {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f11902a = new byte[4096];

    /* renamed from: b  reason: collision with root package name */
    private final g f11903b;

    /* renamed from: c  reason: collision with root package name */
    private final long f11904c;

    /* renamed from: d  reason: collision with root package name */
    private long f11905d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f11906e = new byte[65536];

    /* renamed from: f  reason: collision with root package name */
    private int f11907f;

    /* renamed from: g  reason: collision with root package name */
    private int f11908g;

    public e(g gVar, long j, long j2) {
        this.f11903b = gVar;
        this.f11905d = j;
        this.f11904c = j2;
    }

    private int a(byte[] bArr, int i, int i2, int i3, boolean z) throws IOException {
        if (!Thread.interrupted()) {
            int a2 = this.f11903b.a(bArr, i + i3, i2 - i3);
            if (a2 != -1) {
                return i3 + a2;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedIOException();
    }

    private void d(int i) {
        int i2 = this.f11907f + i;
        byte[] bArr = this.f11906e;
        if (i2 > bArr.length) {
            this.f11906e = Arrays.copyOf(this.f11906e, ai.a(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    private int e(int i) {
        int min = Math.min(this.f11908g, i);
        f(min);
        return min;
    }

    private int e(byte[] bArr, int i, int i2) {
        int i3 = this.f11908g;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.f11906e, 0, bArr, i, min);
        f(min);
        return min;
    }

    private void f(int i) {
        int i2 = this.f11908g - i;
        this.f11908g = i2;
        this.f11907f = 0;
        byte[] bArr = this.f11906e;
        if (i2 < bArr.length - 524288) {
            bArr = new byte[(i2 + 65536)];
        }
        System.arraycopy(this.f11906e, i, bArr, 0, this.f11908g);
        this.f11906e = bArr;
    }

    private void g(int i) {
        if (i != -1) {
            this.f11905d += (long) i;
        }
    }

    public int a(int i) throws IOException {
        int e2 = e(i);
        if (e2 == 0) {
            byte[] bArr = this.f11902a;
            e2 = a(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        g(e2);
        return e2;
    }

    public int a(byte[] bArr, int i, int i2) throws IOException {
        int e2 = e(bArr, i, i2);
        if (e2 == 0) {
            e2 = a(bArr, i, i2, 0, true);
        }
        g(e2);
        return e2;
    }

    public void a() {
        this.f11907f = 0;
    }

    public boolean a(int i, boolean z) throws IOException {
        int e2 = e(i);
        while (e2 < i && e2 != -1) {
            e2 = a(this.f11902a, -e2, Math.min(i, this.f11902a.length + e2), e2, z);
        }
        g(e2);
        return e2 != -1;
    }

    public boolean a(byte[] bArr, int i, int i2, boolean z) throws IOException {
        int e2 = e(bArr, i, i2);
        while (e2 < i2 && e2 != -1) {
            e2 = a(bArr, i, i2, e2, z);
        }
        g(e2);
        return e2 != -1;
    }

    public long b() {
        return this.f11905d + ((long) this.f11907f);
    }

    public void b(int i) throws IOException {
        a(i, false);
    }

    public void b(byte[] bArr, int i, int i2) throws IOException {
        a(bArr, i, i2, false);
    }

    public boolean b(int i, boolean z) throws IOException {
        d(i);
        int i2 = this.f11908g - this.f11907f;
        while (i2 < i) {
            i2 = a(this.f11906e, this.f11907f, i, i2, z);
            if (i2 == -1) {
                return false;
            }
            this.f11908g = this.f11907f + i2;
        }
        this.f11907f += i;
        return true;
    }

    public boolean b(byte[] bArr, int i, int i2, boolean z) throws IOException {
        if (!b(i2, z)) {
            return false;
        }
        System.arraycopy(this.f11906e, this.f11907f - i2, bArr, i, i2);
        return true;
    }

    public int c(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        d(i2);
        int i4 = this.f11908g;
        int i5 = this.f11907f;
        int i6 = i4 - i5;
        if (i6 == 0) {
            i3 = a(this.f11906e, i5, i2, 0, true);
            if (i3 == -1) {
                return -1;
            }
            this.f11908g += i3;
        } else {
            i3 = Math.min(i2, i6);
        }
        System.arraycopy(this.f11906e, this.f11907f, bArr, i, i3);
        this.f11907f += i3;
        return i3;
    }

    public long c() {
        return this.f11905d;
    }

    public void c(int i) throws IOException {
        b(i, false);
    }

    public long d() {
        return this.f11904c;
    }

    public void d(byte[] bArr, int i, int i2) throws IOException {
        b(bArr, i, i2, false);
    }
}
