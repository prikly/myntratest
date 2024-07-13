package com.adcolony.sdk;

import java.io.IOException;
import java.io.InputStream;

class w0 extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    InputStream f10382a;

    /* renamed from: b  reason: collision with root package name */
    int f10383b;

    w0(InputStream inputStream, int i, int i2) throws IOException {
        this.f10382a = inputStream;
        while (i > 0) {
            i -= (int) inputStream.skip((long) i);
        }
        this.f10383b = i2;
    }

    public int available() throws IOException {
        int available = this.f10382a.available();
        int i = this.f10383b;
        return available <= i ? available : i;
    }

    public void close() throws IOException {
        this.f10382a.close();
    }

    public int read() throws IOException {
        int i = this.f10383b;
        if (i == 0) {
            return -1;
        }
        this.f10383b = i - 1;
        return this.f10382a.read();
    }

    public long skip(long j) throws IOException {
        int i = (int) j;
        if (i <= 0) {
            return 0;
        }
        int i2 = this.f10383b;
        if (i > i2) {
            i = i2;
        }
        this.f10383b = i2 - i;
        while (i > 0) {
            i -= (int) this.f10382a.skip(j);
        }
        return j;
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f10383b;
        if (i3 == 0) {
            return -1;
        }
        if (i2 > i3) {
            i2 = i3;
        }
        int read = this.f10382a.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        this.f10383b -= read;
        return read;
    }
}
