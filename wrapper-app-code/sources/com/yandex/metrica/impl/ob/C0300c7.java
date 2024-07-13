package com.yandex.metrica.impl.ob;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.c7  reason: case insensitive filesystem */
public final class C0300c7 {

    /* renamed from: a  reason: collision with root package name */
    private final C0400g7 f5597a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5598b;

    public C0300c7() {
        this((C0400g7) null, (String) null, 3);
    }

    public C0300c7(C0400g7 g7Var, String str) {
        this.f5597a = g7Var;
        this.f5598b = str;
    }

    public final String a() {
        return this.f5598b;
    }

    public final C0400g7 b() {
        return this.f5597a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0300c7)) {
            return false;
        }
        C0300c7 c7Var = (C0300c7) obj;
        return Intrinsics.areEqual((Object) this.f5597a, (Object) c7Var.f5597a) && Intrinsics.areEqual((Object) this.f5598b, (Object) c7Var.f5598b);
    }

    public int hashCode() {
        C0400g7 g7Var = this.f5597a;
        int i = 0;
        int hashCode = (g7Var != null ? g7Var.hashCode() : 0) * 31;
        String str = this.f5598b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "NativeCrashHandlerDescription(source=" + this.f5597a + ", handlerVersion=" + this.f5598b + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0300c7(C0400g7 g7Var, String str, int i) {
        this((i & 1) != 0 ? C0400g7.UNKNOWN : null, (String) null);
    }
}
