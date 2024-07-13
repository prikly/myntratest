package com.iab.omid.library.applovin.processor;

import android.view.View;
import com.iab.omid.library.applovin.adsession.a;
import com.iab.omid.library.applovin.processor.a;
import com.iab.omid.library.applovin.utils.e;
import com.iab.omid.library.applovin.utils.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

public class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final a f7689a;

    public c(a aVar) {
        this.f7689a = aVar;
    }

    /* access modifiers changed from: package-private */
    public ArrayList<View> a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        com.iab.omid.library.applovin.internal.c c2 = com.iab.omid.library.applovin.internal.c.c();
        if (c2 != null) {
            Collection<a> a2 = c2.a();
            IdentityHashMap identityHashMap = new IdentityHashMap((a2.size() * 2) + 3);
            for (a c3 : a2) {
                View c4 = c3.c();
                if (c4 != null && h.e(c4) && (rootView = c4.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float c5 = h.c(rootView);
                    int size = arrayList.size();
                    while (size > 0 && h.c(arrayList.get(size - 1)) > c5) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    public JSONObject a(View view) {
        JSONObject a2 = com.iab.omid.library.applovin.utils.c.a(0, 0, 0, 0);
        com.iab.omid.library.applovin.utils.c.a(a2, e.a());
        return a2;
    }

    public void a(View view, JSONObject jSONObject, a.C0070a aVar, boolean z, boolean z2) {
        Iterator<View> it = a().iterator();
        while (it.hasNext()) {
            aVar.a(it.next(), this.f7689a, jSONObject, z2);
        }
    }
}
