package com.yandex.metrica.impl.ob;

import com.yandex.metrica.networktasks.api.CacheControlHttpsConnectionPerformer;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;

/* renamed from: com.yandex.metrica.impl.ob.th  reason: case insensitive filesystem */
class C0729th implements CacheControlHttpsConnectionPerformer.Client {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C0336di f6843a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ File f6844b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Eh f6845c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C0753uh f6846d;

    C0729th(C0753uh uhVar, C0336di diVar, File file, Eh eh) {
        this.f6846d = uhVar;
        this.f6843a = diVar;
        this.f6844b = file;
        this.f6845c = eh;
    }

    public String getOldETag() {
        return this.f6846d.f6920e.b();
    }

    public void onError() {
        C0753uh.a(this.f6846d, this.f6843a.f5690h);
        C0753uh.c(this.f6846d);
    }

    public void onNotModified() {
        C0753uh.a(this.f6846d, this.f6843a.i);
        C0753uh.c(this.f6846d);
        this.f6845c.a(this.f6844b);
    }

    public void onResponse(String str, byte[] bArr) {
        FileOutputStream fileOutputStream;
        C0753uh.a(this.f6846d, this.f6843a.i);
        C0753uh.c(this.f6846d);
        this.f6846d.f6920e.b(str);
        C0753uh uhVar = this.f6846d;
        File file = this.f6844b;
        uhVar.getClass();
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.flush();
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            fileOutputStream = null;
        }
        A2.a((Closeable) fileOutputStream);
        this.f6845c.a(this.f6844b);
    }
}
