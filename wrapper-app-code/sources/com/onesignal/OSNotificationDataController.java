package com.onesignal;

import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.onesignal.OneSignalDbContract;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

class OSNotificationDataController extends OSBackgroundManager {
    private static final long NOTIFICATION_CACHE_DATA_LIFETIME = 604800;
    private static final String OS_NOTIFICATIONS_THREAD = "OS_NOTIFICATIONS_THREAD";
    /* access modifiers changed from: private */
    public final OneSignalDbHelper dbHelper;
    /* access modifiers changed from: private */
    public final OSLogger logger;

    interface InvalidOrDuplicateNotificationCallback {
        void onResult(boolean z);
    }

    public OSNotificationDataController(OneSignalDbHelper oneSignalDbHelper, OSLogger oSLogger) {
        this.dbHelper = oneSignalDbHelper;
        this.logger = oSLogger;
    }

    /* access modifiers changed from: package-private */
    public void cleanOldCachedData() {
        cleanNotificationCache();
    }

    private void cleanNotificationCache() {
        runRunnableOnThread(new BackgroundRunnable() {
            public void run() {
                super.run();
                OSNotificationDataController.this.dbHelper.delete(OneSignalDbContract.NotificationTable.TABLE_NAME, "created_time < ?", new String[]{String.valueOf((OneSignal.getTime().getCurrentTimeMillis() / 1000) - OSNotificationDataController.NOTIFICATION_CACHE_DATA_LIFETIME)});
            }
        }, OS_NOTIFICATIONS_THREAD);
    }

    /* access modifiers changed from: package-private */
    public void clearOneSignalNotifications(final WeakReference<Context> weakReference) {
        runRunnableOnThread(new BackgroundRunnable() {
            public void run() {
                super.run();
                Context context = (Context) weakReference.get();
                if (context != null) {
                    NotificationManager notificationManager = OneSignalNotificationManager.getNotificationManager(context);
                    Cursor query = OSNotificationDataController.this.dbHelper.query(OneSignalDbContract.NotificationTable.TABLE_NAME, new String[]{OneSignalDbContract.NotificationTable.COLUMN_NAME_ANDROID_NOTIFICATION_ID}, "dismissed = 0 AND opened = 0", (String[]) null, (String) null, (String) null, (String) null);
                    if (query.moveToFirst()) {
                        do {
                            notificationManager.cancel(query.getInt(query.getColumnIndex(OneSignalDbContract.NotificationTable.COLUMN_NAME_ANDROID_NOTIFICATION_ID)));
                        } while (query.moveToNext());
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_DISMISSED, 1);
                    OSNotificationDataController.this.dbHelper.update(OneSignalDbContract.NotificationTable.TABLE_NAME, contentValues, "opened = 0", (String[]) null);
                    BadgeCountUpdater.updateCount(0, context);
                    query.close();
                }
            }
        }, OS_NOTIFICATIONS_THREAD);
    }

    /* access modifiers changed from: package-private */
    public void removeGroupedNotifications(final String str, final WeakReference<Context> weakReference) {
        runRunnableOnThread(new BackgroundRunnable() {
            public void run() {
                super.run();
                Context context = (Context) weakReference.get();
                if (context != null) {
                    NotificationManager notificationManager = OneSignalNotificationManager.getNotificationManager(context);
                    String[] strArr = {OneSignalDbContract.NotificationTable.COLUMN_NAME_ANDROID_NOTIFICATION_ID};
                    String[] strArr2 = {str};
                    Cursor query = OSNotificationDataController.this.dbHelper.query(OneSignalDbContract.NotificationTable.TABLE_NAME, strArr, "group_id = ? AND dismissed = 0 AND opened = 0", strArr2, (String) null, (String) null, (String) null);
                    while (query.moveToNext()) {
                        int i = query.getInt(query.getColumnIndex(OneSignalDbContract.NotificationTable.COLUMN_NAME_ANDROID_NOTIFICATION_ID));
                        if (i != -1) {
                            notificationManager.cancel(i);
                        }
                    }
                    query.close();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_DISMISSED, 1);
                    OSNotificationDataController.this.dbHelper.update(OneSignalDbContract.NotificationTable.TABLE_NAME, contentValues, "group_id = ? AND opened = 0 AND dismissed = 0", strArr2);
                    BadgeCountUpdater.update(OSNotificationDataController.this.dbHelper, context);
                }
            }
        }, OS_NOTIFICATIONS_THREAD);
    }

    /* access modifiers changed from: package-private */
    public void removeNotification(final int i, final WeakReference<Context> weakReference) {
        runRunnableOnThread(new BackgroundRunnable() {
            public void run() {
                super.run();
                Context context = (Context) weakReference.get();
                if (context != null) {
                    String str = "android_notification_id = " + i + " AND " + OneSignalDbContract.NotificationTable.COLUMN_NAME_OPENED + " = 0 AND " + OneSignalDbContract.NotificationTable.COLUMN_NAME_DISMISSED + " = 0";
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_DISMISSED, 1);
                    if (OSNotificationDataController.this.dbHelper.update(OneSignalDbContract.NotificationTable.TABLE_NAME, contentValues, str, (String[]) null) > 0) {
                        NotificationSummaryManager.updatePossibleDependentSummaryOnDismiss(context, OSNotificationDataController.this.dbHelper, i);
                    }
                    BadgeCountUpdater.update(OSNotificationDataController.this.dbHelper, context);
                    OneSignalNotificationManager.getNotificationManager(context).cancel(i);
                }
            }
        }, OS_NOTIFICATIONS_THREAD);
    }

    /* access modifiers changed from: package-private */
    public void notValidOrDuplicated(JSONObject jSONObject, InvalidOrDuplicateNotificationCallback invalidOrDuplicateNotificationCallback) {
        String oSNotificationIdFromJson = OSNotificationFormatHelper.getOSNotificationIdFromJson(jSONObject);
        if (oSNotificationIdFromJson == null) {
            this.logger.debug("Notification notValidOrDuplicated with id null");
            invalidOrDuplicateNotificationCallback.onResult(true);
            return;
        }
        isDuplicateNotification(oSNotificationIdFromJson, invalidOrDuplicateNotificationCallback);
    }

    private void isDuplicateNotification(final String str, final InvalidOrDuplicateNotificationCallback invalidOrDuplicateNotificationCallback) {
        if (str == null || "".equals(str)) {
            invalidOrDuplicateNotificationCallback.onResult(false);
        } else if (!OSNotificationWorkManager.addNotificationIdProcessed(str)) {
            this.logger.debug("Notification notValidOrDuplicated with id duplicated");
            invalidOrDuplicateNotificationCallback.onResult(true);
        } else {
            runRunnableOnThread(new BackgroundRunnable() {
                public void run() {
                    super.run();
                    boolean z = true;
                    String[] strArr = {str};
                    Cursor query = OSNotificationDataController.this.dbHelper.query(OneSignalDbContract.NotificationTable.TABLE_NAME, new String[]{"notification_id"}, "notification_id = ?", strArr, (String) null, (String) null, (String) null);
                    boolean moveToFirst = query.moveToFirst();
                    query.close();
                    if (moveToFirst) {
                        OSLogger access$100 = OSNotificationDataController.this.logger;
                        access$100.debug("Notification notValidOrDuplicated with id duplicated, duplicate FCM message received, skip processing of " + str);
                    } else {
                        z = false;
                    }
                    invalidOrDuplicateNotificationCallback.onResult(z);
                }
            }, OS_NOTIFICATIONS_THREAD);
        }
    }
}
