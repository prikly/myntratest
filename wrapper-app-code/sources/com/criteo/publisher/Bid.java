package com.criteo.publisher;

import com.criteo.publisher.model.b0.n;
import com.criteo.publisher.model.s;
import com.criteo.publisher.n0.a;

public class Bid {

    /* renamed from: a  reason: collision with root package name */
    private final double f2275a;

    /* renamed from: b  reason: collision with root package name */
    private final a f2276b;

    /* renamed from: c  reason: collision with root package name */
    private final i f2277c;

    /* renamed from: d  reason: collision with root package name */
    private s f2278d;

    /* access modifiers changed from: private */
    public static /* synthetic */ s a(s sVar) {
        return sVar;
    }

    Bid(a aVar, i iVar, s sVar) {
        this.f2275a = sVar.b().doubleValue();
        this.f2276b = aVar;
        this.f2278d = sVar;
        this.f2277c = iVar;
    }

    public double getPrice() {
        return this.f2275a;
    }

    public a c() {
        return this.f2276b;
    }

    public s b() {
        return (s) a($$Lambda$Bid$p_9GkxYzDd6nc_h1epMI6NKODQ.INSTANCE);
    }

    public String a(a aVar) {
        if (!aVar.equals(this.f2276b)) {
            return null;
        }
        return (String) a($$Lambda$PQ3TBaarq9RzlkaMhZw53YWVsg.INSTANCE);
    }

    public n a() {
        return (n) a($$Lambda$0uZbirHMqJRHY7pTWcqX5jLvOw.INSTANCE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized <T> T a(kotlin.jvm.functions.Function1<com.criteo.publisher.model.s, T> r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.criteo.publisher.model.s r0 = r3.f2278d     // Catch:{ all -> 0x001b }
            r1 = 0
            if (r0 == 0) goto L_0x0019
            com.criteo.publisher.i r2 = r3.f2277c     // Catch:{ all -> 0x001b }
            boolean r0 = r0.a((com.criteo.publisher.i) r2)     // Catch:{ all -> 0x001b }
            if (r0 == 0) goto L_0x000f
            goto L_0x0019
        L_0x000f:
            com.criteo.publisher.model.s r0 = r3.f2278d     // Catch:{ all -> 0x001b }
            java.lang.Object r4 = r4.invoke(r0)     // Catch:{ all -> 0x001b }
            r3.f2278d = r1     // Catch:{ all -> 0x001b }
            monitor-exit(r3)
            return r4
        L_0x0019:
            monitor-exit(r3)
            return r1
        L_0x001b:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.criteo.publisher.Bid.a(kotlin.jvm.functions.Function1):java.lang.Object");
    }
}
