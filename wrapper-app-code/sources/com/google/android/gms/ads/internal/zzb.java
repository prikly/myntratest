package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.internal.ads.zzcbh;
import com.google.android.gms.internal.ads.zzcep;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzb {
    private final Context zza;
    private boolean zzb;
    private final zzcep zzc;
    private final zzcbh zzd = new zzcbh(false, Collections.emptyList());

    public zzb(Context context, zzcep zzcep, zzcbh zzcbh) {
        this.zza = context;
        this.zzc = zzcep;
    }

    private final boolean zzd() {
        zzcep zzcep = this.zzc;
        return (zzcep != null && zzcep.zza().zzf) || this.zzd.zza;
    }

    public final void zza() {
        this.zzb = true;
    }

    public final void zzb(String str) {
        List<String> list;
        if (zzd()) {
            if (str == null) {
                str = "";
            }
            zzcep zzcep = this.zzc;
            if (zzcep != null) {
                zzcep.zzd(str, (Map) null, 3);
                return;
            }
            zzcbh zzcbh = this.zzd;
            if (zzcbh.zza && (list = zzcbh.zzb) != null) {
                for (String str2 : list) {
                    if (!TextUtils.isEmpty(str2)) {
                        String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                        zzt.zzp();
                        zzs.zzH(this.zza, "", replace);
                    }
                }
            }
        }
    }

    public final boolean zzc() {
        return !zzd() || this.zzb;
    }
}
