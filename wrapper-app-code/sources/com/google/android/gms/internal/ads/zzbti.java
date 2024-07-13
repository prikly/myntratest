package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbti implements zzbsy, zzbta {
    private final zzcno zza;

    public zzbti(Context context, zzchu zzchu, zzapj zzapj, zza zza2) throws zzcnz {
        zzt.zzz();
        zzcno zza3 = zzcoa.zza(context, zzcpd.zza(), "", false, false, (zzapj) null, (zzbki) null, zzchu, (zzbjy) null, (zzl) null, (zza) null, zzbew.zza(), (zzfil) null, (zzfio) null);
        this.zza = zza3;
        ((View) zza3).setWillNotDraw(true);
    }

    private static final void zzs(Runnable runnable) {
        zzay.zzb();
        if (zzchh.zzv()) {
            runnable.run();
        } else {
            zzs.zza.post(runnable);
        }
    }

    public final void zza(String str) {
        zzs(new zzbtd(this, str));
    }

    public final /* synthetic */ void zzb(String str, String str2) {
        zzbsx.zzc(this, str, str2);
    }

    public final void zzc() {
        this.zza.destroy();
    }

    public final /* synthetic */ void zzd(String str, Map map) {
        zzbsx.zza(this, str, map);
    }

    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        zzbsx.zzb(this, str, jSONObject);
    }

    public final void zzf(String str) {
        zzs(new zzbte(this, str));
    }

    public final void zzg(String str) {
        zzs(new zzbtg(this, str));
    }

    public final void zzh(String str) {
        zzs(new zzbtf(this, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[]{str})));
    }

    public final boolean zzi() {
        return this.zza.zzaB();
    }

    public final zzbuh zzj() {
        return new zzbuh(this);
    }

    public final void zzk(zzbto zzbto) {
        this.zza.zzP().zzG(new zzbtb(zzbto, (byte[]) null));
    }

    public final /* synthetic */ void zzl(String str, JSONObject jSONObject) {
        zzbsx.zzd(this, str, jSONObject);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzm(String str) {
        this.zza.zza(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzn(String str) {
        this.zza.loadData(str, "text/html", "UTF-8");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(String str) {
        this.zza.loadUrl(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(String str) {
        this.zza.loadData(str, "text/html", "UTF-8");
    }

    public final void zzq(String str, zzbqd zzbqd) {
        this.zza.zzaf(str, new zzbth(this, zzbqd));
    }

    public final void zzr(String str, zzbqd zzbqd) {
        this.zza.zzax(str, new zzbtc(zzbqd));
    }
}
