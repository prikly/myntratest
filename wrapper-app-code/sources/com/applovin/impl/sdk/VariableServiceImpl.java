package com.applovin.impl.sdk;

import android.os.Bundle;
import android.text.TextUtils;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.sdk.c.d;
import com.applovin.impl.sdk.e.a;
import com.applovin.impl.sdk.e.m;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinVariableService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public class VariableServiceImpl implements AppLovinVariableService {

    /* renamed from: a  reason: collision with root package name */
    private final n f15169a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final AtomicBoolean f15170b = new AtomicBoolean();

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f15171c = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public AppLovinVariableService.OnVariablesUpdateListener f15172d;

    /* renamed from: e  reason: collision with root package name */
    private Bundle f15173e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f15174f = new Object();

    VariableServiceImpl(n nVar) {
        this.f15169a = nVar;
        String str = (String) nVar.a(d.j);
        if (StringUtils.isValidString(str)) {
            updateVariables(JsonUtils.deserialize(str));
        }
    }

    private Object a(String str, Object obj, Class<?> cls) {
        if (TextUtils.isEmpty(str)) {
            v.i("AppLovinVariableService", "Unable to retrieve variable value for empty name");
            return obj;
        }
        if (!this.f15169a.d()) {
            v.h("AppLovinSdk", "Attempted to retrieve variable before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        synchronized (this.f15174f) {
            if (this.f15173e == null) {
                v.i("AppLovinVariableService", "Unable to retrieve variable value for name \"" + str + "\". No variables returned by the server.");
                return obj;
            } else if (cls.equals(String.class)) {
                String string = this.f15173e.getString(str, (String) obj);
                return string;
            } else if (cls.equals(Boolean.class)) {
                Boolean valueOf = Boolean.valueOf(this.f15173e.getBoolean(str, ((Boolean) obj).booleanValue()));
                return valueOf;
            } else {
                throw new IllegalStateException("Unable to retrieve variable value for " + str);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f15174f
            monitor-enter(r0)
            com.applovin.sdk.AppLovinVariableService$OnVariablesUpdateListener r1 = r4.f15172d     // Catch:{ all -> 0x0021 }
            if (r1 == 0) goto L_0x001f
            android.os.Bundle r1 = r4.f15173e     // Catch:{ all -> 0x0021 }
            if (r1 != 0) goto L_0x000c
            goto L_0x001f
        L_0x000c:
            android.os.Bundle r1 = r4.f15173e     // Catch:{ all -> 0x0021 }
            java.lang.Object r1 = r1.clone()     // Catch:{ all -> 0x0021 }
            android.os.Bundle r1 = (android.os.Bundle) r1     // Catch:{ all -> 0x0021 }
            r2 = 1
            com.applovin.impl.sdk.VariableServiceImpl$2 r3 = new com.applovin.impl.sdk.VariableServiceImpl$2     // Catch:{ all -> 0x0021 }
            r3.<init>(r1)     // Catch:{ all -> 0x0021 }
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(r2, r3)     // Catch:{ all -> 0x0021 }
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            return
        L_0x001f:
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            return
        L_0x0021:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.VariableServiceImpl.a():void");
    }

    public boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    public boolean getBoolean(String str, boolean z) {
        return ((Boolean) a(str, Boolean.valueOf(z), Boolean.class)).booleanValue();
    }

    public String getString(String str) {
        return getString(str, (String) null);
    }

    public String getString(String str, String str2) {
        return (String) a(str, str2, String.class);
    }

    @Deprecated
    public void loadVariables() {
        String str;
        if (!this.f15169a.d()) {
            str = "The AppLovin SDK is waiting for the initial variables to be returned upon completing initialization.";
        } else if (this.f15170b.compareAndSet(false, true)) {
            this.f15169a.V().a((a) new m(this.f15169a, new m.a() {
                public void a() {
                    VariableServiceImpl.this.f15170b.set(false);
                }
            }), o.a.BACKGROUND);
            return;
        } else {
            str = "Ignored explicit variables load. Service is already in the process of retrieving the latest set of variables.";
        }
        v.i("AppLovinVariableService", str);
    }

    @Deprecated
    public void setOnVariablesUpdateListener(AppLovinVariableService.OnVariablesUpdateListener onVariablesUpdateListener) {
        this.f15172d = onVariablesUpdateListener;
        synchronized (this.f15174f) {
            if (onVariablesUpdateListener != null) {
                if (this.f15173e != null && this.f15171c.compareAndSet(false, true)) {
                    this.f15169a.D();
                    if (v.a()) {
                        this.f15169a.D().b("AppLovinVariableService", "Setting initial listener");
                    }
                    a();
                }
            }
        }
    }

    public String toString() {
        return "VariableService{variables=" + this.f15173e + ", listener=" + this.f15172d + '}';
    }

    public void updateVariables(JSONObject jSONObject) {
        this.f15169a.D();
        if (v.a()) {
            v D = this.f15169a.D();
            D.b("AppLovinVariableService", "Updating variables: " + jSONObject + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        synchronized (this.f15174f) {
            this.f15173e = JsonUtils.toBundle(jSONObject);
            a();
            this.f15169a.a(d.j, jSONObject.toString());
        }
    }
}
