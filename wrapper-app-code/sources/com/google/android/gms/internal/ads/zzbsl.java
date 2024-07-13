package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzbsl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbsl> CREATOR = new zzbsm();
    public final int zza;
    public final int zzb;
    public final String zzc;
    public final int zzd;

    public zzbsl(int i, int i2, String str, int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = str;
        this.zzd = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzb);
        SafeParcelWriter.writeString(parcel, 2, this.zzc, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        SafeParcelWriter.writeInt(parcel, 1000, this.zza);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
