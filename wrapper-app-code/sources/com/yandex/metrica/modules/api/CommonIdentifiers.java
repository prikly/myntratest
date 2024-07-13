package com.yandex.metrica.modules.api;

import kotlin.jvm.internal.Intrinsics;

public final class CommonIdentifiers {

    /* renamed from: a  reason: collision with root package name */
    private final String f7252a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7253b;

    public CommonIdentifiers(String str, String str2) {
        this.f7252a = str;
        this.f7253b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonIdentifiers)) {
            return false;
        }
        CommonIdentifiers commonIdentifiers = (CommonIdentifiers) obj;
        return Intrinsics.areEqual((Object) this.f7252a, (Object) commonIdentifiers.f7252a) && Intrinsics.areEqual((Object) this.f7253b, (Object) commonIdentifiers.f7253b);
    }

    public int hashCode() {
        String str = this.f7252a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f7253b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "CommonIdentifiers(uuid=" + this.f7252a + ", device=" + this.f7253b + ")";
    }
}
