package com.iab.omid.library.amazon.walking;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.amazon.b.c;
import com.iab.omid.library.amazon.d.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<View, String> f7608a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<View, C0068a> f7609b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, View> f7610c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final HashSet<View> f7611d = new HashSet<>();

    /* renamed from: e  reason: collision with root package name */
    private final HashSet<String> f7612e = new HashSet<>();

    /* renamed from: f  reason: collision with root package name */
    private final HashSet<String> f7613f = new HashSet<>();

    /* renamed from: g  reason: collision with root package name */
    private final HashMap<String, String> f7614g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    private final Map<View, Boolean> f7615h = new WeakHashMap();
    private boolean i;

    /* renamed from: com.iab.omid.library.amazon.walking.a$a  reason: collision with other inner class name */
    public static class C0068a {

        /* renamed from: a  reason: collision with root package name */
        private final c f7616a;

        /* renamed from: b  reason: collision with root package name */
        private final ArrayList<String> f7617b = new ArrayList<>();

        public C0068a(c cVar, String str) {
            this.f7616a = cVar;
            a(str);
        }

        public c a() {
            return this.f7616a;
        }

        public void a(String str) {
            this.f7617b.add(str);
        }

        public ArrayList<String> b() {
            return this.f7617b;
        }
    }

    private void a(com.iab.omid.library.amazon.adsession.a aVar) {
        for (c a2 : aVar.a()) {
            a(a2, aVar);
        }
    }

    private void a(c cVar, com.iab.omid.library.amazon.adsession.a aVar) {
        View view = (View) cVar.a().get();
        if (view != null) {
            C0068a aVar2 = this.f7609b.get(view);
            if (aVar2 != null) {
                aVar2.a(aVar.getAdSessionId());
            } else {
                this.f7609b.put(view, new C0068a(cVar, aVar.getAdSessionId()));
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
        this.f7611d.addAll(hashSet);
        return null;
    }

    private Boolean f(View view) {
        if (view.hasWindowFocus()) {
            this.f7615h.remove(view);
            return false;
        } else if (this.f7615h.containsKey(view)) {
            return this.f7615h.get(view);
        } else {
            this.f7615h.put(view, false);
            return false;
        }
    }

    public String a(View view) {
        if (this.f7608a.size() == 0) {
            return null;
        }
        String str = this.f7608a.get(view);
        if (str != null) {
            this.f7608a.remove(view);
        }
        return str;
    }

    public String a(String str) {
        return this.f7614g.get(str);
    }

    public HashSet<String> a() {
        return this.f7612e;
    }

    public View b(String str) {
        return this.f7610c.get(str);
    }

    public C0068a b(View view) {
        C0068a aVar = this.f7609b.get(view);
        if (aVar != null) {
            this.f7609b.remove(view);
        }
        return aVar;
    }

    public HashSet<String> b() {
        return this.f7613f;
    }

    public c c(View view) {
        return this.f7611d.contains(view) ? c.PARENT_VIEW : this.i ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void c() {
        com.iab.omid.library.amazon.b.a a2 = com.iab.omid.library.amazon.b.a.a();
        if (a2 != null) {
            for (com.iab.omid.library.amazon.adsession.a next : a2.c()) {
                View e2 = next.e();
                if (next.f()) {
                    String adSessionId = next.getAdSessionId();
                    if (e2 != null) {
                        String e3 = e(e2);
                        if (e3 == null) {
                            this.f7612e.add(adSessionId);
                            this.f7608a.put(e2, adSessionId);
                            a(next);
                        } else if (e3 != "noWindowFocus") {
                            this.f7613f.add(adSessionId);
                            this.f7610c.put(adSessionId, e2);
                            this.f7614g.put(adSessionId, e3);
                        }
                    } else {
                        this.f7613f.add(adSessionId);
                        this.f7614g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void d() {
        this.f7608a.clear();
        this.f7609b.clear();
        this.f7610c.clear();
        this.f7611d.clear();
        this.f7612e.clear();
        this.f7613f.clear();
        this.f7614g.clear();
        this.i = false;
    }

    public boolean d(View view) {
        if (!this.f7615h.containsKey(view)) {
            return true;
        }
        this.f7615h.put(view, true);
        return false;
    }

    public void e() {
        this.i = true;
    }
}
