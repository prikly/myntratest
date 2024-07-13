package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbsg;
import com.google.android.gms.internal.ads.zzbvt;
import com.google.android.gms.internal.ads.zzchh;
import com.google.android.gms.internal.ads.zzcho;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzey extends zzcn {
    private zzbsg zza;

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb() {
        zzbsg zzbsg = this.zza;
        if (zzbsg != null) {
            try {
                zzbsg.zzb(Collections.emptyList());
            } catch (RemoteException e2) {
                zzcho.zzk("Could not notify onComplete event.", e2);
            }
        }
    }

    public final float zze() throws RemoteException {
        return 1.0f;
    }

    public final String zzf() {
        return "";
    }

    public final List zzg() throws RemoteException {
        return Collections.emptyList();
    }

    public final void zzh(String str) throws RemoteException {
    }

    public final void zzi() {
    }

    public final void zzj(boolean z) throws RemoteException {
    }

    public final void zzk() throws RemoteException {
        zzcho.zzg("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        zzchh.zza.post(new zzex(this));
    }

    public final void zzl(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    public final void zzm(zzda zzda) {
    }

    public final void zzn(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
    }

    public final void zzo(zzbvt zzbvt) throws RemoteException {
    }

    public final void zzp(boolean z) throws RemoteException {
    }

    public final void zzq(float f2) throws RemoteException {
    }

    public final void zzr(String str) throws RemoteException {
    }

    public final void zzs(zzbsg zzbsg) throws RemoteException {
        this.zza = zzbsg;
    }

    public final void zzt(String str) {
    }

    public final void zzu(zzff zzff) throws RemoteException {
    }

    public final boolean zzv() throws RemoteException {
        return false;
    }
}
