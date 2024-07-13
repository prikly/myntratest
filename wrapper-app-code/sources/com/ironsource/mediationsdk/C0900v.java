package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.C0901w;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.a;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.sdk.d;
import java.util.Date;
import java.util.List;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.v  reason: case insensitive filesystem */
public final class C0900v extends C0901w implements RewardedVideoSmashListener {
    /* access modifiers changed from: private */
    public d i;
    /* access modifiers changed from: private */
    public long j;

    C0900v(String str, String str2, NetworkSettings networkSettings, d dVar, int i2, AbstractAdapter abstractAdapter) {
        super(new a(networkSettings, networkSettings.getInterstitialSettings(), IronSource.AD_UNIT.REWARDED_VIDEO), abstractAdapter);
        this.f8967b = new a(networkSettings, networkSettings.getRewardedVideoSettings(), IronSource.AD_UNIT.REWARDED_VIDEO);
        this.f8968c = this.f8967b.f8726b;
        this.f8966a = abstractAdapter;
        this.i = dVar;
        this.f8969d = i2;
        this.f8966a.initRewardedVideoForDemandOnly(str, str2, this.f8968c, this);
    }

    private void c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "DemandOnlyRewardedVideoSmash " + this.f8967b.f8725a.getProviderName() + " : " + str, 0);
    }

    /* access modifiers changed from: private */
    public void d(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "DemandOnlyRewardedVideoSmash " + this.f8967b.f8725a.getProviderName() + " : " + str, 0);
    }

    public final void a() {
        d("showRewardedVideo state=" + g());
        if (a(C0901w.a.LOADED, C0901w.a.SHOW_IN_PROGRESS)) {
            this.f8966a.showRewardedVideo(this.f8968c, this);
            return;
        }
        this.i.a(new IronSourceError(IronSourceError.ERROR_DO_RV_CALL_LOAD_BEFORE_SHOW, "load must be called before show"), this);
    }

    public final void a(String str, String str2, JSONObject jSONObject, List<String> list) {
        d("loadRewardedVideo state=" + g());
        C0901w.a a2 = a(new C0901w.a[]{C0901w.a.NOT_LOADED, C0901w.a.LOADED}, C0901w.a.LOAD_IN_PROGRESS);
        if (a2 == C0901w.a.NOT_LOADED || a2 == C0901w.a.LOADED) {
            this.j = new Date().getTime();
            d("start timer");
            a((TimerTask) new TimerTask() {
                public final void run() {
                    C0900v vVar = C0900v.this;
                    vVar.d("load timed out state=" + C0900v.this.g());
                    if (C0900v.this.a(C0901w.a.LOAD_IN_PROGRESS, C0901w.a.NOT_LOADED)) {
                        C0900v.this.i.a(new IronSourceError(IronSourceError.ERROR_DO_RV_LOAD_TIMED_OUT, "load timed out"), C0900v.this, new Date().getTime() - C0900v.this.j);
                    }
                }
            });
            if (i()) {
                this.f8970e = str2;
                this.f8971f = jSONObject;
                this.f8972g = list;
                this.f8966a.loadRewardedVideoForDemandOnlyForBidding(this.f8968c, this, str);
                return;
            }
            this.f8966a.loadRewardedVideoForDemandOnly(this.f8968c, this);
        } else if (a2 == C0901w.a.LOAD_IN_PROGRESS) {
            this.i.a(new IronSourceError(IronSourceError.ERROR_DO_RV_LOAD_ALREADY_IN_PROGRESS, "load already in progress"), this, 0);
        } else {
            this.i.a(new IronSourceError(IronSourceError.ERROR_DO_RV_LOAD_DURING_SHOW, "cannot load because show is in progress"), this, 0);
        }
    }

    public final boolean b() {
        return this.f8966a.isRewardedVideoAvailable(this.f8968c);
    }

    public final void onRewardedVideoAdClicked() {
        c("onRewardedVideoAdClicked");
        this.i.c(this);
    }

    public final void onRewardedVideoAdClosed() {
        a(C0901w.a.NOT_LOADED);
        c("onRewardedVideoAdClosed");
        this.i.b(this);
    }

    public final void onRewardedVideoAdEnded() {
    }

    public final void onRewardedVideoAdOpened() {
        c("onRewardedVideoAdOpened");
        this.i.a(this);
    }

    public final void onRewardedVideoAdRewarded() {
        c("onRewardedVideoAdRewarded");
        this.i.e(this);
    }

    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        a(C0901w.a.NOT_LOADED);
        c("onRewardedVideoAdClosed error=" + ironSourceError);
        this.i.a(ironSourceError, this);
    }

    public final void onRewardedVideoAdStarted() {
    }

    public final void onRewardedVideoAdVisible() {
        c("onRewardedVideoAdVisible");
        this.i.d(this);
    }

    public final void onRewardedVideoAvailabilityChanged(boolean z) {
    }

    public final void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
    }

    public final void onRewardedVideoInitSuccess() {
    }

    public final void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        c("onRewardedVideoLoadFailed error=" + ironSourceError.getErrorMessage() + " state=" + g());
        h();
        if (a(C0901w.a.LOAD_IN_PROGRESS, C0901w.a.NOT_LOADED)) {
            this.i.a(ironSourceError, this, new Date().getTime() - this.j);
        }
    }

    public final void onRewardedVideoLoadSuccess() {
        c("onRewardedVideoLoadSuccess state=" + g());
        h();
        if (a(C0901w.a.LOAD_IN_PROGRESS, C0901w.a.LOADED)) {
            this.i.a(this, new Date().getTime() - this.j);
        }
    }
}
