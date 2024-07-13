package com.bytedance.sdk.component.e.d;

/* compiled from: Logger */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private a f19184a;

    /* renamed from: b  reason: collision with root package name */
    private C0233b f19185b;

    /* compiled from: Logger */
    public enum a {
        DEBUG,
        INFO,
        ERROR,
        OFF
    }

    /* renamed from: com.bytedance.sdk.component.e.d.b$b  reason: collision with other inner class name */
    /* compiled from: Logger */
    public interface C0233b {
        void a(String str, String str2);

        void b(String str, String str2);
    }

    /* compiled from: Logger */
    private static class c {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final b f19191a = new b();
    }

    private b() {
        this.f19184a = a.OFF;
        this.f19185b = new a();
    }

    public static void a(a aVar) {
        synchronized (b.class) {
            c.f19191a.f19184a = aVar;
        }
    }

    public static void a(String str, String str2) {
        if (c.f19191a.f19184a.compareTo(a.ERROR) <= 0) {
            c.f19191a.f19185b.a(str, str2);
        }
    }

    public static void b(String str, String str2) {
        if (c.f19191a.f19184a.compareTo(a.DEBUG) <= 0) {
            c.f19191a.f19185b.b(str, str2);
        }
    }
}
