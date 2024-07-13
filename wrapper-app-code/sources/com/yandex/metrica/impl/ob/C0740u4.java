package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.ob.D3;

/* renamed from: com.yandex.metrica.impl.ob.u4  reason: case insensitive filesystem */
public class C0740u4 implements C0521l4, C0596o4<L3> {
    /* renamed from: c */
    public L3 a(Context context, I3 i3, D3.a aVar, C0682ri riVar) {
        return new C0322d4(context, i3, aVar, F0.g().u(), riVar.d(), (C0778vi) new C0802wi(riVar));
    }

    /* renamed from: d */
    public C0860z4 b(Context context, I3 i3, D3.a aVar, C0682ri riVar) {
        return new C0860z4(context, i3, aVar, riVar.d(), new C0802wi(riVar), CounterConfiguration.b.MANUAL);
    }

    public C0496k4 a(Context context, C0621p4 p4Var, C0447i4 i4Var, D3 d3) {
        return new C0716t4(context, p4Var.b(new I3(i4Var.b(), i4Var.a()), d3, new Y3(this)));
    }
}
