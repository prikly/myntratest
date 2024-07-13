package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.CounterConfiguration;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.j2  reason: case insensitive filesystem */
public class C0469j2 {

    /* renamed from: a  reason: collision with root package name */
    private final C0494k2 f6013a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f6014b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, C0445i2> f6015c = new HashMap();

    public C0469j2(Context context, C0494k2 k2Var) {
        this.f6014b = context;
        this.f6013a = k2Var;
    }

    public synchronized C0445i2 a(String str, CounterConfiguration.b bVar) {
        C0445i2 i2Var;
        i2Var = this.f6015c.get(str);
        if (i2Var == null) {
            i2Var = new C0445i2(str, this.f6014b, bVar, this.f6013a);
            this.f6015c.put(str, i2Var);
        }
        return i2Var;
    }
}
