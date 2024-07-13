package com.yandex.metrica.network.impl;

import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class b extends Lambda implements Function0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HttpsURLConnection f7286a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    b(HttpsURLConnection httpsURLConnection) {
        super(0);
        this.f7286a = httpsURLConnection;
    }

    public Object invoke() {
        return this.f7286a.getErrorStream();
    }
}
