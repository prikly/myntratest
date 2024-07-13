package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.YandexMetricaConfig;

/* renamed from: com.yandex.metrica.impl.ob.ua  reason: case insensitive filesystem */
public class C0746ua {

    /* renamed from: com.yandex.metrica.impl.ob.ua$a */
    class a implements C0589nm<C0674ra, C0651qa> {
        a(C0746ua uaVar) {
        }

        public Object a(Object obj) {
            return ((C0674ra) obj).f6692a;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ua$b */
    class b implements C0589nm<C0674ra, C0651qa> {
        b(C0746ua uaVar) {
        }

        public Object a(Object obj) {
            return ((C0674ra) obj).f6694c;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ua$c */
    class c implements C0794wa {
        c(C0746ua uaVar) {
        }

        public long a(Z8 z8) {
            return z8.c(Long.MAX_VALUE);
        }

        public void a(Z8 z8, long j) {
            z8.e(j);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ua$d */
    class d implements C0589nm<C0674ra, C0651qa> {
        d(C0746ua uaVar) {
        }

        public Object a(Object obj) {
            return ((C0674ra) obj).f6693b;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ua$e */
    class e implements C0794wa {
        e(C0746ua uaVar) {
        }

        public long a(Z8 z8) {
            return z8.b(Long.MAX_VALUE);
        }

        public void a(Z8 z8, long j) {
            z8.d(j);
        }
    }

    public C0722ta<YandexMetricaConfig> a(Context context, Q0 q0) {
        Xl xl = new Xl();
        return new C0722ta(context, q0, "activation", new C0577na(xl, new C0842ya()), new a(this), new C0602oa(xl));
    }

    public C0722ta<C0763v3> b(Context context, Q0 q0) {
        return new C0722ta(context, q0, "clids_info", new C0627pa(), new d(this), new e(this));
    }

    public C0722ta<Ud> c(Context context, Q0 q0) {
        return new C0722ta(context, q0, "preload_info", new C0818xa(), new b(this), new c(this));
    }
}
