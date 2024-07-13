package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbry implements zzajx {
    /* access modifiers changed from: private */
    public volatile zzbrl zza;
    private final Context zzb;

    public zzbry(Context context) {
        this.zzb = context;
    }

    static /* bridge */ /* synthetic */ void zzc(zzbry zzbry) {
        if (zzbry.zza != null) {
            zzbry.zza.disconnect();
            Binder.flushPendingCommands();
        }
    }

    public final zzaka zza(zzake zzake) throws zzakn {
        Parcelable.Creator<zzbrm> creator = zzbrm.CREATOR;
        Map zzl = zzake.zzl();
        int size = zzl.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        int i2 = 0;
        for (Map.Entry entry : zzl.entrySet()) {
            strArr[i2] = (String) entry.getKey();
            strArr2[i2] = (String) entry.getValue();
            i2++;
        }
        zzbrm zzbrm = new zzbrm(zzake.zzk(), strArr, strArr2);
        long elapsedRealtime = zzt.zzB().elapsedRealtime();
        try {
            zzcig zzcig = new zzcig();
            this.zza = new zzbrl(this.zzb, zzt.zzt().zzb(), new zzbrw(this, zzcig), new zzbrx(this, zzcig));
            this.zza.checkAvailabilityAndConnect();
            zzgfb zzo = zzger.zzo(zzger.zzn(zzcig, new zzbru(this, zzbrm), zzcib.zza), (long) ((Integer) zzba.zzc().zzb(zzbjj.zzdW)).intValue(), TimeUnit.MILLISECONDS, zzcib.zzd);
            zzo.zzc(new zzbrv(this), zzcib.zza);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzo.get();
            long elapsedRealtime2 = zzt.zzB().elapsedRealtime();
            zze.zza("Http assets remote cache took " + (elapsedRealtime2 - elapsedRealtime) + "ms");
            zzbro zzbro = (zzbro) new zzcbz(parcelFileDescriptor).zza(zzbro.CREATOR);
            if (zzbro == null) {
                return null;
            }
            if (zzbro.zza) {
                throw new zzakn(zzbro.zzb);
            } else if (zzbro.zze.length != zzbro.zzf.length) {
                return null;
            } else {
                HashMap hashMap = new HashMap();
                while (true) {
                    String[] strArr3 = zzbro.zze;
                    if (i >= strArr3.length) {
                        return new zzaka(zzbro.zzc, zzbro.zzd, (Map) hashMap, zzbro.zzg, zzbro.zzh);
                    }
                    hashMap.put(strArr3[i], zzbro.zzf[i]);
                    i++;
                }
            }
        } catch (InterruptedException | ExecutionException unused) {
            long elapsedRealtime3 = zzt.zzB().elapsedRealtime();
            zze.zza("Http assets remote cache took " + (elapsedRealtime3 - elapsedRealtime) + "ms");
            return null;
        } catch (Throwable th) {
            long elapsedRealtime4 = zzt.zzB().elapsedRealtime();
            zze.zza("Http assets remote cache took " + (elapsedRealtime4 - elapsedRealtime) + "ms");
            throw th;
        }
    }
}
