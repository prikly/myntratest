package com.apm.insight.k;

import com.apm.insight.CrashType;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    private static ConcurrentLinkedQueue<c> f10682a = new ConcurrentLinkedQueue<>();

    /* renamed from: com.apm.insight.k.c$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f10683a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.apm.insight.CrashType[] r0 = com.apm.insight.CrashType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10683a = r0
                com.apm.insight.CrashType r1 = com.apm.insight.CrashType.JAVA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10683a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.apm.insight.CrashType r1 = com.apm.insight.CrashType.LAUNCH     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f10683a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.apm.insight.CrashType r1 = com.apm.insight.CrashType.NATIVE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.k.c.AnonymousClass1.<clinit>():void");
        }
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private JSONObject f10684a;

        /* renamed from: b  reason: collision with root package name */
        private JSONObject f10685b;

        /* renamed from: c  reason: collision with root package name */
        private CrashType f10686c;

        a(JSONObject jSONObject, CrashType crashType) {
            this.f10686c = crashType;
            if (crashType == CrashType.LAUNCH) {
                this.f10684a = ((JSONArray) jSONObject.opt("data")).optJSONObject(0);
            } else {
                this.f10684a = jSONObject;
            }
            this.f10685b = jSONObject.optJSONObject("header");
        }

        public String a() {
            return this.f10684a.optString("crash_thread_name", (String) null);
        }

        public long b() {
            return (long) this.f10684a.optInt("app_start_time", -1);
        }

        public String c() {
            int i = AnonymousClass1.f10683a[this.f10686c.ordinal()];
            if (i == 1) {
                return this.f10684a.optString("data", (String) null);
            }
            if (i == 2) {
                return this.f10684a.optString("stack", (String) null);
            }
            if (i != 3) {
                return null;
            }
            return this.f10684a.optString("data", (String) null);
        }
    }

    static void a(CrashType crashType, JSONObject jSONObject) {
        ConcurrentLinkedQueue<c> concurrentLinkedQueue = f10682a;
        if (concurrentLinkedQueue != null && !concurrentLinkedQueue.isEmpty()) {
            a aVar = new a(jSONObject, crashType);
            while (!f10682a.isEmpty()) {
                c poll = f10682a.poll();
                if (poll != null) {
                    poll.a(crashType, aVar);
                }
            }
            f10682a = null;
        }
    }

    public abstract void a(CrashType crashType, a aVar);
}
