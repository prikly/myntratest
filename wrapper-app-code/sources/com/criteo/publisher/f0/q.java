package com.criteo.publisher.f0;

import com.criteo.publisher.n0.l;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: MetricParser */
public class q {

    /* renamed from: a  reason: collision with root package name */
    private final l f2492a;

    public q(l lVar) {
        this.f2492a = lVar;
    }

    /* access modifiers changed from: package-private */
    public n a(InputStream inputStream) throws IOException {
        return (n) this.f2492a.a(n.class, inputStream);
    }

    /* access modifiers changed from: package-private */
    public void a(n nVar, OutputStream outputStream) throws IOException {
        this.f2492a.a((Object) nVar, outputStream);
    }
}
