package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.core.EmptyView;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.nativeexpress.e;
import com.bytedance.sdk.openadsdk.core.nativeexpress.f;
import com.bytedance.sdk.openadsdk.core.nativeexpress.j;
import com.bytedance.sdk.openadsdk.utils.v;
import com.com.bytedance.overseas.sdk.a.c;
import com.com.bytedance.overseas.sdk.a.d;

/* compiled from: RewardFullExpressVideoLayout */
public class b {

    /* renamed from: a  reason: collision with root package name */
    c f842a;

    /* renamed from: b  reason: collision with root package name */
    Handler f843b;

    /* renamed from: c  reason: collision with root package name */
    boolean f844c = false;

    /* renamed from: d  reason: collision with root package name */
    boolean f845d = false;

    /* renamed from: e  reason: collision with root package name */
    boolean f846e = false;

    /* renamed from: f  reason: collision with root package name */
    private Activity f847f;

    /* renamed from: g  reason: collision with root package name */
    private n f848g;

    /* renamed from: h  reason: collision with root package name */
    private String f849h;
    private FullRewardExpressView i;

    public b(Activity activity) {
        this.f847f = activity;
    }

    public void a(n nVar, AdSlot adSlot, String str, boolean z) {
        if (!this.f846e) {
            this.f846e = true;
            this.f848g = nVar;
            this.f849h = str;
            this.i = new FullRewardExpressView(this.f847f, nVar, adSlot, str, z);
        }
    }

    public FullRewardExpressView a() {
        return this.i;
    }

    public FrameLayout b() {
        FullRewardExpressView fullRewardExpressView = this.i;
        if (fullRewardExpressView == null) {
            return null;
        }
        FrameLayout videoFrameLayout = fullRewardExpressView.getVideoFrameLayout();
        if (this.i.n()) {
            a(videoFrameLayout);
        }
        return videoFrameLayout;
    }

    public boolean c() {
        return this.f844c;
    }

    public void a(boolean z) {
        this.f844c = z;
    }

    public boolean d() {
        return this.f845d;
    }

    public void b(boolean z) {
        this.f845d = z;
    }

    public void a(f fVar, e eVar) {
        n nVar;
        if (this.i != null && (nVar = this.f848g) != null) {
            this.f842a = a(nVar);
            com.bytedance.sdk.openadsdk.b.e.a(this.f848g);
            EmptyView a2 = a((ViewGroup) this.i);
            if (a2 == null) {
                a2 = new EmptyView(this.f847f, this.i);
                this.i.addView(a2);
            }
            fVar.a((View) this.i);
            fVar.a(this.f842a);
            this.i.setClickListener(fVar);
            eVar.a((View) this.i);
            eVar.a(this.f842a);
            this.i.setClickCreativeListener(eVar);
            a2.setNeedCheckingShow(false);
        }
    }

    private c a(n nVar) {
        if (nVar.L() == 4) {
            return d.a(this.f847f, nVar, this.f849h);
        }
        return null;
    }

    private EmptyView a(ViewGroup viewGroup) {
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof EmptyView) {
                return (EmptyView) childAt;
            }
        }
        return null;
    }

    public void a(j jVar) {
        FullRewardExpressView fullRewardExpressView = this.i;
        if (fullRewardExpressView != null) {
            fullRewardExpressView.setExpressVideoListenerProxy(jVar);
        }
    }

    public void a(TTNativeExpressAd.ExpressAdInteractionListener expressAdInteractionListener) {
        FullRewardExpressView fullRewardExpressView = this.i;
        if (fullRewardExpressView != null) {
            fullRewardExpressView.setExpressInteractionListener(expressAdInteractionListener);
        }
    }

    public Handler e() {
        if (this.f843b == null) {
            this.f843b = new Handler(Looper.getMainLooper());
        }
        return this.f843b;
    }

    public void f() {
        FullRewardExpressView fullRewardExpressView = this.i;
        if (fullRewardExpressView != null) {
            fullRewardExpressView.l();
        }
        Handler handler = this.f843b;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
    }

    public void g() {
        FullRewardExpressView fullRewardExpressView = this.i;
        if (fullRewardExpressView != null) {
            fullRewardExpressView.k();
        }
    }

    public boolean h() {
        FullRewardExpressView fullRewardExpressView = this.i;
        if (fullRewardExpressView == null) {
            return false;
        }
        return fullRewardExpressView.n();
    }

    public int i() {
        FullRewardExpressView fullRewardExpressView = this.i;
        if (fullRewardExpressView != null) {
            return fullRewardExpressView.getDynamicShowType();
        }
        return 0;
    }

    public void j() {
        FullRewardExpressView fullRewardExpressView = this.i;
        if (fullRewardExpressView != null) {
            fullRewardExpressView.i();
        }
    }

    public void k() {
        FullRewardExpressView fullRewardExpressView = this.i;
        if (fullRewardExpressView != null) {
            fullRewardExpressView.j();
            this.i.k();
        }
    }

    public void a(FrameLayout frameLayout) {
        n nVar = this.f848g;
        if (nVar != null && n.c(nVar) && this.f848g.t() == 3 && this.f848g.v() == 0) {
            try {
                if (this.f848g.am() == 1) {
                    int e2 = v.e(m.a(), 90.0f);
                    FrameLayout frameLayout2 = (FrameLayout) this.i.getBackupContainerBackgroundView();
                    if (frameLayout2 != null) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout2.getLayoutParams();
                        layoutParams.bottomMargin = e2;
                        frameLayout2.setLayoutParams(layoutParams);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
