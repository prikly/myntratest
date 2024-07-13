package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdvt extends zzdan {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdoe zze;
    private final zzdlk zzf;
    private final zzdfa zzg;
    private final zzdgh zzh;
    private final zzdbh zzi;
    private final zzcdh zzj;
    private final zzfsk zzk;
    private final zzfiz zzl;
    private boolean zzm = false;

    zzdvt(zzdam zzdam, Context context, zzcno zzcno, zzdoe zzdoe, zzdlk zzdlk, zzdfa zzdfa, zzdgh zzdgh, zzdbh zzdbh, zzfil zzfil, zzfsk zzfsk, zzfiz zzfiz) {
        super(zzdam);
        this.zzc = context;
        this.zze = zzdoe;
        this.zzd = new WeakReference(zzcno);
        this.zzf = zzdlk;
        this.zzg = zzdfa;
        this.zzh = zzdgh;
        this.zzi = zzdbh;
        this.zzk = zzfsk;
        zzcdd zzcdd = zzfil.zzm;
        this.zzj = new zzceb(zzcdd != null ? zzcdd.zza : "", zzcdd != null ? zzcdd.zzb : 1);
        this.zzl = zzfiz;
    }

    public final void finalize() throws Throwable {
        try {
            zzcno zzcno = (zzcno) this.zzd.get();
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzgg)).booleanValue()) {
                if (!this.zzm && zzcno != null) {
                    zzcib.zze.execute(new zzdvs(zzcno));
                }
            } else if (zzcno != null) {
                zzcno.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    public final Bundle zza() {
        return this.zzh.zzb();
    }

    public final zzcdh zzc() {
        return this.zzj;
    }

    public final zzfiz zzd() {
        return this.zzl;
    }

    public final boolean zze() {
        return this.zzi.zzg();
    }

    public final boolean zzf() {
        return this.zzm;
    }

    public final boolean zzg() {
        zzcno zzcno = (zzcno) this.zzd.get();
        return zzcno != null && !zzcno.zzaD();
    }

    public final boolean zzh(boolean z, Activity activity) {
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzay)).booleanValue()) {
            zzt.zzp();
            if (zzs.zzC(this.zzc)) {
                zze.zzj("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzg.zzb();
                if (((Boolean) zzba.zzc().zzb(zzbjj.zzaz)).booleanValue()) {
                    this.zzk.zza(this.zza.zzb.zzb.zzb);
                }
                return false;
            }
        }
        if (this.zzm) {
            zze.zzj("The rewarded ad have been showed.");
            this.zzg.zza(zzfkg.zzd(10, (String) null, (com.google.android.gms.ads.internal.client.zze) null));
            return false;
        }
        this.zzm = true;
        this.zzf.zzb();
        Context context = activity;
        if (activity == null) {
            context = this.zzc;
        }
        try {
            this.zze.zza(z, context, this.zzg);
            this.zzf.zza();
            return true;
        } catch (zzdod e2) {
            this.zzg.zzc(e2);
            return false;
        }
    }
}
