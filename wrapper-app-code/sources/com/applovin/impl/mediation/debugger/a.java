package com.applovin.impl.mediation.debugger;

import com.applovin.impl.mediation.debugger.c.a;
import com.applovin.impl.mediation.debugger.c.b;
import com.applovin.impl.sdk.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class a implements a.C0147a, b.a {

    /* renamed from: a  reason: collision with root package name */
    private final n f14650a;

    /* renamed from: b  reason: collision with root package name */
    private final C0144a f14651b;

    /* renamed from: c  reason: collision with root package name */
    private com.applovin.impl.mediation.debugger.b.b.a f14652c;

    /* renamed from: com.applovin.impl.mediation.debugger.a$a  reason: collision with other inner class name */
    public interface C0144a {
        void a();

        void a(com.applovin.impl.mediation.debugger.b.b.a aVar);
    }

    public a(n nVar, C0144a aVar) {
        this.f14650a = nVar;
        this.f14651b = aVar;
    }

    public void a() {
        com.applovin.impl.mediation.debugger.b.b.a aVar = this.f14652c;
        if (aVar != null) {
            this.f14651b.a(aVar);
            return;
        }
        this.f14650a.V().a((com.applovin.impl.sdk.e.a) new b(this.f14650a, this));
    }

    public void a(String str) {
        this.f14650a.V().a((com.applovin.impl.sdk.e.a) new com.applovin.impl.mediation.debugger.c.a(this.f14650a, str, this));
    }

    public void b() {
        this.f14651b.a();
    }

    public void b(String str) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        String[] split = str.split("\n");
        int length = split.length;
        int i = 1;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i + 1;
            com.applovin.impl.mediation.debugger.b.b.b bVar = new com.applovin.impl.mediation.debugger.b.b.b(split[i2], i);
            if (bVar.e()) {
                String a2 = bVar.a();
                List arrayList2 = hashMap.containsKey(a2) ? (List) hashMap.get(a2) : new ArrayList();
                if (arrayList2 != null) {
                    arrayList2.add(bVar);
                    hashMap.put(a2, arrayList2);
                }
            } else {
                arrayList.add(bVar);
            }
            i2++;
            i = i3;
        }
        com.applovin.impl.mediation.debugger.b.b.a aVar = new com.applovin.impl.mediation.debugger.b.b.a(hashMap, arrayList);
        this.f14652c = aVar;
        this.f14651b.a(aVar);
    }

    public void c() {
        this.f14651b.a();
    }
}
