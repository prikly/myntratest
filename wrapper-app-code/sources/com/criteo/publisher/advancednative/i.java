package com.criteo.publisher.advancednative;

import com.criteo.publisher.e0.c;
import com.criteo.publisher.k0.g;
import com.criteo.publisher.x;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.concurrent.Executor;

/* compiled from: ImpressionHelper */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private final g f2331a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f2332b;

    /* renamed from: c  reason: collision with root package name */
    private final c f2333c;

    public i(g gVar, Executor executor, c cVar) {
        this.f2331a = gVar;
        this.f2332b = executor;
        this.f2333c = cVar;
    }

    /* access modifiers changed from: package-private */
    public void a(Iterable<URL> iterable) {
        for (URL bVar : iterable) {
            this.f2332b.execute(new b(bVar, this.f2331a, (a) null));
        }
    }

    /* compiled from: ImpressionHelper */
    class a extends x {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CriteoNativeAdListener f2334c;

        a(i iVar, CriteoNativeAdListener criteoNativeAdListener) {
            this.f2334c = criteoNativeAdListener;
        }

        public void a() {
            this.f2334c.onAdImpression();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(CriteoNativeAdListener criteoNativeAdListener) {
        this.f2333c.a(new a(this, criteoNativeAdListener));
    }

    /* compiled from: ImpressionHelper */
    private static class b extends x {

        /* renamed from: c  reason: collision with root package name */
        private final URL f2335c;

        /* renamed from: d  reason: collision with root package name */
        private final g f2336d;

        /* synthetic */ b(URL url, g gVar, a aVar) {
            this(url, gVar);
        }

        private b(URL url, g gVar) {
            this.f2335c = url;
            this.f2336d = gVar;
        }

        public void a() throws IOException {
            InputStream a2 = this.f2336d.a(this.f2335c);
            if (a2 != null) {
                a2.close();
            }
        }
    }
}
