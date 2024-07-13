package com.bytedance.sdk.openadsdk.multipro.d;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: SPMultiHelperImpl */
class b {

    /* renamed from: a  reason: collision with root package name */
    private static SoftReference<ConcurrentHashMap<String, Map<String, Object>>> f2175a;

    private static SharedPreferences c(Context context, String str) {
        if (context == null) {
            return null;
        }
        return context.getSharedPreferences(a(str), 0);
    }

    private static String a(String str) {
        return TextUtils.isEmpty(str) ? "sphelper_ttopenadsdk" : str;
    }

    private static Object a(String str, String str2) {
        ConcurrentHashMap concurrentHashMap;
        Map map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = f2175a;
        if (softReference == null || (concurrentHashMap = softReference.get()) == null || (map = (Map) concurrentHashMap.get(a(str))) == null) {
            return null;
        }
        return map.get(str2);
    }

    private static void a(String str, String str2, Object obj) {
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = f2175a;
        if (softReference == null || softReference.get() == null) {
            f2175a = new SoftReference<>(new ConcurrentHashMap());
        }
        String a2 = a(str);
        ConcurrentHashMap concurrentHashMap = f2175a.get();
        if (concurrentHashMap.get(a2) == null) {
            concurrentHashMap.put(a2, new HashMap());
        }
        ((Map) concurrentHashMap.get(a2)).put(str2, obj);
    }

    private static void b(String str) {
        Map map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = f2175a;
        if (softReference != null && softReference.get() != null && (map = (Map) f2175a.get().get(a(str))) != null) {
            map.clear();
        }
    }

    static synchronized <T> void a(Context context, String str, String str2, T t) {
        synchronized (b.class) {
            SharedPreferences c2 = c(context, str);
            if (c2 != null) {
                if (!t.equals(a(str, str2))) {
                    SharedPreferences.Editor edit = c2.edit();
                    if (t instanceof Boolean) {
                        edit.putBoolean(str2, ((Boolean) t).booleanValue());
                    }
                    if (t instanceof String) {
                        edit.putString(str2, (String) t);
                    }
                    if (t instanceof Integer) {
                        edit.putInt(str2, ((Integer) t).intValue());
                    }
                    if (t instanceof Long) {
                        edit.putLong(str2, ((Long) t).longValue());
                    }
                    if (t instanceof Float) {
                        edit.putFloat(str2, ((Float) t).floatValue());
                    }
                    edit.apply();
                    a(str, str2, (Object) t);
                }
            }
        }
    }

    static String a(Context context, String str, String str2, String str3) {
        Object a2 = a(str, str2);
        if (a2 != null) {
            return a2 + "";
        }
        Object b2 = b(context, str, str2, str3);
        a(str, str2, b2);
        return b2 + "";
    }

    private static Object b(Context context, String str, String str2, String str3) {
        String a2 = a(str);
        if (!a(context, a2, str2)) {
            return null;
        }
        if (str3.equalsIgnoreCase("string")) {
            return c(context, a2, str2, (String) null);
        }
        if (str3.equalsIgnoreCase("boolean")) {
            return Boolean.valueOf(a(context, a2, str2, false));
        }
        if (str3.equalsIgnoreCase("int")) {
            return Integer.valueOf(a(context, a2, str2, 0));
        }
        if (str3.equalsIgnoreCase("long")) {
            return Long.valueOf(a(context, a2, str2, 0));
        }
        if (str3.equalsIgnoreCase("float")) {
            return Float.valueOf(a(context, a2, str2, 0.0f));
        }
        if (str3.equalsIgnoreCase("string_set")) {
            return c(context, a2, str2, (String) null);
        }
        return null;
    }

    private static String c(Context context, String str, String str2, String str3) {
        SharedPreferences c2 = c(context, str);
        if (c2 == null) {
            return str3;
        }
        return c2.getString(str2, str3);
    }

    private static int a(Context context, String str, String str2, int i) {
        SharedPreferences c2 = c(context, str);
        if (c2 == null) {
            return i;
        }
        return c2.getInt(str2, i);
    }

    private static float a(Context context, String str, String str2, float f2) {
        SharedPreferences c2 = c(context, str);
        if (c2 == null) {
            return f2;
        }
        return c2.getFloat(str2, f2);
    }

    private static boolean a(Context context, String str, String str2, boolean z) {
        SharedPreferences c2 = c(context, str);
        if (c2 == null) {
            return z;
        }
        return c2.getBoolean(str2, z);
    }

    private static long a(Context context, String str, String str2, long j) {
        SharedPreferences c2 = c(context, str);
        if (c2 == null) {
            return j;
        }
        return c2.getLong(str2, j);
    }

    static boolean a(Context context, String str, String str2) {
        SharedPreferences c2 = c(context, str);
        return c2 != null && c2.contains(str2);
    }

    static void b(Context context, String str, String str2) {
        try {
            SharedPreferences c2 = c(context, str);
            if (c2 != null) {
                SharedPreferences.Editor edit = c2.edit();
                edit.remove(str2);
                edit.apply();
                if (f2175a != null && f2175a.get() != null) {
                    Map map = (Map) f2175a.get().get(a(str));
                    if (map == null) {
                        return;
                    }
                    if (map.size() != 0) {
                        map.remove(str2);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    static void a(Context context, String str) {
        SharedPreferences.Editor edit = c(context, str).edit();
        edit.clear();
        edit.apply();
        b(str);
    }

    static Map<String, ?> b(Context context, String str) {
        return c(context, str).getAll();
    }
}
