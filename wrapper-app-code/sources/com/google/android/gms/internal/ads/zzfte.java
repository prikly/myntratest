package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfte extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfte> CREATOR = new zzftf();
    public final int zza;
    public final byte[] zzb;

    zzfte(int i, byte[] bArr) {
        this.zza = i;
        this.zzb = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeByteArray(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzfte(byte[] bArr) {
        this(1, bArr);
    }
}
