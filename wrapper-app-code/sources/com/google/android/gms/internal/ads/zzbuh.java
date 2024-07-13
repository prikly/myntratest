package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbuh implements zzbsy, zzbug {
    private final zzbug zza;
    private final HashSet zzb = new HashSet();

    public zzbuh(zzbug zzbug) {
        this.zza = zzbug;
    }

    public final void zza(String str) {
        this.zza.zza(str);
    }

    public final /* synthetic */ void zzb(String str, String str2) {
        zzbsx.zzc(this, str, str2);
    }

    public final void zzc() {
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
            zze.zza("Unregistering eventhandler: ".concat(String.valueOf(((zzbqd) simpleEntry.getValue()).toString())));
            this.zza.zzr((String) simpleEntry.getKey(), (zzbqd) simpleEntry.getValue());
        }
        this.zzb.clear();
    }

    public final /* synthetic */ void zzd(String str, Map map) {
        zzbsx.zza(this, str, map);
    }

    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        zzbsx.zzb(this, str, jSONObject);
    }

    public final /* synthetic */ void zzl(String str, JSONObject jSONObject) {
        zzbsx.zzd(this, str, jSONObject);
    }

    public final void zzq(String str, zzbqd zzbqd) {
        this.zza.zzq(str, zzbqd);
        this.zzb.add(new AbstractMap.SimpleEntry(str, zzbqd));
    }

    public final void zzr(String str, zzbqd zzbqd) {
        this.zza.zzr(str, zzbqd);
        this.zzb.remove(new AbstractMap.SimpleEntry(str, zzbqd));
    }
}
