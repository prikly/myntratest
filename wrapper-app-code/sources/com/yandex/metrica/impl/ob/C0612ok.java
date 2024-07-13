package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C0685rl;
import java.util.regex.Pattern;

/* renamed from: com.yandex.metrica.impl.ob.ok  reason: case insensitive filesystem */
public class C0612ok implements Cl {

    /* renamed from: a  reason: collision with root package name */
    private final Pattern f6415a;

    C0612ok(Pattern pattern) {
        this.f6415a = pattern;
    }

    public boolean a(Object obj) {
        return !this.f6415a.matcher((String) obj).matches();
    }

    public C0685rl.b a() {
        return C0685rl.b.REGEXP_NOT_MATCHED;
    }
}
