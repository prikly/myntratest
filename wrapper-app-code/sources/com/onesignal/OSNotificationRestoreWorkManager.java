package com.onesignal;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalDbContract;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

class OSNotificationRestoreWorkManager {
    static final String[] COLUMNS_FOR_RESTORE = {"notification_id", OneSignalDbContract.NotificationTable.COLUMN_NAME_ANDROID_NOTIFICATION_ID, OneSignalDbContract.NotificationTable.COLUMN_NAME_FULL_DATA, OneSignalDbContract.NotificationTable.COLUMN_NAME_CREATED_TIME};
    static final int DEFAULT_TTL_IF_NOT_IN_PAYLOAD = 259200;
    private static final int DELAY_BETWEEN_NOTIFICATION_RESTORES_MS = 200;
    private static final String NOTIFICATION_RESTORE_WORKER_IDENTIFIER = NotificationRestoreWorker.class.getCanonicalName();
    public static boolean restored;

    OSNotificationRestoreWorkManager() {
    }

    public static void beginEnqueueingWork(Context context, boolean z) {
        OSWorkManagerHelper.getInstance(context).enqueueUniqueWork(NOTIFICATION_RESTORE_WORKER_IDENTIFIER, ExistingWorkPolicy.KEEP, (OneTimeWorkRequest) ((OneTimeWorkRequest.Builder) new OneTimeWorkRequest.Builder(NotificationRestoreWorker.class).setInitialDelay((long) (z ? 15 : 0), TimeUnit.SECONDS)).build());
    }

    public static class NotificationRestoreWorker extends Worker {
        public NotificationRestoreWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
        }

        public ListenableWorker.Result doWork() {
            Context applicationContext = getApplicationContext();
            if (OneSignal.appContext == null) {
                OneSignal.initWithContext(applicationContext);
            }
            if (!OSUtils.areNotificationsEnabled(applicationContext)) {
                return ListenableWorker.Result.failure();
            }
            if (OSNotificationRestoreWorkManager.restored) {
                return ListenableWorker.Result.failure();
            }
            OSNotificationRestoreWorkManager.restored = true;
            OneSignal.Log(OneSignal.LOG_LEVEL.INFO, "Restoring notifications");
            OneSignalDbHelper instance = OneSignalDbHelper.getInstance(applicationContext);
            StringBuilder recentUninteractedWithNotificationsWhere = OneSignalDbHelper.recentUninteractedWithNotificationsWhere();
            OSNotificationRestoreWorkManager.skipVisibleNotifications(applicationContext, recentUninteractedWithNotificationsWhere);
            OSNotificationRestoreWorkManager.queryAndRestoreNotificationsAndBadgeCount(applicationContext, instance, recentUninteractedWithNotificationsWhere);
            return ListenableWorker.Result.success();
        }
    }

    /* access modifiers changed from: private */
    public static void queryAndRestoreNotificationsAndBadgeCount(Context context, OneSignalDbHelper oneSignalDbHelper, StringBuilder sb) {
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.INFO;
        OneSignal.Log(log_level, "Querying DB for notifications to restore: " + sb.toString());
        Cursor cursor = null;
        try {
            cursor = oneSignalDbHelper.query(OneSignalDbContract.NotificationTable.TABLE_NAME, COLUMNS_FOR_RESTORE, sb.toString(), (String[]) null, (String) null, (String) null, "_id DESC", NotificationLimitManager.MAX_NUMBER_OF_NOTIFICATIONS_STR);
            showNotificationsFromCursor(context, cursor, 200);
            BadgeCountUpdater.update(oneSignalDbHelper, context);
            if (cursor == null || cursor.isClosed()) {
                return;
            }
        } catch (Throwable th) {
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
            throw th;
        }
        cursor.close();
    }

    /* access modifiers changed from: private */
    public static void skipVisibleNotifications(Context context, StringBuilder sb) {
        if (Build.VERSION.SDK_INT >= 23) {
            StatusBarNotification[] activeNotifications = OneSignalNotificationManager.getActiveNotifications(context);
            if (activeNotifications.length != 0) {
                ArrayList arrayList = new ArrayList();
                for (StatusBarNotification id : activeNotifications) {
                    arrayList.add(Integer.valueOf(id.getId()));
                }
                sb.append(" AND android_notification_id NOT IN (");
                sb.append(TextUtils.join(",", arrayList));
                sb.append(")");
            }
        }
    }

    static void showNotificationsFromCursor(Context context, Cursor cursor, int i) {
        if (cursor.moveToFirst()) {
            do {
                OSNotificationWorkManager.beginEnqueueingWork(context, cursor.getString(cursor.getColumnIndex("notification_id")), cursor.getInt(cursor.getColumnIndex(OneSignalDbContract.NotificationTable.COLUMN_NAME_ANDROID_NOTIFICATION_ID)), cursor.getString(cursor.getColumnIndex(OneSignalDbContract.NotificationTable.COLUMN_NAME_FULL_DATA)), cursor.getLong(cursor.getColumnIndex(OneSignalDbContract.NotificationTable.COLUMN_NAME_CREATED_TIME)), true, false);
                if (i > 0) {
                    OSUtils.sleep(i);
                }
            } while (cursor.moveToNext());
        }
    }
}
