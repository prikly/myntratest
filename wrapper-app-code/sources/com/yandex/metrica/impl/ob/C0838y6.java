package com.yandex.metrica.impl.ob;

import com.yandex.metrica.c;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.y6  reason: case insensitive filesystem */
public abstract class C0838y6 implements A6 {

    /* renamed from: a  reason: collision with root package name */
    private final a f7137a;

    /* renamed from: b  reason: collision with root package name */
    private final c f7138b;

    /* renamed from: c  reason: collision with root package name */
    private final A0 f7139c;

    /* renamed from: com.yandex.metrica.impl.ob.y6$a */
    public interface a {
        boolean a(Throwable th);
    }

    C0838y6(a aVar, c cVar, A0 a0) {
        this.f7137a = aVar;
        this.f7138b = cVar;
        this.f7139c = a0;
    }

    /* access modifiers changed from: package-private */
    public abstract void a(H6 h6);

    public void a(Throwable th, C0790w6 w6Var) {
        if (this.f7137a.a(th)) {
            c cVar = this.f7138b;
            if (cVar == null || th == null || (th = cVar.a(th)) != null) {
                a(I6.a(th, w6Var, (List<StackTraceElement>) null, this.f7139c.a(), this.f7139c.b()));
            }
        }
    }
}
