package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public abstract class zzcfu {
    static zzcfu zza;

    public static synchronized zzcfu zzd(Context context) {
        synchronized (zzcfu.class) {
            zzcfu zzcfu = zza;
            if (zzcfu != null) {
                return zzcfu;
            }
            Context applicationContext = context.getApplicationContext();
            zzbjj.zzc(applicationContext);
            zzg zzh = zzt.zzo().zzh();
            zzh.zzr(applicationContext);
            zzcey zzcey = new zzcey((zzcex) null);
            zzcey.zzb(applicationContext);
            zzcey.zzc(zzt.zzB());
            zzcey.zza(zzh);
            zzcey.zzd(zzt.zzn());
            zzcfu zze = zzcey.zze();
            zza = zze;
            zze.zza().zza();
            zza.zzb().zzc();
            zzcfy zzc = zza.zzc();
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzao)).booleanValue()) {
                HashMap hashMap = new HashMap();
                try {
                    JSONObject jSONObject = new JSONObject((String) zzba.zzc().zzb(zzbjj.zzaq));
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        HashSet hashSet = new HashSet();
                        JSONArray optJSONArray = jSONObject.optJSONArray(next);
                        if (optJSONArray != null) {
                            for (int i = 0; i < optJSONArray.length(); i++) {
                                String optString = optJSONArray.optString(i);
                                if (optString != null) {
                                    hashSet.add(optString);
                                }
                            }
                            hashMap.put(next, hashSet);
                        }
                    }
                    for (String zzc2 : hashMap.keySet()) {
                        zzc.zzc(zzc2);
                    }
                    zzc.zzd(new zzcfw(zzc, hashMap));
                } catch (JSONException e2) {
                    zze.zzf("Failed to parse listening list", e2);
                }
            }
            zzcfu zzcfu2 = zza;
            return zzcfu2;
        }
    }

    /* access modifiers changed from: package-private */
    public abstract zzcer zza();

    /* access modifiers changed from: package-private */
    public abstract zzcev zzb();

    /* access modifiers changed from: package-private */
    public abstract zzcfy zzc();
}
