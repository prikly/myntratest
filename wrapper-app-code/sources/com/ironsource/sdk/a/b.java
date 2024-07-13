package com.ironsource.sdk.a;

import android.content.Context;
import com.adcolony.adcolonysdk.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.ironsource.a.c;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.Map;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, Object> f8991a = new HashMap();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f8992a;

        /* renamed from: b  reason: collision with root package name */
        public String f8993b;

        /* renamed from: c  reason: collision with root package name */
        public Context f8994c;

        /* renamed from: d  reason: collision with root package name */
        public String f8995d;
    }

    private b(a aVar) {
        Context context = aVar.f8994c;
        com.ironsource.sdk.utils.a a2 = com.ironsource.sdk.utils.a.a(context);
        f8991a.put("deviceos", SDKUtils.encodeString(a2.f9622c));
        f8991a.put("deviceosversion", SDKUtils.encodeString(a2.f9623d));
        f8991a.put("deviceapilevel", Integer.valueOf(a2.f9624e));
        f8991a.put("deviceoem", SDKUtils.encodeString(a2.f9620a));
        f8991a.put("devicemodel", SDKUtils.encodeString(a2.f9621b));
        f8991a.put("bundleid", SDKUtils.encodeString(context.getPackageName()));
        f8991a.put("applicationkey", SDKUtils.encodeString(aVar.f8993b));
        f8991a.put("sessionid", SDKUtils.encodeString(aVar.f8992a));
        f8991a.put("sdkversion", SDKUtils.encodeString(SDKUtils.getSDKVersion()));
        f8991a.put("applicationuserid", SDKUtils.encodeString(aVar.f8995d));
        f8991a.put("env", BuildConfig.FLAVOR);
        f8991a.put(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_TEXT);
        f8991a.put("connectiontype", com.ironsource.d.a.a(aVar.f8994c));
    }

    public /* synthetic */ b(a aVar, byte b2) {
        this(aVar);
    }

    public static void a(String str) {
        f8991a.put("connectiontype", SDKUtils.encodeString(str));
    }

    public final Map<String, Object> a() {
        return f8991a;
    }
}
