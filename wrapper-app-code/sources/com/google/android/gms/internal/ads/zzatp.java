package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzatp {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 3, 6};
    private static final int[] zzc = {48000, 44100, 32000};
    private static final int[] zzd = {2, 1, 2, 3, 3, 4, 4, 5};

    public static int zza(ByteBuffer byteBuffer) {
        int i = 6;
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i = zzb[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4];
        }
        return i * 256;
    }

    public static zzatd zzb(zzbar zzbar, String str, String str2, zzavc zzavc) {
        int i = zzc[(zzbar.zzg() & 192) >> 6];
        int zzg = zzbar.zzg();
        int i2 = zzd[(zzg & 56) >> 3];
        if ((zzg & 4) != 0) {
            i2++;
        }
        return zzatd.zzg(str, "audio/ac3", (String) null, -1, -1, i2, i, (List) null, zzavc, 0, str2);
    }

    public static zzatd zzc(zzbar zzbar, String str, String str2, zzavc zzavc) {
        zzbar zzbar2 = zzbar;
        zzbar.zzw(2);
        int i = zzc[(zzbar.zzg() & 192) >> 6];
        int zzg = zzbar.zzg();
        int i2 = zzd[(zzg & 14) >> 1];
        if ((zzg & 1) != 0) {
            i2++;
        }
        return zzatd.zzg(str, "audio/eac3", (String) null, -1, -1, i2, i, (List) null, zzavc, 0, str2);
    }
}
