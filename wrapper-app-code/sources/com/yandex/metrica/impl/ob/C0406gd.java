package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.Eg;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.gd  reason: case insensitive filesystem */
public class C0406gd extends Eg {
    private final C0554mc m;

    /* renamed from: com.yandex.metrica.impl.ob.gd$b */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final C0635pi f5855a;

        /* renamed from: b  reason: collision with root package name */
        public final C0554mc f5856b;

        public b(C0635pi piVar, C0554mc mcVar) {
            this.f5855a = piVar;
            this.f5856b = mcVar;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.gd$c */
    public static class c implements Eg.d<C0406gd, b> {

        /* renamed from: a  reason: collision with root package name */
        private final Context f5857a;

        /* renamed from: b  reason: collision with root package name */
        private final Cg f5858b;

        c(Context context, Cg cg) {
            this.f5857a = context;
            this.f5858b = cg;
        }

        public C0406gd a(b bVar) {
            C0406gd gdVar = new C0406gd(bVar.f5856b);
            Cg cg = this.f5858b;
            Context context = this.f5857a;
            cg.getClass();
            gdVar.b(A2.a(context, context.getPackageName()));
            Cg cg2 = this.f5858b;
            Context context2 = this.f5857a;
            cg2.getClass();
            gdVar.a(String.valueOf(A2.b(context2, context2.getPackageName())));
            gdVar.a(bVar.f5855a);
            gdVar.a(U.a());
            gdVar.a(F0.g().n().a());
            gdVar.e(this.f5857a.getPackageName());
            gdVar.a(F0.g().r().a(this.f5857a));
            gdVar.a(F0.g().a().a());
            return gdVar;
        }
    }

    public List<String> A() {
        return v().x();
    }

    public String toString() {
        return "RequestConfig{mSuitableCollectionConfig=" + this.m + "} " + super.toString();
    }

    public C0554mc z() {
        return this.m;
    }

    private C0406gd(C0554mc mcVar) {
        this.m = mcVar;
    }
}
