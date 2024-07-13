package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdm;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.ads.internal.zzt;
import java.util.List;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdeg extends zzdm {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final List zze;
    private final long zzf;
    private final String zzg;
    private final zzekv zzh;
    private final Bundle zzi;

    public zzdeg(zzfil zzfil, String str, zzekv zzekv, zzfio zzfio, String str2) {
        String str3;
        String str4;
        String str5 = null;
        if (zzfil == null) {
            str3 = null;
        } else {
            str3 = zzfil.zzac;
        }
        this.zzb = str3;
        this.zzc = str2;
        if (zzfio == null) {
            str4 = null;
        } else {
            str4 = zzfio.zzb;
        }
        this.zzd = str4;
        if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            try {
                str5 = zzfil.zzw.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.zza = str5 != null ? str5 : str;
        this.zze = zzekv.zzc();
        this.zzh = zzekv;
        this.zzf = zzt.zzB().currentTimeMillis() / 1000;
        if (!((Boolean) zzba.zzc().zzb(zzbjj.zzgl)).booleanValue() || zzfio == null) {
            this.zzi = new Bundle();
        } else {
            this.zzi = zzfio.zzj;
        }
        this.zzg = (!((Boolean) zzba.zzc().zzb(zzbjj.zzio)).booleanValue() || zzfio == null || TextUtils.isEmpty(zzfio.zzh)) ? "" : zzfio.zzh;
    }

    public final long zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzg;
    }

    public final Bundle zze() {
        return this.zzi;
    }

    public final zzu zzf() {
        zzekv zzekv = this.zzh;
        if (zzekv != null) {
            return zzekv.zza();
        }
        return null;
    }

    public final String zzg() {
        return this.zza;
    }

    public final String zzh() {
        return this.zzc;
    }

    public final String zzi() {
        return this.zzb;
    }

    public final List zzj() {
        return this.zze;
    }

    public final String zzk() {
        return this.zzd;
    }
}
