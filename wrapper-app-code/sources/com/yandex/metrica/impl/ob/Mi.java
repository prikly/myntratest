package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Tl;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

public final class Mi {

    /* renamed from: a  reason: collision with root package name */
    private final C0480jd f4574a;

    static final class a extends Lambda implements Function1<Map.Entry<? extends String, ? extends C0431hd>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Tl.a f4575a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Tl.a aVar) {
            super(1);
            this.f4575a = aVar;
        }

        public Object invoke(Object obj) {
            return ((C0431hd) ((Map.Entry) obj).getValue()).parse((JSONObject) this.f4575a);
        }
    }

    public Mi() {
        F0 g2 = F0.g();
        Intrinsics.checkNotNullExpressionValue(g2, "GlobalServiceLocator.getInstance()");
        C0480jd j = g2.j();
        Intrinsics.checkNotNullExpressionValue(j, "GlobalServiceLocator.get…tance().modulesController");
        this.f4574a = j;
    }

    public final void a(Ui ui, Tl.a aVar) {
        Map<String, C0431hd> c2 = this.f4574a.c();
        a aVar2 = new a(aVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : c2.entrySet()) {
            Object invoke = aVar2.invoke(next);
            if (invoke != null) {
                linkedHashMap.put(next.getKey(), invoke);
            }
        }
        ui.b((Map<String, Object>) linkedHashMap);
    }
}
