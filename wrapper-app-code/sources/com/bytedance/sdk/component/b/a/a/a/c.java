package com.bytedance.sdk.component.b.a.a.a;

import android.text.TextUtils;
import com.bytedance.sdk.component.b.a.b;
import com.bytedance.sdk.component.b.a.d;
import com.bytedance.sdk.component.b.a.i;
import com.bytedance.sdk.component.b.a.k;

/* compiled from: NetClient */
public class c extends i {

    /* renamed from: h  reason: collision with root package name */
    public d f18852h = new d();

    public c(i.a aVar) {
        super(aVar);
    }

    public d a() {
        return this.f18852h;
    }

    public b a(k kVar) {
        kVar.a(this);
        if (kVar == null || kVar.b() == null || kVar.b().a() == null || TextUtils.isEmpty(kVar.b().a().toString())) {
            return null;
        }
        a aVar = new a(kVar, this.f18852h);
        this.f18852h.c().add(aVar);
        return aVar;
    }
}
