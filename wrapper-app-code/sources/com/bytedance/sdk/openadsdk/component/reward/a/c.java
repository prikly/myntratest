package com.bytedance.sdk.openadsdk.component.reward.a;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.component.reward.top.TopProxyLayout;
import com.bytedance.sdk.openadsdk.component.reward.top.b;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.utils.v;

/* compiled from: RewardFullTopProxyManager */
public class c {

    /* renamed from: a  reason: collision with root package name */
    TopProxyLayout f602a;

    /* renamed from: b  reason: collision with root package name */
    com.bytedance.sdk.component.adexpress.dynamic.c f603b;

    /* renamed from: c  reason: collision with root package name */
    private Activity f604c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f605d = false;

    public c(Activity activity) {
        this.f604c = activity;
    }

    public void a() {
        if (!this.f605d) {
            this.f605d = true;
            e();
        }
    }

    private void e() {
        Activity activity = this.f604c;
        this.f602a = (TopProxyLayout) activity.findViewById(t.e(activity, "tt_top_layout_proxy"));
    }

    public void a(boolean z, n nVar) {
        TopProxyLayout topProxyLayout = this.f602a;
        if (topProxyLayout != null) {
            topProxyLayout.a(z, nVar);
        }
    }

    public void a(boolean z) {
        TopProxyLayout topProxyLayout = this.f602a;
        if (topProxyLayout != null) {
            topProxyLayout.setShowDislike(z);
        }
    }

    public void b(boolean z) {
        TopProxyLayout topProxyLayout = this.f602a;
        if (topProxyLayout != null) {
            topProxyLayout.setSoundMute(z);
        }
        com.bytedance.sdk.component.adexpress.dynamic.c cVar = this.f603b;
        if (cVar != null) {
            cVar.setSoundMute(z);
        }
    }

    public void c(boolean z) {
        TopProxyLayout topProxyLayout = this.f602a;
        if (topProxyLayout != null) {
            topProxyLayout.setShowSound(z);
        }
    }

    public void d(boolean z) {
        TopProxyLayout topProxyLayout = this.f602a;
        if (topProxyLayout != null) {
            topProxyLayout.setShowSkip(z);
        }
    }

    public void a(String str, CharSequence charSequence) {
        TopProxyLayout topProxyLayout = this.f602a;
        if (topProxyLayout != null) {
            topProxyLayout.a((CharSequence) String.valueOf(str), charSequence);
        }
    }

    public void e(boolean z) {
        TopProxyLayout topProxyLayout = this.f602a;
        if (topProxyLayout != null) {
            topProxyLayout.setSkipEnable(z);
        }
    }

    public void b() {
        TopProxyLayout topProxyLayout = this.f602a;
        if (topProxyLayout != null) {
            topProxyLayout.a();
        }
    }

    public void c() {
        TopProxyLayout topProxyLayout = this.f602a;
        if (topProxyLayout != null) {
            topProxyLayout.b();
        }
    }

    public void d() {
        TopProxyLayout topProxyLayout = this.f602a;
        if (topProxyLayout != null) {
            topProxyLayout.c();
        }
    }

    public void a(b bVar) {
        TopProxyLayout topProxyLayout = this.f602a;
        if (topProxyLayout != null) {
            topProxyLayout.setListener(bVar);
        }
    }

    public void a(com.bytedance.sdk.component.adexpress.dynamic.c cVar) {
        this.f603b = cVar;
    }

    public void a(int i) {
        TopProxyLayout topProxyLayout = this.f602a;
        if (topProxyLayout != null && (topProxyLayout.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ((ViewGroup.MarginLayoutParams) this.f602a.getLayoutParams()).topMargin = i - v.e(this.f604c, 20.0f);
        }
    }

    public void b(int i) {
        View findViewById;
        TopProxyLayout topProxyLayout = this.f602a;
        if (topProxyLayout != null && topProxyLayout.getITopLayout() != null && (findViewById = this.f602a.getITopLayout().findViewById(t.e(m.a(), "tt_top_dislike"))) != null && (findViewById.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && findViewById.getWidth() > 0 && findViewById.getVisibility() == 0) {
            int[] iArr = new int[2];
            findViewById.getLocationOnScreen(iArr);
            int width = i - (iArr[0] + findViewById.getWidth());
            if (width < v.e(this.f604c, 16.0f)) {
                ((ViewGroup.MarginLayoutParams) findViewById.getLayoutParams()).rightMargin += v.e(this.f604c, 16.0f) - width;
                findViewById.requestLayout();
            }
        }
    }

    public void c(int i) {
        this.f602a.setVisibility(i);
    }
}
