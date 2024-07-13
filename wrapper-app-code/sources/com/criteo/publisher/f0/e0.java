package com.criteo.publisher.f0;

import com.criteo.publisher.logging.g;
import com.criteo.publisher.logging.h;
import com.criteo.publisher.n0.o;
import com.squareup.tape.FileException;
import com.squareup.tape.FileObjectQueue;
import com.squareup.tape.ObjectQueue;
import com.squareup.tape.QueueFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: TapeSendingQueue */
class e0<T> implements k<T> {

    /* renamed from: a  reason: collision with root package name */
    private final g f2439a = h.b(e0.class);

    /* renamed from: b  reason: collision with root package name */
    private final Object f2440b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private ObjectQueue<T> f2441c;

    /* renamed from: d  reason: collision with root package name */
    private Method f2442d;

    /* renamed from: e  reason: collision with root package name */
    private QueueFile f2443e;

    /* renamed from: f  reason: collision with root package name */
    private final z<T> f2444f;

    /* renamed from: g  reason: collision with root package name */
    private final a0<T> f2445g;

    e0(z<T> zVar, a0<T> a0Var) {
        this.f2444f = zVar;
        this.f2445g = a0Var;
        this.f2442d = null;
        this.f2443e = null;
    }

    public boolean a(T t) {
        synchronized (this.f2440b) {
            try {
                b().add(t);
            } catch (FileException e2) {
                o.a((Throwable) e2);
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r1.size() <= 0) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        r1.remove();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0037, code lost:
        if (r3 != null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r3.addSuppressed(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0053, code lost:
        if (r3 != null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0055, code lost:
        r3 = r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<T> a(int r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f2440b
            monitor-enter(r0)
            com.squareup.tape.ObjectQueue r1 = r6.b()     // Catch:{ all -> 0x0078 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0078 }
            r2.<init>()     // Catch:{ all -> 0x0078 }
            r3 = 0
            r4 = 0
        L_0x000e:
            if (r4 >= r7) goto L_0x006b
            java.lang.Object r5 = r1.peek()     // Catch:{ FileException -> 0x0040 }
            if (r5 != 0) goto L_0x0029
            int r7 = r1.size()     // Catch:{ FileException -> 0x0020 }
            if (r7 <= 0) goto L_0x006b
            r1.remove()     // Catch:{ FileException -> 0x0020 }
            goto L_0x006b
        L_0x0020:
            r7 = move-exception
            if (r3 != 0) goto L_0x0025
            r3 = r7
            goto L_0x006b
        L_0x0025:
            r3.addSuppressed(r7)     // Catch:{ all -> 0x0078 }
            goto L_0x006b
        L_0x0029:
            r2.add(r5)     // Catch:{ FileException -> 0x0040 }
            int r5 = r1.size()     // Catch:{ FileException -> 0x0036 }
            if (r5 <= 0) goto L_0x0056
            r1.remove()     // Catch:{ FileException -> 0x0036 }
            goto L_0x0056
        L_0x0036:
            r5 = move-exception
            if (r3 != 0) goto L_0x003a
            goto L_0x0055
        L_0x003a:
            r3.addSuppressed(r5)     // Catch:{ all -> 0x0078 }
            goto L_0x0056
        L_0x003e:
            r7 = move-exception
            goto L_0x0059
        L_0x0040:
            r5 = move-exception
            if (r3 != 0) goto L_0x0045
            r3 = r5
            goto L_0x0048
        L_0x0045:
            r3.addSuppressed(r5)     // Catch:{ all -> 0x003e }
        L_0x0048:
            int r5 = r1.size()     // Catch:{ FileException -> 0x0052 }
            if (r5 <= 0) goto L_0x0056
            r1.remove()     // Catch:{ FileException -> 0x0052 }
            goto L_0x0056
        L_0x0052:
            r5 = move-exception
            if (r3 != 0) goto L_0x003a
        L_0x0055:
            r3 = r5
        L_0x0056:
            int r4 = r4 + 1
            goto L_0x000e
        L_0x0059:
            int r2 = r1.size()     // Catch:{ FileException -> 0x0063 }
            if (r2 <= 0) goto L_0x006a
            r1.remove()     // Catch:{ FileException -> 0x0063 }
            goto L_0x006a
        L_0x0063:
            r1 = move-exception
            if (r3 != 0) goto L_0x0067
            goto L_0x006a
        L_0x0067:
            r3.addSuppressed(r1)     // Catch:{ all -> 0x0078 }
        L_0x006a:
            throw r7     // Catch:{ all -> 0x0078 }
        L_0x006b:
            if (r3 == 0) goto L_0x0076
            com.criteo.publisher.logging.g r7 = r6.f2439a     // Catch:{ all -> 0x0078 }
            com.criteo.publisher.logging.e r1 = com.criteo.publisher.f0.c0.a((java.lang.Exception) r3)     // Catch:{ all -> 0x0078 }
            r7.a(r1)     // Catch:{ all -> 0x0078 }
        L_0x0076:
            monitor-exit(r0)     // Catch:{ all -> 0x0078 }
            return r2
        L_0x0078:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0078 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.criteo.publisher.f0.e0.a(int):java.util.List");
    }

    public int a() {
        synchronized (this.f2440b) {
            ObjectQueue b2 = b();
            if (b2 instanceof FileObjectQueue) {
                try {
                    int intValue = ((Integer) c().invoke(a((FileObjectQueue<?>) (FileObjectQueue) b2), new Object[0])).intValue();
                    return intValue;
                } catch (Exception e2) {
                    o.a((Throwable) e2);
                }
            }
            int size = b2.size() * this.f2445g.a();
            return size;
        }
    }

    private Method c() throws ReflectiveOperationException {
        if (this.f2442d == null) {
            Method declaredMethod = QueueFile.class.getDeclaredMethod("usedBytes", new Class[0]);
            this.f2442d = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return this.f2442d;
    }

    /* access modifiers changed from: package-private */
    public QueueFile a(FileObjectQueue<?> fileObjectQueue) throws ReflectiveOperationException, ClassCastException {
        if (this.f2443e == null) {
            Field declaredField = FileObjectQueue.class.getDeclaredField("queueFile");
            declaredField.setAccessible(true);
            this.f2443e = (QueueFile) declaredField.get(fileObjectQueue);
        }
        return this.f2443e;
    }

    private ObjectQueue<T> b() {
        if (this.f2441c == null) {
            this.f2441c = this.f2444f.a();
        }
        return this.f2441c;
    }
}
