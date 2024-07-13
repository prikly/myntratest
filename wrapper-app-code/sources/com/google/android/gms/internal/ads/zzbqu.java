package com.google.android.gms.internal.ads;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbqu implements zzbqd {
    private final Context zza;

    public zzbqu(Context context) {
        this.zza = context;
    }

    public final void zza(Object obj, Map map) {
        if (map.containsKey("text") && !TextUtils.isEmpty((CharSequence) map.get("text"))) {
            zze.zza("Opening Share Sheet with text: ".concat(String.valueOf((String) map.get("text"))));
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", (String) map.get("text"));
            if (map.containsKey("title")) {
                intent.putExtra("android.intent.extra.TITLE", (String) map.get("title"));
            }
            try {
                zzt.zzp();
                zzs.zzQ(this.zza, intent);
            } catch (ActivityNotFoundException e2) {
                zzt.zzo().zzu(e2, "ShareSheetGmsgHandler.onGmsg");
            }
        }
    }
}
