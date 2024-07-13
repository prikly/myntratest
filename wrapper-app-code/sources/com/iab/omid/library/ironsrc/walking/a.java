package com.iab.omid.library.ironsrc.walking;

import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.ironsrc.b.c;
import com.iab.omid.library.ironsrc.d.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<View, String> f7937a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<View, C0077a> f7938b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, View> f7939c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final HashSet<View> f7940d = new HashSet<>();

    /* renamed from: e  reason: collision with root package name */
    private final HashSet<String> f7941e = new HashSet<>();

    /* renamed from: f  reason: collision with root package name */
    private final HashSet<String> f7942f = new HashSet<>();

    /* renamed from: g  reason: collision with root package name */
    private final HashMap<String, String> f7943g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    private boolean f7944h;

    /* renamed from: com.iab.omid.library.ironsrc.walking.a$a  reason: collision with other inner class name */
    public static class C0077a {

        /* renamed from: a  reason: collision with root package name */
        private final c f7945a;

        /* renamed from: b  reason: collision with root package name */
        private final ArrayList<String> f7946b = new ArrayList<>();

        public C0077a(c cVar, String str) {
            this.f7945a = cVar;
            a(str);
        }

        public c a() {
            return this.f7945a;
        }

        public void a(String str) {
            this.f7946b.add(str);
        }

        public ArrayList<String> b() {
            return this.f7946b;
        }
    }

    private void a(com.iab.omid.library.ironsrc.adsession.a aVar) {
        for (c a2 : aVar.a()) {
            a(a2, aVar);
        }
    }

    private void a(c cVar, com.iab.omid.library.ironsrc.adsession.a aVar) {
        View view = (View) cVar.a().get();
        if (view != null) {
            C0077a aVar2 = this.f7938b.get(view);
            if (aVar2 != null) {
                aVar2.a(aVar.getAdSessionId());
            } else {
                this.f7938b.put(view, new C0077a(cVar, aVar.getAdSessionId()));
            }
        }
    }

    private String d(View view) {
        if (!view.hasWindowFocus()) {
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
        this.f7940d.addAll(hashSet);
        return null;
    }

    public String a(View view) {
        if (this.f7937a.size() == 0) {
            return null;
        }
        String str = this.f7937a.get(view);
        if (str != null) {
            this.f7937a.remove(view);
        }
        return str;
    }

    public String a(String str) {
        return this.f7943g.get(str);
    }

    public HashSet<String> a() {
        return this.f7941e;
    }

    public View b(String str) {
        return this.f7939c.get(str);
    }

    public C0077a b(View view) {
        C0077a aVar = this.f7938b.get(view);
        if (aVar != null) {
            this.f7938b.remove(view);
        }
        return aVar;
    }

    public HashSet<String> b() {
        return this.f7942f;
    }

    public c c(View view) {
        return this.f7940d.contains(view) ? c.PARENT_VIEW : this.f7944h ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void c() {
        com.iab.omid.library.ironsrc.b.a a2 = com.iab.omid.library.ironsrc.b.a.a();
        if (a2 != null) {
            for (com.iab.omid.library.ironsrc.adsession.a next : a2.c()) {
                View d2 = next.d();
                if (next.e()) {
                    String adSessionId = next.getAdSessionId();
                    if (d2 != null) {
                        String d3 = d(d2);
                        if (d3 == null) {
                            this.f7941e.add(adSessionId);
                            this.f7937a.put(d2, adSessionId);
                            a(next);
                        } else {
                            this.f7942f.add(adSessionId);
                            this.f7939c.put(adSessionId, d2);
                            this.f7943g.put(adSessionId, d3);
                        }
                    } else {
                        this.f7942f.add(adSessionId);
                        this.f7943g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void d() {
        this.f7937a.clear();
        this.f7938b.clear();
        this.f7939c.clear();
        this.f7940d.clear();
        this.f7941e.clear();
        this.f7942f.clear();
        this.f7943g.clear();
        this.f7944h = false;
    }

    public void e() {
        this.f7944h = true;
    }
}
