package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzaka;
import com.google.android.gms.internal.ads.zzake;
import com.google.android.gms.internal.ads.zzakk;
import com.google.android.gms.internal.ads.zzalb;
import com.google.android.gms.internal.ads.zzchn;
import com.google.android.gms.internal.ads.zzcig;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbn extends zzake {
    private final zzcig zza;
    private final zzchn zzb;

    public zzbn(String str, Map map, zzcig zzcig) {
        super(0, str, new zzbm(zzcig));
        this.zza = zzcig;
        zzchn zzchn = new zzchn((String) null);
        this.zzb = zzchn;
        zzchn.zzd(str, "GET", (Map) null, (byte[]) null);
    }

    /* access modifiers changed from: protected */
    public final zzakk zzh(zzaka zzaka) {
        return zzakk.zzb(zzaka, zzalb.zzb(zzaka));
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void zzo(Object obj) {
        zzaka zzaka = (zzaka) obj;
        this.zzb.zzf(zzaka.zzc, zzaka.zza);
        zzchn zzchn = this.zzb;
        byte[] bArr = zzaka.zzb;
        if (zzchn.zzl() && bArr != null) {
            zzchn.zzh(bArr);
        }
        this.zza.zzd(zzaka);
    }
}
