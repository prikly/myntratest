package com.yandex.metrica.impl.ob;

import com.yandex.metrica.billing_interface.d;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.b3  reason: case insensitive filesystem */
public class C0271b3 implements C0541m {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final S3 f5501a;

    /* renamed from: b  reason: collision with root package name */
    private final ICommonExecutor f5502b;

    /* renamed from: com.yandex.metrica.impl.ob.b3$a */
    class a extends C0365em {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f5503a;

        a(d dVar) {
            this.f5503a = dVar;
        }

        public void a() throws Exception {
            S3 a2 = C0271b3.this.f5501a;
            C0271b3 b3Var = C0271b3.this;
            d dVar = this.f5503a;
            b3Var.getClass();
            a2.a(C0293c0.a().a(new C0421h3(dVar).a()));
        }
    }

    public C0271b3(S3 s3, ICommonExecutor iCommonExecutor) {
        this.f5501a = s3;
        this.f5502b = iCommonExecutor;
    }

    public void a(List<d> list) {
        for (d aVar : list) {
            this.f5502b.execute(new a(aVar));
        }
    }
}
