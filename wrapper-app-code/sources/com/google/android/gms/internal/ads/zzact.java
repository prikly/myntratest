package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzact extends zzade {
    public static final Parcelable.Creator<zzact> CREATOR = new zzacs();
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;
    private final zzade[] zzg;

    zzact(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i = zzen.zza;
        this.zza = readString;
        this.zzb = parcel.readInt();
        this.zzc = parcel.readInt();
        this.zzd = parcel.readLong();
        this.zze = parcel.readLong();
        int readInt = parcel.readInt();
        this.zzg = new zzade[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.zzg[i2] = (zzade) parcel.readParcelable(zzade.class.getClassLoader());
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzact zzact = (zzact) obj;
            return this.zzb == zzact.zzb && this.zzc == zzact.zzc && this.zzd == zzact.zzd && this.zze == zzact.zze && zzen.zzT(this.zza, zzact.zza) && Arrays.equals(this.zzg, zzact.zzg);
        }
    }

    public final int hashCode() {
        int i = (((((((this.zzb + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + ((int) this.zze)) * 31;
        String str = this.zza;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeLong(this.zze);
        parcel.writeInt(this.zzg.length);
        for (zzade writeParcelable : this.zzg) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public zzact(String str, int i, int i2, long j, long j2, zzade[] zzadeArr) {
        super("CHAP");
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = j;
        this.zze = j2;
        this.zzg = zzadeArr;
    }
}
