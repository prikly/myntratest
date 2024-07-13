package com.criteo.publisher.i0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: IntegrationDetector.kt */
public class b {
    static {
        new a((DefaultConstructorMarker) null);
    }

    public boolean b() {
        return a("com.criteo.mediation.mopub.CriteoBannerAdapter");
    }

    public boolean a() {
        return a("com.criteo.mediation.google.CriteoAdapter");
    }

    private boolean a(String str) {
        try {
            Class.forName(str, false, b.class.getClassLoader());
            return true;
        } catch (ClassNotFoundException | LinkageError unused) {
            return false;
        }
    }

    /* compiled from: IntegrationDetector.kt */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
