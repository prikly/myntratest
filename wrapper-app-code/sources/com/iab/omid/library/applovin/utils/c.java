package com.iab.omid.library.applovin.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import com.iab.omid.library.applovin.adsession.OutputDeviceStatus;
import com.iab.omid.library.applovin.internal.e;
import com.iab.omid.library.applovin.walking.a;
import io.bidmachine.utils.IabUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private static WindowManager f7706a;

    /* renamed from: b  reason: collision with root package name */
    private static String[] f7707b = {"x", "y", IabUtils.KEY_WIDTH, IabUtils.KEY_HEIGHT};

    /* renamed from: c  reason: collision with root package name */
    static float f7708c = Resources.getSystem().getDisplayMetrics().density;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7709a;

        static {
            int[] iArr = new int[OutputDeviceStatus.values().length];
            f7709a = iArr;
            try {
                iArr[OutputDeviceStatus.NOT_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        final float f7710a;

        /* renamed from: b  reason: collision with root package name */
        final float f7711b;

        b(float f2, float f3) {
            this.f7710a = f2;
            this.f7711b = f3;
        }
    }

    static float a(int i) {
        return ((float) i) / f7708c;
    }

    private static b a(JSONObject jSONObject) {
        float f2;
        float f3 = 0.0f;
        if (Build.VERSION.SDK_INT < 17) {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                float f4 = 0.0f;
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        double optDouble = optJSONObject.optDouble("x");
                        double optDouble2 = optJSONObject.optDouble("y");
                        double optDouble3 = optJSONObject.optDouble(IabUtils.KEY_WIDTH);
                        double optDouble4 = optJSONObject.optDouble(IabUtils.KEY_HEIGHT);
                        f3 = Math.max(f3, (float) (optDouble + optDouble3));
                        f4 = Math.max(f4, (float) (optDouble2 + optDouble4));
                    }
                }
                f2 = f4;
                return new b(f3, f2);
            }
        } else if (f7706a != null) {
            Point point = new Point(0, 0);
            f7706a.getDefaultDisplay().getRealSize(point);
            f3 = a(point.x);
            f2 = a(point.y);
            return new b(f3, f2);
        }
        f2 = 0.0f;
        return new b(f3, f2);
    }

    public static JSONObject a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) a(i));
            jSONObject.put("y", (double) a(i2));
            jSONObject.put(IabUtils.KEY_WIDTH, (double) a(i3));
            jSONObject.put(IabUtils.KEY_HEIGHT, (double) a(i4));
        } catch (JSONException e2) {
            d.a("Error with creating viewStateObject", e2);
        }
        return jSONObject;
    }

    public static void a(Context context) {
        if (context != null) {
            f7708c = context.getResources().getDisplayMetrics().density;
            f7706a = (WindowManager) context.getSystemService("window");
        }
    }

    public static void a(JSONObject jSONObject, OutputDeviceStatus outputDeviceStatus) {
        try {
            jSONObject.put("noOutputDevice", a(outputDeviceStatus));
        } catch (JSONException e2) {
            d.a("Error with setting output device status", e2);
        }
    }

    public static void a(JSONObject jSONObject, a.C0071a aVar) {
        e a2 = aVar.a();
        JSONArray jSONArray = new JSONArray();
        for (String put : aVar.b()) {
            jSONArray.put(put);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", a2.d());
            jSONObject.put("friendlyObstructionPurpose", a2.b());
            jSONObject.put("friendlyObstructionReason", a2.a());
        } catch (JSONException e2) {
            d.a("Error with setting friendly obstruction", e2);
        }
    }

    public static void a(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e2) {
            d.a("Error with setting has window focus", e2);
        }
    }

    public static void a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e2) {
            d.a("Error with setting ad session id", e2);
        }
    }

    public static void a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e2) {
            d.a("JSONException during JSONObject.put for name [" + str + "]", e2);
        }
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(jSONObject2);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    private static boolean a(OutputDeviceStatus outputDeviceStatus) {
        return a.f7709a[outputDeviceStatus.ordinal()] == 1;
    }

    private static boolean a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }

    public static void b(JSONObject jSONObject) {
        b a2 = a(jSONObject);
        try {
            jSONObject.put(IabUtils.KEY_WIDTH, (double) a2.f7710a);
            jSONObject.put(IabUtils.KEY_HEIGHT, (double) a2.f7711b);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public static void b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e2) {
            d.a("Error with setting not visible reason", e2);
        }
    }

    private static boolean b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!h(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean c(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!optJSONArray.optString(i, "").equals(optJSONArray2.optString(i, ""))) {
                return false;
            }
        }
        return true;
    }

    private static boolean d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    private static boolean e(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice")));
    }

    private static boolean f(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f7707b) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    private static boolean g(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    public static boolean h(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        return jSONObject != null && jSONObject2 != null && f(jSONObject, jSONObject2) && g(jSONObject, jSONObject2) && e(jSONObject, jSONObject2) && d(jSONObject, jSONObject2) && c(jSONObject, jSONObject2) && b(jSONObject, jSONObject2);
    }
}
