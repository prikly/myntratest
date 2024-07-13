package com.bykv.vk.openvk.component.video.a.b.e;

import com.bykv.vk.openvk.component.video.a.b.i;
import com.bytedance.sdk.component.b.a.e;
import com.bytedance.sdk.component.b.a.m;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* compiled from: VolleyResponseWrapper */
public class f extends a {

    /* renamed from: c  reason: collision with root package name */
    private m f18032c;

    public f(m mVar, e eVar) {
        e g2;
        this.f18032c = mVar;
        this.f18023a = new ArrayList();
        if (!(mVar == null || (g2 = mVar.g()) == null)) {
            for (int i = 0; i < g2.a(); i++) {
                this.f18023a.add(new i.b(g2.a(i), g2.b(i)));
            }
        }
        this.f18024b = eVar;
    }

    public int a() {
        return this.f18032c.c();
    }

    public boolean b() {
        return this.f18032c.c() >= 200 && this.f18032c.c() < 300;
    }

    public String a(String str, String str2) {
        return a(str) != null ? a(str).f18085b : str2;
    }

    public List<i.b> c() {
        return this.f18023a;
    }

    public InputStream d() {
        return this.f18032c.f().c();
    }

    public String e() {
        m mVar = this.f18032c;
        return (mVar == null || mVar.h() == null) ? "http/1.1" : this.f18032c.h().toString();
    }

    public String f() {
        return a(this.f18032c.c());
    }
}
