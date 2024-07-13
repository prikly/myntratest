package com.appsgeyser.sdk.utils;

import android.app.Activity;
import android.content.IntentSender;
import android.graphics.Color;
import android.util.Log;
import android.view.View;
import com.appsgeyser.sdk.AppsgeyserSDK;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateManagerFactory;
import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.install.InstallStateUpdatedListener;

public final class UpdateManager {
    private static UpdateManager instance;
    private final String LOG_TAG = "UpdateManager";
    private AppUpdateManager appUpdateManager;
    private int appUpdateType = 0;
    private View rootView;
    private final InstallStateUpdatedListener updateStatusListener = new InstallStateUpdatedListener() {
        public final void onStateUpdate(Object obj) {
            UpdateManager.this.lambda$new$0$UpdateManager((InstallState) obj);
        }
    };

    public /* synthetic */ void lambda$new$0$UpdateManager(InstallState installState) {
        Log.d("UpdateManager", "onInstallStateUpdate state = " + installState);
        if (installState.installStatus() == 11) {
            showSnackBar();
        }
    }

    private UpdateManager() {
    }

    public static UpdateManager getInstance() {
        if (instance == null) {
            instance = new UpdateManager();
        }
        return instance;
    }

    public void checkForUpdate(Activity activity, View view) {
        Log.d("UpdateManager", "checkForUpdate()");
        this.rootView = view;
        AppsgeyserSDK.isInappUpdateEnabled(activity, new AppsgeyserSDK.OnInAppUpdateEnableListener(activity) {
            public final /* synthetic */ Activity f$1;

            {
                this.f$1 = r2;
            }

            public final void onInAppUpdateEnable(boolean z) {
                UpdateManager.this.lambda$checkForUpdate$1$UpdateManager(this.f$1, z);
            }
        });
    }

    public /* synthetic */ void lambda$checkForUpdate$1$UpdateManager(Activity activity, boolean z) {
        Log.d("UpdateManager", "isInappUpdateEnabled = " + z);
        if (z) {
            startUpdateChecking(activity);
        }
    }

    public void unregisterUpdateStatusListener() {
        this.rootView = null;
        AppUpdateManager appUpdateManager2 = this.appUpdateManager;
        if (appUpdateManager2 != null) {
            appUpdateManager2.unregisterListener(this.updateStatusListener);
        }
    }

    public void registerOnSuccessListener(int i) {
        AppUpdateManager appUpdateManager2 = this.appUpdateManager;
        if (appUpdateManager2 != null) {
            appUpdateManager2.getAppUpdateInfo().addOnSuccessListener(new OnSuccessListener(i) {
                public final /* synthetic */ int f$1;

                {
                    this.f$1 = r2;
                }

                public final void onSuccess(Object obj) {
                    UpdateManager.this.lambda$registerOnSuccessListener$2$UpdateManager(this.f$1, (AppUpdateInfo) obj);
                }
            });
        }
    }

    public /* synthetic */ void lambda$registerOnSuccessListener$2$UpdateManager(int i, AppUpdateInfo appUpdateInfo) {
        if (i != -1) {
            Log.w("UpdateManager", "versionCode = " + i);
        }
        logUpdateInfo(appUpdateInfo, true);
        if (appUpdateInfo.installStatus() == 11) {
            showSnackBar();
        }
    }

    private void startUpdateChecking(Activity activity) {
        AppUpdateManager create = AppUpdateManagerFactory.create(activity);
        this.appUpdateManager = create;
        create.getAppUpdateInfo().addOnSuccessListener(new OnSuccessListener(activity) {
            public final /* synthetic */ Activity f$1;

            {
                this.f$1 = r2;
            }

            public final void onSuccess(Object obj) {
                UpdateManager.this.lambda$startUpdateChecking$3$UpdateManager(this.f$1, (AppUpdateInfo) obj);
            }
        });
        this.appUpdateManager.registerListener(this.updateStatusListener);
    }

    public /* synthetic */ void lambda$startUpdateChecking$3$UpdateManager(Activity activity, AppUpdateInfo appUpdateInfo) {
        logUpdateInfo(appUpdateInfo, false);
        if (appUpdateInfo.isUpdateTypeAllowed(0) && appUpdateInfo.updateAvailability() == 2) {
            startUpdate(activity, appUpdateInfo);
        }
        if (appUpdateInfo.installStatus() == 11) {
            showSnackBar();
        }
    }

    private void startUpdate(Activity activity, AppUpdateInfo appUpdateInfo) {
        AppUpdateManager appUpdateManager2 = this.appUpdateManager;
        if (appUpdateManager2 != null) {
            try {
                appUpdateManager2.startUpdateFlowForResult(appUpdateInfo, this.appUpdateType, activity, 8);
            } catch (IntentSender.SendIntentException e2) {
                e2.printStackTrace();
                Log.e("UpdateManager", "error to start update flow result:", e2);
            }
        }
    }

    private void showSnackBar() {
        Snackbar make = Snackbar.make(this.rootView, (CharSequence) "An update has just been downloaded.", -2);
        make.setAction((CharSequence) "INSTALL", (View.OnClickListener) new View.OnClickListener() {
            public final void onClick(View view) {
                UpdateManager.this.lambda$showSnackBar$4$UpdateManager(view);
            }
        });
        make.setActionTextColor(Color.parseColor("#00bbff"));
        make.show();
    }

    public /* synthetic */ void lambda$showSnackBar$4$UpdateManager(View view) {
        completeUpdate();
    }

    private void completeUpdate() {
        if (this.appUpdateManager != null) {
            Log.d("UpdateManager", "completeUpdate");
            this.appUpdateManager.completeUpdate();
        }
    }

    private void logUpdateInfo(AppUpdateInfo appUpdateInfo, boolean z) {
        if (z) {
            Log.w("UpdateManager", " *** UPDATE INFO ***");
            Log.w("UpdateManager", "info.availableVersionCode() -> " + appUpdateInfo.availableVersionCode());
            StringBuilder sb = new StringBuilder();
            sb.append("(info.updateAvailability() == UpdateAvailability.UPDATE_AVAILABLE) -> ");
            sb.append(appUpdateInfo.updateAvailability() == 2);
            Log.w("UpdateManager", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("(info.updateAvailability() == UpdateAvailability.UPDATE_NOT_AVAILABLE) -> ");
            sb2.append(appUpdateInfo.updateAvailability() == 1);
            Log.w("UpdateManager", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("(info.updateAvailability() == UpdateAvailability.DEVELOPER_TRIGGERED_UPDATE_IN_PROGRESS) -> ");
            sb3.append(appUpdateInfo.updateAvailability() == 3);
            Log.w("UpdateManager", sb3.toString());
            Log.w("UpdateManager", "info.isUpdateTypeAllowed(AppUpdateType.FLEXIBLE) -> " + appUpdateInfo.isUpdateTypeAllowed(0));
            Log.w("UpdateManager", "info.isUpdateTypeAllowed(AppUpdateType.IMMEDIATE) -> " + appUpdateInfo.isUpdateTypeAllowed(1));
            Log.w("UpdateManager", "info.installStatus() -> " + appUpdateInfo.installStatus());
            return;
        }
        Log.d("UpdateManager", " *** UPDATE INFO ***");
        Log.d("UpdateManager", "info.availableVersionCode() -> " + appUpdateInfo.availableVersionCode());
        StringBuilder sb4 = new StringBuilder();
        sb4.append("(info.updateAvailability() == UpdateAvailability.UPDATE_AVAILABLE) -> ");
        sb4.append(appUpdateInfo.updateAvailability() == 2);
        Log.d("UpdateManager", sb4.toString());
        StringBuilder sb5 = new StringBuilder();
        sb5.append("(info.updateAvailability() == UpdateAvailability.UPDATE_NOT_AVAILABLE) -> ");
        sb5.append(appUpdateInfo.updateAvailability() == 1);
        Log.d("UpdateManager", sb5.toString());
        StringBuilder sb6 = new StringBuilder();
        sb6.append("(info.updateAvailability() == UpdateAvailability.DEVELOPER_TRIGGERED_UPDATE_IN_PROGRESS) -> ");
        sb6.append(appUpdateInfo.updateAvailability() == 3);
        Log.d("UpdateManager", sb6.toString());
        Log.d("UpdateManager", "info.isUpdateTypeAllowed(AppUpdateType.FLEXIBLE) -> " + appUpdateInfo.isUpdateTypeAllowed(0));
        Log.d("UpdateManager", "info.isUpdateTypeAllowed(AppUpdateType.IMMEDIATE) -> " + appUpdateInfo.isUpdateTypeAllowed(1));
        Log.d("UpdateManager", "info.installStatus() -> " + appUpdateInfo.installStatus());
    }
}
