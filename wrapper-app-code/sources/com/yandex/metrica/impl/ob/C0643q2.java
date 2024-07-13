package com.yandex.metrica.impl.ob;

import com.yandex.metrica.networktasks.api.ConfigProvider;
import com.yandex.metrica.networktasks.api.FullUrlFormer;
import com.yandex.metrica.networktasks.api.NetworkResponseHandler;
import com.yandex.metrica.networktasks.api.RequestDataHolder;
import com.yandex.metrica.networktasks.api.ResponseDataHolder;
import com.yandex.metrica.networktasks.api.RetryPolicyConfig;
import com.yandex.metrica.networktasks.api.UnderlyingNetworkTask;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.yandex.metrica.impl.ob.q2  reason: case insensitive filesystem */
public class C0643q2 implements UnderlyingNetworkTask {

    /* renamed from: a  reason: collision with root package name */
    private final C0682ri f6541a;

    /* renamed from: b  reason: collision with root package name */
    private Ui f6542b;

    /* renamed from: c  reason: collision with root package name */
    private C0411gi f6543c;

    /* renamed from: d  reason: collision with root package name */
    private final RequestDataHolder f6544d;

    /* renamed from: e  reason: collision with root package name */
    private final ConfigProvider<Mg> f6545e;

    /* renamed from: f  reason: collision with root package name */
    private final ResponseDataHolder f6546f;

    /* renamed from: g  reason: collision with root package name */
    private final FullUrlFormer<Mg> f6547g;

    /* renamed from: h  reason: collision with root package name */
    private final NetworkResponseHandler<Ui> f6548h;

    public C0643q2(C0682ri riVar, FullUrlFormer<Mg> fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, ConfigProvider<Mg> configProvider) {
        this(riVar, new C0619p2(), fullUrlFormer, requestDataHolder, responseDataHolder, configProvider);
    }

    public String description() {
        return "Startup task for component: " + this.f6541a.a().toString();
    }

    public FullUrlFormer<?> getFullUrlFormer() {
        return this.f6547g;
    }

    public RequestDataHolder getRequestDataHolder() {
        return this.f6544d;
    }

    public ResponseDataHolder getResponseDataHolder() {
        return this.f6546f;
    }

    public RetryPolicyConfig getRetryPolicyConfig() {
        return ((Mg) this.f6545e.getConfig()).q();
    }

    public SSLSocketFactory getSslSocketFactory() {
        F0.g().t().getClass();
        return null;
    }

    public boolean onCreateTask() {
        this.f6544d.setHeader("Accept-Encoding", "encrypted");
        return this.f6541a.e();
    }

    public void onPerformRequest() {
    }

    public void onPostRequestComplete(boolean z) {
        if (!z) {
            this.f6543c = C0411gi.PARSE;
        }
    }

    public boolean onRequestComplete() {
        Ui ui = (Ui) this.f6548h.handle(this.f6546f);
        this.f6542b = ui;
        return ui != null;
    }

    public void onRequestError(Throwable th) {
        this.f6543c = C0411gi.NETWORK;
    }

    public void onShouldNotExecute() {
        this.f6543c = C0411gi.NETWORK;
    }

    public void onSuccessfulTaskFinished() {
        if (this.f6542b != null && this.f6546f.getResponseHeaders() != null) {
            this.f6541a.a(this.f6542b, (Mg) this.f6545e.getConfig(), (Map<String, List<String>>) this.f6546f.getResponseHeaders());
        }
    }

    public void onTaskAdded() {
    }

    public void onTaskFinished() {
    }

    public void onTaskRemoved() {
    }

    public void onUnsuccessfulTaskFinished() {
        if (this.f6543c == null) {
            this.f6543c = C0411gi.UNKNOWN;
        }
        this.f6541a.a(this.f6543c);
    }

    C0643q2(C0682ri riVar, C0619p2 p2Var, FullUrlFormer<Mg> fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, ConfigProvider<Mg> configProvider) {
        this.f6541a = riVar;
        this.f6548h = p2Var;
        this.f6544d = requestDataHolder;
        this.f6546f = responseDataHolder;
        this.f6545e = configProvider;
        this.f6547g = fullUrlFormer;
        fullUrlFormer.setHosts(((Mg) configProvider.getConfig()).I());
    }
}
