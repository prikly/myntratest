package com.yandex.metrica.network;

import com.yandex.metrica.network.impl.c;
import com.yandex.metrica.network.impl.d;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;

public class NetworkClient {

    /* renamed from: a  reason: collision with root package name */
    private final Integer f7259a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f7260b;

    /* renamed from: c  reason: collision with root package name */
    private final SSLSocketFactory f7261c;

    /* renamed from: d  reason: collision with root package name */
    private final Boolean f7262d;

    /* renamed from: e  reason: collision with root package name */
    private final Boolean f7263e;

    /* renamed from: f  reason: collision with root package name */
    private final int f7264f;

    public class Builder {

        /* renamed from: a  reason: collision with root package name */
        private Integer f7265a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f7266b;

        /* renamed from: c  reason: collision with root package name */
        private SSLSocketFactory f7267c;

        /* renamed from: d  reason: collision with root package name */
        private Boolean f7268d;

        /* renamed from: e  reason: collision with root package name */
        private Boolean f7269e;

        /* renamed from: f  reason: collision with root package name */
        private Integer f7270f;

        public NetworkClient build() {
            return new NetworkClient(this.f7265a, this.f7266b, this.f7267c, this.f7268d, this.f7269e, this.f7270f);
        }

        public Builder withConnectTimeout(int i) {
            this.f7265a = Integer.valueOf(i);
            return this;
        }

        public Builder withInstanceFollowRedirects(boolean z) {
            this.f7269e = Boolean.valueOf(z);
            return this;
        }

        public Builder withMaxResponseSize(int i) {
            this.f7270f = Integer.valueOf(i);
            return this;
        }

        public Builder withReadTimeout(int i) {
            this.f7266b = Integer.valueOf(i);
            return this;
        }

        public Builder withSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
            this.f7267c = sSLSocketFactory;
            return this;
        }

        public Builder withUseCaches(boolean z) {
            this.f7268d = Boolean.valueOf(z);
            return this;
        }
    }

    private NetworkClient(Integer num, Integer num2, SSLSocketFactory sSLSocketFactory, Boolean bool, Boolean bool2, Integer num3) {
        this.f7259a = num;
        this.f7260b = num2;
        this.f7261c = sSLSocketFactory;
        this.f7262d = bool;
        this.f7263e = bool2;
        this.f7264f = num3 == null ? Integer.MAX_VALUE : num3.intValue();
    }

    public Integer getConnectTimeout() {
        return this.f7259a;
    }

    public Boolean getInstanceFollowRedirects() {
        return this.f7263e;
    }

    public int getMaxResponseSize() {
        return this.f7264f;
    }

    public Integer getReadTimeout() {
        return this.f7260b;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.f7261c;
    }

    public Boolean getUseCaches() {
        return this.f7262d;
    }

    public Call newCall(Request request) {
        Intrinsics.checkNotNullParameter(this, "client");
        Intrinsics.checkNotNullParameter(request, "request");
        return new c(this, request, new d());
    }

    public String toString() {
        return "NetworkClient{connectTimeout=" + this.f7259a + ", readTimeout=" + this.f7260b + ", sslSocketFactory=" + this.f7261c + ", useCaches=" + this.f7262d + ", instanceFollowRedirects=" + this.f7263e + ", maxResponseSize=" + this.f7264f + '}';
    }
}
