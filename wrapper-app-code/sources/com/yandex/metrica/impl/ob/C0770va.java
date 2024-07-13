package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.coreutils.services.TimeProvider;

/* renamed from: com.yandex.metrica.impl.ob.va  reason: case insensitive filesystem */
public class C0770va {

    /* renamed from: a  reason: collision with root package name */
    private final Context f6971a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6972b;

    /* renamed from: c  reason: collision with root package name */
    private final C0794wa f6973c;

    /* renamed from: d  reason: collision with root package name */
    private final Q0 f6974d;

    /* renamed from: e  reason: collision with root package name */
    private final TimeProvider f6975e;

    /* renamed from: f  reason: collision with root package name */
    private final C0810x2 f6976f;

    public C0770va(Context context, String str, C0794wa waVar, Q0 q0) {
        this(context, str, waVar, q0, new SystemTimeProvider(), new C0810x2());
    }

    public boolean a(C0651qa qaVar) {
        long currentTimeSeconds = this.f6975e.currentTimeSeconds();
        if (qaVar == null) {
            return false;
        }
        boolean z = true;
        boolean z2 = currentTimeSeconds <= qaVar.f6553a;
        if (!z2) {
            z = z2;
        } else if (currentTimeSeconds + this.f6974d.a() > qaVar.f6553a) {
            z = false;
        }
        if (!z) {
            return false;
        }
        Z8 z8 = new Z8(C0477ja.a(this.f6971a).g());
        C0810x2 x2Var = this.f6976f;
        long a2 = this.f6973c.a(z8);
        long j = (long) qaVar.f6554b;
        return x2Var.b(a2, j, this.f6972b + " diagnostics event");
    }

    C0770va(Context context, String str, C0794wa waVar, Q0 q0, TimeProvider timeProvider, C0810x2 x2Var) {
        this.f6971a = context;
        this.f6972b = str;
        this.f6973c = waVar;
        this.f6974d = q0;
        this.f6975e = timeProvider;
        this.f6976f = x2Var;
    }
}
