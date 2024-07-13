package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.ob.D3;

/* renamed from: com.yandex.metrica.impl.ob.h4  reason: case insensitive filesystem */
class C0422h4 extends C0740u4 {
    C0422h4() {
    }

    public S3 a(Context context, I3 i3, D3.a aVar, C0682ri riVar) {
        return new C3(context, riVar.d(), i3, aVar, new C0347e4(F0.g().u()), new C0874zi());
    }

    public Q3 b(Context context, I3 i3, D3.a aVar, C0682ri riVar) {
        return new C0860z4(context, i3, aVar, riVar.d(), new C0874zi(), CounterConfiguration.b.APPMETRICA);
    }

    public L3 c(Context context, I3 i3, D3.a aVar, C0682ri riVar) {
        return new C3(context, riVar.d(), i3, aVar, new C0347e4(F0.g().u()), new C0874zi());
    }

    public C0860z4 d(Context context, I3 i3, D3.a aVar, C0682ri riVar) {
        return new C0860z4(context, i3, aVar, riVar.d(), new C0874zi(), CounterConfiguration.b.APPMETRICA);
    }
}
