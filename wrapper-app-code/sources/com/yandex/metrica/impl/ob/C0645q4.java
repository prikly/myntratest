package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.ob.D3;

/* renamed from: com.yandex.metrica.impl.ob.q4  reason: case insensitive filesystem */
class C0645q4 implements C0521l4, C0596o4<U3> {
    C0645q4() {
    }

    public C0496k4 a(Context context, C0621p4 p4Var, C0447i4 i4Var, D3 d3) {
        return new C0668r4(context, p4Var.b(new W3(i4Var.b(), i4Var.a()), d3, new Y3(this)));
    }

    public Q3 b(Context context, I3 i3, D3.a aVar, C0682ri riVar) {
        return new C0860z4(context, i3, aVar, riVar.d(), new C0802wi(riVar), CounterConfiguration.b.MAIN);
    }

    public S3 a(Context context, I3 i3, D3.a aVar, C0682ri riVar) {
        return new U3(context, riVar.d(), i3, aVar, F0.g().m(), F0.g().u(), new C0802wi(riVar));
    }
}
