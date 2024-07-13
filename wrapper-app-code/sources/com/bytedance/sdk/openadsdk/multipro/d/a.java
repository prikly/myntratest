package com.bytedance.sdk.openadsdk.multipro.d;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.multipro.aidl.a.g;
import com.bytedance.sdk.openadsdk.multipro.b;
import com.bytedance.sdk.openadsdk.multipro.e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashSet;
import java.util.Set;

/* compiled from: SPMultiHelper */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static Context f2174a;

    public static boolean a() {
        if (f2174a != null && m.a() != null) {
            return true;
        }
        l.b("The context of SPHelper is null, please initialize sdk in main process");
        return false;
    }

    private static IListenerManager b() {
        try {
            if (!a()) {
                return null;
            }
            if (!b.c()) {
                return g.a();
            }
            return com.bytedance.sdk.openadsdk.multipro.a.a.a(m.a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void a(Context context) {
        f2174a = context == null ? m.a() : context.getApplicationContext();
    }

    private static String c() {
        return e.f2178b + "/" + "t_sp" + "/";
    }

    private static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return "?sp_file_name=" + str;
    }

    public static synchronized void a(String str, String str2, Boolean bool) {
        synchronized (a.class) {
            if (a()) {
                try {
                    IListenerManager b2 = b();
                    if (b2 != null) {
                        Uri parse = Uri.parse(c() + "boolean" + "/" + str2 + b(str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, bool);
                        b2.update(parse, contentValues, (String) null, (String[]) null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static synchronized void a(String str, String str2) {
        synchronized (a.class) {
            a((String) null, str, str2);
        }
    }

    public static synchronized void a(String str, String str2, String str3) {
        synchronized (a.class) {
            if (a()) {
                try {
                    IListenerManager b2 = b();
                    if (b2 != null) {
                        Uri parse = Uri.parse(c() + "string" + "/" + str2 + b(str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, str3);
                        b2.update(parse, contentValues, (String) null, (String[]) null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static synchronized void a(String str, String str2, Integer num) {
        synchronized (a.class) {
            if (a()) {
                try {
                    IListenerManager b2 = b();
                    if (b2 != null) {
                        Uri parse = Uri.parse(c() + "int" + "/" + str2 + b(str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, num);
                        b2.update(parse, contentValues, (String) null, (String[]) null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static synchronized void a(String str, String str2, Long l) {
        synchronized (a.class) {
            if (a()) {
                try {
                    IListenerManager b2 = b();
                    if (b2 != null) {
                        Uri parse = Uri.parse(c() + "long" + "/" + str2 + b(str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, l);
                        b2.update(parse, contentValues, (String) null, (String[]) null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static synchronized void a(String str, String str2, Float f2) {
        synchronized (a.class) {
            if (a()) {
                try {
                    IListenerManager b2 = b();
                    if (b2 != null) {
                        Uri parse = Uri.parse(c() + "float" + "/" + str2 + b(str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, f2);
                        b2.update(parse, contentValues, (String) null, (String[]) null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static synchronized void a(String str, String str2, Set<String> set) {
        synchronized (a.class) {
            if (a()) {
                try {
                    IListenerManager b2 = b();
                    if (b2 != null) {
                        Uri parse = Uri.parse(c() + "string_set" + "/" + str2 + b(str));
                        ContentValues contentValues = new ContentValues();
                        HashSet hashSet = new HashSet();
                        for (String replace : set) {
                            hashSet.add(replace.replace(",", "__COMMA__"));
                        }
                        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, hashSet.toString());
                        b2.update(parse, contentValues, (String) null, (String[]) null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static String b(String str, String str2, String str3) {
        if (!a()) {
            return str3;
        }
        try {
            IListenerManager b2 = b();
            if (b2 != null) {
                String type = b2.getType(Uri.parse(c() + "string" + "/" + str2 + b(str)));
                return (type == null || type.equals("null")) ? str3 : type;
            }
        } catch (Throwable unused) {
        }
    }

    public static int a(String str, String str2, int i) {
        if (!a()) {
            return i;
        }
        try {
            IListenerManager b2 = b();
            if (b2 != null) {
                String type = b2.getType(Uri.parse(c() + "int" + "/" + str2 + b(str)));
                if (type != null) {
                    if (!type.equals("null")) {
                        return Integer.parseInt(type);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return i;
    }

    public static float a(String str, String str2, float f2) {
        if (!a()) {
            return f2;
        }
        try {
            IListenerManager b2 = b();
            if (b2 != null) {
                String type = b2.getType(Uri.parse(c() + "float" + "/" + str2 + b(str)));
                if (type != null) {
                    if (!type.equals("null")) {
                        return Float.parseFloat(type);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return f2;
    }

    public static boolean a(String str, String str2, boolean z) {
        if (!a()) {
            return z;
        }
        try {
            IListenerManager b2 = b();
            if (b2 != null) {
                String type = b2.getType(Uri.parse(c() + "boolean" + "/" + str2 + b(str)));
                if (type != null) {
                    if (!type.equals("null")) {
                        return Boolean.parseBoolean(type);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return z;
    }

    public static long a(String str, String str2, long j) {
        if (!a()) {
            return j;
        }
        try {
            IListenerManager b2 = b();
            if (b2 != null) {
                String type = b2.getType(Uri.parse(c() + "long" + "/" + str2 + b(str)));
                if (type != null) {
                    if (!type.equals("null")) {
                        return Long.parseLong(type);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return j;
    }

    public static Set<String> b(String str, String str2, Set<String> set) {
        if (!a()) {
            return set;
        }
        try {
            IListenerManager b2 = b();
            if (b2 != null) {
                String type = b2.getType(Uri.parse(c() + "string_set" + "/" + str2 + b(str)));
                if (type != null) {
                    if (!type.equals("null")) {
                        if (!type.matches("\\[.*\\]")) {
                            return set;
                        }
                        String[] split = type.substring(1, type.length() - 1).split(", ");
                        HashSet hashSet = new HashSet();
                        for (String replace : split) {
                            hashSet.add(replace.replace("__COMMA__", ", "));
                        }
                        return hashSet;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return set;
    }

    public static void b(String str, String str2) {
        if (a()) {
            try {
                IListenerManager b2 = b();
                if (b2 != null) {
                    b2.delete(Uri.parse(c() + "long" + "/" + str2 + b(str)), (String) null, (String[]) null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(String str) {
        if (a()) {
            try {
                IListenerManager b2 = b();
                if (b2 != null) {
                    b2.delete(Uri.parse(c() + "clean" + b(str)), (String) null, (String[]) null);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
