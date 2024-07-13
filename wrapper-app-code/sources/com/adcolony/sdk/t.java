package com.adcolony.sdk;

import com.adcolony.sdk.e0;
import com.adcolony.sdk.s;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class t implements s.a {

    /* renamed from: a  reason: collision with root package name */
    private LinkedBlockingQueue<Runnable> f10286a = new LinkedBlockingQueue<>();

    /* renamed from: b  reason: collision with root package name */
    private int f10287b = 4;

    /* renamed from: c  reason: collision with root package name */
    private int f10288c = 16;

    /* renamed from: d  reason: collision with root package name */
    private double f10289d = 1.0d;

    /* renamed from: e  reason: collision with root package name */
    private ThreadPoolExecutor f10290e = new ThreadPoolExecutor(this.f10287b, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, this.f10286a);

    class a implements j0 {
        a() {
        }

        public void a(h0 h0Var) {
            t tVar = t.this;
            tVar.a(new s(h0Var, tVar));
        }
    }

    class b implements j0 {
        b() {
        }

        public void a(h0 h0Var) {
            t tVar = t.this;
            tVar.a(new s(h0Var, tVar));
        }
    }

    class c implements j0 {
        c() {
        }

        public void a(h0 h0Var) {
            t tVar = t.this;
            tVar.a(new s(h0Var, tVar));
        }
    }

    t() {
    }

    private void b() {
        int corePoolSize = this.f10290e.getCorePoolSize();
        int size = this.f10286a.size();
        int i = this.f10287b;
        if (((double) size) * this.f10289d > ((double) ((corePoolSize - i) + 1)) && corePoolSize < this.f10288c) {
            this.f10290e.setCorePoolSize(corePoolSize + 1);
        } else if (size == 0 && corePoolSize > i) {
            this.f10290e.setCorePoolSize(i);
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.f10290e.allowCoreThreadTimeOut(true);
        a.a("WebServices.download", (j0) new a());
        a.a("WebServices.get", (j0) new b());
        a.a("WebServices.post", (j0) new c());
    }

    /* access modifiers changed from: package-private */
    public void c(int i) {
        this.f10290e.setKeepAliveTime((long) i, TimeUnit.SECONDS);
    }

    /* access modifiers changed from: package-private */
    public void b(int i) {
        this.f10288c = i;
        int corePoolSize = this.f10290e.getCorePoolSize();
        int i2 = this.f10288c;
        if (corePoolSize > i2) {
            this.f10290e.setCorePoolSize(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(s sVar) {
        b();
        try {
            this.f10290e.execute(sVar);
        } catch (RejectedExecutionException unused) {
            e0.a a2 = new e0.a().a("RejectedExecutionException: ThreadPoolExecutor unable to ");
            a2.a("execute download for url " + sVar.l).a(e0.i);
            a(sVar, sVar.b(), (Map<String, List<String>>) null);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i) {
        this.f10287b = i;
        int corePoolSize = this.f10290e.getCorePoolSize();
        int i2 = this.f10287b;
        if (corePoolSize < i2) {
            this.f10290e.setCorePoolSize(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(double d2) {
        this.f10289d = d2;
    }

    public void a(s sVar, h0 h0Var, Map<String, List<String>> map) {
        f1 b2 = c0.b();
        c0.a(b2, "url", sVar.l);
        c0.b(b2, "success", sVar.n);
        c0.b(b2, "status", sVar.p);
        c0.a(b2, "body", sVar.m);
        c0.b(b2, "size", sVar.o);
        if (map != null) {
            f1 b3 = c0.b();
            for (Map.Entry next : map.entrySet()) {
                String obj = ((List) next.getValue()).toString();
                String substring = obj.substring(1, obj.length() - 1);
                if (next.getKey() != null) {
                    c0.a(b3, (String) next.getKey(), substring);
                }
            }
            c0.a(b2, "headers", b3);
        }
        h0Var.a(b2).c();
    }
}
