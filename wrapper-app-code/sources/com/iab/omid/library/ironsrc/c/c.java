package com.iab.omid.library.ironsrc.c;

import android.view.View;
import com.iab.omid.library.ironsrc.b.a;
import com.iab.omid.library.ironsrc.c.a;
import com.iab.omid.library.ironsrc.d.b;
import com.iab.omid.library.ironsrc.d.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

public class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final a f7906a;

    public c(a aVar) {
        this.f7906a = aVar;
    }

    /* access modifiers changed from: package-private */
    public ArrayList<View> a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        a a2 = a.a();
        if (a2 != null) {
            Collection<com.iab.omid.library.ironsrc.adsession.a> c2 = a2.c();
            IdentityHashMap identityHashMap = new IdentityHashMap((c2.size() * 2) + 3);
            for (com.iab.omid.library.ironsrc.adsession.a d2 : c2) {
                View d3 = d2.d();
                if (d3 != null && f.c(d3) && (rootView = d3.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float a3 = f.a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && f.a(arrayList.get(size - 1)) > a3) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    public JSONObject a(View view) {
        return b.a(0, 0, 0, 0);
    }

    public void a(View view, JSONObject jSONObject, a.C0076a aVar, boolean z) {
        Iterator<View> it = a().iterator();
        while (it.hasNext()) {
            aVar.a(it.next(), this.f7906a, jSONObject);
        }
    }
}
