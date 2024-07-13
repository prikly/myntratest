package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.coreutils.services.TimeProvider;

/* renamed from: com.yandex.metrica.impl.ob.ta  reason: case insensitive filesystem */
public class C0722ta<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f6816a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6817b;

    /* renamed from: c  reason: collision with root package name */
    private final C0698sa<T> f6818c;

    /* renamed from: d  reason: collision with root package name */
    private final C0589nm<C0674ra, C0651qa> f6819d;

    /* renamed from: e  reason: collision with root package name */
    private final C0794wa f6820e;

    /* renamed from: f  reason: collision with root package name */
    private final C0770va f6821f;

    /* renamed from: g  reason: collision with root package name */
    private final M0 f6822g;

    /* renamed from: h  reason: collision with root package name */
    private final TimeProvider f6823h;

    public C0722ta(Context context, Q0 q0, String str, C0698sa<T> saVar, C0589nm<C0674ra, C0651qa> nmVar, C0794wa waVar) {
        this(context, str, saVar, nmVar, waVar, new C0770va(context, str, waVar, q0), C0609oh.a(), new SystemTimeProvider());
    }

    public synchronized void a(T t, C0674ra raVar) {
        if (this.f6821f.a(this.f6819d.a(raVar))) {
            this.f6822g.a(this.f6817b, this.f6818c.a(t));
            this.f6820e.a(new Z8(C0477ja.a(this.f6816a).g()), this.f6823h.currentTimeSeconds());
        }
    }

    public C0722ta(Context context, String str, C0698sa<T> saVar, C0589nm<C0674ra, C0651qa> nmVar, C0794wa waVar, C0770va vaVar, M0 m0, TimeProvider timeProvider) {
        this.f6816a = context;
        this.f6817b = str;
        this.f6818c = saVar;
        this.f6819d = nmVar;
        this.f6820e = waVar;
        this.f6821f = vaVar;
        this.f6822g = m0;
        this.f6823h = timeProvider;
    }
}
