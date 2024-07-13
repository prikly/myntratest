package com.bytedance.sdk.openadsdk.j;

/* compiled from: PlayableLog */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private static a f2060a;

    /* compiled from: PlayableLog */
    public interface a {
        void a(String str, String str2);

        void a(String str, String str2, Throwable th);
    }

    public static void a(a aVar) {
        f2060a = aVar;
    }

    public static boolean a() {
        return f2060a != null;
    }

    public static void a(String str, String str2) {
        a aVar = f2060a;
        if (aVar != null) {
            aVar.a(str, str2);
        }
    }

    public static void a(String str, String str2, Throwable th) {
        if (f2060a != null) {
            if (th == null) {
                th = new Throwable();
            }
            f2060a.a(str, str2, th);
        }
    }
}
