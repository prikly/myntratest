package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzeqd implements zzekq {
    private final Context zza;
    private final zzczi zzb;
    private final zzbke zzc;
    private final zzgfc zzd;
    private final zzfnj zze;

    public zzeqd(Context context, zzczi zzczi, zzfnj zzfnj, zzgfc zzgfc, zzbke zzbke) {
        this.zza = context;
        this.zzb = zzczi;
        this.zze = zzfnj;
        this.zzd = zzgfc;
        this.zzc = zzbke;
    }

    public final zzgfb zza(zzfix zzfix, zzfil zzfil) {
        zzcym zza2 = this.zzb.zza(new zzdbc(zzfix, zzfil, (String) null), new zzeqb(this, new View(this.zza), (zzcno) null, zzepz.zza, (zzfim) zzfil.zzv.get(0)));
        zzeqc zzk = zza2.zzk();
        zzfiq zzfiq = zzfil.zzt;
        zzbjz zzbjz = new zzbjz(zzk, zzfiq.zzb, zzfiq.zza);
        zzfnj zzfnj = this.zze;
        return zzfmt.zzd(new zzeqa(this, zzbjz), this.zzd, zzfnd.CUSTOM_RENDER_SYN, zzfnj).zzb(zzfnd.CUSTOM_RENDER_ACK).zzd(zzger.zzi(zza2.zza())).zza();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.zzt;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzb(com.google.android.gms.internal.ads.zzfix r1, com.google.android.gms.internal.ads.zzfil r2) {
        /*
            r0 = this;
            com.google.android.gms.internal.ads.zzbke r1 = r0.zzc
            if (r1 == 0) goto L_0x000e
            com.google.android.gms.internal.ads.zzfiq r1 = r2.zzt
            if (r1 == 0) goto L_0x000e
            java.lang.String r1 = r1.zza
            if (r1 == 0) goto L_0x000e
            r1 = 1
            return r1
        L_0x000e:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeqd.zzb(com.google.android.gms.internal.ads.zzfix, com.google.android.gms.internal.ads.zzfil):boolean");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzbjz zzbjz) throws Exception {
        this.zzc.zze(zzbjz);
    }
}
