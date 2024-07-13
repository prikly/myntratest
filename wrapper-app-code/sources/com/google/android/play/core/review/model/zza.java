package com.google.android.play.core.review.model;

import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.play:review@@2.0.0 */
public final class zza {
    private static final Map zza = new HashMap();
    private static final Map zzb = new HashMap();

    static {
        zza.put(-1, "The Play Store app is either not installed or not the official version.");
        zza.put(-2, "Call first requestReviewFlow to get the ReviewInfo.");
        zza.put(-100, "Retry with an exponential backoff. Consider filing a bug if fails consistently.");
        zzb.put(-1, "PLAY_STORE_NOT_FOUND");
        zzb.put(-2, "INVALID_REQUEST");
        zzb.put(-100, "INTERNAL_ERROR");
    }

    public static String zza(int i) {
        Map map = zza;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            return "";
        }
        return ((String) zza.get(valueOf)) + " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#" + ((String) zzb.get(valueOf)) + ")";
    }
}
