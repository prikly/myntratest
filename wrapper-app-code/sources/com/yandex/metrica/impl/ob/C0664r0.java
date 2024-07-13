package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.core.api.ProtobufStateStorage;
import com.yandex.metrica.impl.ob.C0688s0;
import com.yandex.metrica.impl.ob.C0760v0;

/* renamed from: com.yandex.metrica.impl.ob.r0  reason: case insensitive filesystem */
public class C0664r0<CANDIDATE, CHOSEN extends C0760v0, STORAGE extends C0688s0<CANDIDATE, CHOSEN>> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f6668a;

    /* renamed from: b  reason: collision with root package name */
    private final ProtobufStateStorage<STORAGE> f6669b;

    /* renamed from: c  reason: collision with root package name */
    private final C0712t0<CHOSEN> f6670c;

    /* renamed from: d  reason: collision with root package name */
    private final C0858z2<CANDIDATE, CHOSEN> f6671d;

    /* renamed from: e  reason: collision with root package name */
    private final C0666r2<CANDIDATE, CHOSEN, STORAGE> f6672e;

    /* renamed from: f  reason: collision with root package name */
    private final C0270b2<CHOSEN> f6673f;

    /* renamed from: g  reason: collision with root package name */
    private final Y1 f6674g;

    /* renamed from: h  reason: collision with root package name */
    private final C0343e0 f6675h;
    private STORAGE i;

    public C0664r0(Context context, ProtobufStateStorage<STORAGE> protobufStateStorage, C0712t0<CHOSEN> t0Var, C0858z2<CANDIDATE, CHOSEN> z2Var, C0666r2<CANDIDATE, CHOSEN, STORAGE> r2Var, C0270b2<CHOSEN> b2Var, Y1 y1, C0343e0 e0Var, STORAGE storage, String str) {
        this.f6668a = context;
        this.f6669b = protobufStateStorage;
        this.f6670c = t0Var;
        this.f6671d = z2Var;
        this.f6672e = r2Var;
        this.f6673f = b2Var;
        this.f6674g = y1;
        this.f6675h = e0Var;
        this.i = storage;
    }

    private final synchronized CHOSEN c() {
        if (!this.f6674g.a()) {
            C0760v0 v0Var = (C0760v0) this.f6673f.invoke();
            this.f6674g.b();
            if (v0Var != null) {
                b(v0Var);
            }
        }
        C0420h2.a("Choosing distribution data: %s", this.i);
        return (C0760v0) this.i.b();
    }

    public final synchronized STORAGE a() {
        return this.i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0055, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean b(CHOSEN r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            com.yandex.metrica.impl.ob.u0 r0 = r7.a()     // Catch:{ all -> 0x0056 }
            com.yandex.metrica.impl.ob.u0 r1 = com.yandex.metrica.impl.ob.C0736u0.UNDEFINED     // Catch:{ all -> 0x0056 }
            r2 = 0
            if (r0 != r1) goto L_0x000c
            monitor-exit(r6)
            return r2
        L_0x000c:
            com.yandex.metrica.impl.ob.z2<CANDIDATE, CHOSEN> r0 = r6.f6671d     // Catch:{ all -> 0x0056 }
            STORAGE r1 = r6.i     // Catch:{ all -> 0x0056 }
            java.util.List r1 = r1.a()     // Catch:{ all -> 0x0056 }
            java.lang.Object r0 = r0.invoke(r1, r7)     // Catch:{ all -> 0x0056 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0056 }
            r1 = 1
            if (r0 == 0) goto L_0x001f
            r3 = 1
            goto L_0x0020
        L_0x001f:
            r3 = 0
        L_0x0020:
            if (r0 == 0) goto L_0x0023
            goto L_0x0029
        L_0x0023:
            STORAGE r0 = r6.i     // Catch:{ all -> 0x0056 }
            java.util.List r0 = r0.a()     // Catch:{ all -> 0x0056 }
        L_0x0029:
            com.yandex.metrica.impl.ob.t0<CHOSEN> r4 = r6.f6670c     // Catch:{ all -> 0x0056 }
            STORAGE r5 = r6.i     // Catch:{ all -> 0x0056 }
            java.lang.Object r5 = r5.b()     // Catch:{ all -> 0x0056 }
            boolean r4 = r4.a(r7, r5)     // Catch:{ all -> 0x0056 }
            if (r4 == 0) goto L_0x0039
            r2 = 1
            goto L_0x0041
        L_0x0039:
            STORAGE r7 = r6.i     // Catch:{ all -> 0x0056 }
            java.lang.Object r7 = r7.b()     // Catch:{ all -> 0x0056 }
            com.yandex.metrica.impl.ob.v0 r7 = (com.yandex.metrica.impl.ob.C0760v0) r7     // Catch:{ all -> 0x0056 }
        L_0x0041:
            if (r2 != 0) goto L_0x0045
            if (r3 == 0) goto L_0x0054
        L_0x0045:
            com.yandex.metrica.impl.ob.r2<CANDIDATE, CHOSEN, STORAGE> r1 = r6.f6672e     // Catch:{ all -> 0x0056 }
            java.lang.Object r7 = r1.invoke(r7, r0)     // Catch:{ all -> 0x0056 }
            com.yandex.metrica.impl.ob.s0 r7 = (com.yandex.metrica.impl.ob.C0688s0) r7     // Catch:{ all -> 0x0056 }
            r6.i = r7     // Catch:{ all -> 0x0056 }
            com.yandex.metrica.core.api.ProtobufStateStorage<STORAGE> r0 = r6.f6669b     // Catch:{ all -> 0x0056 }
            r0.save(r7)     // Catch:{ all -> 0x0056 }
        L_0x0054:
            monitor-exit(r6)
            return r2
        L_0x0056:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0664r0.b(com.yandex.metrica.impl.ob.v0):boolean");
    }

    public final CHOSEN a(CHOSEN chosen) {
        CHOSEN c2;
        this.f6675h.a(this.f6668a);
        synchronized (this) {
            b(chosen);
            c2 = c();
        }
        return c2;
    }

    public final CHOSEN b() {
        this.f6675h.a(this.f6668a);
        return c();
    }
}
