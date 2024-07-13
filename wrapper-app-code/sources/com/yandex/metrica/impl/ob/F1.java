package com.yandex.metrica.impl.ob;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

public class F1 {

    /* renamed from: a  reason: collision with root package name */
    private final int f3981a;

    /* renamed from: b  reason: collision with root package name */
    private final int f3982b;

    /* renamed from: c  reason: collision with root package name */
    private final int f3983c;

    public F1(int i, int i2, int i3) {
        this.f3981a = i;
        this.f3982b = i2;
        this.f3983c = i3;
    }

    public final int a(Boolean bool) {
        if (bool == null) {
            return this.f3981a;
        }
        if (Intrinsics.areEqual((Object) bool, (Object) Boolean.FALSE)) {
            return this.f3982b;
        }
        if (Intrinsics.areEqual((Object) bool, (Object) Boolean.TRUE)) {
            return this.f3983c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Boolean a(int i) {
        if (i == this.f3982b) {
            return Boolean.FALSE;
        }
        if (i == this.f3983c) {
            return Boolean.TRUE;
        }
        return null;
    }
}
