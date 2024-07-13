package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzehw extends zzcbq {
    private final Context zza;
    private final zzfau zzb;
    private final zzfas zzc;
    private final zzeie zzd;
    private final zzgfc zze;
    private final zzeib zzf;
    private final zzccn zzg;

    zzehw(Context context, zzfau zzfau, zzfas zzfas, zzeib zzeib, zzeie zzeie, zzgfc zzgfc, zzccn zzccn, byte[] bArr) {
        this.zza = context;
        this.zzb = zzfau;
        this.zzc = zzfas;
        this.zzf = zzeib;
        this.zzd = zzeie;
        this.zze = zzgfc;
        this.zzg = zzccn;
    }

    private final void zzc(zzgfb zzgfb, zzcbu zzcbu) {
        zzger.zzr(zzger.zzn(zzgei.zzv(zzgfb), new zzeho(this), zzcib.zza), new zzehv(this, zzcbu), zzcib.zzf);
    }

    public final zzgfb zzb(zzcbj zzcbj, int i) {
        zzgfb zzgfb;
        String str = zzcbj.zza;
        int i2 = zzcbj.zzb;
        Bundle bundle = zzcbj.zzc;
        HashMap hashMap = new HashMap();
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                String string = bundle.getString(str2);
                if (string != null) {
                    hashMap.put(str2, string);
                }
            }
        }
        zzehy zzehy = new zzehy(str, i2, hashMap, zzcbj.zzd, "", zzcbj.zze);
        zzfas zzfas = this.zzc;
        zzfas.zza(new zzfbz(zzcbj));
        zzfat zzb2 = zzfas.zzb();
        if (zzehy.zzf) {
            String str3 = zzcbj.zza;
            String str4 = (String) zzblf.zzc.zze();
            if (!TextUtils.isEmpty(str4)) {
                String host = Uri.parse(str3).getHost();
                if (!TextUtils.isEmpty(host)) {
                    Iterator it = zzfyr.zzc(zzfxq.zzc(';')).zzd(str4).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (host.endsWith((String) it.next())) {
                                zzgfb = zzger.zzm(zzb2.zza().zza(new JSONObject()), new zzehu(zzehy), this.zze);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
        }
        zzgfb = zzger.zzi(zzehy);
        zzfnj zzb3 = zzb2.zzb();
        return zzger.zzn(zzb3.zzb(zzfnd.HTTP, zzgfb).zze(new zzeia(this.zza, "", this.zzg, i, (byte[]) null)).zza(), zzehq.zza, this.zze);
    }

    public final void zze(zzcbj zzcbj, zzcbu zzcbu) {
        zzc(zzb(zzcbj, Binder.getCallingUid()), zzcbu);
    }

    public final void zzf(zzcbf zzcbf, zzcbu zzcbu) {
        int callingUid = Binder.getCallingUid();
        zzfau zzfau = this.zzb;
        zzfau.zza(new zzfaj(zzcbf, callingUid));
        zzfav zzb2 = zzfau.zzb();
        zzfnj zzb3 = zzb2.zzb();
        zzfmo zza2 = zzb3.zzb(zzfnd.GMS_SIGNALS, zzger.zzj()).zzf(new zzeht(zzb2)).zze(zzehs.zza).zzf(zzehr.zza).zza();
        zzc(zza2, zzcbu);
        if (((Boolean) zzbkz.zzd.zze()).booleanValue()) {
            zzeie zzeie = this.zzd;
            zzeie.getClass();
            zza2.zzc(new zzehp(zzeie), this.zze);
        }
    }
}
