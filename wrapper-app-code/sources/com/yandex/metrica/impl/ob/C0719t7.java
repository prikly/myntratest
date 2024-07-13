package com.yandex.metrica.impl.ob;

import android.os.Bundle;
import android.text.TextUtils;
import com.yandex.metrica.impl.ac.CrashpadServiceHelper;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.yandex.metrica.impl.ob.t7  reason: case insensitive filesystem */
public class C0719t7 implements C0350e7<String> {

    /* renamed from: a  reason: collision with root package name */
    private final C0767v7 f6811a;

    /* renamed from: b  reason: collision with root package name */
    private final C0589nm<String, Bundle> f6812b;

    /* renamed from: c  reason: collision with root package name */
    private final Callable<List<Bundle>> f6813c;

    /* renamed from: d  reason: collision with root package name */
    private final C0564mm<String> f6814d;

    /* renamed from: e  reason: collision with root package name */
    private final C0695s7 f6815e;

    /* renamed from: com.yandex.metrica.impl.ob.t7$a */
    class a implements C0589nm<String, Bundle> {
        a() {
        }

        public Object a(Object obj) {
            return CrashpadServiceHelper.readCrash((String) obj);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.t7$b */
    class b implements Callable<List<Bundle>> {
        b() {
        }

        public Object call() throws Exception {
            return CrashpadServiceHelper.readOldCrashes();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.t7$c */
    class c implements C0564mm<String> {
        c() {
        }

        public void b(Object obj) {
            CrashpadServiceHelper.a((String) obj);
        }
    }

    public C0719t7(C0767v7 v7Var) {
        this(v7Var, new C0695s7(), new a(), new b(), new c());
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.Object r3) {
        /*
            r2 = this;
            java.lang.String r3 = (java.lang.String) r3
            com.yandex.metrica.impl.ob.nm<java.lang.String, android.os.Bundle> r0 = r2.f6812b     // Catch:{ all -> 0x0013 }
            java.lang.Object r0 = r0.a(r3)     // Catch:{ all -> 0x0013 }
            android.os.Bundle r0 = (android.os.Bundle) r0     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x0013
            com.yandex.metrica.impl.ob.s7 r1 = r2.f6815e     // Catch:{ all -> 0x0013 }
            com.yandex.metrica.impl.ob.r7 r0 = r1.a((java.lang.String) r3, (android.os.Bundle) r0)     // Catch:{ all -> 0x0013 }
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 == 0) goto L_0x001c
            com.yandex.metrica.impl.ob.v7 r3 = r2.f6811a
            r3.a((com.yandex.metrica.impl.ob.C0671r7) r0)
            goto L_0x0021
        L_0x001c:
            com.yandex.metrica.impl.ob.mm<java.lang.String> r0 = r2.f6814d
            r0.b(r3)
        L_0x0021:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0719t7.a(java.lang.Object):void");
    }

    public C0719t7(C0767v7 v7Var, C0695s7 s7Var, C0589nm<String, Bundle> nmVar, Callable<List<Bundle>> callable, C0564mm<String> mmVar) {
        this.f6811a = v7Var;
        this.f6815e = s7Var;
        this.f6812b = nmVar;
        this.f6813c = callable;
        this.f6814d = mmVar;
    }

    public void a() {
        try {
            for (Bundle bundle : this.f6813c.call()) {
                String string = bundle.getString("arg_ui");
                if (!TextUtils.isEmpty(string)) {
                    C0671r7 a2 = this.f6815e.a(string, bundle);
                    if (a2 != null) {
                        this.f6811a.b(a2);
                    } else {
                        this.f6814d.b(string);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }
}
