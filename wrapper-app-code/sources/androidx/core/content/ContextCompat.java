package androidx.core.content;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.TypedValue;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.util.ObjectsCompat;
import java.io.File;

public class ContextCompat {
    private static final Object sLock = new Object();
    private static final Object sSync = new Object();
    private static TypedValue sTempValue;

    public static boolean startActivities(Context context, Intent[] intentArr, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            Api16Impl.startActivities(context, intentArr, bundle);
            return true;
        }
        context.startActivities(intentArr);
        return true;
    }

    public static void startActivity(Context context, Intent intent, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            Api16Impl.startActivity(context, intent, bundle);
        } else {
            context.startActivity(intent);
        }
    }

    public static File[] getExternalFilesDirs(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Api19Impl.getExternalFilesDirs(context, str);
        }
        return new File[]{context.getExternalFilesDir(str)};
    }

    public static File[] getExternalCacheDirs(Context context) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Api19Impl.getExternalCacheDirs(context);
        }
        return new File[]{context.getExternalCacheDir()};
    }

    public static Drawable getDrawable(Context context, int i) {
        int i2;
        if (Build.VERSION.SDK_INT >= 21) {
            return Api21Impl.getDrawable(context, i);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return context.getResources().getDrawable(i);
        }
        synchronized (sLock) {
            if (sTempValue == null) {
                sTempValue = new TypedValue();
            }
            context.getResources().getValue(i, sTempValue, true);
            i2 = sTempValue.resourceId;
        }
        return context.getResources().getDrawable(i2);
    }

    public static ColorStateList getColorStateList(Context context, int i) {
        return ResourcesCompat.getColorStateList(context.getResources(), i, context.getTheme());
    }

    public static int getColor(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.getColor(context, i);
        }
        return context.getResources().getColor(i);
    }

    public static int checkSelfPermission(Context context, String str) {
        ObjectsCompat.requireNonNull(str, "permission must be non-null");
        return context.checkPermission(str, Process.myPid(), Process.myUid());
    }

    public static File getNoBackupFilesDir(Context context) {
        if (Build.VERSION.SDK_INT >= 21) {
            return Api21Impl.getNoBackupFilesDir(context);
        }
        return createFilesDir(new File(context.getApplicationInfo().dataDir, "no_backup"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.io.File createFilesDir(java.io.File r4) {
        /*
            java.lang.Object r0 = sSync
            monitor-enter(r0)
            boolean r1 = r4.exists()     // Catch:{ all -> 0x002d }
            if (r1 != 0) goto L_0x002b
            boolean r1 = r4.mkdirs()     // Catch:{ all -> 0x002d }
            if (r1 == 0) goto L_0x0011
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return r4
        L_0x0011:
            java.lang.String r1 = "ContextCompat"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x002d }
            r2.<init>()     // Catch:{ all -> 0x002d }
            java.lang.String r3 = "Unable to create files subdir "
            r2.append(r3)     // Catch:{ all -> 0x002d }
            java.lang.String r3 = r4.getPath()     // Catch:{ all -> 0x002d }
            r2.append(r3)     // Catch:{ all -> 0x002d }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x002d }
            android.util.Log.w(r1, r2)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return r4
        L_0x002d:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.ContextCompat.createFilesDir(java.io.File):java.io.File");
    }

    public static Context createDeviceProtectedStorageContext(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return Api24Impl.createDeviceProtectedStorageContext(context);
        }
        return null;
    }

    public static void startForegroundService(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.startForegroundService(context, intent);
        } else {
            context.startService(intent);
        }
    }

    static class Api16Impl {
        static void startActivities(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        static void startActivity(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    static class Api19Impl {
        static File[] getExternalCacheDirs(Context context) {
            return context.getExternalCacheDirs();
        }

        static File[] getExternalFilesDirs(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        static File[] getObbDirs(Context context) {
            return context.getObbDirs();
        }
    }

    static class Api21Impl {
        static Drawable getDrawable(Context context, int i) {
            return context.getDrawable(i);
        }

        static File getNoBackupFilesDir(Context context) {
            return context.getNoBackupFilesDir();
        }

        static File getCodeCacheDir(Context context) {
            return context.getCodeCacheDir();
        }
    }

    static class Api23Impl {
        static int getColor(Context context, int i) {
            return context.getColor(i);
        }

        static <T> T getSystemService(Context context, Class<T> cls) {
            return context.getSystemService(cls);
        }

        static String getSystemServiceName(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    static class Api24Impl {
        static File getDataDir(Context context) {
            return context.getDataDir();
        }

        static Context createDeviceProtectedStorageContext(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        static boolean isDeviceProtectedStorage(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    static class Api26Impl {
        static ComponentName startForegroundService(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }
}
