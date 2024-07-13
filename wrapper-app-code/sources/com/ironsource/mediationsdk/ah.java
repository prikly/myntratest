package com.ironsource.mediationsdk;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.appodeal.ads.modules.common.internal.Constants;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.c;
import com.ironsource.environment.h;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.k;
import com.ironsource.mediationsdk.utils.o;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

final class ah {

    /* renamed from: b  reason: collision with root package name */
    private static ah f8561b;

    /* renamed from: a  reason: collision with root package name */
    JSONObject f8562a = new JSONObject();

    private ah() {
    }

    public static synchronized ah a() {
        ah ahVar;
        synchronized (ah.class) {
            if (f8561b == null) {
                f8561b = new ah();
            }
            ahVar = f8561b;
        }
        return ahVar;
    }

    private synchronized void a(String str, Object obj) {
        try {
            this.f8562a.put(str, obj);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    static JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        int k = h.k();
        int l = h.l();
        float o = h.o();
        if (applicationContext != null) {
            try {
                ConcurrentHashMap<String, List<String>> concurrentHashMap = C0882d.a().f8591c;
                concurrentHashMap.putAll(k.a().d());
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry next : concurrentHashMap.entrySet()) {
                    jSONObject2.put((String) next.getKey(), next.getValue());
                }
                Boolean bool = H.a().y;
                if (bool != null) {
                    jSONObject.put("consent", bool.booleanValue());
                }
                String B = h.B(applicationContext);
                if (!TextUtils.isEmpty(B)) {
                    jSONObject.put("asid", B);
                }
                jSONObject.put("connT", IronSourceUtils.getConnectionType(applicationContext));
                jSONObject.put("dVol", (double) h.l(applicationContext));
                jSONObject.put("root", h.j());
                jSONObject.put("bat", h.v(applicationContext));
                jSONObject.put("diskFS", h.p());
                jSONObject.put("MD", jSONObject2);
                jSONObject.put("cTime", new Date().getTime());
                jSONObject.put("dWidth", k);
                jSONObject.put("dHeight", l);
                jSONObject.put("dScrenScle", String.valueOf(o));
                jSONObject.put("sDepIS", o.a().b(2));
                jSONObject.put("sDepRV", o.a().b(1));
                jSONObject.put("UA", h.r());
            } catch (JSONException e2) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("got the following error " + e2.getMessage());
                e2.printStackTrace();
            }
        }
        return jSONObject;
    }

    static JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        if (applicationContext != null) {
            try {
                String language = applicationContext.getResources().getConfiguration().locale.getLanguage();
                if (!TextUtils.isEmpty(language)) {
                    jSONObject.put("dLang", language.toUpperCase(Locale.ENGLISH));
                }
                String pluginType = ConfigFile.getConfigFile().getPluginType();
                if (!TextUtils.isEmpty(pluginType)) {
                    jSONObject.put("plType", pluginType);
                }
                String e2 = h.e();
                if (e2 != null) {
                    jSONObject.put("dOSVF", e2);
                    jSONObject.put("dOSV", e2.replaceAll("[^0-9/.]", ""));
                }
                String y = h.y(applicationContext);
                if (y != null) {
                    jSONObject.put("auid", y);
                }
                jSONObject.put("sId", IronSourceUtils.getSessionId());
                jSONObject.put(Constants.APP_KEY, H.a().j);
                jSONObject.put("mCar", h.i(applicationContext));
                jSONObject.put("medV", IronSourceUtils.getSDKVersion());
                jSONObject.put("dModel", Build.MODEL);
                jSONObject.put("dOS", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
                jSONObject.put("dMake", Build.MANUFACTURER);
                jSONObject.put("dAPI", String.valueOf(Build.VERSION.SDK_INT));
                jSONObject.put("bId", applicationContext.getPackageName());
                jSONObject.put("appV", c.c(applicationContext, applicationContext.getPackageName()));
                jSONObject.put("usId", H.a().k);
            } catch (JSONException e3) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("got the following error " + e3.getMessage());
                e3.printStackTrace();
            }
        }
        return jSONObject;
    }

    /* access modifiers changed from: private */
    public static JSONObject d() {
        String str;
        boolean z;
        JSONObject jSONObject = new JSONObject();
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        if (applicationContext != null) {
            String[] C = h.C(applicationContext);
            String str2 = "";
            if (C == null || C.length != 2) {
                str = str2;
                z = false;
            } else {
                str = !TextUtils.isEmpty(C[0]) ? C[0] : str2;
                z = Boolean.valueOf(C[1]).booleanValue();
            }
            if (!TextUtils.isEmpty(str)) {
                str2 = IronSourceConstants.TYPE_GAID;
            } else {
                str = h.x(applicationContext);
                if (!TextUtils.isEmpty(str)) {
                    str2 = IronSourceConstants.TYPE_UUID;
                }
            }
            try {
                jSONObject.put("advId", str);
                jSONObject.put("advType", str2);
                jSONObject.put("isLAT", z);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return jSONObject;
    }

    /* access modifiers changed from: package-private */
    public void a(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            a(next, jSONObject.opt(next));
        }
    }
}
