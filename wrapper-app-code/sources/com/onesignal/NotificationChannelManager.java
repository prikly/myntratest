package com.onesignal;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import com.onesignal.OneSignal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class NotificationChannelManager {
    private static final String CHANNEL_PREFIX = "OS_";
    private static final String DEFAULT_CHANNEL_ID = "fcm_fallback_notification_channel";
    private static final String RESTORE_CHANNEL_ID = "restored_OS_notifications";
    private static final Pattern hexPattern = Pattern.compile("^([A-Fa-f0-9]{8})$");

    private static int priorityToImportance(int i) {
        if (i > 9) {
            return 5;
        }
        if (i > 7) {
            return 4;
        }
        if (i > 5) {
            return 3;
        }
        if (i > 3) {
            return 2;
        }
        return i > 1 ? 1 : 0;
    }

    NotificationChannelManager() {
    }

    static String createNotificationChannel(OSNotificationGenerationJob oSNotificationGenerationJob) {
        if (Build.VERSION.SDK_INT < 26) {
            return DEFAULT_CHANNEL_ID;
        }
        Context context = oSNotificationGenerationJob.getContext();
        JSONObject jsonPayload = oSNotificationGenerationJob.getJsonPayload();
        NotificationManager notificationManager = OneSignalNotificationManager.getNotificationManager(context);
        if (oSNotificationGenerationJob.isRestoring()) {
            return createRestoreChannel(notificationManager);
        }
        if (jsonPayload.has("oth_chnl")) {
            String optString = jsonPayload.optString("oth_chnl");
            if (notificationManager.getNotificationChannel(optString) != null) {
                return optString;
            }
        }
        if (!jsonPayload.has("chnl")) {
            return createDefaultChannel(notificationManager);
        }
        try {
            return createChannel(context, notificationManager, jsonPayload);
        } catch (JSONException e2) {
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Could not create notification channel due to JSON payload error!", e2);
            return DEFAULT_CHANNEL_ID;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0136  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String createChannel(android.content.Context r7, android.app.NotificationManager r8, org.json.JSONObject r9) throws org.json.JSONException {
        /*
            java.lang.String r0 = "chnl"
            java.lang.Object r0 = r9.opt(r0)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L_0x0012
            org.json.JSONObject r1 = new org.json.JSONObject
            java.lang.String r0 = (java.lang.String) r0
            r1.<init>(r0)
            goto L_0x0015
        L_0x0012:
            r1 = r0
            org.json.JSONObject r1 = (org.json.JSONObject) r1
        L_0x0015:
            java.lang.String r0 = "id"
            java.lang.String r2 = "fcm_fallback_notification_channel"
            java.lang.String r0 = r1.optString(r0, r2)
            java.lang.String r3 = "miscellaneous"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            r2 = r0
        L_0x0027:
            java.lang.String r0 = "langs"
            boolean r3 = r1.has(r0)
            if (r3 == 0) goto L_0x0046
            org.json.JSONObject r0 = r1.getJSONObject(r0)
            com.onesignal.language.LanguageContext r3 = com.onesignal.language.LanguageContext.getInstance()
            java.lang.String r3 = r3.getLanguage()
            boolean r4 = r0.has(r3)
            if (r4 == 0) goto L_0x0046
            org.json.JSONObject r0 = r0.optJSONObject(r3)
            goto L_0x0047
        L_0x0046:
            r0 = r1
        L_0x0047:
            java.lang.String r3 = "nm"
            java.lang.String r4 = "Miscellaneous"
            java.lang.String r3 = r0.optString(r3, r4)
            r4 = 6
            java.lang.String r5 = "pri"
            int r4 = r9.optInt(r5, r4)
            int r4 = priorityToImportance(r4)
            android.app.NotificationChannel r5 = new android.app.NotificationChannel
            r5.<init>(r2, r3, r4)
            java.lang.String r3 = "dscr"
            r4 = 0
            java.lang.String r3 = r0.optString(r3, r4)
            r5.setDescription(r3)
            java.lang.String r3 = "grp_id"
            boolean r6 = r1.has(r3)
            if (r6 == 0) goto L_0x0086
            java.lang.String r1 = r1.optString(r3)
            java.lang.String r3 = "grp_nm"
            java.lang.String r0 = r0.optString(r3)
            android.app.NotificationChannelGroup r3 = new android.app.NotificationChannelGroup
            r3.<init>(r1, r0)
            r8.createNotificationChannelGroup(r3)
            r5.setGroup(r1)
        L_0x0086:
            java.lang.String r0 = "ledc"
            boolean r1 = r9.has(r0)
            if (r1 == 0) goto L_0x00be
            java.lang.String r0 = r9.optString(r0)
            java.util.regex.Pattern r1 = hexPattern
            java.util.regex.Matcher r1 = r1.matcher(r0)
            boolean r1 = r1.matches()
            if (r1 != 0) goto L_0x00a7
            com.onesignal.OneSignal$LOG_LEVEL r0 = com.onesignal.OneSignal.LOG_LEVEL.WARN
            java.lang.String r1 = "OneSignal LED Color Settings: ARGB Hex value incorrect format (E.g: FF9900FF)"
            com.onesignal.OneSignal.Log(r0, r1)
            java.lang.String r0 = "FFFFFFFF"
        L_0x00a7:
            java.math.BigInteger r1 = new java.math.BigInteger     // Catch:{ all -> 0x00b6 }
            r3 = 16
            r1.<init>(r0, r3)     // Catch:{ all -> 0x00b6 }
            int r0 = r1.intValue()     // Catch:{ all -> 0x00b6 }
            r5.setLightColor(r0)     // Catch:{ all -> 0x00b6 }
            goto L_0x00be
        L_0x00b6:
            r0 = move-exception
            com.onesignal.OneSignal$LOG_LEVEL r1 = com.onesignal.OneSignal.LOG_LEVEL.ERROR
            java.lang.String r3 = "Couldn't convert ARGB Hex value to BigInteger:"
            com.onesignal.OneSignal.Log(r1, r3, r0)
        L_0x00be:
            java.lang.String r0 = "led"
            r1 = 1
            int r0 = r9.optInt(r0, r1)
            r3 = 0
            if (r0 != r1) goto L_0x00ca
            r0 = 1
            goto L_0x00cb
        L_0x00ca:
            r0 = 0
        L_0x00cb:
            r5.enableLights(r0)
            java.lang.String r0 = "vib_pt"
            boolean r0 = r9.has(r0)
            if (r0 == 0) goto L_0x00df
            long[] r0 = com.onesignal.OSUtils.parseVibrationPattern(r9)
            if (r0 == 0) goto L_0x00df
            r5.setVibrationPattern(r0)
        L_0x00df:
            java.lang.String r0 = "vib"
            int r0 = r9.optInt(r0, r1)
            if (r0 != r1) goto L_0x00e9
            r0 = 1
            goto L_0x00ea
        L_0x00e9:
            r0 = 0
        L_0x00ea:
            r5.enableVibration(r0)
            java.lang.String r0 = "sound"
            boolean r6 = r9.has(r0)
            if (r6 == 0) goto L_0x0116
            java.lang.String r0 = r9.optString(r0, r4)
            android.net.Uri r7 = com.onesignal.OSUtils.getSoundUri(r7, r0)
            if (r7 == 0) goto L_0x0103
            r5.setSound(r7, r4)
            goto L_0x0116
        L_0x0103:
            java.lang.String r7 = "null"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0113
            java.lang.String r7 = "nil"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0116
        L_0x0113:
            r5.setSound(r4, r4)
        L_0x0116:
            java.lang.String r7 = "vis"
            int r7 = r9.optInt(r7, r3)
            r5.setLockscreenVisibility(r7)
            java.lang.String r7 = "bdg"
            int r7 = r9.optInt(r7, r1)
            if (r7 != r1) goto L_0x0129
            r7 = 1
            goto L_0x012a
        L_0x0129:
            r7 = 0
        L_0x012a:
            r5.setShowBadge(r7)
            java.lang.String r7 = "bdnd"
            int r7 = r9.optInt(r7, r3)
            if (r7 != r1) goto L_0x0136
            goto L_0x0137
        L_0x0136:
            r1 = 0
        L_0x0137:
            r5.setBypassDnd(r1)
            com.onesignal.OneSignal$LOG_LEVEL r7 = com.onesignal.OneSignal.LOG_LEVEL.VERBOSE
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Creating notification channel with channel:\n"
            r9.append(r0)
            java.lang.String r0 = r5.toString()
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            com.onesignal.OneSignal.onesignalLog(r7, r9)
            r8.createNotificationChannel(r5)     // Catch:{ IllegalArgumentException -> 0x0158 }
            goto L_0x015c
        L_0x0158:
            r7 = move-exception
            r7.printStackTrace()
        L_0x015c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.NotificationChannelManager.createChannel(android.content.Context, android.app.NotificationManager, org.json.JSONObject):java.lang.String");
    }

    private static String createDefaultChannel(NotificationManager notificationManager) {
        NotificationChannel notificationChannel = new NotificationChannel(DEFAULT_CHANNEL_ID, "Miscellaneous", 3);
        notificationChannel.enableLights(true);
        notificationChannel.enableVibration(true);
        notificationManager.createNotificationChannel(notificationChannel);
        return DEFAULT_CHANNEL_ID;
    }

    private static String createRestoreChannel(NotificationManager notificationManager) {
        notificationManager.createNotificationChannel(new NotificationChannel(RESTORE_CHANNEL_ID, "Restored", 2));
        return RESTORE_CHANNEL_ID;
    }

    static void processChannelList(Context context, JSONArray jSONArray) {
        if (Build.VERSION.SDK_INT >= 26 && jSONArray != null && jSONArray.length() != 0) {
            NotificationManager notificationManager = OneSignalNotificationManager.getNotificationManager(context);
            HashSet hashSet = new HashSet();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    hashSet.add(createChannel(context, notificationManager, jSONArray.getJSONObject(i)));
                } catch (JSONException e2) {
                    OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Could not create notification channel due to JSON payload error!", e2);
                }
            }
            if (!hashSet.isEmpty()) {
                List<NotificationChannel> arrayList = new ArrayList<>();
                try {
                    arrayList = notificationManager.getNotificationChannels();
                } catch (NullPointerException e3) {
                    OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.ERROR;
                    OneSignal.onesignalLog(log_level, "Error when trying to delete notification channel: " + e3.getMessage());
                }
                for (NotificationChannel id : arrayList) {
                    String id2 = id.getId();
                    if (id2.startsWith(CHANNEL_PREFIX) && !hashSet.contains(id2)) {
                        notificationManager.deleteNotificationChannel(id2);
                    }
                }
            }
        }
    }
}
