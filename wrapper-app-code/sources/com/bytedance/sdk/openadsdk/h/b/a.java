package com.bytedance.sdk.openadsdk.h.b;

import com.bytedance.sdk.component.f.c;
import com.bytedance.sdk.component.f.e;
import com.bytedance.sdk.component.f.g;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.h.b;

/* compiled from: ReportThreadLogServiceImp */
public class a implements c {
    public void a(final com.bytedance.sdk.component.f.a.a aVar) {
        if (m.h().F() && aVar != null && aVar.a() != null) {
            e.a(new g("ReportThreadLogServiceImp") {
                public void run() {
                    b.a().a("stats_sdk_thread_num", aVar.a());
                }
            }, 5);
        }
    }
}
