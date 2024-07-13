package com.bytedance.sdk.component.d.d;

import com.bytedance.sdk.component.d.c.c;
import com.bytedance.sdk.component.d.c.d;
import com.bytedance.sdk.component.d.f;
import com.bytedance.sdk.component.d.n;
import java.util.List;
import java.util.Map;

/* compiled from: SuccessVisitor */
public class m<T> extends a {

    /* renamed from: a  reason: collision with root package name */
    private T f19101a;

    /* renamed from: b  reason: collision with root package name */
    private f f19102b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f19103c;

    public String a() {
        return "success";
    }

    public m(T t, f fVar, boolean z) {
        this.f19101a = t;
        this.f19102b = fVar;
        this.f19103c = z;
    }

    public void a(c cVar) {
        String r = cVar.r();
        Map<String, List<c>> f2 = cVar.p().f();
        List<c> list = f2.get(r);
        if (list == null) {
            b(cVar);
            return;
        }
        synchronized (list) {
            for (c b2 : list) {
                b(b2);
            }
            list.clear();
            f2.remove(r);
        }
    }

    private Map<String, String> b() {
        f fVar = this.f19102b;
        if (fVar != null) {
            return fVar.e();
        }
        return null;
    }

    private void b(c cVar) {
        n f2 = cVar.f();
        if (f2 != null) {
            f2.a(new d().a(cVar, this.f19101a, b(), this.f19103c));
        }
    }
}
