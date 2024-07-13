package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final /* synthetic */ class zzchi implements zzchm {
    public final /* synthetic */ int zza;
    public final /* synthetic */ Map zzb;

    public /* synthetic */ zzchi(int i, Map map) {
        this.zza = i;
        this.zzb = map;
    }

    public final void zza(JsonWriter jsonWriter) {
        zzchn.zzb(this.zza, this.zzb, jsonWriter);
    }
}
