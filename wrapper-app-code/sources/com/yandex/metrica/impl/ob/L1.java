package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.ob.C0767v7;
import com.yandex.metrica.impl.ob.D3;
import com.yandex.metrica.impl.ob.J;
import com.yandex.metrica.impl.ob.Mg;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class L1 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4454a;

    /* renamed from: b  reason: collision with root package name */
    private final ICommonExecutor f4455b;

    /* renamed from: c  reason: collision with root package name */
    private final C0471j4 f4456c;

    /* renamed from: d  reason: collision with root package name */
    private final B0 f4457d;

    class a implements C0564mm<Z6> {
        a() {
        }

        public void b(Object obj) {
            Z6 z6 = (Z6) obj;
            L1 l1 = L1.this;
            C0447i4 i4Var = new C0447i4(z6.a(), z6.f(), z6.g(), z6.h(), z6.i());
            String e2 = z6.e();
            byte[] c2 = z6.c();
            int b2 = z6.b();
            HashMap<J.a, Integer> j = z6.j();
            String d2 = z6.d();
            C0315cm b3 = Ul.b(z6.a());
            List<Integer> list = C0856z0.i;
            J a2 = new J(c2, e2, C0244a1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE.b(), b3).a(j);
            a2.f5581h = b2;
            l1.a(i4Var, a2.c(d2), new D3(new Mg.b((String) null, (String) null, (String) null, (String) null, (String) null, (Map<String, String>) null, false, (List<String>) null), new D3.a(), (ResultReceiver) null));
        }
    }

    protected class b implements C0564mm<String> {

        /* renamed from: a  reason: collision with root package name */
        private final C0447i4 f4459a;

        /* renamed from: b  reason: collision with root package name */
        private final C0589nm<String, C0293c0> f4460b;

        public b(C0447i4 i4Var, C0589nm<String, C0293c0> nmVar) {
            this.f4459a = i4Var;
            this.f4460b = nmVar;
        }

        public void b(Object obj) {
            L1.this.a(this.f4459a, this.f4460b.a((String) obj), new D3(new Mg.b((String) null, (String) null, (String) null, (String) null, (String) null, (Map<String, String>) null, false, (List<String>) null), new D3.a(), (ResultReceiver) null));
        }
    }

    L1(Context context, C0471j4 j4Var, ICommonExecutor iCommonExecutor, B0 b0) {
        this.f4454a = context;
        this.f4455b = iCommonExecutor;
        this.f4456c = j4Var;
        this.f4457d = b0;
    }

    public void a(File file) {
        C0250a7 a7Var = new C0250a7();
        this.f4455b.execute(new C0718t6(file, a7Var, a7Var, new a()));
    }

    public void a(C0447i4 i4Var, C0293c0 c0Var, D3 d3) {
        this.f4456c.a(i4Var, d3).a(c0Var, d3);
        this.f4456c.a(i4Var.b(), i4Var.c().intValue(), i4Var.d());
    }

    public void a(C0671r7 r7Var, C0589nm<String, C0293c0> nmVar) {
        ICommonExecutor iCommonExecutor = this.f4455b;
        B0 b0 = this.f4457d;
        String str = r7Var.f6688a.f6880b;
        b0.getClass();
        iCommonExecutor.execute(new C0718t6(new File(str), new C0450i7(new C0300c7(C0400g7.CRASHPAD, r7Var.f6690c.f4041b), new C0425h7(new P6())), new C0767v7.c(r7Var.f6688a.f6879a), new b(r7Var.f6689b, nmVar)));
    }

    public void a(C0293c0 c0Var, Bundle bundle) {
        if (!(C0244a1.EVENT_TYPE_UNDEFINED.b() == c0Var.f5578e)) {
            this.f4455b.execute(new N1(this.f4454a, c0Var, bundle, this.f4456c));
        }
    }
}
