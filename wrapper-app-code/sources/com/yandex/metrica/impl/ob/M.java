package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.Map;

public class M {

    /* renamed from: a  reason: collision with root package name */
    private final C0682ri f4518a;

    /* renamed from: b  reason: collision with root package name */
    private final C0819xb f4519b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f4520c;

    public M(C0682ri riVar, C0819xb xbVar, Context context) {
        this.f4518a = riVar;
        this.f4519b = xbVar;
        this.f4520c = context;
    }

    public L a(Map<String, String> map) {
        return new L(this.f4518a.d(), this.f4519b.a(this.f4520c, (Gb) new Fb()), map);
    }
}
