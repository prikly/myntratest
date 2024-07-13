package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzajm;
import com.google.android.gms.internal.ads.zzakh;
import com.google.android.gms.internal.ads.zzaks;
import com.google.android.gms.internal.ads.zzall;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzchn;
import com.google.android.gms.internal.ads.zzcig;
import com.google.android.gms.internal.ads.zzgfb;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbo {
    @Deprecated
    public static final zzbj zza = new zzbg();
    private static zzakh zzb;
    private static final Object zzc = new Object();

    public zzbo(Context context) {
        zzakh zzakh;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (zzc) {
            if (zzb == null) {
                zzbjj.zzc(context);
                if (!ClientLibraryUtils.isPackageSide()) {
                    if (((Boolean) zzba.zzc().zzb(zzbjj.zzdU)).booleanValue()) {
                        zzakh = zzax.zzb(context);
                        zzb = zzakh;
                    }
                }
                zzakh = zzall.zza(context, (zzaks) null);
                zzb = zzakh;
            }
        }
    }

    public final zzgfb zza(String str) {
        zzcig zzcig = new zzcig();
        zzb.zza(new zzbn(str, (Map) null, zzcig));
        return zzcig;
    }

    public final zzgfb zzb(int i, String str, Map map, byte[] bArr) {
        String str2 = str;
        zzbl zzbl = new zzbl((zzbk) null);
        zzbh zzbh = new zzbh(this, str2, zzbl);
        zzchn zzchn = new zzchn((String) null);
        zzbi zzbi = new zzbi(this, i, str, zzbl, zzbh, bArr, map, zzchn);
        if (zzchn.zzl()) {
            try {
                zzchn.zzd(str2, "GET", zzbi.zzl(), zzbi.zzx());
            } catch (zzajm e2) {
                zze.zzj(e2.getMessage());
            }
        }
        zzb.zza(zzbi);
        return zzbl;
    }
}
