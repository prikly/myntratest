package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzekv {
    private final List zza = Collections.synchronizedList(new ArrayList());
    private final Map zzb = Collections.synchronizedMap(new HashMap());
    private final String zzc;
    private zzfio zzd = null;
    private zzfil zze = null;
    private zzu zzf = null;

    public zzekv(String str) {
        this.zzc = str;
    }

    private final void zzh(zzfil zzfil, long j, zze zze2, boolean z) {
        String str = zzfil.zzx;
        if (this.zzb.containsKey(str)) {
            if (this.zze == null) {
                this.zze = zzfil;
            }
            zzu zzu = (zzu) this.zzb.get(str);
            zzu.zzb = j;
            zzu.zzc = zze2;
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzgk)).booleanValue() && z) {
                this.zzf = zzu;
            }
        }
    }

    public final zzu zza() {
        return this.zzf;
    }

    public final zzdeg zzb() {
        return new zzdeg(this.zze, "", this, this.zzd, this.zzc);
    }

    public final List zzc() {
        return this.zza;
    }

    public final void zzd(zzfil zzfil) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = zzfil.zzx;
        if (!this.zzb.containsKey(str5)) {
            Bundle bundle = new Bundle();
            Iterator<String> keys = zzfil.zzw.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    bundle.putString(next, zzfil.zzw.getString(next));
                } catch (JSONException unused) {
                }
            }
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzgj)).booleanValue()) {
                String str6 = zzfil.zzG;
                String str7 = zzfil.zzH;
                str4 = str6;
                str3 = str7;
                str2 = zzfil.zzI;
                str = zzfil.zzJ;
            } else {
                str4 = "";
                str3 = str4;
                str2 = str3;
                str = str2;
            }
            zzu zzu = new zzu(zzfil.zzF, 0, (zze) null, bundle, str4, str3, str2, str);
            this.zza.add(zzu);
            this.zzb.put(str5, zzu);
        }
    }

    public final void zze(zzfil zzfil, long j, zze zze2) {
        zzh(zzfil, j, zze2, false);
    }

    public final void zzf(zzfil zzfil, long j, zze zze2) {
        zzh(zzfil, j, (zze) null, true);
    }

    public final void zzg(zzfio zzfio) {
        this.zzd = zzfio;
    }
}
