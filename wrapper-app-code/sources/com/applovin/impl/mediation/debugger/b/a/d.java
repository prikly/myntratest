package com.applovin.impl.mediation.debugger.b.a;

import com.applovin.impl.mediation.debugger.b.c.b;

public class d implements Comparable<d> {

    /* renamed from: a  reason: collision with root package name */
    private final String f14687a;

    /* renamed from: b  reason: collision with root package name */
    private final String f14688b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f14689c;

    /* renamed from: d  reason: collision with root package name */
    private final b f14690d;

    d(String str, String str2, boolean z, b bVar) {
        this.f14687a = str;
        this.f14688b = str2;
        this.f14689c = z;
        this.f14690d = bVar;
    }

    /* renamed from: a */
    public int compareTo(d dVar) {
        return this.f14688b.compareToIgnoreCase(dVar.f14688b);
    }

    public String a() {
        return this.f14687a;
    }

    public String b() {
        return this.f14688b;
    }

    public b c() {
        return this.f14690d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.f14687a;
        if (str == null ? dVar.f14687a != null : !str.equals(dVar.f14687a)) {
            return false;
        }
        String str2 = this.f14688b;
        if (str2 == null ? dVar.f14688b == null : str2.equals(dVar.f14688b)) {
            return this.f14689c == dVar.f14689c;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f14687a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f14688b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode + i) * 31) + (this.f14689c ? 1 : 0);
    }
}
