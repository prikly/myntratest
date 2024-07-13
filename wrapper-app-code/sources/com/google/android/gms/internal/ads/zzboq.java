package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzboq {
    /* access modifiers changed from: private */
    public final NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener zza;
    /* access modifiers changed from: private */
    public final NativeCustomTemplateAd.OnCustomClickListener zzb;
    private NativeCustomTemplateAd zzc;

    public zzboq(NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
        this.zza = onCustomTemplateAdLoadedListener;
        this.zzb = onCustomClickListener;
    }

    /* access modifiers changed from: private */
    public final synchronized NativeCustomTemplateAd zzf(zzbnf zzbnf) {
        NativeCustomTemplateAd nativeCustomTemplateAd = this.zzc;
        if (nativeCustomTemplateAd != null) {
            return nativeCustomTemplateAd;
        }
        zzbng zzbng = new zzbng(zzbnf);
        this.zzc = zzbng;
        return zzbng;
    }

    public final zzbnp zzd() {
        if (this.zzb == null) {
            return null;
        }
        return new zzbon(this, (zzbom) null);
    }

    public final zzbns zze() {
        return new zzbop(this, (zzboo) null);
    }
}
