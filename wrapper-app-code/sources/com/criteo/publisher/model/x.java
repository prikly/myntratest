package com.criteo.publisher.model;

import android.content.Context;
import com.criteo.publisher.i0.c;
import com.criteo.publisher.n0.b;
import com.criteo.publisher.n0.g;

/* compiled from: RemoteConfigRequestFactory */
public class x {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2858a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2859b;

    /* renamed from: c  reason: collision with root package name */
    private final g f2860c;

    /* renamed from: d  reason: collision with root package name */
    private final c f2861d;

    /* renamed from: e  reason: collision with root package name */
    private final b f2862e;

    public x(Context context, String str, g gVar, c cVar, b bVar) {
        this.f2858a = context;
        this.f2859b = str;
        this.f2860c = gVar;
        this.f2861d = cVar;
        this.f2862e = bVar;
    }

    public w a() {
        return w.a(this.f2859b, this.f2858a.getPackageName(), this.f2860c.q(), this.f2861d.b(), this.f2862e.b());
    }
}
