package com.yandex.metrica.impl.ob;

import java.util.LinkedList;

public class J4 extends K4<X4> {

    /* renamed from: a  reason: collision with root package name */
    private final C0423h5 f4310a;

    /* renamed from: b  reason: collision with root package name */
    private final K5 f4311b;

    /* renamed from: c  reason: collision with root package name */
    private final C0323d5 f4312c;

    public J4(L3 l3) {
        this.f4310a = new C0423h5(l3);
        this.f4311b = new K5(l3);
        this.f4312c = new C0323d5(l3);
    }

    public H4<X4> a(int i) {
        LinkedList linkedList = new LinkedList();
        int ordinal = C0244a1.a(i).ordinal();
        if (ordinal == 1) {
            linkedList.add(this.f4310a);
        } else if (ordinal == 3) {
            linkedList.add(this.f4312c);
        } else if (ordinal == 40) {
            linkedList.add(this.f4311b);
            linkedList.add(this.f4310a);
        }
        return new H4<>(linkedList);
    }
}
