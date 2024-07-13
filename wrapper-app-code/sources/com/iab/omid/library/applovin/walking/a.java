package com.iab.omid.library.applovin.walking;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.applovin.internal.c;
import com.iab.omid.library.applovin.internal.e;
import com.iab.omid.library.applovin.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<View, String> f7722a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<View, C0071a> f7723b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, View> f7724c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final HashSet<View> f7725d = new HashSet<>();

    /* renamed from: e  reason: collision with root package name */
    private final HashSet<String> f7726e = new HashSet<>();

    /* renamed from: f  reason: collision with root package name */
    private final HashSet<String> f7727f = new HashSet<>();

    /* renamed from: g  reason: collision with root package name */
    private final HashMap<String, String> f7728g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    private final Map<View, Boolean> f7729h = new WeakHashMap();
    private boolean i;

    /* renamed from: com.iab.omid.library.applovin.walking.a$a  reason: collision with other inner class name */
    public static class C0071a {

        /* renamed from: a  reason: collision with root package name */
        private final e f7730a;

        /* renamed from: b  reason: collision with root package name */
        private final ArrayList<String> f7731b = new ArrayList<>();

        public C0071a(e eVar, String str) {
            this.f7730a = eVar;
            a(str);
        }

        public e a() {
            return this.f7730a;
        }

        public void a(String str) {
            this.f7731b.add(str);
        }

        public ArrayList<String> b() {
            return this.f7731b;
        }
    }

    private String a(View view) {
        if (Build.VERSION.SDK_INT >= 19 && !view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (b(view).booleanValue()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String a2 = h.a(view);
            if (a2 != null) {
                return a2;
            }
            hashSet.add(view);
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f7725d.addAll(hashSet);
        return null;
    }

    private void a(com.iab.omid.library.applovin.adsession.a aVar) {
        for (e a2 : aVar.d()) {
            a(a2, aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.applovin.adsession.a aVar) {
        View view = (View) eVar.c().get();
        if (view != null) {
            C0071a aVar2 = this.f7723b.get(view);
            if (aVar2 != null) {
                aVar2.a(aVar.getAdSessionId());
            } else {
                this.f7723b.put(view, new C0071a(eVar, aVar.getAdSessionId()));
            }
        }
    }

    private Boolean b(View view) {
        if (view.hasWindowFocus()) {
            this.f7729h.remove(view);
            return Boolean.FALSE;
        } else if (this.f7729h.containsKey(view)) {
            return this.f7729h.get(view);
        } else {
            Map<View, Boolean> map = this.f7729h;
            Boolean bool = Boolean.FALSE;
            map.put(view, bool);
            return bool;
        }
    }

    public View a(String str) {
        return this.f7724c.get(str);
    }

    public void a() {
        this.f7722a.clear();
        this.f7723b.clear();
        this.f7724c.clear();
        this.f7725d.clear();
        this.f7726e.clear();
        this.f7727f.clear();
        this.f7728g.clear();
        this.i = false;
    }

    public String b(String str) {
        return this.f7728g.get(str);
    }

    public HashSet<String> b() {
        return this.f7727f;
    }

    public C0071a c(View view) {
        C0071a aVar = this.f7723b.get(view);
        if (aVar != null) {
            this.f7723b.remove(view);
        }
        return aVar;
    }

    public HashSet<String> c() {
        return this.f7726e;
    }

    public String d(View view) {
        if (this.f7722a.size() == 0) {
            return null;
        }
        String str = this.f7722a.get(view);
        if (str != null) {
            this.f7722a.remove(view);
        }
        return str;
    }

    public void d() {
        this.i = true;
    }

    public c e(View view) {
        return this.f7725d.contains(view) ? c.PARENT_VIEW : this.i ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        c c2 = c.c();
        if (c2 != null) {
            for (com.iab.omid.library.applovin.adsession.a next : c2.a()) {
                View c3 = next.c();
                if (next.f()) {
                    String adSessionId = next.getAdSessionId();
                    if (c3 != null) {
                        String a2 = a(c3);
                        if (a2 == null) {
                            this.f7726e.add(adSessionId);
                            this.f7722a.put(c3, adSessionId);
                            a(next);
                        } else if (a2 != "noWindowFocus") {
                            this.f7727f.add(adSessionId);
                            this.f7724c.put(adSessionId, c3);
                            this.f7728g.put(adSessionId, a2);
                        }
                    } else {
                        this.f7727f.add(adSessionId);
                        this.f7728g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public boolean f(View view) {
        if (!this.f7729h.containsKey(view)) {
            return true;
        }
        this.f7729h.put(view, Boolean.TRUE);
        return false;
    }
}
