package com.bytedance.sdk.component.d.d;

import com.bytedance.sdk.component.d.c.a;
import com.bytedance.sdk.component.d.c.c;
import com.bytedance.sdk.component.d.n;
import java.util.List;
import java.util.Map;

/* compiled from: FailVisitor */
public class h extends a {

    /* renamed from: a  reason: collision with root package name */
    private Throwable f19094a;

    /* renamed from: b  reason: collision with root package name */
    private int f19095b;

    /* renamed from: c  reason: collision with root package name */
    private String f19096c;

    public String a() {
        return "failed";
    }

    public h(int i, String str, Throwable th) {
        this.f19095b = i;
        this.f19096c = str;
        this.f19094a = th;
    }

    public void a(c cVar) {
        cVar.a(new a(this.f19095b, this.f19096c, this.f19094a));
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

    private void b(c cVar) {
        n f2 = cVar.f();
        if (f2 != null) {
            f2.a(this.f19095b, this.f19096c, this.f19094a);
        }
    }
}
