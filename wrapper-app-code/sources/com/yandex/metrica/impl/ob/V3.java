package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.ob.D3;
import com.yandex.metrica.impl.ob.Lg;
import com.yandex.metrica.impl.ob.U3;

public class V3 extends M3 {
    private final Pm m;

    public V3(Context context, I3 i3, D3.a aVar, C0778vi viVar, C0635pi piVar, Lg.e eVar, ICommonExecutor iCommonExecutor, int i, Pm pm, C0369f1 f1Var) {
        super(context, i3, aVar, viVar, piVar, eVar, iCommonExecutor, i, f1Var);
        this.m = pm;
    }

    public C0574n7 a(C0450i7 i7Var, C0375f7<String> f7Var, C0302c9 c9Var) {
        return new C0574n7(this.f4525c, new B0(), i7Var, f7Var, F0.g().q().e(), c9Var);
    }

    public C0375f7<String> b(U3 u3) {
        return new C0524l7(u3);
    }

    public C0728tg c(U3 u3) {
        return new C0728tg(new C0533lg(u3), new U3.b(), u3);
    }

    public C0450i7 f() {
        return new C0450i7(new C0300c7(C0400g7.BREAKPAD, (String) null), new C0425h7(new P6()));
    }

    public C0346e3 a(U3 u3) {
        return new C0346e3(this.f4525c, this.m.a(), this.m.i(), C0371f3.a(), new C0296c3(this.f4525c), new C0271b3(u3, F0.g().q().e()), F0.g().b(), new C0321d3());
    }
}
