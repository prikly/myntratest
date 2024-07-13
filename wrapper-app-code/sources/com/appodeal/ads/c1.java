package com.appodeal.ads;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.appodeal.ads.d1;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.utils.h;
import com.appodeal.ads.utils.k;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public final class c1 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ boolean f16321a = (!c1.class.desiredAssertionStatus());

    public interface a {
    }

    public static String a() {
        String a2 = a("debug.appodeal.sdk.url", (String) null);
        if (!TextUtils.isEmpty(a2)) {
            return a2;
        }
        return String.format("https://%s:443", new Object[]{"a.appbaqend.com"});
    }

    public static String a(String str, String str2) {
        String str3;
        try {
            String property = System.getProperty(str);
            if (!TextUtils.isEmpty(property) && !".none.".equalsIgnoreCase(property)) {
                return property;
            }
        } catch (Throwable th) {
            Log.log("Debug", "System.getProperty() threw an exception");
            Log.log(th);
        }
        try {
            String str4 = (String) Class.forName("android.os.SystemProperties").getMethod(Constants.GET, new Class[]{String.class, String.class}).invoke((Object) null, new Object[]{str, str2});
            return (TextUtils.isEmpty(str4) || ".none.".equalsIgnoreCase(str4)) ? str2 : str4;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            th = e2;
            str3 = "Could not find SystemProperties class";
            Log.log("Debug", str3);
            Log.log(th);
            return str2;
        } catch (IllegalAccessException e3) {
            th = e3;
            str3 = "Could not access SystemProperties.get()";
            Log.log("Debug", str3);
            Log.log(th);
            return str2;
        } catch (InvocationTargetException e4) {
            th = e4;
            str3 = "SystemProperties.get() threw an exception";
            Log.log("Debug", str3);
            Log.log(th);
            return str2;
        } catch (Throwable th2) {
            th = th2;
            Log.log(th);
            return str2;
        }
    }

    public static ArrayList a(List list, boolean z) {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                JSONObject jSONObject = (JSONObject) it.next();
                String str3 = "-1";
                try {
                    String a2 = n5.a(jSONObject.getString("status"));
                    if (jSONObject.has("package_name")) {
                        String[] split = jSONObject.getString("package_name").split(":");
                        String str4 = split.length >= 1 ? split[0] : a2;
                        if (split.length >= 2) {
                            str3 = split[1];
                        }
                        str = str3;
                        str2 = str4;
                    } else {
                        str = str3;
                        str2 = a2;
                    }
                    arrayList.add(new k(arrayList.size(), list.indexOf(jSONObject), str2, a2, str, jSONObject.getString("ecpm"), z));
                } catch (Exception e2) {
                    Log.log(e2);
                }
            }
        }
        return arrayList;
    }

    public static void a(Activity activity, r rVar, d1.a.C0182a aVar) {
        h hVar = new h(activity, new y0(rVar));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(Color.parseColor("#404040"));
        linearLayout.setTag("appodeal");
        linearLayout.setClickable(true);
        EditText editText = new EditText(activity);
        editText.setLayoutParams(new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 56.0f, activity.getResources().getDisplayMetrics())));
        editText.setTextSize(20.0f);
        editText.setTextColor(-1);
        editText.setHint("What adunit you search for?");
        editText.setHintTextColor(Color.parseColor("#80ffffff"));
        editText.addTextChangedListener(new z0(hVar));
        ListView listView = new ListView(activity);
        listView.setAdapter(hVar);
        listView.setOnItemClickListener(new a1(linearLayout, aVar));
        listView.setOnItemLongClickListener(new b1());
        listView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
        listView.setCacheColorHint(Color.parseColor("#404040"));
        listView.setDivider(new ColorDrawable(Color.parseColor("#b3b3b3")));
        listView.setDividerHeight(1);
        linearLayout.addView(editText);
        linearLayout.addView(listView);
        activity.addContentView(linearLayout, new ViewGroup.LayoutParams(-1, -1));
    }

    public static boolean b() {
        try {
            return Boolean.parseBoolean(a("debug.appodeal.sdk.testactivity", "false"));
        } catch (Exception e2) {
            Log.log("Debug", "Start Test Activity property is not valid");
            Log.log(e2);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e A[Catch:{ all -> 0x00c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r7) {
        /*
            java.lang.String r0 = "Log Enable property is not valid"
            java.lang.String r1 = "debug.appodeal.sdk.log"
            boolean r2 = com.appodeal.ads.r0.f17086b
            java.lang.String r3 = "false"
            r4 = 0
            java.lang.String r5 = "Debug"
            if (r2 != 0) goto L_0x0027
            java.lang.String r2 = "debug.appodeal.sdk.testmode"
            java.lang.String r2 = a((java.lang.String) r2, (java.lang.String) r3)     // Catch:{ Exception -> 0x0018 }
            boolean r2 = java.lang.Boolean.parseBoolean(r2)     // Catch:{ Exception -> 0x0018 }
            goto L_0x0022
        L_0x0018:
            r2 = move-exception
            java.lang.String r6 = "Test Mode property is not valid"
            com.appodeal.ads.utils.Log.log(r5, r6)
            com.appodeal.ads.utils.Log.log(r2)
            r2 = 0
        L_0x0022:
            if (r2 == 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r2 = 0
            goto L_0x0028
        L_0x0027:
            r2 = 1
        L_0x0028:
            com.appodeal.ads.Appodeal.setTesting(r2)
            java.lang.String r2 = a((java.lang.String) r1, (java.lang.String) r3)     // Catch:{ Exception -> 0x0034 }
            boolean r2 = java.lang.Boolean.parseBoolean(r2)     // Catch:{ Exception -> 0x0034 }
            goto L_0x003c
        L_0x0034:
            r2 = move-exception
            com.appodeal.ads.utils.Log.log(r5, r0)
            com.appodeal.ads.utils.Log.log(r2)
            r2 = 0
        L_0x003c:
            com.appodeal.ads.modules.common.internal.log.InternalLogKt.setLogEnable(r2)
            java.lang.String r1 = a((java.lang.String) r1, (java.lang.String) r3)     // Catch:{ Exception -> 0x0048 }
            boolean r4 = java.lang.Boolean.parseBoolean(r1)     // Catch:{ Exception -> 0x0048 }
            goto L_0x004f
        L_0x0048:
            r1 = move-exception
            com.appodeal.ads.utils.Log.log(r5, r0)
            com.appodeal.ads.utils.Log.log(r1)
        L_0x004f:
            if (r4 == 0) goto L_0x0054
            com.appodeal.ads.utils.Log$LogLevel r0 = com.appodeal.ads.utils.Log.LogLevel.none
            goto L_0x0070
        L_0x0054:
            java.lang.String r0 = "debug.appodeal.sdk.loglevel"
            com.appodeal.ads.utils.Log$LogLevel r1 = com.appodeal.ads.utils.Log.LogLevel.none     // Catch:{ Exception -> 0x0065 }
            java.lang.String r1 = r1.name()     // Catch:{ Exception -> 0x0065 }
            java.lang.String r0 = a((java.lang.String) r0, (java.lang.String) r1)     // Catch:{ Exception -> 0x0065 }
            com.appodeal.ads.utils.Log$LogLevel r0 = com.appodeal.ads.utils.Log.LogLevel.valueOf(r0)     // Catch:{ Exception -> 0x0065 }
            goto L_0x0070
        L_0x0065:
            r0 = move-exception
            java.lang.String r1 = "Log Level property is not valid"
            com.appodeal.ads.utils.Log.log(r5, r1)
            com.appodeal.ads.utils.Log.log(r0)
            com.appodeal.ads.utils.Log$LogLevel r0 = com.appodeal.ads.utils.Log.LogLevel.none
        L_0x0070:
            com.appodeal.ads.utils.Log$LogLevel r1 = com.appodeal.ads.r0.f17088d
            int r1 = r1.getValue()
            int r2 = r0.getValue()
            if (r1 <= r2) goto L_0x007e
            com.appodeal.ads.utils.Log$LogLevel r0 = com.appodeal.ads.r0.f17088d
        L_0x007e:
            com.appodeal.ads.Appodeal.setLogLevel(r0)
            java.lang.String r0 = "debug.appodeal.sdk.networks"
            r1 = 0
            java.lang.String r0 = a((java.lang.String) r0, (java.lang.String) r1)     // Catch:{ all -> 0x00c7 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x00c7 }
            if (r1 != 0) goto L_0x00cb
            boolean r1 = f16321a     // Catch:{ all -> 0x00c7 }
            if (r1 != 0) goto L_0x009b
            if (r0 == 0) goto L_0x0095
            goto L_0x009b
        L_0x0095:
            java.lang.AssertionError r7 = new java.lang.AssertionError     // Catch:{ all -> 0x00c7 }
            r7.<init>()     // Catch:{ all -> 0x00c7 }
            throw r7     // Catch:{ all -> 0x00c7 }
        L_0x009b:
            java.lang.String r1 = ","
            java.lang.String[] r0 = r0.split(r1)     // Catch:{ all -> 0x00c7 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ all -> 0x00c7 }
            java.util.ArrayList r1 = com.appodeal.ads.i.c(r7)     // Catch:{ all -> 0x00c7 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00c7 }
        L_0x00ad:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00c7 }
            if (r2 == 0) goto L_0x00cb
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00c7 }
            com.appodeal.ads.i$c r2 = (com.appodeal.ads.i.c) r2     // Catch:{ all -> 0x00c7 }
            java.lang.String r3 = r2.f16468a     // Catch:{ all -> 0x00c7 }
            boolean r3 = r0.contains(r3)     // Catch:{ all -> 0x00c7 }
            if (r3 != 0) goto L_0x00ad
            java.lang.String r2 = r2.f16468a     // Catch:{ all -> 0x00c7 }
            com.appodeal.ads.Appodeal.disableNetwork((android.content.Context) r7, (java.lang.String) r2)     // Catch:{ all -> 0x00c7 }
            goto L_0x00ad
        L_0x00c7:
            r7 = move-exception
            com.appodeal.ads.utils.Log.log(r7)
        L_0x00cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.c1.a(android.content.Context):void");
    }
}
