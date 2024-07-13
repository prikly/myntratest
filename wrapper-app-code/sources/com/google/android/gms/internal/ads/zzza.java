package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzza implements zzzc {
    public static final /* synthetic */ zzza zza = new zzza();

    private /* synthetic */ zzza() {
    }

    public final Constructor zza() {
        if (!Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke((Object) null, new Object[0]))) {
            return null;
        }
        return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(zzzj.class).getConstructor(new Class[]{Integer.TYPE});
    }
}
