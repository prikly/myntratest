package com.criteo.publisher.f0;

import com.criteo.publisher.f0.r;
import com.criteo.publisher.logging.g;
import com.criteo.publisher.logging.h;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.jvm.functions.Function0;

/* compiled from: FileMetricRepository */
class m extends r {

    /* renamed from: a  reason: collision with root package name */
    private final g f2484a = h.b(getClass());
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final o f2485b;

    /* renamed from: c  reason: collision with root package name */
    private final ConcurrentMap<File, d0> f2486c = new ConcurrentHashMap();

    m(o oVar) {
        this.f2485b = oVar;
    }

    /* access modifiers changed from: package-private */
    public void a(String str, r.a aVar) {
        try {
            a(this.f2485b.a(str)).a(aVar);
        } catch (IOException e2) {
            this.f2484a.a("Error while updating metric", (Throwable) e2);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(String str, p pVar) {
        try {
            a(this.f2485b.a(str)).a(pVar);
        } catch (IOException e2) {
            this.f2484a.a("Error while moving metric", (Throwable) e2);
        }
    }

    /* access modifiers changed from: package-private */
    public Collection<n> a() {
        Collection<File> b2 = this.f2485b.b();
        ArrayList arrayList = new ArrayList(b2.size());
        for (File a2 : b2) {
            try {
                arrayList.add(a(a2).b());
            } catch (IOException e2) {
                this.f2484a.a("Error while reading metric", (Throwable) e2);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public int b() {
        int i = 0;
        for (File length : this.f2485b.b()) {
            i = (int) (((long) i) + length.length());
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public boolean a(String str) {
        return this.f2485b.b().contains(this.f2485b.a(str));
    }

    /* compiled from: FileMetricRepository */
    class a implements Function0<d0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ File f2487a;

        a(File file) {
            this.f2487a = file;
        }

        /* renamed from: a */
        public d0 invoke() {
            return m.this.f2485b.a(this.f2487a);
        }
    }

    private d0 a(File file) {
        return (d0) com.criteo.publisher.n0.m.a(this.f2486c, file, new a(file));
    }
}
