package com.applovin.impl.sdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.preference.PreferenceManager;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.applovin.impl.sdk.c.b;
import com.applovin.impl.sdk.c.c;
import com.applovin.impl.sdk.c.d;
import com.applovin.impl.sdk.c.e;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.v;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class i {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f15822a = {7, 4, 2, 1, 11};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f15823b = {5, 6, 12, 10, 3, 9, 8, 14};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f15824c = {15, 13};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f15825d = {20};

    public static String a(InputStream inputStream, n nVar) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[((Integer) nVar.a(b.dd)).intValue()];
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                return byteArrayOutputStream.toString("UTF-8");
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static String a(String str, n nVar) {
        return a((String) nVar.a(b.bc), str, nVar);
    }

    public static String a(String str, String str2, n nVar) {
        if (str == null || str.length() < 4) {
            throw new IllegalArgumentException("Invalid domain specified");
        } else if (str2 == null) {
            throw new IllegalArgumentException("No endpoint specified");
        } else if (nVar != null) {
            return str + str2;
        } else {
            throw new IllegalArgumentException("No sdk specified");
        }
    }

    public static JSONObject a(JSONObject jSONObject) throws JSONException {
        return (JSONObject) jSONObject.getJSONArray("results").get(0);
    }

    public static void a(int i, n nVar) {
        if (i == 401) {
            v.i("AppLovinSdk", "SDK key \"" + nVar.C() + "\" is rejected by AppLovin. Please make sure the SDK key is correct.");
        } else if (i == 418) {
            nVar.O().a((b<?>) b.Z, (Object) true);
            nVar.O().a();
        } else {
            if (i < 400 || i >= 500) {
                if (i != -1 || !((Boolean) nVar.a(b.ab)).booleanValue()) {
                    return;
                }
            } else if (!((Boolean) nVar.a(b.ab)).booleanValue()) {
                return;
            }
            nVar.k();
        }
    }

    public static void a(JSONObject jSONObject, boolean z, n nVar) {
        nVar.aj().a(jSONObject, z);
    }

    public static boolean a() {
        return a((String) null);
    }

    private static boolean a(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(Context context) {
        if (context.getSystemService("connectivity") == null) {
            return true;
        }
        NetworkInfo b2 = b(context);
        if (b2 != null) {
            return b2.isConnected();
        }
        return false;
    }

    public static boolean a(String str) {
        if (h.e()) {
            return (!h.f() || TextUtils.isEmpty(str)) ? NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted() : NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        }
        return true;
    }

    private static NetworkInfo b(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            return connectivityManager.getActiveNetworkInfo();
        }
        return null;
    }

    public static String b(String str, n nVar) {
        return a((String) nVar.a(b.bd), str, nVar);
    }

    public static void c(JSONObject jSONObject, n nVar) {
        String string = JsonUtils.getString(jSONObject, "persisted_data", (String) null);
        if (StringUtils.isValidString(string)) {
            nVar.a(d.z, string);
            nVar.D();
            if (v.a()) {
                nVar.D().c("ConnectionUtils", "Updated persisted data");
            }
        }
    }

    public static void d(JSONObject jSONObject, n nVar) {
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        } else if (nVar != null) {
            try {
                if (jSONObject.has(com.appnext.core.a.b.hW)) {
                    c O = nVar.O();
                    if (!jSONObject.isNull(com.appnext.core.a.b.hW)) {
                        O.a(jSONObject.getJSONObject(com.appnext.core.a.b.hW));
                        O.a();
                    }
                }
            } catch (JSONException e2) {
                nVar.D();
                if (v.a()) {
                    nVar.D().b("ConnectionUtils", "Unable to parse settings out of API response", e2);
                }
            }
        } else {
            throw new IllegalArgumentException("No sdk specified");
        }
    }

    public static Map<String, String> e(n nVar) {
        String str;
        Map<String, String> map = CollectionUtils.map();
        String str2 = (String) nVar.a(b.ac);
        if (StringUtils.isValidString(str2)) {
            str = "device_token";
        } else {
            if (!((Boolean) nVar.a(b.eA)).booleanValue()) {
                str2 = nVar.C();
                str = "api_key";
            }
            map.putAll(Utils.stringifyObjectMap(nVar.Y().i()));
            return map;
        }
        map.put(str, str2);
        map.putAll(Utils.stringifyObjectMap(nVar.Y().i()));
        return map;
    }

    public static void e(JSONObject jSONObject, n nVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "filesystem_values", (JSONObject) null);
        if (jSONObject2 != null) {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(nVar.P()).edit();
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object object = JsonUtils.getObject(jSONObject2, next, (Object) null);
                if (object != null) {
                    e.a(next, object, (SharedPreferences) null, edit);
                }
            }
            edit.apply();
        }
    }

    public static String f(n nVar) {
        NetworkInfo b2 = b(nVar.P());
        if (b2 == null) {
            return DtbDeviceDataRetriever.ORIENTATION_UNKNOWN;
        }
        int type = b2.getType();
        int subtype = b2.getSubtype();
        return type == 1 ? "wifi" : type == 0 ? a(subtype, f15822a) ? "2g" : a(subtype, f15823b) ? "3g" : a(subtype, f15824c) ? "4g" : a(subtype, f15825d) ? "5g" : "mobile" : DtbDeviceDataRetriever.ORIENTATION_UNKNOWN;
    }

    public static void f(JSONObject jSONObject, n nVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "variables", (JSONObject) null);
        if (jSONObject2 != null) {
            nVar.z().updateVariables(jSONObject2);
        }
    }

    public static String g(n nVar) {
        return a((String) nVar.a(b.ba), ((Boolean) nVar.a(b.dl)).booleanValue() ? "5.0/ad" : "4.0/ad", nVar);
    }

    public static String h(n nVar) {
        return a((String) nVar.a(b.bb), ((Boolean) nVar.a(b.dl)).booleanValue() ? "5.0/ad" : "4.0/ad", nVar);
    }

    public static String i(n nVar) {
        return a((String) nVar.a(b.ba), "4.0/ad", nVar);
    }

    public static String j(n nVar) {
        return a((String) nVar.a(b.bb), "4.0/ad", nVar);
    }

    public static String k(n nVar) {
        return a((String) nVar.a(b.bg), "1.0/variable_config", nVar);
    }

    public static String l(n nVar) {
        return a((String) nVar.a(b.bh), "1.0/variable_config", nVar);
    }
}
