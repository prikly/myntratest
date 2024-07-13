package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zze;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzeal {
    private final zzbra zza;

    zzeal(zzbra zzbra) {
        this.zza = zzbra;
    }

    private final void zzs(zzeak zzeak) throws RemoteException {
        String zza2 = zzeak.zza(zzeak);
        zze.zzi("Dispatching AFMA event on publisher webview: ".concat(zza2));
        this.zza.zzb(zza2);
    }

    public final void zza() throws RemoteException {
        zzs(new zzeak(MobileAdsBridgeBase.initializeMethodName, (zzeaj) null));
    }

    public final void zzb(long j) throws RemoteException {
        zzeak zzeak = new zzeak("interstitial", (zzeaj) null);
        zzeak.zza = Long.valueOf(j);
        zzeak.zzc = "onAdClicked";
        this.zza.zzb(zzeak.zza(zzeak));
    }

    public final void zzc(long j) throws RemoteException {
        zzeak zzeak = new zzeak("interstitial", (zzeaj) null);
        zzeak.zza = Long.valueOf(j);
        zzeak.zzc = "onAdClosed";
        zzs(zzeak);
    }

    public final void zzd(long j, int i) throws RemoteException {
        zzeak zzeak = new zzeak("interstitial", (zzeaj) null);
        zzeak.zza = Long.valueOf(j);
        zzeak.zzc = "onAdFailedToLoad";
        zzeak.zzd = Integer.valueOf(i);
        zzs(zzeak);
    }

    public final void zze(long j) throws RemoteException {
        zzeak zzeak = new zzeak("interstitial", (zzeaj) null);
        zzeak.zza = Long.valueOf(j);
        zzeak.zzc = "onAdLoaded";
        zzs(zzeak);
    }

    public final void zzf(long j) throws RemoteException {
        zzeak zzeak = new zzeak("interstitial", (zzeaj) null);
        zzeak.zza = Long.valueOf(j);
        zzeak.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzeak);
    }

    public final void zzg(long j) throws RemoteException {
        zzeak zzeak = new zzeak("interstitial", (zzeaj) null);
        zzeak.zza = Long.valueOf(j);
        zzeak.zzc = "onAdOpened";
        zzs(zzeak);
    }

    public final void zzh(long j) throws RemoteException {
        zzeak zzeak = new zzeak("creation", (zzeaj) null);
        zzeak.zza = Long.valueOf(j);
        zzeak.zzc = "nativeObjectCreated";
        zzs(zzeak);
    }

    public final void zzi(long j) throws RemoteException {
        zzeak zzeak = new zzeak("creation", (zzeaj) null);
        zzeak.zza = Long.valueOf(j);
        zzeak.zzc = "nativeObjectNotCreated";
        zzs(zzeak);
    }

    public final void zzj(long j) throws RemoteException {
        zzeak zzeak = new zzeak("rewarded", (zzeaj) null);
        zzeak.zza = Long.valueOf(j);
        zzeak.zzc = "onAdClicked";
        zzs(zzeak);
    }

    public final void zzk(long j) throws RemoteException {
        zzeak zzeak = new zzeak("rewarded", (zzeaj) null);
        zzeak.zza = Long.valueOf(j);
        zzeak.zzc = "onRewardedAdClosed";
        zzs(zzeak);
    }

    public final void zzl(long j, zzcdh zzcdh) throws RemoteException {
        zzeak zzeak = new zzeak("rewarded", (zzeaj) null);
        zzeak.zza = Long.valueOf(j);
        zzeak.zzc = "onUserEarnedReward";
        zzeak.zze = zzcdh.zzf();
        zzeak.zzf = Integer.valueOf(zzcdh.zze());
        zzs(zzeak);
    }

    public final void zzm(long j, int i) throws RemoteException {
        zzeak zzeak = new zzeak("rewarded", (zzeaj) null);
        zzeak.zza = Long.valueOf(j);
        zzeak.zzc = "onRewardedAdFailedToLoad";
        zzeak.zzd = Integer.valueOf(i);
        zzs(zzeak);
    }

    public final void zzn(long j, int i) throws RemoteException {
        zzeak zzeak = new zzeak("rewarded", (zzeaj) null);
        zzeak.zza = Long.valueOf(j);
        zzeak.zzc = "onRewardedAdFailedToShow";
        zzeak.zzd = Integer.valueOf(i);
        zzs(zzeak);
    }

    public final void zzo(long j) throws RemoteException {
        zzeak zzeak = new zzeak("rewarded", (zzeaj) null);
        zzeak.zza = Long.valueOf(j);
        zzeak.zzc = "onAdImpression";
        zzs(zzeak);
    }

    public final void zzp(long j) throws RemoteException {
        zzeak zzeak = new zzeak("rewarded", (zzeaj) null);
        zzeak.zza = Long.valueOf(j);
        zzeak.zzc = "onRewardedAdLoaded";
        zzs(zzeak);
    }

    public final void zzq(long j) throws RemoteException {
        zzeak zzeak = new zzeak("rewarded", (zzeaj) null);
        zzeak.zza = Long.valueOf(j);
        zzeak.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzeak);
    }

    public final void zzr(long j) throws RemoteException {
        zzeak zzeak = new zzeak("rewarded", (zzeaj) null);
        zzeak.zza = Long.valueOf(j);
        zzeak.zzc = "onRewardedAdOpened";
        zzs(zzeak);
    }
}
