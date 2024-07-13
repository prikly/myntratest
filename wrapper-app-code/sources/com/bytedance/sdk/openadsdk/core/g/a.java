package com.bytedance.sdk.openadsdk.core.g;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import com.bytedance.sdk.component.utils.l;

/* compiled from: MIUIPermissionUtils */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f1189a = a.class.getSimpleName();

    public static boolean a(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 19) {
            return b(context, str);
        }
        return c(context, str);
    }

    private static boolean b(Context context, String str) {
        String str2 = f1189a;
        l.e(str2, "checkPermissinKITKATNew，permission：" + str);
        try {
            str.hashCode();
            String lowerCase = str.replaceFirst("android.permission.", "android:").toLowerCase();
            int checkOp = ((AppOpsManager) context.getSystemService("appops")).checkOp(lowerCase, Binder.getCallingUid(), context.getPackageName());
            String str3 = f1189a;
            l.e(str3, "checkPermissinKITKATNew，locationOp,permission：" + checkOp + "," + lowerCase);
            if (checkOp == 0) {
                return true;
            }
            String str4 = f1189a;
            l.e(str4, "checkPermissinKITKATNew，false,permission：" + lowerCase);
            return false;
        } catch (Exception e2) {
            String str5 = f1189a;
            l.e(str5, "If there is an error in the permission check, it returns true by default, and the exception code is: " + e2);
            return true;
        }
    }

    private static boolean c(Context context, String str) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }
}
