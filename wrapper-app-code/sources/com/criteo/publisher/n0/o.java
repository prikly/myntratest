package com.criteo.publisher.n0;

import com.criteo.publisher.s;
import com.criteo.publisher.v;

/* compiled from: PreconditionsUtil */
public class o {
    public static void a(Throwable th) {
        s.c().J0().a(o.class).a(v.a(th));
        if (s.c().m0().r()) {
            throw new RuntimeException(th);
        }
    }

    public static boolean a(Object obj) {
        if (obj != null) {
            return true;
        }
        a((Throwable) new NullPointerException("Expected non null value, but null occurs."));
        return false;
    }
}
