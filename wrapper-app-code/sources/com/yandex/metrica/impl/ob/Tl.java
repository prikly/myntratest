package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.appnext.base.b.d;
import com.yandex.metrica.b;
import com.yandex.metrica.impl.ob.C0877zl;
import com.yandex.metrica.impl.ob.If;
import io.bidmachine.utils.IabUtils;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Tl {

    public static class a extends JSONObject {
        public a() {
        }

        public Long a(String str) {
            try {
                return Long.valueOf(getLong(str));
            } catch (Throwable unused) {
                return null;
            }
        }

        public String b(String str) {
            if (!has(str) || !has(str)) {
                return "";
            }
            try {
                return getString(str);
            } catch (Throwable unused) {
                return "";
            }
        }

        public String c(String str) {
            if (has(str)) {
                try {
                    return getString(str);
                } catch (Throwable unused) {
                }
            }
            return "";
        }

        public boolean d(String str) {
            try {
                return JSONObject.NULL != get(str);
            } catch (Throwable unused) {
                return false;
            }
        }

        public a(String str) throws JSONException {
            super(str);
        }
    }

    public static <T> T a(T t, T t2) {
        return t == null ? t2 : t;
    }

    public static String a(Context context, String str) throws UnsupportedEncodingException {
        byte[] a2 = a(context, Base64.decode(str.getBytes("UTF-8"), 0));
        if (a2 == null) {
            return null;
        }
        try {
            return new String(L0.a(new String(a2, "UTF-8")), "UTF-8");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static byte[] b(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest instance = MessageDigest.getInstance("MD5");
        instance.reset();
        instance.update(str.getBytes("UTF-8"));
        return instance.digest();
    }

    public static String c(Map<String, String> map) {
        if (A2.b((Map) map)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry next : map.entrySet()) {
            sb.append((String) next.getKey());
            sb.append(":");
            sb.append((String) next.getValue());
            sb.append(",");
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }

    public static boolean d(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return false;
        }
        for (Map.Entry value : map.entrySet()) {
            try {
                Integer.parseInt((String) value.getValue());
            } catch (Throwable unused) {
                return false;
            }
        }
        return true;
    }

    public static JSONObject e(Map map) {
        if (A2.b(map)) {
            return null;
        }
        if (A2.a(19)) {
            return new JSONObject(map);
        }
        return h(map);
    }

    public static JSONObject f(Map map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return new JSONObject();
        }
        return e(map);
    }

    public static String g(Map map) {
        if (A2.b(map)) {
            return null;
        }
        if (A2.a(19)) {
            return new JSONObject(map).toString();
        }
        return a((Object) map).toString();
    }

    private static JSONObject h(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String obj = entry.getKey().toString();
            if (obj != null) {
                linkedHashMap.put(obj, a(entry.getValue()));
            }
        }
        return new JSONObject(linkedHashMap);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005c, code lost:
        if (r2 != -1) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map<java.lang.String, java.lang.String> i(java.util.Map<java.lang.String, java.lang.String> r9) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            if (r9 == 0) goto L_0x006e
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L_0x000f:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x006e
            java.lang.Object r1 = r9.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0043
            java.lang.String r3 = ":"
            boolean r3 = r2.contains(r3)
            if (r3 != 0) goto L_0x0043
            java.lang.String r3 = ","
            boolean r3 = r2.contains(r3)
            if (r3 != 0) goto L_0x0043
            java.lang.String r3 = "&"
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L_0x0043
            r2 = 1
            goto L_0x0044
        L_0x0043:
            r2 = 0
        L_0x0044:
            if (r2 == 0) goto L_0x000f
            java.lang.Object r2 = r1.getValue()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x005f
            r6 = -1
            long r2 = java.lang.Long.parseLong(r2)     // Catch:{ NumberFormatException -> 0x0059 }
            goto L_0x005a
        L_0x0059:
            r2 = r6
        L_0x005a:
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r4 = 0
        L_0x0060:
            if (r4 == 0) goto L_0x000f
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            r0.put(r2, r1)
            goto L_0x000f
        L_0x006e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.Tl.i(java.util.Map):java.util.Map");
    }

    public static String b(Context context, String str) throws UnsupportedEncodingException {
        String str2;
        try {
            str2 = L0.a(str.getBytes("UTF-8"));
        } catch (Throwable unused) {
            str2 = null;
        }
        return Base64.encodeToString(a(context, str2.getBytes("UTF-8")), 0);
    }

    public static C0295c2 f(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            return new C0295c2(jSONObject.optInt(IabUtils.KEY_WIDTH), jSONObject.optInt(IabUtils.KEY_HEIGHT), jSONObject.optInt("dpi"), (float) jSONObject.optDouble("scaleFactor", 0.0d), b.a(jSONObject.optString("deviceType")));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Map<String, String> a(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : str.split(",")) {
                int indexOf = str2.indexOf(":");
                if (indexOf != -1) {
                    hashMap.put(str2.substring(0, indexOf), str2.substring(indexOf + 1));
                }
            }
        }
        return hashMap;
    }

    public static HashMap<String, String> d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return b(new JSONObject(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String c(List<String> list) {
        if (A2.b((Collection) list)) {
            return null;
        }
        if (A2.a(19)) {
            return new JSONArray(list).toString();
        }
        return a((Object) list).toString();
    }

    private static JSONArray b(Collection<?> collection) {
        if (collection == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList(collection.size());
            for (Object a2 : collection) {
                arrayList.add(a((Object) a2));
            }
            return new JSONArray(arrayList);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static HashMap<String, String> e(String str) throws JSONException {
        return b(new JSONObject(str));
    }

    public static JSONArray b(List<?> list) {
        if (A2.b((Collection) list)) {
            return null;
        }
        if (A2.a(19)) {
            return new JSONArray(list);
        }
        return b((Collection<?>) list);
    }

    public static long a(Long l, TimeUnit timeUnit, long j) {
        return l == null ? j : timeUnit.toMillis(l.longValue());
    }

    private static byte[] a(Context context, byte[] bArr) {
        try {
            byte[] b2 = b(context.getPackageName());
            byte[] bArr2 = new byte[bArr.length];
            for (int i = 0; i < bArr.length; i++) {
                bArr2[i] = (byte) (bArr[i] ^ b2[i % b2.length]);
            }
            return bArr2;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static List<String> c(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                ArrayList arrayList = new ArrayList(jSONArray.length());
                int i = 0;
                while (i < jSONArray.length()) {
                    try {
                        arrayList.add(jSONArray.getString(i));
                        i++;
                    } catch (Throwable unused) {
                        return arrayList;
                    }
                }
                return arrayList;
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    public static Object a(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            if (obj.getClass().isArray()) {
                int length = Array.getLength(obj);
                ArrayList arrayList = new ArrayList(length);
                for (int i = 0; i < length; i++) {
                    arrayList.add(a(Array.get(obj, i)));
                }
                return new JSONArray(arrayList);
            } else if (obj instanceof Collection) {
                return b((Collection<?>) (Collection) obj);
            } else {
                return obj instanceof Map ? h((Map) obj) : obj;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    public static HashMap<String, String> b(JSONObject jSONObject) {
        if (JSONObject.NULL.equals(jSONObject)) {
            return null;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = jSONObject.optString(next);
            if (optString != null) {
                hashMap.put(next, optString);
            }
        }
        return hashMap;
    }

    public static C0389fl c(JSONObject jSONObject) throws JSONException {
        C0805wl wlVar;
        C0439hl hlVar;
        C0439hl hlVar2;
        JSONObject jSONObject2 = jSONObject;
        If.i iVar = new If.i();
        JSONObject optJSONObject = jSONObject2.optJSONObject("upc");
        JSONObject optJSONObject2 = jSONObject2.optJSONObject("uecc");
        JSONObject optJSONObject3 = jSONObject2.optJSONObject("ucfbc");
        JSONObject optJSONObject4 = jSONObject2.optJSONObject("ruecc");
        boolean optBoolean = jSONObject2.optBoolean("upe", iVar.o);
        boolean optBoolean2 = jSONObject2.optBoolean("uece", iVar.p);
        boolean optBoolean3 = jSONObject2.optBoolean("ucfbe", iVar.q);
        boolean optBoolean4 = jSONObject2.optBoolean("ruece", iVar.u);
        C0439hl hlVar3 = null;
        if (optJSONObject == null) {
            wlVar = null;
        } else {
            If.w wVar = new If.w();
            wlVar = new C0805wl(optJSONObject.optInt("tltb", wVar.f4248a), optJSONObject.optInt("ttb", wVar.f4249b), optJSONObject.optInt("mvcl", wVar.f4250c), optJSONObject.optLong("act", wVar.f4251d), optJSONObject.optBoolean("rtsc", wVar.f4252e), optJSONObject.optBoolean("er", wVar.f4253f), optJSONObject.optBoolean("pabd", wVar.f4254g), a(optJSONObject.optJSONArray("f")));
        }
        if (optJSONObject2 == null) {
            hlVar = null;
        } else {
            hlVar = a(optJSONObject2, C0542m0.b());
        }
        if (optJSONObject3 == null) {
            hlVar2 = null;
        } else {
            hlVar2 = a(optJSONObject3, C0542m0.a());
        }
        if (optJSONObject4 != null) {
            hlVar3 = a(optJSONObject4, C0542m0.b());
        }
        return new C0389fl(optBoolean, optBoolean2, optBoolean3, optBoolean4, wlVar, hlVar, hlVar2, hlVar3);
    }

    public static String b(JSONObject jSONObject, String str) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return jSONObject.getString(str);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static String a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return "";
        }
        return g(map);
    }

    public static List<String> b(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    public static Long a(JSONObject jSONObject, String str, Long l) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return l;
        }
        try {
            return Long.valueOf(jSONObject.getLong(str));
        } catch (Throwable unused) {
            return l;
        }
    }

    public static String b(Map<String, List<String>> map) {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry next : map.entrySet()) {
                JSONArray b2 = b((List<?>) (List) next.getValue());
                if (b2 != null) {
                    jSONObject.put((String) next.getKey(), b2.toString());
                }
            }
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    public static String a(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        String b2 = b(jSONObject, str);
        if (jSONObject2 == null || !jSONObject2.has(str)) {
            return b2;
        }
        try {
            return jSONObject2.getString(str);
        } catch (Throwable unused) {
            return b2;
        }
    }

    public static Integer a(JSONObject jSONObject, String str, Integer num) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return num;
        }
        try {
            return Integer.valueOf(jSONObject.getInt(str));
        } catch (Throwable unused) {
            return num;
        }
    }

    public static boolean a(JSONObject jSONObject, String str, boolean z) {
        Boolean a2 = a(jSONObject, str, (Boolean) null);
        return a2 == null ? z : a2.booleanValue();
    }

    public static Boolean a(JSONObject jSONObject, String str, Boolean bool) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return bool;
        }
        try {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        } catch (Throwable unused) {
            return bool;
        }
    }

    public static JSONArray a(Collection<C0755uj> collection) {
        JSONArray jSONArray = new JSONArray();
        if (collection != null) {
            for (C0755uj a2 : collection) {
                try {
                    jSONArray.put(a(a2));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    public static JSONObject a(C0755uj ujVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cell_id", ujVar.b());
        jSONObject.put("signal_strength", ujVar.p());
        jSONObject.put("lac", ujVar.e());
        jSONObject.put("country_code", ujVar.k());
        jSONObject.put("operator_id", ujVar.l());
        jSONObject.put("operator_name", ujVar.n());
        jSONObject.put("is_connected", ujVar.q());
        jSONObject.put("cell_type", ujVar.c());
        jSONObject.put("pci", ujVar.o());
        jSONObject.put("last_visible_time_offset", ujVar.d());
        jSONObject.put("lte_rsrq", ujVar.h());
        jSONObject.put("lte_rssnr", ujVar.j());
        jSONObject.put("arfcn", ujVar.a());
        jSONObject.put("lte_rssi", ujVar.i());
        jSONObject.put("lte_bandwidth", ujVar.f());
        jSONObject.put("lte_cqi", ujVar.g());
        return jSONObject;
    }

    public static JSONObject a(C0389fl flVar) throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject put = new JSONObject().put("upe", flVar.f5821a).put("uece", flVar.f5822b).put("ruece", flVar.f5824d).put("ucfbe", flVar.f5823c);
        C0805wl wlVar = flVar.f5825e;
        JSONObject jSONObject4 = null;
        if (wlVar == null) {
            jSONObject = null;
        } else {
            jSONObject = new JSONObject().put("tltb", wlVar.f7065a).put("ttb", wlVar.f7066b).put("mvcl", wlVar.f7067c).put("act", wlVar.f7068d).put("rtsc", wlVar.f7069e).put("er", wlVar.f7070f).put("pabd", wlVar.f7071g).put("f", a(wlVar.f7072h));
        }
        JSONObject putOpt = put.putOpt("upc", jSONObject);
        C0439hl hlVar = flVar.f5826f;
        if (hlVar == null) {
            jSONObject2 = null;
        } else {
            jSONObject2 = a(hlVar);
        }
        JSONObject putOpt2 = putOpt.putOpt("uecc", jSONObject2);
        C0439hl hlVar2 = flVar.f5828h;
        if (hlVar2 == null) {
            jSONObject3 = null;
        } else {
            jSONObject3 = a(hlVar2);
        }
        JSONObject putOpt3 = putOpt2.putOpt("ruecc", jSONObject3);
        C0439hl hlVar3 = flVar.f5827g;
        if (hlVar3 != null) {
            jSONObject4 = a(hlVar3);
        }
        return putOpt3.putOpt("ucfbc", jSONObject4);
    }

    private static JSONObject a(C0439hl hlVar) throws JSONException {
        return new JSONObject().put("tsc", hlVar.f5943a).put("rtsc1", hlVar.f5944b).put("tvc", hlVar.f5945c).put("tsc1", hlVar.f5946d).put("ic", hlVar.f5947e).put("ncvc", hlVar.f5948f).put("tlc", hlVar.f5949g).put("vh", hlVar.f5950h).put("if", hlVar.i).put("wvuc", hlVar.j).put("tltb", hlVar.k).put("ttb", hlVar.l).put("mec", hlVar.m).put("mfcl", hlVar.n).put("wvul", hlVar.o).put("f", a(hlVar.p));
    }

    private static C0439hl a(JSONObject jSONObject, If.v vVar) {
        JSONObject jSONObject2 = jSONObject;
        If.v vVar2 = vVar;
        return new C0439hl(jSONObject2.optBoolean("tsc", vVar2.f4240a), jSONObject2.optBoolean("rtsc1", vVar2.f4241b), jSONObject2.optBoolean("tvc", vVar2.f4242c), jSONObject2.optBoolean("tsc1", vVar2.f4243d), jSONObject2.optBoolean("ic", vVar2.i), jSONObject2.optBoolean("ncvc", vVar2.j), jSONObject2.optBoolean("tlc", vVar2.k), jSONObject2.optBoolean("vh", vVar2.l), jSONObject2.optBoolean("if", vVar2.n), jSONObject2.optBoolean("wvuc", vVar2.o), jSONObject2.optInt("tltb", vVar2.f4244e), jSONObject2.optInt("ttb", vVar2.f4245f), jSONObject2.optInt("mec", vVar2.f4246g), jSONObject2.optInt("mfcl", vVar2.f4247h), jSONObject2.optInt("wvul", vVar2.p), a(jSONObject2.optJSONArray("f")));
    }

    private static JSONArray a(List<C0877zl> list) {
        JSONArray jSONArray = new JSONArray();
        for (C0877zl next : list) {
            try {
                jSONArray.put(new JSONObject().put("ft", next.f7237a.f7244a).put("fv", next.f7238b));
            } catch (Throwable unused) {
            }
        }
        return jSONArray;
    }

    private static List<C0877zl> a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    arrayList.add(new C0877zl(C0877zl.b.a(jSONObject.getInt("ft")), jSONObject.optString("fv")));
                } catch (Throwable unused) {
                }
            }
        }
        return arrayList;
    }

    public static C0674ra a(JSONObject jSONObject) {
        return new C0674ra(a(jSONObject, "activation"), a(jSONObject, "satellite_clids"), a(jSONObject, "preload_info"));
    }

    public static JSONObject a(C0674ra raVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("activation", a(raVar.f6692a));
            jSONObject.putOpt("preload_info", a(raVar.f6694c));
            jSONObject.putOpt("satellite_clids", a(raVar.f6693b));
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    private static C0651qa a(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject != null) {
            return new C0651qa(optJSONObject.optLong("exp_t"), optJSONObject.optInt(d.fn));
        }
        return null;
    }

    private static JSONObject a(C0651qa qaVar) {
        if (qaVar == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("exp_t", qaVar.f6553a).put(d.fn, qaVar.f6554b);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public static String a(C0295c2 c2Var) {
        JSONObject jSONObject;
        if (c2Var == null) {
            jSONObject = null;
        } else {
            jSONObject = new JSONObject();
            try {
                jSONObject.put(IabUtils.KEY_WIDTH, c2Var.e()).put(IabUtils.KEY_HEIGHT, c2Var.c()).put("dpi", c2Var.b()).put("scaleFactor", (double) c2Var.d()).putOpt("deviceType", c2Var.a() == null ? null : c2Var.a().a());
            } catch (Throwable unused) {
            }
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.toString();
    }
}
