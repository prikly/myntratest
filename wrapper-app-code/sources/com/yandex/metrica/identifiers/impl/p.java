package com.yandex.metrica.identifiers.impl;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

public final class p {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final Intent f3665a;

    static {
        Intent intent = new Intent("com.yandex.android.advid.IDENTIFIER_SERVICE").setPackage("com.yandex.android.advid");
        Intrinsics.checkNotNullExpressionValue(intent, "Intent(\"com.yandex.andro…om.yandex.android.advid\")");
        f3665a = intent;
    }
}
