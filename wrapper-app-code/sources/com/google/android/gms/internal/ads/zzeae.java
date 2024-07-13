package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzeae implements zza, zzasm, zzden, zzdeq, zzdfh, zzdfi, zzdgb, zzdhi, zzfnk {
    private final List zza;
    private final zzdzs zzb;
    private long zzc;

    public zzeae(zzdzs zzdzs, zzcpj zzcpj) {
        this.zzb = zzdzs;
        this.zza = Collections.singletonList(zzcpj);
    }

    private final void zze(Class cls, String str, Object... objArr) {
        this.zzb.zza(this.zza, "Event-".concat(String.valueOf(cls.getSimpleName())), str, objArr);
    }

    public final void onAdClicked() {
        zze(zza.class, "onAdClicked", new Object[0]);
    }

    public final void zza(zze zze) {
        zze(zzdeq.class, "onAdFailedToLoad", Integer.valueOf(zze.zza), zze.zzb, zze.zzc);
    }

    public final void zzb(zzfix zzfix) {
    }

    public final void zzbG(zzccb zzccb) {
        this.zzc = zzt.zzB().elapsedRealtime();
        zze(zzdhi.class, "onAdRequest", new Object[0]);
    }

    public final void zzbH(zzfnd zzfnd, String str) {
        zze(zzfnc.class, "onTaskCreated", str);
    }

    public final void zzbI(zzfnd zzfnd, String str, Throwable th) {
        zze(zzfnc.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    public final void zzbr(Context context) {
        zze(zzdfi.class, "onDestroy", context);
    }

    public final void zzbt(Context context) {
        zze(zzdfi.class, "onPause", context);
    }

    public final void zzbu(Context context) {
        zze(zzdfi.class, "onResume", context);
    }

    public final void zzbv(String str, String str2) {
        zze(zzasm.class, "onAppEvent", str, str2);
    }

    public final void zzbw() {
        zze(zzden.class, "onRewardedVideoCompleted", new Object[0]);
    }

    public final void zzbx() {
        zze(zzden.class, "onRewardedVideoStarted", new Object[0]);
    }

    public final void zzc(zzfnd zzfnd, String str) {
        zze(zzfnc.class, "onTaskStarted", str);
    }

    public final void zzd(zzfnd zzfnd, String str) {
        zze(zzfnc.class, "onTaskSucceeded", str);
    }

    public final void zzj() {
        zze(zzden.class, "onAdClosed", new Object[0]);
    }

    public final void zzl() {
        zze(zzdfh.class, "onAdImpression", new Object[0]);
    }

    public final void zzm() {
        zze(zzden.class, "onAdLeftApplication", new Object[0]);
    }

    public final void zzn() {
        long elapsedRealtime = zzt.zzB().elapsedRealtime();
        long j = this.zzc;
        com.google.android.gms.ads.internal.util.zze.zza("Ad Request Latency : " + (elapsedRealtime - j));
        zze(zzdgb.class, "onAdLoaded", new Object[0]);
    }

    public final void zzo() {
        zze(zzden.class, "onAdOpened", new Object[0]);
    }

    public final void zzp(zzccr zzccr, String str, String str2) {
        zze(zzden.class, "onRewarded", zzccr, str, str2);
    }
}
