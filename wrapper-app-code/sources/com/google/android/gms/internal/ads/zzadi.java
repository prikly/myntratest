package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzadi extends zzade {
    public static final Parcelable.Creator<zzadi> CREATOR = new zzadh();
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int[] zzd;
    public final int[] zze;

    public zzadi(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = iArr;
        this.zze = iArr2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzadi zzadi = (zzadi) obj;
            return this.zza == zzadi.zza && this.zzb == zzadi.zzb && this.zzc == zzadi.zzc && Arrays.equals(this.zzd, zzadi.zzd) && Arrays.equals(this.zze, zzadi.zze);
        }
    }

    public final int hashCode() {
        return ((((((((this.zza + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb) * 31) + this.zzc) * 31) + Arrays.hashCode(this.zzd)) * 31) + Arrays.hashCode(this.zze);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zza);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeIntArray(this.zzd);
        parcel.writeIntArray(this.zze);
    }

    zzadi(Parcel parcel) {
        super("MLLT");
        this.zza = parcel.readInt();
        this.zzb = parcel.readInt();
        this.zzc = parcel.readInt();
        this.zzd = (int[]) zzen.zzH(parcel.createIntArray());
        this.zze = (int[]) zzen.zzH(parcel.createIntArray());
    }
}
