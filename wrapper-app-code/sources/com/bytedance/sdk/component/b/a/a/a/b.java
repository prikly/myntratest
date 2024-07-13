package com.bytedance.sdk.component.b.a.a.a;

import com.bytedance.sdk.component.b.a.g;
import com.bytedance.sdk.component.b.a.k;
import com.bytedance.sdk.component.b.a.m;
import java.io.IOException;
import java.util.List;

/* compiled from: NetChain */
public class b implements g.a {

    /* renamed from: a  reason: collision with root package name */
    List<g> f18849a;

    /* renamed from: b  reason: collision with root package name */
    k f18850b;

    /* renamed from: c  reason: collision with root package name */
    int f18851c = 0;

    b(List<g> list, k kVar) {
        this.f18849a = list;
        this.f18850b = kVar;
    }

    public k a() {
        return this.f18850b;
    }

    public m a(k kVar) throws IOException {
        this.f18850b = kVar;
        int i = this.f18851c + 1;
        this.f18851c = i;
        return this.f18849a.get(i).a(this);
    }
}
