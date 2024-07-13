package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.F4;
import com.yandex.metrica.impl.ob.L3;
import com.yandex.metrica.impl.ob.S4;

public class L4<T extends S4, C extends L3> extends F4<T, C> {

    class a implements F4.a<T> {
        a(L4 l4) {
        }

        public boolean a(Object obj, C0293c0 c0Var) {
            return ((S4) obj).a(c0Var);
        }
    }

    public L4(K4<T> k4, C c2) {
        super(k4, c2);
    }

    public boolean a(C0293c0 c0Var) {
        return a(c0Var, new a(this));
    }
}
