package com.yandex.metrica.impl.ob;

import android.net.Uri;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Map;

public abstract class Ah {

    /* renamed from: a  reason: collision with root package name */
    final Socket f3705a;

    /* renamed from: b  reason: collision with root package name */
    final Gh f3706b;

    /* renamed from: c  reason: collision with root package name */
    final C0336di f3707c;

    /* renamed from: d  reason: collision with root package name */
    final Uri f3708d;

    /* renamed from: e  reason: collision with root package name */
    final Hh f3709e;

    Ah(Socket socket, Uri uri, Gh gh, C0336di diVar, Hh hh) {
        this.f3705a = socket;
        this.f3708d = uri;
        this.f3706b = gh;
        this.f3707c = diVar;
        this.f3709e = hh;
    }

    /* access modifiers changed from: package-private */
    public abstract void a();

    /* access modifiers changed from: package-private */
    public void a(String str, Map<String, String> map, byte[] bArr) {
        BufferedOutputStream bufferedOutputStream;
        this.f3709e.b();
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            bufferedOutputStream = new BufferedOutputStream(this.f3705a.getOutputStream());
            try {
                bufferedOutputStream.write(str.getBytes());
                a(bufferedOutputStream);
                for (Map.Entry next : map.entrySet()) {
                    a((OutputStream) bufferedOutputStream, (String) next.getKey(), (String) next.getValue());
                }
                a(bufferedOutputStream);
                bufferedOutputStream.write(bArr);
                bufferedOutputStream.flush();
                this.f3709e.c();
                ((Jh) this.f3706b).b(this.f3705a.getLocalPort(), this.f3709e);
            } catch (IOException e2) {
                e = e2;
                bufferedOutputStream2 = bufferedOutputStream;
            } catch (Throwable th) {
                th = th;
                bufferedOutputStream2 = bufferedOutputStream;
                A2.a((Closeable) bufferedOutputStream2);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            try {
                ((Jh) this.f3706b).a("io_exception_during_sync", (Throwable) e);
                bufferedOutputStream = bufferedOutputStream2;
                A2.a((Closeable) bufferedOutputStream);
            } catch (Throwable th2) {
                th = th2;
                A2.a((Closeable) bufferedOutputStream2);
                throw th;
            }
        }
        A2.a((Closeable) bufferedOutputStream);
    }

    private void a(OutputStream outputStream, String str, String str2) throws IOException {
        outputStream.write((str + ": " + str2).getBytes());
        a(outputStream);
    }

    private void a(OutputStream outputStream) throws IOException {
        outputStream.write("\r\n".getBytes());
    }
}
