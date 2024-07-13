package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfrp extends zzfrl {
    public zzfrp(zzfre zzfre, HashSet hashSet, JSONObject jSONObject, long j, byte[] bArr) {
        super(zzfre, hashSet, jSONObject, j, (byte[]) null);
    }

    private final void zzc(String str) {
        zzfqi zza = zzfqi.zza();
        if (zza != null) {
            for (zzfpx zzfpx : zza.zzc()) {
                if (this.zza.contains(zzfpx.zzh())) {
                    zzfpx.zzg().zzd(str, this.zzc);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.zzb.toString();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzc(str);
        super.onPostExecute(str);
    }

    /* access modifiers changed from: protected */
    public final void zza(String str) {
        zzc(str);
        super.onPostExecute(str);
    }
}
