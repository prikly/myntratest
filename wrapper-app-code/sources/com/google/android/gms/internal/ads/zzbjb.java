package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public abstract class zzbjb {
    private final int zza;
    private final String zzb;
    private final Object zzc;

    /* synthetic */ zzbjb(int i, String str, Object obj, zzbja zzbja) {
        this.zza = i;
        this.zzb = str;
        this.zzc = obj;
        zzba.zza().zzd(this);
    }

    public static zzbjb zzf(int i, String str, float f2) {
        return new zzbiy(1, str, Float.valueOf(f2));
    }

    public static zzbjb zzg(int i, String str, int i2) {
        return new zzbiw(1, str, Integer.valueOf(i2));
    }

    public static zzbjb zzh(int i, String str, long j) {
        return new zzbix(1, str, Long.valueOf(j));
    }

    public static zzbjb zzi(int i, String str, Boolean bool) {
        return new zzbiv(i, str, bool);
    }

    public static zzbjb zzj(int i, String str, String str2) {
        return new zzbiz(1, str, str2);
    }

    public static zzbjb zzk(int i, String str) {
        zzbjb zzj = zzj(1, "gads:sdk_core_constants:experiment_id", (String) null);
        zzba.zza().zzc(zzj);
        return zzj;
    }

    /* access modifiers changed from: protected */
    public abstract Object zza(JSONObject jSONObject);

    public abstract Object zzb(Bundle bundle);

    /* access modifiers changed from: protected */
    public abstract Object zzc(SharedPreferences sharedPreferences);

    public abstract void zzd(SharedPreferences.Editor editor, Object obj);

    public final int zze() {
        return this.zza;
    }

    public final Object zzl() {
        return zzba.zzc().zzb(this);
    }

    public final Object zzm() {
        return this.zzc;
    }

    public final String zzn() {
        return this.zzb;
    }
}
