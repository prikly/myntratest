package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzbjc {
    private final Collection zza = new ArrayList();
    private final Collection zzb = new ArrayList();
    private final Collection zzc = new ArrayList();

    public final List zza() {
        ArrayList arrayList = new ArrayList();
        for (zzbjb zzb2 : this.zzb) {
            String str = (String) zzba.zzc().zzb(zzb2);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(zzbjk.zza());
        return arrayList;
    }

    public final List zzb() {
        List zza2 = zza();
        for (zzbjb zzb2 : this.zzc) {
            String str = (String) zzba.zzc().zzb(zzb2);
            if (!TextUtils.isEmpty(str)) {
                zza2.add(str);
            }
        }
        zza2.addAll(zzbjk.zzb());
        return zza2;
    }

    public final void zzc(zzbjb zzbjb) {
        this.zzb.add(zzbjb);
    }

    public final void zzd(zzbjb zzbjb) {
        this.zza.add(zzbjb);
    }

    public final void zze(SharedPreferences.Editor editor, int i, JSONObject jSONObject) {
        for (zzbjb zzbjb : this.zza) {
            if (zzbjb.zze() == 1) {
                zzbjb.zzd(editor, zzbjb.zza(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            zzcho.zzg("Flag Json is null.");
        }
    }
}
