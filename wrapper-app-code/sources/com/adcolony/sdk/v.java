package com.adcolony.sdk;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.adcolony.sdk.e0;
import com.adcolony.sdk.n0;
import com.adcolony.sdk.o;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;

class v {

    /* renamed from: f  reason: collision with root package name */
    private static v f10333f;

    /* renamed from: a  reason: collision with root package name */
    private final Executor f10334a = Executors.newSingleThreadExecutor();

    /* renamed from: b  reason: collision with root package name */
    private SQLiteDatabase f10335b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f10336c = false;

    /* renamed from: d  reason: collision with root package name */
    private c f10337d;

    /* renamed from: e  reason: collision with root package name */
    private Set<String> f10338e = new HashSet();

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f1 f10339a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ x f10340b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f10341c;

        a(f1 f1Var, x xVar, Context context) {
            this.f10339a = f1Var;
            this.f10340b = xVar;
            this.f10341c = context;
        }

        public void run() {
            n0 a2 = n0.a(this.f10339a);
            if (a2 != null) {
                v.this.a(a2, (x<n0>) this.f10340b, this.f10341c);
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f10343a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ContentValues f10344b;

        b(String str, ContentValues contentValues) {
            this.f10343a = str;
            this.f10344b = contentValues;
        }

        public void run() {
            v.this.b(this.f10343a, this.f10344b);
        }
    }

    interface c {
        void a();
    }

    v() {
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.f10338e.clear();
    }

    /* access modifiers changed from: private */
    public synchronized void b(String str, ContentValues contentValues) {
        p.a(str, contentValues, this.f10335b);
    }

    public static v a() {
        if (f10333f == null) {
            synchronized (v.class) {
                if (f10333f == null) {
                    f10333f = new v();
                }
            }
        }
        return f10333f;
    }

    /* access modifiers changed from: package-private */
    public void a(c cVar) {
        this.f10337d = cVar;
    }

    /* access modifiers changed from: package-private */
    public void a(f1 f1Var, x<n0> xVar) {
        Context applicationContext = a.c() ? a.a().getApplicationContext() : null;
        if (applicationContext != null && f1Var != null) {
            try {
                this.f10334a.execute(new a(f1Var, xVar, applicationContext));
            } catch (RejectedExecutionException e2) {
                e0.a aVar = new e0.a();
                aVar.a("ADCEventsRepository.open failed with: " + e2.toString()).a(e0.i);
            }
        }
    }

    /* access modifiers changed from: private */
    public synchronized void a(n0 n0Var, x<n0> xVar, Context context) {
        try {
            SQLiteDatabase sQLiteDatabase = this.f10335b;
            boolean z = false;
            if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                this.f10335b = context.openOrCreateDatabase("adc_events_db", 0, (SQLiteDatabase.CursorFactory) null);
            }
            if (this.f10335b.needUpgrade(n0Var.b())) {
                if (a(n0Var) && this.f10337d != null) {
                    z = true;
                }
                this.f10336c = z;
                if (z) {
                    this.f10337d.a();
                }
            } else {
                this.f10336c = true;
            }
            if (this.f10336c) {
                xVar.a(n0Var);
            }
        } catch (SQLiteException e2) {
            new e0.a().a("Database cannot be opened").a(e2.toString()).a(e0.f10044g);
        }
        return;
    }

    private boolean a(n0 n0Var) {
        return new n(this.f10335b, n0Var).b();
    }

    /* access modifiers changed from: package-private */
    public void a(n0.a aVar, ContentValues contentValues) {
        String str;
        if (aVar != null && !this.f10338e.contains(aVar.f())) {
            this.f10338e.add(aVar.f());
            int c2 = aVar.c();
            long j = -1;
            n0.d g2 = aVar.g();
            if (g2 != null) {
                j = contentValues.getAsLong(g2.a()).longValue() - g2.b();
                str = g2.a();
            } else {
                str = null;
            }
            p.a(c2, j, str, aVar.f(), this.f10335b);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(String str, ContentValues contentValues) {
        if (this.f10336c) {
            try {
                this.f10334a.execute(new b(str, contentValues));
            } catch (RejectedExecutionException e2) {
                e0.a aVar = new e0.a();
                aVar.a("ADCEventsRepository.saveEvent failed with: " + e2.toString()).a(e0.i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public o.b a(n0 n0Var, long j) {
        if (this.f10336c) {
            return o.a(n0Var, this.f10335b, this.f10334a, j);
        }
        return null;
    }
}
