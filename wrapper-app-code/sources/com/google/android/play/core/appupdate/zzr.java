package com.google.android.play.core.appupdate;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.appupdate.internal.zzab;
import com.google.android.play.core.appupdate.internal.zzi;
import com.google.android.play.core.appupdate.internal.zzm;
import com.google.android.play.core.appupdate.internal.zzs;
import com.google.android.play.core.appupdate.internal.zzx;
import com.google.android.play.core.appupdate.internal.zzz;
import com.google.android.play.core.install.InstallException;

/* compiled from: com.google.android.play:app-update@@2.0.0 */
final class zzr {
    /* access modifiers changed from: private */
    public static final zzm zzb = new zzm("AppUpdateService");
    private static final Intent zzc = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");
    zzx zza;
    /* access modifiers changed from: private */
    public final String zzd;
    private final Context zze;
    private final zzt zzf;

    zzr(Context context, zzt zzt) {
        this.zzd = context.getPackageName();
        this.zze = context;
        this.zzf = zzt;
        if (zzab.zza(context)) {
            this.zza = new zzx(zzz.zza(context), zzb, "AppUpdateService", zzc, zzl.zza, (zzs) null, (byte[]) null);
        }
    }

    static /* bridge */ /* synthetic */ Bundle zzb(zzr zzr, String str) {
        Integer num;
        Bundle bundle = new Bundle();
        bundle.putAll(zzi());
        bundle.putString("package.name", str);
        try {
            num = Integer.valueOf(zzr.zze.getPackageManager().getPackageInfo(zzr.zze.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            zzb.zzb("The current version of the app could not be retrieved", new Object[0]);
            num = null;
        }
        if (num != null) {
            bundle.putInt("app.version.code", num.intValue());
        }
        return bundle;
    }

    static /* bridge */ /* synthetic */ AppUpdateInfo zzf(zzr zzr, Bundle bundle, String str) {
        Integer num;
        Bundle bundle2 = bundle;
        int i = bundle2.getInt("version.code", -1);
        int i2 = bundle2.getInt("update.availability");
        int i3 = bundle2.getInt("install.status", 0);
        if (bundle2.getInt("client.version.staleness", -1) == -1) {
            num = null;
        } else {
            num = Integer.valueOf(bundle2.getInt("client.version.staleness"));
        }
        return AppUpdateInfo.zzb(str, i, i2, i3, num, bundle2.getInt("in.app.update.priority", 0), bundle2.getLong("bytes.downloaded"), bundle2.getLong("total.bytes.to.download"), bundle2.getLong("additional.size.required"), zzr.zzf.zza(), (PendingIntent) bundle2.getParcelable("blocking.intent"), (PendingIntent) bundle2.getParcelable("nonblocking.intent"), (PendingIntent) bundle2.getParcelable("blocking.destructive.intent"), (PendingIntent) bundle2.getParcelable("nonblocking.destructive.intent"));
    }

    /* access modifiers changed from: private */
    public static Bundle zzi() {
        Bundle bundle = new Bundle();
        bundle.putAll(zzi.zza("app_update"));
        bundle.putInt("playcore.version.code", 11004);
        return bundle;
    }

    private static Task zzj() {
        zzb.zzb("onError(%d)", -9);
        return Tasks.forException(new InstallException(-9));
    }

    public final Task zzd(String str) {
        if (this.zza == null) {
            return zzj();
        }
        zzb.zzd("completeUpdate(%s)", str);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zza.zzp(new zzn(this, taskCompletionSource, taskCompletionSource, str), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task zze(String str) {
        if (this.zza == null) {
            return zzj();
        }
        zzb.zzd("requestUpdateInfo(%s)", str);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zza.zzp(new zzm(this, taskCompletionSource, str, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
