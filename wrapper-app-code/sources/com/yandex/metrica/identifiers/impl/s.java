package com.yandex.metrica.identifiers.impl;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

public final class s {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final Intent f3668a;

    static {
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE").setPackage("com.huawei.hwid");
        Intrinsics.checkNotNullExpressionValue(intent, "Intent(\"com.uodis.opende…ackage(\"com.huawei.hwid\")");
        f3668a = intent;
    }
}
