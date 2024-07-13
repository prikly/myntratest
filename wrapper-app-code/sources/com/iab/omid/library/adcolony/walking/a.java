package com.iab.omid.library.adcolony.walking;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.adcolony.b.c;
import com.iab.omid.library.adcolony.d.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<View, String> f7501a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<View, C0065a> f7502b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, View> f7503c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final HashSet<View> f7504d = new HashSet<>();

    /* renamed from: e  reason: collision with root package name */
    private final HashSet<String> f7505e = new HashSet<>();

    /* renamed from: f  reason: collision with root package name */
    private final HashSet<String> f7506f = new HashSet<>();

    /* renamed from: g  reason: collision with root package name */
    private final HashMap<String, String> f7507g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    private final Map<View, Boolean> f7508h = new WeakHashMap();
    private boolean i;

    /* renamed from: com.iab.omid.library.adcolony.walking.a$a  reason: collision with other inner class name */
    public static class C0065a {

        /* renamed from: a  reason: collision with root package name */
        private final c f7509a;

        /* renamed from: b  reason: collision with root package name */
        private final ArrayList<String> f7510b = new ArrayList<>();

        public C0065a(c cVar, String str) {
            this.f7509a = cVar;
            a(str);
        }

        public c a() {
            return this.f7509a;
        }

        public void a(String str) {
            this.f7510b.add(str);
        }

        public ArrayList<String> b() {
            return this.f7510b;
        }
    }

    private void a(com.iab.omid.library.adcolony.adsession.a aVar) {
        for (c a2 : aVar.a()) {
            a(a2, aVar);
        }
    }

    private void a(c cVar, com.iab.omid.library.adcolony.adsession.a aVar) {
        View view = (View) cVar.a().get();
        if (view != null) {
            C0065a aVar2 = this.f7502b.get(view);
            if (aVar2 != null) {
                aVar2.a(aVar.getAdSessionId());
            } else {
                this.f7502b.put(view, new C0065a(cVar, aVar.getAdSessionId()));
            }
        }
    }

    private String e(View view) {
        if (Build.VERSION.SDK_INT >= 19 && !view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (f(view).booleanValue()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String e2 = f.e(view);
            if (e2 != null) {
                return e2;
            }
            hashSet.add(view);
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f7504d.addAll(hashSet);
        return null;
    }

    private Boolean f(View view) {
        if (view.hasWindowFocus()) {
            this.f7508h.remove(view);
            return Boolean.FALSE;
        } else if (this.f7508h.containsKey(view)) {
            return this.f7508h.get(view);
        } else {
            Map<View, Boolean> map = this.f7508h;
            Boolean bool = Boolean.FALSE;
            map.put(view, bool);
            return bool;
        }
    }

    public String a(View view) {
        if (this.f7501a.size() == 0) {
            return null;
        }
        String str = this.f7501a.get(view);
        if (str != null) {
            this.f7501a.remove(view);
        }
        return str;
    }

    public String a(String str) {
        return this.f7507g.get(str);
    }

    public HashSet<String> a() {
        return this.f7505e;
    }

    public View b(String str) {
        return this.f7503c.get(str);
    }

    public C0065a b(View view) {
        C0065a aVar = this.f7502b.get(view);
        if (aVar != null) {
            this.f7502b.remove(view);
        }
        return aVar;
    }

    public HashSet<String> b() {
        return this.f7506f;
    }

    public c c(View view) {
        return this.f7504d.contains(view) ? c.PARENT_VIEW : this.i ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void c() {
        com.iab.omid.library.adcolony.b.a a2 = com.iab.omid.library.adcolony.b.a.a();
        if (a2 != null) {
            for (com.iab.omid.library.adcolony.adsession.a next : a2.c()) {
                View e2 = next.e();
                if (next.f()) {
                    String adSessionId = next.getAdSessionId();
                    if (e2 != null) {
                        String e3 = e(e2);
                        if (e3 == null) {
                            this.f7505e.add(adSessionId);
                            this.f7501a.put(e2, adSessionId);
                            a(next);
                        } else if (e3 != "noWindowFocus") {
                            this.f7506f.add(adSessionId);
                            this.f7503c.put(adSessionId, e2);
                            this.f7507g.put(adSessionId, e3);
                        }
                    } else {
                        this.f7506f.add(adSessionId);
                        this.f7507g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void d() {
        this.f7501a.clear();
        this.f7502b.clear();
        this.f7503c.clear();
        this.f7504d.clear();
        this.f7505e.clear();
        this.f7506f.clear();
        this.f7507g.clear();
        this.i = false;
    }

    public boolean d(View view) {
        if (!this.f7508h.containsKey(view)) {
            return true;
        }
        this.f7508h.put(view, Boolean.TRUE);
        return false;
    }

    public void e() {
        this.i = true;
    }
}
