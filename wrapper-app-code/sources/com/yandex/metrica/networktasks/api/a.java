package com.yandex.metrica.networktasks.api;

import android.text.TextUtils;
import com.yandex.metrica.network.NetworkClient;
import com.yandex.metrica.network.Request;
import com.yandex.metrica.network.Response;
import javax.net.ssl.SSLSocketFactory;

class a {
    a() {
    }

    public Response a(String str, String str2, SSLSocketFactory sSLSocketFactory) {
        Request.Builder withMethod = new Request.Builder(str2).withMethod("GET");
        if (!TextUtils.isEmpty(str)) {
            withMethod.addHeader("If-None-Match", str);
        }
        NetworkClient.Builder withSslSocketFactory = new NetworkClient.Builder().withInstanceFollowRedirects(true).withSslSocketFactory(sSLSocketFactory);
        int i = com.yandex.metrica.networktasks.impl.a.f7346a;
        return withSslSocketFactory.withConnectTimeout(i).withReadTimeout(i).build().newCall(withMethod.build()).execute();
    }
}
