package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdzk implements zzfnk {
    private final Map zza = new HashMap();
    private final zzdzc zzb;
    private final Clock zzc;
    private final Map zzd = new HashMap();

    public zzdzk(zzdzc zzdzc, Set set, Clock clock) {
        this.zzb = zzdzc;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzdzj zzdzj = (zzdzj) it.next();
            this.zzd.put(zzdzj.zzc, zzdzj);
        }
        this.zzc = clock;
    }

    private final void zze(zzfnd zzfnd, boolean z) {
        zzfnd zzb2 = ((zzdzj) this.zzd.get(zzfnd)).zzb;
        String str = true != z ? "f." : "s.";
        if (this.zza.containsKey(zzb2)) {
            this.zzb.zza().put("label.".concat(((zzdzj) this.zzd.get(zzfnd)).zza), str.concat(String.valueOf(Long.toString(this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzb2)).longValue()))));
        }
    }

    public final void zzbH(zzfnd zzfnd, String str) {
    }

    public final void zzbI(zzfnd zzfnd, String str, Throwable th) {
        if (this.zza.containsKey(zzfnd)) {
            this.zzb.zza().put("task.".concat(String.valueOf(str)), "f.".concat(String.valueOf(Long.toString(this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzfnd)).longValue()))));
        }
        if (this.zzd.containsKey(zzfnd)) {
            zze(zzfnd, false);
        }
    }

    public final void zzc(zzfnd zzfnd, String str) {
        this.zza.put(zzfnd, Long.valueOf(this.zzc.elapsedRealtime()));
    }

    public final void zzd(zzfnd zzfnd, String str) {
        if (this.zza.containsKey(zzfnd)) {
            this.zzb.zza().put("task.".concat(String.valueOf(str)), "s.".concat(String.valueOf(Long.toString(this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzfnd)).longValue()))));
        }
        if (this.zzd.containsKey(zzfnd)) {
            zze(zzfnd, true);
        }
    }
}
