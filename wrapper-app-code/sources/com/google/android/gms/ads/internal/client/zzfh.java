package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzfh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfh> CREATOR = new zzfi();
    public final String zza;

    public zzfh(SearchAdRequest searchAdRequest) {
        this.zza = searchAdRequest.getQuery();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 15, this.zza, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    zzfh(String str) {
        this.zza = str;
    }
}
