package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.yandex.metrica.impl.ob.j4  reason: case insensitive filesystem */
public class C0471j4 {

    /* renamed from: a  reason: collision with root package name */
    private final Object f6016a;

    /* renamed from: b  reason: collision with root package name */
    private final C0621p4 f6017b;

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<C0447i4, C0496k4> f6018c;

    /* renamed from: d  reason: collision with root package name */
    private final C0686rm<a, C0447i4> f6019d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f6020e;

    /* renamed from: f  reason: collision with root package name */
    private volatile int f6021f;

    /* renamed from: g  reason: collision with root package name */
    private final C0546m4 f6022g;

    /* renamed from: com.yandex.metrica.impl.ob.j4$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f6023a;

        /* renamed from: b  reason: collision with root package name */
        private final Integer f6024b;

        /* renamed from: c  reason: collision with root package name */
        private final String f6025c;

        a(String str, Integer num, String str2) {
            this.f6023a = str;
            this.f6024b = num;
            this.f6025c = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f6023a.equals(aVar.f6023a)) {
                return false;
            }
            Integer num = this.f6024b;
            if (num == null ? aVar.f6024b != null : !num.equals(aVar.f6024b)) {
                return false;
            }
            String str = this.f6025c;
            String str2 = aVar.f6025c;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.f6023a.hashCode() * 31;
            Integer num = this.f6024b;
            int i = 0;
            int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
            String str = this.f6025c;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode2 + i;
        }
    }

    public C0471j4(Context context, C0621p4 p4Var) {
        this(context, p4Var, new C0546m4());
    }

    public C0496k4 a(C0447i4 i4Var, D3 d3) {
        C0496k4 k4Var;
        synchronized (this.f6016a) {
            k4Var = this.f6018c.get(i4Var);
            if (k4Var == null) {
                k4Var = this.f6022g.a(i4Var).a(this.f6020e, this.f6017b, i4Var, d3);
                this.f6018c.put(i4Var, k4Var);
                this.f6019d.a(new a(i4Var.b(), i4Var.c(), i4Var.d()), i4Var);
                this.f6021f++;
            }
        }
        return k4Var;
    }

    C0471j4(Context context, C0621p4 p4Var, C0546m4 m4Var) {
        this.f6016a = new Object();
        this.f6018c = new HashMap<>();
        this.f6019d = new C0686rm<>();
        this.f6021f = 0;
        this.f6020e = context.getApplicationContext();
        this.f6017b = p4Var;
        this.f6022g = m4Var;
    }

    public void a(String str, int i, String str2) {
        Integer valueOf = Integer.valueOf(i);
        synchronized (this.f6016a) {
            Collection<C0447i4> b2 = this.f6019d.b(new a(str, valueOf, str2));
            if (!A2.b((Collection) b2)) {
                this.f6021f -= b2.size();
                ArrayList arrayList = new ArrayList(b2.size());
                for (C0447i4 remove : b2) {
                    arrayList.add(this.f6018c.remove(remove));
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C0496k4) it.next()).a();
                }
            }
        }
    }
}
