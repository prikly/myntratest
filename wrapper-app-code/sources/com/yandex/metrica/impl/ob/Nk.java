package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C0685rl;
import java.util.regex.Pattern;

public class Nk implements Cl {

    /* renamed from: a  reason: collision with root package name */
    private final Pattern f4623a;

    Nk(Pattern pattern) {
        this.f4623a = pattern;
    }

    public boolean a(Object obj) {
        return this.f4623a.matcher((String) obj).matches();
    }

    public C0685rl.b a() {
        return C0685rl.b.BAD_REGEXP_MATCHED;
    }
}
