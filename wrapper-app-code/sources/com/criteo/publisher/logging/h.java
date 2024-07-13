package com.criteo.publisher.logging;

import com.criteo.publisher.g0.a;
import com.criteo.publisher.s;
import java.util.List;

/* compiled from: LoggerFactory */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private final List<a<d>> f2641a;

    public h(List<a<d>> list) {
        this.f2641a = list;
    }

    public static g b(Class<?> cls) {
        return s.c().J0().a(cls);
    }

    public g a(Class<?> cls) {
        return new g(cls, this.f2641a);
    }
}
