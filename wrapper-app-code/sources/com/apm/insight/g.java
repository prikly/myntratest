package com.apm.insight;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.amazon.aps.shared.APSAnalytics;
import com.apm.insight.entity.b;
import com.apm.insight.k.k;
import com.apm.insight.l.l;
import com.apm.insight.l.v;
import com.apm.insight.runtime.d;
import com.appodeal.ads.adapters.admob.BuildConfig;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class g {

    /* renamed from: b  reason: collision with root package name */
    protected static MonitorCrash f10593b;

    /* renamed from: a  reason: collision with root package name */
    protected MonitorCrash f10594a;

    private g(MonitorCrash monitorCrash) {
        this.f10594a = monitorCrash;
        b.a(this);
        com.apm.insight.j.b.d();
        k.e();
    }

    public static Object a() {
        return f10593b;
    }

    static void a(Context context, final MonitorCrash monitorCrash) {
        f10593b = monitorCrash;
        g gVar = new g(monitorCrash);
        final d a2 = h.a();
        Npth.init(context, new ICommonParams(gVar) {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ g f10595a;

            {
                this.f10595a = r1;
            }

            public Map<String, Object> getCommonParams() {
                return l.b(this.f10595a.e());
            }

            public String getDeviceId() {
                return TextUtils.isEmpty(monitorCrash.mConfig.mDeviceId) ? a2.d() : monitorCrash.mConfig.mDeviceId;
            }

            public List<String> getPatchInfo() {
                return null;
            }

            public Map<String, Integer> getPluginInfo() {
                return null;
            }

            public String getSessionId() {
                return null;
            }

            public long getUserId() {
                return 0;
            }
        });
    }

    static void a(MonitorCrash monitorCrash) {
        new g(monitorCrash);
    }

    private JSONObject b(CrashType crashType) {
        Map<? extends String, ? extends String> userData;
        if (this.f10594a.mCustomData == null || (userData = this.f10594a.mCustomData.getUserData(crashType)) == null) {
            return null;
        }
        return new JSONObject(userData);
    }

    private JSONObject c(CrashType crashType) {
        return new JSONObject(this.f10594a.mTagMap);
    }

    /* access modifiers changed from: private */
    public JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f10594a.mConfig.mPackageName == null) {
                Context g2 = h.g();
                PackageInfo packageInfo = g2.getPackageManager().getPackageInfo(g2.getPackageName(), 128);
                if (packageInfo != null) {
                    if (this.f10594a.mConfig.mVersionInt == -1) {
                        this.f10594a.mConfig.mVersionInt = (long) packageInfo.versionCode;
                    }
                    if (this.f10594a.mConfig.mVersionStr == null) {
                        this.f10594a.mConfig.mVersionStr = packageInfo.versionName;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(this.f10594a.mConfig.mDeviceId) || BuildConfig.ADAPTER_VERSION.equals(this.f10594a.mConfig.mDeviceId)) {
            this.f10594a.mConfig.mDeviceId = h.c().a();
        }
        try {
            jSONObject.put("aid", String.valueOf(this.f10594a.mConfig.mAid));
            jSONObject.put("update_version_code", this.f10594a.mConfig.mVersionInt);
            jSONObject.put("version_code", this.f10594a.mConfig.mVersionInt);
            jSONObject.put("app_version", this.f10594a.mConfig.mVersionStr);
            jSONObject.put("channel", this.f10594a.mConfig.mChannel);
            jSONObject.put("package", l.a(this.f10594a.mConfig.mPackageName));
            jSONObject.put("device_id", this.f10594a.mConfig.mDeviceId);
            jSONObject.put("user_id", this.f10594a.mConfig.mUID);
            jSONObject.put("ssid", this.f10594a.mConfig.mSSID);
            jSONObject.put("os", APSAnalytics.OS_NAME);
            jSONObject.put("so_list", l.a(this.f10594a.mConfig.mSoList));
            jSONObject.put("single_upload", d() ? 1 : 0);
        } catch (JSONException unused2) {
        }
        return jSONObject;
    }

    public JSONArray a(StackTraceElement[] stackTraceElementArr, Throwable th) {
        if (this.f10594a.mConfig.mPackageName == null) {
            return new JSONArray().put(new v.a(0, stackTraceElementArr.length).a());
        }
        if (th == null || stackTraceElementArr == null) {
            return null;
        }
        return v.a(stackTraceElementArr, this.f10594a.mConfig.mPackageName);
    }

    public JSONArray a(String[] strArr) {
        return this.f10594a.config().mPackageName == null ? new JSONArray().put(new v.a(0, strArr.length).a()) : v.a(strArr, this.f10594a.mConfig.mPackageName);
    }

    public JSONObject a(CrashType crashType) {
        return a(crashType, (JSONArray) null);
    }

    public JSONObject a(CrashType crashType, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("header", e());
            if (crashType != null) {
                jSONObject.put(OSNotificationFormatHelper.PAYLOAD_OS_ROOT_CUSTOM, b(crashType));
                jSONObject.put("filters", c(crashType));
            }
            jSONObject.put("line_num", jSONArray);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public boolean a(Object obj) {
        return this.f10594a == obj;
    }

    public String b() {
        return this.f10594a.mConfig.mAid;
    }

    public JSONObject c() {
        return e();
    }

    public boolean d() {
        return false;
    }
}
