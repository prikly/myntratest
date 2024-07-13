package com.google.android.play.core.appupdate;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import com.google.android.play.core.install.InstallStateUpdatedListener;

/* compiled from: com.google.android.play:app-update@@2.0.0 */
final class zzg implements AppUpdateManager {
    private final zzr zza;
    private final zzc zzb;
    private final Context zzc;
    private final Handler zzd = new Handler(Looper.getMainLooper());

    zzg(zzr zzr, zzc zzc2, Context context) {
        this.zza = zzr;
        this.zzb = zzc2;
        this.zzc = context;
    }

    public final Task<Void> completeUpdate() {
        return this.zza.zzd(this.zzc.getPackageName());
    }

    public final Task<AppUpdateInfo> getAppUpdateInfo() {
        return this.zza.zze(this.zzc.getPackageName());
    }

    public final synchronized void registerListener(InstallStateUpdatedListener installStateUpdatedListener) {
        this.zzb.zzb(installStateUpdatedListener);
    }

    public final boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo, int i, Activity activity, int i2) throws IntentSender.SendIntentException {
        AppUpdateOptions defaultOptions = AppUpdateOptions.defaultOptions(i);
        if (activity == null) {
            return false;
        }
        return startUpdateFlowForResult(appUpdateInfo, (IntentSenderForResultStarter) new zzf(this, activity), defaultOptions, i2);
    }

    public final synchronized void unregisterListener(InstallStateUpdatedListener installStateUpdatedListener) {
        this.zzb.zzc(installStateUpdatedListener);
    }

    public final boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo, IntentSenderForResultStarter intentSenderForResultStarter, AppUpdateOptions appUpdateOptions, int i) throws IntentSender.SendIntentException {
        if (appUpdateInfo == null || intentSenderForResultStarter == null || appUpdateOptions == null || !appUpdateInfo.isUpdateTypeAllowed(appUpdateOptions) || appUpdateInfo.zzd()) {
            return false;
        }
        appUpdateInfo.zzc();
        intentSenderForResultStarter.startIntentSenderForResult(appUpdateInfo.zza(appUpdateOptions).getIntentSender(), i, (Intent) null, 0, 0, 0, (Bundle) null);
        return true;
    }
}
