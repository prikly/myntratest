package com.yandex.metrica.networktasks.impl;

import kotlin.jvm.internal.Intrinsics;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final h f7352a;

    public g() {
        this(new h());
    }

    public g(h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "timeProvider");
        this.f7352a = hVar;
    }

    public final boolean a(long j, long j2, String str) {
        Intrinsics.checkNotNullParameter(str, "tag");
        this.f7352a.getClass();
        long currentTimeMillis = System.currentTimeMillis() / ((long) 1000);
        return currentTimeMillis < j || currentTimeMillis - j >= j2;
    }
}
