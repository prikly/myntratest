package com.yandex.metrica.impl.ob;

import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.ud  reason: case insensitive filesystem */
public class C0749ud implements C0797wd {

    /* renamed from: a  reason: collision with root package name */
    private final C0797wd f6885a;

    /* renamed from: b  reason: collision with root package name */
    private final C0797wd f6886b;

    /* renamed from: com.yandex.metrica.impl.ob.ud$a */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private C0797wd f6887a;

        /* renamed from: b  reason: collision with root package name */
        private C0797wd f6888b;

        public a(C0797wd wdVar, C0797wd wdVar2) {
            this.f6887a = wdVar;
            this.f6888b = wdVar2;
        }

        public a a(C0635pi piVar) {
            this.f6888b = new Fd(piVar.E());
            return this;
        }

        public a a(boolean z) {
            this.f6887a = new C0821xd(z);
            return this;
        }

        public C0749ud a() {
            return new C0749ud(this.f6887a, this.f6888b);
        }
    }

    C0749ud(C0797wd wdVar, C0797wd wdVar2) {
        this.f6885a = wdVar;
        this.f6886b = wdVar2;
    }

    public static a b() {
        return new a(new C0821xd(false), new Fd((List<Bd>) null));
    }

    public boolean a(String str) {
        return this.f6886b.a(str) && this.f6885a.a(str);
    }

    public String toString() {
        return "AskForPermissionsStrategy{mLocationFlagStrategy=" + this.f6885a + ", mStartupStateStrategy=" + this.f6886b + '}';
    }

    public a a() {
        return new a(this.f6885a, this.f6886b);
    }
}
