package com.apm.insight.b;

import android.app.ActivityManager;
import android.content.Context;
import android.os.FileObserver;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.apm.insight.b;
import com.apm.insight.e;
import com.apm.insight.l.a;
import com.apm.insight.l.r;
import com.apm.insight.l.v;
import org.json.JSONObject;

public class d {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static String f10460a = null;

    /* renamed from: b  reason: collision with root package name */
    private static long f10461b = -1;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f10462c = false;

    /* renamed from: d  reason: collision with root package name */
    private static FileObserver f10463d;

    /* renamed from: e  reason: collision with root package name */
    private static ActivityManager.ProcessErrorStateInfo f10464e;

    static String a(Context context, int i) {
        if (r.a(256)) {
            f10462c = false;
            return "TEST_ANR_INFO";
        } else if (SystemClock.uptimeMillis() - f10461b < 5000) {
            return null;
        } else {
            try {
                ActivityManager.ProcessErrorStateInfo a2 = a.a(context, i);
                if (a2 != null && Process.myPid() == a2.pid) {
                    if (f10464e != null && a.a(f10464e, a2)) {
                        return null;
                    }
                    f10464e = a2;
                    f10460a = null;
                    f10461b = SystemClock.uptimeMillis();
                    f10462c = false;
                    return a.a(a2);
                }
            } catch (Throwable unused) {
            }
            String str = f10460a;
            if (str == null) {
                return null;
            }
            f10462c = true;
            f10460a = null;
            f10461b = SystemClock.uptimeMillis();
            return str;
        }
    }

    public static JSONObject a(boolean z) {
        try {
            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("thread_number", 1);
            jSONObject.put("mainStackFromTrace", v.a(stackTrace));
            return jSONObject;
        } catch (Throwable th) {
            b.a().a("NPTH_CATCH", th);
            return null;
        }
    }

    public static void a(final String str, final e eVar) {
        FileObserver fileObserver = f10463d;
        if (fileObserver != null) {
            fileObserver.stopWatching();
        }
        AnonymousClass1 r0 = new FileObserver(136, str) {
            public void onEvent(int i, String str) {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        String unused = d.f10460a = eVar.a(str, str);
                    } catch (Throwable th) {
                        b.a().a("NPTH_CATCH", th);
                    }
                }
            }
        };
        f10463d = r0;
        r0.startWatching();
    }

    public static boolean a() {
        return f10462c;
    }

    public static void b() {
        f10464e = null;
    }
}
