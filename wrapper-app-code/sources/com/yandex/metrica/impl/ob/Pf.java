package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.e;
import java.util.HashMap;
import java.util.Map;

public class Pf {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Of> f4774a = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Sf f4775b;

    /* renamed from: c  reason: collision with root package name */
    private final ICommonExecutor f4776c;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f4777a;

        a(Context context) {
            this.f4777a = context;
        }

        public void run() {
            Sf a2 = Pf.this.f4775b;
            Context context = this.f4777a;
            a2.getClass();
            R2.a(context);
        }
    }

    private static class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final Pf f4779a = new Pf(P.g().c(), new Sf());
    }

    Pf(ICommonExecutor iCommonExecutor, Sf sf) {
        this.f4776c = iCommonExecutor;
        this.f4775b = sf;
    }

    private Of b(Context context, String str) {
        this.f4775b.getClass();
        if (R2.k() == null) {
            this.f4776c.execute(new a(context));
        }
        Of of = new Of(this.f4776c, context, str);
        this.f4774a.put(str, of);
        return of;
    }

    public static Pf a() {
        return b.f4779a;
    }

    public Of a(Context context, String str) {
        Of of = this.f4774a.get(str);
        if (of == null) {
            synchronized (this.f4774a) {
                of = this.f4774a.get(str);
                if (of == null) {
                    Of b2 = b(context, str);
                    b2.d(str);
                    of = b2;
                }
            }
        }
        return of;
    }

    public Of a(Context context, e eVar) {
        Of of = this.f4774a.get(eVar.apiKey);
        if (of == null) {
            synchronized (this.f4774a) {
                of = this.f4774a.get(eVar.apiKey);
                if (of == null) {
                    Of b2 = b(context, eVar.apiKey);
                    b2.a(eVar);
                    of = b2;
                }
            }
        }
        return of;
    }
}
