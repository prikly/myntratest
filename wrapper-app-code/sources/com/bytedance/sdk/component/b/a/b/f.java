package com.bytedance.sdk.component.b.a.b;

/* compiled from: SegmentPool */
final class f {

    /* renamed from: a  reason: collision with root package name */
    static e f18880a;

    /* renamed from: b  reason: collision with root package name */
    static long f18881b;

    private f() {
    }

    static e a() {
        synchronized (f.class) {
            if (f18880a == null) {
                return new e();
            }
            e eVar = f18880a;
            f18880a = eVar.f18878f;
            eVar.f18878f = null;
            f18881b -= 8192;
            return eVar;
        }
    }

    static void a(e eVar) {
        if (eVar.f18878f != null || eVar.f18879g != null) {
            throw new IllegalArgumentException();
        } else if (!eVar.f18876d) {
            synchronized (f.class) {
                if (f18881b + 8192 <= 65536) {
                    f18881b += 8192;
                    eVar.f18878f = f18880a;
                    eVar.f18875c = 0;
                    eVar.f18874b = 0;
                    f18880a = eVar;
                }
            }
        }
    }
}
