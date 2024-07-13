package com.apm.insight.runtime.a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;
import com.apm.insight.l.s;

class a extends c {
    a(Context context, b bVar, d dVar) {
        super(CrashType.ANR, context, bVar, dVar);
    }

    public com.apm.insight.entity.a a(com.apm.insight.entity.a aVar) {
        com.apm.insight.entity.a a2 = super.a(aVar);
        Header a3 = Header.a(this.f10823b);
        Header.a(a3);
        Header.b(a3);
        a3.c();
        a3.d();
        a3.e();
        a2.a(a3);
        a2.a("process_name", (Object) com.apm.insight.l.a.c(this.f10823b));
        s.a(a2, a3, this.f10822a);
        return a2;
    }

    /* access modifiers changed from: protected */
    public boolean a() {
        return true;
    }
}
