package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public abstract class zzbvy extends zzash implements zzbvz {
    public zzbvy() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static zzbvz zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return queryLocalInterface instanceof zzbvz ? (zzbvz) queryLocalInterface : new zzbvx(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                zze();
                break;
            case 2:
                zzf();
                break;
            case 3:
                int readInt = parcel.readInt();
                zzasi.zzc(parcel);
                zzg(readInt);
                break;
            case 4:
                zzn();
                break;
            case 5:
                zzp();
                break;
            case 6:
                zzo();
                break;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    if (queryLocalInterface instanceof zzbwd) {
                        zzbwd zzbwd = (zzbwd) queryLocalInterface;
                    }
                }
                zzasi.zzc(parcel);
                break;
            case 8:
                zzm();
                break;
            case 9:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                zzasi.zzc(parcel);
                zzq(readString, readString2);
                break;
            case 10:
                zzbne.zzb(parcel.readStrongBinder());
                parcel.readString();
                zzasi.zzc(parcel);
                break;
            case 11:
                zzv();
                break;
            case 12:
                parcel.readString();
                zzasi.zzc(parcel);
                break;
            case 13:
                zzy();
                break;
            case 14:
                zzasi.zzc(parcel);
                zzs((zzcdd) zzasi.zza(parcel, zzcdd.CREATOR));
                break;
            case 15:
                zzw();
                break;
            case 16:
                zzcdh zzb = zzcdg.zzb(parcel.readStrongBinder());
                zzasi.zzc(parcel);
                zzt(zzb);
                break;
            case 17:
                int readInt2 = parcel.readInt();
                zzasi.zzc(parcel);
                zzj(readInt2);
                break;
            case 18:
                zzu();
                break;
            case 19:
                Bundle bundle = (Bundle) zzasi.zza(parcel, Bundle.CREATOR);
                zzasi.zzc(parcel);
                break;
            case 20:
                zzx();
                break;
            case 21:
                String readString3 = parcel.readString();
                zzasi.zzc(parcel);
                zzl(readString3);
                break;
            case 22:
                int readInt3 = parcel.readInt();
                String readString4 = parcel.readString();
                zzasi.zzc(parcel);
                zzi(readInt3, readString4);
                break;
            case 23:
                zzasi.zzc(parcel);
                zzh((zze) zzasi.zza(parcel, zze.CREATOR));
                break;
            case 24:
                zzasi.zzc(parcel);
                zzk((zze) zzasi.zza(parcel, zze.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
