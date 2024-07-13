package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdlw extends zzdjx implements zzbbx {
    private final Map zzb = new WeakHashMap(1);
    private final Context zzc;
    private final zzfil zzd;

    public zzdlw(Context context, Set set, zzfil zzfil) {
        super(set);
        this.zzc = context;
        this.zzd = zzfil;
    }

    public final synchronized void zza(View view) {
        zzbby zzbby = (zzbby) this.zzb.get(view);
        if (zzbby == null) {
            zzbby = new zzbby(this.zzc, view);
            zzbby.zzc(this);
            this.zzb.put(view, zzbby);
        }
        if (this.zzd.zzY) {
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzbh)).booleanValue()) {
                zzbby.zzg(((Long) zzba.zzc().zzb(zzbjj.zzbg)).longValue());
                return;
            }
        }
        zzbby.zzf();
    }

    public final synchronized void zzb(View view) {
        if (this.zzb.containsKey(view)) {
            ((zzbby) this.zzb.get(view)).zze(this);
            this.zzb.remove(view);
        }
    }

    public final synchronized void zzc(zzbbw zzbbw) {
        zzo(new zzdlv(zzbbw));
    }
}
