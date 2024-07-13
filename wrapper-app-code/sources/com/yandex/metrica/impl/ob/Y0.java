package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import com.yandex.metrica.impl.ob.C0641q0;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class Y0 {

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f5360a = new JSONObject();

    /* renamed from: b  reason: collision with root package name */
    private final Context f5361b;

    /* renamed from: c  reason: collision with root package name */
    private final C0641q0 f5362c;

    public Y0(Context context, C0641q0 q0Var) {
        this.f5361b = context;
        this.f5362c = q0Var;
    }

    static <T> T a(JSONObject jSONObject, String str, T t) throws JSONException {
        if (!jSONObject.has(str)) {
            jSONObject.put(str, t);
        }
        return jSONObject.get(str);
    }

    private void d() throws JSONException {
        if (A2.a(24)) {
            JSONObject jSONObject = (JSONObject) a(this.f5360a, "dfid", new JSONObject());
            jSONObject.putOpt("wids", (Integer) A2.a(new B2(1), this.f5361b, "wallpaper", "getting wallpaper id", "wallpaper manager"));
            jSONObject.putOpt("widl", (Integer) A2.a(new B2(2), this.f5361b, "wallpaper", "getting wallpaper id", "wallpaper manager"));
        }
    }

    /* access modifiers changed from: package-private */
    public Y0 b() throws JSONException {
        JSONArray jSONArray;
        JSONObject jSONObject = (JSONObject) a(this.f5360a, "dfid", new JSONObject());
        if (A2.a(21)) {
            jSONArray = new JSONArray(Build.SUPPORTED_ABIS);
        } else {
            ArrayList arrayList = new ArrayList();
            String str = Build.CPU_ABI;
            if (!DtbDeviceDataRetriever.ORIENTATION_UNKNOWN.equals(str)) {
                arrayList.add(str);
            }
            String str2 = Build.CPU_ABI2;
            if (!DtbDeviceDataRetriever.ORIENTATION_UNKNOWN.equals(str2)) {
                arrayList.add(str2);
            }
            jSONArray = new JSONArray(arrayList);
        }
        jSONObject.put("cpu_abis", jSONArray);
        return this;
    }

    public Y0 c() {
        try {
            JSONObject jSONObject = (JSONObject) a(this.f5360a, "dfid", new JSONObject());
            C0641q0.a a2 = this.f5362c.a();
            jSONObject.put("tds", a2.f6505a);
            jSONObject.put("fds", a2.f6506b);
            ((JSONObject) a(this.f5360a, "dfid", new JSONObject())).put("boot_time", (System.currentTimeMillis() - SystemClock.elapsedRealtime()) / 1000);
            d();
            ((JSONObject) a(this.f5360a, "dfid", new JSONObject())).put("lc", Tl.b((List<?>) C0394g1.a(this.f5361b).a()));
        } catch (Throwable unused) {
        }
        try {
            Object obj = Class.forName("kotlin.KotlinVersion").getDeclaredField("CURRENT").get((Object) null);
            int intValue = ((Integer) obj.getClass().getDeclaredMethod("getMajor", new Class[0]).invoke(obj, new Object[0])).intValue();
            int intValue2 = ((Integer) obj.getClass().getDeclaredMethod("getMinor", new Class[0]).invoke(obj, new Object[0])).intValue();
            int intValue3 = ((Integer) obj.getClass().getDeclaredMethod("getPatch", new Class[0]).invoke(obj, new Object[0])).intValue();
            ((JSONObject) a(this.f5360a, "dfid", new JSONObject())).put("kotlin_runtime", new JSONObject().put("major", intValue).put("minor", intValue2).put("patch", intValue3));
        } catch (ClassNotFoundException unused2) {
        }
        return this;
    }

    public String toString() {
        return this.f5360a.toString();
    }

    public String a() {
        return this.f5360a.toString();
    }
}
