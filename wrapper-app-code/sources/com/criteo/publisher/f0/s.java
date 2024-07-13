package com.criteo.publisher.f0;

import android.content.Context;
import com.criteo.publisher.n0.g;
import com.criteo.publisher.s;

/* compiled from: MetricRepositoryFactory */
public class s implements s.a<r> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2493a;

    /* renamed from: b  reason: collision with root package name */
    private final q f2494b;

    /* renamed from: c  reason: collision with root package name */
    private final g f2495c;

    public s(Context context, q qVar, g gVar) {
        this.f2493a = context;
        this.f2494b = qVar;
        this.f2495c = gVar;
    }

    /* renamed from: b */
    public r a() {
        return new i(new m(new o(this.f2493a, this.f2495c, this.f2494b)), this.f2495c);
    }
}
