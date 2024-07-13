package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzbzd {
    /* access modifiers changed from: private */
    public final NativeCustomFormatAd.OnCustomFormatAdLoadedListener zza;
    /* access modifiers changed from: private */
    public final NativeCustomFormatAd.OnCustomClickListener zzb;
    private NativeCustomFormatAd zzc;

    public zzbzd(NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
        this.zza = onCustomFormatAdLoadedListener;
        this.zzb = onCustomClickListener;
    }

    /* access modifiers changed from: private */
    public final synchronized NativeCustomFormatAd zzf(zzbnf zzbnf) {
        NativeCustomFormatAd nativeCustomFormatAd = this.zzc;
        if (nativeCustomFormatAd != null) {
            return nativeCustomFormatAd;
        }
        zzbze zzbze = new zzbze(zzbnf);
        this.zzc = zzbze;
        return zzbze;
    }

    public final zzbnp zza() {
        if (this.zzb == null) {
            return null;
        }
        return new zzbza(this, (zzbyz) null);
    }

    public final zzbns zzb() {
        return new zzbzc(this, (zzbzb) null);
    }
}
