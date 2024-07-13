package com.criteo.publisher.i0;

import android.content.SharedPreferences;
import com.criteo.publisher.n0.o;
import com.criteo.publisher.n0.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntegrationRegistry.kt */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final q f2545a;

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f2546b;

    /* renamed from: c  reason: collision with root package name */
    private final b f2547c;

    static {
        new a((DefaultConstructorMarker) null);
    }

    public c(SharedPreferences sharedPreferences, b bVar) {
        Intrinsics.checkParameterIsNotNull(sharedPreferences, "sharedPreferences");
        Intrinsics.checkParameterIsNotNull(bVar, "integrationDetector");
        this.f2546b = sharedPreferences;
        this.f2547c = bVar;
        this.f2545a = new q(sharedPreferences);
    }

    public int b() {
        return c().a();
    }

    public void a(a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "integration");
        this.f2546b.edit().putString("CriteoCachedIntegration", aVar.name()).apply();
    }

    public a c() {
        a a2 = a();
        if (a2 != null) {
            return a2;
        }
        String a3 = this.f2545a.a("CriteoCachedIntegration", a.FALLBACK.name());
        if (a3 == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(a3, "safeSharedPreferences.ge…ion.FALLBACK.name\n    )!!");
        try {
            return a.valueOf(a3);
        } catch (IllegalArgumentException e2) {
            o.a((Throwable) e2);
            return a.FALLBACK;
        }
    }

    private a a() {
        boolean b2 = this.f2547c.b();
        boolean a2 = this.f2547c.a();
        if (b2 && a2) {
            return a.FALLBACK;
        }
        if (b2) {
            return a.MOPUB_MEDIATION;
        }
        if (a2) {
            return a.ADMOB_MEDIATION;
        }
        return null;
    }

    /* compiled from: IntegrationRegistry.kt */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
