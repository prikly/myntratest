package com.yandex.metrica.impl.ob;

class An extends tn<F2> {
    An(Bn bn, F2 f2) {
        super(f2);
    }

    /* access modifiers changed from: protected */
    public boolean a(tn<F2> tnVar) {
        F2 f2 = (F2) this.f6859a;
        if (f2.f3984a == null ? ((F2) tnVar.f6859a).f3984a != null : !f2.f3984a.equals(((F2) tnVar.f6859a).f3984a)) {
            return false;
        }
        F2 f22 = (F2) this.f6859a;
        if (f22.f3985b != null) {
            return f22.f3985b.equals(((F2) tnVar.f6859a).f3985b);
        }
        if (((F2) tnVar.f6859a).f3985b == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        F2 f2 = (F2) this.f6859a;
        int i = 0;
        int hashCode = (f2.f3984a != null ? f2.f3984a.hashCode() : 0) * 31;
        F2 f22 = (F2) this.f6859a;
        if (f22.f3985b != null) {
            i = f22.f3985b.hashCode();
        }
        return hashCode + i;
    }
}
