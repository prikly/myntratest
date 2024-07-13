package com.ironsource.a;

import android.net.Uri;
import android.util.Log;
import com.ironsource.d.b;
import com.ironsource.d.c;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    a f7974a;

    /* renamed from: b  reason: collision with root package name */
    private c f7975b;

    /* renamed from: c  reason: collision with root package name */
    private d f7976c;

    /* renamed from: d  reason: collision with root package name */
    private ExecutorService f7977d;

    public b(a aVar, c cVar) {
        if (aVar == null) {
            throw new InvalidParameterException("Null configuration not supported ");
        } else if (aVar.f7965d != null) {
            this.f7974a = aVar;
            this.f7975b = cVar;
            this.f7976c = aVar.f7965d;
            this.f7977d = Executors.newSingleThreadExecutor();
        } else {
            throw new InvalidParameterException("Null formatter not supported ");
        }
    }

    private static void a(Map<String, Object> map, Map<String, Object> map2) {
        try {
            map.putAll(map2);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public void a(String str) {
        if (this.f7974a.f7966e) {
            Log.d("EventsTracker", str);
        }
    }

    public final void a(String str, Map<String, Object> map) {
        a(String.format(Locale.ENGLISH, "%s %s", new Object[]{str, map.toString()}));
        if (this.f7974a.f7963b && !str.isEmpty()) {
            HashMap hashMap = new HashMap();
            hashMap.put("eventname", str);
            a((Map<String, Object>) hashMap, this.f7975b.a());
            a((Map<String, Object>) hashMap, map);
            final String a2 = this.f7976c.a(hashMap);
            this.f7977d.submit(new Runnable() {
                public final void run() {
                    try {
                        c cVar = new c();
                        ArrayList arrayList = new ArrayList(b.this.f7974a.f7967f);
                        if ("POST".equals(b.this.f7974a.f7964c)) {
                            cVar = com.ironsource.d.b.a(b.this.f7974a.f7962a, a2, arrayList);
                        } else if ("GET".equals(b.this.f7974a.f7964c)) {
                            String str = b.this.f7974a.f7962a;
                            String str2 = a2;
                            Uri build = Uri.parse(str).buildUpon().encodedQuery(str2).build();
                            b.a.C0081a aVar = new b.a.C0081a();
                            aVar.f8001b = build.toString();
                            aVar.f8003d = str2;
                            aVar.f8002c = "GET";
                            aVar.a(arrayList);
                            cVar = com.ironsource.d.b.a(aVar.a());
                        }
                        b bVar = b.this;
                        bVar.a("response status code: " + cVar.f8007a);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            });
        }
    }
}
