package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzarw {
    protected static final String zza = zzarw.class.getSimpleName();
    private final zzaqj zzb;
    private final String zzc;
    private final String zzd;
    private volatile Method zze = null;
    private final Class[] zzf;
    private final CountDownLatch zzg = new CountDownLatch(1);

    public zzarw(zzaqj zzaqj, String str, String str2, Class... clsArr) {
        this.zzb = zzaqj;
        this.zzc = str;
        this.zzd = str2;
        this.zzf = clsArr;
        zzaqj.zzk().submit(new zzarv(this));
    }

    static /* bridge */ /* synthetic */ void zzb(zzarw zzarw) {
        CountDownLatch countDownLatch;
        try {
            zzaqj zzaqj = zzarw.zzb;
            Class loadClass = zzaqj.zzi().loadClass(zzarw.zzc(zzaqj.zzu(), zzarw.zzc));
            if (loadClass == null) {
                countDownLatch = zzarw.zzg;
            } else {
                zzarw.zze = loadClass.getMethod(zzarw.zzc(zzarw.zzb.zzu(), zzarw.zzd), zzarw.zzf);
                if (zzarw.zze == null) {
                    countDownLatch = zzarw.zzg;
                }
                countDownLatch = zzarw.zzg;
            }
        } catch (zzapo | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException unused) {
        } catch (NullPointerException unused2) {
            countDownLatch = zzarw.zzg;
        } catch (Throwable th) {
            zzarw.zzg.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }

    private final String zzc(byte[] bArr, String str) throws zzapo, UnsupportedEncodingException {
        return new String(this.zzb.zze().zzb(bArr, str), "UTF-8");
    }

    public final Method zza() {
        if (this.zze != null) {
            return this.zze;
        }
        try {
            if (!this.zzg.await(2, TimeUnit.SECONDS)) {
                return null;
            }
            return this.zze;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
