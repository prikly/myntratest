package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.yandex.metrica.impl.ob.um  reason: case insensitive filesystem */
public class C0758um {

    /* renamed from: c  reason: collision with root package name */
    private static volatile C0758um f6955c;

    /* renamed from: a  reason: collision with root package name */
    private final Context f6956a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, C0710sm> f6957b = new HashMap();

    C0758um(Context context) {
        this.f6956a = context;
    }

    public static C0758um a(Context context) {
        if (f6955c == null) {
            synchronized (C0758um.class) {
                if (f6955c == null) {
                    f6955c = new C0758um(context);
                }
            }
        }
        return f6955c;
    }

    public C0710sm a(String str) {
        if (!this.f6957b.containsKey(str)) {
            synchronized (this) {
                if (!this.f6957b.containsKey(str)) {
                    this.f6957b.put(str, new C0710sm(new ReentrantLock(), new C0734tm(this.f6956a, str)));
                }
            }
        }
        return this.f6957b.get(str);
    }
}
