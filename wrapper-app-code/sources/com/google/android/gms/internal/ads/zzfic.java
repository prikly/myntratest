package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfic extends zzcdj {
    private final zzfhy zza;
    private final zzfho zzb;
    private final String zzc;
    /* access modifiers changed from: private */
    public final zzfiy zzd;
    private final Context zze;
    private final zzchu zzf;
    /* access modifiers changed from: private */
    public zzdvt zzg;
    private boolean zzh = ((Boolean) zzba.zzc().zzb(zzbjj.zzaA)).booleanValue();

    public zzfic(String str, zzfhy zzfhy, Context context, zzfho zzfho, zzfiy zzfiy, zzchu zzchu) {
        this.zzc = str;
        this.zza = zzfhy;
        this.zzb = zzfho;
        this.zzd = zzfiy;
        this.zze = context;
        this.zzf = zzchu;
    }

    private final synchronized void zzu(zzl zzl, zzcdr zzcdr, int i) throws RemoteException {
        boolean z = false;
        if (((Boolean) zzbkx.zzl.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzjn)).booleanValue()) {
                z = true;
            }
        }
        if (this.zzf.zzc < ((Integer) zzba.zzc().zzb(zzbjj.zzjo)).intValue() || !z) {
            Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        }
        this.zzb.zze(zzcdr);
        zzt.zzp();
        if (zzs.zzD(this.zze)) {
            if (zzl.zzs == null) {
                zze.zzg("Failed to load the ad because app ID is missing.");
                this.zzb.zza(zzfkg.zzd(4, (String) null, (com.google.android.gms.ads.internal.client.zze) null));
                return;
            }
        }
        if (this.zzg == null) {
            zzfhq zzfhq = new zzfhq((String) null);
            this.zza.zzj(i);
            this.zza.zzb(zzl, this.zzc, zzfhq, new zzfib(this));
        }
    }

    public final Bundle zzb() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdvt zzdvt = this.zzg;
        return zzdvt != null ? zzdvt.zza() : new Bundle();
    }

    public final zzdn zzc() {
        zzdvt zzdvt;
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzgi)).booleanValue() && (zzdvt = this.zzg) != null) {
            return zzdvt.zzl();
        }
        return null;
    }

    public final zzcdh zzd() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdvt zzdvt = this.zzg;
        if (zzdvt != null) {
            return zzdvt.zzc();
        }
        return null;
    }

    public final synchronized String zze() throws RemoteException {
        zzdvt zzdvt = this.zzg;
        if (zzdvt == null || zzdvt.zzl() == null) {
            return null;
        }
        return zzdvt.zzl().zzg();
    }

    public final synchronized void zzf(zzl zzl, zzcdr zzcdr) throws RemoteException {
        zzu(zzl, zzcdr, 2);
    }

    public final synchronized void zzg(zzl zzl, zzcdr zzcdr) throws RemoteException {
        zzu(zzl, zzcdr, 3);
    }

    public final synchronized void zzh(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzh = z;
    }

    public final void zzi(zzdd zzdd) {
        if (zzdd == null) {
            this.zzb.zzb((zzfrt) null);
        } else {
            this.zzb.zzb(new zzfia(this, zzdd));
        }
    }

    public final void zzj(zzdg zzdg) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        this.zzb.zzc(zzdg);
    }

    public final void zzk(zzcdn zzcdn) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzd(zzcdn);
    }

    public final synchronized void zzl(zzcdy zzcdy) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzfiy zzfiy = this.zzd;
        zzfiy.zza = zzcdy.zza;
        zzfiy.zzb = zzcdy.zzb;
    }

    public final synchronized void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzn(iObjectWrapper, this.zzh);
    }

    public final synchronized void zzn(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzg == null) {
            zze.zzj("Rewarded can not be shown before loaded");
            this.zzb.zzk(zzfkg.zzd(9, (String) null, (com.google.android.gms.ads.internal.client.zze) null));
            return;
        }
        this.zzg.zzh(z, (Activity) ObjectWrapper.unwrap(iObjectWrapper));
    }

    public final boolean zzo() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdvt zzdvt = this.zzg;
        return zzdvt != null && !zzdvt.zzf();
    }

    public final void zzp(zzcds zzcds) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzi(zzcds);
    }
}
