package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* renamed from: com.yandex.metrica.impl.ob.tm  reason: case insensitive filesystem */
public class C0734tm {

    /* renamed from: a  reason: collision with root package name */
    private final Context f6851a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6852b;

    /* renamed from: c  reason: collision with root package name */
    private final B0 f6853c;

    /* renamed from: d  reason: collision with root package name */
    private File f6854d;

    /* renamed from: e  reason: collision with root package name */
    private FileLock f6855e;

    /* renamed from: f  reason: collision with root package name */
    private RandomAccessFile f6856f;

    /* renamed from: g  reason: collision with root package name */
    private FileChannel f6857g;

    /* renamed from: h  reason: collision with root package name */
    private int f6858h;

    public C0734tm(Context context, String str) {
        this(context, str, new B0());
    }

    public synchronized void a() throws Throwable {
        File b2 = this.f6853c.b(this.f6851a.getFilesDir(), this.f6852b);
        this.f6854d = b2;
        if (b2 != null) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.f6854d, "rw");
            this.f6856f = randomAccessFile;
            FileChannel channel = randomAccessFile.getChannel();
            this.f6857g = channel;
            if (this.f6858h == 0) {
                this.f6855e = channel.lock();
            }
            this.f6858h++;
        } else {
            throw new IllegalStateException("Cannot create lock file");
        }
    }

    public synchronized void b() {
        File file = this.f6854d;
        if (file != null) {
            file.getAbsolutePath();
        }
        int i = this.f6858h - 1;
        this.f6858h = i;
        if (i == 0) {
            L0.a(this.f6855e);
        }
        A2.a((Closeable) this.f6856f);
        A2.a((Closeable) this.f6857g);
        this.f6856f = null;
        this.f6855e = null;
        this.f6857g = null;
    }

    public synchronized void c() {
        b();
        File file = this.f6854d;
        if (file != null) {
            file.delete();
        }
    }

    C0734tm(Context context, String str, B0 b0) {
        this.f6858h = 0;
        this.f6851a = context;
        this.f6852b = str + ".lock";
        this.f6853c = b0;
    }
}
