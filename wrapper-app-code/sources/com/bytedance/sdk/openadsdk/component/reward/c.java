package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.b.b.b.o;
import com.bytedance.sdk.openadsdk.b.j;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.video.c.a;

/* compiled from: FullScreenVideoController */
public class c extends a {
    private j z;

    /* access modifiers changed from: protected */
    public int t() {
        return 2;
    }

    /* access modifiers changed from: protected */
    public void z() {
    }

    public c(Context context, ViewGroup viewGroup, n nVar, j jVar) {
        super(context, viewGroup, nVar);
        this.z = jVar;
    }

    /* access modifiers changed from: protected */
    public void a(int i, int i2) {
        if (this.f1589e != null) {
            o.a aVar = new o.a();
            aVar.b(h());
            aVar.c(j());
            aVar.a(g());
            aVar.a(i);
            aVar.b(i2);
            com.bytedance.sdk.openadsdk.b.b.a.a.c(F(), aVar);
        }
    }

    /* access modifiers changed from: protected */
    public void u() {
        o.a aVar = new o.a();
        aVar.a(g());
        aVar.c(j());
        aVar.b(h());
        aVar.f(i());
        com.bytedance.sdk.openadsdk.b.b.a.a.b(this.f1588d, aVar, this.z);
    }

    /* access modifiers changed from: protected */
    public void v() {
        o.a aVar = new o.a();
        aVar.a(g());
        aVar.c(j());
        aVar.b(h());
        com.bytedance.sdk.openadsdk.b.b.a.a.a((com.bykv.vk.openvk.component.video.api.b.a) this.f1588d, aVar);
    }

    /* access modifiers changed from: protected */
    public void w() {
        o.a aVar = new o.a();
        aVar.a(g());
        aVar.c(j());
        aVar.b(h());
        com.bytedance.sdk.openadsdk.b.b.a.a.b(F(), aVar);
    }

    /* access modifiers changed from: protected */
    public void x() {
        o.a aVar = new o.a();
        aVar.a(true);
        aVar.c(j());
        com.bytedance.sdk.openadsdk.b.b.a.a.a(m.a(), (com.bykv.vk.openvk.component.video.api.b.a) this.f1588d, aVar, this.z);
    }

    /* access modifiers changed from: protected */
    public void y() {
        com.bytedance.sdk.openadsdk.b.b.a.a.a(this.f1589e, (com.bykv.vk.openvk.component.video.api.b.a) this.f1588d, this.x);
    }
}
