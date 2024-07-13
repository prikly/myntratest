package com.appodeal.ads.utils;

import android.text.TextUtils;
import com.appodeal.ads.l;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.storage.o;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

public class EventsTracker {

    /* renamed from: e  reason: collision with root package name */
    public static EventsTracker f17466e;

    /* renamed from: a  reason: collision with root package name */
    public final EnumMap f17467a = new EnumMap(AdType.class);

    /* renamed from: b  reason: collision with root package name */
    public final a f17468b = new a((a) null);

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f17469c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final o f17470d = o.f17407b;

    public enum EventType {
        Impression,
        Click,
        Finish,
        FailedToLoad,
        InternalError,
        Expired
    }

    public interface EventsListener {
        void onImpressionStored(AdType adType, String str);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final EnumMap<EventType, AtomicInteger> f17471a = new EnumMap<>(EventType.class);

        /* renamed from: b  reason: collision with root package name */
        public final EnumMap<EventType, Map<String, AtomicInteger>> f17472b = new EnumMap<>(EventType.class);

        /* renamed from: c  reason: collision with root package name */
        public final a f17473c;

        /* renamed from: com.appodeal.ads.utils.EventsTracker$a$a  reason: collision with other inner class name */
        public class C0206a extends HashMap<String, AtomicInteger> {
            public C0206a(String str) {
                put(str, new AtomicInteger(1));
            }
        }

        public a(a aVar) {
            this.f17473c = aVar;
        }

        public final int a(EventType eventType) {
            if (this.f17471a.containsKey(eventType)) {
                return this.f17471a.get(eventType).get();
            }
            return 0;
        }

        public final void a(EventType eventType, String str) {
            a aVar = this.f17473c;
            if (aVar != null) {
                aVar.a(eventType, str);
            }
            if (this.f17471a.get(eventType) == null) {
                this.f17471a.put(eventType, new AtomicInteger(1));
            } else {
                this.f17471a.get(eventType).incrementAndGet();
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (this.f17472b.get(eventType) == null || !this.f17472b.get(eventType).containsKey(str)) {
                this.f17472b.put(eventType, new C0206a(str));
            } else {
                ((AtomicInteger) this.f17472b.get(eventType).get(str)).incrementAndGet();
            }
        }
    }

    public static EventsTracker get() {
        EventsTracker eventsTracker = f17466e;
        if (eventsTracker != null) {
            return eventsTracker;
        }
        EventsTracker eventsTracker2 = new EventsTracker();
        f17466e = eventsTracker2;
        return eventsTracker2;
    }

    public final int a(AdType adType, EventType... eventTypeArr) {
        int i = 0;
        for (EventType a2 : eventTypeArr) {
            i += a(adType).a(a2);
        }
        return i;
    }

    public final a a(AdType adType) {
        if (this.f17467a.containsKey(adType)) {
            return (a) this.f17467a.get(adType);
        }
        a aVar = new a(this.f17468b);
        this.f17467a.put(adType, aVar);
        return aVar;
    }

    public final JSONObject a(EventType eventType) {
        try {
            JSONObject jSONObject = new JSONObject(this.f17470d.f(eventType.name()));
            for (AdType adType : AdType.values()) {
                if (!jSONObject.has(adType.getCodeName())) {
                    jSONObject.put(adType.getCodeName(), 0);
                }
            }
            return jSONObject;
        } catch (JSONException e2) {
            Log.log(e2);
            return null;
        }
    }

    public final void a(AdType adType, l lVar, EventType eventType) {
        String name = lVar != null ? lVar.f16569b.getName() : null;
        if (adType != null) {
            a(adType).a(eventType, name);
            try {
                JSONObject jSONObject = new JSONObject(this.f17470d.f(eventType.name()));
                jSONObject.put(adType.getCodeName(), jSONObject.optInt(adType.getCodeName(), 0) + 1);
                this.f17470d.b(eventType.name(), jSONObject.toString());
            } catch (Exception e2) {
                Log.log(e2);
            }
        }
        if (eventType == EventType.Impression) {
            for (EventsListener onImpressionStored : this.f17469c.values()) {
                onImpressionStored.onImpressionStored(adType, name);
            }
        }
    }

    public final int b(EventType eventType) {
        return this.f17468b.a(eventType);
    }

    public final JSONObject c(EventType eventType) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (AdType adType : AdType.values()) {
                jSONObject.put(adType.getCodeName(), a(adType).a(eventType));
            }
        } catch (JSONException e2) {
            Log.log(e2);
        }
        return jSONObject;
    }

    public int getEventCount(EventType eventType, AdType... adTypeArr) {
        if (adTypeArr == null) {
            return 0;
        }
        int i = 0;
        for (AdType a2 : adTypeArr) {
            i += a(a2).a(eventType);
        }
        return i;
    }

    public void subscribeEventsListener(String str, EventsListener eventsListener) {
        this.f17469c.put(str, eventsListener);
    }

    public void unsubscribeEventsListener(String str) {
        this.f17469c.remove(str);
    }
}
