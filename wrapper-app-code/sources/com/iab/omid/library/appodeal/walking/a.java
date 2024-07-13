package com.iab.omid.library.appodeal.walking;

import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.appodeal.b.c;
import com.iab.omid.library.appodeal.d.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<View, String> f7829a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<View, C0074a> f7830b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, View> f7831c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final HashSet<View> f7832d = new HashSet<>();

    /* renamed from: e  reason: collision with root package name */
    private final HashSet<String> f7833e = new HashSet<>();

    /* renamed from: f  reason: collision with root package name */
    private final HashSet<String> f7834f = new HashSet<>();

    /* renamed from: g  reason: collision with root package name */
    private final HashMap<String, String> f7835g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    private boolean f7836h;

    /* renamed from: com.iab.omid.library.appodeal.walking.a$a  reason: collision with other inner class name */
    public static class C0074a {

        /* renamed from: a  reason: collision with root package name */
        private final c f7837a;

        /* renamed from: b  reason: collision with root package name */
        private final ArrayList<String> f7838b = new ArrayList<>();

        public C0074a(c cVar, String str) {
            this.f7837a = cVar;
            a(str);
        }

        public c a() {
            return this.f7837a;
        }

        public void a(String str) {
            this.f7838b.add(str);
        }

        public ArrayList<String> b() {
            return this.f7838b;
        }
    }

    private void a(com.iab.omid.library.appodeal.adsession.a aVar) {
        for (c a2 : aVar.a()) {
            a(a2, aVar);
        }
    }

    private void a(c cVar, com.iab.omid.library.appodeal.adsession.a aVar) {
        View view = (View) cVar.a().get();
        if (view != null) {
            C0074a aVar2 = this.f7830b.get(view);
            if (aVar2 != null) {
                aVar2.a(aVar.getAdSessionId());
            } else {
                this.f7830b.put(view, new C0074a(cVar, aVar.getAdSessionId()));
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
        this.f7832d.addAll(hashSet);
        return null;
    }

    public String a(View view) {
        if (this.f7829a.size() == 0) {
            return null;
        }
        String str = this.f7829a.get(view);
        if (str != null) {
            this.f7829a.remove(view);
        }
        return str;
    }

    public String a(String str) {
        return this.f7835g.get(str);
    }

    public HashSet<String> a() {
        return this.f7833e;
    }

    public View b(String str) {
        return this.f7831c.get(str);
    }

    public C0074a b(View view) {
        C0074a aVar = this.f7830b.get(view);
        if (aVar != null) {
            this.f7830b.remove(view);
        }
        return aVar;
    }

    public HashSet<String> b() {
        return this.f7834f;
    }

    public c c(View view) {
        return this.f7832d.contains(view) ? c.PARENT_VIEW : this.f7836h ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void c() {
        com.iab.omid.library.appodeal.b.a a2 = com.iab.omid.library.appodeal.b.a.a();
        if (a2 != null) {
            for (com.iab.omid.library.appodeal.adsession.a next : a2.c()) {
                View d2 = next.d();
                if (next.e()) {
                    String adSessionId = next.getAdSessionId();
                    if (d2 != null) {
                        String d3 = d(d2);
                        if (d3 == null) {
                            this.f7833e.add(adSessionId);
                            this.f7829a.put(d2, adSessionId);
                            a(next);
                        } else {
                            this.f7834f.add(adSessionId);
                            this.f7831c.put(adSessionId, d2);
                            this.f7835g.put(adSessionId, d3);
                        }
                    } else {
                        this.f7834f.add(adSessionId);
                        this.f7835g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void d() {
        this.f7829a.clear();
        this.f7830b.clear();
        this.f7831c.clear();
        this.f7832d.clear();
        this.f7833e.clear();
        this.f7834f.clear();
        this.f7835g.clear();
        this.f7836h = false;
    }

    public void e() {
        this.f7836h = true;
    }
}
