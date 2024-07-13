package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzadk extends zzade {
    public static final Parcelable.Creator<zzadk> CREATOR = new zzadj();
    public final String zza;
    public final byte[] zzb;

    zzadk(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i = zzen.zza;
        this.zza = readString;
        this.zzb = (byte[]) zzen.zzH(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzadk zzadk = (zzadk) obj;
            return zzen.zzT(this.zza, zzadk.zza) && Arrays.equals(this.zzb, zzadk.zzb);
        }
    }

    public final int hashCode() {
        String str = this.zza;
        return (((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Arrays.hashCode(this.zzb);
    }

    public final String toString() {
        String str = this.zzf;
        String str2 = this.zza;
        return str + ": owner=" + str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeByteArray(this.zzb);
    }

    public zzadk(String str, byte[] bArr) {
        super("PRIV");
        this.zza = str;
        this.zzb = bArr;
    }
}
