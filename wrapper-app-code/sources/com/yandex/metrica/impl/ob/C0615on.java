package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.on  reason: case insensitive filesystem */
public class C0615on extends tn<C0755uj> {

    /* renamed from: com.yandex.metrica.impl.ob.on$a */
    public static class a implements un<C0755uj> {
        public tn a(Object obj) {
            return new C0615on((C0755uj) obj);
        }
    }

    public C0615on(C0755uj ujVar) {
        super(ujVar);
    }

    public boolean a(tn<C0755uj> tnVar) {
        T t = (C0755uj) tnVar.f6859a;
        T t2 = this.f6859a;
        if (t2 == t) {
            return true;
        }
        if (((C0755uj) t2).c() != t.c()) {
            return false;
        }
        if (((C0755uj) this.f6859a).k() == null ? t.k() != null : !((C0755uj) this.f6859a).k().equals(t.k())) {
            return false;
        }
        if (((C0755uj) this.f6859a).l() == null ? t.l() != null : !((C0755uj) this.f6859a).l().equals(t.l())) {
            return false;
        }
        if (((C0755uj) this.f6859a).e() == null ? t.e() != null : !((C0755uj) this.f6859a).e().equals(t.e())) {
            return false;
        }
        if (((C0755uj) this.f6859a).b() == null ? t.b() != null : !((C0755uj) this.f6859a).b().equals(t.b())) {
            return false;
        }
        if (((C0755uj) this.f6859a).m() == null ? t.m() != null : !((C0755uj) this.f6859a).m().equals(t.m())) {
            return false;
        }
        if (((C0755uj) this.f6859a).o() != null) {
            return ((C0755uj) this.f6859a).o().equals(t.o());
        }
        if (t.o() == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((((((((((((C0755uj) this.f6859a).k() != null ? ((C0755uj) this.f6859a).k().hashCode() : 0) * 31) + (((C0755uj) this.f6859a).l() != null ? ((C0755uj) this.f6859a).l().hashCode() : 0)) * 31) + (((C0755uj) this.f6859a).e() != null ? ((C0755uj) this.f6859a).e().hashCode() : 0)) * 31) + (((C0755uj) this.f6859a).b() != null ? ((C0755uj) this.f6859a).b().hashCode() : 0)) * 31) + (((C0755uj) this.f6859a).m() != null ? ((C0755uj) this.f6859a).m().hashCode() : 0)) * 31) + ((C0755uj) this.f6859a).c()) * 31;
        if (((C0755uj) this.f6859a).o() != null) {
            i = ((C0755uj) this.f6859a).o().hashCode();
        }
        return hashCode + i;
    }
}
