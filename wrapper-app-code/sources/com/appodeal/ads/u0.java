package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.utils.Log;

public final class u0 extends g<w0, v0, Object> {

    /* renamed from: a  reason: collision with root package name */
    public BannerCallbacks f17448a;

    public final void a(r rVar, l lVar, Object obj) {
        w0 w0Var = (w0) rVar;
        v0 v0Var = (v0) lVar;
        Log.log("Banner", LogConstants.EVENT_NOTIFY_CLICKED, Log.LogLevel.verbose);
        BannerCallbacks bannerCallbacks = this.f17448a;
        if (bannerCallbacks != null) {
            bannerCallbacks.onBannerClicked();
        }
    }

    public final void b(r rVar, l lVar) {
        w0 w0Var = (w0) rVar;
        v0 v0Var = (v0) lVar;
        Log.log("Banner", LogConstants.EVENT_NOTIFY_EXPIRED, Log.LogLevel.verbose);
        BannerCallbacks bannerCallbacks = this.f17448a;
        if (bannerCallbacks != null) {
            bannerCallbacks.onBannerExpired();
        }
    }

    public final void c(r rVar, l lVar, Object obj) {
        w0 w0Var = (w0) rVar;
        v0 v0Var = (v0) lVar;
        Log.log("Banner", LogConstants.EVENT_NOTIFY_SHOWN, Log.LogLevel.verbose);
        BannerCallbacks bannerCallbacks = this.f17448a;
        if (bannerCallbacks != null) {
            bannerCallbacks.onBannerShown();
        }
    }

    public final void d(r rVar, l lVar) {
        w0 w0Var = (w0) rVar;
        v0 v0Var = (v0) lVar;
        Log.log("Banner", LogConstants.EVENT_NOTIFY_LOAD_FAILED, Log.LogLevel.verbose);
        BannerCallbacks bannerCallbacks = this.f17448a;
        if (bannerCallbacks != null) {
            bannerCallbacks.onBannerFailedToLoad();
        }
    }

    public final void e(r rVar, l lVar) {
        w0 w0Var = (w0) rVar;
        v0 v0Var = (v0) lVar;
        Log.log("Banner", LogConstants.EVENT_NOTIFY_LOADED, String.format("height: %sdp, isPrecache: %s", new Object[]{Integer.valueOf(v0Var.m()), Boolean.valueOf(v0Var.isPrecache())}), Log.LogLevel.verbose);
        BannerCallbacks bannerCallbacks = this.f17448a;
        if (bannerCallbacks != null) {
            bannerCallbacks.onBannerLoaded(v0Var.m(), v0Var.isPrecache());
        }
    }

    public final void b(r rVar, l lVar, Object obj) {
        w0 w0Var = (w0) rVar;
        v0 v0Var = (v0) lVar;
        Log.log("Banner", LogConstants.EVENT_NOTIFY_SHOW_FAILED, Log.LogLevel.verbose);
        BannerCallbacks bannerCallbacks = this.f17448a;
        if (bannerCallbacks != null) {
            bannerCallbacks.onBannerShowFailed();
        }
    }
}
