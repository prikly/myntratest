package com.criteo.publisher.f0;

import android.util.AtomicFile;
import com.criteo.publisher.f0.n;
import com.criteo.publisher.f0.r;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.SoftReference;

/* compiled from: SyncMetricFile */
class d0 {

    /* renamed from: a  reason: collision with root package name */
    private final String f2429a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicFile f2430b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f2431c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final q f2432d;

    /* renamed from: e  reason: collision with root package name */
    private volatile SoftReference<n> f2433e;

    d0(String str, AtomicFile atomicFile, q qVar) {
        this.f2429a = str;
        this.f2430b = atomicFile;
        this.f2432d = qVar;
        this.f2433e = new SoftReference<>((Object) null);
    }

    /* access modifiers changed from: package-private */
    public n b() throws IOException {
        synchronized (this.f2431c) {
            n nVar = this.f2433e.get();
            if (nVar != null) {
                return nVar;
            }
            n c2 = c();
            this.f2433e = new SoftReference<>(c2);
            return c2;
        }
    }

    /* access modifiers changed from: package-private */
    public void a(n nVar) throws IOException {
        synchronized (this.f2431c) {
            this.f2433e = new SoftReference<>((Object) null);
            b(nVar);
            this.f2433e = new SoftReference<>(nVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(r.a aVar) throws IOException {
        synchronized (this.f2431c) {
            n.a l = b().l();
            aVar.a(l);
            a(l.a());
        }
    }

    /* access modifiers changed from: package-private */
    public void a(p pVar) throws IOException {
        synchronized (this.f2431c) {
            n b2 = b();
            a();
            try {
                if (!pVar.a(b2)) {
                }
            } finally {
                a(b2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        synchronized (this.f2431c) {
            this.f2433e = new SoftReference<>((Object) null);
            this.f2430b.delete();
        }
    }

    private n c() throws IOException {
        BufferedInputStream bufferedInputStream;
        if (!this.f2430b.getBaseFile().exists()) {
            return n.a(this.f2429a).a();
        }
        FileInputStream openRead = this.f2430b.openRead();
        try {
            bufferedInputStream = new BufferedInputStream(openRead);
            n a2 = this.f2432d.a(bufferedInputStream);
            bufferedInputStream.close();
            if (openRead != null) {
                openRead.close();
            }
            return a2;
        } catch (Throwable th) {
            if (openRead != null) {
                try {
                    openRead.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
        throw th;
    }

    private void b(n nVar) throws IOException {
        BufferedOutputStream bufferedOutputStream;
        FileOutputStream startWrite = this.f2430b.startWrite();
        try {
            bufferedOutputStream = new BufferedOutputStream(startWrite);
            this.f2432d.a(nVar, bufferedOutputStream);
            this.f2430b.finishWrite(startWrite);
            bufferedOutputStream.close();
            if (startWrite != null) {
                startWrite.close();
                return;
            }
            return;
        } catch (IOException e2) {
            this.f2430b.failWrite(startWrite);
            throw e2;
        } catch (Throwable th) {
            if (startWrite != null) {
                try {
                    startWrite.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
        throw th;
    }
}
