package com.onesignal.outcomes.data;

import android.content.ContentValues;
import com.onesignal.OSLogger;
import com.onesignal.OSSharedPreferences;
import com.onesignal.OneSignalDb;
import com.onesignal.influence.domain.OSInfluenceChannel;
import com.onesignal.influence.domain.OSInfluenceType;
import com.onesignal.outcomes.OSOutcomeConstants;
import com.onesignal.outcomes.domain.OSCachedUniqueOutcome;
import com.onesignal.outcomes.domain.OSOutcomeEventParams;
import com.onesignal.outcomes.domain.OSOutcomeSource;
import com.onesignal.outcomes.domain.OSOutcomeSourceBody;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ(\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J \u0010\u001a\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\u0018\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000eH\u0007J\u0010\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\"H\u0007J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0$H\u0007J4\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020\u000e2\b\u0010,\u001a\u0004\u0018\u00010&H\u0002J$\u0010-\u001a\b\u0012\u0004\u0012\u00020.0$2\u0006\u0010/\u001a\u00020\u000e2\f\u00100\u001a\b\u0012\u0004\u0012\u00020.0$H\u0007J*\u00101\u001a\u0004\u0018\u00010&2\u0006\u00102\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020\u001c2\u0006\u00103\u001a\u00020\u000eH\u0002J\u0010\u00104\u001a\u00020\u00122\u0006\u00105\u001a\u00020\"H\u0007J\u0018\u00106\u001a\u00020\u00122\u0010\u00107\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\rJ\u0010\u00108\u001a\u00020\u00122\u0006\u00105\u001a\u00020\"H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u00069"}, d2 = {"Lcom/onesignal/outcomes/data/OSOutcomeEventsCache;", "", "logger", "Lcom/onesignal/OSLogger;", "dbHelper", "Lcom/onesignal/OneSignalDb;", "preferences", "Lcom/onesignal/OSSharedPreferences;", "(Lcom/onesignal/OSLogger;Lcom/onesignal/OneSignalDb;Lcom/onesignal/OSSharedPreferences;)V", "isOutcomesV2ServiceEnabled", "", "()Z", "unattributedUniqueOutcomeEventsSentByChannel", "", "", "getUnattributedUniqueOutcomeEventsSentByChannel", "()Ljava/util/Set;", "addIdToListFromChannel", "", "cachedUniqueOutcomes", "", "Lcom/onesignal/outcomes/domain/OSCachedUniqueOutcome;", "channelIds", "Lorg/json/JSONArray;", "channel", "Lcom/onesignal/influence/domain/OSInfluenceChannel;", "addIdsToListFromSource", "sourceBody", "Lcom/onesignal/outcomes/domain/OSOutcomeSourceBody;", "cleanCachedUniqueOutcomeEventNotifications", "notificationTableName", "notificationIdColumnName", "deleteOldOutcomeEvent", "event", "Lcom/onesignal/outcomes/domain/OSOutcomeEventParams;", "getAllEventsToSend", "", "getIAMInfluenceSource", "Lcom/onesignal/outcomes/domain/OSOutcomeSource;", "iamInfluenceType", "Lcom/onesignal/influence/domain/OSInfluenceType;", "directSourceBody", "indirectSourceBody", "iamIds", "source", "getNotCachedUniqueInfluencesForOutcome", "Lcom/onesignal/influence/domain/OSInfluence;", "name", "influences", "getNotificationInfluenceSource", "notificationInfluenceType", "notificationIds", "saveOutcomeEvent", "eventParams", "saveUnattributedUniqueOutcomeEventsSentByChannel", "unattributedUniqueOutcomeEvents", "saveUniqueOutcomeEventParams", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: OSOutcomeEventsCache.kt */
public final class OSOutcomeEventsCache {
    private final OneSignalDb dbHelper;
    private final OSLogger logger;
    private final OSSharedPreferences preferences;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OSInfluenceType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[OSInfluenceType.DIRECT.ordinal()] = 1;
            $EnumSwitchMapping$0[OSInfluenceType.INDIRECT.ordinal()] = 2;
            int[] iArr2 = new int[OSInfluenceType.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[OSInfluenceType.DIRECT.ordinal()] = 1;
            $EnumSwitchMapping$1[OSInfluenceType.INDIRECT.ordinal()] = 2;
        }
    }

    public OSOutcomeEventsCache(OSLogger oSLogger, OneSignalDb oneSignalDb, OSSharedPreferences oSSharedPreferences) {
        Intrinsics.checkNotNullParameter(oSLogger, "logger");
        Intrinsics.checkNotNullParameter(oneSignalDb, "dbHelper");
        Intrinsics.checkNotNullParameter(oSSharedPreferences, "preferences");
        this.logger = oSLogger;
        this.dbHelper = oneSignalDb;
        this.preferences = oSSharedPreferences;
    }

    public final boolean isOutcomesV2ServiceEnabled() {
        OSSharedPreferences oSSharedPreferences = this.preferences;
        return oSSharedPreferences.getBool(oSSharedPreferences.getPreferencesName(), this.preferences.getOutcomesV2KeyName(), false);
    }

    public final Set<String> getUnattributedUniqueOutcomeEventsSentByChannel() {
        OSSharedPreferences oSSharedPreferences = this.preferences;
        return oSSharedPreferences.getStringSet(oSSharedPreferences.getPreferencesName(), OSOutcomeConstants.PREFS_OS_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT, (Set<String>) null);
    }

    public final void saveUnattributedUniqueOutcomeEventsSentByChannel(Set<String> set) {
        OSSharedPreferences oSSharedPreferences = this.preferences;
        String preferencesName = oSSharedPreferences.getPreferencesName();
        Intrinsics.checkNotNull(set);
        oSSharedPreferences.saveStringSet(preferencesName, OSOutcomeConstants.PREFS_OS_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT, set);
    }

    public final synchronized void deleteOldOutcomeEvent(OSOutcomeEventParams oSOutcomeEventParams) {
        Intrinsics.checkNotNullParameter(oSOutcomeEventParams, "event");
        this.dbHelper.delete("outcome", "timestamp = ?", new String[]{String.valueOf(oSOutcomeEventParams.getTimestamp())});
    }

    public final synchronized void saveOutcomeEvent(OSOutcomeEventParams oSOutcomeEventParams) {
        OSOutcomeSourceBody indirectBody;
        OSOutcomeSourceBody directBody;
        Intrinsics.checkNotNullParameter(oSOutcomeEventParams, "eventParams");
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        OSInfluenceType oSInfluenceType = OSInfluenceType.UNATTRIBUTED;
        OSInfluenceType oSInfluenceType2 = OSInfluenceType.UNATTRIBUTED;
        OSOutcomeSource outcomeSource = oSOutcomeEventParams.getOutcomeSource();
        if (!(outcomeSource == null || (directBody = outcomeSource.getDirectBody()) == null)) {
            JSONArray notificationIds = directBody.getNotificationIds();
            if (notificationIds != null && notificationIds.length() > 0) {
                oSInfluenceType = OSInfluenceType.DIRECT;
                jSONArray = notificationIds;
            }
            JSONArray inAppMessagesIds = directBody.getInAppMessagesIds();
            if (inAppMessagesIds != null && inAppMessagesIds.length() > 0) {
                oSInfluenceType2 = OSInfluenceType.DIRECT;
                jSONArray2 = inAppMessagesIds;
            }
        }
        OSOutcomeSource outcomeSource2 = oSOutcomeEventParams.getOutcomeSource();
        if (!(outcomeSource2 == null || (indirectBody = outcomeSource2.getIndirectBody()) == null)) {
            JSONArray notificationIds2 = indirectBody.getNotificationIds();
            if (notificationIds2 != null && notificationIds2.length() > 0) {
                oSInfluenceType = OSInfluenceType.INDIRECT;
                jSONArray = notificationIds2;
            }
            JSONArray inAppMessagesIds2 = indirectBody.getInAppMessagesIds();
            if (inAppMessagesIds2 != null && inAppMessagesIds2.length() > 0) {
                oSInfluenceType2 = OSInfluenceType.INDIRECT;
                jSONArray2 = inAppMessagesIds2;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("notification_ids", jSONArray.toString());
        contentValues.put(OutcomeEventsTable.COLUMN_NAME_IAM_IDS, jSONArray2.toString());
        String oSInfluenceType3 = oSInfluenceType.toString();
        if (oSInfluenceType3 != null) {
            String lowerCase = oSInfluenceType3.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
            contentValues.put(OutcomeEventsTable.COLUMN_NAME_NOTIFICATION_INFLUENCE_TYPE, lowerCase);
            String oSInfluenceType4 = oSInfluenceType2.toString();
            if (oSInfluenceType4 != null) {
                String lowerCase2 = oSInfluenceType4.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "(this as java.lang.String).toLowerCase()");
                contentValues.put(OutcomeEventsTable.COLUMN_NAME_IAM_INFLUENCE_TYPE, lowerCase2);
                contentValues.put("name", oSOutcomeEventParams.getOutcomeId());
                contentValues.put("weight", Float.valueOf(oSOutcomeEventParams.getWeight()));
                contentValues.put("timestamp", Long.valueOf(oSOutcomeEventParams.getTimestamp()));
                this.dbHelper.insert("outcome", (String) null, contentValues);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d4 A[SYNTHETIC, Splitter:B:40:0x00d4] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List<com.onesignal.outcomes.domain.OSOutcomeEventParams> getAllEventsToSend() {
        /*
            r18 = this;
            r7 = r18
            monitor-enter(r18)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x00de }
            r0.<init>()     // Catch:{ all -> 0x00de }
            r8 = r0
            java.util.List r8 = (java.util.List) r8     // Catch:{ all -> 0x00de }
            r9 = 0
            r1 = r9
            android.database.Cursor r1 = (android.database.Cursor) r1     // Catch:{ all -> 0x00de }
            com.onesignal.OneSignalDb r10 = r7.dbHelper     // Catch:{ all -> 0x00d1 }
            java.lang.String r11 = "outcome"
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x00d1 }
            boolean r0 = r10.moveToFirst()     // Catch:{ all -> 0x00ce }
            if (r0 == 0) goto L_0x00c1
        L_0x0025:
            java.lang.String r0 = "notification_influence_type"
            int r0 = r10.getColumnIndex(r0)     // Catch:{ all -> 0x00ce }
            java.lang.String r0 = r10.getString(r0)     // Catch:{ all -> 0x00ce }
            com.onesignal.influence.domain.OSInfluenceType$Companion r1 = com.onesignal.influence.domain.OSInfluenceType.Companion     // Catch:{ all -> 0x00ce }
            com.onesignal.influence.domain.OSInfluenceType r0 = r1.fromString(r0)     // Catch:{ all -> 0x00ce }
            java.lang.String r1 = "iam_influence_type"
            int r1 = r10.getColumnIndex(r1)     // Catch:{ all -> 0x00ce }
            java.lang.String r1 = r10.getString(r1)     // Catch:{ all -> 0x00ce }
            com.onesignal.influence.domain.OSInfluenceType$Companion r2 = com.onesignal.influence.domain.OSInfluenceType.Companion     // Catch:{ all -> 0x00ce }
            com.onesignal.influence.domain.OSInfluenceType r2 = r2.fromString(r1)     // Catch:{ all -> 0x00ce }
            java.lang.String r1 = "notification_ids"
            int r1 = r10.getColumnIndex(r1)     // Catch:{ all -> 0x00ce }
            java.lang.String r1 = r10.getString(r1)     // Catch:{ all -> 0x00ce }
            if (r1 == 0) goto L_0x0052
            goto L_0x0054
        L_0x0052:
            java.lang.String r1 = "[]"
        L_0x0054:
            java.lang.String r3 = "iam_ids"
            int r3 = r10.getColumnIndex(r3)     // Catch:{ all -> 0x00ce }
            java.lang.String r3 = r10.getString(r3)     // Catch:{ all -> 0x00ce }
            if (r3 == 0) goto L_0x0061
            goto L_0x0063
        L_0x0061:
            java.lang.String r3 = "[]"
        L_0x0063:
            r5 = r3
            java.lang.String r3 = "name"
            int r3 = r10.getColumnIndex(r3)     // Catch:{ all -> 0x00ce }
            java.lang.String r12 = r10.getString(r3)     // Catch:{ all -> 0x00ce }
            java.lang.String r3 = "weight"
            int r3 = r10.getColumnIndex(r3)     // Catch:{ all -> 0x00ce }
            float r14 = r10.getFloat(r3)     // Catch:{ all -> 0x00ce }
            java.lang.String r3 = "timestamp"
            int r3 = r10.getColumnIndex(r3)     // Catch:{ all -> 0x00ce }
            long r15 = r10.getLong(r3)     // Catch:{ all -> 0x00ce }
            com.onesignal.outcomes.domain.OSOutcomeSourceBody r3 = new com.onesignal.outcomes.domain.OSOutcomeSourceBody     // Catch:{ JSONException -> 0x00b1 }
            r4 = 3
            r3.<init>(r9, r9, r4, r9)     // Catch:{ JSONException -> 0x00b1 }
            com.onesignal.outcomes.domain.OSOutcomeSourceBody r6 = new com.onesignal.outcomes.domain.OSOutcomeSourceBody     // Catch:{ JSONException -> 0x00b1 }
            r6.<init>(r9, r9, r4, r9)     // Catch:{ JSONException -> 0x00b1 }
            com.onesignal.outcomes.domain.OSOutcomeSource r0 = r7.getNotificationInfluenceSource(r0, r3, r6, r1)     // Catch:{ JSONException -> 0x00b1 }
            r1 = r18
            r4 = r6
            r6 = r0
            r1.getIAMInfluenceSource(r2, r3, r4, r5, r6)     // Catch:{ JSONException -> 0x00b1 }
            if (r0 == 0) goto L_0x009c
        L_0x009a:
            r13 = r0
            goto L_0x00a2
        L_0x009c:
            com.onesignal.outcomes.domain.OSOutcomeSource r0 = new com.onesignal.outcomes.domain.OSOutcomeSource     // Catch:{ JSONException -> 0x00b1 }
            r0.<init>(r9, r9)     // Catch:{ JSONException -> 0x00b1 }
            goto L_0x009a
        L_0x00a2:
            com.onesignal.outcomes.domain.OSOutcomeEventParams r0 = new com.onesignal.outcomes.domain.OSOutcomeEventParams     // Catch:{ JSONException -> 0x00b1 }
            java.lang.String r1 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r1)     // Catch:{ JSONException -> 0x00b1 }
            r11 = r0
            r11.<init>(r12, r13, r14, r15)     // Catch:{ JSONException -> 0x00b1 }
            r8.add(r0)     // Catch:{ JSONException -> 0x00b1 }
            goto L_0x00bb
        L_0x00b1:
            r0 = move-exception
            com.onesignal.OSLogger r1 = r7.logger     // Catch:{ all -> 0x00ce }
            java.lang.String r2 = "Generating JSONArray from notifications ids outcome:JSON Failed."
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x00ce }
            r1.error(r2, r0)     // Catch:{ all -> 0x00ce }
        L_0x00bb:
            boolean r0 = r10.moveToNext()     // Catch:{ all -> 0x00ce }
            if (r0 != 0) goto L_0x0025
        L_0x00c1:
            if (r10 == 0) goto L_0x00cc
            boolean r0 = r10.isClosed()     // Catch:{ all -> 0x00de }
            if (r0 != 0) goto L_0x00cc
            r10.close()     // Catch:{ all -> 0x00de }
        L_0x00cc:
            monitor-exit(r18)
            return r8
        L_0x00ce:
            r0 = move-exception
            r1 = r10
            goto L_0x00d2
        L_0x00d1:
            r0 = move-exception
        L_0x00d2:
            if (r1 == 0) goto L_0x00dd
            boolean r2 = r1.isClosed()     // Catch:{ all -> 0x00de }
            if (r2 != 0) goto L_0x00dd
            r1.close()     // Catch:{ all -> 0x00de }
        L_0x00dd:
            throw r0     // Catch:{ all -> 0x00de }
        L_0x00de:
            r0 = move-exception
            monitor-exit(r18)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.outcomes.data.OSOutcomeEventsCache.getAllEventsToSend():java.util.List");
    }

    private final OSOutcomeSource getNotificationInfluenceSource(OSInfluenceType oSInfluenceType, OSOutcomeSourceBody oSOutcomeSourceBody, OSOutcomeSourceBody oSOutcomeSourceBody2, String str) {
        OSOutcomeSource oSOutcomeSource;
        int i = WhenMappings.$EnumSwitchMapping$0[oSInfluenceType.ordinal()];
        if (i == 1) {
            oSOutcomeSourceBody.setNotificationIds(new JSONArray(str));
            oSOutcomeSource = new OSOutcomeSource(oSOutcomeSourceBody, (OSOutcomeSourceBody) null);
        } else if (i != 2) {
            return null;
        } else {
            oSOutcomeSourceBody2.setNotificationIds(new JSONArray(str));
            oSOutcomeSource = new OSOutcomeSource((OSOutcomeSourceBody) null, oSOutcomeSourceBody2);
        }
        return oSOutcomeSource;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        r7 = r7.setDirectBody(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.onesignal.outcomes.domain.OSOutcomeSource getIAMInfluenceSource(com.onesignal.influence.domain.OSInfluenceType r3, com.onesignal.outcomes.domain.OSOutcomeSourceBody r4, com.onesignal.outcomes.domain.OSOutcomeSourceBody r5, java.lang.String r6, com.onesignal.outcomes.domain.OSOutcomeSource r7) {
        /*
            r2 = this;
            int[] r0 = com.onesignal.outcomes.data.OSOutcomeEventsCache.WhenMappings.$EnumSwitchMapping$1
            int r3 = r3.ordinal()
            r3 = r0[r3]
            r0 = 1
            r1 = 0
            if (r3 == r0) goto L_0x0027
            r4 = 2
            if (r3 == r4) goto L_0x0010
            goto L_0x003d
        L_0x0010:
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>(r6)
            r5.setInAppMessagesIds(r3)
            if (r7 == 0) goto L_0x0021
            com.onesignal.outcomes.domain.OSOutcomeSource r7 = r7.setIndirectBody((com.onesignal.outcomes.domain.OSOutcomeSourceBody) r5)
            if (r7 == 0) goto L_0x0021
            goto L_0x003d
        L_0x0021:
            com.onesignal.outcomes.domain.OSOutcomeSource r7 = new com.onesignal.outcomes.domain.OSOutcomeSource
            r7.<init>(r1, r5)
            goto L_0x003d
        L_0x0027:
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>(r6)
            r4.setInAppMessagesIds(r3)
            if (r7 == 0) goto L_0x0038
            com.onesignal.outcomes.domain.OSOutcomeSource r7 = r7.setDirectBody((com.onesignal.outcomes.domain.OSOutcomeSourceBody) r4)
            if (r7 == 0) goto L_0x0038
            goto L_0x003d
        L_0x0038:
            com.onesignal.outcomes.domain.OSOutcomeSource r7 = new com.onesignal.outcomes.domain.OSOutcomeSource
            r7.<init>(r4, r1)
        L_0x003d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.outcomes.data.OSOutcomeEventsCache.getIAMInfluenceSource(com.onesignal.influence.domain.OSInfluenceType, com.onesignal.outcomes.domain.OSOutcomeSourceBody, com.onesignal.outcomes.domain.OSOutcomeSourceBody, java.lang.String, com.onesignal.outcomes.domain.OSOutcomeSource):com.onesignal.outcomes.domain.OSOutcomeSource");
    }

    private final void addIdToListFromChannel(List<OSCachedUniqueOutcome> list, JSONArray jSONArray, OSInfluenceChannel oSInfluenceChannel) {
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    String string = jSONArray.getString(i);
                    Intrinsics.checkNotNullExpressionValue(string, "influenceId");
                    list.add(new OSCachedUniqueOutcome(string, oSInfluenceChannel));
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    private final void addIdsToListFromSource(List<OSCachedUniqueOutcome> list, OSOutcomeSourceBody oSOutcomeSourceBody) {
        if (oSOutcomeSourceBody != null) {
            JSONArray inAppMessagesIds = oSOutcomeSourceBody.getInAppMessagesIds();
            JSONArray notificationIds = oSOutcomeSourceBody.getNotificationIds();
            addIdToListFromChannel(list, inAppMessagesIds, OSInfluenceChannel.IAM);
            addIdToListFromChannel(list, notificationIds, OSInfluenceChannel.NOTIFICATION);
        }
    }

    public final synchronized void saveUniqueOutcomeEventParams(OSOutcomeEventParams oSOutcomeEventParams) {
        Intrinsics.checkNotNullParameter(oSOutcomeEventParams, "eventParams");
        OSLogger oSLogger = this.logger;
        oSLogger.debug("OneSignal saveUniqueOutcomeEventParams: " + oSOutcomeEventParams);
        String outcomeId = oSOutcomeEventParams.getOutcomeId();
        List<OSCachedUniqueOutcome> arrayList = new ArrayList<>();
        OSOutcomeSource outcomeSource = oSOutcomeEventParams.getOutcomeSource();
        OSOutcomeSourceBody directBody = outcomeSource != null ? outcomeSource.getDirectBody() : null;
        OSOutcomeSource outcomeSource2 = oSOutcomeEventParams.getOutcomeSource();
        OSOutcomeSourceBody indirectBody = outcomeSource2 != null ? outcomeSource2.getIndirectBody() : null;
        addIdsToListFromSource(arrayList, directBody);
        addIdsToListFromSource(arrayList, indirectBody);
        for (OSCachedUniqueOutcome oSCachedUniqueOutcome : arrayList) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("channel_influence_id", oSCachedUniqueOutcome.getInfluenceId());
            contentValues.put("channel_type", oSCachedUniqueOutcome.getChannel().toString());
            contentValues.put("name", outcomeId);
            this.dbHelper.insert("cached_unique_outcome", (String) null, contentValues);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0094, code lost:
        if (r4.isClosed() == false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0096, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a6, code lost:
        if (r4.isClosed() == false) goto L_0x0096;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List<com.onesignal.influence.domain.OSInfluence> getNotCachedUniqueInfluencesForOutcome(java.lang.String r23, java.util.List<com.onesignal.influence.domain.OSInfluence> r24) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            monitor-enter(r22)
            java.lang.String r2 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)     // Catch:{ all -> 0x00b7 }
            java.lang.String r2 = "influences"
            r3 = r24
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)     // Catch:{ all -> 0x00b7 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x00b7 }
            r2.<init>()     // Catch:{ all -> 0x00b7 }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x00b7 }
            r4 = 0
            android.database.Cursor r4 = (android.database.Cursor) r4     // Catch:{ all -> 0x00b7 }
            java.util.Iterator r3 = r24.iterator()     // Catch:{ JSONException -> 0x009c }
        L_0x001f:
            boolean r5 = r3.hasNext()     // Catch:{ JSONException -> 0x009c }
            if (r5 == 0) goto L_0x008e
            java.lang.Object r5 = r3.next()     // Catch:{ JSONException -> 0x009c }
            com.onesignal.influence.domain.OSInfluence r5 = (com.onesignal.influence.domain.OSInfluence) r5     // Catch:{ JSONException -> 0x009c }
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ JSONException -> 0x009c }
            r6.<init>()     // Catch:{ JSONException -> 0x009c }
            org.json.JSONArray r7 = r5.getIds()     // Catch:{ JSONException -> 0x009c }
            if (r7 == 0) goto L_0x001f
            int r8 = r7.length()     // Catch:{ JSONException -> 0x009c }
            r9 = 0
            r10 = 0
        L_0x003c:
            if (r10 >= r8) goto L_0x007d
            java.lang.String r11 = r7.getString(r10)     // Catch:{ JSONException -> 0x009c }
            com.onesignal.influence.domain.OSInfluenceChannel r12 = r5.getInfluenceChannel()     // Catch:{ JSONException -> 0x009c }
            java.lang.String[] r15 = new java.lang.String[r9]     // Catch:{ JSONException -> 0x009c }
            java.lang.String r16 = "channel_influence_id = ? AND channel_type = ? AND name = ?"
            r13 = 3
            java.lang.String[] r14 = new java.lang.String[r13]     // Catch:{ JSONException -> 0x009c }
            r14[r9] = r11     // Catch:{ JSONException -> 0x009c }
            java.lang.String r12 = r12.toString()     // Catch:{ JSONException -> 0x009c }
            r13 = 1
            r14[r13] = r12     // Catch:{ JSONException -> 0x009c }
            r12 = 2
            r14[r12] = r0     // Catch:{ JSONException -> 0x009c }
            com.onesignal.OneSignalDb r13 = r1.dbHelper     // Catch:{ JSONException -> 0x009c }
            java.lang.String r12 = "cached_unique_outcome"
            r18 = 0
            r19 = 0
            r20 = 0
            java.lang.String r21 = "1"
            r17 = r14
            r14 = r12
            android.database.Cursor r4 = r13.query(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ JSONException -> 0x009c }
            java.lang.String r12 = "cursor"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r12)     // Catch:{ JSONException -> 0x009c }
            int r12 = r4.getCount()     // Catch:{ JSONException -> 0x009c }
            if (r12 != 0) goto L_0x007a
            r6.put(r11)     // Catch:{ JSONException -> 0x009c }
        L_0x007a:
            int r10 = r10 + 1
            goto L_0x003c
        L_0x007d:
            int r7 = r6.length()     // Catch:{ JSONException -> 0x009c }
            if (r7 <= 0) goto L_0x001f
            com.onesignal.influence.domain.OSInfluence r5 = r5.copy()     // Catch:{ JSONException -> 0x009c }
            r5.setIds(r6)     // Catch:{ JSONException -> 0x009c }
            r2.add(r5)     // Catch:{ JSONException -> 0x009c }
            goto L_0x001f
        L_0x008e:
            if (r4 == 0) goto L_0x00a9
            boolean r0 = r4.isClosed()     // Catch:{ all -> 0x00b7 }
            if (r0 != 0) goto L_0x00a9
        L_0x0096:
            r4.close()     // Catch:{ all -> 0x00b7 }
            goto L_0x00a9
        L_0x009a:
            r0 = move-exception
            goto L_0x00ab
        L_0x009c:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x009a }
            if (r4 == 0) goto L_0x00a9
            boolean r0 = r4.isClosed()     // Catch:{ all -> 0x00b7 }
            if (r0 != 0) goto L_0x00a9
            goto L_0x0096
        L_0x00a9:
            monitor-exit(r22)
            return r2
        L_0x00ab:
            if (r4 == 0) goto L_0x00b6
            boolean r2 = r4.isClosed()     // Catch:{ all -> 0x00b7 }
            if (r2 != 0) goto L_0x00b6
            r4.close()     // Catch:{ all -> 0x00b7 }
        L_0x00b6:
            throw r0     // Catch:{ all -> 0x00b7 }
        L_0x00b7:
            r0 = move-exception
            monitor-exit(r22)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.outcomes.data.OSOutcomeEventsCache.getNotCachedUniqueInfluencesForOutcome(java.lang.String, java.util.List):java.util.List");
    }

    public final synchronized void cleanCachedUniqueOutcomeEventNotifications(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "notificationTableName");
        Intrinsics.checkNotNullParameter(str2, "notificationIdColumnName");
        StringBuilder sb = new StringBuilder();
        sb.append("NOT EXISTS(SELECT NULL FROM ");
        sb.append(str);
        sb.append(" n ");
        sb.append("WHERE");
        sb.append(" n.");
        sb.append(str2);
        sb.append(" = ");
        sb.append("channel_influence_id");
        sb.append(" AND ");
        sb.append("channel_type");
        sb.append(" = \"");
        String oSInfluenceChannel = OSInfluenceChannel.NOTIFICATION.toString();
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "Locale.ROOT");
        if (oSInfluenceChannel != null) {
            String lowerCase = oSInfluenceChannel.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            sb.append(lowerCase);
            sb.append("\")");
            this.dbHelper.delete("cached_unique_outcome", sb.toString(), (String[]) null);
        } else {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
    }
}
