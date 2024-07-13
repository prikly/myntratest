package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzcwn {
    private final String zza;
    private final zzbvc zzb;
    /* access modifiers changed from: private */
    public final Executor zzc;
    /* access modifiers changed from: private */
    public zzcws zzd;
    private final zzbqd zze = new zzcwk(this);
    private final zzbqd zzf = new zzcwm(this);

    public zzcwn(String str, zzbvc zzbvc, Executor executor) {
        this.zza = str;
        this.zzb = zzbvc;
        this.zzc = executor;
    }

    static /* bridge */ /* synthetic */ boolean zzg(zzcwn zzcwn, Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(zzcwn.zza);
    }

    public final void zzc(zzcws zzcws) {
        this.zzb.zzb("/updateActiveView", this.zze);
        this.zzb.zzb("/untrackActiveViewUnit", this.zzf);
        this.zzd = zzcws;
    }

    public final void zzd(zzcno zzcno) {
        zzcno.zzaf("/updateActiveView", this.zze);
        zzcno.zzaf("/untrackActiveViewUnit", this.zzf);
    }

    public final void zze() {
        this.zzb.zzc("/updateActiveView", this.zze);
        this.zzb.zzc("/untrackActiveViewUnit", this.zzf);
    }

    public final void zzf(zzcno zzcno) {
        zzcno.zzaw("/updateActiveView", this.zze);
        zzcno.zzaw("/untrackActiveViewUnit", this.zzf);
    }
}
