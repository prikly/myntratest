package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzfd;
import com.google.android.gms.ads.internal.client.zzfe;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzcee extends RewardedInterstitialAd {
    private final String zza;
    private final zzcdk zzb;
    private final Context zzc;
    private final zzcec zzd = new zzcec();
    private FullScreenContentCallback zze;
    private OnAdMetadataChangedListener zzf;
    private OnPaidEventListener zzg;

    public zzcee(Context context, String str) {
        this.zza = str;
        this.zzc = context.getApplicationContext();
        this.zzb = zzay.zza().zzq(context, str, new zzbvq());
    }

    public final Bundle getAdMetadata() {
        try {
            zzcdk zzcdk = this.zzb;
            if (zzcdk != null) {
                return zzcdk.zzb();
            }
        } catch (RemoteException e2) {
            zzcho.zzl("#007 Could not call remote method.", e2);
        }
        return new Bundle();
    }

    public final String getAdUnitId() {
        return this.zza;
    }

    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.zze;
    }

    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.zzf;
    }

    public final OnPaidEventListener getOnPaidEventListener() {
        return this.zzg;
    }

    public final ResponseInfo getResponseInfo() {
        zzdn zzdn = null;
        try {
            zzcdk zzcdk = this.zzb;
            if (zzcdk != null) {
                zzdn = zzcdk.zzc();
            }
        } catch (RemoteException e2) {
            zzcho.zzl("#007 Could not call remote method.", e2);
        }
        return ResponseInfo.zzb(zzdn);
    }

    public final RewardItem getRewardItem() {
        try {
            zzcdk zzcdk = this.zzb;
            zzcdh zzd2 = zzcdk != null ? zzcdk.zzd() : null;
            if (zzd2 != null) {
                return new zzcdu(zzd2);
            }
        } catch (RemoteException e2) {
            zzcho.zzl("#007 Could not call remote method.", e2);
        }
        return RewardItem.DEFAULT_REWARD;
    }

    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.zze = fullScreenContentCallback;
        this.zzd.zzb(fullScreenContentCallback);
    }

    public final void setImmersiveMode(boolean z) {
        try {
            zzcdk zzcdk = this.zzb;
            if (zzcdk != null) {
                zzcdk.zzh(z);
            }
        } catch (RemoteException e2) {
            zzcho.zzl("#007 Could not call remote method.", e2);
        }
    }

    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.zzf = onAdMetadataChangedListener;
        try {
            zzcdk zzcdk = this.zzb;
            if (zzcdk != null) {
                zzcdk.zzi(new zzfd(onAdMetadataChangedListener));
            }
        } catch (RemoteException e2) {
            zzcho.zzl("#007 Could not call remote method.", e2);
        }
    }

    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.zzg = onPaidEventListener;
        try {
            zzcdk zzcdk = this.zzb;
            if (zzcdk != null) {
                zzcdk.zzj(new zzfe(onPaidEventListener));
            }
        } catch (RemoteException e2) {
            zzcho.zzl("#007 Could not call remote method.", e2);
        }
    }

    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        try {
            zzcdk zzcdk = this.zzb;
            if (zzcdk != null) {
                zzcdk.zzl(new zzcdy(serverSideVerificationOptions));
            }
        } catch (RemoteException e2) {
            zzcho.zzl("#007 Could not call remote method.", e2);
        }
    }

    public final void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener) {
        this.zzd.zzc(onUserEarnedRewardListener);
        try {
            zzcdk zzcdk = this.zzb;
            if (zzcdk != null) {
                zzcdk.zzk(this.zzd);
                this.zzb.zzm(ObjectWrapper.wrap(activity));
            }
        } catch (RemoteException e2) {
            zzcho.zzl("#007 Could not call remote method.", e2);
        }
    }

    public final void zza(zzdx zzdx, RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        try {
            zzcdk zzcdk = this.zzb;
            if (zzcdk != null) {
                zzcdk.zzg(zzp.zza.zza(this.zzc, zzdx), new zzced(rewardedInterstitialAdLoadCallback, this));
            }
        } catch (RemoteException e2) {
            zzcho.zzl("#007 Could not call remote method.", e2);
        }
    }
}
