package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzcvo implements zzcve {
    private final Context zza;
    private final zzg zzb = zzt.zzo().zzh();

    public zzcvo(Context context) {
        this.zza = context;
    }

    public final void zza(Map map) {
        if (!map.isEmpty()) {
            String str = (String) map.get("gad_idless");
            if (str != null) {
                boolean parseBoolean = Boolean.parseBoolean(str);
                map.remove("gad_idless");
                if (parseBoolean) {
                    try {
                        if (((Boolean) zzba.zzc().zzb(zzbjj.zzcx)).booleanValue()) {
                            zzfvf.zzj(this.zza).zzk();
                        }
                        if (((Boolean) zzba.zzc().zzb(zzbjj.zzcG)).booleanValue()) {
                            zzfvf.zzj(this.zza).zzl();
                        }
                        if (((Boolean) zzba.zzc().zzb(zzbjj.zzcy)).booleanValue()) {
                            zzfvg.zzi(this.zza).zzj();
                            if (((Boolean) zzba.zzc().zzb(zzbjj.zzcC)).booleanValue()) {
                                zzfvg.zzi(this.zza).zzk();
                            }
                            if (((Boolean) zzba.zzc().zzb(zzbjj.zzcD)).booleanValue()) {
                                zzfvg.zzi(this.zza).zzl();
                            }
                        }
                    } catch (IOException e2) {
                        zzt.zzo().zzu(e2, "SetAppMeasurementConsentConfig.run");
                    }
                }
                if (((Boolean) zzba.zzc().zzb(zzbjj.zzar)).booleanValue()) {
                    this.zzb.zzH(parseBoolean);
                    if (((Boolean) zzba.zzc().zzb(zzbjj.zzfE)).booleanValue() && parseBoolean) {
                        this.zza.deleteDatabase("OfflineUpload.db");
                    }
                }
            }
            Bundle bundle = new Bundle();
            for (Map.Entry entry : map.entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzam)).booleanValue()) {
                zzt.zzn().zzr(bundle);
            }
        }
    }
}
