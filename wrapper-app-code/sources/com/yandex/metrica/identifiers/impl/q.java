package com.yandex.metrica.identifiers.impl;

import android.os.IBinder;
import android.os.IInterface;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

final class q extends Lambda implements Function1 {

    /* renamed from: a  reason: collision with root package name */
    public static final q f3666a = new q();

    q() {
        super(1);
    }

    public Object invoke(Object obj) {
        v vVar;
        IBinder iBinder = (IBinder) obj;
        Intrinsics.checkNotNullParameter(iBinder, "it");
        int i = u.f3670a;
        if (iBinder == null) {
            vVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            vVar = (queryLocalInterface == null || !(queryLocalInterface instanceof v)) ? new t(iBinder) : (v) queryLocalInterface;
        }
        Intrinsics.checkNotNullExpressionValue(vVar, "OpenDeviceIdentifierService.Stub.asInterface(it)");
        return vVar;
    }
}
