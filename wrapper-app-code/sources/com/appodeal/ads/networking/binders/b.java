package com.appodeal.ads.networking.binders;

import com.amazon.aps.shared.APSAnalytics;
import com.appodeal.ads.h0;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.common.internal.service.ServiceData;
import com.appodeal.ads.modules.common.internal.service.ServiceInfo;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

public interface b {

    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public final String f16890a;

        /* renamed from: b  reason: collision with root package name */
        public final Boolean f16891b;

        /* renamed from: c  reason: collision with root package name */
        public final Boolean f16892c;

        /* renamed from: d  reason: collision with root package name */
        public final String f16893d;

        /* renamed from: e  reason: collision with root package name */
        public final long f16894e;

        /* renamed from: f  reason: collision with root package name */
        public final Long f16895f;

        /* renamed from: g  reason: collision with root package name */
        public final Long f16896g;

        /* renamed from: h  reason: collision with root package name */
        public final Long f16897h;
        public final String i;
        public final C0189a j;

        /* renamed from: com.appodeal.ads.networking.binders.b$a$a  reason: collision with other inner class name */
        public interface C0189a {

            /* renamed from: com.appodeal.ads.networking.binders.b$a$a$a  reason: collision with other inner class name */
            public static final class C0190a implements C0189a {

                /* renamed from: a  reason: collision with root package name */
                public final String f16898a;

                /* renamed from: b  reason: collision with root package name */
                public final int f16899b;

                /* renamed from: c  reason: collision with root package name */
                public final boolean f16900c;

                /* renamed from: d  reason: collision with root package name */
                public final boolean f16901d;

                public C0190a(String str, int i, boolean z, boolean z2) {
                    Intrinsics.checkNotNullParameter(str, "type");
                    this.f16898a = str;
                    this.f16899b = i;
                    this.f16900c = z;
                    this.f16901d = z2;
                }

                public final boolean a() {
                    return this.f16900c;
                }

                public final int b() {
                    return this.f16899b;
                }

                public final boolean c() {
                    return this.f16901d;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0190a)) {
                        return false;
                    }
                    C0190a aVar = (C0190a) obj;
                    return Intrinsics.areEqual((Object) this.f16898a, (Object) aVar.f16898a) && this.f16899b == aVar.f16899b && this.f16900c == aVar.f16900c && this.f16901d == aVar.f16901d;
                }

                public final String getType() {
                    return this.f16898a;
                }

                public final int hashCode() {
                    int hashCode = (this.f16899b + (this.f16898a.hashCode() * 31)) * 31;
                    boolean z = this.f16900c;
                    boolean z2 = true;
                    if (z) {
                        z = true;
                    }
                    int i = (hashCode + (z ? 1 : 0)) * 31;
                    boolean z3 = this.f16901d;
                    if (!z3) {
                        z2 = z3;
                    }
                    return i + (z2 ? 1 : 0);
                }

                public final String toString() {
                    StringBuilder a2 = h0.a("Banner(type=");
                    a2.append(this.f16898a);
                    a2.append(", size=");
                    a2.append(this.f16899b);
                    a2.append(", animation=");
                    a2.append(this.f16900c);
                    a2.append(", smart=");
                    a2.append(this.f16901d);
                    a2.append(')');
                    return a2.toString();
                }
            }

            /* renamed from: com.appodeal.ads.networking.binders.b$a$a$b  reason: collision with other inner class name */
            public static final class C0191b implements C0189a {

                /* renamed from: a  reason: collision with root package name */
                public static final C0191b f16902a = new C0191b();

                public final String getType() {
                    return "banner";
                }
            }

            /* renamed from: com.appodeal.ads.networking.binders.b$a$a$c */
            public static final class c implements C0189a {

                /* renamed from: a  reason: collision with root package name */
                public static final c f16903a = new c();

                public final String getType() {
                    return "bannerview";
                }
            }

            /* renamed from: com.appodeal.ads.networking.binders.b$a$a$d */
            public static final class d implements C0189a {

                /* renamed from: a  reason: collision with root package name */
                public final String f16904a;

                public d(String str) {
                    Intrinsics.checkNotNullParameter(str, "type");
                    this.f16904a = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof d) && Intrinsics.areEqual((Object) this.f16904a, (Object) ((d) obj).f16904a);
                }

                public final String getType() {
                    return this.f16904a;
                }

                public final int hashCode() {
                    return this.f16904a.hashCode();
                }

                public final String toString() {
                    StringBuilder a2 = h0.a("Native(type=");
                    a2.append(this.f16904a);
                    a2.append(')');
                    return a2.toString();
                }
            }

            /* renamed from: com.appodeal.ads.networking.binders.b$a$a$e */
            public static final class e implements C0189a {

                /* renamed from: a  reason: collision with root package name */
                public static final e f16905a = new e();

                public final String getType() {
                    return "rewarded_video";
                }
            }

            /* renamed from: com.appodeal.ads.networking.binders.b$a$a$f */
            public static final class f implements C0189a {

                /* renamed from: a  reason: collision with root package name */
                public static final f f16906a = new f();

                public final String getType() {
                    return "video";
                }
            }

            String getType();
        }

        public a(String str, Boolean bool, Boolean bool2, String str2, long j2, Long l, Long l2, Long l3, String str3, C0189a aVar) {
            Intrinsics.checkNotNullParameter(str, "adType");
            this.f16890a = str;
            this.f16891b = bool;
            this.f16892c = bool2;
            this.f16893d = str2;
            this.f16894e = j2;
            this.f16895f = l;
            this.f16896g = l2;
            this.f16897h = l3;
            this.i = str3;
            this.j = aVar;
        }

        public final C0189a a() {
            return this.j;
        }

        public final String b() {
            return this.f16890a;
        }

        public final Long c() {
            return this.f16896g;
        }

        public final Long d() {
            return this.f16897h;
        }

        public final String e() {
            return this.i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual((Object) this.f16890a, (Object) aVar.f16890a) && Intrinsics.areEqual((Object) this.f16891b, (Object) aVar.f16891b) && Intrinsics.areEqual((Object) this.f16892c, (Object) aVar.f16892c) && Intrinsics.areEqual((Object) this.f16893d, (Object) aVar.f16893d) && this.f16894e == aVar.f16894e && Intrinsics.areEqual((Object) this.f16895f, (Object) aVar.f16895f) && Intrinsics.areEqual((Object) this.f16896g, (Object) aVar.f16896g) && Intrinsics.areEqual((Object) this.f16897h, (Object) aVar.f16897h) && Intrinsics.areEqual((Object) this.i, (Object) aVar.i) && Intrinsics.areEqual((Object) this.j, (Object) aVar.j);
        }

        public final Boolean f() {
            return this.f16892c;
        }

        public final String g() {
            return this.f16893d;
        }

        public final Boolean h() {
            return this.f16891b;
        }

        public final int hashCode() {
            int hashCode = this.f16890a.hashCode() * 31;
            Boolean bool = this.f16891b;
            int i2 = 0;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.f16892c;
            int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str = this.f16893d;
            int hashCode4 = (C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f16894e) + ((hashCode3 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            Long l = this.f16895f;
            int hashCode5 = (hashCode4 + (l == null ? 0 : l.hashCode())) * 31;
            Long l2 = this.f16896g;
            int hashCode6 = (hashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
            Long l3 = this.f16897h;
            int hashCode7 = (hashCode6 + (l3 == null ? 0 : l3.hashCode())) * 31;
            String str2 = this.i;
            int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
            C0189a aVar = this.j;
            if (aVar != null) {
                i2 = aVar.hashCode();
            }
            return hashCode8 + i2;
        }

        public final long i() {
            return this.f16894e;
        }

        public final Long j() {
            return this.f16895f;
        }

        public final String toString() {
            StringBuilder a2 = h0.a("AdRequest(adType=");
            a2.append(this.f16890a);
            a2.append(", rewardedVideo=");
            a2.append(this.f16891b);
            a2.append(", largeBanners=");
            a2.append(this.f16892c);
            a2.append(", mainId=");
            a2.append(this.f16893d);
            a2.append(", segmentId=");
            a2.append(this.f16894e);
            a2.append(", showTimeStamp=");
            a2.append(this.f16895f);
            a2.append(", clickTimeStamp=");
            a2.append(this.f16896g);
            a2.append(", finishTimeStamp=");
            a2.append(this.f16897h);
            a2.append(", impressionId=");
            a2.append(this.i);
            a2.append(", adProperties=");
            a2.append(this.j);
            a2.append(')');
            return a2.toString();
        }
    }

    /* renamed from: com.appodeal.ads.networking.binders.b$b  reason: collision with other inner class name */
    public static final class C0192b implements b {

        /* renamed from: a  reason: collision with root package name */
        public final a f16907a;

        /* renamed from: com.appodeal.ads.networking.binders.b$b$a */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            public final String f16908a;

            /* renamed from: b  reason: collision with root package name */
            public final int f16909b;

            /* renamed from: c  reason: collision with root package name */
            public final int f16910c;

            /* renamed from: d  reason: collision with root package name */
            public final int f16911d;

            /* renamed from: e  reason: collision with root package name */
            public final int f16912e;

            /* renamed from: f  reason: collision with root package name */
            public final Integer f16913f;

            /* renamed from: g  reason: collision with root package name */
            public final int f16914g;

            public a(String str, int i, int i2, int i3, int i4, Integer num, int i5) {
                Intrinsics.checkNotNullParameter(str, "adServerCodeName");
                this.f16908a = str;
                this.f16909b = i;
                this.f16910c = i2;
                this.f16911d = i3;
                this.f16912e = i4;
                this.f16913f = num;
                this.f16914g = i5;
            }

            public final String a() {
                return this.f16908a;
            }

            public final int b() {
                return this.f16911d;
            }

            public final int c() {
                return this.f16912e;
            }

            public final Integer d() {
                return this.f16913f;
            }

            public final int e() {
                return this.f16914g;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Intrinsics.areEqual((Object) this.f16908a, (Object) aVar.f16908a) && this.f16909b == aVar.f16909b && this.f16910c == aVar.f16910c && this.f16911d == aVar.f16911d && this.f16912e == aVar.f16912e && Intrinsics.areEqual((Object) this.f16913f, (Object) aVar.f16913f) && this.f16914g == aVar.f16914g;
            }

            public final int f() {
                return this.f16909b;
            }

            public final int g() {
                return this.f16910c;
            }

            public final int hashCode() {
                int i = this.f16909b;
                int i2 = this.f16910c;
                int hashCode = (this.f16912e + ((this.f16911d + ((i2 + ((i + (this.f16908a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
                Integer num = this.f16913f;
                return this.f16914g + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder a2 = h0.a("AdStat(adServerCodeName=");
                a2.append(this.f16908a);
                a2.append(", impressions=");
                a2.append(this.f16909b);
                a2.append(", impressionsTotal=");
                a2.append(this.f16910c);
                a2.append(", click=");
                a2.append(this.f16911d);
                a2.append(", clickTotal=");
                a2.append(this.f16912e);
                a2.append(", finish=");
                a2.append(this.f16913f);
                a2.append(", finishTotal=");
                a2.append(this.f16914g);
                a2.append(')');
                return a2.toString();
            }
        }

        public C0192b(a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "adStats");
            this.f16907a = aVar;
        }

        public final a a() {
            return this.f16907a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0192b) && Intrinsics.areEqual((Object) this.f16907a, (Object) ((C0192b) obj).f16907a);
        }

        public final int hashCode() {
            return this.f16907a.hashCode();
        }

        public final String toString() {
            StringBuilder a2 = h0.a("AdStats(adStats=");
            a2.append(this.f16907a);
            a2.append(')');
            return a2.toString();
        }
    }

    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        public final List<String> f16915a;

        /* renamed from: b  reason: collision with root package name */
        public final Map<String, a> f16916b;

        public c(ArrayList arrayList, LinkedHashMap linkedHashMap) {
            Intrinsics.checkNotNullParameter(arrayList, "showArray");
            Intrinsics.checkNotNullParameter(linkedHashMap, "adapters");
            this.f16915a = arrayList;
            this.f16916b = linkedHashMap;
        }

        public final Map<String, a> a() {
            return this.f16916b;
        }

        public final List<String> b() {
            return this.f16915a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual((Object) this.f16915a, (Object) cVar.f16915a) && Intrinsics.areEqual((Object) this.f16916b, (Object) cVar.f16916b);
        }

        public final int hashCode() {
            return this.f16916b.hashCode() + (this.f16915a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder a2 = h0.a("Adapters(showArray=");
            a2.append(this.f16915a);
            a2.append(", adapters=");
            a2.append(this.f16916b);
            a2.append(')');
            return a2.toString();
        }
    }

    public static final class d implements b {

        /* renamed from: a  reason: collision with root package name */
        public final String f16917a;

        /* renamed from: b  reason: collision with root package name */
        public final String f16918b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f16919c;

        public d(String str, String str2, boolean z) {
            Intrinsics.checkNotNullParameter(str, "ifa");
            Intrinsics.checkNotNullParameter(str2, "advertisingTracking");
            this.f16917a = str;
            this.f16918b = str2;
            this.f16919c = z;
        }

        public final boolean a() {
            return this.f16919c;
        }

        public final String b() {
            return this.f16918b;
        }

        public final String c() {
            return this.f16917a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.areEqual((Object) this.f16917a, (Object) dVar.f16917a) && Intrinsics.areEqual((Object) this.f16918b, (Object) dVar.f16918b) && this.f16919c == dVar.f16919c;
        }

        public final int hashCode() {
            int a2 = com.appodeal.ads.networking.a.a(this.f16918b, this.f16917a.hashCode() * 31, 31);
            boolean z = this.f16919c;
            if (z) {
                z = true;
            }
            return a2 + (z ? 1 : 0);
        }

        public final String toString() {
            StringBuilder a2 = h0.a("Advertising(ifa=");
            a2.append(this.f16917a);
            a2.append(", advertisingTracking=");
            a2.append(this.f16918b);
            a2.append(", advertisingIdGenerated=");
            a2.append(this.f16919c);
            a2.append(')');
            return a2.toString();
        }
    }

    public static final class e implements b {
        public final double A;
        public final long B;
        public final long C;
        public final long D;
        public final long E;
        public final long F;
        public final long G;
        public final double H;
        public final boolean I;
        public final Boolean J;
        public final JSONObject K;

        /* renamed from: a  reason: collision with root package name */
        public final String f16920a;

        /* renamed from: b  reason: collision with root package name */
        public final String f16921b;

        /* renamed from: c  reason: collision with root package name */
        public final String f16922c = APSAnalytics.OS_NAME;

        /* renamed from: d  reason: collision with root package name */
        public final String f16923d;

        /* renamed from: e  reason: collision with root package name */
        public final String f16924e;

        /* renamed from: f  reason: collision with root package name */
        public final String f16925f;

        /* renamed from: g  reason: collision with root package name */
        public final String f16926g;

        /* renamed from: h  reason: collision with root package name */
        public final int f16927h;
        public final String i;
        public final String j;
        public final String k;
        public final Long l;
        public final String m;
        public final String n;
        public final String o;
        public final String p;
        public final double q;
        public final String r;
        public final boolean s;
        public final String t;
        public final String u;
        public final boolean v;
        public final String w;
        public final int x;
        public final int y;
        public final String z;

        public e(String str, String str2, String str3, String str4, String str5, String str6, int i2, String str7, String str8, String str9, Long l2, String str10, String str11, String str12, String str13, double d2, String str14, boolean z2, String str15, String str16, boolean z3, String str17, int i3, int i4, String str18, double d3, long j2, long j3, long j4, long j5, long j6, long j7, double d4, boolean z4, Boolean bool, JSONObject jSONObject) {
            String str19 = str3;
            String str20 = str4;
            String str21 = str5;
            String str22 = str6;
            String str23 = str8;
            String str24 = str14;
            String str25 = str15;
            String str26 = str16;
            Intrinsics.checkNotNullParameter(str, Constants.APP_KEY);
            Intrinsics.checkNotNullParameter(str2, ServiceProvider.NAMED_SDK);
            Intrinsics.checkNotNullParameter(APSAnalytics.OS_NAME, "os");
            Intrinsics.checkNotNullParameter(str19, "osVersion");
            Intrinsics.checkNotNullParameter(str20, "osv");
            Intrinsics.checkNotNullParameter(str21, "platform");
            Intrinsics.checkNotNullParameter(str22, MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
            Intrinsics.checkNotNullParameter(str23, "packageName");
            Intrinsics.checkNotNullParameter(str24, "deviceType");
            Intrinsics.checkNotNullParameter(str25, "manufacturer");
            Intrinsics.checkNotNullParameter(str26, "deviceModelManufacturer");
            this.f16920a = str;
            this.f16921b = str2;
            this.f16923d = str19;
            this.f16924e = str20;
            this.f16925f = str21;
            this.f16926g = str22;
            this.f16927h = i2;
            this.i = str7;
            this.j = str23;
            this.k = str9;
            this.l = l2;
            this.m = str10;
            this.n = str11;
            this.o = str12;
            this.p = str13;
            this.q = d2;
            this.r = str24;
            this.s = z2;
            this.t = str25;
            this.u = str26;
            this.v = z3;
            this.w = str17;
            this.x = i3;
            this.y = i4;
            this.z = str18;
            this.A = d3;
            this.B = j2;
            this.C = j3;
            this.D = j4;
            this.E = j5;
            this.F = j6;
            this.G = j7;
            this.H = d4;
            this.I = z4;
            this.J = bool;
            this.K = jSONObject;
        }

        public final boolean A() {
            return this.v;
        }

        public final int B() {
            return this.y;
        }

        public final double C() {
            return this.q;
        }

        public final int D() {
            return this.x;
        }

        public final String E() {
            return this.f16921b;
        }

        public final String F() {
            return this.i;
        }

        public final long G() {
            return this.C;
        }

        public final long H() {
            return this.B;
        }

        public final long I() {
            return this.D;
        }

        public final Boolean J() {
            return this.J;
        }

        public final String K() {
            return this.w;
        }

        public final String a() {
            return this.f16926g;
        }

        public final int b() {
            return this.f16927h;
        }

        public final String c() {
            return this.f16920a;
        }

        public final String d() {
            return this.n;
        }

        public final String e() {
            return this.o;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Intrinsics.areEqual((Object) this.f16920a, (Object) eVar.f16920a) && Intrinsics.areEqual((Object) this.f16921b, (Object) eVar.f16921b) && Intrinsics.areEqual((Object) this.f16922c, (Object) eVar.f16922c) && Intrinsics.areEqual((Object) this.f16923d, (Object) eVar.f16923d) && Intrinsics.areEqual((Object) this.f16924e, (Object) eVar.f16924e) && Intrinsics.areEqual((Object) this.f16925f, (Object) eVar.f16925f) && Intrinsics.areEqual((Object) this.f16926g, (Object) eVar.f16926g) && this.f16927h == eVar.f16927h && Intrinsics.areEqual((Object) this.i, (Object) eVar.i) && Intrinsics.areEqual((Object) this.j, (Object) eVar.j) && Intrinsics.areEqual((Object) this.k, (Object) eVar.k) && Intrinsics.areEqual((Object) this.l, (Object) eVar.l) && Intrinsics.areEqual((Object) this.m, (Object) eVar.m) && Intrinsics.areEqual((Object) this.n, (Object) eVar.n) && Intrinsics.areEqual((Object) this.o, (Object) eVar.o) && Intrinsics.areEqual((Object) this.p, (Object) eVar.p) && Intrinsics.areEqual((Object) Double.valueOf(this.q), (Object) Double.valueOf(eVar.q)) && Intrinsics.areEqual((Object) this.r, (Object) eVar.r) && this.s == eVar.s && Intrinsics.areEqual((Object) this.t, (Object) eVar.t) && Intrinsics.areEqual((Object) this.u, (Object) eVar.u) && this.v == eVar.v && Intrinsics.areEqual((Object) this.w, (Object) eVar.w) && this.x == eVar.x && this.y == eVar.y && Intrinsics.areEqual((Object) this.z, (Object) eVar.z) && Intrinsics.areEqual((Object) Double.valueOf(this.A), (Object) Double.valueOf(eVar.A)) && this.B == eVar.B && this.C == eVar.C && this.D == eVar.D && this.E == eVar.E && this.F == eVar.F && this.G == eVar.G && Intrinsics.areEqual((Object) Double.valueOf(this.H), (Object) Double.valueOf(eVar.H)) && this.I == eVar.I && Intrinsics.areEqual((Object) this.J, (Object) eVar.J) && Intrinsics.areEqual((Object) this.K, (Object) eVar.K);
        }

        public final String f() {
            return this.p;
        }

        public final double g() {
            return this.A;
        }

        public final boolean h() {
            return this.I;
        }

        public final int hashCode() {
            int a2 = (this.f16927h + com.appodeal.ads.networking.a.a(this.f16926g, com.appodeal.ads.networking.a.a(this.f16925f, com.appodeal.ads.networking.a.a(this.f16924e, com.appodeal.ads.networking.a.a(this.f16923d, com.appodeal.ads.networking.a.a(this.f16922c, com.appodeal.ads.networking.a.a(this.f16921b, this.f16920a.hashCode() * 31, 31), 31), 31), 31), 31), 31)) * 31;
            String str = this.i;
            int i2 = 0;
            int a3 = com.appodeal.ads.networking.a.a(this.j, (a2 + (str == null ? 0 : str.hashCode())) * 31, 31);
            String str2 = this.k;
            int hashCode = (a3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Long l2 = this.l;
            int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
            String str3 = this.m;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.n;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.o;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.p;
            int a4 = com.appodeal.ads.networking.a.a(this.r, (Double.doubleToLongBits(this.q) + ((hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31)) * 31, 31);
            boolean z2 = this.s;
            boolean z3 = true;
            if (z2) {
                z2 = true;
            }
            int a5 = com.appodeal.ads.networking.a.a(this.u, com.appodeal.ads.networking.a.a(this.t, (a4 + (z2 ? 1 : 0)) * 31, 31), 31);
            boolean z4 = this.v;
            if (z4) {
                z4 = true;
            }
            int i3 = (a5 + (z4 ? 1 : 0)) * 31;
            String str7 = this.w;
            int hashCode6 = (this.y + ((this.x + ((i3 + (str7 == null ? 0 : str7.hashCode())) * 31)) * 31)) * 31;
            String str8 = this.z;
            int hashCode7 = (Double.doubleToLongBits(this.H) + ((C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.G) + ((C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.F) + ((C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.E) + ((C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.D) + ((C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.C) + ((C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.B) + ((Double.doubleToLongBits(this.A) + ((hashCode6 + (str8 == null ? 0 : str8.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
            boolean z5 = this.I;
            if (!z5) {
                z3 = z5;
            }
            int i4 = (hashCode7 + (z3 ? 1 : 0)) * 31;
            Boolean bool = this.J;
            int hashCode8 = (i4 + (bool == null ? 0 : bool.hashCode())) * 31;
            JSONObject jSONObject = this.K;
            if (jSONObject != null) {
                i2 = jSONObject.hashCode();
            }
            return hashCode8 + i2;
        }

        public final double i() {
            return this.H;
        }

        public final String j() {
            return this.z;
        }

        public final String k() {
            return this.u;
        }

        public final String l() {
            return this.r;
        }

        public final JSONObject m() {
            return this.K;
        }

        public final boolean n() {
            return this.s;
        }

        public final Long o() {
            return this.l;
        }

        public final String p() {
            return this.m;
        }

        public final String q() {
            return this.t;
        }

        public final String r() {
            return this.f16922c;
        }

        public final String s() {
            return this.f16923d;
        }

        public final String t() {
            return this.f16924e;
        }

        public final String toString() {
            return "Base(appKey=" + this.f16920a + ", sdk=" + this.f16921b + ", os=" + this.f16922c + ", osVersion=" + this.f16923d + ", osv=" + this.f16924e + ", platform=" + this.f16925f + ", android=" + this.f16926g + ", androidLevel=" + this.f16927h + ", secureAndroidId=" + this.i + ", packageName=" + this.j + ", packageVersion=" + this.k + ", installTime=" + this.l + ", installer=" + this.m + ", appodealFramework=" + this.n + ", appodealFrameworkVersion=" + this.o + ", appodealPluginVersion=" + this.p + ", screenPxRatio=" + this.q + ", deviceType=" + this.r + ", httpAllowed=" + this.s + ", manufacturer=" + this.t + ", deviceModelManufacturer=" + this.u + ", rooted=" + this.v + ", webviewVersion=" + this.w + ", screenWidth=" + this.x + ", screenHeight=" + this.y + ", crr=" + this.z + ", battery=" + this.A + ", storageSize=" + this.B + ", storageFree=" + this.C + ", storageUsed=" + this.D + ", ramSize=" + this.E + ", ramFree=" + this.F + ", ramUsed=" + this.G + ", cpuUsage=" + this.H + ", coppa=" + this.I + ", testMode=" + this.J + ", extensions=" + this.K + ')';
        }

        public final String u() {
            return this.j;
        }

        public final String v() {
            return this.k;
        }

        public final String w() {
            return this.f16925f;
        }

        public final long x() {
            return this.F;
        }

        public final long y() {
            return this.E;
        }

        public final long z() {
            return this.G;
        }
    }

    public static final class f implements b {

        /* renamed from: a  reason: collision with root package name */
        public final String f16928a;

        /* renamed from: b  reason: collision with root package name */
        public final String f16929b;

        public f(String str, String str2) {
            this.f16928a = str;
            this.f16929b = str2;
        }

        public final String a() {
            return this.f16928a;
        }

        public final String b() {
            return this.f16929b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return Intrinsics.areEqual((Object) this.f16928a, (Object) fVar.f16928a) && Intrinsics.areEqual((Object) this.f16929b, (Object) fVar.f16929b);
        }

        public final int hashCode() {
            String str = this.f16928a;
            int i = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f16929b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder a2 = h0.a("Connection(connection=");
            a2.append(this.f16928a);
            a2.append(", connectionSubtype=");
            a2.append(this.f16929b);
            a2.append(')');
            return a2.toString();
        }
    }

    public static final class g implements b {

        /* renamed from: a  reason: collision with root package name */
        public final Boolean f16930a;

        /* renamed from: b  reason: collision with root package name */
        public final JSONArray f16931b;

        /* renamed from: c  reason: collision with root package name */
        public final Boolean f16932c;

        public g(Boolean bool, JSONArray jSONArray, Boolean bool2) {
            this.f16930a = bool;
            this.f16931b = jSONArray;
            this.f16932c = bool2;
        }

        public final Boolean a() {
            return this.f16930a;
        }

        public final Boolean b() {
            return this.f16932c;
        }

        public final JSONArray c() {
            return this.f16931b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return Intrinsics.areEqual((Object) this.f16930a, (Object) gVar.f16930a) && Intrinsics.areEqual((Object) this.f16931b, (Object) gVar.f16931b) && Intrinsics.areEqual((Object) this.f16932c, (Object) gVar.f16932c);
        }

        public final int hashCode() {
            Boolean bool = this.f16930a;
            int i = 0;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            JSONArray jSONArray = this.f16931b;
            int hashCode2 = (hashCode + (jSONArray == null ? 0 : jSONArray.hashCode())) * 31;
            Boolean bool2 = this.f16932c;
            if (bool2 != null) {
                i = bool2.hashCode();
            }
            return hashCode2 + i;
        }

        public final String toString() {
            StringBuilder a2 = h0.a("Get(adTypeDebug=");
            a2.append(this.f16930a);
            a2.append(", suspiciousActivity=");
            a2.append(this.f16931b);
            a2.append(", checkSdkVersion=");
            a2.append(this.f16932c);
            a2.append(')');
            return a2.toString();
        }
    }

    public static final class h implements b {

        /* renamed from: a  reason: collision with root package name */
        public final Integer f16933a;

        /* renamed from: b  reason: collision with root package name */
        public final Float f16934b;

        /* renamed from: c  reason: collision with root package name */
        public final Float f16935c;

        public h(Integer num, Float f2, Float f3) {
            this.f16933a = num;
            this.f16934b = f2;
            this.f16935c = f3;
        }

        public final Float a() {
            return this.f16934b;
        }

        public final Integer b() {
            return this.f16933a;
        }

        public final Float c() {
            return this.f16935c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Intrinsics.areEqual((Object) this.f16933a, (Object) hVar.f16933a) && Intrinsics.areEqual((Object) this.f16934b, (Object) hVar.f16934b) && Intrinsics.areEqual((Object) this.f16935c, (Object) hVar.f16935c);
        }

        public final int hashCode() {
            Integer num = this.f16933a;
            int i = 0;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Float f2 = this.f16934b;
            int hashCode2 = (hashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
            Float f3 = this.f16935c;
            if (f3 != null) {
                i = f3.hashCode();
            }
            return hashCode2 + i;
        }

        public final String toString() {
            StringBuilder a2 = h0.a("Location(locationType=");
            a2.append(this.f16933a);
            a2.append(", latitude=");
            a2.append(this.f16934b);
            a2.append(", longitude=");
            a2.append(this.f16935c);
            a2.append(')');
            return a2.toString();
        }
    }

    public static final class i implements b {

        /* renamed from: a  reason: collision with root package name */
        public final JSONObject f16936a;

        public i(JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "customState");
            this.f16936a = jSONObject;
        }

        public final JSONObject a() {
            return this.f16936a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && Intrinsics.areEqual((Object) this.f16936a, (Object) ((i) obj).f16936a);
        }

        public final int hashCode() {
            return this.f16936a.hashCode();
        }

        public final String toString() {
            StringBuilder a2 = h0.a("Segment(customState=");
            a2.append(this.f16936a);
            a2.append(')');
            return a2.toString();
        }
    }

    public static final class j implements b {

        /* renamed from: a  reason: collision with root package name */
        public final List<ServiceInfo> f16937a;

        public j(List<ServiceInfo> list) {
            Intrinsics.checkNotNullParameter(list, "services");
            this.f16937a = list;
        }

        public final List<ServiceInfo> a() {
            return this.f16937a;
        }
    }

    public static final class k implements b {

        /* renamed from: a  reason: collision with root package name */
        public final List<ServiceData> f16938a;

        public k(List<? extends ServiceData> list) {
            Intrinsics.checkNotNullParameter(list, "servicesData");
            this.f16938a = list;
        }

        public final List<ServiceData> a() {
            return this.f16938a;
        }
    }

    public static final class l implements b {

        /* renamed from: a  reason: collision with root package name */
        public final long f16939a;

        /* renamed from: b  reason: collision with root package name */
        public final String f16940b;

        /* renamed from: c  reason: collision with root package name */
        public final long f16941c;

        /* renamed from: d  reason: collision with root package name */
        public final long f16942d;

        /* renamed from: e  reason: collision with root package name */
        public final long f16943e;

        /* renamed from: f  reason: collision with root package name */
        public final long f16944f;

        /* renamed from: g  reason: collision with root package name */
        public final long f16945g;

        /* renamed from: h  reason: collision with root package name */
        public final long f16946h;
        public final long i;
        public final long j;

        public l(long j2, String str, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
            this.f16939a = j2;
            this.f16940b = str;
            this.f16941c = j3;
            this.f16942d = j4;
            this.f16943e = j5;
            this.f16944f = j6;
            this.f16945g = j7;
            this.f16946h = j8;
            this.i = j9;
            this.j = j10;
        }

        public final long a() {
            return this.i;
        }

        public final long b() {
            return this.j;
        }

        public final long c() {
            return this.f16945g;
        }

        public final long d() {
            return this.f16946h;
        }

        public final long e() {
            return this.f16939a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return this.f16939a == lVar.f16939a && Intrinsics.areEqual((Object) this.f16940b, (Object) lVar.f16940b) && this.f16941c == lVar.f16941c && this.f16942d == lVar.f16942d && this.f16943e == lVar.f16943e && this.f16944f == lVar.f16944f && this.f16945g == lVar.f16945g && this.f16946h == lVar.f16946h && this.i == lVar.i && this.j == lVar.j;
        }

        public final long f() {
            return this.f16943e;
        }

        public final long g() {
            return this.f16944f;
        }

        public final long h() {
            return this.f16941c;
        }

        public final int hashCode() {
            int hashCode = C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f16939a) * 31;
            String str = this.f16940b;
            int hashCode2 = str == null ? 0 : str.hashCode();
            int hashCode3 = C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f16941c);
            int hashCode4 = C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f16942d);
            int hashCode5 = C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f16943e);
            int hashCode6 = C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f16944f);
            int hashCode7 = C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f16945g);
            int hashCode8 = C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f16946h);
            return C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.j) + ((C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.i) + ((hashCode8 + ((hashCode7 + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode + hashCode2) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }

        public final long i() {
            return this.f16942d;
        }

        public final String j() {
            return this.f16940b;
        }

        public final String toString() {
            StringBuilder a2 = h0.a("Session(sessionId=");
            a2.append(this.f16939a);
            a2.append(", sessionUuid=");
            a2.append(this.f16940b);
            a2.append(", sessionUptime=");
            a2.append(this.f16941c);
            a2.append(", sessionUptimeMonotonicMs=");
            a2.append(this.f16942d);
            a2.append(", sessionStart=");
            a2.append(this.f16943e);
            a2.append(", sessionStartMonotonicMs=");
            a2.append(this.f16944f);
            a2.append(", appUptime=");
            a2.append(this.f16945g);
            a2.append(", appUptimeMonotonicMs=");
            a2.append(this.f16946h);
            a2.append(", appSessionAverageLength=");
            a2.append(this.i);
            a2.append(", appSessionAverageLengthMonotonicMs=");
            a2.append(this.j);
            a2.append(')');
            return a2.toString();
        }
    }

    public static final class m implements b {

        /* renamed from: a  reason: collision with root package name */
        public final JSONArray f16947a;

        public m(JSONArray jSONArray) {
            Intrinsics.checkNotNullParameter(jSONArray, "previousSessions");
            this.f16947a = jSONArray;
        }

        public final JSONArray a() {
            return this.f16947a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && Intrinsics.areEqual((Object) this.f16947a, (Object) ((m) obj).f16947a);
        }

        public final int hashCode() {
            return this.f16947a.hashCode();
        }

        public final String toString() {
            StringBuilder a2 = h0.a("Sessions(previousSessions=");
            a2.append(this.f16947a);
            a2.append(')');
            return a2.toString();
        }
    }

    public static final class n implements b {

        /* renamed from: a  reason: collision with root package name */
        public final String f16948a;

        /* renamed from: b  reason: collision with root package name */
        public final String f16949b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f16950c;

        /* renamed from: d  reason: collision with root package name */
        public final JSONObject f16951d;

        /* renamed from: e  reason: collision with root package name */
        public final JSONObject f16952e;

        /* renamed from: f  reason: collision with root package name */
        public final String f16953f;

        /* renamed from: g  reason: collision with root package name */
        public final String f16954g;

        /* renamed from: h  reason: collision with root package name */
        public final long f16955h;

        public n(String str, String str2, boolean z, JSONObject jSONObject, JSONObject jSONObject2, String str3, String str4, long j) {
            Intrinsics.checkNotNullParameter(str2, "userLocale");
            Intrinsics.checkNotNullParameter(str4, "userTimezone");
            this.f16948a = str;
            this.f16949b = str2;
            this.f16950c = z;
            this.f16951d = jSONObject;
            this.f16952e = jSONObject2;
            this.f16953f = str3;
            this.f16954g = str4;
            this.f16955h = j;
        }

        public final String a() {
            return this.f16953f;
        }

        public final boolean b() {
            return this.f16950c;
        }

        public final JSONObject c() {
            return this.f16951d;
        }

        public final String d() {
            return this.f16948a;
        }

        public final long e() {
            return this.f16955h;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return Intrinsics.areEqual((Object) this.f16948a, (Object) nVar.f16948a) && Intrinsics.areEqual((Object) this.f16949b, (Object) nVar.f16949b) && this.f16950c == nVar.f16950c && Intrinsics.areEqual((Object) this.f16951d, (Object) nVar.f16951d) && Intrinsics.areEqual((Object) this.f16952e, (Object) nVar.f16952e) && Intrinsics.areEqual((Object) this.f16953f, (Object) nVar.f16953f) && Intrinsics.areEqual((Object) this.f16954g, (Object) nVar.f16954g) && this.f16955h == nVar.f16955h;
        }

        public final String f() {
            return this.f16949b;
        }

        public final String g() {
            return this.f16954g;
        }

        public final JSONObject h() {
            return this.f16952e;
        }

        public final int hashCode() {
            String str = this.f16948a;
            int i = 0;
            int a2 = com.appodeal.ads.networking.a.a(this.f16949b, (str == null ? 0 : str.hashCode()) * 31, 31);
            boolean z = this.f16950c;
            if (z) {
                z = true;
            }
            int i2 = (a2 + (z ? 1 : 0)) * 31;
            JSONObject jSONObject = this.f16951d;
            int hashCode = (i2 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
            JSONObject jSONObject2 = this.f16952e;
            int hashCode2 = (hashCode + (jSONObject2 == null ? 0 : jSONObject2.hashCode())) * 31;
            String str2 = this.f16953f;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f16955h) + com.appodeal.ads.networking.a.a(this.f16954g, (hashCode2 + i) * 31, 31);
        }

        public final String toString() {
            StringBuilder a2 = h0.a("User(userId=");
            a2.append(this.f16948a);
            a2.append(", userLocale=");
            a2.append(this.f16949b);
            a2.append(", userConsent=");
            a2.append(this.f16950c);
            a2.append(", userIabConsentData=");
            a2.append(this.f16951d);
            a2.append(", userToken=");
            a2.append(this.f16952e);
            a2.append(", userAgent=");
            a2.append(this.f16953f);
            a2.append(", userTimezone=");
            a2.append(this.f16954g);
            a2.append(", userLocalTime=");
            a2.append(this.f16955h);
            a2.append(')');
            return a2.toString();
        }
    }
}
