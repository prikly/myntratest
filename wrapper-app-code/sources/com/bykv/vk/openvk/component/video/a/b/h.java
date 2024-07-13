package com.bykv.vk.openvk.component.video.a.b;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: RandomAccessFileWrapper */
class h {

    /* renamed from: a  reason: collision with root package name */
    private final RandomAccessFile f18073a;

    h(File file, String str) throws a {
        try {
            this.f18073a = new RandomAccessFile(file, str);
        } catch (FileNotFoundException e2) {
            throw new a(e2);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(long j) throws a {
        try {
            this.f18073a.seek(j);
        } catch (IOException e2) {
            throw new a(e2);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(byte[] bArr, int i, int i2) throws a {
        try {
            this.f18073a.write(bArr, i, i2);
        } catch (IOException e2) {
            throw new a(e2);
        }
    }

    /* access modifiers changed from: package-private */
    public int a(byte[] bArr) throws a {
        try {
            return this.f18073a.read(bArr);
        } catch (IOException e2) {
            throw new a(e2);
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        com.bykv.vk.openvk.component.video.a.c.a.a(this.f18073a);
    }

    /* compiled from: RandomAccessFileWrapper */
    static class a extends Exception {
        a(Throwable th) {
            super(th);
        }
    }
}
