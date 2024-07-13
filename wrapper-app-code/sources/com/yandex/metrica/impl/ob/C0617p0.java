package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C0860z4;
import com.yandex.metrica.networktasks.api.ConfigProvider;
import com.yandex.metrica.networktasks.api.NetworkServiceLocator;

/* renamed from: com.yandex.metrica.impl.ob.p0  reason: case insensitive filesystem */
public class C0617p0<C extends C0860z4> extends C0786w2<C> {

    /* renamed from: e  reason: collision with root package name */
    private final E4 f6421e;

    /* renamed from: f  reason: collision with root package name */
    private final C0276b8 f6422f;

    public C0617p0(C c2, C0850yi yiVar, E4 e4, C0276b8 b8Var) {
        super(c2, yiVar);
        this.f6421e = e4;
        this.f6422f = b8Var;
    }

    public void a(C0293c0 c0Var) {
        if (!this.f7018c) {
            synchronized (this.f7017b) {
                if (!this.f7018c) {
                    f();
                }
            }
            NetworkServiceLocator.getInstance().getNetworkCore().startTask(C0677rd.a(((C0860z4) e()).b(), (ConfigProvider) e(), c0Var, this.f6421e, this.f6422f));
        }
    }
}
