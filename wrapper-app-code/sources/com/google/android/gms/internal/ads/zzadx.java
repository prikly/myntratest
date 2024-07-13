package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzadx implements zzbp {
    public static final Parcelable.Creator<zzadx> CREATOR = new zzadv();
    public final float zza;
    public final int zzb;

    public zzadx(float f2, int i) {
        this.zza = f2;
        this.zzb = i;
    }

    /* synthetic */ zzadx(Parcel parcel, zzadw zzadw) {
        this.zza = parcel.readFloat();
        this.zzb = parcel.readInt();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzadx zzadx = (zzadx) obj;
            return this.zza == zzadx.zza && this.zzb == zzadx.zzb;
        }
    }

    public final int hashCode() {
        return ((Float.valueOf(this.zza).hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb;
    }

    public final String toString() {
        float f2 = this.zza;
        int i = this.zzb;
        return "smta: captureFrameRate=" + f2 + ", svcTemporalLayerCount=" + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.zza);
        parcel.writeInt(this.zzb);
    }

    public final /* synthetic */ void zza(zzbk zzbk) {
    }
}
