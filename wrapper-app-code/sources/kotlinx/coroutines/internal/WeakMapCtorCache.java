package kotlinx.coroutines.internal;

import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0\tj\u0002`\n2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R4\u0010\u0005\u001a(\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0\tj\u0002`\n0\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/internal/WeakMapCtorCache;", "Lkotlinx/coroutines/internal/CtorCache;", "()V", "cacheLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "exceptionCtors", "Ljava/util/WeakHashMap;", "Ljava/lang/Class;", "", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/Ctor;", "get", "key", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: ExceptionsConstructor.kt */
final class WeakMapCtorCache extends CtorCache {
    public static final WeakMapCtorCache INSTANCE = new WeakMapCtorCache();
    private static final ReentrantReadWriteLock cacheLock = new ReentrantReadWriteLock();
    private static final WeakHashMap<Class<? extends Throwable>, Function1<Throwable, Throwable>> exceptionCtors = new WeakHashMap<>();

    private WeakMapCtorCache() {
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable> get(java.lang.Class<? extends java.lang.Throwable> r7) {
        /*
            r6 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = cacheLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r0.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable>> r1 = exceptionCtors     // Catch:{ all -> 0x0074 }
            java.lang.Object r1 = r1.get(r7)     // Catch:{ all -> 0x0074 }
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1     // Catch:{ all -> 0x0074 }
            r0.unlock()
            if (r1 != 0) goto L_0x0073
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = cacheLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L_0x0028
            int r2 = r0.getReadHoldCount()
            goto L_0x0029
        L_0x0028:
            r2 = 0
        L_0x0029:
            r4 = 0
        L_0x002a:
            if (r4 >= r2) goto L_0x0032
            int r4 = r4 + 1
            r1.unlock()
            goto L_0x002a
        L_0x0032:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable>> r4 = exceptionCtors     // Catch:{ all -> 0x0066 }
            java.lang.Object r4 = r4.get(r7)     // Catch:{ all -> 0x0066 }
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4     // Catch:{ all -> 0x0066 }
            if (r4 != 0) goto L_0x005a
            kotlin.jvm.functions.Function1 r4 = kotlinx.coroutines.internal.ExceptionsConstructorKt.createConstructor(r7)     // Catch:{ all -> 0x0066 }
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable>> r5 = exceptionCtors     // Catch:{ all -> 0x0066 }
            java.util.Map r5 = (java.util.Map) r5     // Catch:{ all -> 0x0066 }
            r5.put(r7, r4)     // Catch:{ all -> 0x0066 }
        L_0x004e:
            if (r3 >= r2) goto L_0x0056
            int r3 = r3 + 1
            r1.lock()
            goto L_0x004e
        L_0x0056:
            r0.unlock()
            return r4
        L_0x005a:
            if (r3 >= r2) goto L_0x0062
            int r3 = r3 + 1
            r1.lock()
            goto L_0x005a
        L_0x0062:
            r0.unlock()
            return r4
        L_0x0066:
            r7 = move-exception
        L_0x0067:
            if (r3 >= r2) goto L_0x006f
            int r3 = r3 + 1
            r1.lock()
            goto L_0x0067
        L_0x006f:
            r0.unlock()
            throw r7
        L_0x0073:
            return r1
        L_0x0074:
            r7 = move-exception
            r0.unlock()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.WeakMapCtorCache.get(java.lang.Class):kotlin.jvm.functions.Function1");
    }
}
