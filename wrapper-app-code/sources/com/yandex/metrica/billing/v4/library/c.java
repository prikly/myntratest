package com.yandex.metrica.billing.v4.library;

import android.content.Context;
import com.android.billingclient.api.BillingClient;
import com.yandex.metrica.billing_interface.f;
import com.yandex.metrica.impl.ob.C0442i;
import com.yandex.metrica.impl.ob.C0466j;
import com.yandex.metrica.impl.ob.C0491k;
import com.yandex.metrica.impl.ob.C0516l;
import com.yandex.metrica.impl.ob.C0541m;
import com.yandex.metrica.impl.ob.C0566n;
import com.yandex.metrica.impl.ob.C0591o;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

public final class c implements C0466j, C0491k {

    /* renamed from: a  reason: collision with root package name */
    private C0442i f3535a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Context f3536b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f3537c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f3538d;

    /* renamed from: e  reason: collision with root package name */
    private final C0541m f3539e;

    /* renamed from: f  reason: collision with root package name */
    private final C0516l f3540f;

    /* renamed from: g  reason: collision with root package name */
    private final C0591o f3541g;

    public static final class a extends f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f3542a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C0442i f3543b;

        a(c cVar, C0442i iVar) {
            this.f3542a = cVar;
            this.f3543b = iVar;
        }

        public void a() {
            BillingClient build = BillingClient.newBuilder(this.f3542a.f3536b).setListener(new PurchasesUpdatedListenerImpl()).enablePendingPurchases().build();
            Intrinsics.checkNotNullExpressionValue(build, "BillingClient\n          …                 .build()");
            build.startConnection(new BillingClientStateListenerImpl(this.f3543b, build, this.f3542a));
        }
    }

    public c(Context context, Executor executor, Executor executor2, C0566n nVar, C0541m mVar, C0516l lVar, C0591o oVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(executor, "workerExecutor");
        Intrinsics.checkNotNullParameter(executor2, "uiExecutor");
        Intrinsics.checkNotNullParameter(nVar, "billingInfoStorage");
        Intrinsics.checkNotNullParameter(mVar, "billingInfoSender");
        Intrinsics.checkNotNullParameter(lVar, "billingInfoManager");
        Intrinsics.checkNotNullParameter(oVar, "updatePolicy");
        this.f3536b = context;
        this.f3537c = executor;
        this.f3538d = executor2;
        this.f3539e = mVar;
        this.f3540f = lVar;
        this.f3541g = oVar;
    }

    public void b() {
        C0442i iVar = this.f3535a;
        if (iVar != null) {
            this.f3538d.execute(new a(this, iVar));
        }
    }

    public Executor c() {
        return this.f3538d;
    }

    public C0541m d() {
        return this.f3539e;
    }

    public C0516l e() {
        return this.f3540f;
    }

    public C0591o f() {
        return this.f3541g;
    }

    public synchronized void a(C0442i iVar) {
        this.f3535a = iVar;
    }

    public Executor a() {
        return this.f3537c;
    }
}
