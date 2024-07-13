package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzazv {
    public final Uri zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;

    public zzazv(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        boolean z = false;
        zzbaj.zzc(j >= 0);
        zzbaj.zzc(j2 >= 0);
        if (j3 <= 0) {
            j3 = j3 == -1 ? -1 : j3;
            zzbaj.zzc(z);
            this.zza = uri;
            this.zzb = j;
            this.zzc = j2;
            this.zzd = j3;
        }
        z = true;
        zzbaj.zzc(z);
        this.zza = uri;
        this.zzb = j;
        this.zzc = j2;
        this.zzd = j3;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String arrays = Arrays.toString((byte[]) null);
        long j = this.zzb;
        long j2 = this.zzc;
        long j3 = this.zzd;
        return "DataSpec[" + valueOf + ", " + arrays + ", " + j + ", " + j2 + ", " + j3 + ", null, 0]";
    }
}
