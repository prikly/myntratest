package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import com.google.android.gms.ads.internal.util.zze;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzbda {
    ByteArrayOutputStream zza = new ByteArrayOutputStream(4096);
    Base64OutputStream zzb = new Base64OutputStream(this.zza, 10);

    public final String toString() {
        try {
            this.zzb.close();
        } catch (IOException e2) {
            zze.zzh("HashManager: Unable to convert to Base64.", e2);
        }
        try {
            this.zza.close();
            return this.zza.toString();
        } catch (IOException e3) {
            zze.zzh("HashManager: Unable to convert to Base64.", e3);
            return "";
        } finally {
            this.zza = null;
            this.zzb = null;
        }
    }
}
