package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzchb implements zzbcq {
    final zzcgy zza;
    final HashSet zzb = new HashSet();
    final HashSet zzc = new HashSet();
    private final Object zzd = new Object();
    private final zzg zze;
    private final zzcgz zzf;
    private boolean zzg = false;

    public zzchb(String str, zzg zzg2) {
        this.zza = new zzcgy(str, zzg2);
        this.zze = zzg2;
        this.zzf = new zzcgz();
    }

    public final void zza(boolean z) {
        long currentTimeMillis = zzt.zzB().currentTimeMillis();
        if (z) {
            if (currentTimeMillis - this.zze.zzd() > ((Long) zzba.zzc().zzb(zzbjj.zzaN)).longValue()) {
                this.zza.zzd = -1;
            } else {
                this.zza.zzd = this.zze.zzc();
            }
            this.zzg = true;
            return;
        }
        this.zze.zzt(currentTimeMillis);
        this.zze.zzJ(this.zza.zzd);
    }

    public final zzcgq zzb(Clock clock, String str) {
        return new zzcgq(clock, this, this.zzf.zza(), str);
    }

    public final void zzc(zzcgq zzcgq) {
        synchronized (this.zzd) {
            this.zzb.add(zzcgq);
        }
    }

    public final void zzd() {
        synchronized (this.zzd) {
            this.zza.zzb();
        }
    }

    public final void zze() {
        synchronized (this.zzd) {
            this.zza.zzc();
        }
    }

    public final void zzf() {
        synchronized (this.zzd) {
            this.zza.zzd();
        }
    }

    public final void zzg() {
        synchronized (this.zzd) {
            this.zza.zze();
        }
    }

    public final void zzh(zzl zzl, long j) {
        synchronized (this.zzd) {
            this.zza.zzf(zzl, j);
        }
    }

    public final void zzi(HashSet hashSet) {
        synchronized (this.zzd) {
            this.zzb.addAll(hashSet);
        }
    }

    public final boolean zzj() {
        return this.zzg;
    }

    public final Bundle zzk(Context context, zzfkm zzfkm) {
        HashSet hashSet = new HashSet();
        synchronized (this.zzd) {
            hashSet.addAll(this.zzb);
            this.zzb.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.zza.zza(context, this.zzf.zzb()));
        Bundle bundle2 = new Bundle();
        Iterator it = this.zzc.iterator();
        if (!it.hasNext()) {
            bundle.putBundle("slots", bundle2);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                arrayList.add(((zzcgq) it2.next()).zza());
            }
            bundle.putParcelableArrayList("ads", arrayList);
            zzfkm.zzc(hashSet);
            return bundle;
        }
        zzcha zzcha = (zzcha) it.next();
        throw null;
    }
}
