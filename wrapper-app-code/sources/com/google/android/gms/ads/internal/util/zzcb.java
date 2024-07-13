package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.os.StrictMode;
import com.google.android.gms.internal.ads.zzcat;
import com.google.android.gms.internal.ads.zzcho;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzcb {
    @Deprecated
    public static Object zza(Context context, Callable callable) {
        StrictMode.ThreadPolicy threadPolicy;
        try {
            threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            Object call = callable.call();
            StrictMode.setThreadPolicy(threadPolicy);
            return call;
        } catch (Throwable th) {
            zzcho.zzh("Unexpected exception.", th);
            zzcat.zza(context).zzf(th, "StrictModeUtil.runWithLaxStrictMode");
            return null;
        }
    }
}
