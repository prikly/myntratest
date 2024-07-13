package com.yandex.metrica.impl.ob;

import android.os.Handler;
import android.os.Looper;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.core.api.executors.IHandlerExecutor;

public class Im {

    /* renamed from: a  reason: collision with root package name */
    private final Hm f4287a;

    /* renamed from: b  reason: collision with root package name */
    private volatile IHandlerExecutor f4288b;

    /* renamed from: c  reason: collision with root package name */
    private volatile ICommonExecutor f4289c;

    /* renamed from: d  reason: collision with root package name */
    private volatile ICommonExecutor f4290d;

    /* renamed from: e  reason: collision with root package name */
    private volatile Handler f4291e;

    public Im() {
        this(new Hm());
    }

    public ICommonExecutor a() {
        if (this.f4289c == null) {
            synchronized (this) {
                if (this.f4289c == null) {
                    this.f4287a.getClass();
                    this.f4289c = new Jm("YMM-APT");
                }
            }
        }
        return this.f4289c;
    }

    public IHandlerExecutor b() {
        if (this.f4288b == null) {
            synchronized (this) {
                if (this.f4288b == null) {
                    this.f4287a.getClass();
                    this.f4288b = new Jm("YMM-YM");
                }
            }
        }
        return this.f4288b;
    }

    public Handler c() {
        if (this.f4291e == null) {
            synchronized (this) {
                if (this.f4291e == null) {
                    this.f4287a.getClass();
                    this.f4291e = new Handler(Looper.getMainLooper());
                }
            }
        }
        return this.f4291e;
    }

    public ICommonExecutor d() {
        if (this.f4290d == null) {
            synchronized (this) {
                if (this.f4290d == null) {
                    this.f4287a.getClass();
                    this.f4290d = new Jm("YMM-RS");
                }
            }
        }
        return this.f4290d;
    }

    Im(Hm hm) {
        this.f4287a = hm;
    }
}
