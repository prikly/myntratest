package com.applovin.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class AppLovinSdkSettings {

    /* renamed from: a  reason: collision with root package name */
    private boolean f16084a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f16085b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f16086c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f16087d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f16088e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f16089f = true;

    /* renamed from: g  reason: collision with root package name */
    private String f16090g;

    /* renamed from: h  reason: collision with root package name */
    private List<String> f16091h = Collections.emptyList();
    private List<String> i = Collections.emptyList();
    private final Map<String, String> j = CollectionUtils.map();
    private final Object k = new Object();
    private n l;
    private final Map<String, Object> localSettings = CollectionUtils.map();
    private final Map<String, String> metaData = CollectionUtils.map();

    public AppLovinSdkSettings(Context context) {
        this.f16084a = Utils.isVerboseLoggingEnabled(context);
        this.f16086c = true;
        this.f16087d = true;
        this.f16088e = true;
    }

    /* access modifiers changed from: protected */
    public void attachAppLovinSdk(n nVar) {
        this.l = nVar;
        if (StringUtils.isValidString(this.f16090g)) {
            nVar.N().a(true);
            nVar.N().a(this.f16090g);
            this.f16090g = null;
        }
    }

    public Map<String, String> getExtraParameters() {
        Map<String, String> map;
        synchronized (this.k) {
            map = CollectionUtils.map(this.j);
        }
        return map;
    }

    public List<String> getInitializationAdUnitIds() {
        return this.i;
    }

    public List<String> getTestDeviceAdvertisingIds() {
        return this.f16091h;
    }

    public boolean isCreativeDebuggerEnabled() {
        return this.f16086c;
    }

    public boolean isExceptionHandlerEnabled() {
        return this.f16087d;
    }

    public boolean isLocationCollectionEnabled() {
        return this.f16088e;
    }

    public boolean isMuted() {
        return this.f16085b;
    }

    public boolean isVerboseLoggingEnabled() {
        return this.f16084a;
    }

    public void setCreativeDebuggerEnabled(boolean z) {
        v.j("AppLovinSdkSettings", "setCreativeDebuggerEnabled(creativeDebuggerEnabled=" + z + ")");
        this.f16086c = z;
    }

    public void setExceptionHandlerEnabled(boolean z) {
        v.j("AppLovinSdkSettings", "setExceptionHandlerEnabled(exceptionHandlerEnabled=" + z + ")");
        this.f16087d = z;
    }

    public void setExtraParameter(String str, String str2) {
        v.j("AppLovinSdkSettings", "setExtraParameter(key=" + str + ", value=" + str2 + ")");
        if (TextUtils.isEmpty(str)) {
            v.i("AppLovinSdkSettings", "Failed to set extra parameter for null or empty key: " + str);
            return;
        }
        String trim = str2 != null ? str2.trim() : null;
        synchronized (this.k) {
            this.j.put(str, trim);
        }
        if (!"test_mode_network".equalsIgnoreCase(str)) {
            return;
        }
        if (this.l == null) {
            this.f16090g = trim;
        } else if (StringUtils.isValidString(trim)) {
            this.l.N().a(true);
            this.l.N().a(trim);
        } else {
            this.l.N().a(false);
            this.l.N().a((String) null);
        }
    }

    public void setInitializationAdUnitIds(List<String> list) {
        v.j("AppLovinSdkSettings", "setInitializationAdUnitIds(initializationAdUnitIds=" + list + ")");
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (String next : list) {
                if (StringUtils.isValidString(next) && next.length() > 0) {
                    if (next.length() == 16) {
                        arrayList.add(next);
                    } else {
                        v.i("AppLovinSdkSettings", "Unable to set initialization ad unit id (" + next + ") - please make sure it is in the format of XXXXXXXXXXXXXXXX");
                    }
                }
            }
            this.i = arrayList;
            return;
        }
        this.i = Collections.emptyList();
    }

    public void setLocationCollectionEnabled(boolean z) {
        v.j("AppLovinSdkSettings", "setLocationCollectionEnabled(locationCollectionEnabled=" + z + ")");
        this.f16088e = z;
    }

    public void setMuted(boolean z) {
        v.j("AppLovinSdkSettings", "setMuted(muted=" + z + ")");
        this.f16085b = z;
    }

    public void setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(boolean z) {
        v.j("AppLovinSdkSettings", "setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(shouldFailAdDisplayIfDontKeepActivitiesIsEnabled=" + z + ")");
        this.f16089f = z;
    }

    public void setTestDeviceAdvertisingIds(List<String> list) {
        v.j("AppLovinSdkSettings", "setTestDeviceAdvertisingIds(testDeviceAdvertisingIds=" + list + ")");
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (String next : list) {
                if (next == null || next.length() != 36) {
                    v.i("AppLovinSdkSettings", "Unable to set test device advertising id (" + next + ") - please make sure it is in the format of xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx");
                } else {
                    arrayList.add(next);
                }
            }
            this.f16091h = arrayList;
            return;
        }
        this.f16091h = Collections.emptyList();
    }

    public void setVerboseLogging(boolean z) {
        v.j("AppLovinSdkSettings", "setVerboseLogging(isVerboseLoggingEnabled=" + z + ")");
        if (Utils.isVerboseLoggingConfigured()) {
            v.i("AppLovinSdkSettings", "Ignoring setting of verbose logging - it is configured from Android manifest already.");
            if (Utils.isVerboseLoggingEnabled((Context) null) != z) {
                v.i("AppLovinSdkSettings", "Attempted to programmatically set verbose logging flag to value different from value configured in Android Manifest.");
                return;
            }
            return;
        }
        this.f16084a = z;
    }

    public boolean shouldFailAdDisplayIfDontKeepActivitiesIsEnabled() {
        return this.f16089f;
    }

    public String toString() {
        return "AppLovinSdkSettings{isVerboseLoggingEnabled=" + this.f16084a + ", muted=" + this.f16085b + ", testDeviceAdvertisingIds=" + this.f16091h.toString() + ", initializationAdUnitIds=" + this.i.toString() + ", creativeDebuggerEnabled=" + this.f16086c + ", exceptionHandlerEnabled=" + this.f16087d + ", locationCollectionEnabled=" + this.f16088e + '}';
    }
}
