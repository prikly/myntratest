package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzayd {
    private final zzavg[] zza;
    private final zzavh zzb;
    private zzavg zzc;

    public zzayd(zzavg[] zzavgArr, zzavh zzavh) {
        this.zza = zzavgArr;
        this.zzb = zzavh;
    }

    public final void zza() {
        if (this.zzc != null) {
            this.zzc = null;
        }
    }

    public final zzavg zzb(zzavf zzavf, Uri uri) throws IOException, InterruptedException {
        zzavg zzavg = this.zzc;
        if (zzavg != null) {
            return zzavg;
        }
        zzavg[] zzavgArr = this.zza;
        int length = zzavgArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            zzavg zzavg2 = zzavgArr[i];
            try {
                if (zzavg2.zzg(zzavf)) {
                    this.zzc = zzavg2;
                    zzavf.zze();
                    break;
                }
                zzavf.zze();
                i++;
            } catch (EOFException unused) {
            } catch (Throwable th) {
                zzavf.zze();
                throw th;
            }
        }
        zzavg zzavg3 = this.zzc;
        if (zzavg3 != null) {
            zzavg3.zzd(this.zzb);
            return this.zzc;
        }
        String zzk = zzbay.zzk(this.zza);
        throw new zzazb("None of the available extractors (" + zzk + ") could read the stream.", uri);
    }
}
