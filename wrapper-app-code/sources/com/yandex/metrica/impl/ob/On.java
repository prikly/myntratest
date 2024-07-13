package com.yandex.metrica.impl.ob;

import com.yandex.metrica.Revenue;
import java.util.Arrays;
import java.util.List;

public class On implements Kn<Revenue> {

    /* renamed from: a  reason: collision with root package name */
    private final Kn<List<In>> f4719a = new Jn();

    public In a(Object obj) {
        return this.f4719a.a(Arrays.asList(new In[]{new Nn().a(((Revenue) obj).quantity)}));
    }
}
