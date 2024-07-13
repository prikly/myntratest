package com.bytedance.sdk.openadsdk.b;

import com.bytedance.sdk.openadsdk.h.c.c;
import com.bytedance.sdk.openadsdk.multipro.c.a;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: StatsDispatcher4MultiProcess */
public class r extends c<c.a> {

    /* renamed from: a  reason: collision with root package name */
    private AtomicBoolean f358a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    private boolean f359b = true;

    public void b() {
    }

    public r(boolean z) {
        this.f359b = z;
    }

    public void a() {
        if (!this.f358a.getAndSet(true)) {
            a.a(this.f359b);
        }
    }

    public void a(c.a aVar) {
        if (!this.f358a.get()) {
            a();
        }
        if (this.f358a.get()) {
            a.a(aVar.a(), this.f359b);
        }
    }
}
