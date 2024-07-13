package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.util.Base64;
import android.util.Pair;
import com.google.protobuf.nano.ym.MessageNano;
import com.yandex.metrica.IMetricaService;
import com.yandex.metrica.impl.ob.U1;
import com.yandex.metrica.rtm.wrapper.k;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import org.json.JSONObject;

public class T1 implements P0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4986a;

    /* renamed from: b  reason: collision with root package name */
    private C0593o1 f4987b;

    /* renamed from: c  reason: collision with root package name */
    private C0468j1 f4988c;

    /* renamed from: d  reason: collision with root package name */
    private final T f4989d;

    /* renamed from: e  reason: collision with root package name */
    private C0485ji f4990e;

    /* renamed from: f  reason: collision with root package name */
    private final P6 f4991f;

    /* renamed from: g  reason: collision with root package name */
    private final C0766v6 f4992g;

    /* renamed from: h  reason: collision with root package name */
    private final U1 f4993h = new U1(this);

    class a implements U1.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f4994a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Q1 f4995b;

        a(Map map, Q1 q1) {
            this.f4994a = map;
            this.f4995b = q1;
        }

        public C0293c0 a(C0293c0 c0Var) {
            T1 t1 = T1.this;
            C0293c0 f2 = c0Var.f(Tl.g(this.f4994a));
            Q1 q1 = this.f4995b;
            t1.getClass();
            if (C0856z0.f(f2.f5578e)) {
                f2.c(q1.f4805c.a());
            }
            return f2;
        }
    }

    class b implements U1.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0775vf f4997a;

        b(T1 t1, C0775vf vfVar) {
            this.f4997a = vfVar;
        }

        public C0293c0 a(C0293c0 c0Var) {
            return c0Var.f(new String(Base64.encode(MessageNano.toByteArray(this.f4997a), 0)));
        }
    }

    class c implements U1.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f4998a;

        c(T1 t1, String str) {
            this.f4998a = str;
        }

        public C0293c0 a(C0293c0 c0Var) {
            return c0Var.f(this.f4998a);
        }
    }

    class d implements U1.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ W1 f4999a;

        d(T1 t1, W1 w1) {
            this.f4999a = w1;
        }

        public C0293c0 a(C0293c0 c0Var) {
            Pair<byte[], Integer> a2 = this.f4999a.a();
            C0293c0 f2 = c0Var.f(new String(Base64.encode((byte[]) a2.first, 0)));
            f2.f5581h = ((Integer) a2.second).intValue();
            return f2;
        }
    }

    class e implements U1.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Sg f5000a;

        e(T1 t1, Sg sg) {
            this.f5000a = sg;
        }

        public C0293c0 a(C0293c0 c0Var) {
            kotlin.Pair<byte[], Integer> a2 = this.f5000a.a();
            C0293c0 f2 = c0Var.f(new String(Base64.encode(a2.getFirst(), 0)));
            f2.f5581h = a2.getSecond().intValue();
            return f2;
        }
    }

    class f implements U1.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Na f5001a;

        f(T1 t1, Na na) {
            this.f5001a = na;
        }

        public C0293c0 a(C0293c0 c0Var) {
            C0293c0 f2 = c0Var.f(L0.a(MessageNano.toByteArray((MessageNano) this.f5001a.f4599a)));
            f2.f5581h = this.f5001a.f4600b.a();
            return f2;
        }
    }

    T1(A3 a3, Context context, C0593o1 o1Var, P6 p6, C0766v6 v6Var) {
        this.f4987b = o1Var;
        this.f4986a = context;
        this.f4989d = new T(a3);
        this.f4991f = p6;
        this.f4992g = v6Var;
    }

    /* access modifiers changed from: package-private */
    public void a(C0468j1 j1Var) {
        this.f4988c = j1Var;
    }

    public void b(Q1 q1) {
        C0457ie ieVar = q1.f4806d;
        String e2 = q1.e();
        C0315cm a2 = a(q1);
        List<Integer> list = C0856z0.i;
        JSONObject jSONObject = new JSONObject();
        if (ieVar != null) {
            ieVar.a(jSONObject);
        }
        a(new J(jSONObject.toString(), "", C0244a1.EVENT_TYPE_ACTIVATION.b(), 0, a2).d(e2), q1);
    }

    public void c(Q1 q1) {
        C0293c0 c0Var = new C0293c0();
        c0Var.f5578e = C0244a1.EVENT_TYPE_APP_ENVIRONMENT_CLEARED.b();
        a(new U1.f(c0Var, q1));
    }

    /* access modifiers changed from: package-private */
    public void d() {
        this.f4987b.g();
    }

    /* access modifiers changed from: package-private */
    public void e() {
        this.f4987b.f();
    }

    public void f() {
        this.f4987b.a();
    }

    public void g() {
        this.f4987b.c();
    }

    /* access modifiers changed from: package-private */
    public void a(C0485ji jiVar) {
        this.f4990e = jiVar;
        this.f4989d.a(jiVar);
    }

    /* access modifiers changed from: package-private */
    public void a(Boolean bool, Boolean bool2, Boolean bool3) {
        if (A2.a((Object) bool)) {
            this.f4989d.b().b(bool.booleanValue());
        }
        if (A2.a((Object) bool2)) {
            this.f4989d.b().c(bool2.booleanValue());
        }
        if (A2.a((Object) bool3)) {
            this.f4989d.b().a(bool3.booleanValue());
        }
        C0293c0 c0Var = new C0293c0();
        c0Var.f5578e = C0244a1.EVENT_TYPE_UPDATE_PRE_ACTIVATION_CONFIG.b();
        a(c0Var, (Q1) this.f4989d);
    }

    public C0593o1 c() {
        return this.f4987b;
    }

    /* access modifiers changed from: package-private */
    public void a(String str, Q1 q1) {
        byte[] bArr;
        try {
            P6 p6 = this.f4991f;
            if (str == null) {
                bArr = new byte[0];
            } else {
                bArr = str.getBytes("UTF-8");
            }
            a(C0856z0.c(L0.a(MessageNano.toByteArray(p6.fromModel(new C0325d7(bArr, new C0300c7(C0400g7.USER, (String) null))))), a(q1)), q1);
        } catch (UnsupportedEncodingException unused) {
        }
    }

    public Future<Void> a(C0293c0 c0Var, Q1 q1, Map<String, Object> map) {
        C0244a1 a1Var = C0244a1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        this.f4987b.f();
        U1.f fVar = new U1.f(c0Var, q1);
        if (!A2.b((Map) map)) {
            fVar.a((U1.e) new a(map, q1));
        }
        return a(fVar);
    }

    public Future<Void> a(A3 a3) {
        return this.f4993h.queuePauseUserSession(a3);
    }

    public void a(List<String> list, ResultReceiver resultReceiver, Map<String, String> map) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.yandex.metrica.impl.IdentifiersData", new V0(list, map, resultReceiver));
        C0244a1 a1Var = C0244a1.EVENT_TYPE_STARTUP;
        int i = Ul.f5196e;
        C0315cm a2 = C0315cm.a();
        List<Integer> list2 = C0856z0.i;
        a(new J("", "", a1Var.b(), 0, a2).c(bundle), (Q1) this.f4989d);
    }

    public void a(C0359eg egVar) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.yandex.metrica.impl.referrer.common.ReferrerResultReceiver", egVar);
        int i = Ul.f5196e;
        C0315cm a2 = C0315cm.a();
        List<Integer> list = C0856z0.i;
        a(new J("", "", C0244a1.EVENT_TYPE_REQUEST_REFERRER.b(), 0, a2).c(bundle), (Q1) this.f4989d);
    }

    public Future<Void> b(A3 a3) {
        return this.f4993h.queueResumeUserSession(a3);
    }

    public void b(String str) {
        this.f4989d.a().b(str);
    }

    /* access modifiers changed from: package-private */
    public void b(H6 h6, Q1 q1) {
        this.f4987b.f();
        a(this.f4992g.a(h6, q1));
    }

    /* access modifiers changed from: package-private */
    public void b(String str, Q1 q1) {
        a(new U1.f(J.a(str, a(q1)), q1).a((U1.e) new c(this, str)));
    }

    public k b() {
        return this.f4993h;
    }

    /* access modifiers changed from: package-private */
    public void a(C0293c0 c0Var, Q1 q1) {
        if (C0856z0.f(c0Var.f5578e)) {
            c0Var.c(q1.f4805c.a());
        }
        a(c0Var, q1, (Map<String, Object>) null);
    }

    public void a(List<String> list) {
        this.f4989d.a().a(list);
    }

    public void a(Map<String, String> map) {
        this.f4989d.a().a(map);
    }

    public void a(String str) {
        this.f4989d.a().a(str);
    }

    /* access modifiers changed from: package-private */
    public void a(H6 h6, Q1 q1) {
        this.f4987b.f();
        U1.f a2 = this.f4992g.a(h6, q1);
        a2.a().a(this.f4990e);
        this.f4993h.sendCrash(a2);
    }

    public void a(String str, String str2, Q1 q1) {
        C0293c0 c0Var = new C0293c0();
        c0Var.f5578e = C0244a1.EVENT_TYPE_APP_ENVIRONMENT_UPDATED.b();
        a(new U1.f(c0Var.a(str, str2), q1));
    }

    /* access modifiers changed from: package-private */
    public void a(C0775vf vfVar, Q1 q1) {
        C0293c0 c0Var = new C0293c0();
        c0Var.f5578e = C0244a1.EVENT_TYPE_SEND_USER_PROFILE.b();
        a(new U1.f(c0Var, q1).a((U1.e) new b(this, vfVar)));
    }

    /* access modifiers changed from: package-private */
    public void a(W1 w1, Q1 q1) {
        J j = new J(a(q1));
        j.f5578e = C0244a1.EVENT_TYPE_SEND_REVENUE_EVENT.b();
        a(new U1.f(j, q1).a((U1.e) new d(this, w1)));
    }

    /* access modifiers changed from: package-private */
    public void a(Sg sg, Q1 q1) {
        J j = new J(a(q1));
        j.f5578e = C0244a1.EVENT_TYPE_SEND_AD_REVENUE_EVENT.b();
        a(new U1.f(j, q1).a((U1.e) new e(this, sg)));
    }

    /* access modifiers changed from: package-private */
    public void a(Za za, Q1 q1) {
        for (Na<C0557mf, Vm> fVar : za.toProto()) {
            J j = new J(a(q1));
            j.f5578e = C0244a1.EVENT_TYPE_SEND_ECOMMERCE_EVENT.b();
            a(new U1.f(j, q1).a((U1.e) new f(this, fVar)));
        }
    }

    public void a(IMetricaService iMetricaService, C0293c0 c0Var, Q1 q1) throws RemoteException {
        iMetricaService.reportData(c0Var.b(q1.c()));
        C0468j1 j1Var = this.f4988c;
        if (j1Var == null || j1Var.f3721b.f()) {
            this.f4987b.g();
        }
    }

    private Future<Void> a(U1.f fVar) {
        fVar.a().a(this.f4990e);
        return this.f4993h.queueReport(fVar);
    }

    public Context a() {
        return this.f4986a;
    }

    private C0315cm a(Q1 q1) {
        return Ul.b(q1.b().a());
    }
}
