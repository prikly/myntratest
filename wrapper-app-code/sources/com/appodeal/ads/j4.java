package com.appodeal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.webkit.WebSettings;
import com.appnext.base.b.i;
import com.appodeal.ads.UserSettings;
import com.appodeal.ads.modules.common.internal.data.ConnectionData;
import com.appodeal.ads.utils.Log;
import java.util.HashMap;

public class j4 implements RestrictedData {

    /* renamed from: a  reason: collision with root package name */
    public static final j4 f16495a = new j4();

    /* renamed from: b  reason: collision with root package name */
    public static String f16496b;

    public final boolean canSendLocation() {
        return !i0.a() && !isParameterBlocked(i.fC) && !isParameterBlocked("lon");
    }

    public final boolean canSendLocationType() {
        return !i0.a() && !isParameterBlocked("lt");
    }

    public final boolean canSendUserSettings() {
        return !i0.a() && !isParameterBlocked("user_settings");
    }

    @Deprecated
    public final Integer getAge() {
        if (canSendUserSettings()) {
            return l5.a().f16591c;
        }
        return null;
    }

    public final String getCity() {
        if (canSendUserSettings()) {
            return l5.a().j;
        }
        return null;
    }

    public final ConnectionData getConnectionData(Context context) {
        return f1.c(context);
    }

    public final String getCountry() {
        if (canSendUserSettings()) {
            return l5.a().f16594f;
        }
        return null;
    }

    @Deprecated
    public final UserSettings.Gender getGender() {
        if (canSendUserSettings()) {
            return l5.a().f16590b;
        }
        return null;
    }

    public final String getHttpAgent(Context context) {
        String str;
        StringBuilder sb;
        PackageManager packageManager;
        String str2 = null;
        if (!canSendUserSettings()) {
            return null;
        }
        String str3 = f16496b;
        if (str3 != null) {
            return str3;
        }
        if (context == null) {
            return null;
        }
        try {
            f16496b = WebSettings.getDefaultUserAgent(context);
        } catch (Throwable th) {
            Log.log(th);
        }
        if (f16496b == null) {
            try {
                sb = new StringBuilder("Mozilla/5.0");
                sb.append(" (Linux; Android ");
                HashMap hashMap = f1.f16398a;
                sb.append(Build.VERSION.RELEASE);
                sb.append("; ");
                sb.append(Build.MODEL);
                sb.append(" Build/");
                sb.append(Build.ID);
                sb.append("; wv)");
                sb.append(" AppleWebKit/537.36 (KHTML, like Gecko)");
                sb.append(" Version/4.0");
                packageManager = context.getPackageManager();
                PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.webview", 0);
                sb.append(" Chrome/");
                sb.append(packageInfo.versionName);
            } catch (Throwable unused) {
                str = null;
            }
            sb.append(" Mobile");
            try {
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                PackageInfo packageInfo2 = packageManager.getPackageInfo(context.getPackageName(), 0);
                sb.append(" ");
                int i = applicationInfo.labelRes;
                sb.append(i == 0 ? applicationInfo.nonLocalizedLabel.toString() : context.getString(i));
                sb.append("/");
                sb.append(packageInfo2.versionName);
            } catch (Throwable th2) {
                Log.log(th2);
            }
            str = sb.toString();
            f16496b = str;
        }
        if (f16496b == null) {
            try {
                str2 = System.getProperty("http.agent", "");
            } catch (Throwable th3) {
                Log.log(th3);
            }
            f16496b = str2;
        }
        if (f16496b == null) {
            f16496b = "";
        }
        return f16496b;
    }

    public final String getIabConsentString() {
        x2.f17639a.getClass();
        return x2.e().f();
    }

    public final String getIfa() {
        return x2.a();
    }

    public final String getIp() {
        if (canSendUserSettings()) {
            return l5.a().f16592d;
        }
        return null;
    }

    public final LocationData getLocation(Context context) {
        return new z1(context, this);
    }

    public final String getUSPrivacyString() {
        x2.f17639a.getClass();
        return x2.e().getUSPrivacyString();
    }

    public final String getUserId() {
        return l5.a().f16589a;
    }

    public final String getZip() {
        if (canSendUserSettings()) {
            return l5.a().k;
        }
        return null;
    }

    public final boolean isLimitAdTrackingEnabled() {
        return x2.i();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003e A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isParameterBlocked(java.lang.String r4) {
        /*
            r3 = this;
            com.appodeal.ads.x2 r0 = com.appodeal.ads.x2.f17639a
            r0.getClass()
            com.appodeal.ads.regulator.h r0 = com.appodeal.ads.x2.e()
            boolean r0 = r0.a()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0019
            boolean r0 = com.appodeal.ads.x2.g()
            if (r0 != 0) goto L_0x0019
            r0 = 1
            goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            if (r0 != 0) goto L_0x0034
            com.appodeal.ads.regulator.h r0 = com.appodeal.ads.x2.e()
            boolean r0 = r0.g()
            if (r0 == 0) goto L_0x002e
            boolean r0 = com.appodeal.ads.x2.g()
            if (r0 != 0) goto L_0x002e
            r0 = 1
            goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            if (r0 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r0 = 0
            goto L_0x0035
        L_0x0034:
            r0 = 1
        L_0x0035:
            if (r0 == 0) goto L_0x003e
            boolean r4 = com.appodeal.ads.x2.a((java.lang.String) r4)
            if (r4 == 0) goto L_0x003e
            goto L_0x003f
        L_0x003e:
            r1 = 0
        L_0x003f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.j4.isParameterBlocked(java.lang.String):boolean");
    }

    public final boolean isUserAgeRestricted() {
        return i0.a();
    }

    public final boolean isUserCcpaProtected() {
        x2.f17639a.getClass();
        return x2.e().g() && !x2.g();
    }

    public final boolean isUserGdprProtected() {
        x2.f17639a.getClass();
        return x2.e().a() && !x2.g();
    }

    public boolean isUserHasConsent() {
        return x2.g();
    }

    public final boolean isUserInCcpaScope() {
        x2.f17639a.getClass();
        return x2.e().g();
    }

    public final boolean isUserInGdprScope() {
        x2.f17639a.getClass();
        return x2.e().a();
    }

    public final boolean isUserProtected() {
        x2.f17639a.getClass();
        if (x2.e().a() && !x2.g()) {
            return true;
        }
        if (x2.e().g() && !x2.g()) {
            return true;
        }
        return false;
    }
}
