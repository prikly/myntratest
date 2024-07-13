package com.appodeal.ads.utils;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.n5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static HashSet f17486a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public static final a f17487b = new a();

    /* renamed from: c  reason: collision with root package name */
    public static final b f17488c = new b();

    /* renamed from: d  reason: collision with root package name */
    public static List<String> f17489d;

    /* renamed from: e  reason: collision with root package name */
    public static List<ServiceInfo> f17490e;

    public class a extends ArrayList<String> {
        public a() {
            add("android.permission.ACCESS_NETWORK_STATE");
            add("android.permission.INTERNET");
        }
    }

    public class b extends ArrayList<C0207c> {

        public class a implements C0207c {
            public final void a() {
            }

            public final boolean a(Context context, Bundle bundle) {
                try {
                    context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                    return bundle.containsKey("com.google.android.gms.version");
                } catch (Throwable unused) {
                    return true;
                }
            }
        }

        public b() {
            add(new a());
        }
    }

    /* renamed from: com.appodeal.ads.utils.c$c  reason: collision with other inner class name */
    public interface C0207c {
        void a();

        boolean a(Context context, Bundle bundle);
    }

    public static void a(Context context) {
        if (!n5.b(context)) {
            Log.log(LogConstants.KEY_SDK, LogConstants.EVENT_INTEGRATION, "Please add in manifest file: \n<uses-library android:name=\"org.apache.http.legacy\" android:required=\"false\" />");
        }
    }

    public static boolean a(Activity activity) {
        return activity != null && f17486a.contains(activity.getLocalClassName());
    }

    public static void b(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            String str = "Missing meta-data:";
            Iterator it = f17488c.iterator();
            boolean z = false;
            while (it.hasNext()) {
                C0207c cVar = (C0207c) it.next();
                if (!cVar.a(context, bundle)) {
                    Object[] objArr = new Object[2];
                    objArr[0] = str;
                    cVar.a();
                    objArr[1] = "com.google.android.gms.version";
                    str = String.format("%s\n%s", objArr);
                    z = true;
                }
            }
            if (z) {
                Log.log(LogConstants.KEY_SDK, LogConstants.EVENT_INTEGRATION, str);
            }
        } catch (Exception e2) {
            Log.log(e2);
        }
    }

    public static void c(Context context) {
        PackageInfo packageInfo;
        String[] strArr;
        try {
            ArrayList arrayList = new ArrayList(f17487b);
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            if (!(f17489d != null || (packageInfo = packageManager.getPackageInfo(packageName, 4096)) == null || (strArr = packageInfo.requestedPermissions) == null)) {
                f17489d = Arrays.asList(strArr);
            }
            List<String> list = f17489d;
            if (list != null) {
                arrayList.removeAll(list);
            }
            if (!arrayList.isEmpty()) {
                String str = "Missing permissions:";
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    str = String.format("%s\n%s", new Object[]{str, (String) it.next()});
                }
                Log.log(LogConstants.KEY_SDK, LogConstants.EVENT_INTEGRATION, str);
            }
        } catch (Exception e2) {
            Log.log(e2);
        }
    }
}
