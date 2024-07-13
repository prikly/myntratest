package com.yandex.metrica.impl.ob;

import android.util.Pair;

/* renamed from: com.yandex.metrica.impl.ob.s  reason: case insensitive filesystem */
public class C0687s {

    /* renamed from: a  reason: collision with root package name */
    private C0265am f6762a;

    /* renamed from: b  reason: collision with root package name */
    private long f6763b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6764c;

    /* renamed from: d  reason: collision with root package name */
    private final C0291bn f6765d;

    /* renamed from: com.yandex.metrica.impl.ob.s$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f6766a;

        /* renamed from: b  reason: collision with root package name */
        public final long f6767b;

        public a(String str, long j) {
            this.f6766a = str;
            this.f6767b = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f6767b != aVar.f6767b) {
                return false;
            }
            String str = this.f6766a;
            String str2 = aVar.f6766a;
            if (str != null) {
                if (!str.equals(str2)) {
                    return false;
                }
                return true;
            } else if (str2 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f6766a;
            int hashCode = str != null ? str.hashCode() : 0;
            long j = this.f6767b;
            return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        }
    }

    public C0687s(String str, long j, C0315cm cmVar) {
        this(str, j, new C0291bn(cmVar, "[App Environment]"));
    }

    public synchronized void a(Pair<String, String> pair) {
        if (this.f6765d.b(this.f6762a, (String) pair.first, (String) pair.second)) {
            this.f6764c = true;
        }
    }

    public synchronized void b() {
        this.f6762a = new C0265am();
    }

    public synchronized String toString() {
        return "Map size " + this.f6762a.size() + ". Is changed " + this.f6764c + ". Current revision " + this.f6763b;
    }

    C0687s(String str, long j, C0291bn bnVar) {
        this.f6763b = j;
        try {
            this.f6762a = new C0265am(str);
        } catch (Throwable unused) {
            this.f6762a = new C0265am();
        }
        this.f6765d = bnVar;
    }

    public synchronized a a() {
        if (this.f6764c) {
            this.f6763b++;
            this.f6764c = false;
        }
        return new a(Tl.g(this.f6762a), this.f6763b);
    }
}
