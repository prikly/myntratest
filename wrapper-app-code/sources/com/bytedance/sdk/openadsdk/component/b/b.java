package com.bytedance.sdk.openadsdk.component.b;

import android.content.Context;
import android.view.View;
import com.bykv.vk.openvk.component.video.api.d.c;
import com.bytedance.sdk.component.utils.o;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTFeedAd;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.f.a;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.multipro.b.a;
import com.bytedance.sdk.openadsdk.utils.u;
import java.lang.ref.WeakReference;

/* compiled from: TTFeedAdImpl */
class b extends a implements c.C0221c, c.d, TTFeedAd, a.C0014a {

    /* renamed from: a  reason: collision with root package name */
    com.bytedance.sdk.openadsdk.multipro.b.a f538a;

    /* renamed from: b  reason: collision with root package name */
    boolean f539b = false;

    /* renamed from: c  reason: collision with root package name */
    boolean f540c = true;

    /* renamed from: d  reason: collision with root package name */
    int f541d;

    /* renamed from: e  reason: collision with root package name */
    AdSlot f542e;

    /* renamed from: f  reason: collision with root package name */
    int f543f;
    private TTFeedAd.VideoAdListener m;
    private WeakReference<NativeVideoTsView> n;

    b(Context context, n nVar, int i, AdSlot adSlot) {
        super(context, nVar, i);
        this.f543f = i;
        this.f542e = adSlot;
        this.f538a = new com.bytedance.sdk.openadsdk.multipro.b.a();
        int f2 = u.f(this.f1182h);
        this.f541d = f2;
        a(f2);
        a("embeded_ad");
    }

    public View getAdView() {
        NativeVideoTsView nativeVideoTsView;
        if (!(this.f1182h == null || this.i == null)) {
            if (n.c(this.f1182h)) {
                try {
                    nativeVideoTsView = new NativeVideoTsView(this.i, this.f1182h, this.f1181g.a());
                    this.n = new WeakReference<>(nativeVideoTsView);
                    nativeVideoTsView.setVideoAdClickListenerTTNativeAd(this);
                    nativeVideoTsView.setAdCreativeClickListener(new NativeVideoTsView.a() {
                        public void a(View view, int i) {
                            if (b.this.f1181g != null) {
                                b.this.f1181g.a(view, i);
                            }
                        }
                    });
                    nativeVideoTsView.setControllerStatusCallBack(new NativeVideoTsView.b() {
                        public void a(boolean z, long j, long j2, long j3, boolean z2) {
                            b.this.f538a.f2159a = z;
                            b.this.f538a.f2163e = j;
                            b.this.f538a.f2164f = j2;
                            b.this.f538a.f2165g = j3;
                            b.this.f538a.f2162d = z2;
                        }
                    });
                    nativeVideoTsView.setVideoAdLoadListener(this);
                    nativeVideoTsView.setVideoAdInteractionListener(this);
                    if (5 == this.f543f) {
                        nativeVideoTsView.setIsAutoPlay(this.f539b ? this.f542e.isAutoPlay() : this.f540c);
                    } else {
                        nativeVideoTsView.setIsAutoPlay(this.f540c);
                    }
                    nativeVideoTsView.setIsQuiet(m.h().a(this.f541d));
                } catch (Exception unused) {
                }
                if (n.c(this.f1182h) || nativeVideoTsView == null || !nativeVideoTsView.a(0, true, false)) {
                    return null;
                }
                return nativeVideoTsView;
            }
            nativeVideoTsView = null;
            if (n.c(this.f1182h)) {
            }
        }
        return null;
    }

    public void play() {
        try {
            if (this.n != null && this.n.get() != null && this.f539b) {
                ((NativeVideoTsView) this.n.get()).m();
            }
        } catch (Throwable unused) {
        }
    }

    public void pause() {
        try {
            if (this.n != null && this.n.get() != null && this.f539b) {
                ((NativeVideoTsView) this.n.get()).k();
            }
        } catch (Throwable unused) {
        }
    }

    public double currentPlayTime() {
        try {
            if (this.n == null || this.n.get() == null || !this.f539b) {
                return 0.0d;
            }
            return ((NativeVideoTsView) this.n.get()).getCurrentPlayTime();
        } catch (Throwable unused) {
            return 0.0d;
        }
    }

    private void a(int i) {
        int c2 = m.h().c(i);
        if (3 == c2) {
            this.f539b = false;
            this.f540c = false;
        } else if (4 == c2) {
            this.f539b = true;
        } else {
            int c3 = o.c(m.a());
            if (1 == c2 && u.e(c3)) {
                this.f539b = false;
                this.f540c = true;
            } else if (2 == c2) {
                if (u.f(c3) || u.e(c3) || u.g(c3)) {
                    this.f539b = false;
                    this.f540c = true;
                }
            } else if (5 != c2) {
            } else {
                if (u.e(c3) || u.g(c3)) {
                    this.f540c = true;
                }
            }
        }
    }

    public void setVideoAdListener(TTFeedAd.VideoAdListener videoAdListener) {
        this.m = videoAdListener;
    }

    public double getVideoDuration() {
        if (this.f1182h == null || this.f1182h.J() == null) {
            return 0.0d;
        }
        return this.f1182h.J().f();
    }

    public void e_() {
        TTFeedAd.VideoAdListener videoAdListener = this.m;
        if (videoAdListener != null) {
            videoAdListener.onVideoLoad(this);
        }
    }

    public void a(int i, int i2) {
        TTFeedAd.VideoAdListener videoAdListener = this.m;
        if (videoAdListener != null) {
            videoAdListener.onVideoError(i, i2);
        }
    }

    public void a_() {
        TTFeedAd.VideoAdListener videoAdListener = this.m;
        if (videoAdListener != null) {
            videoAdListener.onVideoAdStartPlay(this);
        }
    }

    public void b_() {
        TTFeedAd.VideoAdListener videoAdListener = this.m;
        if (videoAdListener != null) {
            videoAdListener.onVideoAdPaused(this);
        }
    }

    public void c_() {
        TTFeedAd.VideoAdListener videoAdListener = this.m;
        if (videoAdListener != null) {
            videoAdListener.onVideoAdContinuePlay(this);
        }
    }

    public void a(long j, long j2) {
        TTFeedAd.VideoAdListener videoAdListener = this.m;
        if (videoAdListener != null) {
            videoAdListener.onProgressUpdate(j, j2);
        }
    }

    public void d_() {
        TTFeedAd.VideoAdListener videoAdListener = this.m;
        if (videoAdListener != null) {
            videoAdListener.onVideoAdComplete(this);
        }
    }

    public com.bytedance.sdk.openadsdk.multipro.b.a f() {
        return this.f538a;
    }

    /* access modifiers changed from: protected */
    public void a(String str) {
        super.a(str);
    }
}
