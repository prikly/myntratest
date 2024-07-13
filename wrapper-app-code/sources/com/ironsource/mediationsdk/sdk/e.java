package com.ironsource.mediationsdk.sdk;

import java.util.Map;
import org.json.JSONObject;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static e f8824a;

    /* renamed from: b  reason: collision with root package name */
    private JSONObject f8825b = new JSONObject();

    private e() {
    }

    public static synchronized e a() {
        e eVar;
        synchronized (e.class) {
            if (f8824a == null) {
                f8824a = new e();
            }
            eVar = f8824a;
        }
        return eVar;
    }

    public final synchronized String a(String str) {
        return this.f8825b.optString(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x000c, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(java.lang.String r2, java.lang.Object r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            org.json.JSONObject r0 = r1.f8825b     // Catch:{ Exception -> 0x000b, all -> 0x0008 }
            r0.put(r2, r3)     // Catch:{ Exception -> 0x000b, all -> 0x0008 }
            monitor-exit(r1)
            return
        L_0x0008:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L_0x000b:
            monitor-exit(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.sdk.e.a(java.lang.String, java.lang.Object):void");
    }

    public final synchronized void a(Map<String, Object> map) {
        if (map != null) {
            for (String next : map.keySet()) {
                a(next, map.get(next));
            }
        }
    }

    public final synchronized JSONObject b() {
        return this.f8825b;
    }
}
