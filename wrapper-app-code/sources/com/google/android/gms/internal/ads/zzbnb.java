package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public abstract class zzbnb extends zzash implements zzbnc {
    public zzbnb() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                IObjectWrapper zzg = zzg();
                parcel2.writeNoException();
                zzasi.zzg(parcel2, zzg);
                return true;
            case 3:
                String zzk = zzk();
                parcel2.writeNoException();
                parcel2.writeString(zzk);
                return true;
            case 4:
                List zzm = zzm();
                parcel2.writeNoException();
                parcel2.writeList(zzm);
                return true;
            case 5:
                String zzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(zzi);
                return true;
            case 6:
                zzbml zze = zze();
                parcel2.writeNoException();
                zzasi.zzg(parcel2, zze);
                return true;
            case 7:
                String zzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(zzj);
                return true;
            case 8:
                String zzh = zzh();
                parcel2.writeNoException();
                parcel2.writeString(zzh);
                return true;
            case 9:
                Bundle zzb = zzb();
                parcel2.writeNoException();
                zzasi.zzf(parcel2, zzb);
                return true;
            case 10:
                zzn();
                parcel2.writeNoException();
                return true;
            case 11:
                zzdq zzc = zzc();
                parcel2.writeNoException();
                zzasi.zzg(parcel2, zzc);
                return true;
            case 12:
                zzasi.zzc(parcel);
                zzo((Bundle) zzasi.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                zzasi.zzc(parcel);
                boolean zzq = zzq((Bundle) zzasi.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                zzasi.zzd(parcel2, zzq);
                return true;
            case 14:
                zzasi.zzc(parcel);
                zzp((Bundle) zzasi.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                zzbmd zzd = zzd();
                parcel2.writeNoException();
                zzasi.zzg(parcel2, zzd);
                return true;
            case 16:
                IObjectWrapper zzf = zzf();
                parcel2.writeNoException();
                zzasi.zzg(parcel2, zzf);
                return true;
            case 17:
                String zzl = zzl();
                parcel2.writeNoException();
                parcel2.writeString(zzl);
                return true;
            default:
                return false;
        }
    }
}
