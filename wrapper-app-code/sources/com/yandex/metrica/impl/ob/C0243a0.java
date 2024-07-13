package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.content.Context;
import com.yandex.metrica.IReporter;
import com.yandex.metrica.impl.ob.C0640q;

/* renamed from: com.yandex.metrica.impl.ob.a0  reason: case insensitive filesystem */
public final class C0243a0 {

    /* renamed from: a  reason: collision with root package name */
    private Context f5442a;

    /* renamed from: b  reason: collision with root package name */
    private final C0640q.b f5443b;

    /* renamed from: c  reason: collision with root package name */
    private final C0640q f5444c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final IReporter f5445d;

    /* renamed from: com.yandex.metrica.impl.ob.a0$a */
    static final class a implements C0640q.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0243a0 f5446a;

        a(C0243a0 a0Var) {
            this.f5446a = a0Var;
        }

        public final void a(Activity activity, C0640q.a aVar) {
            int ordinal = aVar.ordinal();
            if (ordinal == 1) {
                this.f5446a.f5445d.resumeSession();
            } else if (ordinal == 2) {
                this.f5446a.f5445d.pauseSession();
            }
        }
    }

    public C0243a0(C0640q qVar) {
        this(qVar, (IReporter) null, 2);
    }

    public C0243a0(C0640q qVar, IReporter iReporter) {
        this.f5444c = qVar;
        this.f5445d = iReporter;
        this.f5443b = new a(this);
    }

    public final synchronized void a(Context context) {
        if (this.f5442a == null) {
            Context applicationContext = context.getApplicationContext();
            this.f5444c.a(applicationContext);
            this.f5444c.a(this.f5443b, C0640q.a.RESUMED, C0640q.a.PAUSED);
            this.f5442a = applicationContext;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C0243a0(com.yandex.metrica.impl.ob.C0640q r1, com.yandex.metrica.IReporter r2, int r3) {
        /*
            r0 = this;
            r2 = r3 & 2
            if (r2 == 0) goto L_0x000e
            com.yandex.metrica.impl.ob.M0 r2 = com.yandex.metrica.impl.ob.C0609oh.a()
            java.lang.String r3 = "YandexMetricaSelfReportFacade.getReporter()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            goto L_0x000f
        L_0x000e:
            r2 = 0
        L_0x000f:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0243a0.<init>(com.yandex.metrica.impl.ob.q, com.yandex.metrica.IReporter, int):void");
    }
}
