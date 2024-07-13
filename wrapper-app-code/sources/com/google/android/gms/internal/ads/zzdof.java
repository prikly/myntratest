package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdof implements zzo, zzdfh, zzdgb {
    IObjectWrapper zza;
    private final Context zzb;
    private final zzcno zzc;
    private final zzfil zzd;
    private final zzchu zze;
    private final zzbfg zzf;

    public zzdof(Context context, zzcno zzcno, zzfil zzfil, zzchu zzchu, zzbfg zzbfg) {
        this.zzb = context;
        this.zzc = zzcno;
        this.zzd = zzfil;
        this.zze = zzchu;
        this.zzf = zzbfg;
    }

    public final void zzb() {
        if (this.zza != null && this.zzc != null) {
            if (!((Boolean) zzba.zzc().zzb(zzbjj.zzeD)).booleanValue()) {
                this.zzc.zzd("onSdkImpression", new ArrayMap());
            }
        }
    }

    public final void zzbE() {
    }

    public final void zzbM() {
    }

    public final void zzbs() {
    }

    public final void zze() {
    }

    public final void zzf(int i) {
        this.zza = null;
    }

    public final void zzl() {
        if (this.zza != null && this.zzc != null) {
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzeD)).booleanValue()) {
                this.zzc.zzd("onSdkImpression", new ArrayMap());
            }
        }
    }

    public final void zzn() {
        zzeko zzeko;
        zzekp zzekp;
        zzekp zzekp2;
        zzbfg zzbfg;
        if ((this.zzf == zzbfg.REWARD_BASED_VIDEO_AD || (zzbfg = this.zzf) == zzbfg.INTERSTITIAL || zzbfg == zzbfg.APP_OPEN) && this.zzd.zzU && this.zzc != null && zzt.zzA().zze(this.zzb)) {
            zzchu zzchu = this.zze;
            String str = zzchu.zzb + "." + zzchu.zzc;
            String zza2 = this.zzd.zzW.zza();
            if (this.zzd.zzW.zzb() == 1) {
                zzeko = zzeko.VIDEO;
                zzekp = zzekp.DEFINED_BY_JAVASCRIPT;
            } else {
                if (this.zzd.zzZ == 2) {
                    zzekp2 = zzekp.UNSPECIFIED;
                } else {
                    zzekp2 = zzekp.BEGIN_TO_RENDER;
                }
                zzekp = zzekp2;
                zzeko = zzeko.HTML_DISPLAY;
            }
            IObjectWrapper zza3 = zzt.zzA().zza(str, this.zzc.zzI(), "", "javascript", zza2, zzekp, zzeko, this.zzd.zzan);
            this.zza = zza3;
            if (zza3 != null) {
                zzt.zzA().zzc(this.zza, (View) this.zzc);
                this.zzc.zzar(this.zza);
                zzt.zzA().zzd(this.zza);
                this.zzc.zzd("onSdkLoaded", new ArrayMap());
            }
        }
    }
}
