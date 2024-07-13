package com.google.android.play.core.appupdate;

import android.app.Activity;
import android.content.IntentSender;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.install.InstallStateUpdatedListener;

/* compiled from: com.google.android.play:app-update@@2.0.0 */
public interface AppUpdateManager {
    Task<Void> completeUpdate();

    Task<AppUpdateInfo> getAppUpdateInfo();

    void registerListener(InstallStateUpdatedListener installStateUpdatedListener);

    boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo, int i, Activity activity, int i2) throws IntentSender.SendIntentException;

    void unregisterListener(InstallStateUpdatedListener installStateUpdatedListener);
}
