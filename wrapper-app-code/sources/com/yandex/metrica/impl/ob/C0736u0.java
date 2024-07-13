package com.yandex.metrica.impl.ob;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.yandex.metrica.impl.ob.u0  reason: case insensitive filesystem */
public enum C0736u0 {
    UNDEFINED("UNDEFINED"),
    APP("APP"),
    SATELLITE("SATELLITE"),
    RETAIL("RETAIL");
    

    /* renamed from: g  reason: collision with root package name */
    public static final a f6870g = null;

    /* renamed from: a  reason: collision with root package name */
    private final String f6871a;

    /* renamed from: com.yandex.metrica.impl.ob.u0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        f6870g = new a((DefaultConstructorMarker) null);
    }

    private C0736u0(String str) {
        this.f6871a = str;
    }

    public final String a() {
        return this.f6871a;
    }
}
