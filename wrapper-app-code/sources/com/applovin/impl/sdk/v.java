package com.applovin.impl.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.c.b;
import com.applovin.impl.sdk.utils.AppKilledService;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.l;
import java.util.Map;

public class v {

    /* renamed from: a  reason: collision with root package name */
    private static n f15960a;

    /* renamed from: b  reason: collision with root package name */
    private final n f15961b;

    v(final n nVar) {
        this.f15961b = nVar;
        if (!nVar.e()) {
            f15960a = nVar;
            a("SDK Session Begin");
            nVar.am().registerReceiver(new AppLovinBroadcastManager.Receiver() {
                public void onReceive(Context context, Intent intent, Map<String, Object> map) {
                    v.this.a("SDK Session End");
                    nVar.am().unregisterReceiver(this);
                }
            }, new IntentFilter(AppKilledService.ACTION_APP_KILLED));
        }
    }

    /* access modifiers changed from: private */
    public void a(String str) {
        l lVar = new l();
        lVar.a().a(str).a();
        f("AppLovinSdk", lVar.toString());
    }

    private void a(String str, String str2, boolean z) {
        int intValue;
        if (StringUtils.isValidString(str2) && (intValue = ((Integer) this.f15961b.a(b.ao)).intValue()) > 0) {
            int length = str2.length();
            int i = ((length + intValue) - 1) / intValue;
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2 * intValue;
                String substring = str2.substring(i3, Math.min(length, i3 + intValue));
                if (z) {
                    Log.d(str, substring);
                } else {
                    b(str, substring);
                }
            }
        }
    }

    public static boolean a() {
        n nVar = f15960a;
        return nVar == null || a(nVar);
    }

    public static boolean a(n nVar) {
        return nVar != null && nVar.O().d();
    }

    public static void c(String str, String str2, Throwable th) {
        Log.e("AppLovinSdk", "[" + str + "] " + str2, th);
    }

    public static void f(String str, String str2) {
        Log.d("AppLovinSdk", "[" + str + "] " + str2);
    }

    public static void g(String str, String str2) {
        Log.i("AppLovinSdk", "[" + str + "] " + str2);
    }

    public static void h(String str, String str2) {
        Log.w("AppLovinSdk", "[" + str + "] " + str2);
    }

    public static void i(String str, String str2) {
        c(str, str2, (Throwable) null);
    }

    public static void j(String str, String str2) {
        f(str, str2);
    }

    public void a(String str, String str2) {
        if (a(this.f15961b)) {
            a(str, str2, false);
        }
    }

    public void a(String str, String str2, Throwable th) {
        Log.w("AppLovinSdk", "[" + str + "] " + str2, th);
    }

    public void b(String str, String str2) {
        Log.d("AppLovinSdk", "[" + str + "] " + str2);
    }

    public void b(String str, String str2, Throwable th) {
        Log.e("AppLovinSdk", "[" + str + "] " + str2, th);
    }

    public void c(String str, String str2) {
        Log.i("AppLovinSdk", "[" + str + "] " + str2);
    }

    public void d(String str, String str2) {
        a(str, str2, (Throwable) null);
    }

    public void e(String str, String str2) {
        b(str, str2, (Throwable) null);
    }
}
