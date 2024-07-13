package com.yandex.metrica.impl.ob;

import java.util.List;
import java.util.Map;

public class H6 {

    /* renamed from: a  reason: collision with root package name */
    public final F6 f4094a;

    /* renamed from: b  reason: collision with root package name */
    public final C0790w6 f4095b;

    /* renamed from: c  reason: collision with root package name */
    public final List<D6> f4096c;

    /* renamed from: d  reason: collision with root package name */
    public final String f4097d;

    /* renamed from: e  reason: collision with root package name */
    public final String f4098e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<String, String> f4099f;

    /* renamed from: g  reason: collision with root package name */
    public final String f4100g;

    /* renamed from: h  reason: collision with root package name */
    public final Boolean f4101h;

    public H6(F6 f6, C0790w6 w6Var, List<D6> list, String str, String str2, Map<String, String> map, String str3, Boolean bool) {
        this.f4094a = f6;
        this.f4095b = w6Var;
        this.f4096c = list;
        this.f4097d = str;
        this.f4098e = str2;
        this.f4099f = map;
        this.f4100g = str3;
        this.f4101h = bool;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        F6 f6 = this.f4094a;
        if (f6 != null) {
            for (D6 next : f6.d()) {
                sb.append("at " + next.a() + "." + next.e() + "(" + next.c() + ":" + next.d() + ":" + next.b() + ")\n");
            }
        }
        return "UnhandledException{exception=" + this.f4094a + "\n" + sb.toString() + '}';
    }
}
