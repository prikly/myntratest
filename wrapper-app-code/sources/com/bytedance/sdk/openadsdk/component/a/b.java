package com.bytedance.sdk.openadsdk.component.a;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.core.b.b;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.e.p;
import com.bytedance.sdk.openadsdk.core.m;
import com.com.bytedance.overseas.sdk.a.c;
import com.com.bytedance.overseas.sdk.a.d;
import java.util.HashMap;
import java.util.Map;

/* compiled from: TTAppOpenAdClickManager */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private String f519a = "open_ad";

    /* renamed from: b  reason: collision with root package name */
    private int f520b = 4;

    /* renamed from: c  reason: collision with root package name */
    private a f521c;

    /* renamed from: d  reason: collision with root package name */
    private c f522d;

    public b(n nVar, Activity activity) {
        a aVar = new a(activity.getApplicationContext(), nVar, this.f519a, this.f520b);
        this.f521c = aVar;
        aVar.a(activity.findViewById(16908290));
        this.f521c.b(activity.findViewById(t.e(m.a(), "tt_top_dislike")));
        HashMap hashMap = new HashMap();
        hashMap.put("click_area", Integer.valueOf(nVar.c()));
        hashMap.put("openad_creative_type", n.c(nVar) ? "video_normal_ad" : "image_normal_ad");
        hashMap.put("click_scence", Integer.valueOf(p.i(nVar) ? 3 : 1));
        this.f521c.a((Map<String, Object>) hashMap);
        a(activity.getApplicationContext(), nVar);
    }

    private void a(Context context, n nVar) {
        if (a(nVar) == 4) {
            c a2 = d.a(context, nVar, "open_ad");
            this.f522d = a2;
            this.f521c.a(a2);
        }
    }

    public int a(n nVar) {
        if (nVar == null) {
            return -1;
        }
        return nVar.L();
    }

    public void a(b.a aVar) {
        a aVar2 = this.f521c;
        if (aVar2 != null) {
            aVar2.a(aVar);
        }
    }

    public a a() {
        return this.f521c;
    }
}
