package com.appodeal.ads;

import androidx.recyclerview.widget.RecyclerView;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.storage.o;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.utils.Version;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONObject;

public final class r0 {

    /* renamed from: a  reason: collision with root package name */
    public static final r0 f17085a = new r0();

    /* renamed from: b  reason: collision with root package name */
    public static boolean f17086b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f17087c;

    /* renamed from: d  reason: collision with root package name */
    public static Log.LogLevel f17088d = Log.LogLevel.none;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f17089e;

    /* renamed from: f  reason: collision with root package name */
    public static int f17090f = -1;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f17091g = true;

    /* renamed from: h  reason: collision with root package name */
    public static int f17092h = -90;
    public static int i = 90;
    public static String j;
    public static Boolean k;
    public static boolean l;
    public static boolean m = true;
    public static Set<String> n = new HashSet();
    public static final o o = o.f17407b;

    @DebugMetadata(c = "com.appodeal.ads.AppodealSettings", f = "AppodealSettings.kt", l = {146}, m = "getUrlList")
    public static final class a extends ContinuationImpl {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f17093a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ r0 f17094b;

        /* renamed from: c  reason: collision with root package name */
        public int f17095c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(r0 r0Var, Continuation<? super a> continuation) {
            super(continuation);
            this.f17094b = r0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f17093a = obj;
            this.f17095c |= RecyclerView.UNDEFINED_DURATION;
            return this.f17094b.a((Continuation<? super Set<String>>) this);
        }
    }

    @DebugMetadata(c = "com.appodeal.ads.AppodealSettings", f = "AppodealSettings.kt", l = {134}, m = "parseUrlList")
    public static final class b extends ContinuationImpl {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f17096a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ r0 f17097b;

        /* renamed from: c  reason: collision with root package name */
        public int f17098c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(r0 r0Var, Continuation<? super b> continuation) {
            super(continuation);
            this.f17097b = r0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f17096a = obj;
            this.f17098c |= RecyclerView.UNDEFINED_DURATION;
            return this.f17097b.a((JSONObject) null, (Continuation<? super Unit>) this);
        }
    }

    public static String a() {
        return j;
    }

    public static void a(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "jObject");
        if (jSONObject.optBoolean("log")) {
            q4.a(Log.LogLevel.verbose);
        }
    }

    public static final boolean a(long j2, int i2) {
        return System.currentTimeMillis() - j2 > ((long) i2);
    }

    public static void b(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "jObject");
        if (jSONObject.has(Constants.POST_BID)) {
            f17087c = jSONObject.optBoolean(Constants.POST_BID, false);
        }
    }

    public static boolean b() {
        return f17087c;
    }

    public static final void c(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "jObject");
        try {
            if (jSONObject.has("randomize_offers")) {
                f17091g = jSONObject.getBoolean("randomize_offers");
            }
            a(jSONObject);
            if (jSONObject.has("last_sdk_version") && j == null) {
                String string = jSONObject.getString("last_sdk_version");
                j = string;
                if (new Version(string).compareTo(new Version(Constants.SDK_VERSION)) == 1) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String format = String.format("your SDK version %s does not match latest SDK version %s!", Arrays.copyOf(new Object[]{Constants.SDK_VERSION, j}, 2));
                    Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
                    Log.log(LogConstants.KEY_SDK, LogConstants.EVENT_WARNING, format);
                }
            }
            if (jSONObject.has("test")) {
                q4.f(jSONObject.getBoolean("test"));
            }
        } catch (Exception e2) {
            Log.log(e2);
        }
    }

    public static final boolean c() {
        Boolean bool = k;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean d2 = n5.d();
        k = Boolean.valueOf(d2);
        return d2;
    }

    public static final void d() {
        o1.a().o = 0;
        w2.a().o = 0;
        o4.a().o = 0;
        t0.a().o = 0;
        h2.a().o = 0;
        Native.a().o = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(kotlin.coroutines.Continuation<? super java.util.Set<java.lang.String>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.appodeal.ads.r0.a
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.appodeal.ads.r0$a r0 = (com.appodeal.ads.r0.a) r0
            int r1 = r0.f17095c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f17095c = r1
            goto L_0x0018
        L_0x0013:
            com.appodeal.ads.r0$a r0 = new com.appodeal.ads.r0$a
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f17093a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f17095c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.throwOnFailure(r5)
            goto L_0x0047
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r5)
            java.util.Set<java.lang.String> r5 = n
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x004b
            com.appodeal.ads.storage.o r5 = o
            r0.f17095c = r3
            java.lang.Object r5 = r5.a((com.appodeal.ads.r0.a) r0)
            if (r5 != r1) goto L_0x0047
            return r1
        L_0x0047:
            java.util.Set r5 = (java.util.Set) r5
            n = r5
        L_0x004b:
            java.util.Set<java.lang.String> r5 = n
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.r0.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0064 A[Catch:{ Exception -> 0x0084 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x006c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(org.json.JSONObject r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.appodeal.ads.r0.b
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.appodeal.ads.r0$b r0 = (com.appodeal.ads.r0.b) r0
            int r1 = r0.f17098c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f17098c = r1
            goto L_0x0018
        L_0x0013:
            com.appodeal.ads.r0$b r0 = new com.appodeal.ads.r0$b
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f17096a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f17098c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.throwOnFailure(r10)     // Catch:{ Exception -> 0x0084 }
            goto L_0x0088
        L_0x0029:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r10)
            java.util.LinkedHashSet r10 = new java.util.LinkedHashSet
            r10.<init>()
            java.lang.String r2 = "url_list"
            org.json.JSONArray r9 = r9.optJSONArray(r2)     // Catch:{ Exception -> 0x0084 }
            if (r9 != 0) goto L_0x0042
            goto L_0x006e
        L_0x0042:
            int r2 = r9.length()     // Catch:{ Exception -> 0x0084 }
            if (r2 <= 0) goto L_0x006e
            int r2 = r9.length()     // Catch:{ Exception -> 0x0084 }
            r4 = 0
            r5 = 0
        L_0x004e:
            if (r5 >= r2) goto L_0x006e
            int r6 = r5 + 1
            java.lang.String r5 = r9.getString(r5)     // Catch:{ Exception -> 0x0084 }
            if (r5 == 0) goto L_0x0061
            boolean r7 = kotlin.text.StringsKt.isBlank(r5)     // Catch:{ Exception -> 0x0084 }
            if (r7 == 0) goto L_0x005f
            goto L_0x0061
        L_0x005f:
            r7 = 0
            goto L_0x0062
        L_0x0061:
            r7 = 1
        L_0x0062:
            if (r7 != 0) goto L_0x006c
            java.lang.String r7 = "url"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r7)     // Catch:{ Exception -> 0x0084 }
            r10.add(r5)     // Catch:{ Exception -> 0x0084 }
        L_0x006c:
            r5 = r6
            goto L_0x004e
        L_0x006e:
            n = r10     // Catch:{ Exception -> 0x0084 }
            r0.f17098c = r3     // Catch:{ Exception -> 0x0084 }
            com.appodeal.ads.storage.o r9 = o     // Catch:{ Exception -> 0x0084 }
            java.lang.Object r9 = r9.a((java.util.LinkedHashSet) r10, (com.appodeal.ads.r0.b) r0)     // Catch:{ Exception -> 0x0084 }
            java.lang.Object r10 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch:{ Exception -> 0x0084 }
            if (r9 != r10) goto L_0x007f
            goto L_0x0081
        L_0x007f:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE     // Catch:{ Exception -> 0x0084 }
        L_0x0081:
            if (r9 != r1) goto L_0x0088
            return r1
        L_0x0084:
            r9 = move-exception
            com.appodeal.ads.utils.Log.log(r9)
        L_0x0088:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.r0.a(org.json.JSONObject, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
