package com.yandex.metrica.billing.v3.library;

import android.content.Context;
import com.android.billingclient.api.BillingClient;
import com.yandex.metrica.billing_interface.f;
import com.yandex.metrica.impl.ob.C0442i;
import com.yandex.metrica.impl.ob.C0466j;
import com.yandex.metrica.impl.ob.C0491k;
import com.yandex.metrica.impl.ob.C0516l;
import com.yandex.metrica.impl.ob.C0541m;
import com.yandex.metrica.impl.ob.C0591o;
import java.util.concurrent.Executor;

public class c implements C0466j, C0491k {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Context f3477a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Executor f3478b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Executor f3479c;

    /* renamed from: d  reason: collision with root package name */
    private final C0516l f3480d;

    /* renamed from: e  reason: collision with root package name */
    private final C0591o f3481e;

    /* renamed from: f  reason: collision with root package name */
    private final C0541m f3482f;

    /* renamed from: g  reason: collision with root package name */
    private C0442i f3483g;

    class a extends f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0442i f3484a;

        a(C0442i iVar) {
            this.f3484a = iVar;
        }

        public void a() {
            BillingClient build = BillingClient.newBuilder(c.this.f3477a).setListener(new PurchasesUpdatedListenerImpl()).enablePendingPurchases().build();
            build.startConnection(new BillingClientStateListenerImpl(this.f3484a, c.this.f3478b, c.this.f3479c, build, c.this, new b(build)));
        }
    }

    public c(Context context, Executor executor, Executor executor2, C0516l lVar, C0591o oVar, C0541m mVar) {
        this.f3477a = context;
        this.f3478b = executor;
        this.f3479c = executor2;
        this.f3480d = lVar;
        this.f3481e = oVar;
        this.f3482f = mVar;
    }

    public C0541m d() {
        return this.f3482f;
    }

    public C0516l e() {
        return this.f3480d;
    }

    public C0591o f() {
        return this.f3481e;
    }

    public synchronized void a(C0442i iVar) {
        this.f3483g = iVar;
    }

    public void b() throws Throwable {
        C0442i iVar = this.f3483g;
        if (iVar != null) {
            this.f3479c.execute(new a(iVar));
        }
    }

    public Executor c() {
        return this.f3479c;
    }

    public Executor a() {
        return this.f3478b;
    }
}
