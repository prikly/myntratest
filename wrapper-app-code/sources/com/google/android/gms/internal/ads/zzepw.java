package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzepw implements zzekq {
    private final zzeks zza;
    private final zzekx zzb;
    private final zzfnj zzc;
    private final zzgfc zzd;

    public zzepw(zzfnj zzfnj, zzgfc zzgfc, zzeks zzeks, zzekx zzekx) {
        this.zzc = zzfnj;
        this.zzd = zzgfc;
        this.zzb = zzekx;
        this.zza = zzeks;
    }

    static final String zze(String str, int i) {
        return "Error from: " + str + ", code: " + i;
    }

    public final zzgfb zza(zzfix zzfix, zzfil zzfil) {
        zzekt zzekt;
        Iterator it = zzfil.zzu.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzekt = null;
                break;
            }
            try {
                zzekt = this.zza.zza((String) it.next(), zzfil.zzw);
                break;
            } catch (zzfjl unused) {
            }
        }
        if (zzekt == null) {
            return zzger.zzh(new zzeny("Unable to instantiate mediation adapter class."));
        }
        zzcig zzcig = new zzcig();
        zzekt.zzc.zza(new zzepv(this, zzekt, zzcig));
        if (zzfil.zzN) {
            Bundle bundle = zzfix.zza.zza.zzd.zzm;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        zzfnj zzfnj = this.zzc;
        return zzfmt.zzd(new zzept(this, zzfix, zzfil, zzekt), this.zzd, zzfnd.ADAPTER_LOAD_AD_SYN, zzfnj).zzb(zzfnd.ADAPTER_LOAD_AD_ACK).zzd(zzcig).zzb(zzfnd.ADAPTER_WRAP_ADAPTER).zze(new zzepu(this, zzfix, zzfil, zzekt)).zza();
    }

    public final boolean zzb(zzfix zzfix, zzfil zzfil) {
        return !zzfil.zzu.isEmpty();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzc(zzfix zzfix, zzfil zzfil, zzekt zzekt, Void voidR) throws Exception {
        return this.zzb.zza(zzfix, zzfil, zzekt);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(zzfix zzfix, zzfil zzfil, zzekt zzekt) throws Exception {
        this.zzb.zzb(zzfix, zzfil, zzekt);
    }
}
