package com.bytedance.sdk.component.d.d;

import com.bytedance.sdk.component.d.c.c;

/* compiled from: DiskCacheVisitor */
public class f extends a {
    public String a() {
        return "disk_cache";
    }

    public void a(c cVar) {
        String g2 = cVar.g();
        com.bytedance.sdk.component.d.c c2 = cVar.p().c(cVar.q());
        if (c2 == null) {
            cVar.a((i) new k());
            return;
        }
        byte[] bArr = (byte[]) c2.a(g2);
        if (bArr == null) {
            cVar.a((i) new k());
            return;
        }
        cVar.a((i) new b(bArr, (com.bytedance.sdk.component.d.f) null));
        cVar.p().b(cVar.q()).a(g2, bArr);
    }
}
