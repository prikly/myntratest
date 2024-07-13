package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.content.Context;

public final class Z<T> {

    /* renamed from: a  reason: collision with root package name */
    private final W<T> f5389a;

    /* renamed from: b  reason: collision with root package name */
    private final X<T> f5390b;

    /* renamed from: c  reason: collision with root package name */
    private final E0 f5391c;

    /* renamed from: d  reason: collision with root package name */
    private final String f5392d;

    public Z(W<T> w, X<T> x, E0 e0, String str) {
        this.f5389a = w;
        this.f5390b = x;
        this.f5391c = e0;
        this.f5392d = str;
    }

    public final void a(Context context, ContentValues contentValues) {
        try {
            Object invoke = this.f5389a.invoke(contentValues);
            if (invoke != null) {
                this.f5391c.a(context);
                if (((Boolean) this.f5390b.invoke(invoke)).booleanValue()) {
                    C0420h2.a("Successfully saved " + this.f5392d, new Object[0]);
                    return;
                }
                C0420h2.b("Did not save " + this.f5392d + " because data is already present", new Object[0]);
            }
        } catch (Throwable th) {
            C0420h2.a(th, "Unexpected error occurred", new Object[0]);
        }
    }
}
