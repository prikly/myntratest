package com.iab.omid.library.appodeal.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.appodeal.c.a;
import com.iab.omid.library.appodeal.c.b;
import com.iab.omid.library.appodeal.d.d;
import com.iab.omid.library.appodeal.d.f;
import com.iab.omid.library.appodeal.walking.a;
import com.iab.omid.library.appodeal.walking.a.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class TreeWalker implements a.C0073a {

    /* renamed from: a  reason: collision with root package name */
    private static TreeWalker f7820a = new TreeWalker();

    /* renamed from: b  reason: collision with root package name */
    private static Handler f7821b = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static Handler f7822c = null;
    /* access modifiers changed from: private */
    public static final Runnable j = new Runnable() {
        public void run() {
            TreeWalker.getInstance().h();
        }
    };
    /* access modifiers changed from: private */
    public static final Runnable k = new Runnable() {
        public void run() {
            if (TreeWalker.f7822c != null) {
                TreeWalker.f7822c.post(TreeWalker.j);
                TreeWalker.f7822c.postDelayed(TreeWalker.k, 200);
            }
        }
    };

    /* renamed from: d  reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f7823d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private int f7824e;

    /* renamed from: f  reason: collision with root package name */
    private b f7825f = new b();

    /* renamed from: g  reason: collision with root package name */
    private a f7826g = new a();
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public b f7827h = new b(new c());
    private long i;

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    TreeWalker() {
    }

    private void a(long j2) {
        if (this.f7823d.size() > 0) {
            for (TreeWalkerTimeLogger next : this.f7823d) {
                next.onTreeProcessed(this.f7824e, TimeUnit.NANOSECONDS.toMillis(j2));
                if (next instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) next).onTreeProcessedNano(this.f7824e, j2);
                }
            }
        }
    }

    private void a(View view, a aVar, JSONObject jSONObject, c cVar) {
        aVar.a(view, jSONObject, this, cVar == c.PARENT_VIEW);
    }

    private void a(String str, View view, JSONObject jSONObject) {
        a b2 = this.f7825f.b();
        String a2 = this.f7826g.a(str);
        if (a2 != null) {
            JSONObject a3 = b2.a(view);
            com.iab.omid.library.appodeal.d.b.a(a3, str);
            com.iab.omid.library.appodeal.d.b.b(a3, a2);
            com.iab.omid.library.appodeal.d.b.a(jSONObject, a3);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        String a2 = this.f7826g.a(view);
        if (a2 == null) {
            return false;
        }
        com.iab.omid.library.appodeal.d.b.a(jSONObject, a2);
        this.f7826g.e();
        return true;
    }

    private void b(View view, JSONObject jSONObject) {
        a.C0074a b2 = this.f7826g.b(view);
        if (b2 != null) {
            com.iab.omid.library.appodeal.d.b.a(jSONObject, b2);
        }
    }

    public static TreeWalker getInstance() {
        return f7820a;
    }

    /* access modifiers changed from: private */
    public void h() {
        i();
        d();
        j();
    }

    private void i() {
        this.f7824e = 0;
        this.i = d.a();
    }

    private void j() {
        a(d.a() - this.i);
    }

    private void k() {
        if (f7822c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f7822c = handler;
            handler.post(j);
            f7822c.postDelayed(k, 200);
        }
    }

    private void l() {
        Handler handler = f7822c;
        if (handler != null) {
            handler.removeCallbacks(k);
            f7822c = null;
        }
    }

    public void a() {
        k();
    }

    public void a(View view, com.iab.omid.library.appodeal.c.a aVar, JSONObject jSONObject) {
        c c2;
        if (f.d(view) && (c2 = this.f7826g.c(view)) != c.UNDERLYING_VIEW) {
            JSONObject a2 = aVar.a(view);
            com.iab.omid.library.appodeal.d.b.a(jSONObject, a2);
            if (!a(view, a2)) {
                b(view, a2);
                a(view, aVar, a2, c2);
            }
            this.f7824e++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (!this.f7823d.contains(treeWalkerTimeLogger)) {
            this.f7823d.add(treeWalkerTimeLogger);
        }
    }

    public void b() {
        c();
        this.f7823d.clear();
        f7821b.post(new Runnable() {
            public void run() {
                TreeWalker.this.f7827h.a();
            }
        });
    }

    public void c() {
        l();
    }

    /* access modifiers changed from: package-private */
    public void d() {
        this.f7826g.c();
        long a2 = d.a();
        com.iab.omid.library.appodeal.c.a a3 = this.f7825f.a();
        if (this.f7826g.b().size() > 0) {
            Iterator<String> it = this.f7826g.b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a4 = a3.a((View) null);
                a(next, this.f7826g.b(next), a4);
                com.iab.omid.library.appodeal.d.b.a(a4);
                HashSet hashSet = new HashSet();
                hashSet.add(next);
                this.f7827h.b(a4, hashSet, a2);
            }
        }
        if (this.f7826g.a().size() > 0) {
            JSONObject a5 = a3.a((View) null);
            a((View) null, a3, a5, c.PARENT_VIEW);
            com.iab.omid.library.appodeal.d.b.a(a5);
            this.f7827h.a(a5, this.f7826g.a(), a2);
        } else {
            this.f7827h.a();
        }
        this.f7826g.d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f7823d.contains(treeWalkerTimeLogger)) {
            this.f7823d.remove(treeWalkerTimeLogger);
        }
    }
}
