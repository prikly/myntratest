package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzeym implements zzezm {
    final String zza;
    private final zzgfc zzb;
    private final ScheduledExecutorService zzc;
    private final zzeqx zzd;
    private final Context zze;
    private final zzfjg zzf;
    private final zzeqt zzg;
    private final zzdxc zzh;
    private final zzebl zzi;

    public zzeym(zzgfc zzgfc, ScheduledExecutorService scheduledExecutorService, String str, zzeqx zzeqx, Context context, zzfjg zzfjg, zzeqt zzeqt, zzdxc zzdxc, zzebl zzebl) {
        this.zzb = zzgfc;
        this.zzc = scheduledExecutorService;
        this.zza = str;
        this.zzd = zzeqx;
        this.zze = context;
        this.zzf = zzfjg;
        this.zzg = zzeqt;
        this.zzh = zzdxc;
        this.zzi = zzebl;
    }

    public static /* synthetic */ zzgfb zzc(zzeym zzeym) {
        Bundle bundle;
        Map zza2 = zzeym.zzd.zza(zzeym.zza, ((Boolean) zzba.zzc().zzb(zzbjj.zziZ)).booleanValue() ? zzeym.zzf.zzf.toLowerCase(Locale.ROOT) : zzeym.zzf.zzf);
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzbw)).booleanValue()) {
            bundle = zzeym.zzi.zzg();
        } else {
            bundle = new Bundle();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((zzgax) zza2).entrySet().iterator();
        while (true) {
            Bundle bundle2 = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            Bundle bundle3 = zzeym.zzf.zzd.zzm;
            if (bundle3 != null) {
                bundle2 = bundle3.getBundle(str);
            }
            arrayList.add(zzeym.zze(str, list, bundle2, true, true));
        }
        for (Map.Entry value : ((zzgax) zzeym.zzd.zzb()).entrySet()) {
            zzerb zzerb = (zzerb) value.getValue();
            String str2 = zzerb.zza;
            Bundle bundle4 = zzeym.zzf.zzd.zzm;
            arrayList.add(zzeym.zze(str2, Collections.singletonList(zzerb.zzd), bundle4 != null ? bundle4.getBundle(str2) : null, zzerb.zzb, zzerb.zzc));
        }
        return zzger.zzc(arrayList).zza(new zzeyj(arrayList, bundle), zzeym.zzb);
    }

    private final zzgei zze(String str, List list, Bundle bundle, boolean z, boolean z2) {
        zzgei zzv = zzgei.zzv(zzger.zzl(new zzeyk(this, str, list, bundle, z, z2), this.zzb));
        if (!((Boolean) zzba.zzc().zzb(zzbjj.zzbs)).booleanValue()) {
            zzv = (zzgei) zzger.zzo(zzv, ((Long) zzba.zzc().zzb(zzbjj.zzbl)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return (zzgei) zzger.zzf(zzv, Throwable.class, new zzeyl(str), this.zzb);
    }

    public final int zza() {
        return 32;
    }

    public final zzgfb zzb() {
        return zzger.zzl(new zzeyh(this), this.zzb);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzgfb zzd(String str, List list, Bundle bundle, boolean z, boolean z2) throws Exception {
        zzbxq zzbxq;
        zzbxq zzb2;
        String str2 = str;
        zzcig zzcig = new zzcig();
        if (z2) {
            this.zzg.zzb(str2);
            zzb2 = this.zzg.zza(str2);
        } else {
            try {
                zzb2 = this.zzh.zzb(str2);
            } catch (RemoteException e2) {
                zze.zzh("Couldn't create RTB adapter : ", e2);
                zzbxq = null;
            }
        }
        zzbxq = zzb2;
        if (zzbxq == null) {
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzbn)).booleanValue()) {
                zzera.zzb(str2, zzcig);
            } else {
                throw null;
            }
        } else {
            zzera zzera = new zzera(str, zzbxq, zzcig, zzt.zzB().elapsedRealtime());
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzbs)).booleanValue()) {
                this.zzc.schedule(new zzeyi(zzera), ((Long) zzba.zzc().zzb(zzbjj.zzbl)).longValue(), TimeUnit.MILLISECONDS);
            }
            if (z) {
                zzbxq.zzh(ObjectWrapper.wrap(this.zze), this.zza, bundle, (Bundle) list.get(0), this.zzf.zze, zzera);
            } else {
                zzera.zzd();
            }
        }
        return zzcig;
    }
}
