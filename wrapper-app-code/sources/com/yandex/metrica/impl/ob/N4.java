package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.F3;
import com.yandex.metrica.impl.ob.F4;
import com.yandex.metrica.impl.ob.M4;

public class N4<T extends M4, C extends F3> extends F4<T, C> {

    class a implements F4.a<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0571n4 f4584a;

        a(N4 n4, C0571n4 n4Var) {
            this.f4584a = n4Var;
        }

        public boolean a(Object obj, C0293c0 c0Var) {
            return ((M4) obj).a(c0Var, this.f4584a);
        }
    }

    public N4(K4<T> k4, C c2) {
        super(k4, c2);
    }

    public boolean a(C0293c0 c0Var, C0571n4 n4Var) {
        return a(c0Var, new a(this, n4Var));
    }
}
