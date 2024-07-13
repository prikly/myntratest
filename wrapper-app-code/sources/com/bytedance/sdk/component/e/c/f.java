package com.bytedance.sdk.component.e.c;

import com.bytedance.sdk.component.b.a.g;
import com.bytedance.sdk.component.b.a.k;
import com.bytedance.sdk.component.b.a.m;
import java.io.IOException;

/* compiled from: TncHostInterceptor */
public class f implements g {

    /* renamed from: a  reason: collision with root package name */
    private int f19180a;

    public void a(int i) {
        this.f19180a = i;
    }

    public m a(g.a aVar) throws IOException {
        m mVar;
        k a2 = aVar.a();
        if (g.a().a(this.f19180a).b() != null) {
            g.a().a(this.f19180a).b().e();
        }
        String fVar = a2.b().toString();
        String a3 = g.a().a(this.f19180a).a(fVar);
        if (!fVar.equals(a3)) {
            a2 = a2.g().a(a3).b();
        }
        try {
            mVar = aVar.a(a2);
        } catch (Exception e2) {
            g.a().a(this.f19180a).a(a2, e2);
            mVar = null;
        }
        g.a().a(this.f19180a).a(a2, mVar);
        return mVar == null ? aVar.a(a2) : mVar;
    }
}
