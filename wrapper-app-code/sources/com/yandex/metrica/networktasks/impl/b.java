package com.yandex.metrica.networktasks.impl;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final String f7347a;

    public b(String str) {
        this.f7347a = a(str);
    }

    private final String a(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        Uri parse = Uri.parse(str);
        Intrinsics.checkNotNullExpressionValue(parse, "uri");
        return Intrinsics.areEqual((Object) "http", (Object) parse.getScheme()) ? parse.buildUpon().scheme("https").build().toString() : str;
    }

    public final String a() {
        return this.f7347a;
    }
}
