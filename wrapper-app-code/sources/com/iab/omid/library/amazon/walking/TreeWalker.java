package com.iab.omid.library.amazon.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.amazon.c.a;
import com.iab.omid.library.amazon.c.b;
import com.iab.omid.library.amazon.d.d;
import com.iab.omid.library.amazon.d.f;
import com.iab.omid.library.amazon.walking.a;
import com.iab.omid.library.amazon.walking.a.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class TreeWalker implements a.C0067a {

    /* renamed from: a  reason: collision with root package name */
    private static TreeWalker f7599a = new TreeWalker();

    /* renamed from: b  reason: collision with root package name */
    private static Handler f7600b = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static Handler f7601c = null;
    /* access modifiers changed from: private */
    public static final Runnable l = new Runnable() {
        public void run() {
            TreeWalker.getInstance().h();
        }
    };
    /* access modifiers changed from: private */
    public static final Runnable m = new Runnable() {
        public void run() {
            if (TreeWalker.f7601c != null) {
                TreeWalker.f7601c.post(TreeWalker.l);
                TreeWalker.f7601c.postDelayed(TreeWalker.m, 200);
            }
        }
    };

    /* renamed from: d  reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f7602d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private int f7603e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f7604f = false;

    /* renamed from: g  reason: collision with root package name */
    private final List<com.iab.omid.library.amazon.e.a> f7605g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private b f7606h = new b();
    private a i = new a();
    /* access modifiers changed from: private */
    public b j = new b(new c());
    private long k;

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    TreeWalker() {
    }

    private void a(long j2) {
        if (this.f7602d.size() > 0) {
            for (TreeWalkerTimeLogger next : this.f7602d) {
                next.onTreeProcessed(this.f7603e, TimeUnit.NANOSECONDS.toMillis(j2));
                if (next instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) next).onTreeProcessedNano(this.f7603e, j2);
                }
            }
        }
    }

    private void a(View view, a aVar, JSONObject jSONObject, c cVar, boolean z) {
        aVar.a(view, jSONObject, this, cVar == c.PARENT_VIEW, z);
    }

    private void a(String str, View view, JSONObject jSONObject) {
        a b2 = this.f7606h.b();
        String a2 = this.i.a(str);
        if (a2 != null) {
            JSONObject a3 = b2.a(view);
            com.iab.omid.library.amazon.d.b.a(a3, str);
            com.iab.omid.library.amazon.d.b.b(a3, a2);
            com.iab.omid.library.amazon.d.b.a(jSONObject, a3);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        String a2 = this.i.a(view);
        if (a2 == null) {
            return false;
        }
        com.iab.omid.library.amazon.d.b.a(jSONObject, a2);
        com.iab.omid.library.amazon.d.b.a(jSONObject, Boolean.valueOf(this.i.d(view)));
        this.i.e();
        return true;
    }

    private boolean b(View view, JSONObject jSONObject) {
        a.C0068a b2 = this.i.b(view);
        if (b2 == null) {
            return false;
        }
        com.iab.omid.library.amazon.d.b.a(jSONObject, b2);
        return true;
    }

    public static TreeWalker getInstance() {
        return f7599a;
    }

    /* access modifiers changed from: private */
    public void h() {
        i();
        d();
        j();
    }

    private void i() {
        this.f7603e = 0;
        this.f7605g.clear();
        this.f7604f = false;
        Iterator<com.iab.omid.library.amazon.adsession.a> it = com.iab.omid.library.amazon.b.a.a().c().iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().b()) {
                    this.f7604f = true;
                    break;
                }
            } else {
                break;
            }
        }
        this.k = d.a();
    }

    private void j() {
        a(d.a() - this.k);
    }

    private void k() {
        if (f7601c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f7601c = handler;
            handler.post(l);
            f7601c.postDelayed(m, 200);
        }
    }

    private void l() {
        Handler handler = f7601c;
        if (handler != null) {
            handler.removeCallbacks(m);
            f7601c = null;
        }
    }

    public void a() {
        k();
    }

    public void a(View view, com.iab.omid.library.amazon.c.a aVar, JSONObject jSONObject, boolean z) {
        c c2;
        if (f.d(view) && (c2 = this.i.c(view)) != c.UNDERLYING_VIEW) {
            JSONObject a2 = aVar.a(view);
            com.iab.omid.library.amazon.d.b.a(jSONObject, a2);
            if (!a(view, a2)) {
                boolean z2 = z || b(view, a2);
                if (this.f7604f && c2 == c.OBSTRUCTION_VIEW && !z2) {
                    this.f7605g.add(new com.iab.omid.library.amazon.e.a(view));
                }
                a(view, aVar, a2, c2, z2);
            }
            this.f7603e++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (!this.f7602d.contains(treeWalkerTimeLogger)) {
            this.f7602d.add(treeWalkerTimeLogger);
        }
    }

    public void b() {
        c();
        this.f7602d.clear();
        f7600b.post(new Runnable() {
            public void run() {
                TreeWalker.this.j.a();
            }
        });
    }

    public void c() {
        l();
    }

    /* access modifiers changed from: package-private */
    public void d() {
        this.i.c();
        long a2 = d.a();
        com.iab.omid.library.amazon.c.a a3 = this.f7606h.a();
        if (this.i.b().size() > 0) {
            Iterator<String> it = this.i.b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a4 = a3.a((View) null);
                a(next, this.i.b(next), a4);
                com.iab.omid.library.amazon.d.b.a(a4);
                HashSet hashSet = new HashSet();
                hashSet.add(next);
                this.j.b(a4, hashSet, a2);
            }
        }
        if (this.i.a().size() > 0) {
            JSONObject a5 = a3.a((View) null);
            a((View) null, a3, a5, c.PARENT_VIEW, false);
            com.iab.omid.library.amazon.d.b.a(a5);
            this.j.a(a5, this.i.a(), a2);
            if (this.f7604f) {
                for (com.iab.omid.library.amazon.adsession.a a6 : com.iab.omid.library.amazon.b.a.a().c()) {
                    a6.a(this.f7605g);
                }
            }
        } else {
            this.j.a();
        }
        this.i.d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f7602d.contains(treeWalkerTimeLogger)) {
            this.f7602d.remove(treeWalkerTimeLogger);
        }
    }
}
