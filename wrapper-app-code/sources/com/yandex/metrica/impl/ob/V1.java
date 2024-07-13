package com.yandex.metrica.impl.ob;

import android.content.Context;

public abstract class V1<T> {

    /* renamed from: a  reason: collision with root package name */
    protected final Context f5202a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5203b;

    /* renamed from: c  reason: collision with root package name */
    private final String f5204c;

    public V1(Context context, String str, String str2) {
        this.f5202a = context;
        this.f5203b = str;
        this.f5204c = str2;
    }

    public T a() {
        int identifier = this.f5202a.getResources().getIdentifier(this.f5203b, this.f5204c, this.f5202a.getPackageName());
        if (identifier == 0) {
            return null;
        }
        try {
            return a(identifier);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public abstract T a(int i);
}
