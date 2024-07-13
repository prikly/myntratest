package com.ironsource.mediationsdk.server;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.facebook.ads.AdSDKNotificationListener;
import com.ironsource.environment.a;
import com.ironsource.environment.c;
import com.ironsource.environment.d.b;
import com.ironsource.environment.h;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.g;
import com.ironsource.mediationsdk.utils.k;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public class ServerURL {
    private static String BASE_URL_PREFIX = "https://init.supersonicads.com/sdk/v";
    private static String BASE_URL_SUFFIX = "?request=";

    private static String createURLParams(Vector<Pair<String, String>> vector) {
        Iterator<Pair<String, String>> it = vector.iterator();
        String str = "";
        while (it.hasNext()) {
            Pair next = it.next();
            if (str.length() > 0) {
                str = str + "&";
            }
            str = str + ((String) next.first) + "=" + URLEncoder.encode((String) next.second, "UTF-8");
        }
        return str;
    }

    private static String getBaseUrl(String str) {
        return BASE_URL_PREFIX + str + BASE_URL_SUFFIX;
    }

    public static String getCPVProvidersURL(Context context, String str, String str2, String str3, String str4, boolean z, Vector<Pair<String, String>> vector) {
        Vector vector2 = new Vector();
        vector2.add(new Pair("platform", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID));
        vector2.add(new Pair("applicationKey", str));
        vector2.add(new Pair("applicationUserId", str2));
        vector2.add(new Pair("sdkVersion", IronSourceUtils.getSDKVersion()));
        if (z) {
            vector2.add(new Pair("rvManual", z ? "1" : BuildConfig.ADAPTER_VERSION));
        }
        if (IronSourceUtils.getSerr() == 0) {
            vector2.add(new Pair("serr", String.valueOf(IronSourceUtils.getSerr())));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginType())) {
            vector2.add(new Pair("pluginType", ConfigFile.getConfigFile().getPluginType()));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginVersion())) {
            vector2.add(new Pair("pluginVersion", ConfigFile.getConfigFile().getPluginVersion()));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginFrameworkVersion())) {
            vector2.add(new Pair("plugin_fw_v", ConfigFile.getConfigFile().getPluginFrameworkVersion()));
        }
        if (!TextUtils.isEmpty(str3)) {
            vector2.add(new Pair("advId", str3));
        }
        if (!TextUtils.isEmpty(str4)) {
            vector2.add(new Pair("mt", str4));
        }
        String c2 = c.c(context, context.getPackageName());
        if (!TextUtils.isEmpty(c2)) {
            vector2.add(new Pair("appVer", c2));
        }
        int i = Build.VERSION.SDK_INT;
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        vector2.add(new Pair("osVer", sb.toString()));
        vector2.add(new Pair("devMake", Build.MANUFACTURER));
        vector2.add(new Pair("devModel", Build.MODEL));
        boolean firstSession = IronSourceUtils.getFirstSession(context);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(firstSession ? 1 : 0);
        vector2.add(new Pair("fs", sb2.toString()));
        ConcurrentHashMap<String, List<String>> d2 = k.a().d();
        if (d2.containsKey("is_child_directed")) {
            vector2.add(new Pair("coppa", d2.get("is_child_directed").get(0)));
        }
        String connectionType = IronSourceUtils.getConnectionType(context);
        if (!TextUtils.isEmpty(connectionType)) {
            vector2.add(new Pair("connType", connectionType));
        }
        if (vector != null) {
            vector2.addAll(vector);
        }
        String r = h.r();
        if (r.length() != 0) {
            vector2.add(new Pair("browserUserAgent", r));
        }
        String str5 = null;
        try {
            str5 = h.a(context) + "-" + h.b(context);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (!(str5 == null || str5.length() == 0)) {
            vector2.add(new Pair("deviceLang", str5));
        }
        if (context != null) {
            vector2.add(new Pair("bundleId", context.getPackageName()));
            StringBuilder sb3 = new StringBuilder();
            sb3.append(a.AnonymousClass1.c(context));
            vector2.add(new Pair("mcc", sb3.toString()));
            StringBuilder sb4 = new StringBuilder();
            sb4.append(a.AnonymousClass1.d(context));
            vector2.add(new Pair("mnc", sb4.toString()));
            String j = h.j(context);
            if (!TextUtils.isEmpty(j)) {
                vector2.add(new Pair("icc", j));
            }
            String i2 = h.i(context);
            if (!TextUtils.isEmpty(i2)) {
                vector2.add(new Pair("mCar", i2));
            }
        }
        String c3 = h.c();
        if (!TextUtils.isEmpty(c3)) {
            vector2.add(new Pair("tz", c3));
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(h.b());
        vector2.add(new Pair("tzOff", sb5.toString()));
        String y = h.y(context);
        if (!TextUtils.isEmpty(y)) {
            vector2.add(new Pair("auid", y));
        }
        b bVar = new b();
        JSONObject a2 = bVar.f8054b.a(bVar.f8053a);
        Intrinsics.checkNotNullExpressionValue(a2, "mGlobalDataReader.getDataByKeys(mInitKeyList)");
        vector2.addAll(IronSourceUtils.parseJsonToPairVector(a2));
        return getBaseUrl(IronSourceUtils.getSDKVersion()) + URLEncoder.encode(IronSourceAES.encode(g.a().b(), createURLParams(vector2)), "UTF-8");
    }

    public static String getRequestURL(String str, boolean z, int i) {
        Vector vector = new Vector();
        vector.add(new Pair(AdSDKNotificationListener.IMPRESSION_EVENT, Boolean.toString(z)));
        vector.add(new Pair("placementId", Integer.toString(i)));
        String createURLParams = createURLParams(vector);
        return str + "&" + createURLParams;
    }
}
