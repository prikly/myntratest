package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.ob.Tl;

/* renamed from: com.yandex.metrica.impl.ob.e6  reason: case insensitive filesystem */
public class C0349e6 implements C0324d6 {

    /* renamed from: a  reason: collision with root package name */
    private final String f5714a;

    /* renamed from: b  reason: collision with root package name */
    protected final C0302c9 f5715b;

    /* renamed from: c  reason: collision with root package name */
    private Tl.a f5716c;

    public C0349e6(C0302c9 c9Var, String str) {
        this.f5715b = c9Var;
        this.f5714a = str;
        Tl.a aVar = new Tl.a();
        try {
            String g2 = c9Var.g(str);
            if (!TextUtils.isEmpty(g2)) {
                aVar = new Tl.a(g2);
            }
        } catch (Throwable unused) {
        }
        this.f5716c = aVar;
    }

    public C0349e6 a(long j) {
        a("SESSION_INIT_TIME", Long.valueOf(j));
        return this;
    }

    public C0349e6 b(long j) {
        a("SESSION_LAST_EVENT_OFFSET", Long.valueOf(j));
        return this;
    }

    public Long c() {
        return this.f5716c.a("SESSION_INIT_TIME");
    }

    public C0349e6 d(long j) {
        a("SESSION_ID", Long.valueOf(j));
        return this;
    }

    public Long e() {
        return this.f5716c.a("SESSION_COUNTER_ID");
    }

    public Long f() {
        return this.f5716c.a("SESSION_ID");
    }

    public Long g() {
        return this.f5716c.a("SESSION_SLEEP_START");
    }

    public boolean h() {
        return this.f5716c.length() > 0;
    }

    public Boolean i() {
        Tl.a aVar = this.f5716c;
        aVar.getClass();
        try {
            return Boolean.valueOf(aVar.getBoolean("SESSION_IS_ALIVE_REPORT_NEEDED"));
        } catch (Throwable unused) {
            return null;
        }
    }

    public C0349e6 a(boolean z) {
        a("SESSION_IS_ALIVE_REPORT_NEEDED", Boolean.valueOf(z));
        return this;
    }

    public void b() {
        this.f5715b.c(this.f5714a, this.f5716c.toString());
        this.f5715b.d();
    }

    public C0349e6 c(long j) {
        a("SESSION_COUNTER_ID", Long.valueOf(j));
        return this;
    }

    public Long d() {
        return this.f5716c.a("SESSION_LAST_EVENT_OFFSET");
    }

    public C0349e6 e(long j) {
        a("SESSION_SLEEP_START", Long.valueOf(j));
        return this;
    }

    private void a(String str, Object obj) {
        try {
            this.f5716c.put(str, obj);
        } catch (Throwable unused) {
        }
    }

    public void a() {
        this.f5716c = new Tl.a();
        b();
    }
}
