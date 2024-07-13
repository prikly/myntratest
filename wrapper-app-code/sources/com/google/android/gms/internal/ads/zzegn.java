package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.zzt;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzegn {
    public zzgfb zza;
    private final zzefw zzb;
    private final zzfnj zzc;
    private final zzfjg zzd;
    private final zzchu zze;
    private final zzfoy zzf;
    private final zzfow zzg;
    private final Context zzh;
    private final zzgfc zzi;

    zzegn(zzefw zzefw, zzfnj zzfnj, zzfjg zzfjg, zzchu zzchu, zzfoy zzfoy, zzfow zzfow, Context context, zzgfc zzgfc) {
        this.zzb = zzefw;
        this.zzc = zzfnj;
        this.zzd = zzfjg;
        this.zze = zzchu;
        this.zzf = zzfoy;
        this.zzg = zzfow;
        this.zzh = context;
        this.zzi = zzgfc;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzcbj zza(zzccb zzccb, zzehy zzehy) {
        Context context = this.zzh;
        zzehy.zzc.put("Content-Type", zzehy.zze);
        zzehy.zzc.put("User-Agent", zzt.zzp().zzc(context, zzccb.zzb.zza));
        String str = zzehy.zza;
        int i = zzehy.zzb;
        Map map = zzehy.zzc;
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return new zzcbj(str, i, bundle, zzehy.zzd, zzehy.zzf, zzccb.zzd, zzccb.zzh);
    }

    public final zzgfb zzb(zzccb zzccb, JSONObject jSONObject, zzcce zzcce) {
        zzfmo zza2 = this.zzc.zzb(zzfnd.PROXY, zzger.zzm(this.zzc.zzb(zzfnd.PREPARE_HTTP_REQUEST, zzger.zzi(new zzeic(jSONObject, zzcce))).zze(new zzeid(zzccb.zzg, this.zzg, zzfok.zza(this.zzh, 9))).zza(), new zzegm(this, zzccb), this.zzi)).zzf(new zzegj(this.zzb)).zza();
        this.zza = zza2;
        return zzger.zzn(this.zzc.zzb(zzfnd.PRE_PROCESS, zza2).zze(new zzegl(jSONObject, zzcce)).zzf(zzt.zzf().zza(this.zzh, this.zze, this.zzf).zza("google.afma.response.normalize", zzehl.zza, zzbuq.zzb)).zza(), new zzegk(this), this.zzi);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzgfb zzc(InputStream inputStream) throws Exception {
        return zzger.zzi(new zzfix(new zzfiu(this.zzd), zzfiw.zza(new InputStreamReader(inputStream))));
    }
}
