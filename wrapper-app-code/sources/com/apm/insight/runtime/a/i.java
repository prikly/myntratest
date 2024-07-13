package com.apm.insight.runtime.a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;
import com.apm.insight.entity.a;
import com.apm.insight.l.s;

public class i extends c {
    i(Context context, b bVar, d dVar) {
        super(CrashType.ENSURE, context, bVar, dVar);
    }

    public a a(a aVar) {
        a a2 = super.a(aVar);
        g(a2);
        s.a(a2, (Header) null, this.f10822a);
        return a2;
    }

    /* access modifiers changed from: protected */
    public boolean a() {
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean c() {
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean d() {
        return false;
    }
}
