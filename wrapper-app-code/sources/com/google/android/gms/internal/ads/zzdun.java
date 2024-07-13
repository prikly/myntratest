package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdun extends zzboh {
    private final String zza;
    private final zzdqb zzb;
    private final zzdqg zzc;

    public zzdun(String str, zzdqb zzdqb, zzdqg zzdqg) {
        this.zza = str;
        this.zzb = zzdqb;
        this.zzc = zzdqg;
    }

    public final void zzA() {
        this.zzb.zzD();
    }

    public final void zzB(Bundle bundle) throws RemoteException {
        this.zzb.zzH(bundle);
    }

    public final void zzC() {
        this.zzb.zzJ();
    }

    public final void zzD(zzcs zzcs) throws RemoteException {
        this.zzb.zzK(zzcs);
    }

    public final void zzE(zzdg zzdg) throws RemoteException {
        this.zzb.zzL(zzdg);
    }

    public final void zzF(zzbof zzbof) throws RemoteException {
        this.zzb.zzM(zzbof);
    }

    public final boolean zzG() {
        return this.zzb.zzR();
    }

    public final boolean zzH() throws RemoteException {
        return !this.zzc.zzF().isEmpty() && this.zzc.zzk() != null;
    }

    public final boolean zzI(Bundle bundle) throws RemoteException {
        return this.zzb.zzU(bundle);
    }

    public final double zze() throws RemoteException {
        return this.zzc.zza();
    }

    public final Bundle zzf() throws RemoteException {
        return this.zzc.zzd();
    }

    public final zzdn zzg() throws RemoteException {
        if (!((Boolean) zzba.zzc().zzb(zzbjj.zzgi)).booleanValue()) {
            return null;
        }
        return this.zzb.zzl();
    }

    public final zzdq zzh() throws RemoteException {
        return this.zzc.zzj();
    }

    public final zzbmd zzi() throws RemoteException {
        return this.zzc.zzl();
    }

    public final zzbmi zzj() throws RemoteException {
        return this.zzb.zzc().zza();
    }

    public final zzbml zzk() throws RemoteException {
        return this.zzc.zzn();
    }

    public final IObjectWrapper zzl() throws RemoteException {
        return this.zzc.zzt();
    }

    public final IObjectWrapper zzm() throws RemoteException {
        return ObjectWrapper.wrap(this.zzb);
    }

    public final String zzn() throws RemoteException {
        return this.zzc.zzv();
    }

    public final String zzo() throws RemoteException {
        return this.zzc.zzw();
    }

    public final String zzp() throws RemoteException {
        return this.zzc.zzx();
    }

    public final String zzq() throws RemoteException {
        return this.zzc.zzz();
    }

    public final String zzr() throws RemoteException {
        return this.zza;
    }

    public final String zzs() throws RemoteException {
        return this.zzc.zzB();
    }

    public final String zzt() throws RemoteException {
        return this.zzc.zzC();
    }

    public final List zzu() throws RemoteException {
        return this.zzc.zzE();
    }

    public final List zzv() throws RemoteException {
        if (zzH()) {
            return this.zzc.zzF();
        }
        return Collections.emptyList();
    }

    public final void zzw() throws RemoteException {
        this.zzb.zzq();
    }

    public final void zzx() throws RemoteException {
        this.zzb.zzaa();
    }

    public final void zzy(zzcw zzcw) throws RemoteException {
        this.zzb.zzy(zzcw);
    }

    public final void zzz(Bundle bundle) throws RemoteException {
        this.zzb.zzC(bundle);
    }
}
