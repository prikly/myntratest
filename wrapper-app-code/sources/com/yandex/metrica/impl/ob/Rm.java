package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.HashMap;
import java.util.concurrent.Semaphore;

public final class Rm {

    /* renamed from: g  reason: collision with root package name */
    private static final HashMap<String, Rm> f4902g = new HashMap<>();

    /* renamed from: a  reason: collision with root package name */
    private final String f4903a;

    /* renamed from: b  reason: collision with root package name */
    private FileLock f4904b;

    /* renamed from: c  reason: collision with root package name */
    private FileChannel f4905c;

    /* renamed from: d  reason: collision with root package name */
    private final File f4906d;

    /* renamed from: e  reason: collision with root package name */
    private RandomAccessFile f4907e;

    /* renamed from: f  reason: collision with root package name */
    private Semaphore f4908f = new Semaphore(1, true);

    private Rm(Context context, String str) {
        File file;
        String str2 = str + ".lock";
        this.f4903a = str2;
        File cacheDir = context.getCacheDir();
        File file2 = null;
        if (cacheDir == null) {
            file = null;
        } else {
            file = new File(cacheDir, "appmetrica_locks");
        }
        if (file != null) {
            file.mkdirs();
        }
        this.f4906d = file != null ? new File(file, str2) : file2;
    }

    public static synchronized Rm a(Context context, String str) {
        Rm rm;
        synchronized (Rm.class) {
            HashMap<String, Rm> hashMap = f4902g;
            rm = hashMap.get(str);
            if (rm == null) {
                rm = new Rm(context, str);
                hashMap.put(str, rm);
            }
        }
        return rm;
    }

    public synchronized void b() {
        this.f4908f.release();
        if (this.f4908f.availablePermits() > 0) {
            L0.a(this.f4904b);
            A2.a((Closeable) this.f4905c);
            A2.a((Closeable) this.f4907e);
            this.f4905c = null;
            this.f4907e = null;
        }
    }

    public synchronized void a() throws Throwable {
        this.f4908f.acquire();
        if (this.f4906d != null) {
            if (this.f4905c == null) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(this.f4906d, "rw");
                this.f4907e = randomAccessFile;
                this.f4905c = randomAccessFile.getChannel();
            }
            this.f4904b = this.f4905c.lock();
        } else {
            throw new IllegalStateException("Lock file is null");
        }
    }
}
