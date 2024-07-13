package com.bytedance.sdk.openadsdk.core.a;

import com.bytedance.sdk.openadsdk.core.e.b;
import com.bytedance.sdk.openadsdk.core.k;
import com.bytedance.sdk.openadsdk.core.n;

/* compiled from: AdCallBackAdapter */
public class a implements n.a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public n.a f893a;

    public a(n.a aVar) {
        this.f893a = aVar;
    }

    public void a(int i, String str) {
        n.a aVar = this.f893a;
        if (aVar != null) {
            aVar.a(i, str);
        }
    }

    public void a(final com.bytedance.sdk.openadsdk.core.e.a aVar, final b bVar) {
        if (this.f893a == null) {
            return;
        }
        if (com.bykv.vk.openvk.component.video.a.c.a.b()) {
            this.f893a.a(aVar, bVar);
        } else {
            k.d().post(new Runnable() {
                public void run() {
                    a.this.f893a.a(aVar, bVar);
                }
            });
        }
    }
}
