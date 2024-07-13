package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.rtm.wrapper.i;
import com.yandex.metrica.rtm.wrapper.j;
import java.io.File;

public class Zg {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final B0 f5422a;

    class a implements i {
        a() {
        }

        public File getCrashesDirectory(Context context) {
            return Zg.this.f5422a.a(context, "appmetrica_rtm_crashes");
        }

        public File getCrashesTriggerDirectory(Context context) {
            return Zg.this.f5422a.a(context, "appmetrica_rtm_crashes_triggers");
        }
    }

    class b implements j {
        b(Zg zg) {
        }

        public String getDeviceType(Context context) {
            com.yandex.metrica.b a2 = F0.g().n().a().a();
            if (a2 == null) {
                return null;
            }
            return a2.a();
        }

        public String getVersion(Context context) {
            return A2.a(context, context.getPackageName());
        }
    }

    class c implements i {
        c() {
        }

        public File getCrashesDirectory(Context context) {
            return Zg.this.f5422a.a(context, "appmetrica_rtm_crashes");
        }

        public File getCrashesTriggerDirectory(Context context) {
            return Zg.this.f5422a.a(context, "appmetrica_rtm_crashes_triggers");
        }
    }

    public Zg() {
        this(new B0());
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.yandex.metrica.rtm.wrapper.f b(android.content.Context r5) {
        /*
            r4 = this;
            java.lang.String r0 = "com.yandex.metrica.rtm.client.ExceptionProcessor"
            boolean r0 = com.yandex.metrica.impl.ob.C0420h2.a((java.lang.String) r0)
            if (r0 == 0) goto L_0x0024
            com.yandex.metrica.rtm.wrapper.l r0 = new com.yandex.metrica.rtm.wrapper.l     // Catch:{ all -> 0x0024 }
            com.yandex.metrica.impl.ob.Zg$a r1 = new com.yandex.metrica.impl.ob.Zg$a     // Catch:{ all -> 0x0024 }
            r1.<init>()     // Catch:{ all -> 0x0024 }
            com.yandex.metrica.impl.ob.F0 r2 = com.yandex.metrica.impl.ob.F0.g()     // Catch:{ all -> 0x0024 }
            com.yandex.metrica.impl.ob.Pm r2 = r2.q()     // Catch:{ all -> 0x0024 }
            com.yandex.metrica.core.api.executors.ICommonExecutor r2 = r2.f()     // Catch:{ all -> 0x0024 }
            com.yandex.metrica.impl.ob.Zg$b r3 = new com.yandex.metrica.impl.ob.Zg$b     // Catch:{ all -> 0x0024 }
            r3.<init>(r4)     // Catch:{ all -> 0x0024 }
            r0.<init>(r1, r5, r2, r3)     // Catch:{ all -> 0x0024 }
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            if (r0 != 0) goto L_0x002c
            com.yandex.metrica.impl.ob.Wg r0 = new com.yandex.metrica.impl.ob.Wg
            r0.<init>()
        L_0x002c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.Zg.b(android.content.Context):com.yandex.metrica.rtm.wrapper.f");
    }

    Zg(B0 b0) {
        this.f5422a = b0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARNING: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.yandex.metrica.rtm.wrapper.e a(android.content.Context r3) {
        /*
            r2 = this;
            java.lang.String r0 = "com.yandex.metrica.rtm.client.ExceptionProcessor"
            boolean r0 = com.yandex.metrica.impl.ob.C0420h2.a((java.lang.String) r0)
            if (r0 == 0) goto L_0x0013
            com.yandex.metrica.rtm.wrapper.h r0 = new com.yandex.metrica.rtm.wrapper.h     // Catch:{ all -> 0x0013 }
            com.yandex.metrica.impl.ob.Zg$c r1 = new com.yandex.metrica.impl.ob.Zg$c     // Catch:{ all -> 0x0013 }
            r1.<init>()     // Catch:{ all -> 0x0013 }
            r0.<init>(r1, r3)     // Catch:{ all -> 0x0013 }
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 != 0) goto L_0x001b
            com.yandex.metrica.impl.ob.Vg r0 = new com.yandex.metrica.impl.ob.Vg
            r0.<init>()
        L_0x001b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.Zg.a(android.content.Context):com.yandex.metrica.rtm.wrapper.e");
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.yandex.metrica.rtm.wrapper.d a(com.yandex.metrica.rtm.wrapper.k r2, java.lang.String r3, boolean r4) {
        /*
            r1 = this;
            java.lang.String r0 = "com.yandex.metrica.rtm.client.ExceptionProcessor"
            boolean r0 = com.yandex.metrica.impl.ob.C0420h2.a((java.lang.String) r0)
            if (r0 == 0) goto L_0x000e
            com.yandex.metrica.rtm.wrapper.g r0 = new com.yandex.metrica.rtm.wrapper.g     // Catch:{ all -> 0x000e }
            r0.<init>(r2, r3, r4)     // Catch:{ all -> 0x000e }
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            if (r0 != 0) goto L_0x0016
            com.yandex.metrica.impl.ob.Ug r0 = new com.yandex.metrica.impl.ob.Ug
            r0.<init>()
        L_0x0016:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.Zg.a(com.yandex.metrica.rtm.wrapper.k, java.lang.String, boolean):com.yandex.metrica.rtm.wrapper.d");
    }
}
