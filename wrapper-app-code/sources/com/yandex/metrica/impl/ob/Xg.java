package com.yandex.metrica.impl.ob;

import com.yandex.metrica.rtm.wrapper.e;

public class Xg implements A6 {

    /* renamed from: a  reason: collision with root package name */
    private final e f5341a;

    public Xg(e eVar) {
        this.f5341a = eVar;
    }

    public void a(Throwable th, C0790w6 w6Var) {
        String str;
        e eVar = this.f5341a;
        if (th == null) {
            str = "";
        } else {
            str = th.getClass().getName();
        }
        eVar.reportException(str, th);
    }
}
