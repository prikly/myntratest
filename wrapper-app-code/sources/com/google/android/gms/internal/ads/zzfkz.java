package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfkz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfkz> CREATOR = new zzfla();
    public final Context zza;
    public final zzfkw zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final String zzf;
    public final int zzg;
    private final zzfkw[] zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    public zzfkz(int i, int i2, int i3, int i4, String str, int i5, int i6) {
        this.zzh = zzfkw.values();
        this.zzl = zzfkx.zza();
        int[] zza2 = zzfky.zza();
        this.zzm = zza2;
        this.zza = null;
        this.zzi = i;
        this.zzb = this.zzh[i];
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = str;
        this.zzj = i5;
        this.zzg = this.zzl[i5];
        this.zzk = i6;
        int i7 = zza2[i6];
    }

    public static zzfkz zza(zzfkw zzfkw, Context context) {
        if (zzfkw == zzfkw.Rewarded) {
            return new zzfkz(context, zzfkw, ((Integer) zzba.zzc().zzb(zzbjj.zzfO)).intValue(), ((Integer) zzba.zzc().zzb(zzbjj.zzfU)).intValue(), ((Integer) zzba.zzc().zzb(zzbjj.zzfW)).intValue(), (String) zzba.zzc().zzb(zzbjj.zzfY), (String) zzba.zzc().zzb(zzbjj.zzfQ), (String) zzba.zzc().zzb(zzbjj.zzfS));
        } else if (zzfkw == zzfkw.Interstitial) {
            return new zzfkz(context, zzfkw, ((Integer) zzba.zzc().zzb(zzbjj.zzfP)).intValue(), ((Integer) zzba.zzc().zzb(zzbjj.zzfV)).intValue(), ((Integer) zzba.zzc().zzb(zzbjj.zzfX)).intValue(), (String) zzba.zzc().zzb(zzbjj.zzfZ), (String) zzba.zzc().zzb(zzbjj.zzfR), (String) zzba.zzc().zzb(zzbjj.zzfT));
        } else if (zzfkw != zzfkw.AppOpen) {
            return null;
        } else {
            return new zzfkz(context, zzfkw, ((Integer) zzba.zzc().zzb(zzbjj.zzgc)).intValue(), ((Integer) zzba.zzc().zzb(zzbjj.zzge)).intValue(), ((Integer) zzba.zzc().zzb(zzbjj.zzgf)).intValue(), (String) zzba.zzc().zzb(zzbjj.zzga), (String) zzba.zzc().zzb(zzbjj.zzgb), (String) zzba.zzc().zzb(zzbjj.zzgd));
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzi);
        SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        SafeParcelWriter.writeInt(parcel, 4, this.zze);
        SafeParcelWriter.writeString(parcel, 5, this.zzf, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zzj);
        SafeParcelWriter.writeInt(parcel, 7, this.zzk);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private zzfkz(Context context, zzfkw zzfkw, int i, int i2, int i3, String str, String str2, String str3) {
        this.zzh = zzfkw.values();
        this.zzl = zzfkx.zza();
        this.zzm = zzfky.zza();
        this.zza = context;
        this.zzi = zzfkw.ordinal();
        this.zzb = zzfkw;
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = str;
        int i4 = 2;
        if ("oldest".equals(str2)) {
            i4 = 1;
        } else if (!"lru".equals(str2) && "lfu".equals(str2)) {
            i4 = 3;
        }
        this.zzg = i4;
        this.zzj = i4 - 1;
        "onAdClosed".equals(str3);
        this.zzk = 0;
    }
}
