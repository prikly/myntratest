package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufStateStorage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.gh  reason: case insensitive filesystem */
public class C0410gh {

    /* renamed from: a  reason: collision with root package name */
    private final ProtobufStateStorage<C0360eh> f5871a;

    /* renamed from: b  reason: collision with root package name */
    private final C0385fh f5872b;

    /* renamed from: c  reason: collision with root package name */
    private final M0 f5873c;

    public C0410gh(ProtobufStateStorage<C0360eh> protobufStateStorage) {
        this(protobufStateStorage, new C0385fh(), C0609oh.a());
    }

    public void a() {
        M0 m0 = this.f5873c;
        C0385fh fhVar = this.f5872b;
        List<C0435hh> list = ((C0360eh) this.f5871a.read()).f5753a;
        fhVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (C0435hh next : list) {
            ArrayList arrayList2 = new ArrayList(next.f5931b.size());
            for (String next2 : next.f5931b) {
                if (C0420h2.a(next2)) {
                    arrayList2.add(next2);
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(new C0435hh(next.f5930a, arrayList2));
            }
        }
        fhVar.getClass();
        JSONObject jSONObject = new JSONObject();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0435hh hhVar = (C0435hh) it.next();
            try {
                jSONObject.put(hhVar.f5930a, new JSONObject().put("classes", new JSONArray(hhVar.f5931b)));
            } catch (Throwable unused) {
            }
        }
        m0.reportEvent("sdk_list", jSONObject.toString());
    }

    public C0410gh(ProtobufStateStorage<C0360eh> protobufStateStorage, C0385fh fhVar, M0 m0) {
        this.f5871a = protobufStateStorage;
        this.f5872b = fhVar;
        this.f5873c = m0;
    }
}
