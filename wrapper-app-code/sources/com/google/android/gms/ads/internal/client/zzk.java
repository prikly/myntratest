package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzbvt;
import com.google.android.gms.internal.ads.zzcat;
import com.google.android.gms.internal.ads.zzcav;
import com.google.android.gms.internal.ads.zzcho;
import com.google.android.gms.internal.ads.zzchr;
import com.google.android.gms.internal.ads.zzchs;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzk extends RemoteCreator {
    private zzcav zza;

    public zzk() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return queryLocalInterface instanceof zzbv ? (zzbv) queryLocalInterface : new zzbv(iBinder);
    }

    public final zzbu zza(Context context, zzq zzq, String str, zzbvt zzbvt, int i) {
        zzbjj.zzc(context);
        if (((Boolean) zzba.zzc().zzb(zzbjj.zziS)).booleanValue()) {
            try {
                IBinder zze = ((zzbv) zzchs.zzb(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", zzj.zza)).zze(ObjectWrapper.wrap(context), zzq, str, zzbvt, 224400000, i);
                if (zze == null) {
                    return null;
                }
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbs(zze);
            } catch (RemoteException | zzchr | NullPointerException e2) {
                zzcav zza2 = zzcat.zza(context);
                this.zza = zza2;
                zza2.zzf(e2, "AdManagerCreator.newAdManagerByDynamiteLoader");
                zzcho.zzl("#007 Could not call remote method.", e2);
                return null;
            }
        } else {
            try {
                IBinder zze2 = ((zzbv) getRemoteCreatorInstance(context)).zze(ObjectWrapper.wrap(context), zzq, str, zzbvt, 224400000, i);
                if (zze2 == null) {
                    return null;
                }
                IInterface queryLocalInterface2 = zze2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return queryLocalInterface2 instanceof zzbu ? (zzbu) queryLocalInterface2 : new zzbs(zze2);
            } catch (RemoteException | RemoteCreator.RemoteCreatorException e3) {
                zzcho.zzf("Could not create remote AdManager.", e3);
                return null;
            }
        }
    }
}
