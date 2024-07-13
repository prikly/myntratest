package com.bytedance.sdk.openadsdk.component.reward.a;

import android.app.Activity;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.b.c;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.t;
import com.bytedance.sdk.openadsdk.multipro.b;
import com.com.bytedance.overseas.sdk.a.c;
import com.com.bytedance.overseas.sdk.a.d;
import org.json.JSONObject;

/* compiled from: RewardFullDownloadManager */
public class a {

    /* renamed from: a  reason: collision with root package name */
    c f587a;

    /* renamed from: b  reason: collision with root package name */
    private Activity f588b;

    /* renamed from: c  reason: collision with root package name */
    private n f589c;

    /* renamed from: d  reason: collision with root package name */
    private String f590d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f591e = false;

    /* renamed from: com.bytedance.sdk.openadsdk.component.reward.a.a$a  reason: collision with other inner class name */
    /* compiled from: RewardFullDownloadManager */
    public interface C0002a {
        void a(View view, float f2, float f3, float f4, float f5, SparseArray<c.a> sparseArray, int i, int i2, int i3);

        void a(String str, JSONObject jSONObject);
    }

    public a(Activity activity) {
        this.f588b = activity;
    }

    public void a(n nVar, String str) {
        if (!this.f591e) {
            this.f591e = true;
            this.f589c = nVar;
            this.f590d = str;
            d();
        }
    }

    private void d() {
        if (b.c()) {
            n nVar = this.f589c;
            if (nVar != null && nVar.L() == 4) {
                this.f587a = d.a(this.f588b, this.f589c, this.f590d);
                return;
            }
            return;
        }
        this.f587a = t.a().g();
    }

    public void a() {
        n nVar;
        if (this.f587a == null && (nVar = this.f589c) != null) {
            this.f587a = d.a(this.f588b, nVar, this.f590d);
        }
    }

    public void b() {
        com.com.bytedance.overseas.sdk.a.c cVar = this.f587a;
        if (cVar != null) {
            cVar.d();
        }
    }

    public com.com.bytedance.overseas.sdk.a.c c() {
        return this.f587a;
    }

    public void a(View view, float f2, float f3, float f4, float f5, SparseArray<c.a> sparseArray, int i, int i2, int i3, C0002a aVar) {
        C0002a aVar2 = aVar;
        if (this.f587a == null) {
            aVar.a(view, f2, f3, f4, f5, sparseArray, i, i2, i3);
        } else if (view.getId() == com.bytedance.sdk.component.utils.t.e(this.f588b, "tt_rb_score")) {
            aVar2.a("click_play_star_level", (JSONObject) null);
        } else if (view.getId() == com.bytedance.sdk.component.utils.t.e(this.f588b, "tt_comment_vertical")) {
            aVar2.a("click_play_star_nums", (JSONObject) null);
        } else if (view.getId() == com.bytedance.sdk.component.utils.t.e(this.f588b, "tt_reward_ad_appname")) {
            aVar2.a("click_play_source", (JSONObject) null);
        } else if (view.getId() == com.bytedance.sdk.component.utils.t.e(this.f588b, "tt_reward_ad_icon")) {
            aVar2.a("click_play_logo", (JSONObject) null);
        }
    }
}
