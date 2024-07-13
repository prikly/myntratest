package com.bykv.vk.openvk.component.video.a.b;

import android.content.Context;
import android.util.Log;
import com.bykv.vk.openvk.component.video.a.b.a.b;
import com.bykv.vk.openvk.component.video.a.b.a.c;
import com.bytedance.sdk.component.utils.l;
import java.util.Collection;
import java.util.Set;

/* compiled from: Proxy */
public class e {

    /* renamed from: a  reason: collision with root package name */
    static volatile b f18015a;

    /* renamed from: b  reason: collision with root package name */
    static volatile c f18016b;

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f18017c = l.c();

    /* renamed from: d  reason: collision with root package name */
    public static volatile boolean f18018d;

    /* renamed from: e  reason: collision with root package name */
    static volatile boolean f18019e = true;

    /* renamed from: f  reason: collision with root package name */
    static volatile boolean f18020f;

    /* renamed from: g  reason: collision with root package name */
    static volatile int f18021g = 0;

    /* renamed from: h  reason: collision with root package name */
    public static volatile int f18022h = 3;
    public static volatile Integer i;
    /* access modifiers changed from: private */
    public static volatile com.bykv.vk.openvk.component.video.a.b.b.c j;
    private static volatile Context k;

    public static Context a() {
        return k;
    }

    public static void a(boolean z) {
        f18019e = z;
    }

    public static void b(boolean z) {
        f18020f = z;
    }

    public static void a(int i2) {
        f18021g = i2;
    }

    public static void a(c cVar, Context context) {
        if (cVar == null || context == null) {
            throw new IllegalArgumentException("DiskLruCache and Context can't be null !!!");
        }
        k = context.getApplicationContext();
        if (f18016b == null) {
            b bVar = f18015a;
            if (bVar == null || !bVar.f17948a.getAbsolutePath().equals(cVar.f17950a.getAbsolutePath())) {
                f18016b = cVar;
                j = com.bykv.vk.openvk.component.video.a.b.b.c.a(context);
                f18016b.a((c.a) new c.a() {
                    public void a(String str) {
                        if (e.f18017c) {
                            Log.i("TAG_PROXY_DiskLruCache", "new cache created: " + str);
                        }
                    }

                    public void a(Set<String> set) {
                        e.j.a((Collection<String>) set, 0);
                        if (e.f18017c) {
                            Log.i("TAG_PROXY_DiskLruCache", "cache file removed, " + set);
                        }
                    }
                });
                f a2 = f.a();
                a2.a(cVar);
                a2.a(j);
                d c2 = d.c();
                c2.a(cVar);
                c2.a(j);
                return;
            }
            throw new IllegalArgumentException("DiskLruCache 和 DiskCache 不能使用相同的目录");
        }
    }

    public static c b() {
        return f18016b;
    }

    public static b c() {
        return f18015a;
    }
}
