package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.w  reason: case insensitive filesystem */
public class C0901w {

    /* renamed from: a  reason: collision with root package name */
    protected AbstractAdapter f8966a;

    /* renamed from: b  reason: collision with root package name */
    protected com.ironsource.mediationsdk.model.a f8967b;

    /* renamed from: c  reason: collision with root package name */
    protected JSONObject f8968c;

    /* renamed from: d  reason: collision with root package name */
    int f8969d;

    /* renamed from: e  reason: collision with root package name */
    protected String f8970e;

    /* renamed from: f  reason: collision with root package name */
    protected JSONObject f8971f;

    /* renamed from: g  reason: collision with root package name */
    protected List<String> f8972g;

    /* renamed from: h  reason: collision with root package name */
    protected String f8973h;
    private a i;
    private Timer j;
    private final Object k = new Object();
    private final Object l = new Object();

    /* renamed from: com.ironsource.mediationsdk.w$a */
    public enum a {
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS
    }

    public C0901w(com.ironsource.mediationsdk.model.a aVar, AbstractAdapter abstractAdapter) {
        this.f8967b = aVar;
        this.f8966a = abstractAdapter;
        this.f8968c = aVar.f8726b;
        this.i = a.NOT_LOADED;
        this.j = null;
        this.f8970e = "";
        this.f8971f = null;
        this.f8972g = new ArrayList();
    }

    /* access modifiers changed from: package-private */
    public final a a(a[] aVarArr, a aVar) {
        a aVar2;
        synchronized (this.k) {
            aVar2 = this.i;
            if (Arrays.asList(aVarArr).contains(this.i)) {
                a(aVar);
            }
        }
        return aVar2;
    }

    /* access modifiers changed from: package-private */
    public final void a(a aVar) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "DemandOnlySmash " + this.f8967b.f8725a.getProviderName() + ": current state=" + this.i + ", new state=" + aVar, 0);
        synchronized (this.k) {
            this.i = aVar;
        }
    }

    public final void a(String str) {
        C0884f.a();
        this.f8973h = C0884f.d(str);
    }

    /* access modifiers changed from: package-private */
    public final void a(TimerTask timerTask) {
        synchronized (this.l) {
            h();
            Timer timer = new Timer();
            this.j = timer;
            timer.schedule(timerTask, (long) (this.f8969d * 1000));
        }
    }

    public final void a(JSONObject jSONObject) {
        this.f8971f = jSONObject;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(a aVar, a aVar2) {
        synchronized (this.k) {
            if (this.i != aVar) {
                return false;
            }
            a(aVar2);
            return true;
        }
    }

    public final void b(String str) {
        this.f8970e = str;
    }

    public Map<String, Object> c() {
        HashMap hashMap = new HashMap();
        try {
            String str = "";
            hashMap.put("providerAdapterVersion", this.f8966a != null ? this.f8966a.getVersion() : str);
            if (this.f8966a != null) {
                str = this.f8966a.getCoreSDKVersion();
            }
            hashMap.put("providerSDKVersion", str);
            hashMap.put("spId", this.f8967b.f8725a.getSubProviderId());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.f8967b.f8725a.getAdSourceNameForEvents());
            hashMap.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            if (this.f8967b.f8727c) {
                hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
                hashMap.put("instanceType", 2);
                if (!TextUtils.isEmpty(this.f8970e)) {
                    hashMap.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f8970e);
                }
                if (this.f8971f != null && this.f8971f.length() > 0) {
                    hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f8971f);
                }
            } else {
                hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 0);
                hashMap.put("instanceType", 1);
            }
            if (!TextUtils.isEmpty(this.f8973h)) {
                hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID, this.f8973h);
            }
        } catch (Exception e2) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, "getProviderEventData " + d() + ")", e2);
        }
        return hashMap;
    }

    public final String d() {
        return this.f8967b.f8725a.getProviderName();
    }

    public final int e() {
        return this.f8967b.f8728d;
    }

    public final String f() {
        return this.f8967b.f8725a.getSubProviderId();
    }

    /* access modifiers changed from: package-private */
    public final String g() {
        a aVar = this.i;
        return aVar == null ? "null" : aVar.toString();
    }

    /* access modifiers changed from: package-private */
    public final void h() {
        synchronized (this.l) {
            if (this.j != null) {
                this.j.cancel();
                this.j = null;
            }
        }
    }

    public final boolean i() {
        return this.f8967b.f8727c;
    }
}
