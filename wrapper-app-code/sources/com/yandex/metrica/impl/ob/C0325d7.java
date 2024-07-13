package com.yandex.metrica.impl.ob;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.d7  reason: case insensitive filesystem */
public final class C0325d7 {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f5649a;

    /* renamed from: b  reason: collision with root package name */
    private final C0300c7 f5650b;

    public C0325d7(byte[] bArr, C0300c7 c7Var) {
        this.f5649a = bArr;
        this.f5650b = c7Var;
    }

    public final byte[] a() {
        return this.f5649a;
    }

    public final C0300c7 b() {
        return this.f5650b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0325d7)) {
            return false;
        }
        C0325d7 d7Var = (C0325d7) obj;
        return Intrinsics.areEqual((Object) this.f5649a, (Object) d7Var.f5649a) && Intrinsics.areEqual((Object) this.f5650b, (Object) d7Var.f5650b);
    }

    public int hashCode() {
        byte[] bArr = this.f5649a;
        int i = 0;
        int hashCode = (bArr != null ? Arrays.hashCode(bArr) : 0) * 31;
        C0300c7 c7Var = this.f5650b;
        if (c7Var != null) {
            i = c7Var.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "NativeCrashModel(data=" + Arrays.toString(this.f5649a) + ", handlerDescription=" + this.f5650b + ")";
    }
}
