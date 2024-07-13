package com.yandex.metrica.impl.ob;

import com.yandex.metrica.billing_interface.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.c  reason: case insensitive filesystem */
public class C0292c implements C0516l {

    /* renamed from: a  reason: collision with root package name */
    private boolean f5571a;

    /* renamed from: b  reason: collision with root package name */
    private final C0566n f5572b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, a> f5573c = new HashMap();

    public C0292c(C0566n nVar) {
        C0296c3 c3Var = (C0296c3) nVar;
        for (a next : c3Var.a()) {
            this.f5573c.put(next.f3545b, next);
        }
        this.f5571a = c3Var.b();
        this.f5572b = c3Var;
    }

    public void a(Map<String, a> map) {
        for (a next : map.values()) {
            this.f5573c.put(next.f3545b, next);
        }
        ((C0296c3) this.f5572b).a(new ArrayList(this.f5573c.values()), this.f5571a);
    }

    public void b() {
        if (!this.f5571a) {
            this.f5571a = true;
            ((C0296c3) this.f5572b).a(new ArrayList(this.f5573c.values()), this.f5571a);
        }
    }

    public a a(String str) {
        return this.f5573c.get(str);
    }

    public boolean a() {
        return this.f5571a;
    }
}
