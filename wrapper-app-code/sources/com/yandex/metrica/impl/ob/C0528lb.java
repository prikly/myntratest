package com.yandex.metrica.impl.ob;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.yandex.metrica.impl.ob.lb  reason: case insensitive filesystem */
public class C0528lb implements C0553mb, C0578nb {

    /* renamed from: a  reason: collision with root package name */
    private final Set<Integer> f6140a;

    /* renamed from: b  reason: collision with root package name */
    private AtomicLong f6141b;

    public C0528lb(L7 l7) {
        HashSet hashSet = new HashSet();
        this.f6140a = hashSet;
        hashSet.add(Integer.valueOf(C0244a1.EVENT_TYPE_FIRST_ACTIVATION.b()));
        hashSet.add(Integer.valueOf(C0244a1.EVENT_TYPE_APP_UPDATE.b()));
        hashSet.add(Integer.valueOf(C0244a1.EVENT_TYPE_INIT.b()));
        hashSet.add(Integer.valueOf(C0244a1.EVENT_TYPE_IDENTITY.b()));
        hashSet.add(Integer.valueOf(C0244a1.EVENT_TYPE_SEND_REFERRER.b()));
        l7.a((C0578nb) this);
        this.f6141b = new AtomicLong(l7.a((Set<Integer>) hashSet));
    }

    public boolean a() {
        return this.f6141b.get() > 0;
    }

    public void b(List<Integer> list) {
        int i = 0;
        for (Integer intValue : list) {
            if (this.f6140a.contains(Integer.valueOf(intValue.intValue()))) {
                i++;
            }
        }
        this.f6141b.addAndGet((long) (-i));
    }

    public void a(List<Integer> list) {
        int i = 0;
        for (Integer intValue : list) {
            if (this.f6140a.contains(Integer.valueOf(intValue.intValue()))) {
                i++;
            }
        }
        this.f6141b.addAndGet((long) i);
    }
}
