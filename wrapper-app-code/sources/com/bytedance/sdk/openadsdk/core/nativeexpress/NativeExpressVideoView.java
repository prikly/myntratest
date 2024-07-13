package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import com.bykv.vk.openvk.component.video.api.d.c;
import com.bytedance.sdk.component.adexpress.b;
import com.bytedance.sdk.component.adexpress.b.d;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.o;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.core.widget.RoundFrameLayout;
import com.bytedance.sdk.openadsdk.multipro.b.a;
import com.bytedance.sdk.openadsdk.utils.u;
import com.bytedance.sdk.openadsdk.utils.v;

public class NativeExpressVideoView extends NativeExpressView implements c.C0221c, c.d, j {

    /* renamed from: a  reason: collision with root package name */
    int f1396a = 1;

    /* renamed from: b  reason: collision with root package name */
    boolean f1397b = false;

    /* renamed from: c  reason: collision with root package name */
    boolean f1398c = true;

    /* renamed from: d  reason: collision with root package name */
    int f1399d;

    /* renamed from: e  reason: collision with root package name */
    boolean f1400e = true;
    private ExpressVideoView u;
    /* access modifiers changed from: private */
    public a v;
    private long w;
    private long x;

    public void b() {
    }

    public void e() {
    }

    public NativeExpressVideoView(Context context, n nVar, AdSlot adSlot, String str) {
        super(context, nVar, adSlot, str, false);
        h();
    }

    /* access modifiers changed from: protected */
    public void h() {
        this.k = new RoundFrameLayout(this.f1409f);
        int f2 = u.f(this.i);
        this.f1399d = f2;
        c(f2);
        o();
        addView(this.k, new FrameLayout.LayoutParams(-1, -1));
        super.g();
        if (getWebView() != null) {
            getWebView().setBackgroundColor(0);
        }
    }

    private void o() {
        try {
            this.v = new a();
            ExpressVideoView expressVideoView = new ExpressVideoView(this.f1409f, this.i, this.f1410g, this.r);
            this.u = expressVideoView;
            expressVideoView.setShouldCheckNetChange(false);
            this.u.setControllerStatusCallBack(new NativeVideoTsView.b() {
                public void a(boolean z, long j, long j2, long j3, boolean z2) {
                    NativeExpressVideoView.this.v.f2159a = z;
                    NativeExpressVideoView.this.v.f2163e = j;
                    NativeExpressVideoView.this.v.f2164f = j2;
                    NativeExpressVideoView.this.v.f2165g = j3;
                    NativeExpressVideoView.this.v.f2162d = z2;
                }
            });
            this.u.setVideoAdLoadListener(this);
            this.u.setVideoAdInteractionListener(this);
            if ("embeded_ad".equals(this.f1410g)) {
                this.u.setIsAutoPlay(this.f1397b ? this.f1411h.isAutoPlay() : this.f1398c);
            } else if ("open_ad".equals(this.f1410g)) {
                this.u.setIsAutoPlay(true);
            } else {
                this.u.setIsAutoPlay(this.f1398c);
            }
            if ("open_ad".equals(this.f1410g)) {
                this.u.setIsQuiet(true);
            } else {
                this.u.setIsQuiet(m.h().a(this.f1399d));
            }
            this.u.d();
        } catch (Exception unused) {
            this.u = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void c(int i) {
        int c2 = m.h().c(i);
        if (3 == c2) {
            this.f1397b = false;
            this.f1398c = false;
        } else if (4 == c2) {
            this.f1397b = true;
        } else {
            int c3 = o.c(m.a());
            if (1 == c2) {
                this.f1397b = false;
                this.f1398c = u.e(c3);
            } else if (2 == c2) {
                if (u.f(c3) || u.e(c3) || u.g(c3)) {
                    this.f1397b = false;
                    this.f1398c = true;
                }
            } else if (5 == c2 && (u.e(c3) || u.g(c3))) {
                this.f1397b = false;
                this.f1398c = true;
            }
        }
        if (!this.f1398c) {
            this.f1396a = 3;
        }
        l.c("NativeVideoAdView", "mIsAutoPlay=" + this.f1398c + ",status=" + c2);
    }

    public a getVideoModel() {
        return this.v;
    }

    public void setCanInterruptVideoPlay(boolean z) {
        ExpressVideoView expressVideoView = this.u;
        if (expressVideoView != null) {
            expressVideoView.setCanInterruptVideoPlay(z);
        }
    }

    private void setShowAdInteractionView(boolean z) {
        ExpressVideoView expressVideoView = this.u;
        if (expressVideoView != null) {
            expressVideoView.setShowAdInteractionView(z);
        }
    }

    public void a(d<? extends View> dVar, com.bytedance.sdk.component.adexpress.b.m mVar) {
        this.t = dVar;
        if ((this.t instanceof o) && ((o) this.t).p() != null) {
            ((o) this.t).p().a((j) this);
        }
        if (mVar != null && mVar.a()) {
            a(mVar);
        }
        super.a(dVar, mVar);
    }

    private void a(final com.bytedance.sdk.component.adexpress.b.m mVar) {
        if (mVar != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                b(mVar);
            } else {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public void run() {
                        NativeExpressVideoView.this.b(mVar);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: private */
    public void b(com.bytedance.sdk.component.adexpress.b.m mVar) {
        if (mVar != null) {
            double d2 = mVar.d();
            double e2 = mVar.e();
            double f2 = mVar.f();
            double g2 = mVar.g();
            int b2 = (int) v.b(this.f1409f, (float) d2);
            int b3 = (int) v.b(this.f1409f, (float) e2);
            int b4 = (int) v.b(this.f1409f, (float) f2);
            int b5 = (int) v.b(this.f1409f, (float) g2);
            float b6 = v.b(this.f1409f, mVar.i());
            float b7 = v.b(this.f1409f, mVar.j());
            float b8 = v.b(this.f1409f, mVar.k());
            float b9 = v.b(this.f1409f, mVar.l());
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
            if (this.u != null) {
                this.k.addView(this.u);
                ((RoundFrameLayout) this.k).a(b6, b7, b8, b9);
                this.u.a(0, true, false);
                c(this.f1399d);
                if (!o.d(this.f1409f) && !this.f1398c && this.f1400e) {
                    this.u.e();
                }
                setShowAdInteractionView(false);
            }
        }
    }

    public void a(boolean z) {
        l.b("NativeExpressVideoView", "onMuteVideo,mute:" + z);
        ExpressVideoView expressVideoView = this.u;
        if (expressVideoView != null) {
            expressVideoView.setIsQuiet(z);
            setSoundMute(z);
        }
    }

    public void a() {
        l.b("NativeExpressVideoView", "onSkipVideo");
    }

    public void a(int i) {
        l.b("NativeExpressVideoView", "onChangeVideoState,stateType:" + i);
        ExpressVideoView expressVideoView = this.u;
        if (expressVideoView == null) {
            l.e("NativeExpressVideoView", "onChangeVideoState,ExpressVideoView is null !!!!!!!!!!!!");
        } else if (i == 1) {
            expressVideoView.a(0, true, false);
        } else if (i == 2 || i == 3) {
            this.u.setCanInterruptVideoPlay(true);
            this.u.performClick();
        } else if (i == 4) {
            expressVideoView.getNativeVideoController().f();
        } else if (i == 5) {
            expressVideoView.a(0, true, false);
        }
    }

    public void a(View view, int i, b bVar) {
        if (i != -1 && bVar != null) {
            if (i != 4) {
                if (i != 11) {
                    super.a(view, i, bVar);
                    return;
                }
            } else if (this.f1410g == "draw_ad") {
                ExpressVideoView expressVideoView = this.u;
                if (expressVideoView != null) {
                    expressVideoView.performClick();
                    return;
                }
                return;
            }
            try {
                if (this.u != null) {
                    this.u.setCanInterruptVideoPlay(true);
                    this.u.performClick();
                    if (this.l) {
                        this.u.findViewById(t.e(this.u.getContext(), "tt_video_play")).setVisibility(0);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public long c() {
        return this.w;
    }

    public int d() {
        ExpressVideoView expressVideoView;
        if (this.f1396a == 3 && (expressVideoView = this.u) != null) {
            expressVideoView.d();
        }
        ExpressVideoView expressVideoView2 = this.u;
        if (expressVideoView2 == null || !expressVideoView2.getNativeVideoController().r()) {
            return this.f1396a;
        }
        return 1;
    }

    public void a_() {
        this.f1400e = false;
        l.b("NativeExpressVideoView", "onVideoAdStartPlay");
        if (this.j != null) {
            this.j.onVideoAdStartPlay();
        }
        this.f1396a = 2;
    }

    public void b_() {
        this.f1400e = false;
        l.b("NativeExpressVideoView", "onVideoAdPaused");
        if (this.j != null) {
            this.j.onVideoAdPaused();
        }
        this.l = true;
        this.f1396a = 3;
    }

    public void c_() {
        this.f1400e = false;
        l.b("NativeExpressVideoView", "onVideoAdContinuePlay");
        if (this.j != null) {
            this.j.onVideoAdContinuePlay();
        }
        this.l = false;
        this.f1396a = 2;
    }

    public void a(long j, long j2) {
        this.f1400e = false;
        if (this.j != null) {
            this.j.onProgressUpdate(j, j2);
        }
        int i = this.f1396a;
        if (!(i == 5 || i == 3 || j <= this.w)) {
            this.f1396a = 2;
        }
        this.w = j;
        this.x = j2;
        if (this.s != null && this.s.d() != null) {
            this.s.d().setTimeUpdate(((int) (j2 - j)) / 1000);
        }
    }

    public void d_() {
        this.f1400e = false;
        l.b("NativeExpressVideoView", "onVideoComplete");
        if (this.j != null) {
            this.j.onVideoAdComplete();
        }
        this.f1396a = 5;
        if (this.s != null && this.s.d() != null) {
            this.s.d().f();
        }
    }

    public void e_() {
        l.b("NativeExpressVideoView", "onVideoLoad");
        if (this.j != null) {
            this.j.onVideoLoad();
        }
    }

    public void a(int i, int i2) {
        l.b("NativeExpressVideoView", "onVideoError,errorCode:" + i + ",extraCode:" + i2);
        if (this.j != null) {
            this.j.onVideoError(i, i2);
        }
        this.w = this.x;
        this.f1396a = 4;
    }
}
