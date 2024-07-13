package com.ironsource.sdk.a;

import android.util.Log;
import com.ironsource.a.a;
import com.ironsource.a.b;
import com.ironsource.sdk.a.f;
import java.util.HashMap;
import java.util.Map;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static d f8996a;

    /* renamed from: b  reason: collision with root package name */
    private b f8997b;

    private d() {
    }

    private static d a() {
        if (f8996a == null) {
            f8996a = new d();
        }
        return f8996a;
    }

    public static void a(a aVar, b bVar) {
        if (aVar != null) {
            try {
                a().f8997b = new b(aVar, bVar);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void a(f.a aVar) {
        a(aVar, (Map<String, Object>) new HashMap());
    }

    public static void a(f.a aVar, Map<String, Object> map) {
        b bVar = a().f8997b;
        if (bVar == null) {
            Log.d("sdk5Events", "logEvent failed eventsTracker doesn't exist");
            return;
        }
        if (map != null) {
            map.put("eventid", Integer.valueOf(aVar.f9008b));
        }
        bVar.a(aVar.f9007a, map);
    }
}
