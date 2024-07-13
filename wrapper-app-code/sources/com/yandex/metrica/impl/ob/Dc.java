package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.location.LocationListener;
import android.os.Looper;
import java.util.concurrent.TimeUnit;

public abstract class Dc<T> {

    /* renamed from: e  reason: collision with root package name */
    static final long f3868e = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: a  reason: collision with root package name */
    protected final Context f3869a;

    /* renamed from: b  reason: collision with root package name */
    protected final C0869zd f3870b;

    /* renamed from: c  reason: collision with root package name */
    protected final LocationListener f3871c;

    /* renamed from: d  reason: collision with root package name */
    protected final Looper f3872d;

    public Dc(Context context, LocationListener locationListener, C0869zd zdVar, Looper looper) {
        this.f3869a = context;
        this.f3871c = locationListener;
        this.f3870b = zdVar;
        this.f3872d = looper;
    }

    public abstract void a();

    public abstract boolean a(T t);

    public abstract void b();
}
