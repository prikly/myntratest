package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.C0754ui;
import com.yandex.metrica.impl.ob.If;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.aa  reason: case insensitive filesystem */
public class C0253aa implements ProtobufConverter<C0754ui, If.t> {

    /* renamed from: a  reason: collision with root package name */
    private static final EnumMap<C0754ui.b, String> f5470a;

    /* renamed from: b  reason: collision with root package name */
    private static final Map<String, C0754ui.b> f5471b;

    static {
        EnumMap<C0754ui.b, String> enumMap = new EnumMap<>(C0754ui.b.class);
        f5470a = enumMap;
        HashMap hashMap = new HashMap();
        f5471b = hashMap;
        C0754ui.b bVar = C0754ui.b.WIFI;
        enumMap.put(bVar, "wifi");
        C0754ui.b bVar2 = C0754ui.b.CELL;
        enumMap.put(bVar2, "cell");
        hashMap.put("wifi", bVar);
        hashMap.put("cell", bVar2);
    }

    /* renamed from: a */
    public If.t fromModel(C0754ui uiVar) {
        If.t tVar = new If.t();
        if (uiVar.f6924a != null) {
            If.u uVar = new If.u();
            tVar.f4236a = uVar;
            C0754ui.a aVar = uiVar.f6924a;
            uVar.f4238a = aVar.f6926a;
            uVar.f4239b = aVar.f6927b;
        }
        if (uiVar.f6925b != null) {
            If.u uVar2 = new If.u();
            tVar.f4237b = uVar2;
            C0754ui.a aVar2 = uiVar.f6925b;
            uVar2.f4238a = aVar2.f6926a;
            uVar2.f4239b = aVar2.f6927b;
        }
        return tVar;
    }

    /* renamed from: a */
    public C0754ui toModel(If.t tVar) {
        If.u uVar = tVar.f4236a;
        C0754ui.a aVar = null;
        C0754ui.a aVar2 = uVar != null ? new C0754ui.a(uVar.f4238a, uVar.f4239b) : null;
        If.u uVar2 = tVar.f4237b;
        if (uVar2 != null) {
            aVar = new C0754ui.a(uVar2.f4238a, uVar2.f4239b);
        }
        return new C0754ui(aVar2, aVar);
    }
}
