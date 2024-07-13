package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.n;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public abstract class Y implements n.a {

    /* renamed from: c  reason: collision with root package name */
    protected AbstractAdapter f8361c;

    /* renamed from: d  reason: collision with root package name */
    protected a f8362d;

    /* renamed from: e  reason: collision with root package name */
    boolean f8363e;

    /* renamed from: f  reason: collision with root package name */
    protected JSONObject f8364f;

    /* renamed from: g  reason: collision with root package name */
    protected String f8365g;

    /* renamed from: h  reason: collision with root package name */
    protected int f8366h;
    protected Long i = null;

    Y(a aVar, AbstractAdapter abstractAdapter) {
        this.f8362d = aVar;
        this.f8361c = abstractAdapter;
        this.f8364f = aVar.f8726b;
    }

    private String a() {
        return this.f8362d.f8725a.isMultipleInstances() ? this.f8362d.f8725a.getProviderTypeForReflection() : this.f8362d.f8725a.getProviderName();
    }

    public final void b(String str) {
        C0884f.a();
        this.f8365g = C0884f.d(str);
    }

    public void d() {
        try {
            if (this.f8361c != null) {
                this.f8361c.releaseMemory(this.f8362d.f8730f, this.f8364f);
            }
        } catch (Exception e2) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("exception - " + e2.getMessage());
        }
        this.f8361c = null;
    }

    public int e() {
        return 1;
    }

    public final boolean h() {
        return this.f8362d.f8727c;
    }

    public final int i() {
        return this.f8362d.f8728d;
    }

    public final int j() {
        return this.f8362d.f8729e;
    }

    public final String k() {
        return this.f8362d.f8725a.getProviderName();
    }

    public final String l() {
        return this.f8362d.f8725a.getProviderTypeForReflection();
    }

    public final int m() {
        return this.f8366h;
    }

    public final Map<String, Object> n() {
        HashMap hashMap = new HashMap();
        try {
            String str = "";
            hashMap.put("providerAdapterVersion", this.f8361c != null ? this.f8361c.getVersion() : str);
            if (this.f8361c != null) {
                str = this.f8361c.getCoreSDKVersion();
            }
            hashMap.put("providerSDKVersion", str);
            hashMap.put("spId", this.f8362d.f8725a.getSubProviderId());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.f8362d.f8725a.getAdSourceNameForEvents());
            hashMap.put("instanceType", Integer.valueOf(h() ? 2 : 1));
            hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(e()));
            if (!TextUtils.isEmpty(this.f8365g)) {
                hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID, this.f8365g);
            }
        } catch (Exception e2) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, "getProviderEventData " + k() + ")", e2);
        }
        return hashMap;
    }

    public final Long o() {
        return this.i;
    }

    public final String p() {
        return String.format("%s %s", new Object[]{a(), Integer.valueOf(hashCode())});
    }
}
