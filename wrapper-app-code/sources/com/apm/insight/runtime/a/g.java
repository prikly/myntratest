package com.apm.insight.runtime.a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;
import com.apm.insight.entity.a;

@Deprecated
class g extends c {
    g(Context context, b bVar, d dVar) {
        super(CrashType.CUSTOM_JAVA, context, bVar, dVar);
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
        return a2;
    }
}
