package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.C0799wf;
import java.util.ArrayList;

/* renamed from: com.yandex.metrica.impl.ob.r9  reason: case insensitive filesystem */
public class C0673r9 implements ProtobufConverter<C0725td, C0799wf> {

    /* renamed from: a  reason: collision with root package name */
    private final C0745u9 f6691a;

    public C0673r9() {
        this(new C0745u9());
    }

    public Object fromModel(Object obj) {
        C0725td tdVar = (C0725td) obj;
        C0799wf wfVar = new C0799wf();
        wfVar.f7043a = new C0799wf.b[tdVar.f6832a.size()];
        int i = 0;
        int i2 = 0;
        for (Bd next : tdVar.f6832a) {
            C0799wf.b[] bVarArr = wfVar.f7043a;
            C0799wf.b bVar = new C0799wf.b();
            bVar.f7049a = next.f3764a;
            bVar.f7050b = next.f3765b;
            bVarArr[i2] = bVar;
            i2++;
        }
        C0855z zVar = tdVar.f6833b;
        if (zVar != null) {
            wfVar.f7044b = this.f6691a.fromModel(zVar);
        }
        wfVar.f7045c = new String[tdVar.f6834c.size()];
        for (String str : tdVar.f6834c) {
            wfVar.f7045c[i] = str;
            i++;
        }
        return wfVar;
    }

    public Object toModel(Object obj) {
        C0799wf wfVar = (C0799wf) obj;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (true) {
            C0799wf.b[] bVarArr = wfVar.f7043a;
            if (i2 >= bVarArr.length) {
                break;
            }
            C0799wf.b bVar = bVarArr[i2];
            arrayList.add(new Bd(bVar.f7049a, bVar.f7050b));
            i2++;
        }
        C0855z zVar = null;
        C0799wf.a aVar = wfVar.f7044b;
        if (aVar != null) {
            zVar = this.f6691a.toModel(aVar);
        }
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            String[] strArr = wfVar.f7045c;
            if (i >= strArr.length) {
                return new C0725td(arrayList, zVar, arrayList2);
            }
            arrayList2.add(strArr[i]);
            i++;
        }
    }

    C0673r9(C0745u9 u9Var) {
        this.f6691a = u9Var;
    }
}
