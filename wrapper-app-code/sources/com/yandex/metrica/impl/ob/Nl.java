package com.yandex.metrica.impl.ob;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class Nl {

    /* renamed from: c  reason: collision with root package name */
    public static final a f4624c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final long f4625a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4626b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Nl(long j, int i) {
        this.f4625a = j;
        this.f4626b = i;
    }

    public final int a() {
        return this.f4626b;
    }

    public final long b() {
        return this.f4625a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Nl)) {
            return false;
        }
        Nl nl = (Nl) obj;
        return this.f4625a == nl.f4625a && this.f4626b == nl.f4626b;
    }

    public int hashCode() {
        long j = this.f4625a;
        return (((int) (j ^ (j >>> 32))) * 31) + this.f4626b;
    }

    public String toString() {
        return "DecimalProtoModel(mantissa=" + this.f4625a + ", exponent=" + this.f4626b + ")";
    }
}
