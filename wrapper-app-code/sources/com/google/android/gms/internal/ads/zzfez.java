package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzfez implements zzgdy {
    public final /* synthetic */ zzffb zza;
    public final /* synthetic */ zzflb zzb;
    public final /* synthetic */ zzdbu zzc;

    public /* synthetic */ zzfez(zzffb zzffb, zzflb zzflb, zzdbu zzdbu) {
        this.zza = zzffb;
        this.zzb = zzflb;
        this.zzc = zzdbu;
    }

    public final zzgfb zza(Object obj) {
        zzflb zzflb = this.zzb;
        zzdbu zzdbu = this.zzc;
        zzfix zzfix = (zzfix) obj;
        zzflb.zzb = zzfix;
        Iterator it = zzfix.zzb.zza.iterator();
        boolean z = false;
        loop0:
        while (true) {
            if (it.hasNext()) {
                Iterator it2 = ((zzfil) it.next()).zza.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!((String) it2.next()).contains("FirstPartyRenderer")) {
                            break loop0;
                        }
                        z = true;
                    }
                }
            } else if (z) {
                return zzdbu.zzi(zzger.zzi(zzfix));
            }
        }
        return zzger.zzi((Object) null);
    }
}
