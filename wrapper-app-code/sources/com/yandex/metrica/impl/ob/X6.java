package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.yandex.metrica.core.api.ProtobufConverter;
import java.util.List;
import java.util.Map;

public class X6 implements ProtobufConverter<H6, C0408gf> {

    /* renamed from: a  reason: collision with root package name */
    private final W6 f5312a;

    /* renamed from: b  reason: collision with root package name */
    private final J6 f5313b;

    /* renamed from: c  reason: collision with root package name */
    private final L6 f5314c;

    /* renamed from: d  reason: collision with root package name */
    private final T6 f5315d;

    /* renamed from: e  reason: collision with root package name */
    private final Q6 f5316e;

    /* renamed from: f  reason: collision with root package name */
    private final R6 f5317f;

    public X6() {
        this(new W6(), new J6(new V6()), new L6(), new T6(), new Q6(), new R6());
    }

    /* renamed from: a */
    public C0408gf fromModel(H6 h6) {
        C0408gf gfVar = new C0408gf();
        F6 f6 = h6.f4094a;
        if (f6 != null) {
            gfVar.f5859a = this.f5312a.fromModel(f6);
        }
        C0790w6 w6Var = h6.f4095b;
        if (w6Var != null) {
            gfVar.f5860b = this.f5313b.fromModel(w6Var);
        }
        List<D6> list = h6.f4096c;
        if (list != null) {
            gfVar.f5863e = this.f5315d.fromModel(list);
        }
        String str = h6.f4100g;
        if (str != null) {
            gfVar.f5861c = str;
        }
        gfVar.f5862d = this.f5314c.a(h6.f4101h);
        if (!TextUtils.isEmpty(h6.f4097d)) {
            gfVar.f5866h = this.f5316e.fromModel(h6.f4097d);
        }
        if (!TextUtils.isEmpty(h6.f4098e)) {
            gfVar.i = h6.f4098e.getBytes();
        }
        if (!A2.b((Map) h6.f4099f)) {
            gfVar.j = this.f5317f.fromModel(h6.f4099f);
        }
        return gfVar;
    }

    public Object toModel(Object obj) {
        C0408gf gfVar = (C0408gf) obj;
        throw new UnsupportedOperationException();
    }

    X6(W6 w6, J6 j6, L6 l6, T6 t6, Q6 q6, R6 r6) {
        this.f5313b = j6;
        this.f5312a = w6;
        this.f5314c = l6;
        this.f5315d = t6;
        this.f5316e = q6;
        this.f5317f = r6;
    }
}
