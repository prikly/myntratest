package com.bytedance.sdk.component.b.a.a.a;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* compiled from: NetInputStram */
public class e extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    InputStream f18858a;

    /* renamed from: b  reason: collision with root package name */
    HttpURLConnection f18859b;

    public e(InputStream inputStream, HttpURLConnection httpURLConnection) {
        this.f18858a = inputStream;
        this.f18859b = httpURLConnection;
    }

    public int read() throws IOException {
        InputStream inputStream = this.f18858a;
        if (inputStream != null) {
            return inputStream.read();
        }
        return 0;
    }

    public int read(byte[] bArr) throws IOException {
        InputStream inputStream = this.f18858a;
        if (inputStream != null) {
            return inputStream.read(bArr);
        }
        return 0;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        InputStream inputStream = this.f18858a;
        if (inputStream != null) {
            return inputStream.read(bArr, i, i2);
        }
        return 0;
    }

    public long skip(long j) throws IOException {
        InputStream inputStream = this.f18858a;
        if (inputStream != null) {
            return inputStream.skip(j);
        }
        return 0;
    }

    public int available() throws IOException {
        InputStream inputStream = this.f18858a;
        if (inputStream != null) {
            return inputStream.available();
        }
        return 0;
    }

    public void close() throws IOException {
        InputStream inputStream = this.f18858a;
        if (inputStream != null) {
            inputStream.close();
            this.f18858a = null;
        }
        HttpURLConnection httpURLConnection = this.f18859b;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            this.f18859b = null;
        }
    }

    public synchronized void mark(int i) {
        if (this.f18858a != null) {
            this.f18858a.mark(i);
        }
    }

    public void reset() throws IOException {
        InputStream inputStream = this.f18858a;
        if (inputStream != null) {
            inputStream.reset();
        }
    }

    public boolean markSupported() {
        InputStream inputStream = this.f18858a;
        if (inputStream != null) {
            return inputStream.markSupported();
        }
        return false;
    }
}
