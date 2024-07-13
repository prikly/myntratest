package com.appsgeyser.sdk.datasdk;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.core.content.ContextCompat;
import com.appsgeyser.sdk.InternalEntryPoint;
import com.appsgeyser.sdk.configuration.PreferencesCoder;
import com.appsgeyser.sdk.configuration.models.ConfigPhp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class PermissionsRequester {
    private static final String[] oneAudiencePermissions = {"android.permission.GET_ACCOUNTS"};
    private static final String[] predicioPermissions = {"android.permission.ACCESS_FINE_LOCATION"};

    static boolean isPermissionsRequired(ConfigPhp configPhp, Context context) {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        HashSet hashSet = new HashSet();
        PackageManager packageManager = context.getPackageManager();
        for (String next : getPermissionRequiredFromConfig(configPhp)) {
            if (packageManager.checkPermission(next, context.getPackageName()) != 0) {
                hashSet.add(next);
            }
        }
        if (hashSet.size() > 0) {
            return true;
        }
        return false;
    }

    static void requestAllActiveByDefaultPermissions(Activity activity, ConfigPhp configPhp, int i) {
        String[] needRequestPermissions = getNeedRequestPermissions(activity, new HashSet());
        if (needRequestPermissions != null) {
            activity.requestPermissions(needRequestPermissions, i);
        } else {
            activity.onRequestPermissionsResult(78, new String[0], new int[0]);
        }
    }

    static void requestAllActivePermissions(Activity activity, ConfigPhp configPhp, int i) {
        String[] needRequestPermissions = getNeedRequestPermissions(activity, getPermissionRequiredFromConfig(configPhp));
        if (needRequestPermissions != null) {
            activity.requestPermissions(needRequestPermissions, i);
        } else {
            activity.onRequestPermissionsResult(78, new String[0], new int[0]);
        }
    }

    private static String[] getNeedRequestPermissions(Activity activity, Set<String> set) {
        HashSet hashSet = new HashSet();
        for (String next : set) {
            if (ContextCompat.checkSelfPermission(activity, next) != 0) {
                hashSet.add(next);
            }
        }
        if (hashSet.size() > 0) {
            return (String[]) hashSet.toArray(new String[hashSet.size()]);
        }
        return null;
    }

    private static Set<String> getPermissionRequiredFromConfig(ConfigPhp configPhp) {
        return new HashSet();
    }

    public static void requestNotificationPermissions(Activity activity, int i) {
        if (Build.VERSION.SDK_INT >= 33 && (((((double) (new Date().getTime() - new PreferencesCoder(activity).getPrefLong("NotificationPermRequestDate", 0))) / 1000.0d) / 60.0d) / 60.0d) / 24.0d > 3.0d) {
            HashSet hashSet = new HashSet();
            hashSet.add("android.permission.POST_NOTIFICATIONS");
            hashSet.forEach(new Consumer(activity, hashSet) {
                public final /* synthetic */ Activity f$0;
                public final /* synthetic */ HashSet f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    PermissionsRequester.lambda$requestNotificationPermissions$0(this.f$0, this.f$1, (String) obj);
                }
            });
            if (hashSet.size() != 0) {
                delayedAskPermission(hashSet, activity, i);
            }
        }
    }

    static /* synthetic */ void lambda$requestNotificationPermissions$0(Activity activity, HashSet hashSet, String str) {
        if (isPermissionGranted(str, activity)) {
            hashSet.remove(str);
        }
    }

    private static void delayedAskPermission(final HashSet<String> hashSet, final Activity activity, final int i) {
        new Thread() {
            public void run() {
                try {
                    Thread.sleep(10000);
                    while (InternalEntryPoint.getInstance().getAppState() == InternalEntryPoint.AppState.ON_PAUSE) {
                        Thread.sleep(500);
                    }
                    activity.requestPermissions((String[]) hashSet.toArray(new String[0]), i);
                    new PreferencesCoder(activity).savePrefLong("NotificationPermRequestDate", new Date().getTime());
                } catch (InterruptedException e2) {
                    Log.d("PermissionsTag", "Permission thread sleep exception:", e2);
                }
            }
        }.start();
    }

    private static boolean isPermissionGranted(String str, Context context) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }
}
