package com.bytedance.sdk.component.a;

/* compiled from: BaseStatefulMethod */
public abstract class d<P, R> extends b<P, R> {

    /* renamed from: a  reason: collision with root package name */
    private boolean f18212a = true;

    /* renamed from: b  reason: collision with root package name */
    private a f18213b;

    /* renamed from: c  reason: collision with root package name */
    private f f18214c;

    /* compiled from: BaseStatefulMethod */
    interface a {
        void a(Object obj);

        void a(Throwable th);
    }

    /* compiled from: BaseStatefulMethod */
    public interface b {
        d a();
    }

    /* access modifiers changed from: protected */
    public abstract void a(P p, f fVar) throws Exception;

    /* access modifiers changed from: protected */
    public abstract void d();

    public /* bridge */ /* synthetic */ String a() {
        return super.a();
    }

    /* access modifiers changed from: protected */
    public final void a(R r) {
        if (g()) {
            this.f18213b.a((Object) r);
            e();
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Throwable th) {
        if (g()) {
            this.f18213b.a(th);
            e();
        }
    }

    /* access modifiers changed from: protected */
    public final void c() {
        a((Throwable) null);
    }

    /* access modifiers changed from: protected */
    public void e() {
        this.f18212a = false;
        this.f18214c = null;
    }

    /* access modifiers changed from: package-private */
    public void a(P p, f fVar, a aVar) throws Exception {
        this.f18214c = fVar;
        this.f18213b = aVar;
        a(p, fVar);
    }

    /* access modifiers changed from: package-private */
    public void f() {
        d();
        e();
    }

    private boolean g() {
        if (this.f18212a) {
            return true;
        }
        i.a((RuntimeException) new IllegalStateException("Jsb async call already finished: " + a() + ", hashcode: " + hashCode()));
        return false;
    }
}
