package com.applovin.impl.sdk;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.e.a;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.onesignal.outcomes.OSOutcomeConstants;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class e implements AppLovinCommunicatorSubscriber {

    /* renamed from: a  reason: collision with root package name */
    private final n f15408a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f15409b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final LinkedHashMap<String, Bundle> f15410c = new LinkedHashMap<String, Bundle>() {
        /* access modifiers changed from: protected */
        public boolean removeEldestEntry(Map.Entry entry) {
            return size() > 16;
        }
    };

    /* renamed from: d  reason: collision with root package name */
    private final Set<a> f15411d = Collections.synchronizedSet(new HashSet());

    public interface a {
        void onCreativeIdGenerated(String str, String str2);
    }

    public e(n nVar) {
        this.f15408a = nVar;
        if (StringUtils.isValidString(a())) {
            AppLovinCommunicator.getInstance(nVar.P()).subscribe((AppLovinCommunicatorSubscriber) this, "safedk_ad_info");
        }
    }

    public static String a() {
        return c(MobileAdsBridge.versionMethodName);
    }

    public static String b() {
        return c("getSdkKey");
    }

    private static String c(String str) {
        Class<?> cls;
        try {
            cls = Class.forName("com.applovin.quality.AppLovinQualityService");
        } catch (Throwable unused) {
            return "";
        }
        return (String) cls.getMethod(str, new Class[0]).invoke((Object) null, new Object[0]);
    }

    public Bundle a(String str) {
        Bundle bundle;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f15409b) {
            bundle = this.f15410c.get(str);
        }
        return bundle;
    }

    public void a(a aVar) {
        this.f15411d.add(aVar);
    }

    public void b(a aVar) {
        this.f15411d.remove(aVar);
    }

    public void b(String str) {
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f15409b) {
                this.f15410c.remove(str);
            }
        }
    }

    public String getCommunicatorId() {
        return e.class.getSimpleName();
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("safedk_ad_info".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle bundle = appLovinCommunicatorMessage.getMessageData().getBundle("public");
            if (bundle == null) {
                this.f15408a.D();
                if (v.a()) {
                    this.f15408a.D().d("AppLovinSdk", "Received SafeDK ad info without public data");
                    return;
                }
                return;
            }
            Bundle bundle2 = appLovinCommunicatorMessage.getMessageData().getBundle("private");
            if (bundle2 == null) {
                this.f15408a.D();
                if (v.a()) {
                    this.f15408a.D().d("AppLovinSdk", "Received SafeDK ad info without private data");
                }
            } else if (MaxAdFormat.formatFromString(bundle2.getString("ad_format")) == null) {
                this.f15408a.D();
                if (v.a()) {
                    this.f15408a.D().d("AppLovinSdk", "Received SafeDK ad info without ad format");
                }
            } else {
                final String string = bundle2.getString(OSOutcomeConstants.OUTCOME_ID);
                if (TextUtils.isEmpty(string)) {
                    this.f15408a.D();
                    if (v.a()) {
                        this.f15408a.D().d("AppLovinSdk", "Received SafeDK ad info without serve id");
                        return;
                    }
                    return;
                }
                synchronized (this.f15409b) {
                    this.f15408a.D();
                    if (v.a()) {
                        v D = this.f15408a.D();
                        D.b("AppLovinSdk", "Storing current SafeDK ad info for serve id: " + string);
                    }
                    this.f15410c.put(string, bundle);
                }
                final String string2 = bundle.getString("ad_review_creative_id");
                if (StringUtils.isValidString(string2) && !this.f15411d.isEmpty()) {
                    Iterator it = new HashSet(this.f15411d).iterator();
                    while (it.hasNext()) {
                        final a aVar = (a) it.next();
                        this.f15408a.V().a((a) new z(this.f15408a, new Runnable() {
                            public void run() {
                                aVar.onCreativeIdGenerated(string, string2);
                            }
                        }), o.a.BACKGROUND);
                    }
                }
            }
        }
    }
}
