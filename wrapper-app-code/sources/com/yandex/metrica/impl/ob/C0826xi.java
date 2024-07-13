package com.yandex.metrica.impl.ob;

import com.yandex.metrica.networktasks.api.NetworkServiceLocator;
import com.yandex.metrica.networktasks.api.NetworkTask;

/* renamed from: com.yandex.metrica.impl.ob.xi  reason: case insensitive filesystem */
public class C0826xi implements C0850yi {

    /* renamed from: a  reason: collision with root package name */
    private final C0682ri f7124a;

    public C0826xi(C0682ri riVar) {
        this.f7124a = riVar;
    }

    public void a() {
        NetworkTask c2 = this.f7124a.c();
        if (c2 != null) {
            NetworkServiceLocator.getInstance().getNetworkCore().startTask(c2);
        }
    }
}
