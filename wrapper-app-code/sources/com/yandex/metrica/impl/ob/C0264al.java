package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.al  reason: case insensitive filesystem */
public class C0264al implements C0661qk {

    /* renamed from: a  reason: collision with root package name */
    private final int f5489a;

    public C0264al(int i) {
        this.f5489a = i;
    }

    public void a(C0289bl blVar) {
        if (blVar.f5559h.length() > this.f5489a) {
            int length = blVar.f5559h.length();
            int i = this.f5489a;
            int i2 = length - i;
            String substring = blVar.f5559h.substring(0, i);
            blVar.f5559h = substring;
            blVar.j = Integer.valueOf(substring.length() + i2);
        }
    }
}
