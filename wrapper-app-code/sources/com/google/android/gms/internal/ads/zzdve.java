package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzb;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdve {
    /* access modifiers changed from: private */
    public final zzduy zza = new zzduy((zzdux) null);
    private final zza zzb;
    private final zzcoa zzc;
    private final Context zzd;
    private final zzdzh zze;
    private final zzfnt zzf;
    private final Executor zzg;
    private final zzapj zzh;
    private final zzchu zzi;
    private final zzbqr zzj;
    private final zzekc zzk;
    private final zzfpo zzl;
    private zzgfb zzm;

    zzdve(zzdvb zzdvb) {
        this.zzd = zzdvb.zzc;
        this.zzg = zzdvb.zzg;
        this.zzh = zzdvb.zzh;
        this.zzi = zzdvb.zzi;
        this.zzb = zzdvb.zza;
        this.zzc = zzdvb.zzb;
        this.zzj = new zzbqr();
        this.zzk = zzdvb.zzf;
        this.zzl = zzdvb.zzj;
        this.zze = zzdvb.zzd;
        this.zzf = zzdvb.zze;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzcno zza(zzcno zzcno) {
        zzcno zzcno2 = zzcno;
        zzcno2.zzaf("/result", this.zzj);
        zzcpb zzP = zzcno.zzP();
        zzduy zzduy = this.zza;
        zzb zzb2 = r2;
        zzb zzb3 = new zzb(this.zzd, (zzcep) null, (zzcbh) null);
        zzP.zzM((com.google.android.gms.ads.internal.client.zza) null, zzduy, zzduy, zzduy, zzduy, false, (zzbqf) null, zzb2, (zzbyu) null, (zzcep) null, this.zzk, this.zzl, this.zze, this.zzf, (zzbqv) null, (zzdmc) null, (zzbqu) null, (zzbqo) null);
        return zzcno2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzgfb zzc(String str, JSONObject jSONObject, zzcno zzcno) throws Exception {
        return this.zzj.zzb(zzcno, str, jSONObject);
    }

    public final synchronized zzgfb zzd(String str, JSONObject jSONObject) {
        zzgfb zzgfb = this.zzm;
        if (zzgfb == null) {
            return zzger.zzi((Object) null);
        }
        return zzger.zzn(zzgfb, new zzduq(this, str, jSONObject), this.zzg);
    }

    public final synchronized void zze(zzfil zzfil, zzfio zzfio) {
        zzgfb zzgfb = this.zzm;
        if (zzgfb != null) {
            zzger.zzr(zzgfb, new zzduw(this, zzfil, zzfio), this.zzg);
        }
    }

    public final synchronized void zzf() {
        zzgfb zzgfb = this.zzm;
        if (zzgfb != null) {
            zzger.zzr(zzgfb, new zzdus(this), this.zzg);
            this.zzm = null;
        }
    }

    public final synchronized void zzg(String str, Map map) {
        zzgfb zzgfb = this.zzm;
        if (zzgfb != null) {
            zzger.zzr(zzgfb, new zzduv(this, "sendMessageToNativeJs", map), this.zzg);
        }
    }

    public final synchronized void zzh() {
        Context context = this.zzd;
        zzchu zzchu = this.zzi;
        zzbjb zzbjb = zzbjj.zzdi;
        zzgfb zzm2 = zzger.zzm(zzger.zzl(new zzcnx(context, this.zzh, zzchu, this.zzb, (String) zzba.zzc().zzb(zzbjb)), zzcib.zze), new zzdur(this), this.zzg);
        this.zzm = zzm2;
        zzcie.zza(zzm2, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void zzi(String str, zzbqd zzbqd) {
        zzgfb zzgfb = this.zzm;
        if (zzgfb != null) {
            zzger.zzr(zzgfb, new zzdut(this, str, zzbqd), this.zzg);
        }
    }

    public final void zzj(WeakReference weakReference, String str, zzbqd zzbqd) {
        zzi(str, new zzdvd(this, weakReference, str, zzbqd, (zzdvc) null));
    }

    public final synchronized void zzk(String str, zzbqd zzbqd) {
        zzgfb zzgfb = this.zzm;
        if (zzgfb != null) {
            zzger.zzr(zzgfb, new zzduu(this, str, zzbqd), this.zzg);
        }
    }
}
