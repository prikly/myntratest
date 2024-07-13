package com.yandex.metrica.impl.ob;

import java.util.HashSet;

/* renamed from: com.yandex.metrica.impl.ob.s2  reason: case insensitive filesystem */
public class C0690s2 {

    /* renamed from: a  reason: collision with root package name */
    private final a f6769a;

    /* renamed from: b  reason: collision with root package name */
    private Boolean f6770b;

    /* renamed from: c  reason: collision with root package name */
    private final HashSet<String> f6771c = new HashSet<>();

    /* renamed from: d  reason: collision with root package name */
    private final HashSet<String> f6772d = new HashSet<>();

    /* renamed from: com.yandex.metrica.impl.ob.s2$a */
    public interface a {
    }

    /* renamed from: com.yandex.metrica.impl.ob.s2$b */
    public static class b implements a {

        /* renamed from: a  reason: collision with root package name */
        private final C0352e9 f6773a;

        public b(C0352e9 e9Var) {
            this.f6773a = e9Var;
        }

        public void a(boolean z) {
            this.f6773a.b(z).d();
        }

        public Boolean a() {
            return this.f6773a.f();
        }
    }

    public C0690s2(a aVar) {
        this.f6769a = aVar;
        this.f6770b = ((b) aVar).a();
    }

    private boolean b() {
        Boolean bool = this.f6770b;
        if (bool == null) {
            return !this.f6771c.isEmpty() || this.f6772d.isEmpty();
        }
        return bool.booleanValue();
    }

    public synchronized void a(Boolean bool) {
        if (A2.a((Object) bool) || this.f6770b == null) {
            Boolean valueOf = Boolean.valueOf(Boolean.FALSE.equals(bool));
            this.f6770b = valueOf;
            ((b) this.f6769a).a(valueOf.booleanValue());
        }
    }

    public synchronized boolean c() {
        boolean z;
        Boolean bool = this.f6770b;
        if (bool == null) {
            z = this.f6772d.isEmpty() && this.f6771c.isEmpty();
        } else {
            z = bool.booleanValue();
        }
        return z;
    }

    public synchronized boolean d() {
        return b();
    }

    public synchronized boolean e() {
        return b();
    }

    public synchronized void a(String str, Boolean bool) {
        if (A2.a((Object) bool) || (!this.f6772d.contains(str) && !this.f6771c.contains(str))) {
            Boolean bool2 = Boolean.TRUE;
            if (bool == null) {
                bool = bool2;
            }
            if (bool.booleanValue()) {
                this.f6772d.add(str);
                this.f6771c.remove(str);
            } else {
                this.f6771c.add(str);
                this.f6772d.remove(str);
            }
        }
    }

    public synchronized boolean a() {
        Boolean bool;
        bool = this.f6770b;
        return bool == null ? this.f6772d.isEmpty() : bool.booleanValue();
    }
}
