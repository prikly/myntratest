package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.internal.ads.zzchh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzdx {
    private final Date zza;
    private final String zzb;
    private final List zzc;
    private final int zzd;
    private final Set zze;
    private final Bundle zzf;
    private final Map zzg;
    private final String zzh;
    private final String zzi;
    private final SearchAdRequest zzj;
    private final int zzk;
    private final Set zzl;
    private final Bundle zzm;
    private final Set zzn;
    private final boolean zzo;
    private final AdInfo zzp;
    private final String zzq;
    private final int zzr;

    public zzdx(zzdw zzdw, SearchAdRequest searchAdRequest) {
        this.zza = zzdw.zzg;
        this.zzb = zzdw.zzh;
        this.zzc = zzdw.zzi;
        this.zzd = zzdw.zzj;
        this.zze = Collections.unmodifiableSet(zzdw.zza);
        this.zzf = zzdw.zzb;
        this.zzg = Collections.unmodifiableMap(zzdw.zzc);
        this.zzh = zzdw.zzk;
        this.zzi = zzdw.zzl;
        this.zzj = searchAdRequest;
        this.zzk = zzdw.zzm;
        this.zzl = Collections.unmodifiableSet(zzdw.zzd);
        this.zzm = zzdw.zze;
        this.zzn = Collections.unmodifiableSet(zzdw.zzf);
        this.zzo = zzdw.zzn;
        this.zzp = zzdw.zzo;
        this.zzq = zzdw.zzp;
        this.zzr = zzdw.zzq;
    }

    @Deprecated
    public final int zza() {
        return this.zzd;
    }

    public final int zzb() {
        return this.zzr;
    }

    public final int zzc() {
        return this.zzk;
    }

    public final Bundle zzd(Class cls) {
        Bundle bundle = this.zzf.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        if (bundle != null) {
            return bundle.getBundle(cls.getName());
        }
        return null;
    }

    public final Bundle zze() {
        return this.zzm;
    }

    public final Bundle zzf(Class cls) {
        return this.zzf.getBundle(cls.getName());
    }

    public final Bundle zzg() {
        return this.zzf;
    }

    @Deprecated
    public final NetworkExtras zzh(Class cls) {
        return (NetworkExtras) this.zzg.get(cls);
    }

    public final AdInfo zzi() {
        return this.zzp;
    }

    public final SearchAdRequest zzj() {
        return this.zzj;
    }

    public final String zzk() {
        return this.zzq;
    }

    public final String zzl() {
        return this.zzb;
    }

    public final String zzm() {
        return this.zzh;
    }

    public final String zzn() {
        return this.zzi;
    }

    @Deprecated
    public final Date zzo() {
        return this.zza;
    }

    public final List zzp() {
        return new ArrayList(this.zzc);
    }

    public final Set zzq() {
        return this.zzn;
    }

    public final Set zzr() {
        return this.zze;
    }

    @Deprecated
    public final boolean zzs() {
        return this.zzo;
    }

    public final boolean zzt(Context context) {
        RequestConfiguration zzc2 = zzej.zzf().zzc();
        zzay.zzb();
        String zzz = zzchh.zzz(context);
        return this.zzl.contains(zzz) || zzc2.getTestDeviceIds().contains(zzz);
    }
}
