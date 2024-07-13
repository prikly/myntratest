package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.io.File;

public class Eh {

    /* renamed from: a  reason: collision with root package name */
    private final Context f3959a;

    /* renamed from: b  reason: collision with root package name */
    private final Mh f3960b;

    /* renamed from: c  reason: collision with root package name */
    private final C0753uh f3961c;

    /* renamed from: d  reason: collision with root package name */
    private Jh f3962d;

    /* renamed from: e  reason: collision with root package name */
    private Jh f3963e;

    /* renamed from: f  reason: collision with root package name */
    private C0635pi f3964f;

    public Eh(Context context) {
        this(context, new Mh(), new C0753uh(context));
    }

    public synchronized void a(C0635pi piVar) {
        this.f3964f = piVar;
        Jh jh = this.f3962d;
        if (jh == null) {
            Mh mh = this.f3960b;
            Context context = this.f3959a;
            mh.getClass();
            this.f3962d = new Jh(context, piVar, new C0681rh(), new Kh(mh), new C0801wh("open", "http"), new C0801wh("port_already_in_use", "http"), "Http");
        } else {
            jh.a(piVar);
        }
        this.f3961c.a(piVar, this);
    }

    public synchronized void b() {
        Jh jh = this.f3962d;
        if (jh != null) {
            jh.b();
        }
        Jh jh2 = this.f3963e;
        if (jh2 != null) {
            jh2.b();
        }
    }

    Eh(Context context, Mh mh, C0753uh uhVar) {
        this.f3959a = context;
        this.f3960b = mh;
        this.f3961c = uhVar;
    }

    public synchronized void b(C0635pi piVar) {
        this.f3964f = piVar;
        this.f3961c.a(piVar, this);
        Jh jh = this.f3962d;
        if (jh != null) {
            jh.b(piVar);
        }
        Jh jh2 = this.f3963e;
        if (jh2 != null) {
            jh2.b(piVar);
        }
    }

    public synchronized void a() {
        Jh jh = this.f3962d;
        if (jh != null) {
            jh.a();
        }
        Jh jh2 = this.f3963e;
        if (jh2 != null) {
            jh2.a();
        }
    }

    public synchronized void a(File file) {
        Jh jh = this.f3963e;
        if (jh == null) {
            Mh mh = this.f3960b;
            Context context = this.f3959a;
            C0635pi piVar = this.f3964f;
            mh.getClass();
            this.f3963e = new Jh(context, piVar, new C0777vh(file), new Lh(mh), new C0801wh("open", "https"), new C0801wh("port_already_in_use", "https"), "Https");
        } else {
            jh.a(this.f3964f);
        }
    }
}
