package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzash;
import com.google.android.gms.internal.ads.zzasi;
import com.google.android.gms.internal.ads.zzbmp;
import com.google.android.gms.internal.ads.zzbmv;
import com.google.android.gms.internal.ads.zzbqz;
import com.google.android.gms.internal.ads.zzbra;
import com.google.android.gms.internal.ads.zzbrd;
import com.google.android.gms.internal.ads.zzbvs;
import com.google.android.gms.internal.ads.zzbvt;
import com.google.android.gms.internal.ads.zzbzj;
import com.google.android.gms.internal.ads.zzbzq;
import com.google.android.gms.internal.ads.zzccu;
import com.google.android.gms.internal.ads.zzcdk;
import com.google.android.gms.internal.ads.zzcgf;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public abstract class zzcd extends zzash implements zzce {
    public zzcd() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                String readString = parcel.readString();
                zzbvt zzf = zzbvs.zzf(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                zzasi.zzc(parcel);
                zzbu zzd = zzd(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzq) zzasi.zza(parcel, zzq.CREATOR), readString, zzf, readInt);
                parcel2.writeNoException();
                zzasi.zzg(parcel2, zzd);
                return true;
            case 2:
                String readString2 = parcel.readString();
                zzbvt zzf2 = zzbvs.zzf(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                zzasi.zzc(parcel);
                zzbu zze = zze(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzq) zzasi.zza(parcel, zzq.CREATOR), readString2, zzf2, readInt2);
                parcel2.writeNoException();
                zzasi.zzg(parcel2, zze);
                return true;
            case 3:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString3 = parcel.readString();
                zzbvt zzf3 = zzbvs.zzf(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                zzasi.zzc(parcel);
                zzbq zzb = zzb(asInterface, readString3, zzf3, readInt3);
                parcel2.writeNoException();
                zzasi.zzg(parcel2, zzb);
                return true;
            case 4:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzasi.zzc(parcel);
                parcel2.writeNoException();
                zzasi.zzg(parcel2, (IInterface) null);
                return true;
            case 5:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzasi.zzc(parcel);
                zzbmp zzi = zzi(asInterface2, asInterface3);
                parcel2.writeNoException();
                zzasi.zzg(parcel2, zzi);
                return true;
            case 6:
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbvt zzf4 = zzbvs.zzf(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                zzasi.zzc(parcel);
                zzccu zzn = zzn(asInterface4, zzf4, readInt4);
                parcel2.writeNoException();
                zzasi.zzg(parcel2, zzn);
                return true;
            case 7:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzasi.zzc(parcel);
                parcel2.writeNoException();
                zzasi.zzg(parcel2, (IInterface) null);
                return true;
            case 8:
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzasi.zzc(parcel);
                zzbzq zzm = zzm(asInterface5);
                parcel2.writeNoException();
                zzasi.zzg(parcel2, zzm);
                return true;
            case 9:
                IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                zzasi.zzc(parcel);
                zzco zzg = zzg(asInterface6, readInt5);
                parcel2.writeNoException();
                zzasi.zzg(parcel2, zzg);
                return true;
            case 10:
                String readString4 = parcel.readString();
                int readInt6 = parcel.readInt();
                zzasi.zzc(parcel);
                zzbu zzf5 = zzf(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzq) zzasi.zza(parcel, zzq.CREATOR), readString4, readInt6);
                parcel2.writeNoException();
                zzasi.zzg(parcel2, zzf5);
                return true;
            case 11:
                IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzasi.zzc(parcel);
                zzbmv zzj = zzj(asInterface7, asInterface8, asInterface9);
                parcel2.writeNoException();
                zzasi.zzg(parcel2, zzj);
                return true;
            case 12:
                IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString5 = parcel.readString();
                zzbvt zzf6 = zzbvs.zzf(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                zzasi.zzc(parcel);
                zzcdk zzo = zzo(asInterface10, readString5, zzf6, readInt7);
                parcel2.writeNoException();
                zzasi.zzg(parcel2, zzo);
                return true;
            case 13:
                String readString6 = parcel.readString();
                zzbvt zzf7 = zzbvs.zzf(parcel.readStrongBinder());
                int readInt8 = parcel.readInt();
                zzasi.zzc(parcel);
                zzbu zzc = zzc(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzq) zzasi.zza(parcel, zzq.CREATOR), readString6, zzf7, readInt8);
                parcel2.writeNoException();
                zzasi.zzg(parcel2, zzc);
                return true;
            case 14:
                IObjectWrapper asInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbvt zzf8 = zzbvs.zzf(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                zzasi.zzc(parcel);
                zzcgf zzp = zzp(asInterface11, zzf8, readInt9);
                parcel2.writeNoException();
                zzasi.zzg(parcel2, zzp);
                return true;
            case 15:
                IObjectWrapper asInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbvt zzf9 = zzbvs.zzf(parcel.readStrongBinder());
                int readInt10 = parcel.readInt();
                zzasi.zzc(parcel);
                zzbzj zzl = zzl(asInterface12, zzf9, readInt10);
                parcel2.writeNoException();
                zzasi.zzg(parcel2, zzl);
                return true;
            case 16:
                IObjectWrapper asInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbvt zzf10 = zzbvs.zzf(parcel.readStrongBinder());
                int readInt11 = parcel.readInt();
                zzbra zzc2 = zzbqz.zzc(parcel.readStrongBinder());
                zzasi.zzc(parcel);
                zzbrd zzk = zzk(asInterface13, zzf10, readInt11, zzc2);
                parcel2.writeNoException();
                zzasi.zzg(parcel2, zzk);
                return true;
            case 17:
                IObjectWrapper asInterface14 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbvt zzf11 = zzbvs.zzf(parcel.readStrongBinder());
                int readInt12 = parcel.readInt();
                zzasi.zzc(parcel);
                zzdj zzh = zzh(asInterface14, zzf11, readInt12);
                parcel2.writeNoException();
                zzasi.zzg(parcel2, zzh);
                return true;
            default:
                return false;
        }
    }
}
