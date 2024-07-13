package com.yandex.metrica.impl.ob;

import android.os.Bundle;
import android.os.ResultReceiver;

public class P4 extends M4 {
    public P4(F3 f3) {
        super(f3);
    }

    public boolean a(C0293c0 c0Var, C0571n4 n4Var) {
        Bundle l = c0Var.l();
        a().a(l != null ? (ResultReceiver) l.getParcelable("com.yandex.metrica.impl.referrer.common.ReferrerResultReceiver") : null);
        return false;
    }
}
