package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.yandex.metrica.impl.ob.C0656qf;
import java.util.Collection;
import java.util.List;

class O1 implements C0263ak {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C0656qf f4635a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ P1 f4636b;

    O1(P1 p1, C0656qf qfVar) {
        this.f4636b = p1;
        this.f4635a = qfVar;
    }

    public void a(Zj zj) {
        C0656qf qfVar = this.f4635a;
        List<Tj> c2 = zj.c();
        if (!A2.b((Collection) c2)) {
            qfVar.f6580d = new C0656qf.e[c2.size()];
            for (int i = 0; i < c2.size(); i++) {
                Tj tj = c2.get(i);
                C0656qf.e[] eVarArr = qfVar.f6580d;
                int i2 = J1.f4302e;
                C0656qf.e eVar = new C0656qf.e();
                if (tj.b() != null) {
                    eVar.f6630a = tj.b().intValue();
                }
                if (tj.c() != null) {
                    eVar.f6631b = tj.c().intValue();
                }
                if (!TextUtils.isEmpty(tj.a())) {
                    eVar.f6632c = tj.a();
                }
                eVar.f6633d = tj.d();
                eVarArr[i] = eVar;
                P1.a(this.f4636b, CodedOutputByteBufferNano.computeMessageSizeNoTag(qfVar.f6580d[i]));
                P1.a(this.f4636b, CodedOutputByteBufferNano.computeTagSize(10));
            }
        }
    }
}
