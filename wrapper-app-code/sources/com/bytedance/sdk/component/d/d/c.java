package com.bytedance.sdk.component.d.d;

import android.text.TextUtils;
import com.bytedance.sdk.component.d.k;

/* compiled from: CacheKeyVisitor */
public class c extends a {
    public String a() {
        return "generate_key";
    }

    public void a(com.bytedance.sdk.component.d.c.c cVar) {
        if (TextUtils.isEmpty(cVar.e())) {
            k d2 = cVar.p().d();
            cVar.b(d2.a(cVar));
            cVar.a(d2.b(cVar));
        }
        cVar.a((i) new g());
    }
}
