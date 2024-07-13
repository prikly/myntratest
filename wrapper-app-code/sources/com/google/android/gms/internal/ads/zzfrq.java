package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfrq extends zzfrl {
    public zzfrq(zzfre zzfre, HashSet hashSet, JSONObject jSONObject, long j, byte[] bArr) {
        super(zzfre, hashSet, jSONObject, j, (byte[]) null);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (zzfqy.zzj(this.zzb, this.zzd.zza())) {
            return null;
        }
        this.zzd.zze(this.zzb);
        return this.zzb.toString();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }

    /* access modifiers changed from: protected */
    public final void zza(String str) {
        zzfqi zza;
        if (!TextUtils.isEmpty(str) && (zza = zzfqi.zza()) != null) {
            for (zzfpx zzfpx : zza.zzc()) {
                if (this.zza.contains(zzfpx.zzh())) {
                    zzfpx.zzg().zze(str, this.zzc);
                }
            }
        }
        super.onPostExecute(str);
    }
}
