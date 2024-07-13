package com.applovin.impl.sdk;

import android.content.Intent;
import android.text.TextUtils;
import com.applovin.impl.sdk.c.b;
import com.applovin.impl.sdk.c.d;
import com.applovin.impl.sdk.e.a;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.network.h;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinEventService;
import com.applovin.sdk.AppLovinEventTypes;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class EventServiceImpl implements AppLovinEventService {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final n f15146a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, Object> f15147b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f15148c = new AtomicBoolean();

    public EventServiceImpl(n nVar) {
        this.f15146a = nVar;
        if (((Boolean) nVar.a(b.bn)).booleanValue()) {
            this.f15147b = JsonUtils.toStringObjectMap((String) this.f15146a.b(d.t, JsonUtils.EMPTY_JSON));
            return;
        }
        this.f15147b = CollectionUtils.map();
        nVar.a(d.t, JsonUtils.EMPTY_JSON);
    }

    /* access modifiers changed from: private */
    public String a() {
        return ((String) this.f15146a.a(b.be)) + "4.0/pix";
    }

    /* access modifiers changed from: private */
    public Map<String, String> a(q qVar, Map<String, String> map) {
        Map<String, String> map2 = CollectionUtils.map(map);
        boolean contains = this.f15146a.b(b.bl).contains(qVar.a());
        map2.put("AppLovin-Event", contains ? qVar.a() : "postinstall");
        if (!contains) {
            map2.put("AppLovin-Sub-Event", qVar.a());
        }
        return map2;
    }

    /* access modifiers changed from: private */
    public Map<String, String> a(q qVar, boolean z) {
        boolean contains = this.f15146a.b(b.bl).contains(qVar.a());
        Map<String, Object> a2 = this.f15146a.Y().a((Map<String, String>) null, z, false);
        a2.put("event", contains ? qVar.a() : "postinstall");
        a2.put("event_id", qVar.d());
        a2.put("ts", Long.toString(qVar.c()));
        if (!contains) {
            a2.put("sub_event", qVar.a());
        }
        return Utils.stringifyObjectMap(a2);
    }

    /* access modifiers changed from: private */
    public String b() {
        return ((String) this.f15146a.a(b.bf)) + "4.0/pix";
    }

    private void c() {
        if (((Boolean) this.f15146a.a(b.bn)).booleanValue()) {
            this.f15146a.a(d.t, CollectionUtils.toJsonString(this.f15147b, JsonUtils.EMPTY_JSON));
        }
    }

    public Map<String, Object> getSuperProperties() {
        return CollectionUtils.map(this.f15147b);
    }

    public void maybeTrackAppOpenEvent() {
        if (this.f15148c.compareAndSet(false, true)) {
            this.f15146a.x().trackEvent("landing");
        }
    }

    public void setSuperProperty(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            v.i("AppLovinEventService", "Super property key cannot be null or empty");
        } else if (obj == null) {
            this.f15147b.remove(str);
            c();
        } else {
            List<String> b2 = this.f15146a.b(b.bm);
            if (!Utils.objectIsOfType(obj, b2, this.f15146a)) {
                v.i("AppLovinEventService", "Failed to set super property '" + obj + "' for key '" + str + "' - valid super property types include: " + b2);
                return;
            }
            this.f15147b.put(str, Utils.sanitizeSuperProperty(obj, this.f15146a));
            c();
        }
    }

    public String toString() {
        return "EventService{}";
    }

    public void trackCheckout(String str, Map<String, String> map) {
        Map<String, String> map2 = CollectionUtils.map(map);
        map2.put(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER, str);
        trackEvent(AppLovinEventTypes.USER_COMPLETED_CHECKOUT, map2);
    }

    public void trackEvent(String str) {
        trackEvent(str, CollectionUtils.map());
    }

    public void trackEvent(String str, Map<String, String> map) {
        trackEvent(str, map, (Map<String, String>) null);
    }

    public void trackEvent(String str, Map<String, String> map, final Map<String, String> map2) {
        this.f15146a.D();
        if (v.a()) {
            v D = this.f15146a.D();
            D.b("AppLovinEventService", "Tracking event: \"" + str + "\" with parameters: " + map);
        }
        final q qVar = new q(str, map, this.f15147b);
        try {
            this.f15146a.V().a((a) new z(this.f15146a, new Runnable() {
                public void run() {
                    EventServiceImpl.this.f15146a.X().a(h.o().c(EventServiceImpl.this.a()).d(EventServiceImpl.this.b()).a((Map<String, String>) EventServiceImpl.this.a(qVar, false)).b((Map<String, String>) EventServiceImpl.this.a(qVar, (Map<String, String>) map2)).c(qVar.b()).b(((Boolean) EventServiceImpl.this.f15146a.a(b.eJ)).booleanValue()).a(((Boolean) EventServiceImpl.this.f15146a.a(b.eA)).booleanValue()).a());
                }
            }), o.a.BACKGROUND);
        } catch (Throwable th) {
            this.f15146a.D();
            if (v.a()) {
                v D2 = this.f15146a.D();
                D2.b("AppLovinEventService", "Unable to track event: " + qVar, th);
            }
        }
    }

    public void trackEventSynchronously(String str) {
        this.f15146a.D();
        if (v.a()) {
            v D = this.f15146a.D();
            D.b("AppLovinEventService", "Tracking event: \"" + str + "\" synchronously");
        }
        q qVar = new q(str, CollectionUtils.map(), this.f15147b);
        this.f15146a.X().a(h.o().c(a()).d(b()).a(a(qVar, true)).b(a(qVar, (Map<String, String>) null)).c(qVar.b()).b(((Boolean) this.f15146a.a(b.eJ)).booleanValue()).a(((Boolean) this.f15146a.a(b.eA)).booleanValue()).a());
    }

    public void trackInAppPurchase(Intent intent, Map<String, String> map) {
        Map<String, String> map2 = CollectionUtils.map(map);
        try {
            map2.put(AppLovinEventParameters.IN_APP_PURCHASE_DATA, intent.getStringExtra("INAPP_PURCHASE_DATA"));
            map2.put(AppLovinEventParameters.IN_APP_DATA_SIGNATURE, intent.getStringExtra("INAPP_DATA_SIGNATURE"));
        } catch (Throwable th) {
            v.c("AppLovinEventService", "Unable to track in app purchase - invalid purchase intent", th);
        }
        trackEvent("iap", map2);
    }
}
