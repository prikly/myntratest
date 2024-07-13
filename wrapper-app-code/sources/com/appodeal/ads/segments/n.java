package com.appodeal.ads.segments;

import android.content.Context;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.r0;
import com.appodeal.ads.segments.j;
import com.appodeal.ads.u;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONObject;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final Lazy f17279a = LazyKt.lazy(b.f17285a);

    /* renamed from: b  reason: collision with root package name */
    public static final k f17280b;

    /* renamed from: c  reason: collision with root package name */
    public static final LinkedHashSet f17281c = new LinkedHashSet();

    /* renamed from: d  reason: collision with root package name */
    public static final CopyOnWriteArrayList f17282d = new CopyOnWriteArrayList();

    /* renamed from: e  reason: collision with root package name */
    public static k f17283e;

    /* renamed from: f  reason: collision with root package name */
    public static k f17284f;

    public interface a {
        void a();
    }

    public static final class b extends Lambda implements Function0<com.appodeal.ads.context.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f17285a = new b();

        public b() {
            super(0);
        }

        public final Object invoke() {
            return com.appodeal.ads.context.b.f16327b;
        }
    }

    public static final class c extends Lambda implements Function0<Unit> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f17286a = new c();

        public c() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return Unit.INSTANCE;
        }
    }

    static {
        k kVar = new k(new JSONObject());
        f17280b = kVar;
        f17283e = kVar;
        j.a((j.a) $$Lambda$bZjIxFBHinEhqo870DEpNnWYRaE.INSTANCE);
        q.a(c());
    }

    public static final void a() {
        a(((ContextProvider) f17279a.getValue()).getApplicationContextOrNull(), (Function0<Unit>) o.f17287a);
    }

    public static final void a(Context context, Function0<Unit> function0) {
        Object obj;
        Intrinsics.checkNotNullParameter(function0, "onUpdated");
        if (f17284f == null) {
            Iterator it = f17281c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                k kVar = (k) obj;
                if (j.a(context, kVar.f17274c, kVar.f17275d)) {
                    break;
                }
            }
            k kVar2 = (k) obj;
            if (kVar2 == null) {
                kVar2 = f17280b;
            }
            if (kVar2.b() != f17283e.b()) {
                kVar2.a();
                f17283e = kVar2;
                q.a(c());
                function0.invoke();
            }
        }
    }

    public static final void a(Context context, JSONArray jSONArray) {
        if (context != null && jSONArray != null) {
            f17281c.clear();
            int i = 0;
            int length = jSONArray.length();
            while (i < length) {
                int i2 = i + 1;
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    f17281c.add(new k(optJSONObject));
                }
                i = i2;
            }
            a(context, (Function0<Unit>) c.f17286a);
        }
    }

    public static final void a(u.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        f17282d.add(bVar);
    }

    public static final void b() {
        r0.d();
        Iterator it = f17282d.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a();
        }
    }

    public static final k c() {
        k kVar = f17284f;
        return kVar == null ? f17283e : kVar;
    }

    public static final void a(Context context) {
        a(context, (Function0<Unit>) o.f17287a);
    }

    public static void a(Context context, JSONObject jSONObject) {
        p pVar = p.f17288a;
        Intrinsics.checkNotNullParameter(pVar, "onUpdated");
        if (context != null && jSONObject != null) {
            f17281c.clear();
            k kVar = new k(jSONObject);
            long b2 = kVar.b();
            k kVar2 = f17284f;
            if (!(kVar2 != null && b2 == kVar2.b())) {
                kVar.a();
                f17284f = kVar;
                q.a(c());
                pVar.invoke();
            }
        }
    }
}
