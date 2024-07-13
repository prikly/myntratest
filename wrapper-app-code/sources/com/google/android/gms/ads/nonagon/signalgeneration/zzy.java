package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzcho;
import com.google.android.gms.internal.ads.zzfow;
import com.google.android.gms.internal.ads.zzgen;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzy implements zzgen {
    final /* synthetic */ zzcaf zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzac zzc;

    zzy(zzac zzac, zzcaf zzcaf, boolean z) {
        this.zzc = zzac;
        this.zza = zzcaf;
        this.zzb = z;
    }

    public final void zza(Throwable th) {
        try {
            zzcaf zzcaf = this.zza;
            String message = th.getMessage();
            zzcaf.zze("Internal error: " + message);
        } catch (RemoteException e2) {
            zzcho.zzh("", e2);
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        try {
            this.zza.zzf(arrayList);
            if (this.zzc.zzt || this.zzb) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Uri uri = (Uri) it.next();
                    if (this.zzc.zzP(uri)) {
                        zzac zzac = this.zzc;
                        this.zzc.zzs.zzc(zzac.zzX(uri, zzac.zzC, "1").toString(), (zzfow) null);
                    } else {
                        if (((Boolean) zzba.zzc().zzb(zzbjj.zzgS)).booleanValue()) {
                            this.zzc.zzs.zzc(uri.toString(), (zzfow) null);
                        }
                    }
                }
            }
        } catch (RemoteException e2) {
            zzcho.zzh("", e2);
        }
    }
}
