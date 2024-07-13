package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.Cf;
import com.yandex.metrica.impl.ob.Ud;
import org.json.JSONObject;

public class Sd implements ProtobufConverter<Ud.a, Cf.b> {

    /* renamed from: a  reason: collision with root package name */
    private final C0332de f4936a;

    public Sd() {
        this(new C0332de());
    }

    /* renamed from: a */
    public Cf.b fromModel(Ud.a aVar) {
        Cf.b bVar = new Cf.b();
        if (!TextUtils.isEmpty(aVar.f5099a)) {
            bVar.f3828a = aVar.f5099a;
        }
        bVar.f3829b = aVar.f5100b.toString();
        bVar.f3830c = this.f4936a.fromModel(aVar.f5101c).intValue();
        return bVar;
    }

    Sd(C0332de deVar) {
        this.f4936a = deVar;
    }

    /* renamed from: a */
    public Ud.a toModel(Cf.b bVar) {
        JSONObject jSONObject;
        String str = bVar.f3828a;
        String str2 = bVar.f3829b;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
            }
            return new Ud.a(str, jSONObject, this.f4936a.toModel(Integer.valueOf(bVar.f3830c)));
        }
        jSONObject = new JSONObject();
        return new Ud.a(str, jSONObject, this.f4936a.toModel(Integer.valueOf(bVar.f3830c)));
    }
}
