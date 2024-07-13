package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import com.google.protobuf.nano.ym.MessageNano;
import com.yandex.metrica.networktasks.api.ConfigProvider;
import com.yandex.metrica.networktasks.api.DefaultNetworkResponseHandler;
import com.yandex.metrica.networktasks.api.FullUrlFormer;
import com.yandex.metrica.networktasks.api.RequestBodyEncrypter;
import com.yandex.metrica.networktasks.api.RequestDataHolder;
import com.yandex.metrica.networktasks.api.ResponseDataHolder;
import com.yandex.metrica.networktasks.api.RetryPolicyConfig;
import com.yandex.metrica.networktasks.api.SendingDataTaskHelper;
import com.yandex.metrica.networktasks.api.UnderlyingNetworkTask;
import java.util.Collection;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.yandex.metrica.impl.ob.cd  reason: case insensitive filesystem */
public class C0306cd implements UnderlyingNetworkTask {

    /* renamed from: a  reason: collision with root package name */
    private final C0690s2 f5616a;

    /* renamed from: b  reason: collision with root package name */
    private final C0554mc f5617b;

    /* renamed from: c  reason: collision with root package name */
    private final C0251a8 f5618c;

    /* renamed from: d  reason: collision with root package name */
    private final C0356ed f5619d;

    /* renamed from: e  reason: collision with root package name */
    private final Fc f5620e;

    /* renamed from: f  reason: collision with root package name */
    private final Pg f5621f;

    /* renamed from: g  reason: collision with root package name */
    private final FullUrlFormer<C0406gd> f5622g;

    /* renamed from: h  reason: collision with root package name */
    private final ConfigProvider<C0406gd> f5623h;
    private final RequestDataHolder i;
    private final ResponseDataHolder j;
    private final SendingDataTaskHelper k;
    private long l;
    private C0331dd m;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0306cd(Context context, C0690s2 s2Var, Fc fc, Pg pg, ConfigProvider<C0406gd> configProvider, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, FullUrlFormer<C0406gd> fullUrlFormer, RequestBodyEncrypter requestBodyEncrypter) {
        this(s2Var, fc, F0.g().w().a(), pg, new C0356ed(context), fullUrlFormer, requestDataHolder, responseDataHolder, configProvider, new SendingDataTaskHelper(requestBodyEncrypter, new Ql(), requestDataHolder, responseDataHolder, new DefaultNetworkResponseHandler()));
        Context context2 = context;
    }

    private boolean a() {
        C0331dd a2 = this.f5619d.a(this.f5617b.f6213d);
        this.m = a2;
        C0632pf pfVar = a2.f5660c;
        if (!(pfVar.f6443b.length == 0 && pfVar.f6442a.length == 0)) {
            return this.k.prepareAndSetPostData(MessageNano.toByteArray(pfVar));
        }
        return false;
    }

    private void b() {
        long f2 = this.f5618c.f() + 1;
        this.l = f2;
        this.f5621f.a(f2);
    }

    public String description() {
        return "LocationTask";
    }

    public FullUrlFormer<?> getFullUrlFormer() {
        return this.f5622g;
    }

    public RequestDataHolder getRequestDataHolder() {
        return this.i;
    }

    public ResponseDataHolder getResponseDataHolder() {
        return this.j;
    }

    public RetryPolicyConfig getRetryPolicyConfig() {
        return ((C0406gd) this.f5623h.getConfig()).q();
    }

    public SSLSocketFactory getSslSocketFactory() {
        F0.g().t().getClass();
        return null;
    }

    public boolean onCreateTask() {
        C0406gd gdVar = (C0406gd) this.f5623h.getConfig();
        if (!this.f5616a.d() && !TextUtils.isEmpty(gdVar.g()) && !TextUtils.isEmpty(gdVar.w()) && !A2.b((Collection) this.f5622g.getAllHosts())) {
            return a();
        }
        return false;
    }

    public void onPerformRequest() {
        this.k.onPerformRequest();
    }

    public void onPostRequestComplete(boolean z) {
        if (z || A2.b(this.j.getResponseCode())) {
            this.f5619d.a(this.m);
        }
        this.f5618c.c(this.l);
    }

    public boolean onRequestComplete() {
        return this.k.isResponseValid();
    }

    public void onRequestError(Throwable th) {
        this.f5618c.c(this.l);
    }

    public void onShouldNotExecute() {
    }

    public void onSuccessfulTaskFinished() {
        this.f5620e.a();
    }

    public void onTaskAdded() {
    }

    public void onTaskFinished() {
    }

    public void onTaskRemoved() {
    }

    public void onUnsuccessfulTaskFinished() {
    }

    C0306cd(C0690s2 s2Var, Fc fc, C0251a8 a8Var, Pg pg, C0356ed edVar, FullUrlFormer<C0406gd> fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, ConfigProvider<C0406gd> configProvider, SendingDataTaskHelper sendingDataTaskHelper) {
        this.k = sendingDataTaskHelper;
        this.f5616a = s2Var;
        this.f5620e = fc;
        this.f5623h = configProvider;
        C0406gd gdVar = (C0406gd) configProvider.getConfig();
        this.f5617b = gdVar.z();
        this.f5618c = a8Var;
        this.f5619d = edVar;
        this.f5621f = pg;
        this.i = requestDataHolder;
        this.j = responseDataHolder;
        this.f5622g = fullUrlFormer;
        b();
        fullUrlFormer.setHosts(gdVar.A());
    }
}
