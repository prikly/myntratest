package com.google.android.gms.ads.internal.client;

import com.google.android.gms.internal.ads.zzbok;
import com.google.android.gms.internal.ads.zzbol;
import com.google.android.gms.internal.ads.zzbzn;
import com.google.android.gms.internal.ads.zzcdw;
import com.google.android.gms.internal.ads.zzchh;
import com.google.android.gms.internal.ads.zzchu;
import java.util.Random;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzay {
    private static final zzay zza = new zzay();
    private final zzchh zzb;
    private final zzaw zzc;
    private final String zzd;
    private final zzchu zze;
    private final Random zzf;

    protected zzay() {
        zzchh zzchh = new zzchh();
        zzaw zzaw = new zzaw(new zzk(), new zzi(), new zzeq(), new zzbok(), new zzcdw(), new zzbzn(), new zzbol());
        String zzd2 = zzchh.zzd();
        zzchu zzchu = new zzchu(0, 224400000, true, false, false);
        Random random = new Random();
        this.zzb = zzchh;
        this.zzc = zzaw;
        this.zzd = zzd2;
        this.zze = zzchu;
        this.zzf = random;
    }

    public static zzaw zza() {
        return zza.zzc;
    }

    public static zzchh zzb() {
        return zza.zzb;
    }

    public static zzchu zzc() {
        return zza.zze;
    }

    public static String zzd() {
        return zza.zzd;
    }

    public static Random zze() {
        return zza.zzf;
    }
}
