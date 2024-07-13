package com.bykv.vk.openvk.component.video.a.b;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.List;

/* compiled from: SkipProxySelector */
class j extends ProxySelector {

    /* renamed from: a  reason: collision with root package name */
    private static final List<Proxy> f18089a = Collections.singletonList(Proxy.NO_PROXY);

    /* renamed from: b  reason: collision with root package name */
    private final ProxySelector f18090b = ProxySelector.getDefault();

    /* renamed from: c  reason: collision with root package name */
    private final String f18091c;

    /* renamed from: d  reason: collision with root package name */
    private final int f18092d;

    private j(String str, int i) {
        this.f18091c = str;
        this.f18092d = i;
    }

    public List<Proxy> select(URI uri) {
        if (uri != null) {
            return (!this.f18091c.equalsIgnoreCase(uri.getHost()) || this.f18092d != uri.getPort()) ? this.f18090b.select(uri) : f18089a;
        }
        throw new IllegalArgumentException("URI can't be null");
    }

    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        this.f18090b.connectFailed(uri, socketAddress, iOException);
    }

    static void a(String str, int i) {
        ProxySelector.setDefault(new j(str, i));
    }
}
