package com.appodeal.ads;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.regulator.UserConsent;
import com.appodeal.ads.regulator.h;
import com.appodeal.ads.regulator.i;
import com.appodeal.ads.storage.o;
import com.appodeal.advertising.AdvertisingInfo;
import com.appodeal.consent.Consent;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONObject;

public final class x2 {

    /* renamed from: a  reason: collision with root package name */
    public static final x2 f17639a = new x2();

    /* renamed from: b  reason: collision with root package name */
    public static final Lazy f17640b = LazyKt.lazy(d.f17653a);

    /* renamed from: c  reason: collision with root package name */
    public static final Lazy f17641c = LazyKt.lazy(c.f17652a);

    /* renamed from: d  reason: collision with root package name */
    public static final Lazy f17642d = LazyKt.lazy(b.f17651a);

    /* renamed from: e  reason: collision with root package name */
    public static JSONObject f17643e;

    /* renamed from: f  reason: collision with root package name */
    public static AdvertisingInfo.AdvertisingProfile f17644f = AdvertisingInfo.DefaultAdvertisingProfile.INSTANCE;

    /* renamed from: g  reason: collision with root package name */
    public static final Set<String> f17645g;

    /* renamed from: h  reason: collision with root package name */
    public static final HashSet f17646h;

    @DebugMetadata(c = "com.appodeal.ads.PersonalData", f = "PersonalData.kt", l = {58}, m = "init")
    public static final class a extends ContinuationImpl {

        /* renamed from: a  reason: collision with root package name */
        public x2 f17647a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f17648b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ x2 f17649c;

        /* renamed from: d  reason: collision with root package name */
        public int f17650d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(x2 x2Var, Continuation<? super a> continuation) {
            super(continuation);
            this.f17649c = x2Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f17648b = obj;
            this.f17650d |= RecyclerView.UNDEFINED_DURATION;
            return this.f17649c.a((String) null, (Context) null, (AdvertisingInfo.AdvertisingProfile) null, this);
        }
    }

    public static final class b extends Lambda implements Function0<com.appodeal.ads.networking.cache.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f17651a = new b();

        public b() {
            super(0);
        }

        public final Object invoke() {
            x2.f17639a.getClass();
            return new com.appodeal.ads.networking.cache.c("init_response", x2.b());
        }
    }

    public static final class c extends Lambda implements Function0<o> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f17652a = new c();

        public c() {
            super(0);
        }

        public final Object invoke() {
            return o.f17407b;
        }
    }

    public static final class d extends Lambda implements Function0<i> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f17653a = new d();

        public d() {
            super(0);
        }

        public final Object invoke() {
            return new i();
        }
    }

    static {
        Set<String> of = SetsKt.setOf("lt", com.appnext.base.b.i.fC, "lon", "ad_stats", "user_settings", Constants.INAPPS);
        f17645g = of;
        f17646h = new HashSet(of);
    }

    public static final String a() {
        return f17644f.getId();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean a(com.appodeal.advertising.AdvertisingInfo.AdvertisingProfile r4) {
        /*
            java.lang.String r0 = "applyAdvertisingProfile"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            com.appodeal.advertising.AdvertisingInfo$AdvertisingProfile r0 = f17644f
            boolean r0 = r0.isLimitAdTrackingEnabled()
            boolean r1 = r4.isLimitAdTrackingEnabled()
            r2 = 0
            if (r0 != r1) goto L_0x0024
            com.appodeal.advertising.AdvertisingInfo$AdvertisingProfile r0 = f17644f
            java.lang.String r0 = r0.getId()
            java.lang.String r1 = r4.getId()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            if (r0 != 0) goto L_0x0023
            goto L_0x0024
        L_0x0023:
            return r2
        L_0x0024:
            com.appodeal.ads.x2 r0 = f17639a
            r0.getClass()
            com.appodeal.ads.regulator.h r1 = e()
            boolean r1 = r1.a()
            r3 = 1
            if (r1 == 0) goto L_0x003c
            boolean r1 = g()
            if (r1 != 0) goto L_0x003c
            r1 = 1
            goto L_0x003d
        L_0x003c:
            r1 = 0
        L_0x003d:
            if (r1 != 0) goto L_0x0057
            com.appodeal.ads.regulator.h r1 = e()
            boolean r1 = r1.g()
            if (r1 == 0) goto L_0x0051
            boolean r1 = g()
            if (r1 != 0) goto L_0x0051
            r1 = 1
            goto L_0x0052
        L_0x0051:
            r1 = 0
        L_0x0052:
            if (r1 == 0) goto L_0x0055
            goto L_0x0057
        L_0x0055:
            r1 = 0
            goto L_0x0058
        L_0x0057:
            r1 = 1
        L_0x0058:
            f17644f = r4
            r0.getClass()
            com.appodeal.ads.regulator.h r4 = e()
            boolean r4 = r4.a()
            if (r4 == 0) goto L_0x006f
            boolean r4 = g()
            if (r4 != 0) goto L_0x006f
            r4 = 1
            goto L_0x0070
        L_0x006f:
            r4 = 0
        L_0x0070:
            if (r4 != 0) goto L_0x008a
            com.appodeal.ads.regulator.h r4 = e()
            boolean r4 = r4.g()
            if (r4 == 0) goto L_0x0084
            boolean r4 = g()
            if (r4 != 0) goto L_0x0084
            r4 = 1
            goto L_0x0085
        L_0x0084:
            r4 = 0
        L_0x0085:
            if (r4 == 0) goto L_0x0088
            goto L_0x008a
        L_0x0088:
            r4 = 0
            goto L_0x008b
        L_0x008a:
            r4 = 1
        L_0x008b:
            if (r1 == r4) goto L_0x008e
            r2 = 1
        L_0x008e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.x2.a(com.appodeal.advertising.AdvertisingInfo$AdvertisingProfile):boolean");
    }

    public static final boolean a(String str) {
        return CollectionsKt.contains(f17646h, str);
    }

    public static com.appodeal.ads.storage.a b() {
        return (com.appodeal.ads.storage.a) f17641c.getValue();
    }

    public static final void b(JSONObject jSONObject) {
        j4 j4Var = j4.f16495a;
        Intrinsics.checkNotNullParameter(j4Var, "restrictedData");
        if (j4Var.isUserProtected() && jSONObject != null) {
            Iterator it = f17646h.iterator();
            while (it.hasNext()) {
                jSONObject.remove((String) it.next());
            }
        }
    }

    public static final Boolean c() {
        f17639a.getClass();
        return e().d();
    }

    public static final void c(JSONObject jSONObject) {
        f17643e = jSONObject;
        f17639a.getClass();
        com.appodeal.ads.storage.a b2 = b();
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "it.toString()");
        b2.b(jSONObject2);
    }

    public static final Consent d() {
        f17639a.getClass();
        return e().c();
    }

    public static h e() {
        return (h) f17640b.getValue();
    }

    public static final JSONObject f() {
        JSONObject jSONObject = f17643e;
        if (jSONObject != null) {
            return jSONObject;
        }
        f17639a.getClass();
        String a2 = b().a();
        if (a2 == null) {
            return null;
        }
        return new JSONObject(a2);
    }

    public static final boolean g() {
        if (!f17644f.isLimitAdTrackingEnabled()) {
            f17639a.getClass();
            if (e().e()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean h() {
        return f17644f.isAdvertisingIdWasGenerated();
    }

    public static final boolean i() {
        return f17644f.isLimitAdTrackingEnabled();
    }

    public static final boolean j() {
        f17639a.getClass();
        return e().b();
    }

    public static final void a(Boolean bool) {
        x2 x2Var = f17639a;
        x2Var.getClass();
        if (e().a(bool) && q4.f17049c) {
            x2Var.getClass();
            if (!e().a()) {
                x2Var.getClass();
                if (!e().g()) {
                    return;
                }
            }
            r0.d();
        }
    }

    public static void a(Consent consent) {
        if (e().a(consent) && q4.f17049c) {
            x2 x2Var = f17639a;
            x2Var.getClass();
            if (!e().a()) {
                x2Var.getClass();
                if (!e().g()) {
                    return;
                }
            }
            r0.d();
        }
    }

    public static void a(UserConsent userConsent) {
        Intrinsics.checkNotNullParameter(userConsent, "publisherZoneConsent");
        if (e().a(userConsent) && q4.f17049c) {
            x2 x2Var = f17639a;
            x2Var.getClass();
            if (!e().a()) {
                x2Var.getClass();
                if (!e().g()) {
                    return;
                }
            }
            r0.d();
        }
    }

    public static final void a(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "jObject");
        f17639a.getClass();
        e().a(jSONObject);
        HashSet hashSet = f17646h;
        hashSet.clear();
        int i = 0;
        if (jSONObject.has("gdpr")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("gdpr");
            if (optJSONObject == null || !optJSONObject.has("do_not_collect")) {
                hashSet.addAll(f17645g);
            } else {
                JSONArray optJSONArray = optJSONObject.optJSONArray("do_not_collect");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    int i2 = 0;
                    while (i2 < length) {
                        int i3 = i2 + 1;
                        String optString = optJSONArray.optString(i2, (String) null);
                        if (optString != null) {
                            f17646h.add(optString);
                        }
                        i2 = i3;
                    }
                }
            }
        }
        if (jSONObject.has("ccpa")) {
            JSONObject optJSONObject2 = jSONObject.optJSONObject("ccpa");
            if (optJSONObject2 == null || !optJSONObject2.has("do_not_collect")) {
                f17646h.addAll(f17645g);
                return;
            }
            JSONArray optJSONArray2 = optJSONObject2.optJSONArray("do_not_collect");
            if (optJSONArray2 != null) {
                int length2 = optJSONArray2.length();
                while (i < length2) {
                    int i4 = i + 1;
                    String optString2 = optJSONArray2.optString(i, (String) null);
                    if (optString2 != null) {
                        f17646h.add(optString2);
                    }
                    i = i4;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r5, android.content.Context r6, com.appodeal.advertising.AdvertisingInfo.AdvertisingProfile r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.appodeal.ads.x2.a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.appodeal.ads.x2$a r0 = (com.appodeal.ads.x2.a) r0
            int r1 = r0.f17650d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f17650d = r1
            goto L_0x0018
        L_0x0013:
            com.appodeal.ads.x2$a r0 = new com.appodeal.ads.x2$a
            r0.<init>(r4, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f17648b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f17650d
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            com.appodeal.ads.x2 r5 = r0.f17647a
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0049
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r8)
            a((com.appodeal.advertising.AdvertisingInfo.AdvertisingProfile) r7)
            com.appodeal.ads.regulator.h r7 = e()
            r0.f17647a = r4
            r0.f17650d = r3
            java.lang.Object r5 = r7.a(r6, r5, r0)
            if (r5 != r1) goto L_0x0048
            return r1
        L_0x0048:
            r5 = r4
        L_0x0049:
            r5.getClass()
            kotlin.Lazy r5 = f17642d
            java.lang.Object r5 = r5.getValue()
            com.appodeal.ads.networking.cache.c r5 = (com.appodeal.ads.networking.cache.c) r5
            org.json.JSONObject r5 = r5.a()
            if (r5 != 0) goto L_0x005b
            goto L_0x005e
        L_0x005b:
            a((org.json.JSONObject) r5)
        L_0x005e:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.x2.a(java.lang.String, android.content.Context, com.appodeal.advertising.AdvertisingInfo$AdvertisingProfile, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
