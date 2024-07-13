package com.onesignal;

import android.R;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.onesignal.AndroidSupportV4Compat;
import com.onesignal.OSThrowable;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalDbContract;
import com.onesignal.outcomes.OSOutcomeConstants;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.net.URL;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class GenerateNotification {
    public static final String BUNDLE_KEY_ACTION_ID = "actionId";
    public static final String BUNDLE_KEY_ANDROID_NOTIFICATION_ID = "androidNotificationId";
    public static final String BUNDLE_KEY_ONESIGNAL_DATA = "onesignalData";
    public static final String OS_SHOW_NOTIFICATION_THREAD = "OS_SHOW_NOTIFICATION_THREAD";
    private static Resources contextResources = null;
    private static Context currentContext = null;
    private static Integer groupAlertBehavior = null;
    private static Class<?> notificationDismissedClass = NotificationDismissReceiver.class;
    private static Class<?> notificationOpenedClass = NotificationOpenedReceiver.class;
    private static String packageName = null;

    private static int convertOSToAndroidPriority(int i) {
        if (i > 9) {
            return 2;
        }
        if (i > 7) {
            return 1;
        }
        if (i > 4) {
            return 0;
        }
        return i > 2 ? -1 : -2;
    }

    GenerateNotification() {
    }

    private static class OneSignalNotificationBuilder {
        NotificationCompat.Builder compatBuilder;
        boolean hasLargeIcon;

        private OneSignalNotificationBuilder() {
        }
    }

    private static void initGroupAlertBehavior() {
        if (Build.VERSION.SDK_INT >= 24) {
            groupAlertBehavior = 2;
        } else {
            groupAlertBehavior = 1;
        }
    }

    private static void setStatics(Context context) {
        currentContext = context;
        packageName = context.getPackageName();
        contextResources = currentContext.getResources();
    }

    static boolean displayNotification(OSNotificationGenerationJob oSNotificationGenerationJob) {
        setStatics(oSNotificationGenerationJob.getContext());
        isRunningOnMainThreadCheck();
        initGroupAlertBehavior();
        return showNotification(oSNotificationGenerationJob);
    }

    static boolean displayIAMPreviewNotification(OSNotificationGenerationJob oSNotificationGenerationJob) {
        setStatics(oSNotificationGenerationJob.getContext());
        return showNotification(oSNotificationGenerationJob);
    }

    static void isRunningOnMainThreadCheck() {
        if (OSUtils.isRunningOnMainThread()) {
            throw new OSThrowable.OSMainThreadException("Process for showing a notification should never been done on Main Thread!");
        }
    }

    private static CharSequence getTitle(JSONObject jSONObject) {
        String optString = jSONObject.optString("title", (String) null);
        if (optString != null) {
            return optString;
        }
        return currentContext.getPackageManager().getApplicationLabel(currentContext.getApplicationInfo());
    }

    private static PendingIntent getNewDismissActionPendingIntent(int i, Intent intent) {
        return PendingIntent.getBroadcast(currentContext, i, intent, 201326592);
    }

    private static Intent getNewBaseDismissIntent(int i) {
        return new Intent(currentContext, notificationDismissedClass).putExtra(BUNDLE_KEY_ANDROID_NOTIFICATION_ID, i).putExtra(OneSignalDbContract.NotificationTable.COLUMN_NAME_DISMISSED, true);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(19:0|(2:1|2)|5|(1:9)|10|11|(1:13)|14|15|(1:17)(1:18)|19|21|(1:23)|24|(1:26)|27|(2:29|30)|31|33) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x006e */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0074 A[Catch:{ all -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007d A[Catch:{ all -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b0 A[SYNTHETIC, Splitter:B:29:0x00b0] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.onesignal.GenerateNotification.OneSignalNotificationBuilder getBaseOneSignalNotificationBuilder(com.onesignal.OSNotificationGenerationJob r9) {
        /*
            java.lang.String r0 = "vis"
            org.json.JSONObject r1 = r9.getJsonPayload()
            com.onesignal.GenerateNotification$OneSignalNotificationBuilder r2 = new com.onesignal.GenerateNotification$OneSignalNotificationBuilder
            r3 = 0
            r2.<init>()
            java.lang.String r4 = com.onesignal.NotificationChannelManager.createNotificationChannel(r9)     // Catch:{ all -> 0x0018 }
            androidx.core.app.NotificationCompat$Builder r5 = new androidx.core.app.NotificationCompat$Builder     // Catch:{ all -> 0x0018 }
            android.content.Context r6 = currentContext     // Catch:{ all -> 0x0018 }
            r5.<init>(r6, r4)     // Catch:{ all -> 0x0018 }
            goto L_0x001f
        L_0x0018:
            androidx.core.app.NotificationCompat$Builder r5 = new androidx.core.app.NotificationCompat$Builder
            android.content.Context r4 = currentContext
            r5.<init>(r4)
        L_0x001f:
            java.lang.String r4 = "alert"
            java.lang.String r4 = r1.optString(r4, r3)
            r6 = 1
            androidx.core.app.NotificationCompat$Builder r7 = r5.setAutoCancel(r6)
            int r8 = getSmallIconId(r1)
            androidx.core.app.NotificationCompat$Builder r7 = r7.setSmallIcon(r8)
            androidx.core.app.NotificationCompat$BigTextStyle r8 = new androidx.core.app.NotificationCompat$BigTextStyle
            r8.<init>()
            androidx.core.app.NotificationCompat$BigTextStyle r8 = r8.bigText(r4)
            androidx.core.app.NotificationCompat$Builder r7 = r7.setStyle(r8)
            androidx.core.app.NotificationCompat$Builder r7 = r7.setContentText(r4)
            r7.setTicker(r4)
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 24
            if (r7 < r8) goto L_0x005a
            java.lang.String r7 = "title"
            java.lang.String r7 = r1.optString(r7)
            java.lang.String r8 = ""
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x0061
        L_0x005a:
            java.lang.CharSequence r7 = getTitle(r1)
            r5.setContentTitle(r7)
        L_0x0061:
            java.math.BigInteger r7 = getAccentColor(r1)     // Catch:{ all -> 0x006e }
            if (r7 == 0) goto L_0x006e
            int r7 = r7.intValue()     // Catch:{ all -> 0x006e }
            r5.setColor(r7)     // Catch:{ all -> 0x006e }
        L_0x006e:
            boolean r7 = r1.has(r0)     // Catch:{ all -> 0x0082 }
            if (r7 == 0) goto L_0x007d
            java.lang.String r0 = r1.optString(r0)     // Catch:{ all -> 0x0082 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x0082 }
            goto L_0x007e
        L_0x007d:
            r0 = 1
        L_0x007e:
            r5.setVisibility(r0)     // Catch:{ all -> 0x0082 }
            goto L_0x0083
        L_0x0082:
        L_0x0083:
            android.graphics.Bitmap r0 = getLargeIcon(r1)
            if (r0 == 0) goto L_0x008e
            r2.hasLargeIcon = r6
            r5.setLargeIcon(r0)
        L_0x008e:
            java.lang.String r0 = "bicon"
            java.lang.String r0 = r1.optString(r0, r3)
            android.graphics.Bitmap r0 = getBitmap(r0)
            if (r0 == 0) goto L_0x00aa
            androidx.core.app.NotificationCompat$BigPictureStyle r3 = new androidx.core.app.NotificationCompat$BigPictureStyle
            r3.<init>()
            androidx.core.app.NotificationCompat$BigPictureStyle r0 = r3.bigPicture(r0)
            androidx.core.app.NotificationCompat$BigPictureStyle r0 = r0.setSummaryText(r4)
            r5.setStyle(r0)
        L_0x00aa:
            java.lang.Long r0 = r9.getShownTimeStamp()
            if (r0 == 0) goto L_0x00bf
            java.lang.Long r9 = r9.getShownTimeStamp()     // Catch:{ all -> 0x00bf }
            long r3 = r9.longValue()     // Catch:{ all -> 0x00bf }
            r6 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r6
            r5.setWhen(r3)     // Catch:{ all -> 0x00bf }
        L_0x00bf:
            setAlertnessOptions(r1, r5)
            r2.compatBuilder = r5
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.GenerateNotification.getBaseOneSignalNotificationBuilder(com.onesignal.OSNotificationGenerationJob):com.onesignal.GenerateNotification$OneSignalNotificationBuilder");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void setAlertnessOptions(org.json.JSONObject r6, androidx.core.app.NotificationCompat.Builder r7) {
        /*
            java.lang.String r0 = "pri"
            r1 = 6
            int r0 = r6.optInt(r0, r1)
            int r0 = convertOSToAndroidPriority(r0)
            r7.setPriority(r0)
            r1 = 0
            r2 = 1
            if (r0 >= 0) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            if (r0 == 0) goto L_0x0018
            return
        L_0x0018:
            java.lang.String r0 = "ledc"
            boolean r3 = r6.has(r0)
            r4 = 4
            if (r3 == 0) goto L_0x0040
            java.lang.String r3 = "led"
            int r3 = r6.optInt(r3, r2)
            if (r3 != r2) goto L_0x0040
            java.math.BigInteger r3 = new java.math.BigInteger     // Catch:{ all -> 0x0040 }
            java.lang.String r0 = r6.optString(r0)     // Catch:{ all -> 0x0040 }
            r5 = 16
            r3.<init>(r0, r5)     // Catch:{ all -> 0x0040 }
            int r0 = r3.intValue()     // Catch:{ all -> 0x0040 }
            r3 = 2000(0x7d0, float:2.803E-42)
            r5 = 5000(0x1388, float:7.006E-42)
            r7.setLights(r0, r3, r5)     // Catch:{ all -> 0x0040 }
            goto L_0x0041
        L_0x0040:
            r1 = 4
        L_0x0041:
            java.lang.String r0 = "vib"
            int r0 = r6.optInt(r0, r2)
            if (r0 != r2) goto L_0x005d
            java.lang.String r0 = "vib_pt"
            boolean r0 = r6.has(r0)
            if (r0 == 0) goto L_0x005b
            long[] r0 = com.onesignal.OSUtils.parseVibrationPattern(r6)
            if (r0 == 0) goto L_0x005d
            r7.setVibrate(r0)
            goto L_0x005d
        L_0x005b:
            r1 = r1 | 2
        L_0x005d:
            boolean r0 = isSoundEnabled(r6)
            if (r0 == 0) goto L_0x0078
            android.content.Context r0 = currentContext
            r2 = 0
            java.lang.String r3 = "sound"
            java.lang.String r6 = r6.optString(r3, r2)
            android.net.Uri r6 = com.onesignal.OSUtils.getSoundUri(r0, r6)
            if (r6 == 0) goto L_0x0076
            r7.setSound(r6)
            goto L_0x0078
        L_0x0076:
            r1 = r1 | 1
        L_0x0078:
            r7.setDefaults(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.GenerateNotification.setAlertnessOptions(org.json.JSONObject, androidx.core.app.NotificationCompat$Builder):void");
    }

    private static void removeNotifyOptions(NotificationCompat.Builder builder) {
        builder.setOnlyAlertOnce(true).setDefaults(0).setSound((Uri) null).setVibrate((long[]) null).setTicker((CharSequence) null);
    }

    private static boolean showNotification(OSNotificationGenerationJob oSNotificationGenerationJob) {
        Notification notification;
        int intValue = oSNotificationGenerationJob.getAndroidId().intValue();
        JSONObject jsonPayload = oSNotificationGenerationJob.getJsonPayload();
        String optString = jsonPayload.optString("grp", (String) null);
        IntentGeneratorForAttachingToNotifications intentGeneratorForAttachingToNotifications = new IntentGeneratorForAttachingToNotifications(currentContext);
        ArrayList<StatusBarNotification> arrayList = new ArrayList<>();
        if (Build.VERSION.SDK_INT >= 24) {
            arrayList = OneSignalNotificationManager.getActiveGrouplessNotifications(currentContext);
            if (optString == null && arrayList.size() >= 3) {
                optString = OneSignalNotificationManager.getGrouplessSummaryKey();
                OneSignalNotificationManager.assignGrouplessNotifications(currentContext, arrayList);
            }
        }
        OneSignalNotificationBuilder baseOneSignalNotificationBuilder = getBaseOneSignalNotificationBuilder(oSNotificationGenerationJob);
        NotificationCompat.Builder builder = baseOneSignalNotificationBuilder.compatBuilder;
        addNotificationActionButtons(jsonPayload, intentGeneratorForAttachingToNotifications, builder, intValue, (String) null);
        try {
            addBackgroundImage(jsonPayload, builder);
        } catch (Throwable th) {
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Could not set background notification image!", th);
        }
        applyNotificationExtender(oSNotificationGenerationJob, builder);
        if (oSNotificationGenerationJob.isRestoring()) {
            removeNotifyOptions(builder);
        }
        NotificationLimitManager.clearOldestOverLimit(currentContext, optString != null ? 2 : 1);
        if (optString != null) {
            createGenericPendingIntentsForGroup(builder, intentGeneratorForAttachingToNotifications, jsonPayload, optString, intValue);
            notification = createSingleNotificationBeforeSummaryBuilder(oSNotificationGenerationJob, builder);
            if (Build.VERSION.SDK_INT < 24 || !optString.equals(OneSignalNotificationManager.getGrouplessSummaryKey())) {
                createSummaryNotification(oSNotificationGenerationJob, baseOneSignalNotificationBuilder);
            } else {
                createGrouplessSummaryNotification(oSNotificationGenerationJob, intentGeneratorForAttachingToNotifications, arrayList.size() + 1);
            }
        } else {
            notification = createGenericPendingIntentsForNotif(builder, intentGeneratorForAttachingToNotifications, jsonPayload, intValue);
        }
        if (optString == null || Build.VERSION.SDK_INT > 17) {
            addXiaomiSettings(baseOneSignalNotificationBuilder, notification);
            NotificationManagerCompat.from(currentContext).notify(intValue, notification);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return OneSignalNotificationManager.areNotificationsEnabled(currentContext, notification.getChannelId());
        }
        return true;
    }

    private static Notification createGenericPendingIntentsForNotif(NotificationCompat.Builder builder, IntentGeneratorForAttachingToNotifications intentGeneratorForAttachingToNotifications, JSONObject jSONObject, int i) {
        SecureRandom secureRandom = new SecureRandom();
        builder.setContentIntent(intentGeneratorForAttachingToNotifications.getNewActionPendingIntent(secureRandom.nextInt(), intentGeneratorForAttachingToNotifications.getNewBaseIntent(i).putExtra(BUNDLE_KEY_ONESIGNAL_DATA, jSONObject.toString())));
        builder.setDeleteIntent(getNewDismissActionPendingIntent(secureRandom.nextInt(), getNewBaseDismissIntent(i)));
        return builder.build();
    }

    private static void createGenericPendingIntentsForGroup(NotificationCompat.Builder builder, IntentGeneratorForAttachingToNotifications intentGeneratorForAttachingToNotifications, JSONObject jSONObject, String str, int i) {
        SecureRandom secureRandom = new SecureRandom();
        builder.setContentIntent(intentGeneratorForAttachingToNotifications.getNewActionPendingIntent(secureRandom.nextInt(), intentGeneratorForAttachingToNotifications.getNewBaseIntent(i).putExtra(BUNDLE_KEY_ONESIGNAL_DATA, jSONObject.toString()).putExtra("grp", str)));
        builder.setDeleteIntent(getNewDismissActionPendingIntent(secureRandom.nextInt(), getNewBaseDismissIntent(i).putExtra("grp", str)));
        builder.setGroup(str);
        try {
            builder.setGroupAlertBehavior(groupAlertBehavior.intValue());
        } catch (Throwable unused) {
        }
    }

    private static void applyNotificationExtender(OSNotificationGenerationJob oSNotificationGenerationJob, NotificationCompat.Builder builder) {
        if (oSNotificationGenerationJob.hasExtender()) {
            try {
                Field declaredField = NotificationCompat.Builder.class.getDeclaredField("mNotification");
                declaredField.setAccessible(true);
                Notification notification = (Notification) declaredField.get(builder);
                oSNotificationGenerationJob.setOrgFlags(Integer.valueOf(notification.flags));
                oSNotificationGenerationJob.setOrgSound(notification.sound);
                builder.extend(oSNotificationGenerationJob.getNotification().getNotificationExtender());
                Notification notification2 = (Notification) declaredField.get(builder);
                Field declaredField2 = NotificationCompat.Builder.class.getDeclaredField("mContentText");
                declaredField2.setAccessible(true);
                Field declaredField3 = NotificationCompat.Builder.class.getDeclaredField("mContentTitle");
                declaredField3.setAccessible(true);
                oSNotificationGenerationJob.setOverriddenBodyFromExtender((CharSequence) declaredField2.get(builder));
                oSNotificationGenerationJob.setOverriddenTitleFromExtender((CharSequence) declaredField3.get(builder));
                if (!oSNotificationGenerationJob.isRestoring()) {
                    oSNotificationGenerationJob.setOverriddenFlags(Integer.valueOf(notification2.flags));
                    oSNotificationGenerationJob.setOverriddenSound(notification2.sound);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private static Notification createSingleNotificationBeforeSummaryBuilder(OSNotificationGenerationJob oSNotificationGenerationJob, NotificationCompat.Builder builder) {
        boolean z = Build.VERSION.SDK_INT > 17 && Build.VERSION.SDK_INT < 24 && !oSNotificationGenerationJob.isRestoring();
        if (z && oSNotificationGenerationJob.getOverriddenSound() != null && !oSNotificationGenerationJob.getOverriddenSound().equals(oSNotificationGenerationJob.getOrgSound())) {
            builder.setSound((Uri) null);
        }
        Notification build = builder.build();
        if (z) {
            builder.setSound(oSNotificationGenerationJob.getOverriddenSound());
        }
        return build;
    }

    private static void addXiaomiSettings(OneSignalNotificationBuilder oneSignalNotificationBuilder, Notification notification) {
        if (oneSignalNotificationBuilder.hasLargeIcon) {
            try {
                Object newInstance = Class.forName("android.app.MiuiNotification").newInstance();
                Field declaredField = newInstance.getClass().getDeclaredField("customizedIcon");
                declaredField.setAccessible(true);
                declaredField.set(newInstance, true);
                Field field = notification.getClass().getField("extraNotification");
                field.setAccessible(true);
                field.set(notification, newInstance);
            } catch (Throwable unused) {
            }
        }
    }

    static void updateSummaryNotification(OSNotificationGenerationJob oSNotificationGenerationJob) {
        setStatics(oSNotificationGenerationJob.getContext());
        createSummaryNotification(oSNotificationGenerationJob, (OneSignalNotificationBuilder) null);
    }

    private static void createSummaryNotification(OSNotificationGenerationJob oSNotificationGenerationJob, OneSignalNotificationBuilder oneSignalNotificationBuilder) {
        String str;
        String str2;
        Integer num;
        ArrayList<SpannableString> arrayList;
        JSONObject jSONObject;
        Notification notification;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        OneSignalNotificationBuilder oneSignalNotificationBuilder2 = oneSignalNotificationBuilder;
        String str8 = OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE;
        String str9 = "title";
        String str10 = OneSignalDbContract.NotificationTable.COLUMN_NAME_IS_SUMMARY;
        boolean isRestoring = oSNotificationGenerationJob.isRestoring();
        JSONObject jsonPayload = oSNotificationGenerationJob.getJsonPayload();
        IntentGeneratorForAttachingToNotifications intentGeneratorForAttachingToNotifications = new IntentGeneratorForAttachingToNotifications(currentContext);
        Cursor cursor = null;
        String optString = jsonPayload.optString("grp", (String) null);
        SecureRandom secureRandom = new SecureRandom();
        PendingIntent newDismissActionPendingIntent = getNewDismissActionPendingIntent(secureRandom.nextInt(), getNewBaseDismissIntent(0).putExtra("summary", optString));
        OneSignalDbHelper instance = OneSignalDbHelper.getInstance(currentContext);
        try {
            String[] strArr = {OneSignalDbContract.NotificationTable.COLUMN_NAME_ANDROID_NOTIFICATION_ID, OneSignalDbContract.NotificationTable.COLUMN_NAME_FULL_DATA, str10, str9, str8};
            JSONObject jSONObject2 = jsonPayload;
            try {
                String[] strArr2 = {optString};
                if (!isRestoring) {
                    try {
                        str = "group_id = ? AND dismissed = 0 AND opened = 0" + " AND android_notification_id <> " + oSNotificationGenerationJob.getAndroidId();
                    } catch (Throwable th) {
                        th = th;
                        cursor = null;
                        cursor.close();
                        throw th;
                    }
                } else {
                    str = "group_id = ? AND dismissed = 0 AND opened = 0";
                }
                Cursor query = instance.query(OneSignalDbContract.NotificationTable.TABLE_NAME, strArr, str, strArr2, (String) null, (String) null, "_id DESC");
                try {
                    str2 = "";
                    if (query.moveToFirst()) {
                        arrayList = new ArrayList<>();
                        String str11 = null;
                        num = null;
                        while (true) {
                            String str12 = str10;
                            if (query.getInt(query.getColumnIndex(str10)) == 1) {
                                num = Integer.valueOf(query.getInt(query.getColumnIndex(OneSignalDbContract.NotificationTable.COLUMN_NAME_ANDROID_NOTIFICATION_ID)));
                                str5 = str8;
                                str6 = str9;
                            } else {
                                String string = query.getString(query.getColumnIndex(str9));
                                if (string == null) {
                                    str4 = str2;
                                } else {
                                    str4 = string + " ";
                                }
                                str5 = str8;
                                str6 = str9;
                                SpannableString spannableString = new SpannableString(str4 + query.getString(query.getColumnIndex(str8)));
                                if (str4.length() > 0) {
                                    spannableString.setSpan(new StyleSpan(1), 0, str4.length(), 0);
                                }
                                arrayList.add(spannableString);
                                if (str11 == null) {
                                    str11 = query.getString(query.getColumnIndex(OneSignalDbContract.NotificationTable.COLUMN_NAME_FULL_DATA));
                                }
                            }
                            str7 = str11;
                            if (!query.moveToNext()) {
                                break;
                            }
                            OneSignalNotificationBuilder oneSignalNotificationBuilder3 = oneSignalNotificationBuilder;
                            str11 = str7;
                            str10 = str12;
                            str8 = str5;
                            str9 = str6;
                        }
                        if (isRestoring && str7 != null) {
                            jSONObject = new JSONObject(str7);
                        }
                        jSONObject = jSONObject2;
                    } else {
                        jSONObject = jSONObject2;
                        arrayList = null;
                        num = null;
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                } catch (Throwable th2) {
                    th = th2;
                    cursor = query;
                    cursor.close();
                    throw th;
                }
                if (query != null && !query.isClosed()) {
                    query.close();
                }
                if (num == null) {
                    num = Integer.valueOf(secureRandom.nextInt());
                    createSummaryIdDatabaseEntry(instance, optString, num.intValue());
                }
                PendingIntent newActionPendingIntent = intentGeneratorForAttachingToNotifications.getNewActionPendingIntent(secureRandom.nextInt(), createBaseSummaryIntent(num.intValue(), intentGeneratorForAttachingToNotifications, jSONObject, optString));
                if (arrayList == null || ((!isRestoring || arrayList.size() <= 1) && (isRestoring || arrayList.size() <= 0))) {
                    OneSignalNotificationBuilder oneSignalNotificationBuilder4 = oneSignalNotificationBuilder;
                    NotificationCompat.Builder builder = oneSignalNotificationBuilder4.compatBuilder;
                    builder.mActions.clear();
                    addNotificationActionButtons(jSONObject, intentGeneratorForAttachingToNotifications, builder, num.intValue(), optString);
                    builder.setContentIntent(newActionPendingIntent).setDeleteIntent(newDismissActionPendingIntent).setOnlyAlertOnce(isRestoring).setAutoCancel(false).setGroup(optString).setGroupSummary(true);
                    try {
                        builder.setGroupAlertBehavior(groupAlertBehavior.intValue());
                    } catch (Throwable unused) {
                    }
                    notification = builder.build();
                    addXiaomiSettings(oneSignalNotificationBuilder4, notification);
                } else {
                    int size = arrayList.size() + (isRestoring ^ true ? 1 : 0);
                    String optString2 = jSONObject.optString("grp_msg", (String) null);
                    if (optString2 == null) {
                        str3 = size + " new messages";
                    } else {
                        str3 = optString2.replace("$[notif_count]", str2 + size);
                    }
                    NotificationCompat.Builder builder2 = getBaseOneSignalNotificationBuilder(oSNotificationGenerationJob).compatBuilder;
                    if (isRestoring) {
                        removeNotifyOptions(builder2);
                    } else {
                        if (oSNotificationGenerationJob.getOverriddenSound() != null) {
                            builder2.setSound(oSNotificationGenerationJob.getOverriddenSound());
                        }
                        if (oSNotificationGenerationJob.getOverriddenFlags() != null) {
                            builder2.setDefaults(oSNotificationGenerationJob.getOverriddenFlags().intValue());
                        }
                    }
                    builder2.setContentIntent(newActionPendingIntent).setDeleteIntent(newDismissActionPendingIntent).setContentTitle(currentContext.getPackageManager().getApplicationLabel(currentContext.getApplicationInfo())).setContentText(str3).setNumber(size).setSmallIcon(getDefaultSmallIconId()).setLargeIcon(getDefaultLargeIcon()).setOnlyAlertOnce(isRestoring).setAutoCancel(false).setGroup(optString).setGroupSummary(true);
                    try {
                        builder2.setGroupAlertBehavior(groupAlertBehavior.intValue());
                    } catch (Throwable unused2) {
                    }
                    if (!isRestoring) {
                        builder2.setTicker(str3);
                    }
                    NotificationCompat.InboxStyle inboxStyle = new NotificationCompat.InboxStyle();
                    if (!isRestoring) {
                        String charSequence = oSNotificationGenerationJob.getTitle() != null ? oSNotificationGenerationJob.getTitle().toString() : null;
                        if (charSequence != null) {
                            str2 = charSequence + " ";
                        }
                        SpannableString spannableString2 = new SpannableString(str2 + oSNotificationGenerationJob.getBody().toString());
                        if (str2.length() > 0) {
                            spannableString2.setSpan(new StyleSpan(1), 0, str2.length(), 0);
                        }
                        inboxStyle.addLine(spannableString2);
                    }
                    for (SpannableString addLine : arrayList) {
                        inboxStyle.addLine(addLine);
                    }
                    inboxStyle.setBigContentTitle(str3);
                    builder2.setStyle(inboxStyle);
                    notification = builder2.build();
                }
                NotificationManagerCompat.from(currentContext).notify(num.intValue(), notification);
            } catch (Throwable th3) {
                th = th3;
                cursor = null;
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            cursor.close();
            throw th;
        }
    }

    private static void createGrouplessSummaryNotification(OSNotificationGenerationJob oSNotificationGenerationJob, IntentGeneratorForAttachingToNotifications intentGeneratorForAttachingToNotifications, int i) {
        JSONObject jsonPayload = oSNotificationGenerationJob.getJsonPayload();
        SecureRandom secureRandom = new SecureRandom();
        String grouplessSummaryKey = OneSignalNotificationManager.getGrouplessSummaryKey();
        String str = i + " new messages";
        int grouplessSummaryId = OneSignalNotificationManager.getGrouplessSummaryId();
        createSummaryIdDatabaseEntry(OneSignalDbHelper.getInstance(currentContext), grouplessSummaryKey, grouplessSummaryId);
        PendingIntent newActionPendingIntent = intentGeneratorForAttachingToNotifications.getNewActionPendingIntent(secureRandom.nextInt(), createBaseSummaryIntent(grouplessSummaryId, intentGeneratorForAttachingToNotifications, jsonPayload, grouplessSummaryKey));
        PendingIntent newDismissActionPendingIntent = getNewDismissActionPendingIntent(secureRandom.nextInt(), getNewBaseDismissIntent(0).putExtra("summary", grouplessSummaryKey));
        NotificationCompat.Builder builder = getBaseOneSignalNotificationBuilder(oSNotificationGenerationJob).compatBuilder;
        if (oSNotificationGenerationJob.getOverriddenSound() != null) {
            builder.setSound(oSNotificationGenerationJob.getOverriddenSound());
        }
        if (oSNotificationGenerationJob.getOverriddenFlags() != null) {
            builder.setDefaults(oSNotificationGenerationJob.getOverriddenFlags().intValue());
        }
        builder.setContentIntent(newActionPendingIntent).setDeleteIntent(newDismissActionPendingIntent).setContentTitle(currentContext.getPackageManager().getApplicationLabel(currentContext.getApplicationInfo())).setContentText(str).setNumber(i).setSmallIcon(getDefaultSmallIconId()).setLargeIcon(getDefaultLargeIcon()).setOnlyAlertOnce(true).setAutoCancel(false).setGroup(grouplessSummaryKey).setGroupSummary(true);
        try {
            builder.setGroupAlertBehavior(groupAlertBehavior.intValue());
        } catch (Throwable unused) {
        }
        NotificationCompat.InboxStyle inboxStyle = new NotificationCompat.InboxStyle();
        inboxStyle.setBigContentTitle(str);
        builder.setStyle(inboxStyle);
        NotificationManagerCompat.from(currentContext).notify(grouplessSummaryId, builder.build());
    }

    private static Intent createBaseSummaryIntent(int i, IntentGeneratorForAttachingToNotifications intentGeneratorForAttachingToNotifications, JSONObject jSONObject, String str) {
        return intentGeneratorForAttachingToNotifications.getNewBaseIntent(i).putExtra(BUNDLE_KEY_ONESIGNAL_DATA, jSONObject.toString()).putExtra("summary", str);
    }

    private static void createSummaryIdDatabaseEntry(OneSignalDbHelper oneSignalDbHelper, String str, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_ANDROID_NOTIFICATION_ID, Integer.valueOf(i));
        contentValues.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_GROUP_ID, str);
        contentValues.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_IS_SUMMARY, 1);
        oneSignalDbHelper.insertOrThrow(OneSignalDbContract.NotificationTable.TABLE_NAME, (String) null, contentValues);
    }

    private static void addBackgroundImage(JSONObject jSONObject, NotificationCompat.Builder builder) throws Throwable {
        JSONObject jSONObject2;
        Bitmap bitmap;
        String str;
        if (Build.VERSION.SDK_INT < 16 || Build.VERSION.SDK_INT >= 31) {
            OneSignal.Log(OneSignal.LOG_LEVEL.VERBOSE, "Cannot use background images in notifications for device on version: " + Build.VERSION.SDK_INT);
            return;
        }
        String optString = jSONObject.optString("bg_img", (String) null);
        if (optString != null) {
            jSONObject2 = new JSONObject(optString);
            bitmap = getBitmap(jSONObject2.optString("img", (String) null));
        } else {
            bitmap = null;
            jSONObject2 = null;
        }
        if (bitmap == null) {
            bitmap = getBitmapFromAssetsOrResourceName("onesignal_bgimage_default_image");
        }
        if (bitmap != null) {
            RemoteViews remoteViews = new RemoteViews(currentContext.getPackageName(), R.layout.onesignal_bgimage_notif_layout);
            remoteViews.setTextViewText(R.id.os_bgimage_notif_title, getTitle(jSONObject));
            remoteViews.setTextViewText(R.id.os_bgimage_notif_body, jSONObject.optString("alert"));
            setTextColor(remoteViews, jSONObject2, R.id.os_bgimage_notif_title, "tc", "onesignal_bgimage_notif_title_color");
            setTextColor(remoteViews, jSONObject2, R.id.os_bgimage_notif_body, "bc", "onesignal_bgimage_notif_body_color");
            if (jSONObject2 == null || !jSONObject2.has("img_align")) {
                int identifier = contextResources.getIdentifier("onesignal_bgimage_notif_image_align", "string", packageName);
                str = identifier != 0 ? contextResources.getString(identifier) : null;
            } else {
                str = jSONObject2.getString("img_align");
            }
            if ("right".equals(str)) {
                remoteViews.setViewPadding(R.id.os_bgimage_notif_bgimage_align_layout, -5000, 0, 0, 0);
                remoteViews.setImageViewBitmap(R.id.os_bgimage_notif_bgimage_right_aligned, bitmap);
                remoteViews.setViewVisibility(R.id.os_bgimage_notif_bgimage_right_aligned, 0);
                remoteViews.setViewVisibility(R.id.os_bgimage_notif_bgimage, 2);
            } else {
                remoteViews.setImageViewBitmap(R.id.os_bgimage_notif_bgimage, bitmap);
            }
            builder.setContent(remoteViews);
            builder.setStyle((NotificationCompat.Style) null);
        }
    }

    private static void setTextColor(RemoteViews remoteViews, JSONObject jSONObject, int i, String str, String str2) {
        Integer safeGetColorFromHex = safeGetColorFromHex(jSONObject, str);
        if (safeGetColorFromHex != null) {
            remoteViews.setTextColor(i, safeGetColorFromHex.intValue());
            return;
        }
        int identifier = contextResources.getIdentifier(str2, "color", packageName);
        if (identifier != 0) {
            remoteViews.setTextColor(i, AndroidSupportV4Compat.ContextCompat.getColor(currentContext, identifier));
        }
    }

    private static Integer safeGetColorFromHex(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        try {
            if (jSONObject.has(str)) {
                return Integer.valueOf(new BigInteger(jSONObject.optString(str), 16).intValue());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Bitmap getLargeIcon(JSONObject jSONObject) {
        Bitmap bitmap = getBitmap(jSONObject.optString("licon"));
        if (bitmap == null) {
            bitmap = getBitmapFromAssetsOrResourceName("ic_onesignal_large_icon_default");
        }
        if (bitmap == null) {
            return null;
        }
        return resizeBitmapForLargeIconArea(bitmap);
    }

    private static Bitmap getDefaultLargeIcon() {
        return resizeBitmapForLargeIconArea(getBitmapFromAssetsOrResourceName("ic_onesignal_large_icon_default"));
    }

    private static Bitmap resizeBitmapForLargeIconArea(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            int dimension = (int) contextResources.getDimension(17104902);
            int dimension2 = (int) contextResources.getDimension(17104901);
            int height = bitmap.getHeight();
            int width = bitmap.getWidth();
            if (width <= dimension2 && height <= dimension) {
                return bitmap;
            }
            if (height > width) {
                dimension2 = (int) (((float) dimension) * (((float) width) / ((float) height)));
            } else if (width > height) {
                dimension = (int) (((float) dimension2) * (((float) height) / ((float) width)));
            }
            return Bitmap.createScaledBitmap(bitmap, dimension2, dimension, true);
        } catch (Throwable unused) {
            return bitmap;
        }
    }

    private static Bitmap getBitmapFromAssetsOrResourceName(String str) {
        Bitmap bitmap;
        try {
            bitmap = BitmapFactory.decodeStream(currentContext.getAssets().open(str));
        } catch (Throwable unused) {
            bitmap = null;
        }
        if (bitmap != null) {
            return bitmap;
        }
        try {
            for (String str2 : Arrays.asList(new String[]{".png", ".webp", ".jpg", ".gif", ".bmp"})) {
                try {
                    bitmap = BitmapFactory.decodeStream(currentContext.getAssets().open(str + str2));
                    continue;
                } catch (Throwable unused2) {
                }
                if (bitmap != null) {
                    return bitmap;
                }
            }
            int resourceIcon = getResourceIcon(str);
            if (resourceIcon != 0) {
                return BitmapFactory.decodeResource(contextResources, resourceIcon);
            }
        } catch (Throwable unused3) {
        }
        return null;
    }

    private static Bitmap getBitmapFromURL(String str) {
        try {
            return BitmapFactory.decodeStream(new URL(str).openConnection().getInputStream());
        } catch (Throwable th) {
            OneSignal.Log(OneSignal.LOG_LEVEL.WARN, "Could not download image!", th);
            return null;
        }
    }

    private static Bitmap getBitmap(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.startsWith("http://") || trim.startsWith("https://")) {
            return getBitmapFromURL(trim);
        }
        return getBitmapFromAssetsOrResourceName(str);
    }

    private static int getResourceIcon(String str) {
        if (str == null) {
            return 0;
        }
        String trim = str.trim();
        if (!OSUtils.isValidResourceName(trim)) {
            return 0;
        }
        int drawableId = getDrawableId(trim);
        if (drawableId != 0) {
            return drawableId;
        }
        try {
            return R.drawable.class.getField(str).getInt((Object) null);
        } catch (Throwable unused) {
            return 0;
        }
    }

    private static int getSmallIconId(JSONObject jSONObject) {
        int resourceIcon = getResourceIcon(jSONObject.optString("sicon", (String) null));
        if (resourceIcon != 0) {
            return resourceIcon;
        }
        return getDefaultSmallIconId();
    }

    private static int getDefaultSmallIconId() {
        int drawableId = getDrawableId("ic_stat_onesignal_default");
        if (drawableId != 0) {
            return drawableId;
        }
        int drawableId2 = getDrawableId("corona_statusbar_icon_default");
        if (drawableId2 != 0) {
            return drawableId2;
        }
        int drawableId3 = getDrawableId("ic_os_notification_fallback_white_24dp");
        if (drawableId3 != 0) {
            return drawableId3;
        }
        return 17301598;
    }

    private static int getDrawableId(String str) {
        return contextResources.getIdentifier(str, "drawable", packageName);
    }

    private static boolean isSoundEnabled(JSONObject jSONObject) {
        String optString = jSONObject.optString("sound", (String) null);
        return !"null".equals(optString) && !"nil".equals(optString);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|(2:4|5)|6|7|(2:9|10)|11|12|(2:14|15)|16) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0025 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0015 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002f A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001f A[Catch:{ all -> 0x0025 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.math.BigInteger getAccentColor(org.json.JSONObject r4) {
        /*
            java.lang.String r0 = "bgac"
            r1 = 16
            r2 = 0
            boolean r3 = r4.has(r0)     // Catch:{ all -> 0x0015 }
            if (r3 == 0) goto L_0x0015
            java.math.BigInteger r3 = new java.math.BigInteger     // Catch:{ all -> 0x0015 }
            java.lang.String r4 = r4.optString(r0, r2)     // Catch:{ all -> 0x0015 }
            r3.<init>(r4, r1)     // Catch:{ all -> 0x0015 }
            return r3
        L_0x0015:
            android.content.Context r4 = com.onesignal.OneSignal.appContext     // Catch:{ all -> 0x0025 }
            java.lang.String r0 = "onesignal_notification_accent_color"
            java.lang.String r4 = com.onesignal.OSUtils.getResourceString(r4, r0, r2)     // Catch:{ all -> 0x0025 }
            if (r4 == 0) goto L_0x0025
            java.math.BigInteger r0 = new java.math.BigInteger     // Catch:{ all -> 0x0025 }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x0025 }
            return r0
        L_0x0025:
            android.content.Context r4 = com.onesignal.OneSignal.appContext     // Catch:{ all -> 0x0035 }
            java.lang.String r0 = "com.onesignal.NotificationAccentColor.DEFAULT"
            java.lang.String r4 = com.onesignal.OSUtils.getManifestMeta(r4, r0)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x0035
            java.math.BigInteger r0 = new java.math.BigInteger     // Catch:{ all -> 0x0035 }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x0035 }
            return r0
        L_0x0035:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.GenerateNotification.getAccentColor(org.json.JSONObject):java.math.BigInteger");
    }

    private static void addNotificationActionButtons(JSONObject jSONObject, IntentGeneratorForAttachingToNotifications intentGeneratorForAttachingToNotifications, NotificationCompat.Builder builder, int i, String str) {
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.optString(OSNotificationFormatHelper.PAYLOAD_OS_ROOT_CUSTOM));
            if (jSONObject2.has(NotificationBundleProcessor.PUSH_ADDITIONAL_DATA_KEY)) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject(NotificationBundleProcessor.PUSH_ADDITIONAL_DATA_KEY);
                if (jSONObject3.has("actionButtons")) {
                    JSONArray jSONArray = jSONObject3.getJSONArray("actionButtons");
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                        JSONObject jSONObject4 = new JSONObject(jSONObject.toString());
                        Intent newBaseIntent = intentGeneratorForAttachingToNotifications.getNewBaseIntent(i);
                        newBaseIntent.setAction("" + i2);
                        newBaseIntent.putExtra("action_button", true);
                        jSONObject4.put(BUNDLE_KEY_ACTION_ID, optJSONObject.optString(OSOutcomeConstants.OUTCOME_ID));
                        newBaseIntent.putExtra(BUNDLE_KEY_ONESIGNAL_DATA, jSONObject4.toString());
                        if (str != null) {
                            newBaseIntent.putExtra("summary", str);
                        } else if (jSONObject.has("grp")) {
                            newBaseIntent.putExtra("grp", jSONObject.optString("grp"));
                        }
                        builder.addAction(optJSONObject.has("icon") ? getResourceIcon(optJSONObject.optString("icon")) : 0, optJSONObject.optString("text"), intentGeneratorForAttachingToNotifications.getNewActionPendingIntent(i, newBaseIntent));
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static void addAlertButtons(Context context, JSONObject jSONObject, List<String> list, List<String> list2) {
        try {
            addCustomAlertButtons(jSONObject, list, list2);
        } catch (Throwable th) {
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Failed to parse JSON for custom buttons for alert dialog.", th);
        }
        if (list.size() == 0 || list.size() < 3) {
            list.add(OSUtils.getResourceString(context, "onesignal_in_app_alert_ok_button_text", "Ok"));
            list2.add("__DEFAULT__");
        }
    }

    private static void addCustomAlertButtons(JSONObject jSONObject, List<String> list, List<String> list2) throws JSONException {
        JSONObject jSONObject2 = new JSONObject(jSONObject.optString(OSNotificationFormatHelper.PAYLOAD_OS_ROOT_CUSTOM));
        if (jSONObject2.has(NotificationBundleProcessor.PUSH_ADDITIONAL_DATA_KEY)) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject(NotificationBundleProcessor.PUSH_ADDITIONAL_DATA_KEY);
            if (jSONObject3.has("actionButtons")) {
                JSONArray optJSONArray = jSONObject3.optJSONArray("actionButtons");
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject jSONObject4 = optJSONArray.getJSONObject(i);
                    list.add(jSONObject4.optString("text"));
                    list2.add(jSONObject4.optString(OSOutcomeConstants.OUTCOME_ID));
                }
            }
        }
    }
}
