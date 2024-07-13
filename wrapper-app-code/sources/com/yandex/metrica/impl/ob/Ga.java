package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.yandex.metrica.impl.ob.C0557mf;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Ga implements Fa<Va> {

    /* renamed from: a  reason: collision with root package name */
    private final Ha f4044a;

    /* renamed from: b  reason: collision with root package name */
    private final Ca f4045b;

    /* renamed from: c  reason: collision with root package name */
    private final C0515kn f4046c;

    /* renamed from: d  reason: collision with root package name */
    private final La f4047d;

    public Ga() {
        this(new Ha(), new Ca(), new C0515kn(100), new La());
    }

    private C0557mf a(C0557mf mfVar) {
        C0557mf mfVar2 = new C0557mf();
        mfVar2.f6219a = mfVar.f6219a;
        C0557mf.h hVar = new C0557mf.h();
        mfVar2.f6224f = hVar;
        hVar.f6244a = new C0557mf.f();
        C0557mf.f fVar = mfVar2.f6224f.f6244a;
        C0557mf.f fVar2 = mfVar.f6224f.f6244a;
        fVar.f6237b = fVar2.f6237b;
        fVar.f6236a = fVar2.f6236a;
        fVar.f6240e = fVar2.f6240e;
        fVar.f6238c = fVar2.f6238c;
        return mfVar2;
    }

    public Object fromModel(Object obj) {
        Na<C0557mf.i, Vm> na;
        int i;
        Va va = (Va) obj;
        C0557mf mfVar = new C0557mf();
        mfVar.f6219a = va.f5223b;
        mfVar.f6224f = new C0557mf.h();
        Wa wa = va.f5224c;
        C0557mf.f fVar = new C0557mf.f();
        fVar.f6236a = C0267b.b(wa.f5256a);
        C0416gn<String, Vm> a2 = this.f4046c.a(wa.f5257b);
        fVar.f6237b = C0267b.b((String) a2.f5887a);
        fVar.f6240e = wa.f5258c.size();
        Map<String, String> map = wa.f5259d;
        if (map != null) {
            na = this.f4044a.fromModel(map);
            fVar.f6238c = (C0557mf.i) na.f4599a;
        } else {
            na = null;
        }
        mfVar.f6224f.f6244a = fVar;
        Vm a3 = Um.a(a2, na);
        List<Ua> list = wa.f5258c;
        ArrayList arrayList = new ArrayList();
        this.f4047d.getClass();
        int computeInt32Size = mfVar.f6219a != new C0557mf().f6219a ? CodedOutputByteBufferNano.computeInt32Size(1, mfVar.f6219a) + 0 : 0;
        C0557mf.q qVar = mfVar.f6220b;
        if (qVar != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(2, qVar);
        }
        C0557mf.o oVar = mfVar.f6221c;
        if (oVar != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(3, oVar);
        }
        C0557mf.p pVar = mfVar.f6222d;
        int i2 = 4;
        if (pVar != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(4, pVar);
        }
        C0557mf.b bVar = mfVar.f6223e;
        if (bVar != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(5, bVar);
        }
        C0557mf.h hVar = mfVar.f6224f;
        if (hVar != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(6, hVar);
        }
        ArrayList arrayList2 = new ArrayList();
        C0557mf a4 = a(mfVar);
        Vm vm = a3;
        int i3 = computeInt32Size;
        int i4 = 0;
        while (i4 < list.size()) {
            C0557mf.g gVar = new C0557mf.g();
            gVar.f6242a = i4;
            Na<C0557mf.c, Vm> a5 = this.f4045b.fromModel(list.get(i4));
            gVar.f6243b = (C0557mf.c) a5.f4599a;
            this.f4047d.getClass();
            int computeTagSize = CodedOutputByteBufferNano.computeTagSize(i2);
            int computeMessageSizeNoTag = CodedOutputByteBufferNano.computeMessageSizeNoTag(gVar);
            if ((computeMessageSizeNoTag & -128) == 0) {
                i = 0;
            } else {
                i = CodedOutputByteBufferNano.computeRawVarint32Size(computeMessageSizeNoTag);
            }
            int i5 = computeTagSize + computeMessageSizeNoTag + i;
            if (arrayList2.size() != 0 && i3 + i5 > 204800) {
                a4.f6224f.f6244a.f6239d = (C0557mf.g[]) arrayList2.toArray(new C0557mf.g[arrayList2.size()]);
                ArrayList arrayList3 = new ArrayList();
                arrayList.add(new Na(a4, vm));
                vm = a3;
                i3 = computeInt32Size;
                a4 = a(mfVar);
                arrayList2 = arrayList3;
            }
            arrayList2.add(gVar);
            vm = Um.a(vm, a5);
            i3 += i5;
            i4++;
            i2 = 4;
        }
        a4.f6224f.f6244a.f6239d = (C0557mf.g[]) arrayList2.toArray(new C0557mf.g[arrayList2.size()]);
        arrayList.add(new Na(a4, vm));
        return arrayList;
    }

    public Object toModel(Object obj) {
        List list = (List) obj;
        throw new UnsupportedOperationException();
    }

    Ga(Ha ha, Ca ca, C0515kn knVar, La la) {
        this.f4044a = ha;
        this.f4045b = ca;
        this.f4046c = knVar;
        this.f4047d = la;
    }
}
