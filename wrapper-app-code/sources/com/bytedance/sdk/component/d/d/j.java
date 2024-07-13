package com.bytedance.sdk.component.d.d;

import com.bytedance.sdk.component.d.c.c;
import com.bytedance.sdk.component.d.f;
import com.bytedance.sdk.component.d.t;

/* compiled from: MemoryCacheVisitor */
public class j extends a {
    public String a() {
        return "memory_cache";
    }

    public void a(c cVar) {
        Object obj;
        t i = cVar.i();
        if (i == t.BITMAP || i == t.AUTO) {
            obj = cVar.p().a(cVar.q()).a(cVar.e());
        } else {
            obj = null;
        }
        if (obj == null) {
            cVar.a((i) new l());
        } else {
            cVar.a((i) new m(obj, (f) null, false));
        }
    }
}
