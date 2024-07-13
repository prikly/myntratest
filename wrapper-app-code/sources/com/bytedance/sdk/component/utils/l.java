package com.bytedance.sdk.component.utils;

import android.util.Log;
import com.bytedance.sdk.component.a;

/* compiled from: Logger */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f19253a = false;

    /* renamed from: b  reason: collision with root package name */
    private static int f19254b = 4;

    /* renamed from: c  reason: collision with root package name */
    private static a f19255c;

    public static void a(int i) {
        f19254b = i;
    }

    public static boolean a() {
        return f19254b <= 3;
    }

    public static void b() {
        f19253a = true;
        a(3);
    }

    public static boolean c() {
        return f19253a;
    }

    public static void a(String str, String str2) {
        a aVar = f19255c;
        if (aVar != null) {
            aVar.a(str, str2);
        }
        if (f19253a && str2 != null && f19254b <= 2) {
            Log.v(str, str2);
        }
    }

    public static void a(String str) {
        if (f19253a) {
            b("Logger", str);
        }
    }

    public static void b(String str, String str2) {
        a aVar = f19255c;
        if (aVar != null) {
            aVar.b(str, str2);
        }
        if (f19253a && str2 != null && f19254b <= 3) {
            Log.d(str, str2);
        }
    }

    public static void a(String str, String str2, Throwable th) {
        a aVar = f19255c;
        if (aVar != null) {
            aVar.b(str, str2 + Log.getStackTraceString(th));
        }
        if (f19253a) {
            if (!(str2 == null && th == null) && f19254b <= 3) {
                Log.d(str, str2, th);
            }
        }
    }

    public static void c(String str, String str2) {
        a aVar = f19255c;
        if (aVar != null) {
            aVar.c(str, str2);
        }
        if (f19253a && str2 != null && f19254b <= 4) {
            Log.i(str, str2);
        }
    }

    public static void a(String str, Object... objArr) {
        a aVar = f19255c;
        if (aVar != null) {
            aVar.c(str, a(objArr));
        }
        if (f19253a && objArr != null && f19254b <= 4) {
            Log.v(str, a(objArr));
        }
    }

    public static void d(String str, String str2) {
        a aVar = f19255c;
        if (aVar != null) {
            aVar.d(str, str2);
        }
        if (f19253a && str2 != null && f19254b <= 5) {
            Log.w(str, str2);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        a aVar = f19255c;
        if (aVar != null) {
            aVar.a(str, str2, th);
        }
        if (f19253a) {
            if (!(str2 == null && th == null) && f19254b <= 5) {
                Log.w(str, str2, th);
            }
        }
    }

    public static void b(String str, Object... objArr) {
        a aVar = f19255c;
        if (aVar != null) {
            aVar.d(str, a(objArr));
        }
        if (f19253a && objArr != null && f19254b <= 5) {
            Log.v(str, a(objArr));
        }
    }

    public static void b(String str) {
        if (f19253a) {
            e("Logger", str);
        }
    }

    public static void e(String str, String str2) {
        a aVar = f19255c;
        if (aVar != null) {
            aVar.e(str, str2);
        }
        if (f19253a && str2 != null && f19254b <= 6) {
            Log.e(str, str2);
        }
    }

    public static void c(String str, String str2, Throwable th) {
        a aVar = f19255c;
        if (aVar != null) {
            aVar.b(str, str2, th);
        }
        if (f19253a) {
            if (!(str2 == null && th == null) && f19254b <= 6) {
                Log.e(str, str2, th);
            }
        }
    }

    private static String a(Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : objArr) {
            if (obj != null) {
                sb.append(obj.toString());
            } else {
                sb.append(" null ");
            }
            sb.append(" ");
        }
        return sb.toString();
    }
}
