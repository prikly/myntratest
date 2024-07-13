package com.appodeal.ads.segments;

import android.content.Context;
import android.os.Build;
import com.adcolony.sdk.AdColonyUserMetadata;
import com.appodeal.ads.UserSettings;
import com.appodeal.ads.f1;
import com.appodeal.ads.l5;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.n5;
import com.appodeal.ads.storage.o;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.utils.Version;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.onesignal.outcomes.OSOutcomeConstants;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class j {

    /* renamed from: c  reason: collision with root package name */
    public static j f17264c;

    /* renamed from: d  reason: collision with root package name */
    public static final HashMap f17265d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public static final ArrayList f17266e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public static final o f17267f;

    /* renamed from: g  reason: collision with root package name */
    public static HashMap f17268g;

    /* renamed from: a  reason: collision with root package name */
    public float f17269a = 0.0f;

    /* renamed from: b  reason: collision with root package name */
    public boolean f17270b = false;

    public interface a {
        void a();
    }

    public interface b {
        Object a(Context context, j jVar);
    }

    public static class c implements b {

        /* renamed from: a  reason: collision with root package name */
        public Calendar f17271a = Calendar.getInstance();

        public final Object a(Context context, j jVar) {
            return Integer.valueOf(((this.f17271a.get(7) - 1) * 24) + this.f17271a.get(11));
        }
    }

    static {
        o oVar = o.f17407b;
        f17267f = oVar;
        HashMap hashMap = new HashMap();
        f17268g = hashMap;
        hashMap.put("country", $$Lambda$teFxmm5ut6Dn0bw1FrcFLrQTYRI.INSTANCE);
        f17268g.put("app_version", $$Lambda$dRr28XEkxkJkv9iXNa37EyMZfPQ.INSTANCE);
        f17268g.put("app", $$Lambda$HdOrq7HMacDjr1Y_6MuvGdJk9k0.INSTANCE);
        f17268g.put("sdk_version", $$Lambda$gxsfEQbQmT3M_A4nJZoy2NMhg8k.INSTANCE);
        f17268g.put("os_version", $$Lambda$AVe3uvdXbPDvbhyYij3tgUJVsuE.INSTANCE);
        f17268g.put("session_count", $$Lambda$adfkLLoYsv7ZJV09SwTCEUeVsk.INSTANCE);
        f17268g.put("average_session_length", $$Lambda$o279xjjeodbB0fLgP9hcOUWSvc.INSTANCE);
        f17268g.put("connection_type", $$Lambda$2o9Oib_2NLLej5I1itr6taKEjo.INSTANCE);
        f17268g.put("gender", $$Lambda$wXlI76OLFsy1A7c5OgvPxMZLfQY.INSTANCE);
        f17268g.put(IronSourceSegment.AGE, $$Lambda$xQu9gfG1ADwTk0oNeR7v9JVcmIs.INSTANCE);
        f17268g.put("bought_inapps", $$Lambda$zaJGU6z9MLV2vfN3nfoSbaoNYTk.INSTANCE);
        f17268g.put("inapp_amount", $$Lambda$SviSZYT60Lei299EAQ7uo12eg.INSTANCE);
        f17268g.put(OSOutcomeConstants.DEVICE_TYPE, $$Lambda$ZTGzNcQvBsWskrBXU6XAIf2uVfE.INSTANCE);
        f17268g.put("session_time", new c());
        f17268g.put("part_of_audience", new f(oVar));
    }

    public static HashMap a() {
        return f17265d;
    }

    public static void a(a aVar) {
        f17266e.add(aVar);
    }

    public static boolean a(Context context, int i, i[] iVarArr) {
        if (context == null || i == 0 || iVarArr == null) {
            return true;
        }
        if (i != 0) {
            int i2 = i - 1;
            if (i2 == 0) {
                for (i a2 : iVarArr) {
                    if (!a2.a(context)) {
                        return false;
                    }
                }
                return true;
            } else if (i2 != 1) {
                return false;
            } else {
                if (iVarArr.length == 0) {
                    return true;
                }
                for (i a3 : iVarArr) {
                    if (a3.a(context)) {
                        return true;
                    }
                }
                return false;
            }
        } else {
            throw null;
        }
    }

    public static i[] a(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("restrictions");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            return null;
        }
        i[] iVarArr = new i[optJSONArray.length()];
        for (int i = 0; i < optJSONArray.length(); i++) {
            try {
                iVarArr[i] = new i(optJSONArray.optJSONObject(i));
            } catch (JSONException e2) {
                Log.log(e2);
            }
        }
        return iVarArr;
    }

    public static j b() {
        if (f17264c == null) {
            f17264c = new j();
        }
        return f17264c;
    }

    public static /* synthetic */ Object b(Context context, j jVar) {
        return new Version(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName);
    }

    public static Object c(Context context, j jVar) {
        return Boolean.valueOf(jVar.f17270b);
    }

    public static Object d(Context context, j jVar) {
        return Float.valueOf(jVar.f17269a);
    }

    public static /* synthetic */ Object e(Context context, j jVar) {
        return f1.r(context) ? "tablet" : "phone";
    }

    public static Object f(Context context, j jVar) {
        return f17267f.f17408a.c();
    }

    public static /* synthetic */ Object g(Context context, j jVar) {
        return new Version(Constants.SDK_VERSION);
    }

    public static /* synthetic */ Object h(Context context, j jVar) {
        return new Version(Build.VERSION.RELEASE);
    }

    public static /* synthetic */ Object k(Context context, j jVar) {
        String type = f1.c(context).getType();
        return type != null ? type.equals("mobile") ? "mobile" : type.equals("wifi") ? "wifi" : "other" : "other";
    }

    public static /* synthetic */ Object l(Context context, j jVar) {
        UserSettings.Gender gender = n5.c().getGender();
        return gender == UserSettings.Gender.FEMALE ? AdColonyUserMetadata.USER_FEMALE : gender == UserSettings.Gender.MALE ? AdColonyUserMetadata.USER_MALE : "other";
    }

    public static Object m(Context context, j jVar) {
        return l5.a().f16591c;
    }

    public final boolean b(JSONObject jSONObject) {
        boolean z = false;
        if (jSONObject == null || !jSONObject.has("inapp_amount")) {
            return false;
        }
        float optDouble = (float) jSONObject.optDouble("inapp_amount", 0.0d);
        this.f17269a = optDouble;
        if (optDouble > 0.0f) {
            z = true;
        }
        this.f17270b = z;
        return true;
    }

    public static Object a(Context context, j jVar) {
        return l5.a().f16594f;
    }

    public static void a(String str, Object obj) {
        f17265d.put(str, obj);
        Iterator it = f17266e.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a();
        }
    }
}
