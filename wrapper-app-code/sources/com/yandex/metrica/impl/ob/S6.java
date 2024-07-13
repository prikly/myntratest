package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.yandex.metrica.core.api.ProtobufConverter;
import java.util.List;
import java.util.Map;

public class S6 implements ProtobufConverter<B6, C0433hf> {

    /* renamed from: a  reason: collision with root package name */
    private final W6 f4914a;

    /* renamed from: b  reason: collision with root package name */
    private final J6 f4915b;

    /* renamed from: c  reason: collision with root package name */
    private final L6 f4916c;

    /* renamed from: d  reason: collision with root package name */
    private final T6 f4917d;

    /* renamed from: e  reason: collision with root package name */
    private final Q6 f4918e;

    /* renamed from: f  reason: collision with root package name */
    private final R6 f4919f;

    public S6() {
        this(new W6(), new J6(new V6()), new L6(), new T6(), new Q6(), new R6());
    }

    /* renamed from: a */
    public C0433hf fromModel(B6 b6) {
        C0433hf hfVar = new C0433hf();
        String str = b6.f3739a;
        String str2 = hfVar.f5926f;
        if (str == null) {
            str = str2;
        }
        hfVar.f5926f = str;
        H6 h6 = b6.f3740b;
        if (h6 != null) {
            F6 f6 = h6.f4094a;
            if (f6 != null) {
                hfVar.f5921a = this.f4914a.fromModel(f6);
            }
            C0790w6 w6Var = h6.f4095b;
            if (w6Var != null) {
                hfVar.f5922b = this.f4915b.fromModel(w6Var);
            }
            List<D6> list = h6.f4096c;
            if (list != null) {
                hfVar.f5925e = this.f4917d.fromModel(list);
            }
            String str3 = h6.f4100g;
            String str4 = hfVar.f5923c;
            if (str3 == null) {
                str3 = str4;
            }
            hfVar.f5923c = str3;
            hfVar.f5924d = this.f4916c.a(h6.f4101h);
            if (!TextUtils.isEmpty(h6.f4097d)) {
                hfVar.i = this.f4918e.fromModel(h6.f4097d);
            }
            if (!TextUtils.isEmpty(h6.f4098e)) {
                hfVar.j = h6.f4098e.getBytes();
            }
            if (!A2.b((Map) h6.f4099f)) {
                hfVar.k = this.f4919f.fromModel(h6.f4099f);
            }
        }
        return hfVar;
    }

    public Object toModel(Object obj) {
        C0433hf hfVar = (C0433hf) obj;
        throw new UnsupportedOperationException();
    }

    S6(W6 w6, J6 j6, L6 l6, T6 t6, Q6 q6, R6 r6) {
        this.f4914a = w6;
        this.f4915b = j6;
        this.f4916c = l6;
        this.f4917d = t6;
        this.f4918e = q6;
        this.f4919f = r6;
    }
}
