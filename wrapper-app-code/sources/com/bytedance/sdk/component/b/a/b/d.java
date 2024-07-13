package com.bytedance.sdk.component.b.a.b;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: ByteString */
public class d implements Serializable, Comparable<d> {

    /* renamed from: a  reason: collision with root package name */
    static final char[] f18867a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f18868b = Charset.forName("UTF-8");

    /* renamed from: c  reason: collision with root package name */
    public static final d f18869c = a(new byte[0]);

    /* renamed from: d  reason: collision with root package name */
    final byte[] f18870d;

    /* renamed from: e  reason: collision with root package name */
    transient int f18871e;

    /* renamed from: f  reason: collision with root package name */
    transient String f18872f;

    d(byte[] bArr) {
        this.f18870d = bArr;
    }

    public static d a(byte... bArr) {
        if (bArr != null) {
            return new d((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public String a() {
        String str = this.f18872f;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f18870d, f18868b);
        this.f18872f = str2;
        return str2;
    }

    public String b() {
        byte[] bArr = this.f18870d;
        char[] cArr = new char[(bArr.length * 2)];
        int i = 0;
        for (byte b2 : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f18867a;
            cArr[i] = cArr2[(b2 >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b2 & Ascii.SI];
        }
        return new String(cArr);
    }

    public d a(int i, int i2) {
        if (i >= 0) {
            byte[] bArr = this.f18870d;
            if (i2 <= bArr.length) {
                int i3 = i2 - i;
                if (i3 < 0) {
                    throw new IllegalArgumentException("endIndex < beginIndex");
                } else if (i == 0 && i2 == bArr.length) {
                    return this;
                } else {
                    byte[] bArr2 = new byte[i3];
                    System.arraycopy(this.f18870d, i, bArr2, 0, i3);
                    return new d(bArr2);
                }
            } else {
                throw new IllegalArgumentException("endIndex > length(" + this.f18870d.length + ")");
            }
        } else {
            throw new IllegalArgumentException("beginIndex < 0");
        }
    }

    public byte a(int i) {
        return this.f18870d[i];
    }

    public int c() {
        return this.f18870d.length;
    }

    public byte[] d() {
        return (byte[]) this.f18870d.clone();
    }

    public boolean a(int i, d dVar, int i2, int i3) {
        return dVar.a(i2, this.f18870d, i, i3);
    }

    public boolean a(int i, byte[] bArr, int i2, int i3) {
        if (i >= 0) {
            byte[] bArr2 = this.f18870d;
            return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && i.a(bArr2, i, bArr, i2, i3);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            int c2 = dVar.c();
            byte[] bArr = this.f18870d;
            if (c2 != bArr.length || !dVar.a(0, bArr, 0, bArr.length)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = this.f18871e;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f18870d);
        this.f18871e = hashCode;
        return hashCode;
    }

    /* renamed from: a */
    public int compareTo(d dVar) {
        int c2 = c();
        int c3 = dVar.c();
        int min = Math.min(c2, c3);
        int i = 0;
        while (i < min) {
            byte a2 = a(i) & 255;
            byte a3 = dVar.a(i) & 255;
            if (a2 == a3) {
                i++;
            } else if (a2 < a3) {
                return -1;
            } else {
                return 1;
            }
        }
        if (c2 == c3) {
            return 0;
        }
        if (c2 < c3) {
            return -1;
        }
        return 1;
    }

    public String toString() {
        StringBuilder sb;
        if (this.f18870d.length == 0) {
            return "[size=0]";
        }
        String a2 = a();
        int a3 = a(a2, 64);
        if (a3 != -1) {
            String replace = a2.substring(0, a3).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (a3 < a2.length()) {
                sb = new StringBuilder();
                sb.append("[size=");
                sb.append(this.f18870d.length);
                sb.append(" text=");
                sb.append(replace);
                sb.append("…]");
            } else {
                sb = new StringBuilder();
                sb.append("[text=");
                sb.append(replace);
                sb.append("]");
            }
            return sb.toString();
        } else if (this.f18870d.length <= 64) {
            return "[hex=" + b() + "]";
        } else {
            return "[size=" + this.f18870d.length + " hex=" + a(0, 64).b() + "…]";
        }
    }

    static int a(String str, int i) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            if (i3 == i) {
                return i2;
            }
            int codePointAt = str.codePointAt(i2);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            i3++;
            i2 += Character.charCount(codePointAt);
        }
        return str.length();
    }
}
