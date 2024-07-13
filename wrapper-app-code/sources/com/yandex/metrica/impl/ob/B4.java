package com.yandex.metrica.impl.ob;

import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.coreutils.services.TimeProvider;
import com.yandex.metrica.networktasks.api.ConfigProvider;
import com.yandex.metrica.networktasks.api.DefaultResponseParser;
import com.yandex.metrica.networktasks.api.FullUrlFormer;
import com.yandex.metrica.networktasks.api.NetworkResponseHandler;
import com.yandex.metrica.networktasks.api.RequestDataHolder;
import com.yandex.metrica.networktasks.api.ResponseDataHolder;
import com.yandex.metrica.networktasks.api.RetryPolicyConfig;
import com.yandex.metrica.networktasks.api.UnderlyingNetworkTask;
import java.util.Collection;
import javax.net.ssl.SSLSocketFactory;

public class B4 implements UnderlyingNetworkTask {

    /* renamed from: a  reason: collision with root package name */
    private final ConfigProvider<D4> f3731a;

    /* renamed from: b  reason: collision with root package name */
    private final C0293c0 f3732b;

    /* renamed from: c  reason: collision with root package name */
    private final E4 f3733c;

    /* renamed from: d  reason: collision with root package name */
    private final TimeProvider f3734d = new SystemTimeProvider();

    /* renamed from: e  reason: collision with root package name */
    private final Ql f3735e = new Ql();

    /* renamed from: f  reason: collision with root package name */
    private final String f3736f;

    /* renamed from: g  reason: collision with root package name */
    private final C0276b8 f3737g;

    /* renamed from: h  reason: collision with root package name */
    private final FullUrlFormer<D4> f3738h;
    private final RequestDataHolder i;
    private final ResponseDataHolder j;
    private final NetworkResponseHandler<DefaultResponseParser.Response> k;

    public B4(ConfigProvider<D4> configProvider, C0293c0 c0Var, E4 e4, C0276b8 b8Var, NetworkResponseHandler<DefaultResponseParser.Response> networkResponseHandler, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, FullUrlFormer<D4> fullUrlFormer) {
        this.f3731a = configProvider;
        this.f3732b = c0Var;
        this.f3733c = e4;
        this.f3737g = b8Var;
        this.i = requestDataHolder;
        this.j = responseDataHolder;
        this.k = networkResponseHandler;
        this.f3738h = fullUrlFormer;
        this.f3736f = B4.class.getName() + "@" + Integer.toHexString(hashCode());
    }

    public String description() {
        return this.f3736f;
    }

    public FullUrlFormer<?> getFullUrlFormer() {
        return this.f3738h;
    }

    public RequestDataHolder getRequestDataHolder() {
        return this.i;
    }

    public ResponseDataHolder getResponseDataHolder() {
        return this.j;
    }

    public RetryPolicyConfig getRetryPolicyConfig() {
        return null;
    }

    public SSLSocketFactory getSslSocketFactory() {
        F0.g().t().getClass();
        return null;
    }

    public boolean onCreateTask() {
        D4 d4 = (D4) this.f3731a.getConfig();
        if (!(d4.x() && !A2.b((Collection) d4.C()))) {
            return false;
        }
        this.f3738h.setHosts(d4.C());
        byte[] a2 = new C4(this.f3732b, d4, this.f3733c, new O3(this.f3737g), new C0316cn(1024, "diagnostic event name"), new C0316cn(204800, "diagnostic event value"), new SystemTimeProvider()).a();
        byte[] bArr = null;
        try {
            bArr = this.f3735e.compress(a2);
        } catch (Throwable unused) {
        }
        if (!A2.a(bArr)) {
            this.i.setHeader("Content-Encoding", "gzip");
            a2 = bArr;
        }
        this.i.setPostData(a2);
        return true;
    }

    public void onPerformRequest() {
        this.i.applySendTime(this.f3734d.currentTimeMillis());
    }

    public void onPostRequestComplete(boolean z) {
    }

    public boolean onRequestComplete() {
        DefaultResponseParser.Response response = (DefaultResponseParser.Response) this.k.handle(this.j);
        return response != null && "accepted".equals(response.mStatus);
    }

    public void onRequestError(Throwable th) {
    }

    public void onShouldNotExecute() {
    }

    public void onSuccessfulTaskFinished() {
    }

    public void onTaskAdded() {
    }

    public void onTaskFinished() {
    }

    public void onTaskRemoved() {
    }

    public void onUnsuccessfulTaskFinished() {
    }
}
