package com.yandex.metrica.impl.ob;

import android.os.Handler;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.i;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.nj  reason: case insensitive filesystem */
public class C0586nj implements S0 {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f6356a;

    /* renamed from: b  reason: collision with root package name */
    private final ICommonExecutor f6357b;

    /* renamed from: c  reason: collision with root package name */
    private final ICommonExecutor f6358c;

    public C0586nj(ICommonExecutor iCommonExecutor, Handler handler, ICommonExecutor iCommonExecutor2, Q q) {
        this.f6357b = iCommonExecutor;
        this.f6356a = handler;
        this.f6358c = iCommonExecutor2;
    }

    public C0735u a() {
        return new C0735u(this.f6358c);
    }

    public void a(i iVar, O0 o0) {
    }

    public void a(Map<String, Object> map) {
    }

    public ICommonExecutor b() {
        return this.f6357b;
    }

    public Handler c() {
        return this.f6356a;
    }

    public Eb d() {
        return new C0843yb();
    }
}
