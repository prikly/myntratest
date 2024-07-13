package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzd;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zzac;
import com.google.android.gms.ads.nonagon.signalgeneration.zzc;
import com.google.android.gms.ads.nonagon.signalgeneration.zzg;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public abstract class zzcpj implements zzcvb {
    private static zzcpj zza;

    private static synchronized zzcpj zzD(Context context, zzbvt zzbvt, int i, boolean z, int i2, zzcqm zzcqm) {
        synchronized (zzcpj.class) {
            zzcpj zzcpj = zza;
            if (zzcpj != null) {
                return zzcpj;
            }
            zzbjj.zzc(context);
            zzfjz zzd = zzfjz.zzd(context);
            zzchu zzc = zzd.zzc(224400000, false, i2);
            zzd.zze(zzbvt);
            zzcsg zzcsg = new zzcsg((zzcsf) null);
            zzcpk zzcpk = new zzcpk();
            zzcpk.zzd(zzc);
            zzcpk.zzc(context);
            zzcsg.zzb(new zzcpm(zzcpk, (zzcpl) null));
            zzcsg.zzc(new zzctt(zzcqm, (byte[]) null));
            zzcpj zza2 = zzcsg.zza();
            zzt.zzo().zzs(context, zzc);
            zzt.zzc().zzi(context);
            zzt.zzp().zzj(context);
            zzt.zzp().zzi(context);
            zzd.zza(context);
            zzt.zzb().zzd(context);
            zzt.zzv().zzb(context);
            zzcfu.zzd(context);
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzfE)).booleanValue()) {
                if (!((Boolean) zzba.zzc().zzb(zzbjj.zzas)).booleanValue()) {
                    zzbew zzbew = new zzbew(new zzbfc(context));
                    zzeiy zzeiy = new zzeiy(new zzeiu(context), zza2.zzA());
                    zzt.zzp();
                    new zzeju(context, zzc, zzbew, zzeiy, UUID.randomUUID().toString(), zza2.zzy()).zzb(zzt.zzo().zzh().zzP());
                }
            }
            zza = zza2;
            return zza2;
        }
    }

    public static zzcpj zza(Context context, zzbvt zzbvt, int i) {
        return zzD(context, zzbvt, 224400000, false, i, new zzcqm());
    }

    public abstract zzgfc zzA();

    public abstract Executor zzB();

    public abstract ScheduledExecutorService zzC();

    public abstract zzcue zzb();

    public abstract zzcxm zzc();

    public abstract zzcxx zzd();

    public abstract zzczh zze();

    public abstract zzdhc zzf();

    public abstract zzdnv zzg();

    public abstract zzdor zzh();

    public abstract zzdvx zzi();

    public abstract zzeap zzj();

    public abstract zzece zzk();

    public abstract zzecy zzl();

    public abstract zzekk zzm();

    public abstract zzc zzn();

    public abstract zzg zzo();

    public abstract zzac zzp();

    public final zzfae zzq(zzccb zzccb, int i) {
        return zzr(new zzfcg(zzccb, i));
    }

    /* access modifiers changed from: protected */
    public abstract zzfae zzr(zzfcg zzfcg);

    public abstract zzfdj zzs();

    public abstract zzfex zzt();

    public abstract zzfgq zzu();

    public abstract zzfie zzv();

    public abstract zzfjs zzw();

    public abstract zzfkc zzx();

    public abstract zzfnt zzy();

    public abstract zzfoy zzz();
}
