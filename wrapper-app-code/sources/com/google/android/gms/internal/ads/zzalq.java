package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzalq {
    public static double zza(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return ((double) (((((bArr[0] << Ascii.CAN) & Ascii.NUL) | ((bArr[1] << Ascii.DLE) & Ascii.NUL)) | ((bArr[2] << 8) & Ascii.NUL)) | (bArr[3] & 255))) / 1.073741824E9d;
    }

    public static double zzb(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return ((double) (((((bArr[0] << Ascii.CAN) & Ascii.NUL) | ((bArr[1] << Ascii.DLE) & Ascii.NUL)) | ((bArr[2] << 8) & Ascii.NUL)) | (bArr[3] & 255))) / 65536.0d;
    }

    public static int zzc(byte b2) {
        return b2 < 0 ? b2 + Ascii.NUL : b2;
    }

    public static int zzd(ByteBuffer byteBuffer) {
        return (zzc(byteBuffer.get()) << 8) + zzc(byteBuffer.get());
    }

    public static long zze(ByteBuffer byteBuffer) {
        long j = (long) byteBuffer.getInt();
        return j < 0 ? j + 4294967296L : j;
    }

    public static long zzf(ByteBuffer byteBuffer) {
        long zze = zze(byteBuffer) << 32;
        if (zze >= 0) {
            return zze + zze(byteBuffer);
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }
}
