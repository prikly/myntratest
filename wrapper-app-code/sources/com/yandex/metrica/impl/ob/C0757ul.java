package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.content.Context;
import com.yandex.metrica.core.api.executors.ICommonExecutor;

/* renamed from: com.yandex.metrica.impl.ob.ul  reason: case insensitive filesystem */
public class C0757ul implements C0414gl {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Xk f6947a;

    /* renamed from: b  reason: collision with root package name */
    private final Sk f6948b;

    /* renamed from: c  reason: collision with root package name */
    private final C0277b9 f6949c;

    /* renamed from: d  reason: collision with root package name */
    private final C0876zk f6950d;

    /* renamed from: e  reason: collision with root package name */
    private final Lk f6951e;

    /* renamed from: f  reason: collision with root package name */
    private Activity f6952f;

    /* renamed from: g  reason: collision with root package name */
    private C0389fl f6953g;

    /* renamed from: com.yandex.metrica.impl.ob.ul$a */
    class a implements C0564mm<Activity> {
        a() {
        }

        public void b(Object obj) {
            C0757ul.this.f6947a.a((Activity) obj);
        }
    }

    public C0757ul(Context context, C0277b9 b9Var, El el, ICommonExecutor iCommonExecutor, C0389fl flVar) {
        this(context, b9Var, el, iCommonExecutor, flVar, new C0876zk(flVar));
    }

    public synchronized void b(Activity activity) {
        this.f6952f = activity;
        this.f6947a.a(activity);
    }

    private C0757ul(Context context, C0277b9 b9Var, El el, ICommonExecutor iCommonExecutor, C0389fl flVar, C0876zk zkVar) {
        this(b9Var, el, flVar, zkVar, new C0512kk(1, b9Var), new Bl(iCommonExecutor, new C0537lk(b9Var), zkVar), new C0438hk(context));
    }

    public synchronized void a(Activity activity) {
        this.f6951e.a(activity);
        this.f6952f = null;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C0757ul(com.yandex.metrica.impl.ob.C0277b9 r10, com.yandex.metrica.impl.ob.El r11, com.yandex.metrica.impl.ob.C0389fl r12, com.yandex.metrica.impl.ob.C0876zk r13, com.yandex.metrica.impl.ob.C0512kk r14, com.yandex.metrica.impl.ob.Bl r15, com.yandex.metrica.impl.ob.C0438hk r16) {
        /*
            r9 = this;
            com.yandex.metrica.impl.ob.Xk r6 = new com.yandex.metrica.impl.ob.Xk
            r0 = r6
            r1 = r12
            r2 = r14
            r3 = r10
            r4 = r15
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            com.yandex.metrica.impl.ob.Sk r7 = new com.yandex.metrica.impl.ob.Sk
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            com.yandex.metrica.impl.ob.mk r8 = new com.yandex.metrica.impl.ob.mk
            r8.<init>()
            r0 = r9
            r1 = r10
            r2 = r12
            r3 = r11
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0757ul.<init>(com.yandex.metrica.impl.ob.b9, com.yandex.metrica.impl.ob.El, com.yandex.metrica.impl.ob.fl, com.yandex.metrica.impl.ob.zk, com.yandex.metrica.impl.ob.kk, com.yandex.metrica.impl.ob.Bl, com.yandex.metrica.impl.ob.hk):void");
    }

    C0757ul(C0277b9 b9Var, C0389fl flVar, El el, Bl bl, C0876zk zkVar, Xk xk, Sk sk, C0562mk mkVar) {
        this.f6949c = b9Var;
        this.f6953g = flVar;
        this.f6950d = zkVar;
        this.f6947a = xk;
        this.f6948b = sk;
        Lk lk = new Lk(new a(), el);
        this.f6951e = lk;
        bl.a(mkVar, lk);
    }

    public synchronized void a(C0538ll llVar, boolean z) {
        this.f6948b.a(this.f6952f, llVar, z);
        this.f6949c.c(true);
    }

    public synchronized void a(C0389fl flVar) {
        if (!flVar.equals(this.f6953g)) {
            this.f6950d.a(flVar);
            this.f6948b.a(flVar);
            this.f6947a.a(flVar);
            this.f6953g = flVar;
            Activity activity = this.f6952f;
            if (activity != null) {
                this.f6947a.b(activity);
            }
        }
    }
}
