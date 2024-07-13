package com.appodeal.ads;

public enum a {
    BOTTOM("bottom", 81, 81),
    TOP("top", 49, 49),
    VIEW("bannerview", 17, 17);
    

    /* renamed from: a  reason: collision with root package name */
    public final String f16163a;

    /* renamed from: b  reason: collision with root package name */
    public final int f16164b;

    /* renamed from: c  reason: collision with root package name */
    public final int f16165c;

    /* 'enum' modifier removed */
    /* renamed from: com.appodeal.ads.a$a  reason: collision with other inner class name */
    public final class C0160a extends a {
        public C0160a() {
            super("LEFT", 2, "left", 19);
        }

        public final int a() {
            return r0.f17092h;
        }
    }

    /* 'enum' modifier removed */
    public final class b extends a {
        public b() {
            super("RIGHT", 3, "right", 21);
        }

        public final int a() {
            return r0.i;
        }
    }

    /* access modifiers changed from: public */
    a() {
        throw null;
    }

    /* access modifiers changed from: public */
    a(String str, int i2, int i3) {
        this.f16163a = str;
        this.f16164b = i2;
        this.f16165c = i3;
    }

    public int a() {
        return 0;
    }
}
