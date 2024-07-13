package com.yandex.metrica.impl.ob;

import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.t6  reason: case insensitive filesystem */
public class C0718t6<Output> implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final File f6807a;

    /* renamed from: b  reason: collision with root package name */
    private final C0589nm<File, Output> f6808b;

    /* renamed from: c  reason: collision with root package name */
    private final C0564mm<File> f6809c;

    /* renamed from: d  reason: collision with root package name */
    private final C0564mm<Output> f6810d;

    public C0718t6(File file, C0589nm<File, Output> nmVar, C0564mm<File> mmVar, C0564mm<Output> mmVar2) {
        this.f6807a = file;
        this.f6808b = nmVar;
        this.f6809c = mmVar;
        this.f6810d = mmVar2;
    }

    public void run() {
        if (this.f6807a.exists()) {
            try {
                Output a2 = this.f6808b.a(this.f6807a);
                if (a2 != null) {
                    this.f6810d.b(a2);
                }
            } catch (Throwable unused) {
            }
            this.f6809c.b(this.f6807a);
        }
    }
}
