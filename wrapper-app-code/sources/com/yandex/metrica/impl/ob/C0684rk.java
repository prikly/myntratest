package com.yandex.metrica.impl.ob;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: com.yandex.metrica.impl.ob.rk  reason: case insensitive filesystem */
public class C0684rk {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Float, Integer> f6732a = new HashMap();

    public C0684rk(TreeSet<Float> treeSet) {
        int i = 0;
        for (Float put : treeSet.descendingSet()) {
            this.f6732a.put(put, Integer.valueOf(i));
            i++;
        }
    }

    public void a(C0289bl blVar) {
        blVar.s = this.f6732a.get(blVar.m);
    }
}
