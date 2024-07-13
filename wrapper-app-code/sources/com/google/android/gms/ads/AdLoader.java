package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbn;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzeu;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.ads.internal.client.zzg;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzbkx;
import com.google.android.gms.internal.ads.zzblz;
import com.google.android.gms.internal.ads.zzboq;
import com.google.android.gms.internal.ads.zzbos;
import com.google.android.gms.internal.ads.zzbot;
import com.google.android.gms.internal.ads.zzbvq;
import com.google.android.gms.internal.ads.zzbzd;
import com.google.android.gms.internal.ads.zzbzf;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzcho;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public class AdLoader {
    private final zzp zza;
    private final Context zzb;
    private final zzbn zzc;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
    public static class Builder {
        private final Context zza;
        private final zzbq zzb;

        public Builder(Context context, String str) {
            zzbq zzc = zzay.zza().zzc(context, str, new zzbvq());
            this.zza = (Context) Preconditions.checkNotNull(context, "context cannot be null");
            this.zzb = zzc;
        }

        public AdLoader build() {
            try {
                return new AdLoader(this.zza, this.zzb.zze(), zzp.zza);
            } catch (RemoteException e2) {
                zzcho.zzh("Failed to build AdLoader.", e2);
                return new AdLoader(this.zza, new zzeu().zzc(), zzp.zza);
            }
        }

        public Builder forCustomFormatAd(String str, NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
            zzbzd zzbzd = new zzbzd(onCustomFormatAdLoadedListener, onCustomClickListener);
            try {
                this.zzb.zzh(str, zzbzd.zzb(), zzbzd.zza());
            } catch (RemoteException e2) {
                zzcho.zzk("Failed to add custom format ad listener", e2);
            }
            return this;
        }

        @Deprecated
        public Builder forCustomTemplateAd(String str, NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
            zzboq zzboq = new zzboq(onCustomTemplateAdLoadedListener, onCustomClickListener);
            try {
                this.zzb.zzh(str, zzboq.zze(), zzboq.zzd());
            } catch (RemoteException e2) {
                zzcho.zzk("Failed to add custom template ad listener", e2);
            }
            return this;
        }

        public Builder forNativeAd(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
            try {
                this.zzb.zzk(new zzbzf(onNativeAdLoadedListener));
            } catch (RemoteException e2) {
                zzcho.zzk("Failed to add google native ad listener", e2);
            }
            return this;
        }

        @Deprecated
        public Builder forUnifiedNativeAd(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
            try {
                this.zzb.zzk(new zzbot(onUnifiedNativeAdLoadedListener));
            } catch (RemoteException e2) {
                zzcho.zzk("Failed to add google native ad listener", e2);
            }
            return this;
        }

        public Builder withAdListener(AdListener adListener) {
            try {
                this.zzb.zzl(new zzg(adListener));
            } catch (RemoteException e2) {
                zzcho.zzk("Failed to set AdListener.", e2);
            }
            return this;
        }

        public Builder withAdManagerAdViewOptions(AdManagerAdViewOptions adManagerAdViewOptions) {
            try {
                this.zzb.zzm(adManagerAdViewOptions);
            } catch (RemoteException e2) {
                zzcho.zzk("Failed to specify Ad Manager banner ad options", e2);
            }
            return this;
        }

        @Deprecated
        public Builder withNativeAdOptions(NativeAdOptions nativeAdOptions) {
            try {
                this.zzb.zzo(new zzblz(nativeAdOptions));
            } catch (RemoteException e2) {
                zzcho.zzk("Failed to specify native ad options", e2);
            }
            return this;
        }

        public Builder forAdManagerAdView(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener, AdSize... adSizeArr) {
            if (adSizeArr == null || adSizeArr.length <= 0) {
                throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
            }
            try {
                this.zzb.zzj(new zzbos(onAdManagerAdViewLoadedListener), new zzq(this.zza, adSizeArr));
            } catch (RemoteException e2) {
                zzcho.zzk("Failed to add Google Ad Manager banner ad listener", e2);
            }
            return this;
        }

        public Builder withNativeAdOptions(com.google.android.gms.ads.nativead.NativeAdOptions nativeAdOptions) {
            try {
                this.zzb.zzo(new zzblz(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), -1, nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new zzfl(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zzc(), nativeAdOptions.getMediaAspectRatio(), nativeAdOptions.zza(), nativeAdOptions.zzb()));
            } catch (RemoteException e2) {
                zzcho.zzk("Failed to specify native ad options", e2);
            }
            return this;
        }
    }

    AdLoader(Context context, zzbn zzbn, zzp zzp) {
        this.zzb = context;
        this.zzc = zzbn;
        this.zza = zzp;
    }

    private final void zzb(zzdx zzdx) {
        zzbjj.zzc(this.zzb);
        if (((Boolean) zzbkx.zzc.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzjn)).booleanValue()) {
                zzchd.zzb.execute(new zza(this, zzdx));
                return;
            }
        }
        try {
            this.zzc.zzg(this.zza.zza(this.zzb, zzdx));
        } catch (RemoteException e2) {
            zzcho.zzh("Failed to load ad.", e2);
        }
    }

    public boolean isLoading() {
        try {
            return this.zzc.zzi();
        } catch (RemoteException e2) {
            zzcho.zzk("Failed to check if ad is loading.", e2);
            return false;
        }
    }

    public void loadAd(AdRequest adRequest) {
        zzb(adRequest.zza());
    }

    public void loadAds(AdRequest adRequest, int i) {
        try {
            this.zzc.zzh(this.zza.zza(this.zzb, adRequest.zza()), i);
        } catch (RemoteException e2) {
            zzcho.zzh("Failed to load ads.", e2);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzdx zzdx) {
        try {
            this.zzc.zzg(this.zza.zza(this.zzb, zzdx));
        } catch (RemoteException e2) {
            zzcho.zzh("Failed to load ad.", e2);
        }
    }

    public void loadAd(AdManagerAdRequest adManagerAdRequest) {
        zzb(adManagerAdRequest.zza);
    }
}
