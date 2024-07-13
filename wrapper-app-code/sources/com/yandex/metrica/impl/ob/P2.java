package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Handler;
import com.yandex.metrica.c;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.core.api.executors.IHandlerExecutor;
import com.yandex.metrica.i;
import com.yandex.metrica.impl.ob.C0838y6;
import com.yandex.metrica.impl.ob.Z0;
import com.yandex.metrica.rtm.wrapper.e;
import java.lang.Thread;
import java.util.Arrays;
import java.util.Map;

public class P2 implements S0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4742a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f4743b;

    /* renamed from: c  reason: collision with root package name */
    private final Q f4744c;

    /* renamed from: d  reason: collision with root package name */
    private final C0819xb f4745d;

    /* renamed from: e  reason: collision with root package name */
    private final ICommonExecutor f4746e;

    /* renamed from: f  reason: collision with root package name */
    private final C0735u f4747f;

    /* renamed from: g  reason: collision with root package name */
    private volatile C1 f4748g;

    /* renamed from: h  reason: collision with root package name */
    private C0838y6 f4749h;
    private final e i;
    private final C0419h1 j;
    private boolean k;

    P2(Context context, Im im) {
        this(context.getApplicationContext(), im.b(), im.a());
    }

    private void e() {
        if (Z0.a("com.yandex.metrica.CounterConfiguration")) {
            this.f4746e.execute(new Yl(this.f4742a));
            return;
        }
        throw new Z0.a("\nClass com.yandex.metrica.CounterConfiguration isn't found.\nPerhaps this is due to obfuscation.\nIf you build your application with ProGuard,\nyou need to keep the Metrica for Apps.\nPlease try to use the following lines of code:\n##########################################\n-keep class com.yandex.metrica.** { *; }\n-dontwarn com.yandex.metrica.**\n##########################################");
    }

    public synchronized void a(i iVar, O0 o0) {
        if (!this.k) {
            Boolean bool = iVar.crashReporting;
            Boolean bool2 = Boolean.TRUE;
            if (bool == null) {
                bool = bool2;
            }
            if (bool.booleanValue() && this.f4748g == null) {
                Xg xg = new Xg(this.i);
                C6 c6 = new C6(this.f4742a, new C0834y2(o0, "20799a27-fa80-4b36-b2db-0f8141f24180"), (C0838y6.a) new M2(this), (c) null);
                C6 c62 = new C6(this.f4742a, new C0834y2(o0, "0e5e9c33-f8c3-4568-86c5-2e4f57523f72"), (C0838y6.a) new N2(this), (c) null);
                if (this.f4749h == null) {
                    this.f4749h = new C6(this.f4742a, (C0834y2) new C0444i1(o0, iVar), (C0838y6.a) new O2(this), iVar.l);
                }
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                this.f4748g = new C1(defaultUncaughtExceptionHandler, Arrays.asList(new A6[]{xg, c6, c62, this.f4749h}), P.g().j(), new C0446i3(), new C0495k3());
                Thread.setDefaultUncaughtExceptionHandler(this.f4748g);
            }
            Boolean bool3 = iVar.appOpenTrackingEnabled;
            if (bool3 != null) {
                bool2 = bool3;
            }
            if (bool2.booleanValue()) {
                this.f4747f.a();
            }
            this.k = true;
        }
    }

    public ICommonExecutor b() {
        return this.f4746e;
    }

    public Handler c() {
        return this.f4743b;
    }

    public Eb d() {
        return this.f4745d;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private P2(android.content.Context r9, com.yandex.metrica.core.api.executors.IHandlerExecutor r10, com.yandex.metrica.core.api.executors.ICommonExecutor r11) {
        /*
            r8 = this;
            com.yandex.metrica.impl.ob.xb r6 = new com.yandex.metrica.impl.ob.xb
            com.yandex.metrica.impl.ob.xb$c r1 = new com.yandex.metrica.impl.ob.xb$c
            r1.<init>()
            com.yandex.metrica.impl.ob.xb$e r2 = new com.yandex.metrica.impl.ob.xb$e
            r2.<init>()
            com.yandex.metrica.impl.ob.xb$e r3 = new com.yandex.metrica.impl.ob.xb$e
            r3.<init>()
            java.lang.String r5 = "Client"
            r0 = r6
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            com.yandex.metrica.impl.ob.Q r4 = new com.yandex.metrica.impl.ob.Q
            r4.<init>()
            com.yandex.metrica.impl.ob.u r5 = new com.yandex.metrica.impl.ob.u
            r5.<init>(r11)
            com.yandex.metrica.impl.ob.Zg r11 = new com.yandex.metrica.impl.ob.Zg
            r11.<init>()
            com.yandex.metrica.impl.ob.h1 r7 = new com.yandex.metrica.impl.ob.h1
            r7.<init>()
            r0 = r8
            r1 = r9
            r2 = r6
            r3 = r10
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.P2.<init>(android.content.Context, com.yandex.metrica.core.api.executors.IHandlerExecutor, com.yandex.metrica.core.api.executors.ICommonExecutor):void");
    }

    P2(Context context, C0819xb xbVar, IHandlerExecutor iHandlerExecutor, Q q, C0735u uVar, Zg zg, C0419h1 h1Var) {
        this.k = false;
        this.f4742a = context;
        this.f4746e = iHandlerExecutor;
        this.f4747f = uVar;
        this.j = h1Var;
        Vl.a(context);
        C0420h2.b();
        this.f4745d = xbVar;
        xbVar.c(context);
        this.f4743b = iHandlerExecutor.getHandler();
        this.f4744c = q;
        q.a();
        this.i = zg.a(context);
        e();
    }

    public void a(Map<String, Object> map) {
        this.j.a(map);
    }

    public C0735u a() {
        return this.f4747f;
    }
}
