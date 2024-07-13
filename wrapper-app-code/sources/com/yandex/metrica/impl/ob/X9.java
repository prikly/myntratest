package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.C0659qi;
import com.yandex.metrica.impl.ob.If;
import com.yandex.metrica.networktasks.api.RetryPolicyConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class X9 implements ProtobufConverter<C0659qi, If> {

    /* renamed from: a  reason: collision with root package name */
    private L9 f5322a = new L9();

    /* renamed from: b  reason: collision with root package name */
    private W9 f5323b = new W9();

    /* renamed from: c  reason: collision with root package name */
    private Q9 f5324c = new Q9();

    /* renamed from: d  reason: collision with root package name */
    private S9 f5325d = new S9();

    /* renamed from: e  reason: collision with root package name */
    private E9 f5326e = new E9();

    /* renamed from: f  reason: collision with root package name */
    private O9 f5327f = new O9();

    /* renamed from: g  reason: collision with root package name */
    private Z9 f5328g = new Z9();

    /* renamed from: h  reason: collision with root package name */
    private U9 f5329h = new U9();
    private J9 i = new J9();
    private C0328da j = new C0328da();
    private C0303ca k = new C0303ca();
    private C0721t9 l = new C0721t9();
    private C0253aa m = new C0253aa();
    private C0793w9 n = new C0793w9();
    private A9 o = new A9();
    private C0697s9 p = new C0697s9();
    private B9 q = new B9();
    private C9 r = new C9();
    private C0841y9 s = new C0841y9();
    private Y9 t = new Y9();
    private N9 u = new N9();

    public Object fromModel(Object obj) {
        C0659qi qiVar = (C0659qi) obj;
        If ifR = new If();
        ifR.C = qiVar.G;
        ifR.D = qiVar.H;
        ifR.l = new If.k[qiVar.s.size()];
        int i2 = 0;
        int i3 = 0;
        for (C0604oc a2 : qiVar.s) {
            ifR.l[i3] = this.f5322a.fromModel(a2);
            i3++;
        }
        String str = qiVar.f6646a;
        if (str != null) {
            ifR.f4138a = str;
        }
        String str2 = qiVar.f6647b;
        if (str2 != null) {
            ifR.y = str2;
        }
        String str3 = qiVar.f6648c;
        if (str3 != null) {
            ifR.z = str3;
        }
        List<String> list = qiVar.j;
        if (list != null) {
            ifR.f4144g = (String[]) list.toArray(new String[list.size()]);
        }
        List<String> list2 = qiVar.k;
        if (list2 != null) {
            ifR.f4145h = (String[]) list2.toArray(new String[list2.size()]);
        }
        List<String> list3 = qiVar.f6649d;
        if (list3 != null) {
            ifR.f4140c = (String[]) list3.toArray(new String[list3.size()]);
        }
        List<String> list4 = qiVar.i;
        if (list4 != null) {
            ifR.f4143f = (String[]) list4.toArray(new String[list4.size()]);
        }
        List<String> list5 = qiVar.l;
        if (list5 != null) {
            ifR.t = (String[]) list5.toArray(new String[list5.size()]);
        }
        List<String> list6 = qiVar.m;
        if (list6 != null) {
            ifR.i = (String[]) list6.toArray(new String[list6.size()]);
        }
        Map<String, List<String>> map = qiVar.n;
        if (map != null) {
            ifR.j = this.s.fromModel((Map<String, ? extends List<String>>) map);
        }
        C0336di diVar = qiVar.t;
        if (diVar != null) {
            ifR.m = this.f5323b.fromModel(diVar);
        }
        C0261ai aiVar = qiVar.A;
        if (aiVar != null) {
            this.f5324c.getClass();
            If.n nVar = new If.n();
            nVar.f4210a = aiVar.f5487a;
            nVar.f4211b = aiVar.f5488b;
            ifR.F = nVar;
        }
        String str4 = qiVar.o;
        if (str4 != null) {
            ifR.o = str4;
        }
        String str5 = qiVar.f6650e;
        if (str5 != null) {
            ifR.f4141d = str5;
        }
        String str6 = qiVar.f6651f;
        if (str6 != null) {
            ifR.f4142e = str6;
        }
        String str7 = qiVar.f6652g;
        if (str7 != null) {
            ifR.A = str7;
        }
        String str8 = qiVar.f6653h;
        if (str8 != null) {
            ifR.B = str8;
        }
        ifR.k = this.f5326e.fromModel(qiVar.r);
        String str9 = qiVar.p;
        if (str9 != null) {
            ifR.p = str9;
        }
        String str10 = qiVar.q;
        if (str10 != null) {
            ifR.q = str10;
        }
        ifR.r = qiVar.w;
        ifR.f4139b = qiVar.u;
        ifR.v = qiVar.v;
        RetryPolicyConfig retryPolicyConfig = qiVar.E;
        ifR.H = retryPolicyConfig.maxIntervalSeconds;
        ifR.I = retryPolicyConfig.exponentialMultiplier;
        List<C0286bi> list7 = qiVar.x;
        if (list7 != null) {
            If.o[] oVarArr = new If.o[list7.size()];
            for (C0286bi a3 : list7) {
                oVarArr[i2] = this.f5325d.fromModel(a3);
                i2++;
            }
            ifR.n = oVarArr;
        }
        String str11 = qiVar.y;
        if (str11 != null) {
            ifR.s = str11;
        }
        List<String> list8 = qiVar.Q;
        ifR.Q = (String[]) list8.toArray(new String[list8.size()]);
        List<Bd> list9 = qiVar.B;
        if (list9 != null) {
            ifR.w = this.f5327f.fromModel(list9);
        }
        C0311ci ciVar = qiVar.C;
        if (ciVar != null) {
            ifR.x = this.f5329h.fromModel(ciVar);
        }
        C0730ti tiVar = qiVar.z;
        if (tiVar != null) {
            this.f5328g.getClass();
            If.s sVar = new If.s();
            sVar.f4235a = tiVar.f6847a;
            ifR.u = sVar;
        }
        ifR.E = qiVar.I;
        Zh zh = qiVar.D;
        if (zh != null) {
            this.i.getClass();
            If.j jVar = new If.j();
            jVar.f4179a = zh.f5425a;
            ifR.G = jVar;
        }
        C0805wl wlVar = qiVar.J;
        if (wlVar != null) {
            ifR.J = this.j.fromModel(wlVar);
        }
        C0439hl hlVar = qiVar.K;
        if (hlVar != null) {
            ifR.L = this.k.fromModel(hlVar);
        }
        C0439hl hlVar2 = qiVar.L;
        if (hlVar2 != null) {
            ifR.M = this.k.fromModel(hlVar2);
        }
        C0439hl hlVar3 = qiVar.M;
        if (hlVar3 != null) {
            ifR.K = this.k.fromModel(hlVar3);
        }
        C0442i iVar = qiVar.N;
        if (iVar != null) {
            this.l.getClass();
            If.b bVar = new If.b();
            bVar.f4151a = iVar.f5952a;
            bVar.f4152b = iVar.f5953b;
            ifR.R = bVar;
        }
        C0754ui uiVar = qiVar.F;
        if (uiVar != null) {
            ifR.N = this.m.fromModel(uiVar);
        }
        Ph ph = qiVar.O;
        if (ph != null) {
            ifR.O = this.n.fromModel(ph);
        }
        ifR.P = this.o.fromModel(qiVar.P);
        Oh oh = qiVar.R;
        if (oh != null) {
            ifR.S = this.p.fromModel(oh);
        }
        C0784w0 w0Var = qiVar.S;
        if (w0Var != null) {
            this.q.getClass();
            If.g gVar = new If.g();
            gVar.f4165a = w0Var.a();
            ifR.U = gVar;
        }
        Uh uh = qiVar.T;
        if (uh != null) {
            ifR.T = this.r.fromModel(uh);
        }
        Y9 y9 = this.t;
        C0706si siVar = qiVar.U;
        y9.getClass();
        If.r rVar = new If.r();
        rVar.f4234a = siVar.a();
        ifR.V = rVar;
        ifR.W = this.u.fromModel((Map<String, ? extends Object>) qiVar.V);
        return ifR;
    }

    public Object toModel(Object obj) {
        If ifR = (If) obj;
        C0659qi.b a2 = new C0659qi.b(this.f5326e.toModel(ifR.k)).k(ifR.f4138a).c(ifR.y).d(ifR.z).e(ifR.o).f(ifR.f4141d).i((List<String>) Arrays.asList(ifR.f4140c)).e((List<String>) Arrays.asList(ifR.f4143f)).b((List<String>) Arrays.asList(ifR.f4145h)).c((List<String>) Arrays.asList(ifR.f4144g)).i(ifR.f4142e).j(ifR.A).a(ifR.B).a((List<String>) Arrays.asList(ifR.t)).g((List<String>) Arrays.asList(ifR.i)).h(ifR.p).g(ifR.q).c(ifR.r).c(ifR.f4139b).a(ifR.v);
        If.o[] oVarArr = ifR.n;
        ArrayList arrayList = new ArrayList(oVarArr.length);
        int i2 = 0;
        for (If.o a3 : oVarArr) {
            arrayList.add(this.f5325d.toModel(a3));
        }
        C0659qi.b a4 = a2.j((List<C0286bi>) arrayList).b(ifR.C).a(ifR.D).b(ifR.s).b(ifR.E).a(new RetryPolicyConfig(ifR.H, ifR.I)).f((List<String>) Arrays.asList(ifR.Q)).a(this.s.toModel(ifR.j));
        if (ifR.l != null) {
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                If.k[] kVarArr = ifR.l;
                if (i2 >= kVarArr.length) {
                    break;
                }
                arrayList2.add(this.f5322a.toModel(kVarArr[i2]));
                i2++;
            }
            a4.d((List<C0604oc>) arrayList2);
        }
        If.q qVar = ifR.m;
        if (qVar != null) {
            a4.a(this.f5323b.toModel(qVar));
        }
        If.n nVar = ifR.F;
        if (nVar != null) {
            this.f5324c.getClass();
            a4.a(new C0261ai(nVar.f4210a, nVar.f4211b));
        }
        If.m[] mVarArr = ifR.w;
        if (mVarArr != null) {
            a4.h(this.f5327f.toModel(mVarArr));
        }
        If.p pVar = ifR.x;
        if (pVar != null) {
            a4.a(this.f5329h.toModel(pVar));
        }
        If.s sVar = ifR.u;
        if (sVar != null) {
            a4.a(this.f5328g.toModel(sVar));
        }
        If.j jVar = ifR.G;
        if (jVar != null) {
            a4.a(this.i.toModel(jVar));
        }
        If.w wVar = ifR.J;
        if (wVar != null) {
            a4.a(this.j.toModel(wVar));
        }
        If.v vVar = ifR.L;
        if (vVar != null) {
            a4.b(this.k.toModel(vVar));
        }
        If.v vVar2 = ifR.M;
        if (vVar2 != null) {
            a4.c(this.k.toModel(vVar2));
        }
        If.v vVar3 = ifR.K;
        if (vVar3 != null) {
            a4.a(this.k.toModel(vVar3));
        }
        If.b bVar = ifR.R;
        if (bVar != null) {
            a4.a(this.l.toModel(bVar));
        }
        If.t tVar = ifR.N;
        if (tVar != null) {
            a4.a(this.m.toModel(tVar));
        }
        If.c cVar = ifR.O;
        if (cVar != null) {
            a4.a(this.n.toModel(cVar));
        }
        If.f fVar = ifR.P;
        if (fVar != null) {
            a4.a(this.o.a(fVar));
        }
        If.a aVar = ifR.S;
        if (aVar != null) {
            a4.a(this.p.toModel(aVar));
        }
        If.h hVar = ifR.T;
        if (hVar != null) {
            a4.a(this.r.toModel(hVar));
        }
        If.g gVar = ifR.U;
        if (gVar != null) {
            a4.a(this.q.toModel(gVar));
        }
        If.r rVar = ifR.V;
        if (rVar != null) {
            a4.a(this.t.toModel(rVar));
        }
        a4.b(this.u.toModel(ifR.W));
        return a4.a();
    }
}
