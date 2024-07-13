package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.p4  reason: case insensitive filesystem */
public class C0621p4 {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, X3> f6429a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<String, F3> f6430b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final Context f6431c;

    public C0621p4(Context context) {
        this.f6431c = context.getApplicationContext();
    }

    public synchronized X3 a(I3 i3) {
        return this.f6429a.get(i3.toString());
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.yandex.metrica.impl.ob.N3, com.yandex.metrica.impl.ob.N3<com.yandex.metrica.impl.ob.X3>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.yandex.metrica.impl.ob.X3 b(com.yandex.metrica.impl.ob.I3 r2, com.yandex.metrica.impl.ob.D3 r3, com.yandex.metrica.impl.ob.N3<com.yandex.metrica.impl.ob.X3> r4) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.HashMap<java.lang.String, com.yandex.metrica.impl.ob.X3> r0 = r1.f6429a     // Catch:{ all -> 0x000b }
            com.yandex.metrica.impl.ob.R3 r2 = r1.a(r2, r3, r4, r0)     // Catch:{ all -> 0x000b }
            com.yandex.metrica.impl.ob.X3 r2 = (com.yandex.metrica.impl.ob.X3) r2     // Catch:{ all -> 0x000b }
            monitor-exit(r1)
            return r2
        L_0x000b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0621p4.b(com.yandex.metrica.impl.ob.I3, com.yandex.metrica.impl.ob.D3, com.yandex.metrica.impl.ob.N3):com.yandex.metrica.impl.ob.X3");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.yandex.metrica.impl.ob.N3, com.yandex.metrica.impl.ob.N3<com.yandex.metrica.impl.ob.F3>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.yandex.metrica.impl.ob.F3 a(com.yandex.metrica.impl.ob.I3 r2, com.yandex.metrica.impl.ob.D3 r3, com.yandex.metrica.impl.ob.N3<com.yandex.metrica.impl.ob.F3> r4) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.HashMap<java.lang.String, com.yandex.metrica.impl.ob.F3> r0 = r1.f6430b     // Catch:{ all -> 0x000b }
            com.yandex.metrica.impl.ob.R3 r2 = r1.a(r2, r3, r4, r0)     // Catch:{ all -> 0x000b }
            com.yandex.metrica.impl.ob.F3 r2 = (com.yandex.metrica.impl.ob.F3) r2     // Catch:{ all -> 0x000b }
            monitor-exit(r1)
            return r2
        L_0x000b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0621p4.a(com.yandex.metrica.impl.ob.I3, com.yandex.metrica.impl.ob.D3, com.yandex.metrica.impl.ob.N3):com.yandex.metrica.impl.ob.F3");
    }

    private <T extends R3> T a(I3 i3, D3 d3, N3<T> n3, Map<String, T> map) {
        T t = (R3) map.get(i3.toString());
        if (t == null) {
            T a2 = n3.a(this.f6431c, i3, d3);
            map.put(i3.toString(), a2);
            return a2;
        }
        t.a(d3);
        return t;
    }
}
