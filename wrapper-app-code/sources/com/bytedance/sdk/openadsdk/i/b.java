package com.bytedance.sdk.openadsdk.i;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.d.j;
import com.bytedance.sdk.component.d.n;
import com.bytedance.sdk.openadsdk.core.g;
import com.explorestack.protobuf.openrtb.LossReason;

/* compiled from: StatsImageListener */
public class b implements n<Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    private boolean f2009a;

    /* renamed from: b  reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.h.a.b f2010b;

    public void a(String str) {
        com.bytedance.sdk.openadsdk.h.a.b bVar;
        if (this.f2009a && (bVar = this.f2010b) != null) {
            bVar.c(str);
        }
    }

    public void a(int i) {
        com.bytedance.sdk.openadsdk.h.a.b bVar;
        if (this.f2009a && (bVar = this.f2010b) != null) {
            bVar.a(i);
        }
    }

    public void b(String str) {
        com.bytedance.sdk.openadsdk.h.a.b bVar;
        if (this.f2009a && (bVar = this.f2010b) != null) {
            bVar.e(str);
        }
    }

    public void c(String str) {
        com.bytedance.sdk.openadsdk.h.a.b bVar;
        if (this.f2009a && (bVar = this.f2010b) != null) {
            bVar.d(str);
        }
    }

    public void d(String str) {
        com.bytedance.sdk.openadsdk.h.a.b bVar;
        if (this.f2009a && (bVar = this.f2010b) != null) {
            bVar.g(str);
        }
    }

    public b(boolean z) {
        this.f2009a = z;
        if (z) {
            this.f2010b = com.bytedance.sdk.openadsdk.h.a.b.b();
        }
    }

    public void a(j<Bitmap> jVar) {
        if (this.f2009a && this.f2010b != null) {
            if (jVar == null || jVar.b() == null) {
                this.f2010b.b((int) LossReason.LOSS_REASON_CREATIVE_FILTERED_DISAPPROVED_VALUE).f(g.a(LossReason.LOSS_REASON_CREATIVE_FILTERED_DISAPPROVED_VALUE));
                com.bytedance.sdk.openadsdk.h.b.a().e(this.f2010b);
            }
        }
    }

    public void a(int i, String str, Throwable th) {
        com.bytedance.sdk.openadsdk.h.a.b bVar;
        if (this.f2009a && (bVar = this.f2010b) != null) {
            bVar.b(201).f(g.a(201));
            com.bytedance.sdk.openadsdk.h.b.a().e(this.f2010b);
        }
    }
}
