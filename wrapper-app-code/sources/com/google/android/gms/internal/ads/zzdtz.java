package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdtz {
    private final zzfjg zza;
    private final Executor zzb;
    private final zzdwp zzc;
    private final zzdvk zzd;
    private final Context zze;
    private final zzdzh zzf;
    private final zzfnt zzg;
    private final zzfpo zzh;
    private final zzekc zzi;

    public zzdtz(zzfjg zzfjg, Executor executor, zzdwp zzdwp, Context context, zzdzh zzdzh, zzfnt zzfnt, zzfpo zzfpo, zzekc zzekc, zzdvk zzdvk) {
        this.zza = zzfjg;
        this.zzb = executor;
        this.zzc = zzdwp;
        this.zze = context;
        this.zzf = zzdzh;
        this.zzg = zzfnt;
        this.zzh = zzfpo;
        this.zzi = zzekc;
        this.zzd = zzdvk;
    }

    private final void zzh(zzcno zzcno) {
        zzi(zzcno);
        zzcno.zzaf("/video", zzbqc.zzl);
        zzcno.zzaf("/videoMeta", zzbqc.zzm);
        zzcno.zzaf("/precache", new zzcmb());
        zzcno.zzaf("/delayPageLoaded", zzbqc.zzp);
        zzcno.zzaf("/instrument", zzbqc.zzn);
        zzcno.zzaf("/log", zzbqc.zzg);
        zzcno.zzaf("/click", zzbqc.zza((zzdmc) null));
        if (this.zza.zzb != null) {
            zzcno.zzP().zzD(true);
            zzcno.zzaf("/open", new zzbqn((zzb) null, (zzbyn) null, (zzekc) null, (zzdzh) null, (zzfnt) null));
        } else {
            zzcno.zzP().zzD(false);
        }
        if (zzt.zzn().zzu(zzcno.getContext())) {
            zzcno.zzaf("/logScionEvent", new zzbqi(zzcno.getContext()));
        }
    }

    private static final void zzi(zzcno zzcno) {
        zzcno.zzaf("/videoClicked", zzbqc.zzh);
        zzcno.zzP().zzF(true);
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzdk)).booleanValue()) {
            zzcno.zzaf("/getNativeAdViewSignals", zzbqc.zzs);
        }
        zzcno.zzaf("/getNativeClickMeta", zzbqc.zzt);
    }

    public final zzgfb zza(JSONObject jSONObject) {
        return zzger.zzn(zzger.zzn(zzger.zzi((Object) null), new zzdtp(this), this.zzb), new zzdtq(this, jSONObject), this.zzb);
    }

    public final zzgfb zzb(String str, String str2, zzfil zzfil, zzfio zzfio, zzq zzq) {
        return zzger.zzn(zzger.zzi((Object) null), new zzdts(this, zzq, zzfil, zzfio, str, str2), this.zzb);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzgfb zzc(JSONObject jSONObject, zzcno zzcno) throws Exception {
        zzcif zza2 = zzcif.zza(zzcno);
        if (this.zza.zzb != null) {
            zzcno.zzai(zzcpd.zzd());
        } else {
            zzcno.zzai(zzcpd.zze());
        }
        zzcno.zzP().zzA(new zzdto(this, zzcno, zza2));
        zzcno.zzl("google.afma.nativeAds.renderVideo", jSONObject);
        return zza2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzgfb zzd(zzq zzq, zzfil zzfil, zzfio zzfio, String str, String str2, Object obj) throws Exception {
        zzcno zza2 = this.zzc.zza(zzq, zzfil, zzfio);
        zzcif zza3 = zzcif.zza(zza2);
        if (this.zza.zzb != null) {
            zzh(zza2);
            zza2.zzai(zzcpd.zzd());
        } else {
            zzdvh zzb2 = this.zzd.zzb();
            zzdvh zzdvh = zzb2;
            zzcpb zzP = zza2.zzP();
            zzb zzb3 = r3;
            zzb zzb4 = new zzb(this.zze, (zzcep) null, (zzcbh) null);
            zzP.zzM(zzb2, zzdvh, zzb2, zzb2, zzb2, false, (zzbqf) null, zzb3, (zzbyu) null, (zzcep) null, this.zzi, this.zzh, this.zzf, this.zzg, (zzbqv) null, zzb2, (zzbqu) null, (zzbqo) null);
            zzi(zza2);
        }
        zza2.zzP().zzA(new zzdtt(this, zza2, zza3));
        zza2.zzad(str, str2, (String) null);
        return zza3;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzgfb zze(Object obj) throws Exception {
        zzcno zza2 = this.zzc.zza(zzq.zzc(), (zzfil) null, (zzfio) null);
        zzcif zza3 = zzcif.zza(zza2);
        zzh(zza2);
        zza2.zzP().zzG(new zzdtr(zza3));
        zza2.loadUrl((String) zzba.zzc().zzb(zzbjj.zzdj));
        return zza3;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(zzcno zzcno, zzcif zzcif, boolean z) {
        if (!(this.zza.zza == null || zzcno.zzs() == null)) {
            zzcno.zzs().zzs(this.zza.zza);
        }
        zzcif.zzb();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzg(zzcno zzcno, zzcif zzcif, boolean z) {
        if (z) {
            if (!(this.zza.zza == null || zzcno.zzs() == null)) {
                zzcno.zzs().zzs(this.zza.zza);
            }
            zzcif.zzb();
            return;
        }
        zzcif.zze(new zzeom(1, "Html video Web View failed to load."));
    }
}
