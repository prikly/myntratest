package com.yandex.metrica.impl.ob;

import java.util.Comparator;

public class pn implements Comparator<C0755uj> {
    public int compare(Object obj, Object obj2) {
        C0755uj ujVar = (C0755uj) obj;
        C0755uj ujVar2 = (C0755uj) obj2;
        if (ujVar == ujVar2) {
            return 0;
        }
        boolean z = true;
        boolean z2 = ujVar == null;
        if (ujVar2 != null) {
            z = false;
        }
        if (!(z ^ z2) && ujVar.q() == ujVar2.q() && ujVar.c() == ujVar2.c() && (ujVar.k() == null ? ujVar2.k() == null : ujVar.k().equals(ujVar2.k())) && (ujVar.l() == null ? ujVar2.l() == null : ujVar.l().equals(ujVar2.l())) && (ujVar.e() == null ? ujVar2.e() == null : ujVar.e().equals(ujVar2.e())) && (ujVar.b() == null ? ujVar2.b() == null : ujVar.b().equals(ujVar2.b())) && (ujVar.n() == null ? ujVar2.n() == null : ujVar.n().equals(ujVar2.n())) && (ujVar.m() == null ? ujVar2.m() == null : ujVar.m().equals(ujVar2.m()))) {
            if (ujVar.o() != null) {
                if (ujVar.o().equals(ujVar2.o())) {
                    return 0;
                }
            } else if (ujVar2.o() == null) {
                return 0;
            }
        }
        return 10;
    }
}
