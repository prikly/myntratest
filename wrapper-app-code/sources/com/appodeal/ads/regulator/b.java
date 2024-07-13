package com.appodeal.ads.regulator;

import com.appodeal.consent.Consent;
import kotlin.jvm.internal.Intrinsics;

public interface b {

    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f17129a = new a();
    }

    /* renamed from: com.appodeal.ads.regulator.b$b  reason: collision with other inner class name */
    public static final class C0197b implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final C0197b f17130a = new C0197b();
    }

    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final c f17131a = new c();
    }

    public static final class d implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final d f17132a = new d();
    }

    public static final class e implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final e f17133a = new e();
    }

    public interface f extends b {

        public static final class a implements f {
            public a(Throwable th) {
                Intrinsics.checkNotNullParameter(th, "cause");
            }
        }

        /* renamed from: com.appodeal.ads.regulator.b$f$b  reason: collision with other inner class name */
        public static final class C0198b implements f {

            /* renamed from: a  reason: collision with root package name */
            public final Consent f17134a;

            public C0198b(Consent consent) {
                Intrinsics.checkNotNullParameter(consent, "consent");
                this.f17134a = consent;
            }

            public final Consent a() {
                return this.f17134a;
            }
        }
    }
}
