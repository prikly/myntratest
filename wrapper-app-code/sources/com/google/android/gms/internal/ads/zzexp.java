package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzexp implements zzezm {
    private final zzgfc zza;
    private final Context zzb;
    private final Set zzc;

    public zzexp(zzgfc zzgfc, Context context, Set set) {
        this.zza = zzgfc;
        this.zzb = context;
        this.zzc = set;
    }

    public final int zza() {
        return 27;
    }

    public final zzgfb zzb() {
        return this.zza.zzb(new zzexo(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzexq zzc() throws Exception {
        String str = null;
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzey)).booleanValue()) {
            Set set = this.zzc;
            if (set.contains("rewarded") || set.contains("interstitial") || set.contains("native") || set.contains("banner")) {
                zzt.zzA();
                if (true == ((Boolean) zzba.zzc().zzb(zzbjj.zzey)).booleanValue()) {
                    str = "a.1.3.37-google_20220829";
                }
                return new zzexq(str);
            }
        }
        return new zzexq((String) null);
    }
}
