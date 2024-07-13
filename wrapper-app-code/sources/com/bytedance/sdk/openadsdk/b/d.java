package com.bytedance.sdk.openadsdk.b;

import com.bytedance.sdk.openadsdk.multipro.c.a;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: AdEventDispatcher4MultiProcess */
public class d extends c<a> {

    /* renamed from: a  reason: collision with root package name */
    private AtomicBoolean f298a = new AtomicBoolean(false);

    public void b() {
    }

    public void a() {
        if (!this.f298a.getAndSet(true)) {
            a.c();
        }
    }

    public void a(a aVar) {
        if (!this.f298a.get()) {
            a();
        }
        if (this.f298a.get()) {
            try {
                a.a(aVar.a());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
