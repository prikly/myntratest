package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.C0901w;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.a;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.sdk.b;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.r  reason: case insensitive filesystem */
public final class C0896r extends C0901w implements BannerSmashListener {
    /* access modifiers changed from: private */
    public b i;
    /* access modifiers changed from: private */
    public long j;
    private String k;
    private String l;
    private JSONObject m;

    public C0896r(String str, String str2, NetworkSettings networkSettings, b bVar, int i2, AbstractAdapter abstractAdapter) {
        super(new a(networkSettings, networkSettings.getBannerSettings(), IronSource.AD_UNIT.BANNER), abstractAdapter);
        this.i = bVar;
        this.f8969d = i2;
        this.k = str;
        this.l = str2;
        this.m = networkSettings.getBannerSettings();
        this.f8966a.initBannerForBidding(str, str2, this.f8968c, this);
    }

    public final void a() {
        IronLog.INTERNAL.verbose("");
        if (this.f8966a == null) {
            IronLog.INTERNAL.error("destroyBanner() mAdapter == null");
        } else if (a(C0901w.a.LOADED, C0901w.a.NOT_LOADED) || a(C0901w.a.LOAD_IN_PROGRESS, C0901w.a.NOT_LOADED)) {
            h();
            this.f8966a.destroyBanner(this.f8967b.f8725a.getBannerSettings());
        } else {
            IronLog.INTERNAL.error("cannot destroy banner not loaded");
        }
    }

    public final void a(IronSourceBannerLayout ironSourceBannerLayout, String str, String str2, JSONObject jSONObject, List<String> list) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("loadBanner state=" + g());
        C0901w.a a2 = a(new C0901w.a[]{C0901w.a.NOT_LOADED, C0901w.a.LOADED}, C0901w.a.LOAD_IN_PROGRESS);
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) {
            IronLog.INTERNAL.error("loadBanner - bannerLayout is null or destroyed");
            this.i.a(new IronSourceError(610, ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed"), this, false, new Date().getTime() - this.j);
        } else if (str == null) {
            IronLog.INTERNAL.error("loadBanner - serverData is null");
            this.i.a(new IronSourceError(618, "serverData==null"), this, false, new Date().getTime() - this.j);
        } else if (this.f8966a == null) {
            IronLog.INTERNAL.error("loadBanner - mAdapter is null");
            this.i.a(new IronSourceError(611, "adapter==null"), this, false, new Date().getTime() - this.j);
        } else if (a2 == C0901w.a.NOT_LOADED) {
            this.j = new Date().getTime();
            IronLog.INTERNAL.verbose("start timer");
            a((TimerTask) new TimerTask() {
                public final void run() {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.verbose("load timed out state=" + C0896r.this.g());
                    if (C0896r.this.a(C0901w.a.LOAD_IN_PROGRESS, C0901w.a.NOT_LOADED)) {
                        C0896r.this.i.a(new IronSourceError(608, "load timed out"), C0896r.this, false, new Date().getTime() - C0896r.this.j);
                    }
                }
            });
            this.f8970e = str2;
            this.f8971f = jSONObject;
            this.f8972g = list;
            this.f8966a.initBannerForBidding(this.k, this.l, this.m, this);
            this.f8966a.loadBannerForBidding(ironSourceBannerLayout, this.m, this, str);
        } else {
            this.i.a(a2 == C0901w.a.LOAD_IN_PROGRESS ? new IronSourceError(619, "load already in progress") : new IronSourceError(IronSourceError.ERROR_DO_BN_LOAD_DURING_SHOW, "load while show"), this, false, new Date().getTime() - this.j);
        }
    }

    public final String b() {
        return this.f8967b.f8725a.isMultipleInstances() ? this.f8967b.f8725a.getProviderTypeForReflection() : this.f8967b.f8725a.getProviderName();
    }

    public final Map<String, Object> c() {
        HashMap hashMap = new HashMap();
        try {
            String str = "";
            hashMap.put("providerAdapterVersion", this.f8966a != null ? this.f8966a.getVersion() : str);
            if (this.f8966a != null) {
                str = this.f8966a.getCoreSDKVersion();
            }
            hashMap.put("providerSDKVersion", str);
            hashMap.put("spId", this.f8967b.f8725a.getSubProviderId());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.f8967b.f8725a.getAdSourceNameForEvents());
            hashMap.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
            hashMap.put("instanceType", 2);
            if (!TextUtils.isEmpty(this.f8970e)) {
                hashMap.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f8970e);
            }
            if (this.f8971f != null && this.f8971f.length() > 0) {
                hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f8971f);
            }
            if (!TextUtils.isEmpty(this.f8973h)) {
                hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID, this.f8973h);
            }
        } catch (Exception e2) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, "getProviderEventData " + d() + ")", e2);
        }
        return hashMap;
    }

    public final void onBannerAdClicked() {
        b bVar = this.i;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    public final void onBannerAdLeftApplication() {
        b bVar = this.i;
        if (bVar != null) {
            bVar.d(this);
        }
    }

    public final void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("");
        if (a(C0901w.a.LOAD_IN_PROGRESS, C0901w.a.NOT_LOADED)) {
            h();
            boolean z = ironSourceError.getErrorCode() == 606;
            if (this.i != null) {
                this.i.a(ironSourceError, this, z, new Date().getTime() - this.j);
            }
            a(C0901w.a.NOT_LOADED);
        }
    }

    public final void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        IronLog.INTERNAL.verbose("");
        if (a(C0901w.a.LOAD_IN_PROGRESS, C0901w.a.LOADED)) {
            b bVar = this.i;
            if (bVar != null) {
                bVar.a(this, view, layoutParams);
            }
            h();
        }
    }

    public final void onBannerAdScreenDismissed() {
        b bVar = this.i;
        if (bVar != null) {
            bVar.b(this);
        }
    }

    public final void onBannerAdScreenPresented() {
        b bVar = this.i;
        if (bVar != null) {
            bVar.c(this);
        }
    }

    public final void onBannerAdShown() {
        b bVar = this.i;
        if (bVar != null) {
            bVar.e(this);
            this.i.c(this);
        }
    }

    public final void onBannerInitFailed(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("");
    }

    public final void onBannerInitSuccess() {
        IronLog.INTERNAL.verbose("");
    }
}
