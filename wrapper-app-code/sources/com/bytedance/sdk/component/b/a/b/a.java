package com.bytedance.sdk.component.b.a.b;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* compiled from: Buffer */
public final class a implements b, c, Cloneable, ByteChannel {

    /* renamed from: c  reason: collision with root package name */
    private static final byte[] f18864c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: a  reason: collision with root package name */
    e f18865a;

    /* renamed from: b  reason: collision with root package name */
    long f18866b;

    public void close() {
    }

    public void flush() {
    }

    public boolean isOpen() {
        return true;
    }

    public boolean a() {
        return this.f18866b == 0;
    }

    public byte b() {
        if (this.f18866b != 0) {
            e eVar = this.f18865a;
            int i = eVar.f18874b;
            int i2 = eVar.f18875c;
            int i3 = i + 1;
            byte b2 = eVar.f18873a[i];
            this.f18866b--;
            if (i3 == i2) {
                this.f18865a = eVar.b();
                f.a(eVar);
            } else {
                eVar.f18874b = i3;
            }
            return b2;
        }
        throw new IllegalStateException("size == 0");
    }

    public String c() {
        try {
            return a(this.f18866b, i.f18884a);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public String a(long j, Charset charset) throws EOFException {
        i.a(this.f18866b, 0, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
        } else if (j == 0) {
            return "";
        } else {
            e eVar = this.f18865a;
            if (((long) eVar.f18874b) + j > ((long) eVar.f18875c)) {
                return new String(a(j), charset);
            }
            String str = new String(eVar.f18873a, eVar.f18874b, (int) j, charset);
            eVar.f18874b = (int) (((long) eVar.f18874b) + j);
            this.f18866b -= j;
            if (eVar.f18874b == eVar.f18875c) {
                this.f18865a = eVar.b();
                f.a(eVar);
            }
            return str;
        }
    }

    public byte[] a(long j) throws EOFException {
        i.a(this.f18866b, 0, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[((int) j)];
            a(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
    }

    public void a(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int a2 = a(bArr, i, bArr.length - i);
            if (a2 != -1) {
                i += a2;
            } else {
                throw new EOFException();
            }
        }
    }

    public int a(byte[] bArr, int i, int i2) {
        i.a((long) bArr.length, (long) i, (long) i2);
        e eVar = this.f18865a;
        if (eVar == null) {
            return -1;
        }
        int min = Math.min(i2, eVar.f18875c - eVar.f18874b);
        System.arraycopy(eVar.f18873a, eVar.f18874b, bArr, i, min);
        eVar.f18874b += min;
        this.f18866b -= (long) min;
        if (eVar.f18874b == eVar.f18875c) {
            this.f18865a = eVar.b();
            f.a(eVar);
        }
        return min;
    }

    public int read(ByteBuffer byteBuffer) throws IOException {
        e eVar = this.f18865a;
        if (eVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), eVar.f18875c - eVar.f18874b);
        byteBuffer.put(eVar.f18873a, eVar.f18874b, min);
        eVar.f18874b += min;
        this.f18866b -= (long) min;
        if (eVar.f18874b == eVar.f18875c) {
            this.f18865a = eVar.b();
            f.a(eVar);
        }
        return min;
    }

    public a a(String str) {
        return a(str, 0, str.length());
    }

    public a a(String str, int i, int i2) {
        char c2;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + i);
        } else if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        } else if (i2 <= str.length()) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt < 128) {
                    e c3 = c(1);
                    byte[] bArr = c3.f18873a;
                    int i3 = c3.f18875c - i;
                    int min = Math.min(i2, 8192 - i3);
                    int i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                    while (i4 < min) {
                        char charAt2 = str.charAt(i4);
                        if (charAt2 >= 128) {
                            break;
                        }
                        bArr[i4 + i3] = (byte) charAt2;
                        i4++;
                    }
                    int i5 = (i3 + i4) - c3.f18875c;
                    c3.f18875c += i5;
                    this.f18866b += (long) i5;
                    i = i4;
                } else {
                    if (charAt < 2048) {
                        b((charAt >> 6) | 192);
                        b((int) (charAt & '?') | 128);
                    } else if (charAt < 55296 || charAt > 57343) {
                        b((charAt >> 12) | 224);
                        b(((charAt >> 6) & 63) | 128);
                        b((int) (charAt & '?') | 128);
                    } else {
                        int i6 = i + 1;
                        if (i6 < i2) {
                            c2 = str.charAt(i6);
                        } else {
                            c2 = 0;
                        }
                        if (charAt > 56319 || c2 < 56320 || c2 > 57343) {
                            b(63);
                            i = i6;
                        } else {
                            int i7 = (((charAt & 10239) << 10) | (9215 & c2)) + Ascii.MIN;
                            b((i7 >> 18) | 240);
                            b(((i7 >> 12) & 63) | 128);
                            b(((i7 >> 6) & 63) | 128);
                            b((i7 & 63) | 128);
                            i += 2;
                        }
                    }
                    i++;
                }
            }
            return this;
        } else {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
    }

    public a a(int i) {
        if (i < 128) {
            b(i);
        } else if (i < 2048) {
            b((i >> 6) | 192);
            b((i & 63) | 128);
        } else if (i < 65536) {
            if (i < 55296 || i > 57343) {
                b((i >> 12) | 224);
                b(((i >> 6) & 63) | 128);
                b((i & 63) | 128);
            } else {
                b(63);
            }
        } else if (i <= 1114111) {
            b((i >> 18) | 240);
            b(((i >> 12) & 63) | 128);
            b(((i >> 6) & 63) | 128);
            b((i & 63) | 128);
        } else {
            throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
        }
        return this;
    }

    public a a(String str, int i, int i2, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            throw new IllegalAccessError("beginIndex < 0: " + i);
        } else if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        } else if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        } else if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (charset.equals(i.f18884a)) {
            return a(str, i, i2);
        } else {
            byte[] bytes = str.substring(i, i2).getBytes(charset);
            return b(bytes, 0, bytes.length);
        }
    }

    public a b(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = (long) i2;
            i.a((long) bArr.length, (long) i, j);
            int i3 = i2 + i;
            while (i < i3) {
                e c2 = c(1);
                int min = Math.min(i3 - i, 8192 - c2.f18875c);
                System.arraycopy(bArr, i, c2.f18873a, c2.f18875c, min);
                i += min;
                c2.f18875c += min;
            }
            this.f18866b += j;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i = remaining;
            while (i > 0) {
                e c2 = c(1);
                int min = Math.min(i, 8192 - c2.f18875c);
                byteBuffer.get(c2.f18873a, c2.f18875c, min);
                i -= min;
                c2.f18875c += min;
            }
            this.f18866b += (long) remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    public a b(int i) {
        e c2 = c(1);
        byte[] bArr = c2.f18873a;
        int i2 = c2.f18875c;
        c2.f18875c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f18866b++;
        return this;
    }

    public a b(long j) {
        if (j == 0) {
            return b(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        e c2 = c(numberOfTrailingZeros);
        byte[] bArr = c2.f18873a;
        int i = c2.f18875c;
        for (int i2 = (c2.f18875c + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = f18864c[(int) (15 & j)];
            j >>>= 4;
        }
        c2.f18875c += numberOfTrailingZeros;
        this.f18866b += (long) numberOfTrailingZeros;
        return this;
    }

    /* access modifiers changed from: package-private */
    public e c(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException();
        }
        e eVar = this.f18865a;
        if (eVar == null) {
            e a2 = f.a();
            this.f18865a = a2;
            a2.f18879g = a2;
            a2.f18878f = a2;
            return a2;
        }
        e eVar2 = eVar.f18879g;
        return (eVar2.f18875c + i > 8192 || !eVar2.f18877e) ? eVar2.a(f.a()) : eVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        long j = this.f18866b;
        if (j != aVar.f18866b) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        e eVar = this.f18865a;
        e eVar2 = aVar.f18865a;
        int i = eVar.f18874b;
        int i2 = eVar2.f18874b;
        while (j2 < this.f18866b) {
            long min = (long) Math.min(eVar.f18875c - i, eVar2.f18875c - i2);
            int i3 = 0;
            while (((long) i3) < min) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (eVar.f18873a[i] != eVar2.f18873a[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == eVar.f18875c) {
                eVar = eVar.f18878f;
                i = eVar.f18874b;
            }
            if (i2 == eVar2.f18875c) {
                eVar2 = eVar2.f18878f;
                i2 = eVar2.f18874b;
            }
            j2 += min;
        }
        return true;
    }

    public int hashCode() {
        e eVar = this.f18865a;
        if (eVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = eVar.f18875c;
            for (int i3 = eVar.f18874b; i3 < i2; i3++) {
                i = (i * 31) + eVar.f18873a[i3];
            }
            eVar = eVar.f18878f;
        } while (eVar != this.f18865a);
        return i;
    }

    public String toString() {
        return e().toString();
    }

    /* renamed from: d */
    public a clone() {
        a aVar = new a();
        if (this.f18866b == 0) {
            return aVar;
        }
        e a2 = this.f18865a.a();
        aVar.f18865a = a2;
        a2.f18879g = a2;
        a2.f18878f = a2;
        e eVar = this.f18865a;
        while (true) {
            eVar = eVar.f18878f;
            if (eVar != this.f18865a) {
                aVar.f18865a.f18879g.a(eVar.a());
            } else {
                aVar.f18866b = this.f18866b;
                return aVar;
            }
        }
    }

    public final d e() {
        long j = this.f18866b;
        if (j <= 2147483647L) {
            return d((int) j);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f18866b);
    }

    public final d d(int i) {
        if (i == 0) {
            return d.f18869c;
        }
        return new g(this, i);
    }
}
