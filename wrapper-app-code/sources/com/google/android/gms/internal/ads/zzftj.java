package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzftj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzftj> CREATOR = new zzftk();
    public final int zza;
    private zzanf zzb = null;
    private byte[] zzc;

    zzftj(int i, byte[] bArr) {
        this.zza = i;
        this.zzc = bArr;
        zzb();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        byte[] bArr = this.zzc;
        if (bArr == null) {
            bArr = this.zzb.zzaw();
        }
        SafeParcelWriter.writeByteArray(parcel, 2, bArr, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzanf zza() {
        if (this.zzb == null) {
            try {
                this.zzb = zzanf.zze(this.zzc, zzgxp.zza());
                this.zzc = null;
            } catch (zzgyp | NullPointerException e2) {
                throw new IllegalStateException(e2);
            }
        }
        zzb();
        return this.zzb;
    }

    private final void zzb() {
        zzanf zzanf = this.zzb;
        if (zzanf == null && this.zzc != null) {
            return;
        }
        if (zzanf != null && this.zzc == null) {
            return;
        }
        if (zzanf != null && this.zzc != null) {
            throw new IllegalStateException("Invalid internal representation - full");
        } else if (zzanf == null && this.zzc == null) {
            throw new IllegalStateException("Invalid internal representation - empty");
        } else {
            throw new IllegalStateException("Impossible");
        }
    }
}
