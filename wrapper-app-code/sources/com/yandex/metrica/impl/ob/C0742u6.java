package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.u6  reason: case insensitive filesystem */
public class C0742u6 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final File f6876a;

    /* renamed from: b  reason: collision with root package name */
    private final C0564mm<File> f6877b;

    /* renamed from: c  reason: collision with root package name */
    private final C0758um f6878c;

    public C0742u6(Context context, File file, C0564mm<File> mmVar) {
        this(file, mmVar, C0758um.a(context));
    }

    public void run() {
        File[] listFiles;
        if (this.f6876a.exists() && this.f6876a.isDirectory() && (listFiles = this.f6876a.listFiles()) != null) {
            for (File file : listFiles) {
                C0710sm a2 = this.f6878c.a(file.getName());
                try {
                    a2.a();
                    this.f6877b.b(file);
                } catch (Throwable unused) {
                }
                a2.c();
            }
        }
    }

    C0742u6(File file, C0564mm<File> mmVar, C0758um umVar) {
        this.f6876a = file;
        this.f6877b = mmVar;
        this.f6878c = umVar;
    }
}
