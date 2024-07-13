package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.an  reason: case insensitive filesystem */
public class C0266an {

    /* renamed from: a  reason: collision with root package name */
    private final C0341dn f5491a;

    /* renamed from: b  reason: collision with root package name */
    private final C0341dn f5492b;

    /* renamed from: c  reason: collision with root package name */
    private final Wm f5493c;

    /* renamed from: d  reason: collision with root package name */
    private final C0315cm f5494d;

    /* renamed from: e  reason: collision with root package name */
    private final String f5495e;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0266an(int r7, int r8, int r9, java.lang.String r10, com.yandex.metrica.impl.ob.C0315cm r11) {
        /*
            r6 = this;
            com.yandex.metrica.impl.ob.Wm r1 = new com.yandex.metrica.impl.ob.Wm
            r1.<init>(r7)
            com.yandex.metrica.impl.ob.dn r2 = new com.yandex.metrica.impl.ob.dn
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r10)
            java.lang.String r0 = "map key"
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r2.<init>(r8, r7, r11)
            com.yandex.metrica.impl.ob.dn r3 = new com.yandex.metrica.impl.ob.dn
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r10)
            java.lang.String r8 = "map value"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r3.<init>(r9, r7, r11)
            r0 = r6
            r4 = r10
            r5 = r11
            r0.<init>((com.yandex.metrica.impl.ob.Wm) r1, (com.yandex.metrica.impl.ob.C0341dn) r2, (com.yandex.metrica.impl.ob.C0341dn) r3, (java.lang.String) r4, (com.yandex.metrica.impl.ob.C0315cm) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0266an.<init>(int, int, int, java.lang.String, com.yandex.metrica.impl.ob.cm):void");
    }

    public Wm a() {
        return this.f5493c;
    }

    public C0341dn b() {
        return this.f5491a;
    }

    public C0341dn c() {
        return this.f5492b;
    }

    C0266an(Wm wm, C0341dn dnVar, C0341dn dnVar2, String str, C0315cm cmVar) {
        this.f5493c = wm;
        this.f5491a = dnVar;
        this.f5492b = dnVar2;
        this.f5495e = str;
        this.f5494d = cmVar;
    }

    public void a(String str) {
        if (this.f5494d.isEnabled()) {
            this.f5494d.fw("The %s has reached the limit of %d items. Item with key %s will be ignored", this.f5495e, Integer.valueOf(this.f5493c.a()), str);
        }
    }
}
