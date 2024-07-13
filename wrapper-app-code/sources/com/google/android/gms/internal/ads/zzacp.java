package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzacp extends zzade {
    public static final Parcelable.Creator<zzacp> CREATOR = new zzaco();
    public final String zza;
    public final String zzb;
    public final int zzc;
    public final byte[] zzd;

    zzacp(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i = zzen.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readInt();
        this.zzd = (byte[]) zzen.zzH(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzacp zzacp = (zzacp) obj;
            return this.zzc == zzacp.zzc && zzen.zzT(this.zza, zzacp.zza) && zzen.zzT(this.zzb, zzacp.zzb) && Arrays.equals(this.zzd, zzacp.zzd);
        }
    }

    public final int hashCode() {
        int i = (this.zzc + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.zza;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.zzb;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode + i2) * 31) + Arrays.hashCode(this.zzd);
    }

    public final String toString() {
        String str = this.zzf;
        String str2 = this.zza;
        String str3 = this.zzb;
        return str + ": mimeType=" + str2 + ", description=" + str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    public final void zza(zzbk zzbk) {
        zzbk.zza(this.zzd, this.zzc);
    }

    public zzacp(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = bArr;
    }
}
