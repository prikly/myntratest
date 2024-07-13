package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzdst implements Callable {
    public final /* synthetic */ zzdsu zza;
    public final /* synthetic */ zzgfb zzb;
    public final /* synthetic */ zzgfb zzc;
    public final /* synthetic */ zzgfb zzd;
    public final /* synthetic */ zzgfb zze;
    public final /* synthetic */ zzgfb zzf;
    public final /* synthetic */ JSONObject zzg;
    public final /* synthetic */ zzgfb zzh;
    public final /* synthetic */ zzgfb zzi;
    public final /* synthetic */ zzgfb zzj;
    public final /* synthetic */ zzgfb zzk;

    public /* synthetic */ zzdst(zzdsu zzdsu, zzgfb zzgfb, zzgfb zzgfb2, zzgfb zzgfb3, zzgfb zzgfb4, zzgfb zzgfb5, JSONObject jSONObject, zzgfb zzgfb6, zzgfb zzgfb7, zzgfb zzgfb8, zzgfb zzgfb9) {
        this.zza = zzdsu;
        this.zzb = zzgfb;
        this.zzc = zzgfb2;
        this.zzd = zzgfb3;
        this.zze = zzgfb4;
        this.zzf = zzgfb5;
        this.zzg = jSONObject;
        this.zzh = zzgfb6;
        this.zzi = zzgfb7;
        this.zzj = zzgfb8;
        this.zzk = zzgfb9;
    }

    public final Object call() {
        zzgfb zzgfb = this.zzb;
        zzgfb zzgfb2 = this.zzc;
        zzgfb zzgfb3 = this.zzd;
        zzgfb zzgfb4 = this.zze;
        zzgfb zzgfb5 = this.zzf;
        JSONObject jSONObject = this.zzg;
        zzgfb zzgfb6 = this.zzh;
        zzgfb zzgfb7 = this.zzi;
        zzgfb zzgfb8 = this.zzj;
        zzgfb zzgfb9 = this.zzk;
        zzdqg zzdqg = (zzdqg) zzgfb.get();
        zzdqg.zzN((List) zzgfb2.get());
        zzdqg.zzK((zzbml) zzgfb3.get());
        zzdqg.zzO((zzbml) zzgfb4.get());
        zzdqg.zzH((zzbmd) zzgfb5.get());
        zzdqg.zzQ(zzdth.zzj(jSONObject));
        zzdqg.zzJ(zzdth.zzi(jSONObject));
        zzcno zzcno = (zzcno) zzgfb6.get();
        if (zzcno != null) {
            zzdqg.zzY(zzcno);
            zzdqg.zzX(zzcno.zzH());
            zzdqg.zzW(zzcno.zzs());
        }
        zzcno zzcno2 = (zzcno) zzgfb7.get();
        if (zzcno2 != null) {
            zzdqg.zzM(zzcno2);
            zzdqg.zzZ(zzcno2.zzH());
        }
        zzcno zzcno3 = (zzcno) zzgfb8.get();
        if (zzcno3 != null) {
            zzdqg.zzR(zzcno3);
        }
        for (zzdtl zzdtl : (List) zzgfb9.get()) {
            if (zzdtl.zza != 1) {
                zzdqg.zzL(zzdtl.zzb, zzdtl.zzd);
            } else {
                zzdqg.zzU(zzdtl.zzb, zzdtl.zzc);
            }
        }
        return zzdqg;
    }
}
