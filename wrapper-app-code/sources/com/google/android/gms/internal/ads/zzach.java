package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzach {
    private final ByteArrayOutputStream zza = new ByteArrayOutputStream(512);
    private final DataOutputStream zzb = new DataOutputStream(this.zza);

    private static void zzb(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public final byte[] zza(zzacg zzacg) {
        this.zza.reset();
        try {
            zzb(this.zzb, zzacg.zza);
            String str = zzacg.zzb;
            if (str == null) {
                str = "";
            }
            zzb(this.zzb, str);
            this.zzb.writeLong(zzacg.zzc);
            this.zzb.writeLong(zzacg.zzd);
            this.zzb.write(zzacg.zze);
            this.zzb.flush();
            return this.zza.toByteArray();
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }
}
