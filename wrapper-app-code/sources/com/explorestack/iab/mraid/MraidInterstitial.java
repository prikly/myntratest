package com.explorestack.iab.mraid;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.explorestack.iab.CacheControl;
import com.explorestack.iab.measurer.MraidAdMeasurer;
import com.explorestack.iab.mraid.MraidView;
import com.explorestack.iab.utils.IabClickCallback;
import com.explorestack.iab.utils.IabElementStyle;
import java.util.concurrent.atomic.AtomicInteger;

public class MraidInterstitial {
    public static final String i;
    public static final AtomicInteger j = new AtomicInteger(0);
    public static final /* synthetic */ boolean k;

    /* renamed from: a  reason: collision with root package name */
    public MraidInterstitialListener f2947a;

    /* renamed from: b  reason: collision with root package name */
    public MraidView f2948b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2949c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2950d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2951e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2952f = true;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2953g = false;

    /* renamed from: h  reason: collision with root package name */
    public final MraidViewListener f2954h = new a();
    public final int id = j.getAndIncrement();

    public class Builder {

        /* renamed from: a  reason: collision with root package name */
        public final MraidView.Builder f2955a = new MraidView.Builder(d.INTERSTITIAL);

        public Builder() {
        }

        public MraidInterstitial build(Context context) {
            this.f2955a.setListener(MraidInterstitial.this.f2954h);
            MraidInterstitial.this.f2948b = this.f2955a.build(context);
            return MraidInterstitial.this;
        }

        public Builder forceUseNativeCloseButton(boolean z) {
            this.f2955a.forceUseNativeCloseButton(z);
            return this;
        }

        public Builder setAdMeasurer(MraidAdMeasurer mraidAdMeasurer) {
            this.f2955a.setAdMeasurer(mraidAdMeasurer);
            return this;
        }

        public Builder setBaseUrl(String str) {
            this.f2955a.setBaseUrl(str);
            return this;
        }

        public Builder setCacheControl(CacheControl cacheControl) {
            this.f2955a.setCacheControl(cacheControl);
            return this;
        }

        public Builder setCloseStyle(IabElementStyle iabElementStyle) {
            this.f2955a.setCloseStyle(iabElementStyle);
            return this;
        }

        public Builder setCloseTime(float f2) {
            this.f2955a.setCloseTimeSec(f2);
            return this;
        }

        public Builder setCountDownStyle(IabElementStyle iabElementStyle) {
            this.f2955a.setCountDownStyle(iabElementStyle);
            return this;
        }

        public Builder setDurationSec(float f2) {
            this.f2955a.setDurationSec(f2);
            return this;
        }

        public Builder setIsTag(boolean z) {
            this.f2955a.setIsTag(z);
            return this;
        }

        public Builder setListener(MraidInterstitialListener mraidInterstitialListener) {
            MraidInterstitialListener unused = MraidInterstitial.this.f2947a = mraidInterstitialListener;
            return this;
        }

        public Builder setLoadingStyle(IabElementStyle iabElementStyle) {
            this.f2955a.setLoadingStyle(iabElementStyle);
            return this;
        }

        public Builder setPageFinishedScript(String str) {
            this.f2955a.setPageFinishedScript(str);
            return this;
        }

        public Builder setPlaceholderTimeoutSec(float f2) {
            this.f2955a.setPlaceholderTimeoutSec(f2);
            return this;
        }

        public Builder setProductLink(String str) {
            this.f2955a.setProductLink(str);
            return this;
        }

        public Builder setProgressStyle(IabElementStyle iabElementStyle) {
            this.f2955a.setProgressStyle(iabElementStyle);
            return this;
        }

        public Builder setR1(boolean z) {
            this.f2955a.setR1(z);
            return this;
        }

        public Builder setR2(boolean z) {
            this.f2955a.setR2(z);
            return this;
        }
    }

    public class a implements MraidViewListener {
        public a() {
        }

        public void onClose(MraidView mraidView) {
            MraidLog.d(MraidInterstitial.i, "ViewListener: onClose");
            MraidInterstitial.this.b();
            MraidInterstitial.this.c();
        }

        public void onError(MraidView mraidView, int i) {
            String a2 = MraidInterstitial.i;
            MraidLog.d(a2, "ViewListener: onError (" + i + ")");
            MraidInterstitial.this.b();
            MraidInterstitial.this.a(i);
        }

        public void onExpand(MraidView mraidView) {
        }

        public void onLoaded(MraidView mraidView) {
            MraidLog.d(MraidInterstitial.i, "ViewListener: onLoaded");
            boolean unused = MraidInterstitial.this.f2949c = true;
            if (MraidInterstitial.this.f2947a != null) {
                MraidInterstitial.this.f2947a.onLoaded(MraidInterstitial.this);
            }
        }

        public void onOpenBrowser(MraidView mraidView, String str, IabClickCallback iabClickCallback) {
            String a2 = MraidInterstitial.i;
            MraidLog.d(a2, "ViewListener: onOpenBrowser (" + str + ")");
            if (MraidInterstitial.this.f2947a != null) {
                MraidInterstitial.this.f2947a.onOpenBrowser(MraidInterstitial.this, str, iabClickCallback);
            }
        }

        public void onPlayVideo(MraidView mraidView, String str) {
            String a2 = MraidInterstitial.i;
            MraidLog.d(a2, "ViewListener: onPlayVideo (" + str + ")");
            if (MraidInterstitial.this.f2947a != null) {
                MraidInterstitial.this.f2947a.onPlayVideo(MraidInterstitial.this, str);
            }
        }

        public void onShown(MraidView mraidView) {
            MraidLog.d(MraidInterstitial.i, "ViewListener: onShown");
            if (MraidInterstitial.this.f2947a != null) {
                MraidInterstitial.this.f2947a.onShown(MraidInterstitial.this);
            }
        }
    }

    static {
        Class<MraidInterstitial> cls = MraidInterstitial.class;
        k = !cls.desiredAssertionStatus();
        i = cls.getSimpleName();
    }

    private MraidInterstitial() {
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public void a(int i2) {
        this.f2949c = false;
        this.f2951e = true;
        MraidInterstitialListener mraidInterstitialListener = this.f2947a;
        if (mraidInterstitialListener != null) {
            mraidInterstitialListener.onError(this, i2);
        }
        destroy();
    }

    public void a(Activity activity, ViewGroup viewGroup, boolean z, boolean z2) {
        if (!isReady()) {
            if (activity != null && z) {
                activity.finish();
                activity.overridePendingTransition(0, 0);
            }
            d();
            MraidLog.b(i, "Show failed: interstitial is not ready");
        } else if (k || this.f2948b != null) {
            this.f2952f = z2;
            this.f2953g = z;
            viewGroup.addView(this.f2948b, new ViewGroup.LayoutParams(-1, -1));
            this.f2948b.show(activity);
        } else {
            throw new AssertionError();
        }
    }

    public void a(Activity activity, boolean z) {
        a(activity, (ViewGroup) activity.findViewById(16908290), true, z);
    }

    public final void b() {
        Activity peekActivity;
        if (this.f2953g && (peekActivity = this.f2948b.peekActivity()) != null) {
            peekActivity.finish();
            peekActivity.overridePendingTransition(0, 0);
        }
    }

    public void c() {
        if (!isClosed() && !isReceivedError()) {
            this.f2949c = false;
            this.f2950d = true;
            MraidInterstitialListener mraidInterstitialListener = this.f2947a;
            if (mraidInterstitialListener != null) {
                mraidInterstitialListener.onClose(this);
            }
            if (this.f2952f) {
                destroy();
            }
        }
    }

    public boolean canBeClosed() {
        MraidView mraidView = this.f2948b;
        return mraidView == null || mraidView.canBeClosed() || isReceivedError();
    }

    public void d() {
        MraidInterstitialListener mraidInterstitialListener = this.f2947a;
        if (mraidInterstitialListener != null) {
            mraidInterstitialListener.onError(this, 1);
        }
    }

    public void destroy() {
        MraidLog.d(i, "destroy");
        this.f2949c = false;
        this.f2947a = null;
        MraidView mraidView = this.f2948b;
        if (mraidView != null) {
            mraidView.destroy();
            this.f2948b = null;
        }
    }

    public void dispatchClose() {
        if (this.f2948b != null && canBeClosed()) {
            this.f2948b.f();
        }
    }

    public boolean isClosed() {
        return this.f2950d;
    }

    public boolean isReady() {
        return this.f2949c && this.f2948b != null;
    }

    public boolean isReceivedError() {
        return this.f2951e;
    }

    public void load(String str) {
        MraidView mraidView = this.f2948b;
        if (mraidView != null) {
            mraidView.load(str);
            return;
        }
        throw new IllegalStateException("MraidView not created (mraidView == null)");
    }

    public void show(Context context, MraidType mraidType) {
        MraidActivity.show(context, this, mraidType);
    }

    public void showInView(ViewGroup viewGroup, boolean z) {
        a((Activity) null, viewGroup, false, z);
    }
}
