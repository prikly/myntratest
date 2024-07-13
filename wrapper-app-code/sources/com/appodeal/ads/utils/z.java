package com.appodeal.ads.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    public static final a f17602a = new a();

    public class a extends HashMap<String, String> {
        public a() {
            super(3);
            put("android.permission.SYSTEM_ALERT_WINDOW", "SAW");
            put("android.permission.GET_TASKS", "GT");
            put("android.permission.RECEIVE_BOOT_COMPLETED", "RBC");
        }
    }

    public static JSONArray a(Context context) {
        boolean z;
        PackageInfo packageInfo;
        ServiceInfo[] serviceInfoArr;
        PackageInfo packageInfo2;
        String[] strArr;
        JSONArray jSONArray = new JSONArray();
        try {
            String packageName = context.getPackageName();
            PackageManager packageManager = context.getPackageManager();
            if (!(c.f17489d != null || (packageInfo2 = packageManager.getPackageInfo(packageName, 4096)) == null || (strArr = packageInfo2.requestedPermissions) == null)) {
                c.f17489d = Arrays.asList(strArr);
            }
            List<String> list = c.f17489d;
            ArrayList arrayList = new ArrayList();
            if (list != null && !list.isEmpty()) {
                for (String next : list) {
                    a aVar = f17602a;
                    if (aVar.containsKey(next)) {
                        arrayList.add((String) aVar.get(next));
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                jSONArray.put((String) it.next());
            }
            if (!(c.f17490e != null || (packageInfo = packageManager.getPackageInfo(packageName, 4)) == null || (serviceInfoArr = packageInfo.services) == null)) {
                c.f17490e = Arrays.asList(serviceInfoArr);
            }
            List<ServiceInfo> list2 = c.f17490e;
            if (list2 != null && !list2.isEmpty()) {
                Iterator<ServiceInfo> it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!"com.yandex.metrica.MetricaService".equals(it2.next().name)) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                jSONArray.put("S");
            }
        } catch (Exception e2) {
            Log.log(e2);
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        return jSONArray;
    }
}
