package com.bytedance.sdk.component.b.a.b;

/* compiled from: Segment */
final class e {

    /* renamed from: a  reason: collision with root package name */
    final byte[] f18873a;

    /* renamed from: b  reason: collision with root package name */
    int f18874b;

    /* renamed from: c  reason: collision with root package name */
    int f18875c;

    /* renamed from: d  reason: collision with root package name */
    boolean f18876d;

    /* renamed from: e  reason: collision with root package name */
    boolean f18877e;

    /* renamed from: f  reason: collision with root package name */
    e f18878f;

    /* renamed from: g  reason: collision with root package name */
    e f18879g;

    e() {
        this.f18873a = new byte[8192];
        this.f18877e = true;
        this.f18876d = false;
    }

    e(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.f18873a = bArr;
        this.f18874b = i;
        this.f18875c = i2;
        this.f18876d = z;
        this.f18877e = z2;
    }

    /* access modifiers changed from: package-private */
    public final e a() {
        this.f18876d = true;
        return new e(this.f18873a, this.f18874b, this.f18875c, true, false);
    }

    public final e b() {
        e eVar = this.f18878f;
        if (eVar == this) {
            eVar = null;
        }
        e eVar2 = this.f18879g;
        if (eVar2 != null) {
            eVar2.f18878f = this.f18878f;
        }
        e eVar3 = this.f18878f;
        if (eVar3 != null) {
            eVar3.f18879g = this.f18879g;
        }
        this.f18878f = null;
        this.f18879g = null;
        return eVar;
    }

    public final e a(e eVar) {
        eVar.f18879g = this;
        eVar.f18878f = this.f18878f;
        this.f18878f.f18879g = eVar;
        this.f18878f = eVar;
        return eVar;
    }
}
