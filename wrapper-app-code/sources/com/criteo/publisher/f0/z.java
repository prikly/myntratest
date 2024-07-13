package com.criteo.publisher.f0;

import android.content.Context;
import com.criteo.publisher.logging.g;
import com.criteo.publisher.logging.h;
import com.criteo.publisher.n0.l;
import com.squareup.tape.FileObjectQueue;
import com.squareup.tape.InMemoryObjectQueue;
import com.squareup.tape.ObjectQueue;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: ObjectQueueFactory */
public class z<T> {

    /* renamed from: a  reason: collision with root package name */
    private final g f2509a = h.b(getClass());

    /* renamed from: b  reason: collision with root package name */
    private final Context f2510b;

    /* renamed from: c  reason: collision with root package name */
    private final l f2511c;

    /* renamed from: d  reason: collision with root package name */
    private final a0<T> f2512d;

    public z(Context context, l lVar, a0<T> a0Var) {
        this.f2510b = context;
        this.f2511c = lVar;
        this.f2512d = a0Var;
    }

    public ObjectQueue<T> a() {
        return a(b());
    }

    public File b() {
        return new File(this.f2510b.getFilesDir(), this.f2512d.d());
    }

    private ObjectQueue<T> a(File file) {
        try {
            FileObjectQueue fileObjectQueue = new FileObjectQueue(file, new a(this.f2511c, this.f2512d.b()));
            fileObjectQueue.peek();
            return fileObjectQueue;
        } catch (Exception | OutOfMemoryError e2) {
            if (b(file)) {
                try {
                    return new FileObjectQueue(file, new a(this.f2511c, this.f2512d.b()));
                } catch (IOException e3) {
                    e2.addSuppressed(e3);
                } finally {
                    this.f2509a.a(c0.a(e2));
                }
            }
            return new InMemoryObjectQueue();
        }
    }

    private boolean b(File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File b2 : listFiles) {
                if (!b(b2)) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    /* compiled from: ObjectQueueFactory */
    static class a<T> implements FileObjectQueue.Converter<T> {

        /* renamed from: a  reason: collision with root package name */
        private final l f2513a;

        /* renamed from: b  reason: collision with root package name */
        private final Class<T> f2514b;

        a(l lVar, Class<T> cls) {
            this.f2513a = lVar;
            this.f2514b = cls;
        }

        public T from(byte[] bArr) throws IOException {
            if (bArr == null) {
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                T a2 = this.f2513a.a(this.f2514b, (InputStream) byteArrayInputStream);
                byteArrayInputStream.close();
                return a2;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            throw th;
        }

        public void toStream(T t, OutputStream outputStream) throws IOException {
            if (t != null && outputStream != null) {
                this.f2513a.a((Object) t, outputStream);
            }
        }
    }
}
