package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.appsetid.c;
import com.yandex.metrica.appsetid.d;
import java.util.concurrent.CountDownLatch;

public final class Bb {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public volatile Ab f3749a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public CountDownLatch f3750b = new CountDownLatch(1);

    /* renamed from: c  reason: collision with root package name */
    private final long f3751c = 20;

    /* renamed from: d  reason: collision with root package name */
    private final com.yandex.metrica.appsetid.a f3752d = new a(this);

    /* renamed from: e  reason: collision with root package name */
    private final Context f3753e;

    /* renamed from: f  reason: collision with root package name */
    private final d f3754f;

    public Bb(Context context, d dVar) {
        this.f3753e = context;
        this.f3754f = dVar;
    }

    public static final class a implements com.yandex.metrica.appsetid.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Bb f3755a;

        a(Bb bb) {
            this.f3755a = bb;
        }

        public void a(String str, c cVar) {
            this.f3755a.f3749a = new Ab(str, cVar);
            this.f3755a.f3750b.countDown();
        }

        public void a(Throwable th) {
            this.f3755a.f3750b.countDown();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:1|2|(2:4|5)|6|7|(1:9)(1:10)|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x001f */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.yandex.metrica.impl.ob.Ab a() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.yandex.metrica.impl.ob.Ab r0 = r4.f3749a     // Catch:{ all -> 0x0030 }
            if (r0 != 0) goto L_0x001f
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x001f }
            r1 = 1
            r0.<init>(r1)     // Catch:{ all -> 0x001f }
            r4.f3750b = r0     // Catch:{ all -> 0x001f }
            com.yandex.metrica.appsetid.d r0 = r4.f3754f     // Catch:{ all -> 0x001f }
            android.content.Context r1 = r4.f3753e     // Catch:{ all -> 0x001f }
            com.yandex.metrica.appsetid.a r2 = r4.f3752d     // Catch:{ all -> 0x001f }
            r0.a(r1, r2)     // Catch:{ all -> 0x001f }
            java.util.concurrent.CountDownLatch r0 = r4.f3750b     // Catch:{ all -> 0x001f }
            long r1 = r4.f3751c     // Catch:{ all -> 0x001f }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x001f }
            r0.await(r1, r3)     // Catch:{ all -> 0x001f }
        L_0x001f:
            com.yandex.metrica.impl.ob.Ab r0 = r4.f3749a     // Catch:{ all -> 0x0030 }
            if (r0 == 0) goto L_0x0024
            goto L_0x002e
        L_0x0024:
            com.yandex.metrica.impl.ob.Ab r0 = new com.yandex.metrica.impl.ob.Ab     // Catch:{ all -> 0x0030 }
            com.yandex.metrica.appsetid.c r1 = com.yandex.metrica.appsetid.c.UNKNOWN     // Catch:{ all -> 0x0030 }
            r2 = 0
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0030 }
            r4.f3749a = r0     // Catch:{ all -> 0x0030 }
        L_0x002e:
            monitor-exit(r4)
            return r0
        L_0x0030:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.Bb.a():com.yandex.metrica.impl.ob.Ab");
    }
}
