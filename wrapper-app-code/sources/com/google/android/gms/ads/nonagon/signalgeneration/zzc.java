package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzcib;
import com.google.android.gms.internal.ads.zzdzc;
import com.google.android.gms.internal.ads.zzdzm;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzc {
    /* access modifiers changed from: private */
    public final int zza;
    private final long zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final Map zze;
    /* access modifiers changed from: private */
    public final ArrayDeque zzf = new ArrayDeque();
    private final ArrayDeque zzg = new ArrayDeque();
    private final zzdzm zzh;
    private Map zzi;

    public zzc(zzdzm zzdzm) {
        this.zzh = zzdzm;
        this.zza = ((Integer) zzba.zzc().zzb(zzbjj.zzgt)).intValue();
        this.zzb = ((Long) zzba.zzc().zzb(zzbjj.zzgu)).longValue();
        this.zzc = ((Boolean) zzba.zzc().zzb(zzbjj.zzgz)).booleanValue();
        this.zzd = ((Boolean) zzba.zzc().zzb(zzbjj.zzgx)).booleanValue();
        this.zze = Collections.synchronizedMap(new zzb(this));
    }

    private final synchronized void zzg(zzdzc zzdzc) {
        if (this.zzc) {
            ArrayDeque clone = this.zzg.clone();
            this.zzg.clear();
            ArrayDeque clone2 = this.zzf.clone();
            this.zzf.clear();
            zzcib.zza.execute(new zza(this, zzdzc, clone, clone2));
        }
    }

    private final void zzh(zzdzc zzdzc, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(zzdzc.zza());
            this.zzi = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.zzi.put("e_r", str);
            this.zzi.put("e_id", (String) pair2.first);
            if (this.zzd) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(zzf.zza(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                zzj(this.zzi, "e_type", (String) pair.first);
                zzj(this.zzi, "e_agent", (String) pair.second);
            }
            this.zzh.zze(this.zzi);
        }
    }

    private final synchronized void zzi() {
        long currentTimeMillis = zzt.zzB().currentTimeMillis();
        try {
            Iterator it = this.zze.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (currentTimeMillis - ((Long) ((Pair) entry.getValue()).first).longValue() <= this.zzb) {
                    break;
                }
                this.zzg.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
                it.remove();
            }
        } catch (ConcurrentModificationException e2) {
            zzt.zzo().zzu(e2, "QueryJsonMap.removeExpiredEntries");
        }
    }

    private static final void zzj(Map map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    public final synchronized String zzb(String str, zzdzc zzdzc) {
        Pair pair = (Pair) this.zze.get(str);
        zzdzc.zza().put("rid", str);
        if (pair != null) {
            String str2 = (String) pair.second;
            this.zze.remove(str);
            zzdzc.zza().put("mhit", "true");
            return str2;
        }
        zzdzc.zza().put("mhit", "false");
        return null;
    }

    public final synchronized void zzd(String str, String str2, zzdzc zzdzc) {
        this.zze.put(str, new Pair(Long.valueOf(zzt.zzB().currentTimeMillis()), str2));
        zzi();
        zzg(zzdzc);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zze(zzdzc zzdzc, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        zzh(zzdzc, arrayDeque, "to");
        zzh(zzdzc, arrayDeque2, "of");
    }

    public final synchronized void zzf(String str) {
        this.zze.remove(str);
    }
}
