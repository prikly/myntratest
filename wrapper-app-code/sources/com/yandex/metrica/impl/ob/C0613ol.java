package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C0685rl;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.ol  reason: case insensitive filesystem */
public class C0613ol implements Ik {

    /* renamed from: a  reason: collision with root package name */
    private final List<C0685rl> f6416a;

    public C0613ol(List<C0685rl> list) {
        this.f6416a = list;
    }

    public Object a(C0339dl dlVar, C0439hl hlVar, Ak ak, int i) {
        JSONArray jSONArray = new JSONArray();
        if (this.f6416a.isEmpty()) {
            return jSONArray;
        }
        for (C0685rl next : this.f6416a) {
            C0685rl.b a2 = next.a(ak);
            int i2 = 0;
            if ((hlVar.f5948f || next.a()) && (a2 == null || !hlVar.i)) {
                JSONObject a3 = next.a(hlVar, a2);
                int length = a3.toString().getBytes().length + 1;
                int length2 = jSONArray.length();
                if (i + length <= hlVar.n && length2 < hlVar.m) {
                    jSONArray.put(a3);
                    i2 = length;
                }
            }
            i += i2;
        }
        return jSONArray;
    }
}
