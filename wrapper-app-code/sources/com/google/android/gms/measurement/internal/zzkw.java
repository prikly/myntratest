package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzkw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzkw> CREATOR = new zzkx();
    public final int zza;
    public final String zzb;
    public final long zzc;
    public final Long zzd;
    public final String zze;
    public final String zzf;
    public final Double zzg;

    zzkw(int i, String str, long j, Long l, Float f2, String str2, String str3, Double d2) {
        this.zza = i;
        this.zzb = str;
        this.zzc = j;
        this.zzd = l;
        if (i == 1) {
            this.zzg = f2 != null ? Double.valueOf(f2.doubleValue()) : null;
        } else {
            this.zzg = d2;
        }
        this.zze = str2;
        this.zzf = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        zzkx.zza(this, parcel, i);
    }

    public final Object zza() {
        Long l = this.zzd;
        if (l != null) {
            return l;
        }
        Double d2 = this.zzg;
        if (d2 != null) {
            return d2;
        }
        String str = this.zze;
        if (str != null) {
            return str;
        }
        return null;
    }

    zzkw(zzky zzky) {
        this(zzky.zzc, zzky.zzd, zzky.zze, zzky.zzb);
    }

    zzkw(String str, long j, Object obj, String str2) {
        Preconditions.checkNotEmpty(str);
        this.zza = 2;
        this.zzb = str;
        this.zzc = j;
        this.zzf = str2;
        if (obj == null) {
            this.zzd = null;
            this.zzg = null;
            this.zze = null;
        } else if (obj instanceof Long) {
            this.zzd = (Long) obj;
            this.zzg = null;
            this.zze = null;
        } else if (obj instanceof String) {
            this.zzd = null;
            this.zzg = null;
            this.zze = (String) obj;
        } else if (obj instanceof Double) {
            this.zzd = null;
            this.zzg = (Double) obj;
            this.zze = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
