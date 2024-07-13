package com.yandex.metrica.impl.ob;

import com.yandex.metrica.b;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.c2  reason: case insensitive filesystem */
public final class C0295c2 {

    /* renamed from: a  reason: collision with root package name */
    private final int f5584a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5585b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5586c;

    /* renamed from: d  reason: collision with root package name */
    private final float f5587d;

    /* renamed from: e  reason: collision with root package name */
    private final b f5588e;

    public C0295c2(int i, int i2, int i3, float f2, b bVar) {
        this.f5584a = i;
        this.f5585b = i2;
        this.f5586c = i3;
        this.f5587d = f2;
        this.f5588e = bVar;
    }

    public final b a() {
        return this.f5588e;
    }

    public final int b() {
        return this.f5586c;
    }

    public final int c() {
        return this.f5585b;
    }

    public final float d() {
        return this.f5587d;
    }

    public final int e() {
        return this.f5584a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0295c2)) {
            return false;
        }
        C0295c2 c2Var = (C0295c2) obj;
        return this.f5584a == c2Var.f5584a && this.f5585b == c2Var.f5585b && this.f5586c == c2Var.f5586c && Float.compare(this.f5587d, c2Var.f5587d) == 0 && Intrinsics.areEqual((Object) this.f5588e, (Object) c2Var.f5588e);
    }

    public int hashCode() {
        int floatToIntBits = ((((((this.f5584a * 31) + this.f5585b) * 31) + this.f5586c) * 31) + Float.floatToIntBits(this.f5587d)) * 31;
        b bVar = this.f5588e;
        return floatToIntBits + (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "ScreenInfo(width=" + this.f5584a + ", height=" + this.f5585b + ", dpi=" + this.f5586c + ", scaleFactor=" + this.f5587d + ", deviceType=" + this.f5588e + ")";
    }
}
