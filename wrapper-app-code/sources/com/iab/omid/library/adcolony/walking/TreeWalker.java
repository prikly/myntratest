package com.iab.omid.library.adcolony.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.adcolony.c.a;
import com.iab.omid.library.adcolony.c.b;
import com.iab.omid.library.adcolony.d.d;
import com.iab.omid.library.adcolony.d.f;
import com.iab.omid.library.adcolony.walking.a;
import com.iab.omid.library.adcolony.walking.a.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class TreeWalker implements a.C0064a {

    /* renamed from: a  reason: collision with root package name */
    private static TreeWalker f7492a = new TreeWalker();

    /* renamed from: b  reason: collision with root package name */
    private static Handler f7493b = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static Handler f7494c = null;
    /* access modifiers changed from: private */
    public static final Runnable l = new Runnable() {
        public void run() {
            TreeWalker.getInstance().h();
        }
    };
    /* access modifiers changed from: private */
    public static final Runnable m = new Runnable() {
        public void run() {
            if (TreeWalker.f7494c != null) {
                TreeWalker.f7494c.post(TreeWalker.l);
                TreeWalker.f7494c.postDelayed(TreeWalker.m, 200);
            }
        }
    };

    /* renamed from: d  reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f7495d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private int f7496e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f7497f = false;

    /* renamed from: g  reason: collision with root package name */
    private final List<com.iab.omid.library.adcolony.e.a> f7498g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private b f7499h = new b();
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
        if (this.f7495d.size() > 0) {
            for (TreeWalkerTimeLogger next : this.f7495d) {
                next.onTreeProcessed(this.f7496e, TimeUnit.NANOSECONDS.toMillis(j2));
                if (next instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) next).onTreeProcessedNano(this.f7496e, j2);
                }
            }
        }
    }

    private void a(View view, a aVar, JSONObject jSONObject, c cVar, boolean z) {
        aVar.a(view, jSONObject, this, cVar == c.PARENT_VIEW, z);
    }

    private void a(String str, View view, JSONObject jSONObject) {
        a b2 = this.f7499h.b();
        String a2 = this.i.a(str);
        if (a2 != null) {
            JSONObject a3 = b2.a(view);
            com.iab.omid.library.adcolony.d.b.a(a3, str);
            com.iab.omid.library.adcolony.d.b.b(a3, a2);
            com.iab.omid.library.adcolony.d.b.a(jSONObject, a3);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        String a2 = this.i.a(view);
        if (a2 == null) {
            return false;
        }
        com.iab.omid.library.adcolony.d.b.a(jSONObject, a2);
        com.iab.omid.library.adcolony.d.b.a(jSONObject, Boolean.valueOf(this.i.d(view)));
        this.i.e();
        return true;
    }

    private boolean b(View view, JSONObject jSONObject) {
        a.C0065a b2 = this.i.b(view);
        if (b2 == null) {
            return false;
        }
        com.iab.omid.library.adcolony.d.b.a(jSONObject, b2);
        return true;
    }

    public static TreeWalker getInstance() {
        return f7492a;
    }

    /* access modifiers changed from: private */
    public void h() {
        i();
        d();
        j();
    }

    private void i() {
        this.f7496e = 0;
        this.f7498g.clear();
        this.f7497f = false;
        Iterator<com.iab.omid.library.adcolony.adsession.a> it = com.iab.omid.library.adcolony.b.a.a().c().iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().b()) {
                    this.f7497f = true;
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
        if (f7494c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f7494c = handler;
            handler.post(l);
            f7494c.postDelayed(m, 200);
        }
    }

    private void l() {
        Handler handler = f7494c;
        if (handler != null) {
            handler.removeCallbacks(m);
            f7494c = null;
        }
    }

    public void a() {
        k();
    }

    public void a(View view, com.iab.omid.library.adcolony.c.a aVar, JSONObject jSONObject, boolean z) {
        c c2;
        if (f.d(view) && (c2 = this.i.c(view)) != c.UNDERLYING_VIEW) {
            JSONObject a2 = aVar.a(view);
            com.iab.omid.library.adcolony.d.b.a(jSONObject, a2);
            if (!a(view, a2)) {
                boolean z2 = z || b(view, a2);
                if (this.f7497f && c2 == c.OBSTRUCTION_VIEW && !z2) {
                    this.f7498g.add(new com.iab.omid.library.adcolony.e.a(view));
                }
                a(view, aVar, a2, c2, z2);
            }
            this.f7496e++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (!this.f7495d.contains(treeWalkerTimeLogger)) {
            this.f7495d.add(treeWalkerTimeLogger);
        }
    }

    public void b() {
        c();
        this.f7495d.clear();
        f7493b.post(new Runnable() {
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
        com.iab.omid.library.adcolony.c.a a3 = this.f7499h.a();
        if (this.i.b().size() > 0) {
            Iterator<String> it = this.i.b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a4 = a3.a((View) null);
                a(next, this.i.b(next), a4);
                com.iab.omid.library.adcolony.d.b.a(a4);
                HashSet hashSet = new HashSet();
                hashSet.add(next);
                this.j.b(a4, hashSet, a2);
            }
        }
        if (this.i.a().size() > 0) {
            JSONObject a5 = a3.a((View) null);
            a((View) null, a3, a5, c.PARENT_VIEW, false);
            com.iab.omid.library.adcolony.d.b.a(a5);
            this.j.a(a5, this.i.a(), a2);
            if (this.f7497f) {
                for (com.iab.omid.library.adcolony.adsession.a a6 : com.iab.omid.library.adcolony.b.a.a().c()) {
                    a6.a(this.f7498g);
                }
            }
        } else {
            this.j.a();
        }
        this.i.d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f7495d.contains(treeWalkerTimeLogger)) {
            this.f7495d.remove(treeWalkerTimeLogger);
        }
    }
}
