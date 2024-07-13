package com.apm.insight.runtime.a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;
import com.apm.insight.entity.a;
import com.apm.insight.l.s;

class h extends c {
    h(Context context, b bVar, d dVar) {
        super(CrashType.DART, context, bVar, dVar);
    }

    public a a(a aVar) {
        a a2 = super.a(aVar);
        Header a3 = Header.a(this.f10823b);
        Header.a(a3);
        Header.b(a3);
        a3.c();
        a3.d();
        a3.e();
        a2.a(a3);
        s.a(a2, a3, this.f10822a);
        return a2;
    }
}
