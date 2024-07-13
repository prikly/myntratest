package com.bytedance.sdk.component.d.a;

import com.bytedance.sdk.component.d.c.c.c;
import com.bytedance.sdk.component.d.h;
import com.bytedance.sdk.component.d.k;
import java.util.WeakHashMap;

/* compiled from: KeyGeneratorFactory */
public class b {
    public static k a() {
        return new k() {

            /* renamed from: a  reason: collision with root package name */
            private WeakHashMap<String, String> f18942a = new WeakHashMap<>();

            public String b(h hVar) {
                return a(hVar.a());
            }

            public String a(h hVar) {
                return a(hVar.a() + "#width=" + hVar.b() + "#height=" + hVar.c() + "#scaletype=" + hVar.d());
            }

            private String a(String str) {
                String str2 = this.f18942a.get(str);
                if (str2 != null) {
                    return str2;
                }
                String a2 = c.a(str);
                this.f18942a.put(str, a2);
                return a2;
            }
        };
    }
}
