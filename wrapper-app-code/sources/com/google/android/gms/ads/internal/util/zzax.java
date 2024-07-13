package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzaka;
import com.google.android.gms.internal.ads.zzake;
import com.google.android.gms.internal.ads.zzakh;
import com.google.android.gms.internal.ads.zzakn;
import com.google.android.gms.internal.ads.zzaks;
import com.google.android.gms.internal.ads.zzakt;
import com.google.android.gms.internal.ads.zzala;
import com.google.android.gms.internal.ads.zzale;
import com.google.android.gms.internal.ads.zzalf;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzbry;
import com.google.android.gms.internal.ads.zzchh;
import java.io.File;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzax extends zzakt {
    private final Context zzc;

    private zzax(Context context, zzaks zzaks) {
        super(zzaks);
        this.zzc = context;
    }

    public static zzakh zzb(Context context) {
        zzakh zzakh = new zzakh(new zzala(new File(context.getCacheDir(), "admob_volley"), 20971520), new zzax(context, new zzalf((zzale) null, (SSLSocketFactory) null)), 4);
        zzakh.zzd();
        return zzakh;
    }

    public final zzaka zza(zzake zzake) throws zzakn {
        if (zzake.zza() == 0) {
            if (Pattern.matches((String) zzba.zzc().zzb(zzbjj.zzdV), zzake.zzk())) {
                zzay.zzb();
                if (zzchh.zzt(this.zzc, 13400000)) {
                    zzaka zza = new zzbry(this.zzc).zza(zzake);
                    if (zza != null) {
                        zze.zza("Got gmscore asset response: ".concat(String.valueOf(zzake.zzk())));
                        return zza;
                    }
                    zze.zza("Failed to get gmscore asset response: ".concat(String.valueOf(zzake.zzk())));
                }
            }
        }
        return super.zza(zzake);
    }
}
