package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.billing.v3.library.c;
import com.yandex.metrica.billing_interface.b;
import com.yandex.metrica.billing_interface.g;
import java.util.concurrent.Executor;

/* renamed from: com.yandex.metrica.impl.ob.d3  reason: case insensitive filesystem */
public final class C0321d3 {
    public final C0491k a(Context context, Executor executor, Executor executor2, b bVar, C0566n nVar, C0541m mVar) {
        C0566n nVar2 = nVar;
        int ordinal = bVar.ordinal();
        if (ordinal == 0) {
            return new c(context, executor, executor2, new C0292c(nVar2), new C0317d(), mVar);
        } else if (ordinal != 1) {
            return new C0396g3();
        } else {
            return new com.yandex.metrica.billing.v4.library.c(context, executor, executor2, nVar, mVar, new C0367f(nVar2), new C0417h((g) null, 1));
        }
    }
}
