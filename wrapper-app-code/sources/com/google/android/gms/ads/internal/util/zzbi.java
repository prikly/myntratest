package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzajm;
import com.google.android.gms.internal.ads.zzaki;
import com.google.android.gms.internal.ads.zzakj;
import com.google.android.gms.internal.ads.zzalj;
import com.google.android.gms.internal.ads.zzchn;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzbi extends zzalj {
    final /* synthetic */ byte[] zza;
    final /* synthetic */ Map zzb;
    final /* synthetic */ zzchn zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzbi(zzbo zzbo, int i, String str, zzakj zzakj, zzaki zzaki, byte[] bArr, Map map, zzchn zzchn) {
        super(i, str, zzakj, zzaki);
        this.zza = bArr;
        this.zzb = map;
        this.zzc = zzchn;
    }

    public final Map zzl() throws zzajm {
        Map map = this.zzb;
        return map == null ? Collections.emptyMap() : map;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void zzo(Object obj) {
        zzo((String) obj);
    }

    public final byte[] zzx() throws zzajm {
        byte[] bArr = this.zza;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    /* access modifiers changed from: protected */
    public final void zzz(String str) {
        this.zzc.zzg(str);
        super.zzo(str);
    }
}
