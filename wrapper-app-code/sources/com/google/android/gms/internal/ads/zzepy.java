package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public class zzepy extends zzbvy {
    private final zzdel zza;
    private final zzdma zzb;
    private final zzdff zzc;
    private final zzdfu zzd;
    private final zzdfz zze;
    private final zzdjh zzf;
    private final zzdgt zzg;
    private final zzdms zzh;
    private final zzdjd zzi;
    private final zzdfa zzj;

    public zzepy(zzdel zzdel, zzdma zzdma, zzdff zzdff, zzdfu zzdfu, zzdfz zzdfz, zzdjh zzdjh, zzdgt zzdgt, zzdms zzdms, zzdjd zzdjd, zzdfa zzdfa) {
        this.zza = zzdel;
        this.zzb = zzdma;
        this.zzc = zzdff;
        this.zzd = zzdfu;
        this.zze = zzdfz;
        this.zzf = zzdjh;
        this.zzg = zzdgt;
        this.zzh = zzdms;
        this.zzi = zzdjd;
        this.zzj = zzdfa;
    }

    public final void zze() {
        this.zza.onAdClicked();
        this.zzb.zzq();
    }

    public final void zzf() {
        this.zzg.zzf(4);
    }

    public final void zzg(int i) {
    }

    public final void zzh(zze zze2) {
    }

    public final void zzi(int i, String str) {
    }

    @Deprecated
    public final void zzj(int i) throws RemoteException {
        zzk(new zze(i, "", AdError.UNDEFINED_DOMAIN, (zze) null, (IBinder) null));
    }

    public final void zzk(zze zze2) {
        this.zzj.zza(zzfkg.zzc(8, zze2));
    }

    public final void zzl(String str) {
        zzk(new zze(0, str, AdError.UNDEFINED_DOMAIN, (zze) null, (IBinder) null));
    }

    public void zzm() {
        this.zzc.zza();
        this.zzi.zzb();
    }

    public final void zzn() {
        this.zzd.zzb();
    }

    public final void zzo() {
        this.zze.zzn();
    }

    public final void zzp() {
        this.zzg.zzb();
        this.zzi.zza();
    }

    public final void zzq(String str, String str2) {
        this.zzf.zzbF(str, str2);
    }

    public final void zzr(zzbnf zzbnf, String str) {
    }

    public void zzs(zzcdd zzcdd) {
    }

    public void zzt(zzcdh zzcdh) throws RemoteException {
    }

    public void zzu() throws RemoteException {
    }

    public void zzv() {
        this.zzh.zza();
    }

    public final void zzw() {
        this.zzh.zzb();
    }

    public final void zzx() throws RemoteException {
        this.zzh.zzc();
    }

    public void zzy() {
        this.zzh.zzd();
    }
}
