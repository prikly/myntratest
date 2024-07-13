package com.google.android.gms.ads.admanager;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzbkx;
import com.google.android.gms.internal.ads.zzcat;
import com.google.android.gms.internal.ads.zzchd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class AdManagerAdView extends BaseAdView {
    public AdManagerAdView(Context context) {
        super(context, 0);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }

    public AdSize[] getAdSizes() {
        return this.zza.zzB();
    }

    public AppEventListener getAppEventListener() {
        return this.zza.zzh();
    }

    public VideoController getVideoController() {
        return this.zza.zzf();
    }

    public VideoOptions getVideoOptions() {
        return this.zza.zzg();
    }

    public void loadAd(AdManagerAdRequest adManagerAdRequest) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbjj.zzc(getContext());
        if (((Boolean) zzbkx.zzf.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzjn)).booleanValue()) {
                zzchd.zzb.execute(new zzb(this, adManagerAdRequest));
                return;
            }
        }
        this.zza.zzm(adManagerAdRequest.zza());
    }

    public void recordManualImpression() {
        this.zza.zzo();
    }

    public void setAdSizes(AdSize... adSizeArr) {
        if (adSizeArr == null || adSizeArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.zza.zzt(adSizeArr);
    }

    public void setAppEventListener(AppEventListener appEventListener) {
        this.zza.zzv(appEventListener);
    }

    public void setManualImpressionsEnabled(boolean z) {
        this.zza.zzw(z);
    }

    public void setVideoOptions(VideoOptions videoOptions) {
        this.zza.zzy(videoOptions);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(AdManagerAdRequest adManagerAdRequest) {
        try {
            this.zza.zzm(adManagerAdRequest.zza());
        } catch (IllegalStateException e2) {
            zzcat.zza(getContext()).zzf(e2, "AdManagerAdView.loadAd");
        }
    }

    public final boolean zzb(zzbu zzbu) {
        return this.zza.zzz(zzbu);
    }

    public AdManagerAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, true);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }

    public AdManagerAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, true);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }
}
