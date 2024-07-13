package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C0478jb;
import com.yandex.metrica.network.NetworkClient;
import com.yandex.metrica.network.Request;
import com.yandex.metrica.network.Response;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.kb  reason: case insensitive filesystem */
public final class C0503kb {

    /* renamed from: a  reason: collision with root package name */
    private final C0478jb f6089a;

    /* renamed from: b  reason: collision with root package name */
    private final Uh f6090b;

    public C0503kb(C0478jb jbVar, Uh uh) {
        this.f6089a = jbVar;
        this.f6090b = uh;
    }

    public final void a() {
        Request build = new Request.Builder(this.f6090b.c()).build();
        NetworkClient.Builder builder = new NetworkClient.Builder();
        F0 g2 = F0.g();
        Intrinsics.checkNotNullExpressionValue(g2, "GlobalServiceLocator.getInstance()");
        g2.t().getClass();
        String str = null;
        NetworkClient.Builder withSslSocketFactory = builder.withSslSocketFactory((SSLSocketFactory) null);
        int i = C0555md.f6218a;
        NetworkClient.Builder withReadTimeout = withSslSocketFactory.withConnectTimeout(i).withReadTimeout(i);
        boolean z = false;
        NetworkClient build2 = withReadTimeout.withUseCaches(false).withInstanceFollowRedirects(true).build();
        Intrinsics.checkNotNullExpressionValue(build2, "NetworkClient.Builder()\n…rue)\n            .build()");
        Response execute = build2.newCall(build).execute();
        Intrinsics.checkNotNullExpressionValue(execute, "client.newCall(request).execute()");
        C0478jb jbVar = this.f6089a;
        if (execute.getCode() == 200) {
            z = true;
        }
        int length = execute.getResponseData().length;
        int code = execute.getCode();
        Throwable exception = execute.getException();
        if (exception != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(exception.getClass().getSimpleName());
            sb.append(" : ");
            Intrinsics.checkNotNullExpressionValue(exception, "it");
            sb.append(exception.getLocalizedMessage());
            str = sb.toString();
        }
        jbVar.a(new C0478jb.a(z, code, length, str));
    }
}
