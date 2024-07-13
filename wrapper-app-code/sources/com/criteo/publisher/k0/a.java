package com.criteo.publisher.k0;

import android.content.Context;
import com.criteo.publisher.l0.c;
import com.criteo.publisher.logging.g;
import com.criteo.publisher.logging.h;
import com.criteo.publisher.model.u;
import com.criteo.publisher.n0.b;
import com.criteo.publisher.n0.d;
import com.criteo.publisher.x;
import org.json.JSONObject;

/* compiled from: AppEventTask */
public class a extends x {

    /* renamed from: c  reason: collision with root package name */
    private final g f2557c = h.b(a.class);

    /* renamed from: d  reason: collision with root package name */
    private final Context f2558d;

    /* renamed from: e  reason: collision with root package name */
    private final d f2559e;

    /* renamed from: f  reason: collision with root package name */
    private final b f2560f;

    /* renamed from: g  reason: collision with root package name */
    private final g f2561g;

    /* renamed from: h  reason: collision with root package name */
    private final u f2562h;
    private final c i;
    private final String j;

    public a(Context context, d dVar, b bVar, g gVar, u uVar, c cVar, String str) {
        this.f2558d = context;
        this.f2559e = dVar;
        this.f2560f = bVar;
        this.f2561g = gVar;
        this.f2562h = uVar;
        this.i = cVar;
        this.j = str;
    }

    public void a() throws Throwable {
        boolean d2 = this.f2560f.d();
        String b2 = this.f2560f.b();
        g gVar = this.f2561g;
        String str = this.j;
        String a2 = this.i.a();
        JSONObject a3 = gVar.a(2379, this.f2558d.getPackageName(), b2, str, d2 ? 1 : 0, this.f2562h.b().get(), a2);
        this.f2557c.a("App event response: %s", a3);
        if (a3.has("throttleSec")) {
            this.f2559e.a(a3.optInt("throttleSec", 0));
        } else {
            this.f2559e.a(0);
        }
    }
}
