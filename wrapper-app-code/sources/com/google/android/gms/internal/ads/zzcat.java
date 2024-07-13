package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.wrappers.Wrappers;
import com.onesignal.outcomes.OSOutcomeConstants;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzcat implements zzcav {
    static zzcav zza = null;
    static zzcav zzb = null;
    private static final Object zzc = new Object();
    private final Object zzd = new Object();
    private final Context zze;
    private final WeakHashMap zzf = new WeakHashMap();
    private final ExecutorService zzg;
    private final zzchu zzh;

    protected zzcat(Context context, zzchu zzchu) {
        zzfva.zza();
        this.zzg = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        this.zze = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzh = zzchu;
    }

    public static zzcav zza(Context context) {
        synchronized (zzc) {
            if (zza == null) {
                if (((Boolean) zzblh.zze.zze()).booleanValue()) {
                    if (!((Boolean) zzba.zzc().zzb(zzbjj.zzgX)).booleanValue()) {
                        zza = new zzcat(context, zzchu.zza());
                    }
                }
                zza = new zzcau();
            }
        }
        return zza;
    }

    public static zzcav zzb(Context context, zzchu zzchu) {
        synchronized (zzc) {
            if (zzb == null) {
                if (((Boolean) zzblh.zze.zze()).booleanValue()) {
                    if (!((Boolean) zzba.zzc().zzb(zzbjj.zzgX)).booleanValue()) {
                        zzcat zzcat = new zzcat(context, zzchu);
                        Thread thread = Looper.getMainLooper().getThread();
                        if (thread != null) {
                            synchronized (zzcat.zzd) {
                                zzcat.zzf.put(thread, true);
                            }
                            thread.setUncaughtExceptionHandler(new zzcas(zzcat, thread.getUncaughtExceptionHandler()));
                        }
                        Thread.setDefaultUncaughtExceptionHandler(new zzcar(zzcat, Thread.getDefaultUncaughtExceptionHandler()));
                        zzb = zzcat;
                    }
                }
                zzb = new zzcau();
            }
        }
        return zzb;
    }

    public static String zzc(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String zzd(Throwable th) {
        return zzfyt.zzc(zzchh.zzf(zzc(th)));
    }

    /* access modifiers changed from: protected */
    public final void zze(Thread thread, Throwable th) {
        if (th != null) {
            boolean z = false;
            boolean z2 = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    z |= zzchh.zzp(stackTraceElement.getClassName());
                    z2 |= getClass().getName().equals(stackTraceElement.getClassName());
                }
            }
            if (z && !z2) {
                zzg(th, "", 1.0f);
            }
        }
    }

    public final void zzf(Throwable th, String str) {
        zzg(th, str, 1.0f);
    }

    public final void zzg(Throwable th, String str, float f2) {
        boolean z;
        String str2;
        if (zzchh.zzg(th) != null) {
            String name = th.getClass().getName();
            String zzc2 = zzc(th);
            String zzd2 = ((Boolean) zzba.zzc().zzb(zzbjj.zzhT)).booleanValue() ? zzd(th) : "";
            double d2 = (double) f2;
            double random = Math.random();
            int i = f2 > 0.0f ? (int) (1.0f / f2) : 1;
            if (random < d2) {
                ArrayList<String> arrayList = new ArrayList<>();
                try {
                    z = Wrappers.packageManager(this.zze).isCallerInstantApp();
                } catch (Throwable th2) {
                    zzcho.zzh("Error fetching instant app info", th2);
                    z = false;
                }
                try {
                    str2 = this.zze.getPackageName();
                } catch (Throwable unused) {
                    zzcho.zzj("Cannot obtain package name, proceeding.");
                    str2 = DtbDeviceDataRetriever.ORIENTATION_UNKNOWN;
                }
                Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter(OSOutcomeConstants.OUTCOME_ID, "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
                String str3 = Build.MANUFACTURER;
                String str4 = Build.MODEL;
                if (!str4.startsWith(str3)) {
                    str4 = str3 + " " + str4;
                }
                Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("device", str4).appendQueryParameter("js", this.zzh.zza).appendQueryParameter("appid", str2).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", zzc2).appendQueryParameter("eids", TextUtils.join(",", zzbjj.zza())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "496518605").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(zzblh.zzc.zze())).appendQueryParameter("gmscv", String.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zze))).appendQueryParameter("lite", true != this.zzh.zze ? BuildConfig.ADAPTER_VERSION : "1");
                if (!TextUtils.isEmpty(zzd2)) {
                    appendQueryParameter2.appendQueryParameter("hash", zzd2);
                }
                arrayList.add(appendQueryParameter2.toString());
                for (String zzcaq : arrayList) {
                    this.zzg.execute(new zzcaq(new zzcht((String) null), zzcaq));
                }
            }
        }
    }
}
