package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.wk  reason: case insensitive filesystem */
public class C0804wk {

    /* renamed from: a  reason: collision with root package name */
    public final int f7062a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7063b;

    /* renamed from: c  reason: collision with root package name */
    private final int f7064c = a();

    public C0804wk(int i, String str) {
        this.f7062a = i;
        this.f7063b = str;
    }

    private int a() {
        return (this.f7062a * 31) + this.f7063b.length();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0804wk.class != obj.getClass()) {
            return false;
        }
        C0804wk wkVar = (C0804wk) obj;
        if (this.f7062a != wkVar.f7062a) {
            return false;
        }
        return this.f7063b.equals(wkVar.f7063b);
    }

    public int hashCode() {
        return this.f7064c;
    }
}
