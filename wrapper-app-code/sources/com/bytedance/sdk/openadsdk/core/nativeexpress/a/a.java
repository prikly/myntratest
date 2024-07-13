package com.bytedance.sdk.openadsdk.core.nativeexpress.a;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.e.k;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import io.bidmachine.utils.IabUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: TemplateUtils */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static String f1417a = "";

    public static boolean a(n nVar) {
        return true;
    }

    public static boolean a(n.a aVar) {
        if (aVar == null || TextUtils.isEmpty(aVar.b()) || TextUtils.isEmpty(aVar.e())) {
            return false;
        }
        return true;
    }

    public static JSONObject a(float f2, float f3, boolean z, n nVar) {
        String str;
        String str2;
        JSONObject jSONObject = new JSONObject();
        try {
            if (!a(nVar.G())) {
                f1417a = "";
            }
            jSONObject.put("platform", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(IabUtils.KEY_WIDTH, (double) f2);
            jSONObject2.put(IabUtils.KEY_HEIGHT, (double) f3);
            if (z) {
                jSONObject2.put("isLandscape", true);
            }
            jSONObject.put("AdSize", jSONObject2);
            jSONObject.put("creative", a(false, nVar));
            if (nVar.G() != null) {
                str2 = nVar.G().e();
                str = nVar.G().f();
            } else {
                str2 = null;
                str = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                f1417a = str2;
            } else if (!(nVar == null || nVar.G() == null || com.bytedance.sdk.component.adexpress.a.b.a.c(nVar.G().b()) == null)) {
                f1417a = com.bytedance.sdk.component.adexpress.a.b.a.c(nVar.G().b()).e();
            }
            jSONObject.put("template_Plugin", f1417a);
            jSONObject.put("diff_template_Plugin", str);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public static JSONObject a(boolean z, n nVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("button_text", nVar.W());
            if (nVar.M() != null) {
                if (nVar.M() != null) {
                    if (!TextUtils.isEmpty(nVar.M().a())) {
                        jSONObject.put("icon", nVar.M().a());
                    }
                }
                jSONObject.put("icon", "");
            }
            JSONArray jSONArray = new JSONArray();
            if (nVar.P() != null) {
                for (int i = 0; i < nVar.P().size(); i++) {
                    k kVar = nVar.P().get(i);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(IabUtils.KEY_HEIGHT, kVar.c());
                    jSONObject2.put(IabUtils.KEY_WIDTH, kVar.b());
                    jSONObject2.put("url", kVar.a());
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("image", jSONArray);
            jSONObject.put("image_mode", nVar.ad());
            jSONObject.put("interaction_type", nVar.L());
            jSONObject.put("interaction_method", nVar.g());
            jSONObject.put("is_compliance_template", a(nVar));
            jSONObject.put("title", nVar.U());
            jSONObject.put("description", nVar.V());
            jSONObject.put("source", nVar.K());
            if (nVar.aa() != null) {
                jSONObject.put("comment_num", nVar.aa().e());
                jSONObject.put("score", nVar.aa().d());
                jSONObject.put("app_size", nVar.aa().f());
                jSONObject.put("app", nVar.aa().g());
            }
            if (nVar.J() != null) {
                jSONObject.put("video", nVar.J().p());
            }
            if (nVar.G() != null) {
                jSONObject.put("dynamic_creative", nVar.G().g());
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String a(n nVar, String str) {
        List<k> P;
        if (!(nVar == null || (P = nVar.P()) == null || P.size() <= 0)) {
            for (k next : P) {
                if (next != null && TextUtils.equals(str, next.a())) {
                    return next.g();
                }
            }
        }
        return null;
    }

    public static Map<String, String> b(n nVar) {
        HashMap hashMap = null;
        if (nVar == null) {
            return null;
        }
        List<k> P = nVar.P();
        if (P != null && P.size() > 0) {
            hashMap = new HashMap();
            for (k next : P) {
                if (next != null) {
                    hashMap.put(next.a(), next.g());
                }
            }
        }
        return hashMap;
    }
}
