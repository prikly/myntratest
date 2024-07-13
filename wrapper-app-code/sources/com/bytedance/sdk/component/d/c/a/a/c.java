package com.bytedance.sdk.component.d.c.a.a;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* compiled from: StrictLineReader */
class c implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final InputStream f18992a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Charset f18993b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f18994c;

    /* renamed from: d  reason: collision with root package name */
    private int f18995d;

    /* renamed from: e  reason: collision with root package name */
    private int f18996e;

    public c(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    public c(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        } else if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (charset.equals(d.f18998a)) {
            this.f18992a = inputStream;
            this.f18993b = charset;
            this.f18994c = new byte[i];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    public void close() throws IOException {
        synchronized (this.f18992a) {
            if (this.f18994c != null) {
                this.f18994c = null;
                this.f18992a.close();
            }
        }
    }

    public String a() throws IOException {
        int i;
        int i2;
        synchronized (this.f18992a) {
            if (this.f18994c != null) {
                if (this.f18995d >= this.f18996e) {
                    c();
                }
                for (int i3 = this.f18995d; i3 != this.f18996e; i3++) {
                    if (this.f18994c[i3] == 10) {
                        if (i3 != this.f18995d) {
                            i2 = i3 - 1;
                            if (this.f18994c[i2] == 13) {
                                String str = new String(this.f18994c, this.f18995d, i2 - this.f18995d, this.f18993b.name());
                                this.f18995d = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(this.f18994c, this.f18995d, i2 - this.f18995d, this.f18993b.name());
                        this.f18995d = i3 + 1;
                        return str2;
                    }
                }
                AnonymousClass1 r1 = new ByteArrayOutputStream((this.f18996e - this.f18995d) + 80) {
                    public String toString() {
                        try {
                            return new String(this.buf, 0, (this.count <= 0 || this.buf[this.count + -1] != 13) ? this.count : this.count - 1, c.this.f18993b.name());
                        } catch (UnsupportedEncodingException e2) {
                            throw new AssertionError(e2);
                        }
                    }
                };
                loop1:
                while (true) {
                    r1.write(this.f18994c, this.f18995d, this.f18996e - this.f18995d);
                    this.f18996e = -1;
                    c();
                    i = this.f18995d;
                    while (true) {
                        if (i != this.f18996e) {
                            if (this.f18994c[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                if (i != this.f18995d) {
                    r1.write(this.f18994c, this.f18995d, i - this.f18995d);
                }
                this.f18995d = i + 1;
                String byteArrayOutputStream = r1.toString();
                return byteArrayOutputStream;
            }
            throw new IOException("LineReader is closed");
        }
    }

    public boolean b() {
        return this.f18996e == -1;
    }

    private void c() throws IOException {
        InputStream inputStream = this.f18992a;
        byte[] bArr = this.f18994c;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f18995d = 0;
            this.f18996e = read;
            return;
        }
        throw new EOFException();
    }
}
