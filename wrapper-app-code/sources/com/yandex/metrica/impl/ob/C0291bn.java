package com.yandex.metrica.impl.ob;

import com.bytedance.sdk.openadsdk.TTAdSdk;

/* renamed from: com.yandex.metrica.impl.ob.bn  reason: case insensitive filesystem */
public class C0291bn {

    /* renamed from: a  reason: collision with root package name */
    private final C0266an f5569a;

    /* renamed from: b  reason: collision with root package name */
    private final Zm f5570b;

    public C0291bn(C0315cm cmVar, String str) {
        this(new C0266an(30, 50, (int) TTAdSdk.INIT_LOCAL_FAIL_CODE, str, cmVar), new Zm(4500, str, cmVar));
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean a(C0265am amVar, String str, String str2) {
        if (amVar.size() >= this.f5569a.a().a()) {
            if (this.f5569a.a().a() != amVar.size() || !amVar.containsKey(str)) {
                this.f5569a.a(str);
                return false;
            }
        }
        if (!this.f5570b.a(amVar, str, str2)) {
            amVar.put(str, str2);
            return true;
        }
        this.f5570b.a(str);
        return false;
    }

    public boolean b(C0265am amVar, String str, String str2) {
        if (amVar == null) {
            return false;
        }
        String a2 = this.f5569a.b().a(str);
        String a3 = this.f5569a.c().a(str2);
        if (amVar.containsKey(a2)) {
            String str3 = (String) amVar.get(a2);
            if (a3 == null || !a3.equals(str3)) {
                return a(amVar, a2, a3);
            }
            return false;
        } else if (a3 != null) {
            return a(amVar, a2, a3);
        } else {
            return false;
        }
    }

    C0291bn(C0266an anVar, Zm zm) {
        this.f5569a = anVar;
        this.f5570b = zm;
    }
}
