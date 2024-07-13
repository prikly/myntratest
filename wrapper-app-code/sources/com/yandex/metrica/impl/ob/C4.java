package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.google.protobuf.nano.ym.MessageNano;
import com.yandex.metrica.coreutils.services.TimeProvider;
import com.yandex.metrica.impl.ob.C0656qf;
import com.yandex.metrica.impl.ob.E4;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

public class C4 {

    /* renamed from: h  reason: collision with root package name */
    public static final Map<Integer, Integer> f3800h = Collections.unmodifiableMap(new a());

    /* renamed from: a  reason: collision with root package name */
    private final C0293c0 f3801a;

    /* renamed from: b  reason: collision with root package name */
    private final D4 f3802b;

    /* renamed from: c  reason: collision with root package name */
    private final E4 f3803c;

    /* renamed from: d  reason: collision with root package name */
    private final C0316cn f3804d;

    /* renamed from: e  reason: collision with root package name */
    private final C0316cn f3805e;

    /* renamed from: f  reason: collision with root package name */
    private final TimeProvider f3806f;

    /* renamed from: g  reason: collision with root package name */
    private final O3 f3807g;

    class a extends HashMap<Integer, Integer> {
        a() {
            put(Integer.valueOf(C0244a1.EVENT_TYPE_DIAGNOSTIC.b()), 22);
            put(Integer.valueOf(C0244a1.EVENT_TYPE_DIAGNOSTIC_STATBOX.b()), 23);
            put(Integer.valueOf(C0244a1.EVENT_TYPE_DIAGNOSTIC_DISABLE_STAT_SENDING.b()), 24);
            put(Integer.valueOf(C0244a1.EVENT_TYPE_APPMETRICA_DIAGNOSTICS.b()), 24);
        }
    }

    public C4(C0293c0 c0Var, D4 d4, E4 e4, O3 o3, C0316cn cnVar, C0316cn cnVar2, TimeProvider timeProvider) {
        this.f3801a = c0Var;
        this.f3802b = d4;
        this.f3803c = e4;
        this.f3807g = o3;
        this.f3805e = cnVar;
        this.f3804d = cnVar2;
        this.f3806f = timeProvider;
    }

    public byte[] a() {
        C0656qf qfVar = new C0656qf();
        C0656qf.d dVar = new C0656qf.d();
        int i = 0;
        qfVar.f6577a = new C0656qf.d[]{dVar};
        E4.a a2 = this.f3803c.a();
        dVar.f6605a = a2.f3911a;
        C0656qf.d.b bVar = new C0656qf.d.b();
        dVar.f6606b = bVar;
        bVar.f6628c = 2;
        bVar.f6626a = new C0656qf.f();
        C0656qf.f fVar = dVar.f6606b.f6626a;
        long j = a2.f3912b;
        fVar.f6634a = j;
        fVar.f6635b = ((GregorianCalendar) GregorianCalendar.getInstance()).getTimeZone().getOffset(j * 1000) / 1000;
        dVar.f6606b.f6627b = this.f3802b.k();
        C0656qf.d.a aVar = new C0656qf.d.a();
        dVar.f6607c = new C0656qf.d.a[]{aVar};
        aVar.f6608a = (long) a2.f3913c;
        aVar.p = (long) this.f3807g.a(this.f3801a.o());
        aVar.f6609b = this.f3806f.currentTimeSeconds() - a2.f3912b;
        aVar.f6610c = f3800h.get(Integer.valueOf(this.f3801a.o())).intValue();
        if (!TextUtils.isEmpty(this.f3801a.g())) {
            aVar.f6611d = this.f3805e.a(this.f3801a.g());
        }
        if (!TextUtils.isEmpty(this.f3801a.q())) {
            String q = this.f3801a.q();
            String a3 = this.f3804d.a(q);
            if (!TextUtils.isEmpty(a3)) {
                aVar.f6612e = a3.getBytes();
            }
            int length = q.getBytes().length;
            byte[] bArr = aVar.f6612e;
            if (bArr != null) {
                i = bArr.length;
            }
            aVar.j = length - i;
        }
        return MessageNano.toByteArray(qfVar);
    }
}
