package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zzbt;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzerc extends zzbt {
    private final Context zza;
    private final zzbh zzb;
    private final zzfjg zzc;
    private final zzcyl zzd;
    private final ViewGroup zze;

    public zzerc(Context context, zzbh zzbh, zzfjg zzfjg, zzcyl zzcyl) {
        this.zza = context;
        this.zzb = zzbh;
        this.zzc = zzfjg;
        this.zzd = zzcyl;
        FrameLayout frameLayout = new FrameLayout(this.zza);
        frameLayout.removeAllViews();
        View zzc2 = this.zzd.zzc();
        zzt.zzp();
        frameLayout.addView(zzc2, zzs.zzn());
        frameLayout.setMinimumHeight(zzg().zzc);
        frameLayout.setMinimumWidth(zzg().zzf);
        this.zze = frameLayout;
    }

    public final void zzA() throws RemoteException {
        this.zzd.zzg();
    }

    public final void zzB() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzm().zzc((Context) null);
    }

    public final void zzC(zzbe zzbe) throws RemoteException {
        zze.zzi("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzD(zzbh zzbh) throws RemoteException {
        zze.zzi("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzE(zzby zzby) throws RemoteException {
        zze.zzi("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzF(zzq zzq) throws RemoteException {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        zzcyl zzcyl = this.zzd;
        if (zzcyl != null) {
            zzcyl.zzh(this.zze, zzq);
        }
    }

    public final void zzG(zzcb zzcb) throws RemoteException {
        zzesb zzesb = this.zzc.zzc;
        if (zzesb != null) {
            zzesb.zzi(zzcb);
        }
    }

    public final void zzH(zzbdt zzbdt) throws RemoteException {
    }

    public final void zzI(zzw zzw) throws RemoteException {
    }

    public final void zzJ(zzci zzci) {
    }

    public final void zzK(zzdu zzdu) throws RemoteException {
    }

    public final void zzL(boolean z) throws RemoteException {
    }

    public final void zzM(zzbzz zzbzz) throws RemoteException {
    }

    public final void zzN(boolean z) throws RemoteException {
        zze.zzi("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzO(zzbke zzbke) throws RemoteException {
        zze.zzi("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzP(zzdg zzdg) {
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzjA)).booleanValue()) {
            zzesb zzesb = this.zzc.zzc;
            if (zzesb != null) {
                zzesb.zzh(zzdg);
                return;
            }
            return;
        }
        zze.zzi("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzQ(zzcac zzcac, String str) throws RemoteException {
    }

    public final void zzR(String str) throws RemoteException {
    }

    public final void zzS(zzccx zzccx) throws RemoteException {
    }

    public final void zzT(String str) throws RemoteException {
    }

    public final void zzU(zzfl zzfl) throws RemoteException {
        zze.zzi("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzW(IObjectWrapper iObjectWrapper) {
    }

    public final void zzX() throws RemoteException {
    }

    public final boolean zzY() throws RemoteException {
        return false;
    }

    public final boolean zzZ() throws RemoteException {
        return false;
    }

    public final boolean zzaa(zzl zzl) throws RemoteException {
        zze.zzi("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    public final void zzab(zzcf zzcf) throws RemoteException {
        zze.zzi("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final Bundle zzd() throws RemoteException {
        zze.zzi("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    public final zzq zzg() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        return zzfjk.zza(this.zza, Collections.singletonList(this.zzd.zze()));
    }

    public final zzbh zzi() throws RemoteException {
        return this.zzb;
    }

    public final zzcb zzj() throws RemoteException {
        return this.zzc.zzn;
    }

    public final zzdn zzk() {
        return this.zzd.zzl();
    }

    public final zzdq zzl() throws RemoteException {
        return this.zzd.zzd();
    }

    public final IObjectWrapper zzn() throws RemoteException {
        return ObjectWrapper.wrap(this.zze);
    }

    public final String zzr() throws RemoteException {
        return this.zzc.zzf;
    }

    public final String zzs() throws RemoteException {
        if (this.zzd.zzl() != null) {
            return this.zzd.zzl().zzg();
        }
        return null;
    }

    public final String zzt() throws RemoteException {
        if (this.zzd.zzl() != null) {
            return this.zzd.zzl().zzg();
        }
        return null;
    }

    public final void zzx() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzaa();
    }

    public final void zzy(zzl zzl, zzbk zzbk) {
    }

    public final void zzz() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzm().zzb((Context) null);
    }
}
