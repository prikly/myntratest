package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzcxt extends zzdan {
    private final View zzc;
    private final zzcno zzd;
    private final zzfim zze;
    private final int zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final zzcxl zzi;
    private zzbdu zzj;

    zzcxt(zzdam zzdam, View view, zzcno zzcno, zzfim zzfim, int i, boolean z, boolean z2, zzcxl zzcxl) {
        super(zzdam);
        this.zzc = view;
        this.zzd = zzcno;
        this.zze = zzfim;
        this.zzf = i;
        this.zzg = z;
        this.zzh = z2;
        this.zzi = zzcxl;
    }

    public final int zza() {
        return this.zzf;
    }

    public final View zzb() {
        return this.zzc;
    }

    public final zzfim zzc() {
        return zzfjk.zzb(this.zzb.zzs, this.zze);
    }

    public final void zzd(zzbdk zzbdk) {
        this.zzd.zzaj(zzbdk);
    }

    public final boolean zze() {
        return this.zzg;
    }

    public final boolean zzf() {
        return this.zzh;
    }

    public final boolean zzg() {
        return this.zzd.zzay();
    }

    public final boolean zzh() {
        return this.zzd.zzP() != null && this.zzd.zzP().zzK();
    }

    public final void zzi(long j, int i) {
        this.zzi.zza(j, i);
    }

    public final zzbdu zzj() {
        return this.zzj;
    }

    public final void zzk(zzbdu zzbdu) {
        this.zzj = zzbdu;
    }
}
