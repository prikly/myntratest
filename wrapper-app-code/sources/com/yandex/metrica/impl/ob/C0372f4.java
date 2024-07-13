package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.coreutils.services.TimeProvider;

/* renamed from: com.yandex.metrica.impl.ob.f4  reason: case insensitive filesystem */
public class C0372f4 {

    /* renamed from: a  reason: collision with root package name */
    private final C0302c9 f5788a;

    /* renamed from: b  reason: collision with root package name */
    private final TimeProvider f5789b;

    /* renamed from: c  reason: collision with root package name */
    private final C0810x2 f5790c;

    /* renamed from: d  reason: collision with root package name */
    private C0730ti f5791d;

    /* renamed from: e  reason: collision with root package name */
    private long f5792e;

    public C0372f4(Context context, I3 i3) {
        this(new C0302c9(C0477ja.a(context).b(i3)), new SystemTimeProvider(), new C0810x2());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r7 = r6.f5791d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(java.lang.Boolean r7) {
        /*
            r6 = this;
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto L_0x001c
            com.yandex.metrica.impl.ob.ti r7 = r6.f5791d
            if (r7 == 0) goto L_0x001c
            com.yandex.metrica.impl.ob.x2 r0 = r6.f5790c
            long r1 = r6.f5792e
            long r3 = r7.f6847a
            java.lang.String r5 = "should report diagnostic"
            boolean r7 = r0.a((long) r1, (long) r3, (java.lang.String) r5)
            if (r7 == 0) goto L_0x001c
            r7 = 1
            goto L_0x001d
        L_0x001c:
            r7 = 0
        L_0x001d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0372f4.a(java.lang.Boolean):boolean");
    }

    public C0372f4(C0302c9 c9Var, TimeProvider timeProvider, C0810x2 x2Var) {
        this.f5788a = c9Var;
        this.f5789b = timeProvider;
        this.f5790c = x2Var;
        this.f5792e = c9Var.k();
    }

    public void a() {
        long currentTimeMillis = this.f5789b.currentTimeMillis();
        this.f5792e = currentTimeMillis;
        this.f5788a.d(currentTimeMillis).d();
    }

    public void a(C0730ti tiVar) {
        this.f5791d = tiVar;
    }
}
