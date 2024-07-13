package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdsq {
    private final zzbo zza;
    private final Clock zzb;
    private final Executor zzc;

    public zzdsq(zzbo zzbo, Clock clock, Executor executor) {
        this.zza = zzbo;
        this.zzb = clock;
        this.zzc = executor;
    }

    private final Bitmap zzc(byte[] bArr, BitmapFactory.Options options) {
        long elapsedRealtime = this.zzb.elapsedRealtime();
        boolean z = false;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long elapsedRealtime2 = this.zzb.elapsedRealtime();
        if (decodeByteArray != null) {
            int width = decodeByteArray.getWidth();
            int height = decodeByteArray.getHeight();
            int allocationByteCount = decodeByteArray.getAllocationByteCount();
            long j = elapsedRealtime2 - elapsedRealtime;
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                z = true;
            }
            zze.zza("Decoded image w: " + width + " h:" + height + " bytes: " + allocationByteCount + " time: " + j + " on ui thread: " + z);
        }
        return decodeByteArray;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Bitmap zza(double d2, boolean z, zzaka zzaka) {
        byte[] bArr = zzaka.zzb;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d2 * 160.0d);
        if (!z) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzfB)).booleanValue()) {
            options.inJustDecodeBounds = true;
            zzc(bArr, options);
            options.inJustDecodeBounds = false;
            int i = options.outWidth * options.outHeight;
            if (i > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i - 1) / ((Integer) zzba.zzc().zzb(zzbjj.zzfC)).intValue())) / 2);
            }
        }
        return zzc(bArr, options);
    }

    public final zzgfb zzb(String str, double d2, boolean z) {
        return zzger.zzm(this.zza.zza(str), new zzdsp(this, d2, z), this.zzc);
    }
}
