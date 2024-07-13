package com.yandex.metrica.impl.ob;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.b8  reason: case insensitive filesystem */
public final class C0276b8 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f5518b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C0301c8 f5519a;

    /* renamed from: com.yandex.metrica.impl.ob.b8$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.b8$b */
    static final class b implements C0326d8 {

        /* renamed from: a  reason: collision with root package name */
        public static final b f5520a = new b();

        b() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0083  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x007a A[SYNTHETIC, Splitter:B:8:0x007a] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final org.json.JSONObject a(org.json.JSONObject r7, org.json.JSONObject r8) {
            /*
                r6 = this;
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                java.lang.String r2 = "first_event_done"
                java.lang.Boolean r3 = com.yandex.metrica.impl.ob.Tl.a((org.json.JSONObject) r7, (java.lang.String) r2, (java.lang.Boolean) r1)
                java.lang.Boolean r3 = com.yandex.metrica.impl.ob.Tl.a((org.json.JSONObject) r8, (java.lang.String) r2, (java.lang.Boolean) r3)
                r0.put(r2, r3)
                java.lang.String r2 = "init_event_done"
                java.lang.Boolean r3 = com.yandex.metrica.impl.ob.Tl.a((org.json.JSONObject) r7, (java.lang.String) r2, (java.lang.Boolean) r1)
                java.lang.Boolean r3 = com.yandex.metrica.impl.ob.Tl.a((org.json.JSONObject) r8, (java.lang.String) r2, (java.lang.Boolean) r3)
                r0.put(r2, r3)
                r2 = -1
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                java.lang.String r3 = "report_request_id"
                java.lang.Integer r2 = com.yandex.metrica.impl.ob.Tl.a((org.json.JSONObject) r7, (java.lang.String) r3, (java.lang.Integer) r2)
                java.lang.Integer r2 = com.yandex.metrica.impl.ob.Tl.a((org.json.JSONObject) r8, (java.lang.String) r3, (java.lang.Integer) r2)
                r0.put(r3, r2)
                r2 = 0
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                java.lang.String r3 = "global_number"
                java.lang.Integer r4 = com.yandex.metrica.impl.ob.Tl.a((org.json.JSONObject) r7, (java.lang.String) r3, (java.lang.Integer) r2)
                java.lang.Integer r4 = com.yandex.metrica.impl.ob.Tl.a((org.json.JSONObject) r8, (java.lang.String) r3, (java.lang.Integer) r4)
                r0.put(r3, r4)
                r3 = -1
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                java.lang.String r4 = "session_id"
                java.lang.Long r3 = com.yandex.metrica.impl.ob.Tl.a((org.json.JSONObject) r7, (java.lang.String) r4, (java.lang.Long) r3)
                java.lang.Long r3 = com.yandex.metrica.impl.ob.Tl.a((org.json.JSONObject) r8, (java.lang.String) r4, (java.lang.Long) r3)
                r0.put(r4, r3)
                java.lang.String r3 = "referrer_handled"
                java.lang.Boolean r1 = com.yandex.metrica.impl.ob.Tl.a((org.json.JSONObject) r7, (java.lang.String) r3, (java.lang.Boolean) r1)
                java.lang.Boolean r1 = com.yandex.metrica.impl.ob.Tl.a((org.json.JSONObject) r8, (java.lang.String) r3, (java.lang.Boolean) r1)
                r0.put(r3, r1)
                java.lang.String r1 = "numbers_of_type"
                boolean r3 = r7.has(r1)
                r4 = 0
                if (r3 == 0) goto L_0x0073
                org.json.JSONObject r3 = r7.getJSONObject(r1)     // Catch:{ all -> 0x0073 }
                goto L_0x0074
            L_0x0073:
                r3 = r4
            L_0x0074:
                boolean r5 = r8.has(r1)
                if (r5 == 0) goto L_0x0080
                org.json.JSONObject r4 = r8.getJSONObject(r1)     // Catch:{ all -> 0x007f }
                goto L_0x0080
            L_0x007f:
            L_0x0080:
                if (r4 != 0) goto L_0x0083
                goto L_0x0084
            L_0x0083:
                r3 = r4
            L_0x0084:
                r0.put(r1, r3)
                r1 = 1
                java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
                java.lang.String r4 = "open_id"
                java.lang.Integer r3 = com.yandex.metrica.impl.ob.Tl.a((org.json.JSONObject) r7, (java.lang.String) r4, (java.lang.Integer) r3)
                java.lang.Integer r3 = com.yandex.metrica.impl.ob.Tl.a((org.json.JSONObject) r8, (java.lang.String) r4, (java.lang.Integer) r3)
                r0.put(r4, r3)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.String r3 = "attribution_id"
                java.lang.Integer r1 = com.yandex.metrica.impl.ob.Tl.a((org.json.JSONObject) r7, (java.lang.String) r3, (java.lang.Integer) r1)
                java.lang.Integer r1 = com.yandex.metrica.impl.ob.Tl.a((org.json.JSONObject) r8, (java.lang.String) r3, (java.lang.Integer) r1)
                r0.put(r3, r1)
                java.lang.String r1 = "last_migration_api_level"
                java.lang.Integer r7 = com.yandex.metrica.impl.ob.Tl.a((org.json.JSONObject) r7, (java.lang.String) r1, (java.lang.Integer) r2)
                java.lang.Integer r7 = com.yandex.metrica.impl.ob.Tl.a((org.json.JSONObject) r8, (java.lang.String) r1, (java.lang.Integer) r7)
                r0.put(r1, r7)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0276b8.b.a(org.json.JSONObject, org.json.JSONObject):org.json.JSONObject");
        }
    }

    public C0276b8(C0376f8 f8Var, C0376f8 f8Var2, String str) {
        this.f5519a = new C0301c8(f8Var, f8Var2, "[VitalComponentDataProvider-" + str + ']', b.f5520a);
    }

    public final synchronized void a(boolean z) {
        C0301c8 c8Var = this.f5519a;
        JSONObject put = c8Var.a().put("first_event_done", z);
        Intrinsics.checkNotNullExpressionValue(put, "vitalDataProvider.getOrL…(FIRST_EVENT_DONE, value)");
        c8Var.a(put);
    }

    public final synchronized void b(boolean z) {
        C0301c8 c8Var = this.f5519a;
        JSONObject put = c8Var.a().put("init_event_done", z);
        Intrinsics.checkNotNullExpressionValue(put, "vitalDataProvider.getOrL…t(INIT_EVENT_DONE, value)");
        c8Var.a(put);
    }

    public final synchronized void c(int i) {
        C0301c8 c8Var = this.f5519a;
        JSONObject put = c8Var.a().put("report_request_id", i);
        Intrinsics.checkNotNullExpressionValue(put, "vitalDataProvider.getOrL…REPORT_REQUEST_ID, value)");
        c8Var.a(put);
    }

    public final synchronized JSONObject d() {
        return this.f5519a.a().optJSONObject("numbers_of_type");
    }

    public final synchronized int e() {
        return this.f5519a.a().optInt("open_id", 1);
    }

    public final synchronized boolean f() {
        return this.f5519a.a().optBoolean("referrer_handled", false);
    }

    public final synchronized int g() {
        return this.f5519a.a().optInt("report_request_id", -1);
    }

    public final synchronized long h() {
        return this.f5519a.a().optLong("session_id", -1);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized void i() {
        /*
            r4 = this;
            monitor-enter(r4)
            monitor-enter(r4)     // Catch:{ all -> 0x002f }
            com.yandex.metrica.impl.ob.c8 r0 = r4.f5519a     // Catch:{ all -> 0x002c }
            org.json.JSONObject r0 = r0.a()     // Catch:{ all -> 0x002c }
            java.lang.String r1 = "attribution_id"
            r2 = 1
            int r0 = r0.optInt(r1, r2)     // Catch:{ all -> 0x002c }
            monitor-exit(r4)     // Catch:{ all -> 0x002f }
            int r0 = r0 + r2
            monitor-enter(r4)     // Catch:{ all -> 0x002f }
            com.yandex.metrica.impl.ob.c8 r1 = r4.f5519a     // Catch:{ all -> 0x0029 }
            org.json.JSONObject r2 = r1.a()     // Catch:{ all -> 0x0029 }
            java.lang.String r3 = "attribution_id"
            org.json.JSONObject r0 = r2.put(r3, r0)     // Catch:{ all -> 0x0029 }
            java.lang.String r2 = "vitalDataProvider.getOrL…EY_ATTRIBUTION_ID, value)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)     // Catch:{ all -> 0x0029 }
            r1.a((org.json.JSONObject) r0)     // Catch:{ all -> 0x0029 }
            monitor-exit(r4)     // Catch:{ all -> 0x002f }
            monitor-exit(r4)
            return
        L_0x0029:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x002f }
            throw r0     // Catch:{ all -> 0x002f }
        L_0x002c:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x002f }
            throw r0     // Catch:{ all -> 0x002f }
        L_0x002f:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0276b8.i():void");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized void j() {
        /*
            r4 = this;
            monitor-enter(r4)
            monitor-enter(r4)     // Catch:{ all -> 0x002f }
            com.yandex.metrica.impl.ob.c8 r0 = r4.f5519a     // Catch:{ all -> 0x002c }
            org.json.JSONObject r0 = r0.a()     // Catch:{ all -> 0x002c }
            java.lang.String r1 = "open_id"
            r2 = 1
            int r0 = r0.optInt(r1, r2)     // Catch:{ all -> 0x002c }
            monitor-exit(r4)     // Catch:{ all -> 0x002f }
            int r0 = r0 + r2
            monitor-enter(r4)     // Catch:{ all -> 0x002f }
            com.yandex.metrica.impl.ob.c8 r1 = r4.f5519a     // Catch:{ all -> 0x0029 }
            org.json.JSONObject r2 = r1.a()     // Catch:{ all -> 0x0029 }
            java.lang.String r3 = "open_id"
            org.json.JSONObject r0 = r2.put(r3, r0)     // Catch:{ all -> 0x0029 }
            java.lang.String r2 = "vitalDataProvider.getOrL…).put(KEY_OPEN_ID, value)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)     // Catch:{ all -> 0x0029 }
            r1.a((org.json.JSONObject) r0)     // Catch:{ all -> 0x0029 }
            monitor-exit(r4)     // Catch:{ all -> 0x002f }
            monitor-exit(r4)
            return
        L_0x0029:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x002f }
            throw r0     // Catch:{ all -> 0x002f }
        L_0x002c:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x002f }
            throw r0     // Catch:{ all -> 0x002f }
        L_0x002f:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0276b8.j():void");
    }

    public final synchronized boolean k() {
        return this.f5519a.a().optBoolean("first_event_done", false);
    }

    public final synchronized boolean l() {
        return this.f5519a.a().optBoolean("init_event_done", false);
    }

    public final synchronized void a(int i) {
        C0301c8 c8Var = this.f5519a;
        JSONObject put = c8Var.a().put("global_number", i);
        Intrinsics.checkNotNullExpressionValue(put, "vitalDataProvider.getOrL…KEY_GLOBAL_NUMBER, value)");
        c8Var.a(put);
    }

    public final synchronized int b() {
        return this.f5519a.a().optInt("global_number", 0);
    }

    public final synchronized void c(boolean z) {
        C0301c8 c8Var = this.f5519a;
        JSONObject put = c8Var.a().put("referrer_handled", z);
        Intrinsics.checkNotNullExpressionValue(put, "vitalDataProvider.getOrL…_REFERRER_HANDLED, value)");
        c8Var.a(put);
    }

    public final synchronized void a(long j) {
        C0301c8 c8Var = this.f5519a;
        JSONObject put = c8Var.a().put("session_id", j);
        Intrinsics.checkNotNullExpressionValue(put, "vitalDataProvider.getOrL…ut(KEY_SESSION_ID, value)");
        c8Var.a(put);
    }

    public final synchronized void b(int i) {
        C0301c8 c8Var = this.f5519a;
        JSONObject put = c8Var.a().put("last_migration_api_level", i);
        Intrinsics.checkNotNullExpressionValue(put, "vitalDataProvider.getOrL…GRATION_API_LEVEL, value)");
        c8Var.a(put);
    }

    public final synchronized int c() {
        return this.f5519a.a().optInt("last_migration_api_level", 0);
    }

    public final synchronized void a(JSONObject jSONObject) {
        C0301c8 c8Var = this.f5519a;
        JSONObject put = c8Var.a().put("numbers_of_type", jSONObject);
        Intrinsics.checkNotNullExpressionValue(put, "vitalDataProvider.getOrL…Y_NUMBERS_OF_TYPE, value)");
        c8Var.a(put);
    }

    public final synchronized int a() {
        return this.f5519a.a().optInt("attribution_id", 1);
    }

    public final synchronized void a(boolean z, boolean z2, Integer num, Integer num2, Long l, Boolean bool, JSONObject jSONObject, Integer num3, Integer num4, Integer num5) {
        JSONObject put = new JSONObject().put("first_event_done", z).put("init_event_done", z2).put("report_request_id", num).put("global_number", num2).put("session_id", l).put("referrer_handled", bool).put("open_id", num3).put("attribution_id", num4).put("numbers_of_type", jSONObject).put("last_migration_api_level", num5);
        C0301c8 c8Var = this.f5519a;
        Intrinsics.checkNotNullExpressionValue(put, "json");
        c8Var.a(put);
    }
}
