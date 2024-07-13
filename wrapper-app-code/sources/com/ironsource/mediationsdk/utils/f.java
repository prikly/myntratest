package com.ironsource.mediationsdk.utils;

import java.util.Date;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private long f8910a = new Date().getTime();

    public static long a(f fVar) {
        if (fVar == null) {
            return 0;
        }
        return new Date().getTime() - fVar.f8910a;
    }
}
