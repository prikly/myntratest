package com.google.android.gms.internal.ads;

import com.unity3d.services.core.device.MimeTypes;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbao {
    public static boolean zza(String str) {
        return MimeTypes.BASE_TYPE_AUDIO.equals(zzc(str));
    }

    public static boolean zzb(String str) {
        return "video".equals(zzc(str));
    }

    private static String zzc(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(47);
        if (indexOf != -1) {
            return str.substring(0, indexOf);
        }
        throw new IllegalArgumentException("Invalid mime type: ".concat(str));
    }
}
