package com.appodeal.ads.segments;

public enum b {
    ;
    

    /* renamed from: a  reason: collision with root package name */
    public final String f17242a;

    /* renamed from: b  reason: collision with root package name */
    public final c f17243b;

    /* access modifiers changed from: public */
    b(String str, c cVar) {
        this.f17242a = str;
        this.f17243b = cVar;
    }

    public static b a(String str) {
        for (b bVar : values()) {
            if (bVar.f17242a.equals(str)) {
                return bVar;
            }
        }
        return null;
    }
}
