package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufStateStorage;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.networktasks.api.CacheControlHttpsConnectionPerformer;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.bh  reason: case insensitive filesystem */
public class C0285bh {

    /* renamed from: a  reason: collision with root package name */
    private ICommonExecutor f5539a;

    /* renamed from: b  reason: collision with root package name */
    private final ProtobufStateStorage<C0360eh> f5540b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public b f5541c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public C0769v9 f5542d;

    /* renamed from: e  reason: collision with root package name */
    private final CacheControlHttpsConnectionPerformer f5543e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final SystemTimeProvider f5544f;

    /* renamed from: g  reason: collision with root package name */
    private final C0605od f5545g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public String f5546h;

    /* renamed from: com.yandex.metrica.impl.ob.bh$a */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0260ah f5547a;

        a(C0260ah ahVar) {
            this.f5547a = ahVar;
        }

        public void run() {
            C0285bh bhVar = C0285bh.this;
            C0285bh.a(bhVar, this.f5547a, bhVar.f5546h);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.bh$b */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final C0459ih f5549a;

        public b() {
            this(new C0459ih());
        }

        public List<C0435hh> a(byte[] bArr) {
            ArrayList arrayList = new ArrayList();
            if (A2.a(bArr)) {
                return arrayList;
            }
            try {
                return this.f5549a.a(new String(bArr, "UTF-8"));
            } catch (UnsupportedEncodingException unused) {
                return arrayList;
            }
        }

        b(C0459ih ihVar) {
            this.f5549a = ihVar;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0285bh(android.content.Context r10, java.lang.String r11, com.yandex.metrica.core.api.executors.ICommonExecutor r12) {
        /*
            r9 = this;
            java.lang.Class<com.yandex.metrica.impl.ob.eh> r11 = com.yandex.metrica.impl.ob.C0360eh.class
            com.yandex.metrica.impl.ob.fa r11 = com.yandex.metrica.impl.ob.C0378fa.b.a(r11)
            com.yandex.metrica.core.api.ProtobufStateStorage r2 = r11.a(r10)
            com.yandex.metrica.impl.ob.bh$b r3 = new com.yandex.metrica.impl.ob.bh$b
            r3.<init>()
            com.yandex.metrica.networktasks.api.CacheControlHttpsConnectionPerformer r4 = new com.yandex.metrica.networktasks.api.CacheControlHttpsConnectionPerformer
            com.yandex.metrica.impl.ob.F0 r11 = com.yandex.metrica.impl.ob.F0.g()
            com.yandex.metrica.impl.ob.sd r11 = r11.t()
            r11.getClass()
            r11 = 0
            r4.<init>(r11)
            com.yandex.metrica.impl.ob.v9 r6 = new com.yandex.metrica.impl.ob.v9
            r6.<init>()
            com.yandex.metrica.coreutils.services.SystemTimeProvider r7 = new com.yandex.metrica.coreutils.services.SystemTimeProvider
            r7.<init>()
            com.yandex.metrica.impl.ob.od r8 = new com.yandex.metrica.impl.ob.od
            r8.<init>(r10)
            r1 = 0
            r0 = r9
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0285bh.<init>(android.content.Context, java.lang.String, com.yandex.metrica.core.api.executors.ICommonExecutor):void");
    }

    public void a(C0260ah ahVar) {
        this.f5539a.execute(new a(ahVar));
    }

    public boolean b(C0635pi piVar) {
        String str = this.f5546h;
        if (str != null) {
            return !str.equals(piVar.L());
        }
        if (piVar.L() != null) {
            return true;
        }
        return false;
    }

    static void a(C0285bh bhVar, C0260ah ahVar, String str) {
        if (bhVar.f5545g.canBeExecuted() && str != null) {
            bhVar.f5543e.performConnection(str, new C0310ch(bhVar, (C0360eh) bhVar.f5540b.read(), ahVar));
        }
    }

    C0285bh(String str, ProtobufStateStorage protobufStateStorage, b bVar, CacheControlHttpsConnectionPerformer cacheControlHttpsConnectionPerformer, ICommonExecutor iCommonExecutor, C0769v9 v9Var, SystemTimeProvider systemTimeProvider, C0605od odVar) {
        this.f5546h = str;
        this.f5540b = protobufStateStorage;
        this.f5541c = bVar;
        this.f5543e = cacheControlHttpsConnectionPerformer;
        this.f5539a = iCommonExecutor;
        this.f5542d = v9Var;
        this.f5544f = systemTimeProvider;
        this.f5545g = odVar;
    }

    public void a(C0635pi piVar) {
        if (piVar != null) {
            this.f5546h = piVar.L();
        }
    }
}
