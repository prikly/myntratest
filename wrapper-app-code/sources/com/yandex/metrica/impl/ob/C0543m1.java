package com.yandex.metrica.impl.ob;

import android.location.Location;
import android.text.TextUtils;
import com.appnext.base.b.i;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.onesignal.outcomes.data.OutcomeEventsTable;
import com.yandex.metrica.PreloadInfo;
import com.yandex.metrica.YandexMetricaConfig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.m1  reason: case insensitive filesystem */
public class C0543m1 {
    private Location b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Location location = new Location(jSONObject.has(IronSourceConstants.EVENTS_PROVIDER) ? jSONObject.optString(IronSourceConstants.EVENTS_PROVIDER) : null);
            location.setLongitude(jSONObject.getDouble("lng"));
            location.setLatitude(jSONObject.getDouble(i.fC));
            location.setTime(jSONObject.optLong("time"));
            location.setAccuracy((float) jSONObject.optDouble("accuracy"));
            location.setAltitude((double) ((float) jSONObject.optDouble("alt")));
            return location;
        } catch (Throwable unused) {
            return null;
        }
    }

    private PreloadInfo c(String str) throws JSONException {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has("trackid")) {
            str2 = jSONObject.optString("trackid");
        }
        PreloadInfo.Builder newBuilder = PreloadInfo.newBuilder(str2);
        HashMap<String, String> d2 = Tl.d(jSONObject.optString(OutcomeEventsTable.COLUMN_NAME_PARAMS));
        if (d2 != null && d2.size() > 0) {
            for (Map.Entry next : d2.entrySet()) {
                newBuilder.setAdditionalParams((String) next.getKey(), (String) next.getValue());
            }
        }
        return newBuilder.build();
    }

    public String a(YandexMetricaConfig yandexMetricaConfig) {
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("apikey", yandexMetricaConfig.apiKey);
            jSONObject.put("app_version", yandexMetricaConfig.appVersion);
            jSONObject.put("session_timeout", yandexMetricaConfig.sessionTimeout);
            jSONObject.put("location", a(yandexMetricaConfig.location));
            PreloadInfo preloadInfo = yandexMetricaConfig.preloadInfo;
            if (preloadInfo != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("trackid", preloadInfo.getTrackingId());
                    jSONObject2.put(OutcomeEventsTable.COLUMN_NAME_PARAMS, Tl.e((Map) preloadInfo.getAdditionalParams()));
                    str = jSONObject2.toString();
                } catch (Throwable unused) {
                }
                jSONObject.put("preload_info", str);
                jSONObject.put("logs", yandexMetricaConfig.logs);
                jSONObject.put("crash_enabled", yandexMetricaConfig.crashReporting);
                jSONObject.put("crash_native_enabled", yandexMetricaConfig.nativeCrashReporting);
                jSONObject.put("location_enabled", yandexMetricaConfig.locationTracking);
                jSONObject.put("max_reports_in_db_count", yandexMetricaConfig.maxReportsInDatabaseCount);
                jSONObject.put("error_environment", Tl.e((Map) yandexMetricaConfig.errorEnvironment));
                jSONObject.put("first_activation_as_update", yandexMetricaConfig.firstActivationAsUpdate);
                jSONObject.put("statistics_sending", yandexMetricaConfig.statisticsSending);
                jSONObject.put("user_profile_id", yandexMetricaConfig.userProfileID);
                jSONObject.put("revenue_auto_tracking_enabled", yandexMetricaConfig.revenueAutoTrackingEnabled);
                jSONObject.put("sessions_auto_tracking_enabled", yandexMetricaConfig.sessionsAutoTrackingEnabled);
                jSONObject.put("app_open_tracking_enabled", yandexMetricaConfig.appOpenTrackingEnabled);
                return jSONObject.toString();
            }
            str = null;
            jSONObject.put("preload_info", str);
            jSONObject.put("logs", yandexMetricaConfig.logs);
            jSONObject.put("crash_enabled", yandexMetricaConfig.crashReporting);
            jSONObject.put("crash_native_enabled", yandexMetricaConfig.nativeCrashReporting);
            jSONObject.put("location_enabled", yandexMetricaConfig.locationTracking);
            jSONObject.put("max_reports_in_db_count", yandexMetricaConfig.maxReportsInDatabaseCount);
            jSONObject.put("error_environment", Tl.e((Map) yandexMetricaConfig.errorEnvironment));
            jSONObject.put("first_activation_as_update", yandexMetricaConfig.firstActivationAsUpdate);
            jSONObject.put("statistics_sending", yandexMetricaConfig.statisticsSending);
            jSONObject.put("user_profile_id", yandexMetricaConfig.userProfileID);
            jSONObject.put("revenue_auto_tracking_enabled", yandexMetricaConfig.revenueAutoTrackingEnabled);
            jSONObject.put("sessions_auto_tracking_enabled", yandexMetricaConfig.sessionsAutoTrackingEnabled);
            jSONObject.put("app_open_tracking_enabled", yandexMetricaConfig.appOpenTrackingEnabled);
            return jSONObject.toString();
        } catch (Throwable unused2) {
            return "";
        }
    }

    public YandexMetricaConfig a(String str) {
        YandexMetricaConfig yandexMetricaConfig;
        HashMap<String, String> d2;
        String str2 = "app_open_tracking_enabled";
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                YandexMetricaConfig.Builder newConfigBuilder = YandexMetricaConfig.newConfigBuilder(jSONObject.getString("apikey"));
                if (jSONObject.has("app_version")) {
                    newConfigBuilder.withAppVersion(jSONObject.optString("app_version"));
                }
                if (jSONObject.has("session_timeout")) {
                    newConfigBuilder.withSessionTimeout(jSONObject.getInt("session_timeout"));
                }
                newConfigBuilder.withLocation(b(jSONObject.optString("location")));
                newConfigBuilder.withPreloadInfo(c(jSONObject.optString("preload_info")));
                if (jSONObject.has("logs") && jSONObject.optBoolean("logs")) {
                    newConfigBuilder.withLogs();
                }
                if (jSONObject.has("crash_enabled")) {
                    newConfigBuilder.withCrashReporting(jSONObject.optBoolean("crash_enabled"));
                }
                if (jSONObject.has("crash_native_enabled")) {
                    newConfigBuilder.withNativeCrashReporting(jSONObject.optBoolean("crash_native_enabled"));
                }
                if (jSONObject.has("location_enabled")) {
                    newConfigBuilder.withLocationTracking(jSONObject.optBoolean("location_enabled"));
                }
                if (jSONObject.has("max_reports_in_db_count")) {
                    newConfigBuilder.withMaxReportsInDatabaseCount(jSONObject.optInt("max_reports_in_db_count"));
                }
                if (jSONObject.has("error_environment") && (d2 = Tl.d(jSONObject.optString("error_environment"))) != null) {
                    for (Map.Entry next : d2.entrySet()) {
                        newConfigBuilder.withErrorEnvironmentValue((String) next.getKey(), (String) next.getValue());
                    }
                }
                if (jSONObject.has("first_activation_as_update")) {
                    newConfigBuilder.handleFirstActivationAsUpdate(jSONObject.optBoolean("first_activation_as_update"));
                }
                if (jSONObject.has("statistics_sending")) {
                    newConfigBuilder.withStatisticsSending(jSONObject.optBoolean("statistics_sending"));
                }
                if (jSONObject.has("user_profile_id")) {
                    yandexMetricaConfig = null;
                    try {
                        newConfigBuilder.withUserProfileID(jSONObject.optString("user_profile_id", (String) null));
                    } catch (Throwable unused) {
                    }
                }
                if (jSONObject.has("revenue_auto_tracking_enabled")) {
                    newConfigBuilder.withRevenueAutoTrackingEnabled(jSONObject.optBoolean("revenue_auto_tracking_enabled"));
                }
                if (jSONObject.has("sessions_auto_tracking_enabled")) {
                    newConfigBuilder.withSessionsAutoTrackingEnabled(jSONObject.optBoolean("sessions_auto_tracking_enabled"));
                }
                String str3 = str2;
                if (jSONObject.has(str3)) {
                    newConfigBuilder.withAppOpenTrackingEnabled(jSONObject.optBoolean(str3));
                }
                return newConfigBuilder.build();
            } catch (Throwable unused2) {
            }
        }
        yandexMetricaConfig = null;
        return yandexMetricaConfig;
    }

    private String a(Location location) {
        if (location == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, location.getProvider());
            jSONObject.put("time", location.getTime());
            jSONObject.put("accuracy", (double) location.getAccuracy());
            jSONObject.put("alt", location.getAltitude());
            jSONObject.put("lng", location.getLongitude());
            jSONObject.put(i.fC, location.getLatitude());
            return jSONObject.toString();
        } catch (Throwable unused) {
            return null;
        }
    }
}
