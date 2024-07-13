package com.google.android.play.core.appupdate.internal;

import android.os.Bundle;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.play:app-update@@2.0.0 */
public final class zzi {
    private static final Set zza = new HashSet(Arrays.asList(new String[]{"app_update", "review"}));
    private static final Set zzb = new HashSet(Arrays.asList(new String[]{"native", "unity"}));
    private static final Map zzc = new HashMap();
    private static final zzm zzd = new zzm("PlayCoreVersion");

    public static Bundle zza(String str) {
        Bundle bundle = new Bundle();
        Map zzb2 = zzb("app_update");
        bundle.putInt("playcore_version_code", ((Integer) zzb2.get("java")).intValue());
        if (zzb2.containsKey("native")) {
            bundle.putInt("playcore_native_version", ((Integer) zzb2.get("native")).intValue());
        }
        if (zzb2.containsKey("unity")) {
            bundle.putInt("playcore_unity_version", ((Integer) zzb2.get("unity")).intValue());
        }
        return bundle;
    }

    public static synchronized Map zzb(String str) {
        Map map;
        synchronized (zzi.class) {
            if (!zzc.containsKey("app_update")) {
                HashMap hashMap = new HashMap();
                hashMap.put("java", 11004);
                zzc.put("app_update", hashMap);
            }
            map = (Map) zzc.get("app_update");
        }
        return map;
    }
}
