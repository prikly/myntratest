package com.bytedance.sdk.component.b.a.a.a;

import com.bytedance.sdk.component.b.a.n;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* compiled from: NetResponseBody */
public class g extends n {

    /* renamed from: a  reason: collision with root package name */
    HttpURLConnection f18862a;

    /* renamed from: b  reason: collision with root package name */
    InputStream f18863b;

    g(HttpURLConnection httpURLConnection) throws IOException {
        this.f18862a = httpURLConnection;
        this.f18863b = new e(httpURLConnection.getInputStream(), httpURLConnection);
    }

    public long a() {
        try {
            return (long) this.f18862a.getContentLength();
        } catch (Exception unused) {
            return 0;
        }
    }

    public String b() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f18863b));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    stringBuffer.append(readLine + "\n");
                } else {
                    String stringBuffer2 = stringBuffer.toString();
                    close();
                    return stringBuffer2;
                }
            }
        } catch (Exception unused) {
            return "";
        }
    }

    public void close() {
        try {
            this.f18863b.close();
            this.f18862a.disconnect();
        } catch (Exception unused) {
        }
    }

    public InputStream c() {
        return this.f18863b;
    }

    public byte[] d() {
        try {
            byte[] bArr = new byte[1024];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = this.f18863b.read(bArr);
                if (read == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (Exception unused) {
            return new byte[0];
        }
    }
}
