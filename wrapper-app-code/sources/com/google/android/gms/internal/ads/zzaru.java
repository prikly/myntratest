package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzaru extends zzarx {
    private final View zzi;

    public zzaru(zzaqj zzaqj, String str, String str2, zzaml zzaml, int i, int i2, View view) {
        super(zzaqj, "JgNevmfyr8lZxnvZfq3r729JgtxbLk039SjEVr1jMI7eztR3nd0tOgO6sMz+FJz+", "ylslQbtrjnaBQeIQLiG5TQpHgACRff6HBxNL0ysPa0Q=", zzaml, i, 57);
        this.zzi = view;
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzi != null) {
            Boolean bool = (Boolean) zzba.zzc().zzb(zzbjj.zzcU);
            Boolean bool2 = (Boolean) zzba.zzc().zzb(zzbjj.zzjc);
            DisplayMetrics displayMetrics = this.zzb.zzb().getResources().getDisplayMetrics();
            zzaqo zzaqo = new zzaqo((String) this.zzf.invoke((Object) null, new Object[]{this.zzi, displayMetrics, bool, bool2}));
            zzand zza = zzane.zza();
            zza.zzb(zzaqo.zza.longValue());
            zza.zzd(zzaqo.zzb.longValue());
            zza.zze(zzaqo.zzc.longValue());
            if (bool2.booleanValue()) {
                zza.zzc(zzaqo.zze.longValue());
            }
            if (bool.booleanValue()) {
                zza.zza(zzaqo.zzd.longValue());
            }
            this.zze.zzY((zzane) zza.zzak());
        }
    }
}
