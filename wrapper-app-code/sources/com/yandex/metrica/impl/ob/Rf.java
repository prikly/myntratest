package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.interact.CellularNetworkInfo;
import com.yandex.metrica.p;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import org.json.JSONObject;

public class Rf {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Sf f4871a;

    /* renamed from: b  reason: collision with root package name */
    private final ICommonExecutor f4872b;

    /* renamed from: c  reason: collision with root package name */
    private final Kn<Context> f4873c;

    /* renamed from: d  reason: collision with root package name */
    private final Kn<String> f4874d;

    /* renamed from: e  reason: collision with root package name */
    private final C0440hm f4875e;

    class a extends C0365em {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f4876a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IIdentifierCallback f4877b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f4878c;

        a(Context context, IIdentifierCallback iIdentifierCallback, List list) {
            this.f4876a = context;
            this.f4877b = iIdentifierCallback;
            this.f4878c = list;
        }

        public void a() throws Exception {
            Sf a2 = Rf.this.f4871a;
            Context context = this.f4876a;
            a2.getClass();
            R2.a(context).a(this.f4877b, (List<String>) this.f4878c);
        }
    }

    class b extends C0340dm<String> {
        b() {
        }

        public Object a() throws Exception {
            Rf.this.f4871a.getClass();
            R2 k = R2.k();
            if (k == null) {
                return null;
            }
            return k.e().a();
        }
    }

    class c extends C0340dm<Boolean> {
        c() {
        }

        public Object a() throws Exception {
            Rf.this.f4871a.getClass();
            R2 k = R2.k();
            if (k == null) {
                return null;
            }
            return k.e().b();
        }
    }

    class d extends C0365em {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f4882a;

        d(boolean z) {
            this.f4882a = z;
        }

        public void a() throws Exception {
            Sf a2 = Rf.this.f4871a;
            boolean z = this.f4882a;
            a2.getClass();
            R2.b(z);
        }
    }

    class e extends C0365em {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p.Ucc f4884a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f4885b;

        class a implements C0538ll {
            a() {
            }

            public void onError(String str) {
                e.this.f4884a.onError(str);
            }

            public void onResult(JSONObject jSONObject) {
                e.this.f4884a.onResult(jSONObject);
            }
        }

        e(p.Ucc ucc, boolean z) {
            this.f4884a = ucc;
            this.f4885b = z;
        }

        public void a() throws Exception {
            Rf.b(Rf.this).a((C0538ll) new a(), this.f4885b);
        }
    }

    class f extends C0365em {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f4888a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f4889b;

        f(Context context, Map map) {
            this.f4888a = context;
            this.f4889b = map;
        }

        public void a() throws Exception {
            Sf a2 = Rf.this.f4871a;
            Context context = this.f4888a;
            a2.getClass();
            R2.a(context).a((Map<String, Object>) this.f4889b);
        }
    }

    public Rf(ICommonExecutor iCommonExecutor, Sf sf) {
        this(iCommonExecutor, sf, new Kf(sf), new Hn(new Gn("Context")), new Hn(new Gn("Event name")), new C0440hm());
    }

    public Future<Boolean> b() {
        return this.f4872b.submit(new c());
    }

    public String c(Context context) {
        this.f4873c.a(context);
        return context.getPackageName();
    }

    public String d(Context context) {
        this.f4873c.a(context);
        this.f4871a.getClass();
        return R2.a(context).a();
    }

    public Rf(ICommonExecutor iCommonExecutor, Sf sf, Kf kf, Kn<Context> kn, Kn<String> kn2, C0440hm hmVar) {
        this.f4871a = sf;
        this.f4872b = iCommonExecutor;
        this.f4873c = kn;
        this.f4874d = kn2;
        this.f4875e = hmVar;
    }

    public void a(Context context, IIdentifierCallback iIdentifierCallback, List<String> list) {
        this.f4873c.a(context);
        this.f4872b.execute(new a(context, iIdentifierCallback, list));
    }

    public String b(Context context) {
        this.f4873c.a(context);
        this.f4871a.getClass();
        return R2.a(context).c();
    }

    public Future<String> a() {
        return this.f4872b.submit(new b());
    }

    public String a(Context context) {
        this.f4873c.a(context);
        return this.f4875e.a(context) ? new CellularNetworkInfo(context).getCelluralInfo() : "";
    }

    public void a(Context context, boolean z) {
        this.f4873c.a(context);
        this.f4872b.execute(new d(z));
    }

    public void a(p.Ucc ucc, boolean z) {
        this.f4871a.getClass();
        if (!R2.i()) {
            ucc.onError("Main API key is not activated");
        } else {
            this.f4872b.execute(new e(ucc, z));
        }
    }

    static K0 b(Rf rf) {
        rf.f4871a.getClass();
        return R2.k().d().b();
    }

    public void a(Context context, Map<String, Object> map) {
        this.f4873c.a(context);
        this.f4872b.execute(new f(context, map));
    }
}
