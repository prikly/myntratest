package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzau extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzau> CREATOR = new zzav();
    /* access modifiers changed from: private */
    public final Bundle zza;

    zzau(Bundle bundle) {
        this.zza = bundle;
    }

    public final Iterator iterator() {
        return new zzat(this);
    }

    public final String toString() {
        return this.zza.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, zzc(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.zza.size();
    }

    public final Bundle zzc() {
        return new Bundle(this.zza);
    }

    /* access modifiers changed from: package-private */
    public final Double zzd(String str) {
        return Double.valueOf(this.zza.getDouble(AppMeasurementSdk.ConditionalUserProperty.VALUE));
    }

    /* access modifiers changed from: package-private */
    public final Long zze(String str) {
        return Long.valueOf(this.zza.getLong(AppMeasurementSdk.ConditionalUserProperty.VALUE));
    }

    /* access modifiers changed from: package-private */
    public final Object zzf(String str) {
        return this.zza.get(str);
    }

    /* access modifiers changed from: package-private */
    public final String zzg(String str) {
        return this.zza.getString(str);
    }
}
