package com.bytedance.sdk.openadsdk.component.reward.view;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.b;
import com.bytedance.sdk.component.adexpress.b.c;
import com.bytedance.sdk.component.adexpress.b.d;
import com.bytedance.sdk.component.adexpress.b.m;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.nativeexpress.FullRewardExpressBackupView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.j;
import com.bytedance.sdk.openadsdk.core.nativeexpress.o;
import com.bytedance.sdk.openadsdk.utils.v;

public class FullRewardExpressView extends NativeExpressView {

    /* renamed from: c  reason: collision with root package name */
    public static float f823c = 100.0f;

    /* renamed from: a  reason: collision with root package name */
    j f824a;

    /* renamed from: b  reason: collision with root package name */
    FullRewardExpressBackupView f825b;

    public FullRewardExpressView(Context context, n nVar, AdSlot adSlot, String str, boolean z) {
        super(context, nVar, adSlot, str, z);
    }

    /* access modifiers changed from: protected */
    public void g() {
        this.m = true;
        this.k = new FrameLayout(this.f1409f);
        addView(this.k, new FrameLayout.LayoutParams(-1, -1));
        super.g();
        if (getWebView() != null) {
            getWebView().setBackgroundColor(0);
        }
        h();
    }

    private void h() {
        setBackupListener(new c() {
            public boolean a(ViewGroup viewGroup, int i) {
                try {
                    ((NativeExpressView) viewGroup).m();
                    FullRewardExpressView.this.f825b = new FullRewardExpressBackupView(viewGroup.getContext());
                    FullRewardExpressView.this.f825b.a(FullRewardExpressView.this.i, (NativeExpressView) viewGroup);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        });
    }

    public void a(d<? extends View> dVar, m mVar) {
        if (dVar instanceof o) {
            o oVar = (o) dVar;
            if (oVar.p() != null) {
                oVar.p().a((j) this);
            }
        }
        if (mVar != null && mVar.a()) {
            a(mVar);
        }
        super.a(dVar, mVar);
    }

    public void setExpressVideoListenerProxy(j jVar) {
        this.f824a = jVar;
    }

    private void a(final m mVar) {
        if (mVar != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                b(mVar);
            } else {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public void run() {
                        FullRewardExpressView.this.b(mVar);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: private */
    public void b(m mVar) {
        if (mVar != null) {
            double d2 = mVar.d();
            double e2 = mVar.e();
            double f2 = mVar.f();
            double g2 = mVar.g();
            int b2 = (int) v.b(this.f1409f, (float) d2);
            int b3 = (int) v.b(this.f1409f, (float) e2);
            int b4 = (int) v.b(this.f1409f, (float) f2);
            int b5 = (int) v.b(this.f1409f, (float) g2);
            l.b("ExpressView", "videoWidth:" + f2);
            l.b("ExpressView", "videoHeight:" + g2);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.k.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(b4, b5);
            }
            layoutParams.width = b4;
            layoutParams.height = b5;
            layoutParams.topMargin = b3;
            layoutParams.leftMargin = b2;
            this.k.setLayoutParams(layoutParams);
            this.k.removeAllViews();
        }
    }

    public void a(boolean z) {
        l.b("FullRewardExpressView", "onMuteVideo,mute:" + z);
        j jVar = this.f824a;
        if (jVar != null) {
            jVar.a(z);
        }
        setSoundMute(z);
    }

    public void a() {
        l.b("FullRewardExpressView", "onSkipVideo");
        j jVar = this.f824a;
        if (jVar != null) {
            jVar.a();
        }
    }

    public void b() {
        j jVar = this.f824a;
        if (jVar != null) {
            jVar.b();
        }
    }

    public void a(int i) {
        l.b("FullRewardExpressView", "onChangeVideoState,stateType:" + i);
        j jVar = this.f824a;
        if (jVar != null) {
            jVar.a(i);
        }
    }

    public long c() {
        l.b("FullRewardExpressView", "onGetCurrentPlayTime");
        j jVar = this.f824a;
        if (jVar != null) {
            return jVar.c();
        }
        return 0;
    }

    public int d() {
        l.b("FullRewardExpressView", "onGetVideoState");
        j jVar = this.f824a;
        if (jVar != null) {
            return jVar.d();
        }
        return 0;
    }

    public void e() {
        j jVar = this.f824a;
        if (jVar != null) {
            jVar.e();
        }
    }

    public void a(View view, int i, b bVar) {
        if (i == -1 || bVar == null || i != 3) {
            super.a(view, i, bVar);
        } else {
            e();
        }
    }

    public FrameLayout getVideoFrameLayout() {
        if (n()) {
            return this.f825b.getVideoContainer();
        }
        return this.k;
    }

    public View getBackupContainerBackgroundView() {
        if (n()) {
            return this.f825b.getBackupContainerBackgroundView();
        }
        return null;
    }

    public void b(int i) {
        j jVar = this.f824a;
        if (jVar != null) {
            jVar.b(i);
        }
    }
}
