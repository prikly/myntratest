package com.criteo.publisher.l0.d;

import android.content.Context;
import android.preference.PreferenceManager;
import com.criteo.publisher.n0.q;

/* compiled from: GdprDataFetcher */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final h f2613a;

    public d(Context context) {
        this(new h(new q(PreferenceManager.getDefaultSharedPreferences(context))));
    }

    d(h hVar) {
        this.f2613a = hVar;
    }

    public c a() {
        g a2 = this.f2613a.a();
        Boolean bool = null;
        if (a2 == null) {
            return null;
        }
        String b2 = a2.b();
        String c2 = a2.c();
        if (!b2.isEmpty()) {
            bool = Boolean.valueOf("1".equals(b2));
        }
        return c.a(c2, bool, a2.a());
    }
}
