package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzeqi implements zzekq {
    private final zzbke zza;
    private final zzgfc zzb;
    private final zzfnj zzc;
    /* access modifiers changed from: private */
    public final zzeqr zzd;

    public zzeqi(zzfnj zzfnj, zzgfc zzgfc, zzbke zzbke, zzeqr zzeqr, byte[] bArr) {
        this.zzc = zzfnj;
        this.zzb = zzgfc;
        this.zza = zzbke;
        this.zzd = zzeqr;
    }

    public final zzgfb zza(zzfix zzfix, zzfil zzfil) {
        zzcig zzcig = new zzcig();
        zzeqn zzeqn = new zzeqn();
        zzeqn.zzd(new zzeqh(this, zzcig, zzfix, zzfil, zzeqn));
        zzfiq zzfiq = zzfil.zzt;
        zzbjz zzbjz = new zzbjz(zzeqn, zzfiq.zzb, zzfiq.zza);
        zzfnj zzfnj = this.zzc;
        return zzfmt.zzd(new zzeqg(this, zzbjz), this.zzb, zzfnd.CUSTOM_RENDER_SYN, zzfnj).zzb(zzfnd.CUSTOM_RENDER_ACK).zzd(zzcig).zza();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.zzt;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzb(com.google.android.gms.internal.ads.zzfix r1, com.google.android.gms.internal.ads.zzfil r2) {
        /*
            r0 = this;
            com.google.android.gms.internal.ads.zzbke r1 = r0.zza
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeqi.zzb(com.google.android.gms.internal.ads.zzfix, com.google.android.gms.internal.ads.zzfil):boolean");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzbjz zzbjz) throws Exception {
        this.zza.zze(zzbjz);
    }
}
