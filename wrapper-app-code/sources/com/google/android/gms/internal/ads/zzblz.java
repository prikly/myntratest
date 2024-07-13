package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzblz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzblz> CREATOR = new zzbma();
    public final int zza;
    public final boolean zzb;
    public final int zzc;
    public final boolean zzd;
    public final int zze;
    public final zzfl zzf;
    public final boolean zzg;
    public final int zzh;
    public final int zzi;
    public final boolean zzj;

    public zzblz(int i, boolean z, int i2, boolean z2, int i3, zzfl zzfl, boolean z3, int i4, int i5, boolean z4) {
        this.zza = i;
        this.zzb = z;
        this.zzc = i2;
        this.zzd = z2;
        this.zze = i3;
        this.zzf = zzfl;
        this.zzg = z3;
        this.zzh = i4;
        this.zzj = z4;
        this.zzi = i5;
    }

    public static NativeAdOptions zza(zzblz zzblz) {
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        if (zzblz == null) {
            return builder.build();
        }
        int i = zzblz.zza;
        if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    builder.setRequestCustomMuteThisAd(zzblz.zzg);
                    builder.setMediaAspectRatio(zzblz.zzh);
                    builder.enableCustomClickGestureDirection(zzblz.zzi, zzblz.zzj);
                }
                builder.setReturnUrlsForImageAssets(zzblz.zzb);
                builder.setRequestMultipleImages(zzblz.zzd);
                return builder.build();
            }
            zzfl zzfl = zzblz.zzf;
            if (zzfl != null) {
                builder.setVideoOptions(new VideoOptions(zzfl));
            }
        }
        builder.setAdChoicesPlacement(zzblz.zze);
        builder.setReturnUrlsForImageAssets(zzblz.zzb);
        builder.setRequestMultipleImages(zzblz.zzd);
        return builder.build();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzg);
        SafeParcelWriter.writeInt(parcel, 8, this.zzh);
        SafeParcelWriter.writeInt(parcel, 9, this.zzi);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzj);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @Deprecated
    public zzblz(com.google.android.gms.ads.formats.NativeAdOptions nativeAdOptions) {
        this(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), nativeAdOptions.getImageOrientation(), nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new zzfl(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zza(), nativeAdOptions.getMediaAspectRatio(), 0, false);
    }
}
