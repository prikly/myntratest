package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public abstract class zzfrl extends zzfrm {
    protected final HashSet zza;
    protected final JSONObject zzb;
    protected final long zzc;

    public zzfrl(zzfre zzfre, HashSet hashSet, JSONObject jSONObject, long j, byte[] bArr) {
        super(zzfre, (byte[]) null);
        this.zza = new HashSet(hashSet);
        this.zzb = jSONObject;
        this.zzc = j;
    }
}
