package com.yandex.metrica.identifiers.impl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

public abstract class b extends Binder implements c {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f3644a = 0;

    public static c a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.yandex.android.advid.service.YandexAdvIdInterface");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof c)) ? new a(iBinder) : (c) queryLocalInterface;
    }
}
