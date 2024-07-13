package com.yandex.metrica.impl.ob;

import android.location.Location;
import com.appodeal.ads.modules.common.internal.Constants;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.onesignal.outcomes.OSOutcomeConstants;
import com.yandex.metrica.PreloadInfo;
import com.yandex.metrica.YandexMetricaConfig;
import com.yandex.metrica.i;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.na  reason: case insensitive filesystem */
public class C0577na implements C0698sa<YandexMetricaConfig> {

    /* renamed from: a  reason: collision with root package name */
    private final C0290bm f6315a;

    /* renamed from: b  reason: collision with root package name */
    private final C0842ya f6316b;

    C0577na(C0290bm bmVar, C0842ya yaVar) {
        this.f6315a = bmVar;
        this.f6316b = yaVar;
    }

    public JSONObject a(Object obj) {
        JSONObject jSONObject;
        JSONArray jSONArray;
        YandexMetricaConfig yandexMetricaConfig = (YandexMetricaConfig) obj;
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONObject jSONObject3 = new JSONObject();
            if (yandexMetricaConfig != null) {
                JSONObject putOpt = jSONObject3.put("api_key", yandexMetricaConfig.apiKey).putOpt("app_version", yandexMetricaConfig.appVersion).putOpt("session_timeout", yandexMetricaConfig.sessionTimeout).putOpt("crash_reporting", yandexMetricaConfig.crashReporting).putOpt("native_crash_reporting", yandexMetricaConfig.nativeCrashReporting).putOpt("location", a(yandexMetricaConfig.location)).putOpt("location_tracking", yandexMetricaConfig.locationTracking).putOpt("logs", yandexMetricaConfig.logs);
                PreloadInfo preloadInfo = yandexMetricaConfig.preloadInfo;
                if (preloadInfo == null) {
                    jSONObject = null;
                } else {
                    jSONObject = new JSONObject().putOpt("tracking_id", preloadInfo.getTrackingId()).putOpt("additional_parameters", Tl.f((Map) preloadInfo.getAdditionalParams()));
                }
                putOpt.putOpt("preload_info", jSONObject).putOpt("first_activation_as_update", yandexMetricaConfig.firstActivationAsUpdate).putOpt("statistics_sending", yandexMetricaConfig.statisticsSending).putOpt("max_reports_in_database_count", yandexMetricaConfig.maxReportsInDatabaseCount).putOpt("error_environment", Tl.f((Map) yandexMetricaConfig.errorEnvironment)).putOpt("user_profile_id", yandexMetricaConfig.userProfileID).putOpt("revenue_auto_tracking_enabled", yandexMetricaConfig.revenueAutoTrackingEnabled).putOpt("sessions_auto_tracking_enabled", yandexMetricaConfig.sessionsAutoTrackingEnabled).putOpt("app_open_tracking_enabled", yandexMetricaConfig.appOpenTrackingEnabled);
                if (yandexMetricaConfig instanceof i) {
                    i iVar = (i) yandexMetricaConfig;
                    JSONObject putOpt2 = jSONObject3.putOpt(OSOutcomeConstants.DEVICE_TYPE, iVar.f3627a).putOpt("clids", Tl.f((Map) iVar.f3628b)).putOpt("distribution_referrer", iVar.f3629c);
                    List<String> list = iVar.f3630d;
                    if (list == null) {
                        jSONArray = null;
                    } else if (list.isEmpty()) {
                        jSONArray = new JSONArray();
                    } else {
                        jSONArray = Tl.b((List<?>) list);
                    }
                    JSONObject putOpt3 = putOpt2.putOpt("custom_hosts", jSONArray).putOpt("app_build_number", iVar.f3631e).putOpt("dispatch_period_seconds", iVar.f3632f).putOpt("max_reports_count", iVar.f3633g).putOpt("app_environment", Tl.f((Map) iVar.f3634h)).putOpt("preload_info_auto_tracking", iVar.i).putOpt("permissions_collection", iVar.j).putOpt("anr_monitoring", iVar.k);
                    this.f6316b.getClass();
                    putOpt3.putOpt("pulse_config", (Object) null).putOpt("rtm_config", (Object) null).put("crash_transformer_set", iVar.l != null);
                }
            }
            jSONObject2.putOpt(Constants.CONFIG, jSONObject3).putOpt("process_name", ((Xl) this.f6315a).b());
        } catch (Throwable unused) {
        }
        return jSONObject2;
    }

    private JSONObject a(Location location) throws JSONException {
        if (location == null) {
            return null;
        }
        return new JSONObject().putOpt(IronSourceConstants.EVENTS_PROVIDER, location.getProvider()).put("timestamp", location.getTime()).put("precision", (double) location.getAccuracy()).put("altitude", location.getAltitude()).put("lon", location.getLongitude()).put(com.appnext.base.b.i.fC, location.getLatitude()).put("direction", (double) location.getBearing()).put("speed", (double) location.getSpeed());
    }
}
