package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzb;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdwo {
    private final zzdel zza;
    private final zzdma zzb;
    /* access modifiers changed from: private */
    public final zzdfu zzc;
    private final zzdgh zzd;
    private final zzdgt zze;
    private final zzdjh zzf;
    private final Executor zzg;
    private final zzdlw zzh;
    private final zzcws zzi;
    private final zzb zzj;
    private final zzcep zzk;
    private final zzapj zzl;
    /* access modifiers changed from: private */
    public final zzdiy zzm;
    private final zzekc zzn;
    private final zzfpo zzo;
    private final zzdzh zzp;
    private final zzfnt zzq;

    public zzdwo(zzdel zzdel, zzdfu zzdfu, zzdgh zzdgh, zzdgt zzdgt, zzdjh zzdjh, Executor executor, zzdlw zzdlw, zzcws zzcws, zzb zzb2, zzcep zzcep, zzapj zzapj, zzdiy zzdiy, zzekc zzekc, zzfpo zzfpo, zzdzh zzdzh, zzfnt zzfnt, zzdma zzdma) {
        this.zza = zzdel;
        this.zzc = zzdfu;
        this.zzd = zzdgh;
        this.zze = zzdgt;
        this.zzf = zzdjh;
        this.zzg = executor;
        this.zzh = zzdlw;
        this.zzi = zzcws;
        this.zzj = zzb2;
        this.zzk = zzcep;
        this.zzl = zzapj;
        this.zzm = zzdiy;
        this.zzn = zzekc;
        this.zzo = zzfpo;
        this.zzp = zzdzh;
        this.zzq = zzfnt;
        this.zzb = zzdma;
    }

    public static final zzgfb zzj(zzcno zzcno, String str, String str2) {
        zzcig zzcig = new zzcig();
        zzcno.zzP().zzA(new zzdwm(zzcig));
        zzcno.zzad(str, str2, (String) null);
        return zzcig;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc() {
        this.zza.onAdClicked();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(String str, String str2) {
        this.zzf.zzbF(str, str2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zze() {
        this.zzc.zzb();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(View view) {
        this.zzj.zza();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzg(zzcno zzcno, zzcno zzcno2, Map map) {
        this.zzi.zzh(zzcno);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ boolean zzh(View view, MotionEvent motionEvent) {
        this.zzj.zza();
        if (view == null) {
            return false;
        }
        view.performClick();
        return false;
    }

    public final void zzi(zzcno zzcno, boolean z, zzbqf zzbqf) {
        zzapf zzc2;
        zzcno zzcno2 = zzcno;
        zzcpb zzP = zzcno.zzP();
        zzdwf zzdwf = r4;
        zzdwf zzdwf2 = new zzdwf(this);
        zzdgh zzdgh = this.zzd;
        zzdgt zzdgt = this.zze;
        zzdwg zzdwg = r7;
        zzdwg zzdwg2 = new zzdwg(this);
        zzdwh zzdwh = r10;
        zzdwh zzdwh2 = new zzdwh(this);
        zzb zzb2 = this.zzj;
        zzdwn zzdwn = r12;
        zzdwn zzdwn2 = new zzdwn(this);
        zzP.zzM(zzdwf, zzdgh, zzdgt, zzdwg, zzdwh, z, zzbqf, zzb2, zzdwn, this.zzk, this.zzn, this.zzo, this.zzp, this.zzq, (zzbqv) null, this.zzb, (zzbqu) null, (zzbqo) null);
        zzcno zzcno3 = zzcno;
        zzcno3.setOnTouchListener(new zzdwi(this));
        zzcno3.setOnClickListener(new zzdwj(this));
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzcj)).booleanValue() && (zzc2 = this.zzl.zzc()) != null) {
            zzc2.zzn((View) zzcno3);
        }
        this.zzh.zzj(zzcno3, this.zzg);
        this.zzh.zzj(new zzdwk(zzcno3), this.zzg);
        this.zzh.zza((View) zzcno3);
        zzcno3.zzaf("/trackActiveViewUnit", new zzdwl(this, zzcno3));
        this.zzi.zzi(zzcno3);
    }
}
