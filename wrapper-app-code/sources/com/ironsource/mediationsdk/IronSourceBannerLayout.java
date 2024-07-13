package com.ironsource.mediationsdk;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ironsource.environment.e.c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.BannerListener;

public class IronSourceBannerLayout extends FrameLayout {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public View f8192a;

    /* renamed from: b  reason: collision with root package name */
    private ISBannerSize f8193b;

    /* renamed from: c  reason: collision with root package name */
    private String f8194c;

    /* renamed from: d  reason: collision with root package name */
    private Activity f8195d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f8196e = false;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public boolean f8197f = false;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public BannerListener f8198g;

    public IronSourceBannerLayout(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.f8195d = activity;
        this.f8193b = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
    }

    /* access modifiers changed from: protected */
    public final IronSourceBannerLayout a() {
        IronSourceBannerLayout ironSourceBannerLayout = new IronSourceBannerLayout(this.f8195d, this.f8193b);
        ironSourceBannerLayout.setBannerListener(this.f8198g);
        ironSourceBannerLayout.setPlacementName(this.f8194c);
        return ironSourceBannerLayout;
    }

    /* access modifiers changed from: package-private */
    public final void a(final View view, final FrameLayout.LayoutParams layoutParams) {
        c.f8074a.a(new Runnable() {
            public final void run() {
                IronSourceBannerLayout.this.removeAllViews();
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(view);
                }
                View unused = IronSourceBannerLayout.this.f8192a = view;
                IronSourceBannerLayout.this.addView(view, 0, layoutParams);
            }
        });
    }

    /* access modifiers changed from: package-private */
    public final void a(final IronSourceError ironSourceError) {
        c.f8074a.a(new Runnable() {
            public final void run() {
                if (IronSourceBannerLayout.this.f8197f) {
                    IronLog ironLog = IronLog.CALLBACK;
                    ironLog.info("onBannerAdLoadFailed error=" + ironSourceError);
                    IronSourceBannerLayout.this.f8198g.onBannerAdLoadFailed(ironSourceError);
                    return;
                }
                try {
                    if (IronSourceBannerLayout.this.f8192a != null) {
                        IronSourceBannerLayout.this.removeView(IronSourceBannerLayout.this.f8192a);
                        View unused = IronSourceBannerLayout.this.f8192a = null;
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                if (IronSourceBannerLayout.this.f8198g != null) {
                    IronLog ironLog2 = IronLog.CALLBACK;
                    ironLog2.info("onBannerAdLoadFailed error=" + ironSourceError);
                    IronSourceBannerLayout.this.f8198g.onBannerAdLoadFailed(ironSourceError);
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public final void a(final String str) {
        c.f8074a.a(new Runnable() {
            public final void run() {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("smash - " + str);
                if (IronSourceBannerLayout.this.f8198g != null && !IronSourceBannerLayout.this.f8197f) {
                    IronLog.CALLBACK.info("");
                    IronSourceBannerLayout.this.f8198g.onBannerAdLoaded();
                }
                boolean unused = IronSourceBannerLayout.this.f8197f = true;
            }
        });
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.f8196e = true;
        this.f8198g = null;
        this.f8195d = null;
        this.f8193b = null;
        this.f8194c = null;
        this.f8192a = null;
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        c.f8074a.a(new Runnable() {
            public final void run() {
                if (IronSourceBannerLayout.this.f8198g != null) {
                    IronLog.CALLBACK.info("");
                    IronSourceBannerLayout.this.f8198g.onBannerAdClicked();
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        c.f8074a.a(new Runnable() {
            public final void run() {
                if (IronSourceBannerLayout.this.f8198g != null) {
                    IronLog.CALLBACK.info("");
                    IronSourceBannerLayout.this.f8198g.onBannerAdScreenPresented();
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        c.f8074a.a(new Runnable() {
            public final void run() {
                if (IronSourceBannerLayout.this.f8198g != null) {
                    IronLog.CALLBACK.info("");
                    IronSourceBannerLayout.this.f8198g.onBannerAdScreenDismissed();
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        c.f8074a.a(new Runnable() {
            public final void run() {
                if (IronSourceBannerLayout.this.f8198g != null) {
                    IronLog.CALLBACK.info("");
                    IronSourceBannerLayout.this.f8198g.onBannerAdLeftApplication();
                }
            }
        });
    }

    public Activity getActivity() {
        return this.f8195d;
    }

    public BannerListener getBannerListener() {
        return this.f8198g;
    }

    public View getBannerView() {
        return this.f8192a;
    }

    public String getPlacementName() {
        return this.f8194c;
    }

    public ISBannerSize getSize() {
        return this.f8193b;
    }

    public boolean isDestroyed() {
        return this.f8196e;
    }

    public void removeBannerListener() {
        IronLog.API.info("");
        this.f8198g = null;
    }

    public void setBannerListener(BannerListener bannerListener) {
        IronLog.API.info("");
        this.f8198g = bannerListener;
    }

    public void setPlacementName(String str) {
        this.f8194c = str;
    }
}
