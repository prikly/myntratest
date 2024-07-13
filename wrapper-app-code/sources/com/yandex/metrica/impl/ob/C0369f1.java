package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.f1  reason: case insensitive filesystem */
public class C0369f1 {

    /* renamed from: a  reason: collision with root package name */
    private final C0598o6 f5776a;

    /* renamed from: b  reason: collision with root package name */
    private final J2 f5777b;

    /* renamed from: c  reason: collision with root package name */
    private final C f5778c;

    /* renamed from: d  reason: collision with root package name */
    private final C0783w f5779d;

    /* renamed from: e  reason: collision with root package name */
    private final List<C0519l2> f5780e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0369f1(Context context, ICommonExecutor iCommonExecutor) {
        this(A2.a(21) ? new C0623p6(context) : new C0647q6(), new J2(context, iCommonExecutor), new C(context, iCommonExecutor), new C0783w());
    }

    public synchronized void a(C0519l2 l2Var) {
        this.f5780e.add(l2Var);
    }

    public C b() {
        return this.f5778c;
    }

    public C0598o6 c() {
        return this.f5776a;
    }

    public J2 d() {
        return this.f5777b;
    }

    public synchronized void e() {
        for (C0519l2 a2 : this.f5780e) {
            a2.a();
        }
    }

    public synchronized void f() {
        for (C0519l2 b2 : this.f5780e) {
            b2.b();
        }
    }

    public C0783w a() {
        return this.f5779d;
    }

    C0369f1(C0598o6 o6Var, J2 j2, C c2, C0783w wVar) {
        ArrayList arrayList = new ArrayList();
        this.f5780e = arrayList;
        this.f5776a = o6Var;
        arrayList.add(o6Var);
        this.f5777b = j2;
        arrayList.add(j2);
        this.f5778c = c2;
        arrayList.add(c2);
        this.f5779d = wVar;
        arrayList.add(wVar);
    }
}
