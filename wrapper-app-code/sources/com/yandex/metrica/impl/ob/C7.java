package com.yandex.metrica.impl.ob;

import android.os.Process;

class C7 {

    /* renamed from: a  reason: collision with root package name */
    public final String f3809a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f3810b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f3811c;

    /* renamed from: d  reason: collision with root package name */
    public final C0624p7 f3812d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    C7(String str, boolean z, C0624p7 p7Var) {
        this(str, z, p7Var, A2.a(23) && Process.is64Bit());
    }

    C7(String str, boolean z, C0624p7 p7Var, boolean z2) {
        this.f3809a = str;
        this.f3811c = z;
        this.f3812d = p7Var;
        this.f3810b = z2;
    }
}
