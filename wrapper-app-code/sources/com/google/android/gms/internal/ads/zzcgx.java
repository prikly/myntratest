package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzcgx {
    /* access modifiers changed from: private */
    public final Object zza = new Object();
    private final zzj zzb = new zzj();
    private final zzchb zzc = new zzchb(zzay.zzd(), this.zzb);
    private boolean zzd = false;
    /* access modifiers changed from: private */
    public Context zze;
    /* access modifiers changed from: private */
    public zzchu zzf;
    private String zzg;
    /* access modifiers changed from: private */
    public zzbjo zzh = null;
    private Boolean zzi = null;
    private final AtomicInteger zzj = new AtomicInteger(0);
    private final zzcgw zzk = new zzcgw((zzcgv) null);
    private final Object zzl = new Object();
    private zzgfb zzm;
    /* access modifiers changed from: private */
    public final AtomicBoolean zzn = new AtomicBoolean();

    public final int zza() {
        return this.zzj.get();
    }

    public final Context zzc() {
        return this.zze;
    }

    public final Resources zzd() {
        if (this.zzf.zzd) {
            return this.zze.getResources();
        }
        try {
            if (((Boolean) zzba.zzc().zzb(zzbjj.zziY)).booleanValue()) {
                return zzchs.zza(this.zze).getResources();
            }
            zzchs.zza(this.zze).getResources();
            return null;
        } catch (zzchr e2) {
            zze.zzk("Cannot load resource from dynamite apk or local jar", e2);
            return null;
        }
    }

    public final zzbjo zzf() {
        zzbjo zzbjo;
        synchronized (this.zza) {
            zzbjo = this.zzh;
        }
        return zzbjo;
    }

    public final zzchb zzg() {
        return this.zzc;
    }

    public final zzg zzh() {
        zzj zzj2;
        synchronized (this.zza) {
            zzj2 = this.zzb;
        }
        return zzj2;
    }

    public final zzgfb zzj() {
        if (this.zze != null) {
            if (!((Boolean) zzba.zzc().zzb(zzbjj.zzco)).booleanValue()) {
                synchronized (this.zzl) {
                    zzgfb zzgfb = this.zzm;
                    if (zzgfb != null) {
                        return zzgfb;
                    }
                    zzgfb zzb2 = zzcib.zza.zzb(new zzcgs(this));
                    this.zzm = zzb2;
                    return zzb2;
                }
            }
        }
        return zzger.zzi(new ArrayList());
    }

    public final Boolean zzk() {
        Boolean bool;
        synchronized (this.zza) {
            bool = this.zzi;
        }
        return bool;
    }

    public final String zzm() {
        return this.zzg;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ArrayList zzn() throws Exception {
        Context zza2 = zzccp.zza(this.zze);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo packageInfo = Wrappers.packageManager(zza2).getPackageInfo(zza2.getApplicationInfo().packageName, 4096);
            if (!(packageInfo.requestedPermissions == null || packageInfo.requestedPermissionsFlags == null)) {
                for (int i = 0; i < packageInfo.requestedPermissions.length; i++) {
                    if ((packageInfo.requestedPermissionsFlags[i] & 2) != 0) {
                        arrayList.add(packageInfo.requestedPermissions[i]);
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    public final void zzp() {
        this.zzk.zza();
    }

    public final void zzq() {
        this.zzj.decrementAndGet();
    }

    public final void zzr() {
        this.zzj.incrementAndGet();
    }

    public final void zzs(Context context, zzchu zzchu) {
        zzbjo zzbjo;
        synchronized (this.zza) {
            if (!this.zzd) {
                this.zze = context.getApplicationContext();
                this.zzf = zzchu;
                zzt.zzb().zzc(this.zzc);
                this.zzb.zzr(this.zze);
                zzcat.zzb(this.zze, this.zzf);
                zzt.zze();
                if (!((Boolean) zzbkt.zzc.zze()).booleanValue()) {
                    zze.zza("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                    zzbjo = null;
                } else {
                    zzbjo = new zzbjo();
                }
                this.zzh = zzbjo;
                if (zzbjo != null) {
                    zzcie.zza(new zzcgt(this).zzb(), "AppState.registerCsiReporter");
                }
                if (PlatformVersion.isAtLeastO()) {
                    if (((Boolean) zzba.zzc().zzb(zzbjj.zzhD)).booleanValue()) {
                        ((ConnectivityManager) context.getSystemService("connectivity")).registerDefaultNetworkCallback(new zzcgu(this));
                    }
                }
                this.zzd = true;
                zzj();
            }
        }
        zzt.zzp().zzc(context, zzchu.zza);
    }

    public final void zzt(Throwable th, String str) {
        zzcat.zzb(this.zze, this.zzf).zzg(th, str, ((Double) zzblh.zzg.zze()).floatValue());
    }

    public final void zzu(Throwable th, String str) {
        zzcat.zzb(this.zze, this.zzf).zzf(th, str);
    }

    public final void zzv(Boolean bool) {
        synchronized (this.zza) {
            this.zzi = bool;
        }
    }

    public final void zzw(String str) {
        this.zzg = str;
    }

    public final boolean zzx(Context context) {
        if (PlatformVersion.isAtLeastO()) {
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzhD)).booleanValue()) {
                return this.zzn.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
