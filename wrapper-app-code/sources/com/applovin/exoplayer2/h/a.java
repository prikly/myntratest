package com.applovin.exoplayer2.h;

import android.os.Handler;
import android.os.Looper;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.d.g;
import com.applovin.exoplayer2.h.p;
import com.applovin.exoplayer2.h.q;
import com.applovin.exoplayer2.k.aa;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public abstract class a implements p {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<p.b> f12717a = new ArrayList<>(1);

    /* renamed from: b  reason: collision with root package name */
    private final HashSet<p.b> f12718b = new HashSet<>(1);

    /* renamed from: c  reason: collision with root package name */
    private final q.a f12719c = new q.a();

    /* renamed from: d  reason: collision with root package name */
    private final g.a f12720d = new g.a();

    /* renamed from: e  reason: collision with root package name */
    private Looper f12721e;

    /* renamed from: f  reason: collision with root package name */
    private ba f12722f;

    /* access modifiers changed from: protected */
    public final g.a a(int i, p.a aVar) {
        return this.f12720d.a(i, aVar);
    }

    /* access modifiers changed from: protected */
    public final q.a a(int i, p.a aVar, long j) {
        return this.f12719c.a(i, aVar, j);
    }

    /* access modifiers changed from: protected */
    public final q.a a(p.a aVar) {
        return this.f12719c.a(0, aVar, 0);
    }

    /* access modifiers changed from: protected */
    public void a() {
    }

    public final void a(Handler handler, g gVar) {
        com.applovin.exoplayer2.l.a.b(handler);
        com.applovin.exoplayer2.l.a.b(gVar);
        this.f12720d.a(handler, gVar);
    }

    public final void a(Handler handler, q qVar) {
        com.applovin.exoplayer2.l.a.b(handler);
        com.applovin.exoplayer2.l.a.b(qVar);
        this.f12719c.a(handler, qVar);
    }

    /* access modifiers changed from: protected */
    public final void a(ba baVar) {
        this.f12722f = baVar;
        Iterator<p.b> it = this.f12717a.iterator();
        while (it.hasNext()) {
            it.next().onSourceInfoRefreshed(this, baVar);
        }
    }

    public final void a(g gVar) {
        this.f12720d.a(gVar);
    }

    public final void a(p.b bVar) {
        com.applovin.exoplayer2.l.a.b(this.f12721e);
        boolean isEmpty = this.f12718b.isEmpty();
        this.f12718b.add(bVar);
        if (isEmpty) {
            a();
        }
    }

    public final void a(p.b bVar, aa aaVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f12721e;
        com.applovin.exoplayer2.l.a.a(looper == null || looper == myLooper);
        ba baVar = this.f12722f;
        this.f12717a.add(bVar);
        if (this.f12721e == null) {
            this.f12721e = myLooper;
            this.f12718b.add(bVar);
            a(aaVar);
        } else if (baVar != null) {
            a(bVar);
            bVar.onSourceInfoRefreshed(this, baVar);
        }
    }

    public final void a(q qVar) {
        this.f12719c.a(qVar);
    }

    /* access modifiers changed from: protected */
    public abstract void a(aa aaVar);

    /* access modifiers changed from: protected */
    public final g.a b(p.a aVar) {
        return this.f12720d.a(0, aVar);
    }

    /* access modifiers changed from: protected */
    public void b() {
    }

    public final void b(p.b bVar) {
        boolean z = !this.f12718b.isEmpty();
        this.f12718b.remove(bVar);
        if (z && this.f12718b.isEmpty()) {
            b();
        }
    }

    /* access modifiers changed from: protected */
    public abstract void c();

    public final void c(p.b bVar) {
        this.f12717a.remove(bVar);
        if (this.f12717a.isEmpty()) {
            this.f12721e = null;
            this.f12722f = null;
            this.f12718b.clear();
            c();
            return;
        }
        b(bVar);
    }

    /* access modifiers changed from: protected */
    public final boolean d() {
        return !this.f12718b.isEmpty();
    }

    public /* synthetic */ ba h() {
        return p.CC.$default$h(this);
    }

    public /* synthetic */ boolean i() {
        return p.CC.$default$i(this);
    }
}
