package com.yandex.metrica.impl.ob;

import android.content.Intent;
import com.applovin.sdk.AppLovinEventTypes;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import java.util.ArrayList;
import java.util.List;

public class E {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final ICommonExecutor f3892a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public volatile b f3893b;

    /* renamed from: c  reason: collision with root package name */
    private final List<c> f3894c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private final C0564mm<Intent> f3895d;

    class a implements C0564mm<Intent> {
        a() {
        }

        public void b(Object obj) {
            b.a aVar;
            Intent intent = (Intent) obj;
            b a2 = E.this.f3893b;
            if (a2 == null) {
                aVar = null;
            } else {
                aVar = a2.f3898b;
            }
            b a3 = E.this.a(intent);
            b unused = E.this.f3893b = a3;
            if (aVar != a3.f3898b) {
                E.this.f3892a.execute(new D(this, a3));
            }
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Integer f3897a;

        /* renamed from: b  reason: collision with root package name */
        public final a f3898b;

        public enum a {
            UNKNOWN(-1),
            NONE(0),
            USB(1),
            WIRELESS(2),
            AC(3);
            

            /* renamed from: a  reason: collision with root package name */
            private final int f3905a;

            private a(int i) {
                this.f3905a = i;
            }

            public int a() {
                return this.f3905a;
            }

            public static a a(Integer num) {
                if (num != null) {
                    a[] values = values();
                    for (int i = 0; i < 5; i++) {
                        a aVar = values[i];
                        if (aVar.f3905a == num.intValue()) {
                            return aVar;
                        }
                    }
                }
                return UNKNOWN;
            }
        }

        public b(Integer num, a aVar) {
            this.f3897a = num;
            this.f3898b = aVar;
        }
    }

    public interface c {
        void a(b.a aVar);
    }

    public E(ICommonExecutor iCommonExecutor, C c2) {
        a aVar = new a();
        this.f3895d = aVar;
        this.f3892a = iCommonExecutor;
        this.f3893b = a(c2.c(aVar));
    }

    public b.a b() {
        b bVar = this.f3893b;
        return bVar == null ? b.a.UNKNOWN : bVar.f3898b;
    }

    public Integer a() {
        b bVar = this.f3893b;
        if (bVar == null) {
            return null;
        }
        return bVar.f3897a;
    }

    public synchronized void a(c cVar) {
        this.f3894c.add(cVar);
        ((C0653qc) cVar).a(b());
    }

    static void a(E e2, b.a aVar) {
        synchronized (e2) {
            for (c a2 : e2.f3894c) {
                a2.a(aVar);
            }
        }
    }

    /* access modifiers changed from: private */
    public b a(Intent intent) {
        b.a aVar = b.a.UNKNOWN;
        Integer num = null;
        if (intent != null) {
            int intExtra = intent.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra > 0 && intExtra2 > 0) {
                num = Integer.valueOf((intExtra * 100) / intExtra2);
            }
            int intExtra3 = intent.getIntExtra("plugged", -1);
            aVar = b.a.NONE;
            if (intExtra3 == 1) {
                aVar = b.a.AC;
            } else if (intExtra3 == 2) {
                aVar = b.a.USB;
            } else if (intExtra3 == 4) {
                aVar = b.a.WIRELESS;
            }
        }
        return new b(num, aVar);
    }
}
