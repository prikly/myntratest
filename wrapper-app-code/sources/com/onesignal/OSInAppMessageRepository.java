package com.onesignal;

import android.content.ContentValues;
import com.facebook.ads.AdSDKNotificationListener;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalDbContract;
import com.onesignal.OneSignalRestClient;
import com.onesignal.outcomes.OSOutcomeConstants;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

class OSInAppMessageRepository {
    static final long IAM_CACHE_DATA_LIFETIME = 15552000;
    static final String IAM_DATA_RESPONSE_RETRY_KEY = "retry";
    private final OneSignalDbHelper dbHelper;
    /* access modifiers changed from: private */
    public int htmlNetworkRequestAttemptCount = 0;
    private final OSLogger logger;
    private final OSSharedPreferences sharedPreferences;

    interface OSInAppMessageRequestResponse {
        void onFailure(String str);

        void onSuccess(String str);
    }

    static /* synthetic */ int access$408(OSInAppMessageRepository oSInAppMessageRepository) {
        int i = oSInAppMessageRepository.htmlNetworkRequestAttemptCount;
        oSInAppMessageRepository.htmlNetworkRequestAttemptCount = i + 1;
        return i;
    }

    OSInAppMessageRepository(OneSignalDbHelper oneSignalDbHelper, OSLogger oSLogger, OSSharedPreferences oSSharedPreferences) {
        this.dbHelper = oneSignalDbHelper;
        this.logger = oSLogger;
        this.sharedPreferences = oSSharedPreferences;
    }

    /* access modifiers changed from: package-private */
    public void sendIAMClick(String str, String str2, String str3, int i, String str4, String str5, boolean z, Set<String> set, OSInAppMessageRequestResponse oSInAppMessageRequestResponse) {
        try {
            final String str6 = str;
            final int i2 = i;
            final String str7 = str2;
            final String str8 = str5;
            final String str9 = str3;
            final boolean z2 = z;
            AnonymousClass1 r1 = new JSONObject() {
                {
                    put(OSOutcomeConstants.APP_ID, str6);
                    put(OSOutcomeConstants.DEVICE_TYPE, i2);
                    put("player_id", str7);
                    put("click_id", str8);
                    put("variant_id", str9);
                    if (z2) {
                        put("first_click", true);
                    }
                }
            };
            StringBuilder sb = new StringBuilder();
            sb.append("in_app_messages/");
            String str10 = str4;
            sb.append(str4);
            sb.append("/click");
            final Set<String> set2 = set;
            final OSInAppMessageRequestResponse oSInAppMessageRequestResponse2 = oSInAppMessageRequestResponse;
            OneSignalRestClient.post(sb.toString(), r1, new OneSignalRestClient.ResponseHandler() {
                /* access modifiers changed from: package-private */
                public void onSuccess(String str) {
                    OSInAppMessageRepository.this.printHttpSuccessForInAppMessageRequest("engagement", str);
                    OSInAppMessageRepository.this.saveClickedMessagesId(set2);
                }

                /* access modifiers changed from: package-private */
                public void onFailure(int i, String str, Throwable th) {
                    OSInAppMessageRepository.this.printHttpErrorForInAppMessageRequest("engagement", i, str);
                    oSInAppMessageRequestResponse2.onFailure(str);
                }
            });
        } catch (JSONException e2) {
            e2.printStackTrace();
            this.logger.error("Unable to execute in-app message action HTTP request due to invalid JSON");
        }
    }

    /* access modifiers changed from: package-private */
    public void sendIAMPageImpression(String str, String str2, String str3, int i, String str4, String str5, Set<String> set, OSInAppMessageRequestResponse oSInAppMessageRequestResponse) {
        try {
            final String str6 = str;
            final String str7 = str2;
            final String str8 = str3;
            final int i2 = i;
            final String str9 = str5;
            AnonymousClass3 r1 = new JSONObject() {
                {
                    put(OSOutcomeConstants.APP_ID, str6);
                    put("player_id", str7);
                    put("variant_id", str8);
                    put(OSOutcomeConstants.DEVICE_TYPE, i2);
                    put("page_id", str9);
                }
            };
            StringBuilder sb = new StringBuilder();
            sb.append("in_app_messages/");
            String str10 = str4;
            sb.append(str4);
            sb.append("/pageImpression");
            final Set<String> set2 = set;
            final OSInAppMessageRequestResponse oSInAppMessageRequestResponse2 = oSInAppMessageRequestResponse;
            OneSignalRestClient.post(sb.toString(), r1, new OneSignalRestClient.ResponseHandler() {
                /* access modifiers changed from: package-private */
                public void onSuccess(String str) {
                    OSInAppMessageRepository.this.printHttpSuccessForInAppMessageRequest("page impression", str);
                    OSInAppMessageRepository.this.saveViewPageImpressionedIds(set2);
                }

                /* access modifiers changed from: package-private */
                public void onFailure(int i, String str, Throwable th) {
                    OSInAppMessageRepository.this.printHttpErrorForInAppMessageRequest("page impression", i, str);
                    oSInAppMessageRequestResponse2.onFailure(str);
                }
            });
        } catch (JSONException e2) {
            e2.printStackTrace();
            this.logger.error("Unable to execute in-app message impression HTTP request due to invalid JSON");
        }
    }

    /* access modifiers changed from: package-private */
    public void sendIAMImpression(String str, String str2, String str3, int i, String str4, final Set<String> set, final OSInAppMessageRequestResponse oSInAppMessageRequestResponse) {
        try {
            final String str5 = str;
            final String str6 = str2;
            final String str7 = str3;
            final int i2 = i;
            AnonymousClass5 r0 = new JSONObject() {
                {
                    put(OSOutcomeConstants.APP_ID, str5);
                    put("player_id", str6);
                    put("variant_id", str7);
                    put(OSOutcomeConstants.DEVICE_TYPE, i2);
                    put("first_impression", true);
                }
            };
            OneSignalRestClient.post("in_app_messages/" + str4 + "/impression", r0, new OneSignalRestClient.ResponseHandler() {
                /* access modifiers changed from: package-private */
                public void onSuccess(String str) {
                    OSInAppMessageRepository.this.printHttpSuccessForInAppMessageRequest(AdSDKNotificationListener.IMPRESSION_EVENT, str);
                    OSInAppMessageRepository.this.saveImpressionedMessages(set);
                }

                /* access modifiers changed from: package-private */
                public void onFailure(int i, String str, Throwable th) {
                    OSInAppMessageRepository.this.printHttpErrorForInAppMessageRequest(AdSDKNotificationListener.IMPRESSION_EVENT, i, str);
                    oSInAppMessageRequestResponse.onFailure(str);
                }
            });
        } catch (JSONException e2) {
            e2.printStackTrace();
            this.logger.error("Unable to execute in-app message impression HTTP request due to invalid JSON");
        }
    }

    /* access modifiers changed from: package-private */
    public void getIAMPreviewData(String str, String str2, final OSInAppMessageRequestResponse oSInAppMessageRequestResponse) {
        OneSignalRestClient.get("in_app_messages/device_preview?preview_id=" + str2 + "&app_id=" + str, new OneSignalRestClient.ResponseHandler() {
            /* access modifiers changed from: package-private */
            public void onFailure(int i, String str, Throwable th) {
                OSInAppMessageRepository.this.printHttpErrorForInAppMessageRequest(OSInAppMessageContentKt.HTML, i, str);
                oSInAppMessageRequestResponse.onFailure(str);
            }

            /* access modifiers changed from: package-private */
            public void onSuccess(String str) {
                oSInAppMessageRequestResponse.onSuccess(str);
            }
        }, (String) null);
    }

    /* access modifiers changed from: package-private */
    public void getIAMData(String str, String str2, String str3, final OSInAppMessageRequestResponse oSInAppMessageRequestResponse) {
        OneSignalRestClient.get(htmlPathForMessage(str2, str3, str), new OneSignalRestClient.ResponseHandler() {
            /* access modifiers changed from: package-private */
            public void onFailure(int i, String str, Throwable th) {
                OSInAppMessageRepository.this.printHttpErrorForInAppMessageRequest(OSInAppMessageContentKt.HTML, i, str);
                JSONObject jSONObject = new JSONObject();
                if (!OSUtils.shouldRetryNetworkRequest(i) || OSInAppMessageRepository.this.htmlNetworkRequestAttemptCount >= OSUtils.MAX_NETWORK_REQUEST_ATTEMPT_COUNT) {
                    int unused = OSInAppMessageRepository.this.htmlNetworkRequestAttemptCount = 0;
                    try {
                        jSONObject.put(OSInAppMessageRepository.IAM_DATA_RESPONSE_RETRY_KEY, false);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                } else {
                    OSInAppMessageRepository.access$408(OSInAppMessageRepository.this);
                    try {
                        jSONObject.put(OSInAppMessageRepository.IAM_DATA_RESPONSE_RETRY_KEY, true);
                    } catch (JSONException e3) {
                        e3.printStackTrace();
                    }
                }
                oSInAppMessageRequestResponse.onFailure(jSONObject.toString());
            }

            /* access modifiers changed from: package-private */
            public void onSuccess(String str) {
                int unused = OSInAppMessageRepository.this.htmlNetworkRequestAttemptCount = 0;
                oSInAppMessageRequestResponse.onSuccess(str);
            }
        }, (String) null);
    }

    /* access modifiers changed from: package-private */
    public synchronized void saveInAppMessage(OSInAppMessageInternal oSInAppMessageInternal) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(OneSignalDbContract.InAppMessageTable.COLUMN_NAME_MESSAGE_ID, oSInAppMessageInternal.messageId);
        contentValues.put(OneSignalDbContract.InAppMessageTable.COLUMN_NAME_DISPLAY_QUANTITY, Integer.valueOf(oSInAppMessageInternal.getRedisplayStats().getDisplayQuantity()));
        contentValues.put(OneSignalDbContract.InAppMessageTable.COLUMN_NAME_LAST_DISPLAY, Long.valueOf(oSInAppMessageInternal.getRedisplayStats().getLastDisplayTime()));
        contentValues.put(OneSignalDbContract.InAppMessageTable.COLUMN_CLICK_IDS, oSInAppMessageInternal.getClickedClickIds().toString());
        contentValues.put(OneSignalDbContract.InAppMessageTable.COLUMN_DISPLAYED_IN_SESSION, Boolean.valueOf(oSInAppMessageInternal.isDisplayedInSession()));
        if (this.dbHelper.update(OneSignalDbContract.InAppMessageTable.TABLE_NAME, contentValues, "message_id = ?", new String[]{oSInAppMessageInternal.messageId}) == 0) {
            this.dbHelper.insert(OneSignalDbContract.InAppMessageTable.TABLE_NAME, (String) null, contentValues);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0074, code lost:
        if (r1.isClosed() == false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0076, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008a, code lost:
        if (r1.isClosed() == false) goto L_0x0076;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.List<com.onesignal.OSInAppMessageInternal> getCachedInAppMessages() {
        /*
            r10 = this;
            monitor-enter(r10)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x009b }
            r0.<init>()     // Catch:{ all -> 0x009b }
            r1 = 0
            com.onesignal.OneSignalDbHelper r2 = r10.dbHelper     // Catch:{ JSONException -> 0x007c }
            java.lang.String r3 = "in_app_message"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ JSONException -> 0x007c }
            boolean r2 = r1.moveToFirst()     // Catch:{ JSONException -> 0x007c }
            if (r2 == 0) goto L_0x006e
        L_0x001b:
            java.lang.String r2 = "message_id"
            int r2 = r1.getColumnIndex(r2)     // Catch:{ JSONException -> 0x007c }
            java.lang.String r2 = r1.getString(r2)     // Catch:{ JSONException -> 0x007c }
            java.lang.String r3 = "click_ids"
            int r3 = r1.getColumnIndex(r3)     // Catch:{ JSONException -> 0x007c }
            java.lang.String r3 = r1.getString(r3)     // Catch:{ JSONException -> 0x007c }
            java.lang.String r4 = "display_quantity"
            int r4 = r1.getColumnIndex(r4)     // Catch:{ JSONException -> 0x007c }
            int r4 = r1.getInt(r4)     // Catch:{ JSONException -> 0x007c }
            java.lang.String r5 = "last_display"
            int r5 = r1.getColumnIndex(r5)     // Catch:{ JSONException -> 0x007c }
            long r5 = r1.getLong(r5)     // Catch:{ JSONException -> 0x007c }
            java.lang.String r7 = "displayed_in_session"
            int r7 = r1.getColumnIndex(r7)     // Catch:{ JSONException -> 0x007c }
            int r7 = r1.getInt(r7)     // Catch:{ JSONException -> 0x007c }
            r8 = 1
            if (r7 != r8) goto L_0x0051
            goto L_0x0052
        L_0x0051:
            r8 = 0
        L_0x0052:
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch:{ JSONException -> 0x007c }
            r7.<init>(r3)     // Catch:{ JSONException -> 0x007c }
            java.util.Set r3 = com.onesignal.OSUtils.newStringSetFromJSONArray(r7)     // Catch:{ JSONException -> 0x007c }
            com.onesignal.OSInAppMessageInternal r7 = new com.onesignal.OSInAppMessageInternal     // Catch:{ JSONException -> 0x007c }
            com.onesignal.OSInAppMessageRedisplayStats r9 = new com.onesignal.OSInAppMessageRedisplayStats     // Catch:{ JSONException -> 0x007c }
            r9.<init>(r4, r5)     // Catch:{ JSONException -> 0x007c }
            r7.<init>(r2, r3, r8, r9)     // Catch:{ JSONException -> 0x007c }
            r0.add(r7)     // Catch:{ JSONException -> 0x007c }
            boolean r2 = r1.moveToNext()     // Catch:{ JSONException -> 0x007c }
            if (r2 != 0) goto L_0x001b
        L_0x006e:
            if (r1 == 0) goto L_0x008d
            boolean r2 = r1.isClosed()     // Catch:{ all -> 0x009b }
            if (r2 != 0) goto L_0x008d
        L_0x0076:
            r1.close()     // Catch:{ all -> 0x009b }
            goto L_0x008d
        L_0x007a:
            r0 = move-exception
            goto L_0x008f
        L_0x007c:
            r2 = move-exception
            com.onesignal.OneSignal$LOG_LEVEL r3 = com.onesignal.OneSignal.LOG_LEVEL.ERROR     // Catch:{ all -> 0x007a }
            java.lang.String r4 = "Generating JSONArray from iam click ids:JSON Failed."
            com.onesignal.OneSignal.Log(r3, r4, r2)     // Catch:{ all -> 0x007a }
            if (r1 == 0) goto L_0x008d
            boolean r2 = r1.isClosed()     // Catch:{ all -> 0x009b }
            if (r2 != 0) goto L_0x008d
            goto L_0x0076
        L_0x008d:
            monitor-exit(r10)
            return r0
        L_0x008f:
            if (r1 == 0) goto L_0x009a
            boolean r2 = r1.isClosed()     // Catch:{ all -> 0x009b }
            if (r2 != 0) goto L_0x009a
            r1.close()     // Catch:{ all -> 0x009b }
        L_0x009a:
            throw r0     // Catch:{ all -> 0x009b }
        L_0x009b:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.OSInAppMessageRepository.getCachedInAppMessages():java.util.List");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0074, code lost:
        if (r12.isClosed() == false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void cleanCachedInAppMessages() {
        /*
            r13 = this;
            monitor-enter(r13)
            java.lang.String r0 = "message_id"
            java.lang.String r1 = "click_ids"
            java.lang.String[] r4 = new java.lang.String[]{r0, r1}     // Catch:{ all -> 0x00b8 }
            java.lang.String r0 = "last_display < ?"
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00b8 }
            r5 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r5
            r5 = 15552000(0xed4e00, double:7.683709E-317)
            long r1 = r1 - r5
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00b8 }
            r2 = 1
            java.lang.String[] r10 = new java.lang.String[r2]     // Catch:{ all -> 0x00b8 }
            r2 = 0
            r10[r2] = r1     // Catch:{ all -> 0x00b8 }
            java.util.Set r1 = com.onesignal.OSUtils.newConcurrentSet()     // Catch:{ all -> 0x00b8 }
            java.util.Set r11 = com.onesignal.OSUtils.newConcurrentSet()     // Catch:{ all -> 0x00b8 }
            r12 = 0
            com.onesignal.OneSignalDbHelper r2 = r13.dbHelper     // Catch:{ JSONException -> 0x0090 }
            java.lang.String r3 = "in_app_message"
            r7 = 0
            r8 = 0
            r9 = 0
            r5 = r0
            r6 = r10
            android.database.Cursor r12 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ JSONException -> 0x0090 }
            if (r12 == 0) goto L_0x007a
            int r2 = r12.getCount()     // Catch:{ JSONException -> 0x0090 }
            if (r2 != 0) goto L_0x003f
            goto L_0x007a
        L_0x003f:
            boolean r2 = r12.moveToFirst()     // Catch:{ JSONException -> 0x0090 }
            if (r2 == 0) goto L_0x006e
        L_0x0045:
            java.lang.String r2 = "message_id"
            int r2 = r12.getColumnIndex(r2)     // Catch:{ JSONException -> 0x0090 }
            java.lang.String r2 = r12.getString(r2)     // Catch:{ JSONException -> 0x0090 }
            java.lang.String r3 = "click_ids"
            int r3 = r12.getColumnIndex(r3)     // Catch:{ JSONException -> 0x0090 }
            java.lang.String r3 = r12.getString(r3)     // Catch:{ JSONException -> 0x0090 }
            r1.add(r2)     // Catch:{ JSONException -> 0x0090 }
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0090 }
            r2.<init>(r3)     // Catch:{ JSONException -> 0x0090 }
            java.util.Set r2 = com.onesignal.OSUtils.newStringSetFromJSONArray(r2)     // Catch:{ JSONException -> 0x0090 }
            r11.addAll(r2)     // Catch:{ JSONException -> 0x0090 }
            boolean r2 = r12.moveToNext()     // Catch:{ JSONException -> 0x0090 }
            if (r2 != 0) goto L_0x0045
        L_0x006e:
            if (r12 == 0) goto L_0x009d
            boolean r2 = r12.isClosed()     // Catch:{ all -> 0x00b8 }
            if (r2 != 0) goto L_0x009d
        L_0x0076:
            r12.close()     // Catch:{ all -> 0x00b8 }
            goto L_0x009d
        L_0x007a:
            com.onesignal.OneSignal$LOG_LEVEL r2 = com.onesignal.OneSignal.LOG_LEVEL.DEBUG     // Catch:{ JSONException -> 0x0090 }
            java.lang.String r3 = "Attempted to clean 6 month old IAM data, but none exists!"
            com.onesignal.OneSignal.onesignalLog(r2, r3)     // Catch:{ JSONException -> 0x0090 }
            if (r12 == 0) goto L_0x008c
            boolean r0 = r12.isClosed()     // Catch:{ all -> 0x00b8 }
            if (r0 != 0) goto L_0x008c
            r12.close()     // Catch:{ all -> 0x00b8 }
        L_0x008c:
            monitor-exit(r13)
            return
        L_0x008e:
            r0 = move-exception
            goto L_0x00ac
        L_0x0090:
            r2 = move-exception
            r2.printStackTrace()     // Catch:{ all -> 0x008e }
            if (r12 == 0) goto L_0x009d
            boolean r2 = r12.isClosed()     // Catch:{ all -> 0x00b8 }
            if (r2 != 0) goto L_0x009d
            goto L_0x0076
        L_0x009d:
            com.onesignal.OneSignalDbHelper r2 = r13.dbHelper     // Catch:{ all -> 0x00b8 }
            java.lang.String r3 = "in_app_message"
            r2.delete(r3, r0, r10)     // Catch:{ all -> 0x00b8 }
            r13.cleanInAppMessageIds(r1)     // Catch:{ all -> 0x00b8 }
            r13.cleanInAppMessageClickedClickIds(r11)     // Catch:{ all -> 0x00b8 }
            monitor-exit(r13)
            return
        L_0x00ac:
            if (r12 == 0) goto L_0x00b7
            boolean r1 = r12.isClosed()     // Catch:{ all -> 0x00b8 }
            if (r1 != 0) goto L_0x00b7
            r12.close()     // Catch:{ all -> 0x00b8 }
        L_0x00b7:
            throw r0     // Catch:{ all -> 0x00b8 }
        L_0x00b8:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.OSInAppMessageRepository.cleanCachedInAppMessages():void");
    }

    private void cleanInAppMessageIds(Set<String> set) {
        if (set != null && set.size() > 0) {
            Set<String> stringSet = OneSignalPrefs.getStringSet(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_DISMISSED_IAMS, (Set<String>) null);
            Set<String> stringSet2 = OneSignalPrefs.getStringSet(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_IMPRESSIONED_IAMS, (Set<String>) null);
            if (stringSet != null && stringSet.size() > 0) {
                stringSet.removeAll(set);
                OneSignalPrefs.saveStringSet(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_DISMISSED_IAMS, stringSet);
            }
            if (stringSet2 != null && stringSet2.size() > 0) {
                stringSet2.removeAll(set);
                OneSignalPrefs.saveStringSet(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_IMPRESSIONED_IAMS, stringSet2);
            }
        }
    }

    private void cleanInAppMessageClickedClickIds(Set<String> set) {
        Set<String> stringSet;
        if (set != null && set.size() > 0 && (stringSet = OneSignalPrefs.getStringSet(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_CLICKED_CLICK_IDS_IAMS, (Set<String>) null)) != null && stringSet.size() > 0) {
            stringSet.removeAll(set);
            OneSignalPrefs.saveStringSet(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_CLICKED_CLICK_IDS_IAMS, stringSet);
        }
    }

    private String htmlPathForMessage(String str, String str2, String str3) {
        if (str2 == null) {
            OSLogger oSLogger = this.logger;
            oSLogger.error("Unable to find a variant for in-app message " + str);
            return null;
        }
        return "in_app_messages/" + str + "/variants/" + str2 + "/html?app_id=" + str3;
    }

    /* access modifiers changed from: package-private */
    public Set<String> getClickedMessagesId() {
        return this.sharedPreferences.getStringSet(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_CLICKED_CLICK_IDS_IAMS, (Set<String>) null);
    }

    /* access modifiers changed from: private */
    public void saveClickedMessagesId(Set<String> set) {
        this.sharedPreferences.saveStringSet(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_CLICKED_CLICK_IDS_IAMS, set);
    }

    /* access modifiers changed from: package-private */
    public Set<String> getImpressionesMessagesId() {
        return this.sharedPreferences.getStringSet(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_IMPRESSIONED_IAMS, (Set<String>) null);
    }

    /* access modifiers changed from: private */
    public void saveImpressionedMessages(Set<String> set) {
        this.sharedPreferences.saveStringSet(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_IMPRESSIONED_IAMS, set);
    }

    /* access modifiers changed from: package-private */
    public Set<String> getViewPageImpressionedIds() {
        return this.sharedPreferences.getStringSet(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_PAGE_IMPRESSIONED_IAMS, (Set<String>) null);
    }

    /* access modifiers changed from: package-private */
    public void saveViewPageImpressionedIds(Set<String> set) {
        this.sharedPreferences.saveStringSet(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_PAGE_IMPRESSIONED_IAMS, set);
    }

    /* access modifiers changed from: package-private */
    public Set<String> getDismissedMessagesId() {
        return this.sharedPreferences.getStringSet(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_DISMISSED_IAMS, (Set<String>) null);
    }

    /* access modifiers changed from: package-private */
    public void saveDismissedMessagesId(Set<String> set) {
        this.sharedPreferences.saveStringSet(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_DISMISSED_IAMS, set);
    }

    /* access modifiers changed from: package-private */
    public String getSavedIAMs() {
        return this.sharedPreferences.getString(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_CACHED_IAMS, (String) null);
    }

    /* access modifiers changed from: package-private */
    public void saveIAMs(String str) {
        this.sharedPreferences.saveString(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_CACHED_IAMS, str);
    }

    /* access modifiers changed from: package-private */
    public void saveLastTimeInAppDismissed(Date date) {
        this.sharedPreferences.saveString(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_LAST_TIME_IAM_DISMISSED, date != null ? date.toString() : null);
    }

    /* access modifiers changed from: package-private */
    public Date getLastTimeInAppDismissed() {
        String string = this.sharedPreferences.getString(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_LAST_TIME_IAM_DISMISSED, (String) null);
        if (string == null) {
            return null;
        }
        try {
            return new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.ENGLISH).parse(string);
        } catch (ParseException e2) {
            OneSignal.onesignalLog(OneSignal.LOG_LEVEL.ERROR, e2.getLocalizedMessage());
            return null;
        }
    }

    /* access modifiers changed from: private */
    public void printHttpSuccessForInAppMessageRequest(String str, String str2) {
        OSLogger oSLogger = this.logger;
        oSLogger.debug("Successful post for in-app message " + str + " request: " + str2);
    }

    /* access modifiers changed from: private */
    public void printHttpErrorForInAppMessageRequest(String str, int i, String str2) {
        OSLogger oSLogger = this.logger;
        oSLogger.error("Encountered a " + i + " error while attempting in-app message " + str + " request: " + str2);
    }
}
