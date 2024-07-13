package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzcmb implements zzbqd {
    private static final Integer zzb(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            zze.zzj("Precache invalid numeric parameter '" + str + "': " + ((String) map.get(str)));
            return null;
        }
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcma zzcma;
        zzcls zzcls;
        Map map2 = map;
        zzcjx zzcjx = (zzcjx) obj;
        if (zze.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map2);
            jSONObject.remove("google.afma.Notify_dt");
            zze.zze("Precache GMSG: ".concat(jSONObject.toString()));
        }
        zzclt zzy = zzt.zzy();
        if (!map2.containsKey("abort")) {
            String str = (String) map2.get("src");
            Integer zzb = zzb(map2, "periodicReportIntervalMs");
            Integer zzb2 = zzb(map2, "exoPlayerRenderingIntervalMs");
            Integer zzb3 = zzb(map2, "exoPlayerIdleIntervalMs");
            zzcjw zzcjw = new zzcjw((String) map2.get("flags"));
            boolean z = zzcjw.zzn;
            if (str != null) {
                String[] strArr = {str};
                String str2 = (String) map2.get("demuxed");
                if (str2 != null) {
                    try {
                        JSONArray jSONArray = new JSONArray(str2);
                        String[] strArr2 = new String[jSONArray.length()];
                        for (int i = 0; i < jSONArray.length(); i++) {
                            strArr2[i] = jSONArray.getString(i);
                        }
                        strArr = strArr2;
                    } catch (JSONException unused) {
                        zze.zzj("Malformed demuxed URL list for precache: ".concat(str2));
                        strArr = null;
                    }
                }
                if (strArr == null) {
                    strArr = new String[]{str};
                }
                if (z) {
                    Iterator it = zzy.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            zzcls = null;
                            break;
                        }
                        zzcls zzcls2 = (zzcls) it.next();
                        if (zzcls2.zza == zzcjx && str.equals(zzcls2.zze())) {
                            zzcls = zzcls2;
                            break;
                        }
                    }
                } else {
                    zzcls = zzy.zza(zzcjx);
                }
                if (zzcls != null) {
                    zze.zzj("Precache task is already running.");
                    return;
                } else if (zzcjx.zzm() == null) {
                    zze.zzj("Precache requires a dependency provider.");
                    return;
                } else {
                    Integer zzb4 = zzb(map2, "player");
                    if (zzb4 == null) {
                        zzb4 = 0;
                    }
                    if (zzb != null) {
                        zzcjx.zzC(zzb.intValue());
                    }
                    if (zzb2 != null) {
                        zzcjx.zzA(zzb2.intValue());
                    }
                    if (zzb3 != null) {
                        zzcjx.zzz(zzb3.intValue());
                    }
                    int intValue = zzb4.intValue();
                    zzclm zzclm = zzcjx.zzm().zzb;
                    if (intValue > 0) {
                        int zzu = zzcjo.zzu();
                        if (zzu < zzcjw.zzh) {
                            zzcma = new zzcmj(zzcjx, zzcjw);
                        } else if (zzu < zzcjw.zzb) {
                            zzcma = new zzcmg(zzcjx, zzcjw);
                        } else {
                            zzcma = new zzcme(zzcjx);
                        }
                    } else {
                        zzcma = new zzcmd(zzcjx);
                    }
                    new zzcls(zzcjx, zzcma, str, strArr).zzb();
                }
            } else {
                zzcls zza = zzy.zza(zzcjx);
                if (zza != null) {
                    zzcma = zza.zzb;
                } else {
                    zze.zzj("Precache must specify a source.");
                    return;
                }
            }
            Integer zzb5 = zzb(map2, "minBufferMs");
            if (zzb5 != null) {
                zzcma.zzp(zzb5.intValue());
            }
            Integer zzb6 = zzb(map2, "maxBufferMs");
            if (zzb6 != null) {
                zzcma.zzo(zzb6.intValue());
            }
            Integer zzb7 = zzb(map2, "bufferForPlaybackMs");
            if (zzb7 != null) {
                zzcma.zzh(zzb7.intValue());
            }
            Integer zzb8 = zzb(map2, "bufferForPlaybackAfterRebufferMs");
            if (zzb8 != null) {
                zzcma.zzn(zzb8.intValue());
            }
        } else if (!zzy.zzd(zzcjx)) {
            zze.zzj("Precache abort but no precache task running.");
        }
    }
}
