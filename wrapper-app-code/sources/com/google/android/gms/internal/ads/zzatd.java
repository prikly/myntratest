package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.bidmachine.utils.IabUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzatd implements Parcelable {
    public static final Parcelable.Creator<zzatd> CREATOR = new zzatc();
    private int zzA;
    public final String zza;
    public final int zzb;
    public final String zzc;
    public final zzaxo zzd;
    public final String zze;
    public final String zzf;
    public final int zzg;
    public final List zzh;
    public final zzavc zzi;
    public final int zzj;
    public final int zzk;
    public final float zzl;
    public final int zzm;
    public final float zzn;
    public final int zzo;
    public final byte[] zzp;
    public final zzbbb zzq;
    public final int zzr;
    public final int zzs;
    public final int zzt;
    public final int zzu;
    public final int zzv;
    public final long zzw;
    public final int zzx;
    public final String zzy;
    public final int zzz;

    zzatd(Parcel parcel) {
        this.zza = parcel.readString();
        this.zze = parcel.readString();
        this.zzf = parcel.readString();
        this.zzc = parcel.readString();
        this.zzb = parcel.readInt();
        this.zzg = parcel.readInt();
        this.zzj = parcel.readInt();
        this.zzk = parcel.readInt();
        this.zzl = parcel.readFloat();
        this.zzm = parcel.readInt();
        this.zzn = parcel.readFloat();
        this.zzp = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.zzo = parcel.readInt();
        this.zzq = (zzbbb) parcel.readParcelable(zzbbb.class.getClassLoader());
        this.zzr = parcel.readInt();
        this.zzs = parcel.readInt();
        this.zzt = parcel.readInt();
        this.zzu = parcel.readInt();
        this.zzv = parcel.readInt();
        this.zzx = parcel.readInt();
        this.zzy = parcel.readString();
        this.zzz = parcel.readInt();
        this.zzw = parcel.readLong();
        int readInt = parcel.readInt();
        this.zzh = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.zzh.add(parcel.createByteArray());
        }
        this.zzi = (zzavc) parcel.readParcelable(zzavc.class.getClassLoader());
        this.zzd = (zzaxo) parcel.readParcelable(zzaxo.class.getClassLoader());
    }

    public static zzatd zzg(String str, String str2, String str3, int i, int i2, int i3, int i4, List list, zzavc zzavc, int i5, String str4) {
        return zzh(str, str2, (String) null, -1, -1, i3, i4, -1, -1, -1, (List) null, zzavc, 0, str4, (zzaxo) null);
    }

    public static zzatd zzh(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, int i6, int i7, List list, zzavc zzavc, int i8, String str4, zzaxo zzaxo) {
        return new zzatd(str, (String) null, str2, (String) null, -1, i2, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (zzbbb) null, i3, i4, i5, -1, -1, i8, str4, -1, Long.MAX_VALUE, list, zzavc, (zzaxo) null);
    }

    public static zzatd zzi(String str, String str2, String str3, int i, List list, String str4, zzavc zzavc) {
        return new zzatd(str, (String) null, str2, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (zzbbb) null, -1, -1, -1, -1, -1, 0, str4, -1, Long.MAX_VALUE, list, zzavc, (zzaxo) null);
    }

    public static zzatd zzj(String str, String str2, String str3, int i, zzavc zzavc) {
        return new zzatd(str, (String) null, "application/x-camera-motion", (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (zzbbb) null, -1, -1, -1, -1, -1, 0, (String) null, -1, Long.MAX_VALUE, (List) null, zzavc, (zzaxo) null);
    }

    public static zzatd zzk(String str, String str2, String str3, int i, int i2, String str4, int i3, zzavc zzavc, long j, List list) {
        return new zzatd(str, (String) null, str2, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (zzbbb) null, -1, -1, -1, -1, -1, i2, str4, -1, j, list, zzavc, (zzaxo) null);
    }

    public static zzatd zzl(String str, String str2, String str3, int i, int i2, int i3, int i4, float f2, List list, int i5, float f3, byte[] bArr, int i6, zzbbb zzbbb, zzavc zzavc) {
        return new zzatd(str, (String) null, str2, (String) null, -1, i2, i3, i4, -1.0f, i5, f3, bArr, i6, zzbbb, -1, -1, -1, -1, -1, 0, (String) null, -1, Long.MAX_VALUE, list, zzavc, (zzaxo) null);
    }

    private static void zzm(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
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
            zzatd zzatd = (zzatd) obj;
            if (this.zzb == zzatd.zzb && this.zzg == zzatd.zzg && this.zzj == zzatd.zzj && this.zzk == zzatd.zzk && this.zzl == zzatd.zzl && this.zzm == zzatd.zzm && this.zzn == zzatd.zzn && this.zzo == zzatd.zzo && this.zzr == zzatd.zzr && this.zzs == zzatd.zzs && this.zzt == zzatd.zzt && this.zzu == zzatd.zzu && this.zzv == zzatd.zzv && this.zzw == zzatd.zzw && this.zzx == zzatd.zzx && zzbay.zzo(this.zza, zzatd.zza) && zzbay.zzo(this.zzy, zzatd.zzy) && this.zzz == zzatd.zzz && zzbay.zzo(this.zze, zzatd.zze) && zzbay.zzo(this.zzf, zzatd.zzf) && zzbay.zzo(this.zzc, zzatd.zzc) && zzbay.zzo(this.zzi, zzatd.zzi) && zzbay.zzo(this.zzd, zzatd.zzd) && zzbay.zzo(this.zzq, zzatd.zzq) && Arrays.equals(this.zzp, zzatd.zzp) && this.zzh.size() == zzatd.zzh.size()) {
                for (int i = 0; i < this.zzh.size(); i++) {
                    if (!Arrays.equals((byte[]) this.zzh.get(i), (byte[]) zzatd.zzh.get(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zze;
        String str3 = this.zzf;
        int i = this.zzb;
        String str4 = this.zzy;
        int i2 = this.zzj;
        int i3 = this.zzk;
        float f2 = this.zzl;
        int i4 = this.zzr;
        int i5 = this.zzs;
        return "Format(" + str + ", " + str2 + ", " + str3 + ", " + i + ", " + str4 + ", [" + i2 + ", " + i3 + ", " + f2 + "], [" + i4 + ", " + i5 + "])";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zze);
        parcel.writeString(this.zzf);
        parcel.writeString(this.zzc);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzg);
        parcel.writeInt(this.zzj);
        parcel.writeInt(this.zzk);
        parcel.writeFloat(this.zzl);
        parcel.writeInt(this.zzm);
        parcel.writeFloat(this.zzn);
        parcel.writeInt(this.zzp != null ? 1 : 0);
        byte[] bArr = this.zzp;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.zzo);
        parcel.writeParcelable(this.zzq, i);
        parcel.writeInt(this.zzr);
        parcel.writeInt(this.zzs);
        parcel.writeInt(this.zzt);
        parcel.writeInt(this.zzu);
        parcel.writeInt(this.zzv);
        parcel.writeInt(this.zzx);
        parcel.writeString(this.zzy);
        parcel.writeInt(this.zzz);
        parcel.writeLong(this.zzw);
        int size = this.zzh.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray((byte[]) this.zzh.get(i2));
        }
        parcel.writeParcelable(this.zzi, 0);
        parcel.writeParcelable(this.zzd, 0);
    }

    public final int zza() {
        int i;
        int i2 = this.zzj;
        if (i2 == -1 || (i = this.zzk) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final MediaFormat zzb() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.zzf);
        String str = this.zzy;
        if (str != null) {
            mediaFormat.setString("language", str);
        }
        zzm(mediaFormat, "max-input-size", this.zzg);
        zzm(mediaFormat, IabUtils.KEY_WIDTH, this.zzj);
        zzm(mediaFormat, IabUtils.KEY_HEIGHT, this.zzk);
        float f2 = this.zzl;
        if (f2 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f2);
        }
        zzm(mediaFormat, "rotation-degrees", this.zzm);
        zzm(mediaFormat, "channel-count", this.zzr);
        zzm(mediaFormat, "sample-rate", this.zzs);
        zzm(mediaFormat, "encoder-delay", this.zzu);
        zzm(mediaFormat, "encoder-padding", this.zzv);
        for (int i = 0; i < this.zzh.size(); i++) {
            mediaFormat.setByteBuffer("csd-" + i, ByteBuffer.wrap((byte[]) this.zzh.get(i)));
        }
        zzbbb zzbbb = this.zzq;
        if (zzbbb != null) {
            zzm(mediaFormat, "color-transfer", zzbbb.zzc);
            zzm(mediaFormat, "color-standard", zzbbb.zza);
            zzm(mediaFormat, "color-range", zzbbb.zzb);
            byte[] bArr = zzbbb.zzd;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    public final zzatd zzc(zzavc zzavc) {
        String str = this.zza;
        return new zzatd(str, this.zze, this.zzf, this.zzc, this.zzb, this.zzg, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu, this.zzv, this.zzx, this.zzy, this.zzz, this.zzw, this.zzh, zzavc, this.zzd);
    }

    public final zzatd zzd(int i, int i2) {
        String str = this.zza;
        return new zzatd(str, this.zze, this.zzf, this.zzc, this.zzb, this.zzg, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, i, i2, this.zzx, this.zzy, this.zzz, this.zzw, this.zzh, this.zzi, this.zzd);
    }

    public final zzatd zze(int i) {
        String str = this.zza;
        return new zzatd(str, this.zze, this.zzf, this.zzc, this.zzb, i, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu, this.zzv, this.zzx, this.zzy, this.zzz, this.zzw, this.zzh, this.zzi, this.zzd);
    }

    public final zzatd zzf(zzaxo zzaxo) {
        String str = this.zza;
        return new zzatd(str, this.zze, this.zzf, this.zzc, this.zzb, this.zzg, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu, this.zzv, this.zzx, this.zzy, this.zzz, this.zzw, this.zzh, this.zzi, zzaxo);
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.zzA;
        if (i5 != 0) {
            return i5;
        }
        String str = this.zza;
        int i6 = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.zze;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.zzf;
        if (str3 == null) {
            i = 0;
        } else {
            i = str3.hashCode();
        }
        int i7 = (hashCode2 + i) * 31;
        String str4 = this.zzc;
        if (str4 == null) {
            i2 = 0;
        } else {
            i2 = str4.hashCode();
        }
        int i8 = (((((((((((i7 + i2) * 31) + this.zzb) * 31) + this.zzj) * 31) + this.zzk) * 31) + this.zzr) * 31) + this.zzs) * 31;
        String str5 = this.zzy;
        if (str5 == null) {
            i3 = 0;
        } else {
            i3 = str5.hashCode();
        }
        int i9 = (((i8 + i3) * 31) + this.zzz) * 31;
        zzavc zzavc = this.zzi;
        if (zzavc == null) {
            i4 = 0;
        } else {
            i4 = zzavc.hashCode();
        }
        int i10 = (i9 + i4) * 31;
        zzaxo zzaxo = this.zzd;
        if (zzaxo != null) {
            i6 = zzaxo.hashCode();
        }
        int i11 = i10 + i6;
        this.zzA = i11;
        return i11;
    }

    zzatd(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, float f2, int i5, float f3, byte[] bArr, int i6, zzbbb zzbbb, int i7, int i8, int i9, int i10, int i11, int i12, String str5, int i13, long j, List list, zzavc zzavc, zzaxo zzaxo) {
        this.zza = str;
        this.zze = str2;
        this.zzf = str3;
        this.zzc = str4;
        this.zzb = i;
        this.zzg = i2;
        this.zzj = i3;
        this.zzk = i4;
        this.zzl = f2;
        this.zzm = i5;
        this.zzn = f3;
        this.zzp = bArr;
        this.zzo = i6;
        this.zzq = zzbbb;
        this.zzr = i7;
        this.zzs = i8;
        this.zzt = i9;
        this.zzu = i10;
        this.zzv = i11;
        this.zzx = i12;
        this.zzy = str5;
        this.zzz = i13;
        this.zzw = j;
        this.zzh = list == null ? Collections.emptyList() : list;
        this.zzi = zzavc;
        this.zzd = zzaxo;
    }
}
