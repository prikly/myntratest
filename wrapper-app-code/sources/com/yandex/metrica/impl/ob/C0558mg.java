package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.metrica.impl.ob.mg  reason: case insensitive filesystem */
public final class C0558mg {

    /* renamed from: a  reason: collision with root package name */
    private final Lazy f6273a = LazyKt.lazy(new c(this));

    /* renamed from: b  reason: collision with root package name */
    private final Lazy f6274b = LazyKt.lazy(new b(this));

    /* renamed from: c  reason: collision with root package name */
    private final Lazy f6275c = LazyKt.lazy(new d(this));

    /* renamed from: d  reason: collision with root package name */
    private final List<C0334dg> f6276d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private final C0704sg f6277e;

    /* renamed from: f  reason: collision with root package name */
    private final C0800wg f6278f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final C0409gg f6279g;

    /* renamed from: h  reason: collision with root package name */
    private final C0824xg f6280h;

    /* renamed from: com.yandex.metrica.impl.ob.mg$a */
    private interface a {
        void a();
    }

    /* renamed from: com.yandex.metrica.impl.ob.mg$b */
    static final class b extends Lambda implements Function0<C0583ng> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0558mg f6281a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C0558mg mgVar) {
            super(0);
            this.f6281a = mgVar;
        }

        public Object invoke() {
            return new C0583ng(this);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mg$c */
    static final class c extends Lambda implements Function0<C0608og> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0558mg f6282a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C0558mg mgVar) {
            super(0);
            this.f6282a = mgVar;
        }

        public Object invoke() {
            return new C0608og(this);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mg$d */
    static final class d extends Lambda implements Function0<C0633pg> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0558mg f6283a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C0558mg mgVar) {
            super(0);
            this.f6283a = mgVar;
        }

        public Object invoke() {
            return new C0633pg(this);
        }
    }

    public C0558mg(C0704sg sgVar, C0800wg wgVar, C0409gg ggVar, C0824xg xgVar) {
        this.f6277e = sgVar;
        this.f6278f = wgVar;
        this.f6279g = ggVar;
        this.f6280h = xgVar;
    }

    public static final a b(C0558mg mgVar) {
        return (a) mgVar.f6274b.getValue();
    }

    public static final a c(C0558mg mgVar) {
        return (a) mgVar.f6273a.getValue();
    }

    public static final void a(C0558mg mgVar, C0334dg dgVar, a aVar) {
        mgVar.f6276d.add(dgVar);
        if (mgVar.f6280h.a(dgVar)) {
            mgVar.f6277e.a(dgVar);
        } else {
            aVar.a();
        }
    }

    public final void b() {
        this.f6278f.a((C0776vg) this.f6275c.getValue());
    }

    /* access modifiers changed from: private */
    public final void a() {
        List<C0334dg> list = this.f6276d;
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            if (this.f6280h.b((C0334dg) next)) {
                arrayList.add(next);
            }
        }
        this.f6277e.a(this.f6280h.a((List<C0334dg>) CollectionsKt.filterNotNull(arrayList)));
    }
}
