package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import com.appodeal.ads.modules.common.internal.Constants;
import com.bytedance.sdk.openadsdk.multipro.b;
import com.bytedance.sdk.openadsdk.utils.m;
import java.util.Locale;

/* compiled from: IdUtils */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private static String f1260a;

    /* renamed from: b  reason: collision with root package name */
    private static String f1261b;

    /* renamed from: c  reason: collision with root package name */
    private static String f1262c;

    /* renamed from: d  reason: collision with root package name */
    private static String f1263d;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f1264e;

    private static Context d(Context context) {
        return context == null ? m.a() : context;
    }

    public static String a(Context context) {
        if (TextUtils.isEmpty(f1260a) && !f1264e) {
            synchronized (j.class) {
                if (!f1264e) {
                    e(context);
                }
            }
        }
        try {
            if (TextUtils.isEmpty(f1260a) && b.c()) {
                f1260a = c.a(d(context)).b("did", (String) null);
            }
        } catch (Exception unused) {
        }
        return f1260a;
    }

    public static String b(Context context) {
        if (f1262c == null && !f1264e) {
            synchronized (j.class) {
                if (!f1264e) {
                    e(context);
                }
            }
        }
        return f1262c;
    }

    public static String c(Context context) {
        if (TextUtils.isEmpty(f1263d) && !f1264e) {
            synchronized (j.class) {
                if (!f1264e) {
                    e(context);
                }
            }
        }
        return f1263d;
    }

    public static void a(Context context, String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(f1260a)) {
            c.a(context).a("did", str);
            f1260a = str;
        }
        if (!TextUtils.isEmpty(f1260a)) {
            s.a(f1260a);
        }
    }

    private static void e(Context context) {
        Context d2;
        if (!f1264e && (d2 = d(context)) != null) {
            f1260a = c.a(d2).b("did", (String) null);
            f1261b = b();
            f1262c = String.valueOf(Build.TIME);
            f1263d = c.a(d2).b(Constants.UUID, (String) null);
            f1264e = true;
        }
    }

    private static String b() {
        StringBuilder sb = new StringBuilder();
        try {
            if (m.e()) {
                sb.append("MIUI-");
            } else if (m.b()) {
                sb.append("FLYME-");
            } else {
                String n = m.n();
                if (m.a(n)) {
                    sb.append("EMUI-");
                }
                if (!TextUtils.isEmpty(n)) {
                    sb.append(n);
                    sb.append("-");
                }
            }
            sb.append(Build.VERSION.INCREMENTAL);
        } catch (Exception unused) {
        }
        return sb.toString();
    }

    public static String a() {
        Locale locale;
        String str;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                locale = LocaleList.getDefault().get(0);
            } else {
                locale = Locale.getDefault();
            }
            if (locale != null) {
                str = locale.getLanguage();
            } else {
                str = "";
            }
            if (locale == null || !"zh".equals(str)) {
                return str;
            }
            String locale2 = locale.toString();
            if (locale.toString().length() >= 5) {
                locale2 = locale2.substring(0, 5);
            }
            if (Locale.SIMPLIFIED_CHINESE.toString().equals(locale2)) {
                return "zh";
            }
            return "zh-Hant";
        } catch (Throwable unused) {
            return "";
        }
    }
}
