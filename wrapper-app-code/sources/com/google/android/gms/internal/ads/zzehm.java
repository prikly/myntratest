package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzehm extends zzcbm {
    private final Context zza;
    private final Executor zzb;
    private final zzgfc zzc;
    private final zzeie zzd;
    private final zzcvb zze;
    private final ArrayDeque zzf;
    private final zzfoy zzg;
    private final zzccn zzh;
    private final zzeib zzi;

    public zzehm(Context context, Executor executor, zzgfc zzgfc, zzccn zzccn, zzcvb zzcvb, zzeie zzeie, ArrayDeque arrayDeque, zzeib zzeib, zzfoy zzfoy, byte[] bArr) {
        zzbjj.zzc(context);
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzgfc;
        this.zzh = zzccn;
        this.zzd = zzeie;
        this.zze = zzcvb;
        this.zzf = arrayDeque;
        this.zzi = zzeib;
        this.zzg = zzfoy;
    }

    private final synchronized zzehj zzk(String str) {
        Iterator it = this.zzf.iterator();
        while (it.hasNext()) {
            zzehj zzehj = (zzehj) it.next();
            if (zzehj.zzc.equals(str)) {
                it.remove();
                return zzehj;
            }
        }
        return null;
    }

    private static zzgfb zzl(zzgfb zzgfb, zzfnj zzfnj, zzbut zzbut, zzfow zzfow, zzfol zzfol) {
        zzbuj zza2 = zzbut.zza("AFMA_getAdDictionary", zzbuq.zza, zzehd.zza);
        zzfov.zzd(zzgfb, zzfol);
        zzfmo zza3 = zzfnj.zzb(zzfnd.BUILD_URL, zzgfb).zzf(zza2).zza();
        zzfov.zzc(zza3, zzfow, zzfol);
        return zza3;
    }

    private static zzgfb zzm(zzccb zzccb, zzfnj zzfnj, zzfae zzfae) {
        zzegx zzegx = new zzegx(zzfae);
        return zzfnj.zzb(zzfnd.GMS_SIGNALS, zzger.zzi(zzccb.zza)).zzf(zzegx).zze(zzegy.zza).zza();
    }

    private final synchronized void zzn(zzehj zzehj) {
        zzo();
        this.zzf.addLast(zzehj);
    }

    private final synchronized void zzo() {
        int intValue = ((Long) zzblf.zzd.zze()).intValue();
        while (this.zzf.size() >= intValue) {
            this.zzf.removeFirst();
        }
    }

    private final void zzp(zzgfb zzgfb, zzcbx zzcbx) {
        zzger.zzr(zzger.zzn(zzgfb, new zzehg(this), zzcib.zza), new zzehi(this, zzcbx), zzcib.zzf);
    }

    public final zzgfb zzb(zzccb zzccb, int i) {
        if (!((Boolean) zzblf.zza.zze()).booleanValue()) {
            return zzger.zzh(new Exception("Split request is disabled."));
        }
        zzfkz zzfkz = zzccb.zzi;
        if (zzfkz == null) {
            return zzger.zzh(new Exception("Pool configuration missing from request."));
        }
        if (zzfkz.zzc == 0 || zzfkz.zzd == 0) {
            return zzger.zzh(new Exception("Caching is disabled."));
        }
        zzbut zzb2 = zzt.zzf().zzb(this.zza, zzchu.zza(), this.zzg);
        zzfae zzq = this.zze.zzq(zzccb, i);
        zzfnj zzc2 = zzq.zzc();
        zzgfb zzm = zzm(zzccb, zzc2, zzq);
        zzfow zzd2 = zzq.zzd();
        zzfol zza2 = zzfok.zza(this.zza, 9);
        zzgfb zzl = zzl(zzm, zzc2, zzb2, zzd2, zza2);
        return zzc2.zza(zzfnd.GET_URL_AND_CACHE_KEY, zzm, zzl).zza(new zzehc(this, zzl, zzm, zzccb, zza2)).zza();
    }

    public final zzgfb zzc(zzccb zzccb, int i) {
        zzfol zzfol;
        zzfmo zzfmo;
        zzccb zzccb2 = zzccb;
        zzbut zzb2 = zzt.zzf().zzb(this.zza, zzchu.zza(), this.zzg);
        zzfae zzq = this.zze.zzq(zzccb2, i);
        zzbuj zza2 = zzb2.zza("google.afma.response.normalize", zzehl.zza, zzbuq.zzb);
        zzehj zzehj = null;
        if (!((Boolean) zzblf.zza.zze()).booleanValue()) {
            String str = zzccb2.zzj;
            if (str != null && !str.isEmpty()) {
                zze.zza("Request contained a PoolKey but split request is disabled.");
            }
        } else {
            zzehj = zzk(zzccb2.zzh);
            if (zzehj == null) {
                zze.zza("Request contained a PoolKey but no matching parameters were found.");
            }
        }
        zzehj zzehj2 = zzehj;
        if (zzehj2 == null) {
            zzfol = zzfok.zza(this.zza, 9);
        } else {
            zzfol = zzehj2.zze;
        }
        zzfol zzfol2 = zzfol;
        zzfow zzd2 = zzq.zzd();
        zzd2.zzd(zzccb2.zza.getStringArrayList("ad_types"));
        zzeid zzeid = new zzeid(zzccb2.zzg, zzd2, zzfol2);
        zzeia zzeia = new zzeia(this.zza, zzccb2.zzb.zza, this.zzh, i, (byte[]) null);
        zzfnj zzc2 = zzq.zzc();
        zzfol zza3 = zzfok.zza(this.zza, 11);
        if (zzehj2 == null) {
            zzgfb zzm = zzm(zzccb2, zzc2, zzq);
            zzgfb zzl = zzl(zzm, zzc2, zzb2, zzd2, zzfol2);
            zzfol zza4 = zzfok.zza(this.zza, 10);
            zzfmo zza5 = zzc2.zza(zzfnd.HTTP, zzl, zzm).zza(new zzeha(zzm, zzl)).zze(zzeid).zze(new zzfor(zza4)).zze(zzeia).zza();
            zzfov.zza(zza5, zzd2, zza4);
            zzfov.zzd(zza5, zza3);
            zzfmo = zzc2.zza(zzfnd.PRE_PROCESS, zzm, zzl, zza5).zza(new zzehb(zza5, zzm, zzl)).zzf(zza2).zza();
        } else {
            zzeic zzeic = new zzeic(zzehj2.zzb, zzehj2.zza);
            zzfol zza6 = zzfok.zza(this.zza, 10);
            zzfmo zza7 = zzc2.zzb(zzfnd.HTTP, zzger.zzi(zzeic)).zze(zzeid).zze(new zzfor(zza6)).zze(zzeia).zza();
            zzfov.zza(zza7, zzd2, zza6);
            zzgfb zzi2 = zzger.zzi(zzehj2);
            zzfov.zzd(zza7, zza3);
            zzfmo = zzc2.zza(zzfnd.PRE_PROCESS, zza7, zzi2).zza(new zzehf(zza7, zzi2)).zzf(zza2).zza();
        }
        zzfov.zza(zzfmo, zzd2, zza3);
        return zzfmo;
    }

    public final zzgfb zzd(zzccb zzccb, int i) {
        zzbut zzb2 = zzt.zzf().zzb(this.zza, zzchu.zza(), this.zzg);
        if (!((Boolean) zzblk.zza.zze()).booleanValue()) {
            return zzger.zzh(new Exception("Signal collection disabled."));
        }
        zzfae zzq = this.zze.zzq(zzccb, i);
        zzezp zza2 = zzq.zza();
        zzbuj zza3 = zzb2.zza("google.afma.request.getSignals", zzbuq.zza, zzbuq.zzb);
        zzfol zza4 = zzfok.zza(this.zza, 22);
        zzfmo zza5 = zzq.zzc().zzb(zzfnd.GET_SIGNALS, zzger.zzi(zzccb.zza)).zze(new zzfor(zza4)).zzf(new zzehe(zza2)).zzb(zzfnd.JS_SIGNALS).zzf(zza3).zza();
        zzfow zzd2 = zzq.zzd();
        zzd2.zzd(zzccb.zza.getStringArrayList("ad_types"));
        zzfov.zzb(zza5, zzd2, zza4);
        if (((Boolean) zzbkz.zze.zze()).booleanValue()) {
            if (((Boolean) zzbkx.zzj.zze()).booleanValue()) {
                zzeie zzeie = this.zzd;
                zzeie.getClass();
                zza5.zzc(new zzegz(zzeie), this.zzc);
            } else {
                zzeie zzeie2 = this.zzd;
                zzeie2.getClass();
                zza5.zzc(new zzegz(zzeie2), this.zzb);
            }
        }
        return zza5;
    }

    public final void zze(zzccb zzccb, zzcbx zzcbx) {
        zzp(zzb(zzccb, Binder.getCallingUid()), zzcbx);
    }

    public final void zzf(zzccb zzccb, zzcbx zzcbx) {
        zzp(zzd(zzccb, Binder.getCallingUid()), zzcbx);
    }

    public final void zzg(zzccb zzccb, zzcbx zzcbx) {
        zzgfb zzc2 = zzc(zzccb, Binder.getCallingUid());
        zzp(zzc2, zzcbx);
        if (!((Boolean) zzbkz.zzc.zze()).booleanValue()) {
            return;
        }
        if (((Boolean) zzbkx.zzj.zze()).booleanValue()) {
            zzeie zzeie = this.zzd;
            zzeie.getClass();
            zzc2.zzc(new zzegz(zzeie), this.zzc);
            return;
        }
        zzeie zzeie2 = this.zzd;
        zzeie2.getClass();
        zzc2.zzc(new zzegz(zzeie2), this.zzb);
    }

    public final void zzh(String str, zzcbx zzcbx) {
        zzp(zzi(str), zzcbx);
    }

    public final zzgfb zzi(String str) {
        if (!((Boolean) zzblf.zza.zze()).booleanValue()) {
            return zzger.zzh(new Exception("Split request is disabled."));
        }
        zzehh zzehh = new zzehh(this);
        if (zzk(str) == null) {
            return zzger.zzh(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str))));
        }
        return zzger.zzi(zzehh);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ InputStream zzj(zzgfb zzgfb, zzgfb zzgfb2, zzccb zzccb, zzfol zzfol) throws Exception {
        String zzc2 = ((zzcce) zzgfb.get()).zzc();
        String str = zzccb.zzh;
        zzn(new zzehj((zzcce) zzgfb.get(), (JSONObject) zzgfb2.get(), str, zzc2, zzfol));
        return new ByteArrayInputStream(zzc2.getBytes(zzfxr.zzc));
    }
}
