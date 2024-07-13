package com.apm.insight.runtime.a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;
import com.apm.insight.entity.a;
import com.apm.insight.l.s;

public class e extends c {
    e(Context context, b bVar, d dVar) {
        super(CrashType.BLOCK, context, bVar, dVar);
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
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean d() {
        return false;
    }
}
