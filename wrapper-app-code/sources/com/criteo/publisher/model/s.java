package com.criteo.publisher.model;

import com.criteo.publisher.i;
import com.criteo.publisher.model.b0.n;
import com.criteo.publisher.n0.t;
import com.google.gson.annotations.SerializedName;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* compiled from: CdbResponseSlot.kt */
public class s {
    public static final a p = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Lazy f2837a;

    /* renamed from: b  reason: collision with root package name */
    private final Lazy f2838b;
    @SerializedName("impId")

    /* renamed from: c  reason: collision with root package name */
    private final String f2839c;
    @SerializedName("placementId")

    /* renamed from: d  reason: collision with root package name */
    private final String f2840d;
    @SerializedName("zoneId")

    /* renamed from: e  reason: collision with root package name */
    private final Integer f2841e;
    @SerializedName("cpm")

    /* renamed from: f  reason: collision with root package name */
    private final String f2842f;
    @SerializedName("currency")

    /* renamed from: g  reason: collision with root package name */
    private final String f2843g;
    @SerializedName("width")

    /* renamed from: h  reason: collision with root package name */
    private final int f2844h;
    @SerializedName("height")
    private final int i;
    @SerializedName("displayUrl")
    private final String j;
    @SerializedName("native")
    private final n k;
    @SerializedName("ttl")
    private int l;
    @SerializedName("isVideo")
    private boolean m;
    @SerializedName("isRewarded")
    private boolean n;
    private long o;

    public s() {
        this((String) null, (String) null, (Integer) null, (String) null, (String) null, 0, 0, (String) null, (n) null, 0, false, false, 0, 8191, (DefaultConstructorMarker) null);
    }

    public static final s a(JSONObject jSONObject) {
        return p.a(jSONObject);
    }

    public Double b() {
        return (Double) this.f2837a.getValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.areEqual((Object) f(), (Object) sVar.f()) && Intrinsics.areEqual((Object) h(), (Object) sVar.h()) && Intrinsics.areEqual((Object) l(), (Object) sVar.l()) && Intrinsics.areEqual((Object) a(), (Object) sVar.a()) && Intrinsics.areEqual((Object) c(), (Object) sVar.c()) && k() == sVar.k() && e() == sVar.e() && Intrinsics.areEqual((Object) d(), (Object) sVar.d()) && Intrinsics.areEqual((Object) g(), (Object) sVar.g()) && j() == sVar.j() && p() == sVar.p() && n() == sVar.n() && i() == sVar.i();
    }

    public int hashCode() {
        String f2 = f();
        int i2 = 0;
        int hashCode = (f2 != null ? f2.hashCode() : 0) * 31;
        String h2 = h();
        int hashCode2 = (hashCode + (h2 != null ? h2.hashCode() : 0)) * 31;
        Integer l2 = l();
        int hashCode3 = (hashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31;
        String a2 = a();
        int hashCode4 = (hashCode3 + (a2 != null ? a2.hashCode() : 0)) * 31;
        String c2 = c();
        int hashCode5 = (((((hashCode4 + (c2 != null ? c2.hashCode() : 0)) * 31) + k()) * 31) + e()) * 31;
        String d2 = d();
        int hashCode6 = (hashCode5 + (d2 != null ? d2.hashCode() : 0)) * 31;
        n g2 = g();
        if (g2 != null) {
            i2 = g2.hashCode();
        }
        int j2 = (((hashCode6 + i2) * 31) + j()) * 31;
        boolean p2 = p();
        boolean z = true;
        if (p2) {
            p2 = true;
        }
        int i3 = (j2 + (p2 ? 1 : 0)) * 31;
        boolean n2 = n();
        if (!n2) {
            z = n2;
        }
        long i4 = i();
        return ((i3 + (z ? 1 : 0)) * 31) + ((int) (i4 ^ (i4 >>> 32)));
    }

    public boolean m() {
        return ((Boolean) this.f2838b.getValue()).booleanValue();
    }

    public String toString() {
        return "CdbResponseSlot(impressionId=" + f() + ", placementId=" + h() + ", zoneId=" + l() + ", cpm=" + a() + ", currency=" + c() + ", width=" + k() + ", height=" + e() + ", displayUrl=" + d() + ", nativeAssets=" + g() + ", ttlInSeconds=" + j() + ", isVideo=" + p() + ", isRewarded=" + n() + ", timeOfDownload=" + i() + ")";
    }

    /* compiled from: CdbResponseSlot.kt */
    static final class c extends Lambda implements Function0<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f2846a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(s sVar) {
            super(0);
            this.f2846a = sVar;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return Boolean.valueOf(a());
        }

        public final boolean a() {
            return this.f2846a.g() != null;
        }
    }

    public s(String str, String str2, Integer num, String str3, String str4, int i2, int i3, String str5, n nVar, int i4, boolean z, boolean z2, long j2) {
        Intrinsics.checkParameterIsNotNull(str3, "cpm");
        this.f2839c = str;
        this.f2840d = str2;
        this.f2841e = num;
        this.f2842f = str3;
        this.f2843g = str4;
        this.f2844h = i2;
        this.i = i3;
        this.j = str5;
        this.k = nVar;
        this.l = i4;
        this.m = z;
        this.n = z2;
        this.o = j2;
        this.f2837a = LazyKt.lazy(new b(this));
        this.f2838b = LazyKt.lazy(new c(this));
    }

    public String f() {
        return this.f2839c;
    }

    public String h() {
        return this.f2840d;
    }

    public Integer l() {
        return this.f2841e;
    }

    public String a() {
        return this.f2842f;
    }

    public String c() {
        return this.f2843g;
    }

    public int k() {
        return this.f2844h;
    }

    public int e() {
        return this.i;
    }

    public String d() {
        return this.j;
    }

    public n g() {
        return this.k;
    }

    public void a(int i2) {
        this.l = i2;
    }

    public int j() {
        return this.l;
    }

    public boolean p() {
        return this.m;
    }

    public boolean n() {
        return this.n;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ s(java.lang.String r16, java.lang.String r17, java.lang.Integer r18, java.lang.String r19, java.lang.String r20, int r21, int r22, java.lang.String r23, com.criteo.publisher.model.b0.n r24, int r25, boolean r26, boolean r27, long r28, int r30, kotlin.jvm.internal.DefaultConstructorMarker r31) {
        /*
            r15 = this;
            r0 = r30
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000b
        L_0x0009:
            r1 = r16
        L_0x000b:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0011
            r3 = r2
            goto L_0x0013
        L_0x0011:
            r3 = r17
        L_0x0013:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0019
            r4 = r2
            goto L_0x001b
        L_0x0019:
            r4 = r18
        L_0x001b:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0022
            java.lang.String r5 = "0.0"
            goto L_0x0024
        L_0x0022:
            r5 = r19
        L_0x0024:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x002a
            r6 = r2
            goto L_0x002c
        L_0x002a:
            r6 = r20
        L_0x002c:
            r7 = r0 & 32
            r8 = 0
            if (r7 == 0) goto L_0x0033
            r7 = 0
            goto L_0x0035
        L_0x0033:
            r7 = r21
        L_0x0035:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x003b
            r9 = 0
            goto L_0x003d
        L_0x003b:
            r9 = r22
        L_0x003d:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0043
            r10 = r2
            goto L_0x0045
        L_0x0043:
            r10 = r23
        L_0x0045:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x004a
            goto L_0x004c
        L_0x004a:
            r2 = r24
        L_0x004c:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0052
            r11 = 0
            goto L_0x0054
        L_0x0052:
            r11 = r25
        L_0x0054:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x005a
            r12 = 0
            goto L_0x005c
        L_0x005a:
            r12 = r26
        L_0x005c:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0061
            goto L_0x0063
        L_0x0061:
            r8 = r27
        L_0x0063:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x006a
            r13 = 0
            goto L_0x006c
        L_0x006a:
            r13 = r28
        L_0x006c:
            r16 = r15
            r17 = r1
            r18 = r3
            r19 = r4
            r20 = r5
            r21 = r6
            r22 = r7
            r23 = r9
            r24 = r10
            r25 = r2
            r26 = r11
            r27 = r12
            r28 = r8
            r29 = r13
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.criteo.publisher.model.s.<init>(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, int, int, java.lang.String, com.criteo.publisher.model.b0.n, int, boolean, boolean, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public void a(long j2) {
        this.o = j2;
    }

    public long i() {
        return this.o;
    }

    /* compiled from: CdbResponseSlot.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0041, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0042, code lost:
            kotlin.io.CloseableKt.closeFinally(r1, r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0045, code lost:
            throw r0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.criteo.publisher.model.s a(org.json.JSONObject r4) {
            /*
                r3 = this;
                java.lang.String r0 = "json"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
                com.criteo.publisher.s r0 = com.criteo.publisher.s.c()
                com.criteo.publisher.n0.l r0 = r0.H0()
                java.lang.String r1 = "DependencyProvider.getIn…).provideJsonSerializer()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                java.lang.String r4 = r4.toString()
                java.lang.String r1 = "json.toString()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r1)
                java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8
                if (r4 == 0) goto L_0x0046
                byte[] r4 = r4.getBytes(r1)
                java.lang.String r1 = "(this as java.lang.String).getBytes(charset)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r1)
                java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
                r1.<init>(r4)
                r4 = 0
                java.lang.Class<com.criteo.publisher.model.s> r2 = com.criteo.publisher.model.s.class
                java.lang.Object r0 = r0.a(r2, (java.io.InputStream) r1)     // Catch:{ all -> 0x003f }
                java.lang.String r2 = "jsonSerializer.read(CdbR…eSlot::class.java, input)"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)     // Catch:{ all -> 0x003f }
                com.criteo.publisher.model.s r0 = (com.criteo.publisher.model.s) r0     // Catch:{ all -> 0x003f }
                kotlin.io.CloseableKt.closeFinally(r1, r4)
                return r0
            L_0x003f:
                r4 = move-exception
                throw r4     // Catch:{ all -> 0x0041 }
            L_0x0041:
                r0 = move-exception
                kotlin.io.CloseableKt.closeFinally(r1, r4)
                throw r0
            L_0x0046:
                java.lang.NullPointerException r4 = new java.lang.NullPointerException
                java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
                r4.<init>(r0)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.criteo.publisher.model.s.a.a(org.json.JSONObject):com.criteo.publisher.model.s");
        }
    }

    /* compiled from: CdbResponseSlot.kt */
    static final class b extends Lambda implements Function0<Double> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f2845a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(s sVar) {
            super(0);
            this.f2845a = sVar;
        }

        /* renamed from: a */
        public final Double invoke() {
            return StringsKt.toDoubleOrNull(this.f2845a.a());
        }
    }

    public boolean o() {
        Double b2 = b();
        boolean z = (b2 != null ? b2.doubleValue() : -1.0d) < 0.0d;
        boolean z2 = Intrinsics.areEqual(b(), 0.0d) && j() == 0;
        boolean z3 = Intrinsics.areEqual(b(), 0.0d) && j() > 0;
        if (z || z2 || (!z3 && !m() && !t.c(d()))) {
            return false;
        }
        return true;
    }

    public boolean a(i iVar) {
        Intrinsics.checkParameterIsNotNull(iVar, "clock");
        return ((long) (j() * 1000)) + i() <= iVar.a();
    }
}
