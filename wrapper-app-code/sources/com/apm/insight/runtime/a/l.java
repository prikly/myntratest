package com.apm.insight.runtime.a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;
import com.apm.insight.entity.a;
import com.apm.insight.l.s;
import com.apm.insight.nativecrash.NativeCrashCollector;

class l extends c {
    l(Context context, b bVar, d dVar) {
        super(CrashType.NATIVE, context, bVar, dVar);
    }

    public a a(int i, a aVar) {
        a a2 = super.a(i, aVar);
        if (i == 0) {
            Header a3 = Header.a(this.f10823b);
            a3.c();
            a2.a(a3);
            s.a(a2, a3, this.f10822a);
        } else if (i == 1) {
            Header i2 = a2.i();
            i2.d();
            i2.e();
        } else if (i == 2) {
            Header.a(a2.i());
        }
        return a2;
    }

    /* access modifiers changed from: protected */
    public boolean a() {
        return false;
    }

    public int b() {
        return NativeCrashCollector.a();
    }

    /* access modifiers changed from: protected */
    public boolean d() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void h(a aVar) {
    }
}
