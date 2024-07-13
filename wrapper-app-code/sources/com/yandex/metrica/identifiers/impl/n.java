package com.yandex.metrica.identifiers.impl;

import android.os.IBinder;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

final class n extends Lambda implements Function1 {

    /* renamed from: a  reason: collision with root package name */
    public static final n f3663a = new n();

    n() {
        super(1);
    }

    public Object invoke(Object obj) {
        IBinder iBinder = (IBinder) obj;
        Intrinsics.checkNotNullParameter(iBinder, "it");
        c a2 = b.a(iBinder);
        Intrinsics.checkNotNullExpressionValue(a2, "YandexAdvIdInterface.Stub.asInterface(it)");
        return a2;
    }
}
