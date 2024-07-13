package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzebz {
    private final zzebj zza;
    private final zzdwz zzb;
    private final Object zzc = new Object();
    private final List zzd;
    private boolean zze;

    zzebz(zzebj zzebj, zzdwz zzdwz) {
        this.zza = zzebj;
        this.zzb = zzdwz;
        this.zzd = new ArrayList();
    }

    /* access modifiers changed from: private */
    public final void zzd(List list) {
        String str;
        boolean z;
        synchronized (this.zzc) {
            if (!this.zze) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzbrz zzbrz = (zzbrz) it.next();
                    if (((Boolean) zzba.zzc().zzb(zzbjj.zzir)).booleanValue()) {
                        zzdwy zza2 = this.zzb.zza(zzbrz.zza);
                        if (zza2 != null) {
                            zzbye zzbye = zza2.zzc;
                            if (zzbye != null) {
                                str = zzbye.toString();
                            }
                        }
                        str = "";
                    } else {
                        str = "";
                    }
                    String str2 = str;
                    if (((Boolean) zzba.zzc().zzb(zzbjj.zzis)).booleanValue()) {
                        zzdwy zza3 = this.zzb.zza(zzbrz.zza);
                        if (zza3 != null) {
                            if (zza3.zzd) {
                                z = true;
                                List list2 = this.zzd;
                                String str3 = zzbrz.zza;
                                String zzc2 = this.zzb.zzc(str3);
                                boolean z2 = zzbrz.zzb;
                                list2.add(new zzeby(str3, str2, zzc2, z2 ? 1 : 0, zzbrz.zzd, zzbrz.zzc, z));
                            }
                        }
                    }
                    z = false;
                    List list22 = this.zzd;
                    String str32 = zzbrz.zza;
                    String zzc22 = this.zzb.zzc(str32);
                    boolean z22 = zzbrz.zzb;
                    list22.add(new zzeby(str32, str2, zzc22, z22 ? 1 : 0, zzbrz.zzd, zzbrz.zzc, z));
                }
                this.zze = true;
            }
        }
    }

    public final JSONArray zza() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.zzc) {
            if (!this.zze) {
                if (this.zza.zzt()) {
                    zzd(this.zza.zzg());
                } else {
                    zzc();
                    return jSONArray;
                }
            }
            for (zzeby zza2 : this.zzd) {
                jSONArray.put(zza2.zza());
            }
            return jSONArray;
        }
    }

    public final void zzc() {
        this.zza.zzs(new zzebx(this));
    }
}
