package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.content.Context;
import com.yandex.metrica.impl.ob.C0616p;
import java.lang.ref.WeakReference;

/* renamed from: com.yandex.metrica.impl.ob.f2  reason: case insensitive filesystem */
public class C0370f2 implements C0616p.b {

    /* renamed from: g  reason: collision with root package name */
    private static volatile C0370f2 f5781g;

    /* renamed from: a  reason: collision with root package name */
    private final Context f5782a;

    /* renamed from: b  reason: collision with root package name */
    private C0295c2 f5783b;

    /* renamed from: c  reason: collision with root package name */
    private WeakReference<Activity> f5784c = new WeakReference<>((Object) null);

    /* renamed from: d  reason: collision with root package name */
    private final C0277b9 f5785d;

    /* renamed from: e  reason: collision with root package name */
    private final C0320d2 f5786e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f5787f;

    C0370f2(Context context, C0277b9 b9Var, C0320d2 d2Var) {
        this.f5782a = context;
        this.f5785d = b9Var;
        this.f5786e = d2Var;
        this.f5783b = b9Var.s();
        this.f5787f = b9Var.x();
        P.g().a().a((C0616p.b) this);
    }

    public static C0370f2 a(Context context) {
        if (f5781g == null) {
            synchronized (C0370f2.class) {
                if (f5781g == null) {
                    f5781g = new C0370f2(context, new C0277b9(C0477ja.a(context).c()), new C0320d2());
                }
            }
        }
        return f5781g;
    }

    private void b(Context context) {
        C0295c2 a2;
        if (context != null && (a2 = this.f5786e.a(context)) != null && !a2.equals(this.f5783b)) {
            this.f5783b = a2;
            this.f5785d.a(a2);
        }
    }

    public synchronized C0295c2 a() {
        b((Context) this.f5784c.get());
        if (this.f5783b == null) {
            if (!A2.a(30)) {
                b(this.f5782a);
            } else if (!this.f5787f) {
                b(this.f5782a);
                this.f5787f = true;
                this.f5785d.z();
            }
        }
        return this.f5783b;
    }

    public synchronized void a(Activity activity) {
        this.f5784c = new WeakReference<>(activity);
        if (this.f5783b == null) {
            b(activity);
        }
    }
}
