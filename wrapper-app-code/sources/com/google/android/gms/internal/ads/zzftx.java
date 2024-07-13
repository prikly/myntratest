package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.facebook.ads.AdError;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzftx {
    private static final HashMap zza = new HashMap();
    private final Context zzb;
    private final zzfty zzc;
    private final zzfrz zzd;
    private final zzfru zze;
    private zzftm zzf;
    private final Object zzg = new Object();

    public zzftx(Context context, zzfty zzfty, zzfrz zzfrz, zzfru zzfru) {
        this.zzb = context;
        this.zzc = zzfty;
        this.zzd = zzfrz;
        this.zze = zzfru;
    }

    private final synchronized Class zzd(zzftn zzftn) throws zzftw {
        String zzk = zzftn.zza().zzk();
        Class cls = (Class) zza.get(zzk);
        if (cls != null) {
            return cls;
        }
        try {
            if (this.zze.zza(zzftn.zzc())) {
                File zzb2 = zzftn.zzb();
                if (!zzb2.exists()) {
                    zzb2.mkdirs();
                }
                Class loadClass = new DexClassLoader(zzftn.zzc().getAbsolutePath(), zzb2.getAbsolutePath(), (String) null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                zza.put(zzk, loadClass);
                return loadClass;
            }
            throw new zzftw(2026, "VM did not pass signature verification");
        } catch (GeneralSecurityException e2) {
            throw new zzftw(2026, (Throwable) e2);
        } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e3) {
            throw new zzftw((int) AdError.REMOTE_ADS_SERVICE_ERROR, e3);
        }
    }

    public final zzfsc zza() {
        zzftm zzftm;
        synchronized (this.zzg) {
            zzftm = this.zzf;
        }
        return zzftm;
    }

    public final zzftn zzb() {
        synchronized (this.zzg) {
            zzftm zzftm = this.zzf;
            if (zzftm == null) {
                return null;
            }
            zzftn zzf2 = zzftm.zzf();
            return zzf2;
        }
    }

    public final boolean zzc(zzftn zzftn) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Class zzd2 = zzd(zzftn);
            zzftm zzftm = new zzftm(zzd2.getDeclaredConstructor(new Class[]{Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE}).newInstance(new Object[]{this.zzb, "msa-r", zzftn.zze(), null, new Bundle(), 2}), zzftn, this.zzc, this.zzd);
            if (zzftm.zzh()) {
                int zze2 = zzftm.zze();
                if (zze2 == 0) {
                    synchronized (this.zzg) {
                        zzftm zzftm2 = this.zzf;
                        if (zzftm2 != null) {
                            try {
                                zzftm2.zzg();
                            } catch (zzftw e2) {
                                this.zzd.zzc(e2.zza(), -1, e2);
                            }
                        }
                        this.zzf = zzftm;
                    }
                    this.zzd.zzd(3000, System.currentTimeMillis() - currentTimeMillis);
                    return true;
                }
                throw new zzftw(4001, "ci: " + zze2);
            }
            throw new zzftw((int) TTAdSdk.INIT_LOCAL_FAIL_CODE, "init failed");
        } catch (Exception e3) {
            throw new zzftw(2004, (Throwable) e3);
        } catch (zzftw e4) {
            this.zzd.zzc(e4.zza(), System.currentTimeMillis() - currentTimeMillis, e4);
            return false;
        } catch (Exception e5) {
            this.zzd.zzc(4010, System.currentTimeMillis() - currentTimeMillis, e5);
            return false;
        }
    }
}
