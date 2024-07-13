package com.yandex.metrica.impl.ob;

import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.x0  reason: case insensitive filesystem */
public class C0808x0 {

    /* renamed from: a  reason: collision with root package name */
    private C0265am f7077a = new C0265am();

    /* renamed from: b  reason: collision with root package name */
    private C0291bn f7078b;

    C0808x0(C0291bn bnVar) {
        this.f7078b = bnVar;
    }

    /* access modifiers changed from: package-private */
    public void a(String str, String str2) {
        this.f7078b.b(this.f7077a, str, str2);
    }

    /* access modifiers changed from: package-private */
    public String a() {
        if (this.f7077a.isEmpty()) {
            return null;
        }
        return new JSONObject(this.f7077a).toString();
    }
}
