package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzcxc implements zzbbx {
    private zzcno zza;
    private final Executor zzb;
    private final zzcwo zzc;
    private final Clock zzd;
    private boolean zze = false;
    private boolean zzf = false;
    private final zzcwr zzg = new zzcwr();

    public zzcxc(Executor executor, zzcwo zzcwo, Clock clock) {
        this.zzb = executor;
        this.zzc = zzcwo;
        this.zzd = clock;
    }

    private final void zzg() {
        try {
            JSONObject zza2 = this.zzc.zzb(this.zzg);
            if (this.zza != null) {
                this.zzb.execute(new zzcxb(this, zza2));
            }
        } catch (JSONException e2) {
            zze.zzb("Failed to call video active view js", e2);
        }
    }

    public final void zza() {
        this.zze = false;
    }

    public final void zzb() {
        this.zze = true;
        zzg();
    }

    public final void zzc(zzbbw zzbbw) {
        boolean z;
        zzcwr zzcwr = this.zzg;
        if (this.zzf) {
            z = false;
        } else {
            z = zzbbw.zzj;
        }
        zzcwr.zza = z;
        zzcwr.zzd = this.zzd.elapsedRealtime();
        this.zzg.zzf = zzbbw;
        if (this.zze) {
            zzg();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(JSONObject jSONObject) {
        this.zza.zzl("AFMA_updateActiveView", jSONObject);
    }

    public final void zze(boolean z) {
        this.zzf = z;
    }

    public final void zzf(zzcno zzcno) {
        this.zza = zzcno;
    }
}
