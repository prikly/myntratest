package com.appodeal.ads.networking;

import com.appodeal.ads.h0;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final C0188b f16842a;

    /* renamed from: b  reason: collision with root package name */
    public final a f16843b;

    /* renamed from: c  reason: collision with root package name */
    public final c f16844c;

    /* renamed from: d  reason: collision with root package name */
    public final d f16845d;

    /* renamed from: e  reason: collision with root package name */
    public final f f16846e;

    /* renamed from: f  reason: collision with root package name */
    public final e f16847f;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f16848a;

        /* renamed from: b  reason: collision with root package name */
        public final String f16849b;

        /* renamed from: c  reason: collision with root package name */
        public final Map<String, String> f16850c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f16851d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f16852e;

        /* renamed from: f  reason: collision with root package name */
        public final long f16853f;

        /* renamed from: g  reason: collision with root package name */
        public final String f16854g;

        public a(String str, String str2, Map<String, String> map, boolean z, boolean z2, long j, String str3) {
            Intrinsics.checkNotNullParameter(str, "appToken");
            Intrinsics.checkNotNullParameter(str2, "environment");
            Intrinsics.checkNotNullParameter(map, "eventTokens");
            this.f16848a = str;
            this.f16849b = str2;
            this.f16850c = map;
            this.f16851d = z;
            this.f16852e = z2;
            this.f16853f = j;
            this.f16854g = str3;
        }

        public final String a() {
            return this.f16848a;
        }

        public final String b() {
            return this.f16849b;
        }

        public final Map<String, String> c() {
            return this.f16850c;
        }

        public final long d() {
            return this.f16853f;
        }

        public final String e() {
            return this.f16854g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual((Object) this.f16848a, (Object) aVar.f16848a) && Intrinsics.areEqual((Object) this.f16849b, (Object) aVar.f16849b) && Intrinsics.areEqual((Object) this.f16850c, (Object) aVar.f16850c) && this.f16851d == aVar.f16851d && this.f16852e == aVar.f16852e && this.f16853f == aVar.f16853f && Intrinsics.areEqual((Object) this.f16854g, (Object) aVar.f16854g);
        }

        public final boolean f() {
            return this.f16851d;
        }

        public final boolean g() {
            return this.f16852e;
        }

        public final int hashCode() {
            int hashCode = (this.f16850c.hashCode() + a.a(this.f16849b, this.f16848a.hashCode() * 31, 31)) * 31;
            boolean z = this.f16851d;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            boolean z3 = this.f16852e;
            if (!z3) {
                z2 = z3;
            }
            int hashCode2 = (C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f16853f) + ((i + (z2 ? 1 : 0)) * 31)) * 31;
            String str = this.f16854g;
            return hashCode2 + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder a2 = h0.a("AdjustConfig(appToken=");
            a2.append(this.f16848a);
            a2.append(", environment=");
            a2.append(this.f16849b);
            a2.append(", eventTokens=");
            a2.append(this.f16850c);
            a2.append(", isEventTrackingEnabled=");
            a2.append(this.f16851d);
            a2.append(", isRevenueTrackingEnabled=");
            a2.append(this.f16852e);
            a2.append(", initTimeoutMs=");
            a2.append(this.f16853f);
            a2.append(", initializationMode=");
            a2.append(this.f16854g);
            a2.append(')');
            return a2.toString();
        }
    }

    /* renamed from: com.appodeal.ads.networking.b$b  reason: collision with other inner class name */
    public static final class C0188b {

        /* renamed from: a  reason: collision with root package name */
        public final String f16855a;

        /* renamed from: b  reason: collision with root package name */
        public final String f16856b;

        /* renamed from: c  reason: collision with root package name */
        public final String f16857c;

        /* renamed from: d  reason: collision with root package name */
        public final List<String> f16858d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f16859e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f16860f;

        /* renamed from: g  reason: collision with root package name */
        public final long f16861g;

        /* renamed from: h  reason: collision with root package name */
        public final String f16862h;

        public C0188b(String str, String str2, String str3, List<String> list, boolean z, boolean z2, long j, String str4) {
            Intrinsics.checkNotNullParameter(str, "devKey");
            Intrinsics.checkNotNullParameter(str2, "appId");
            Intrinsics.checkNotNullParameter(str3, "adId");
            Intrinsics.checkNotNullParameter(list, "conversionKeys");
            this.f16855a = str;
            this.f16856b = str2;
            this.f16857c = str3;
            this.f16858d = list;
            this.f16859e = z;
            this.f16860f = z2;
            this.f16861g = j;
            this.f16862h = str4;
        }

        public final String a() {
            return this.f16856b;
        }

        public final List<String> b() {
            return this.f16858d;
        }

        public final String c() {
            return this.f16855a;
        }

        public final long d() {
            return this.f16861g;
        }

        public final String e() {
            return this.f16862h;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0188b)) {
                return false;
            }
            C0188b bVar = (C0188b) obj;
            return Intrinsics.areEqual((Object) this.f16855a, (Object) bVar.f16855a) && Intrinsics.areEqual((Object) this.f16856b, (Object) bVar.f16856b) && Intrinsics.areEqual((Object) this.f16857c, (Object) bVar.f16857c) && Intrinsics.areEqual((Object) this.f16858d, (Object) bVar.f16858d) && this.f16859e == bVar.f16859e && this.f16860f == bVar.f16860f && this.f16861g == bVar.f16861g && Intrinsics.areEqual((Object) this.f16862h, (Object) bVar.f16862h);
        }

        public final boolean f() {
            return this.f16859e;
        }

        public final boolean g() {
            return this.f16860f;
        }

        public final int hashCode() {
            int hashCode = (this.f16858d.hashCode() + a.a(this.f16857c, a.a(this.f16856b, this.f16855a.hashCode() * 31, 31), 31)) * 31;
            boolean z = this.f16859e;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            boolean z3 = this.f16860f;
            if (!z3) {
                z2 = z3;
            }
            int hashCode2 = (C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f16861g) + ((i + (z2 ? 1 : 0)) * 31)) * 31;
            String str = this.f16862h;
            return hashCode2 + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder a2 = h0.a("AppsflyerConfig(devKey=");
            a2.append(this.f16855a);
            a2.append(", appId=");
            a2.append(this.f16856b);
            a2.append(", adId=");
            a2.append(this.f16857c);
            a2.append(", conversionKeys=");
            a2.append(this.f16858d);
            a2.append(", isEventTrackingEnabled=");
            a2.append(this.f16859e);
            a2.append(", isRevenueTrackingEnabled=");
            a2.append(this.f16860f);
            a2.append(", initTimeoutMs=");
            a2.append(this.f16861g);
            a2.append(", initializationMode=");
            a2.append(this.f16862h);
            a2.append(')');
            return a2.toString();
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f16863a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f16864b;

        /* renamed from: c  reason: collision with root package name */
        public final long f16865c;

        public c(boolean z, boolean z2, long j) {
            this.f16863a = z;
            this.f16864b = z2;
            this.f16865c = j;
        }

        public final long a() {
            return this.f16865c;
        }

        public final boolean b() {
            return this.f16863a;
        }

        public final boolean c() {
            return this.f16864b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f16863a == cVar.f16863a && this.f16864b == cVar.f16864b && this.f16865c == cVar.f16865c;
        }

        public final int hashCode() {
            boolean z = this.f16863a;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            boolean z3 = this.f16864b;
            if (!z3) {
                z2 = z3;
            }
            return C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f16865c) + ((i + (z2 ? 1 : 0)) * 31);
        }

        public final String toString() {
            StringBuilder a2 = h0.a("FacebookConfig(isEventTrackingEnabled=");
            a2.append(this.f16863a);
            a2.append(", isRevenueTrackingEnabled=");
            a2.append(this.f16864b);
            a2.append(", initTimeoutMs=");
            a2.append(this.f16865c);
            a2.append(')');
            return a2.toString();
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final List<String> f16866a;

        /* renamed from: b  reason: collision with root package name */
        public final Long f16867b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f16868c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f16869d;

        /* renamed from: e  reason: collision with root package name */
        public final String f16870e;

        /* renamed from: f  reason: collision with root package name */
        public final long f16871f;

        /* renamed from: g  reason: collision with root package name */
        public final String f16872g;

        public d(List<String> list, Long l, boolean z, boolean z2, String str, long j, String str2) {
            Intrinsics.checkNotNullParameter(list, "configKeys");
            Intrinsics.checkNotNullParameter(str, "adRevenueKey");
            this.f16866a = list;
            this.f16867b = l;
            this.f16868c = z;
            this.f16869d = z2;
            this.f16870e = str;
            this.f16871f = j;
            this.f16872g = str2;
        }

        public final String a() {
            return this.f16870e;
        }

        public final List<String> b() {
            return this.f16866a;
        }

        public final Long c() {
            return this.f16867b;
        }

        public final long d() {
            return this.f16871f;
        }

        public final String e() {
            return this.f16872g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.areEqual((Object) this.f16866a, (Object) dVar.f16866a) && Intrinsics.areEqual((Object) this.f16867b, (Object) dVar.f16867b) && this.f16868c == dVar.f16868c && this.f16869d == dVar.f16869d && Intrinsics.areEqual((Object) this.f16870e, (Object) dVar.f16870e) && this.f16871f == dVar.f16871f && Intrinsics.areEqual((Object) this.f16872g, (Object) dVar.f16872g);
        }

        public final boolean f() {
            return this.f16868c;
        }

        public final boolean g() {
            return this.f16869d;
        }

        public final int hashCode() {
            int hashCode = this.f16866a.hashCode() * 31;
            Long l = this.f16867b;
            int i = 0;
            int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
            boolean z = this.f16868c;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
            boolean z3 = this.f16869d;
            if (!z3) {
                z2 = z3;
            }
            int hashCode3 = (C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f16871f) + a.a(this.f16870e, (i2 + (z2 ? 1 : 0)) * 31, 31)) * 31;
            String str = this.f16872g;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode3 + i;
        }

        public final String toString() {
            StringBuilder a2 = h0.a("FirebaseConfig(configKeys=");
            a2.append(this.f16866a);
            a2.append(", expirationDurationSec=");
            a2.append(this.f16867b);
            a2.append(", isEventTrackingEnabled=");
            a2.append(this.f16868c);
            a2.append(", isRevenueTrackingEnabled=");
            a2.append(this.f16869d);
            a2.append(", adRevenueKey=");
            a2.append(this.f16870e);
            a2.append(", initTimeoutMs=");
            a2.append(this.f16871f);
            a2.append(", initializationMode=");
            a2.append(this.f16872g);
            a2.append(')');
            return a2.toString();
        }
    }

    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final String f16873a;

        /* renamed from: b  reason: collision with root package name */
        public final String f16874b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f16875c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f16876d;

        /* renamed from: e  reason: collision with root package name */
        public final String f16877e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f16878f;

        /* renamed from: g  reason: collision with root package name */
        public final long f16879g;

        public e(String str, String str2, boolean z, boolean z2, String str3, boolean z3, long j) {
            Intrinsics.checkNotNullParameter(str, "sentryDsn");
            Intrinsics.checkNotNullParameter(str2, "sentryEnvironment");
            Intrinsics.checkNotNullParameter(str3, "mdsReportUrl");
            this.f16873a = str;
            this.f16874b = str2;
            this.f16875c = z;
            this.f16876d = z2;
            this.f16877e = str3;
            this.f16878f = z3;
            this.f16879g = j;
        }

        public final long a() {
            return this.f16879g;
        }

        public final String b() {
            return this.f16877e;
        }

        public final boolean c() {
            return this.f16875c;
        }

        public final String d() {
            return this.f16873a;
        }

        public final String e() {
            return this.f16874b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Intrinsics.areEqual((Object) this.f16873a, (Object) eVar.f16873a) && Intrinsics.areEqual((Object) this.f16874b, (Object) eVar.f16874b) && this.f16875c == eVar.f16875c && this.f16876d == eVar.f16876d && Intrinsics.areEqual((Object) this.f16877e, (Object) eVar.f16877e) && this.f16878f == eVar.f16878f && this.f16879g == eVar.f16879g;
        }

        public final boolean f() {
            return this.f16878f;
        }

        public final boolean g() {
            return this.f16876d;
        }

        public final int hashCode() {
            int a2 = a.a(this.f16874b, this.f16873a.hashCode() * 31, 31);
            boolean z = this.f16875c;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (a2 + (z ? 1 : 0)) * 31;
            boolean z3 = this.f16876d;
            if (z3) {
                z3 = true;
            }
            int a3 = a.a(this.f16877e, (i + (z3 ? 1 : 0)) * 31, 31);
            boolean z4 = this.f16878f;
            if (!z4) {
                z2 = z4;
            }
            return C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f16879g) + ((a3 + (z2 ? 1 : 0)) * 31);
        }

        public final String toString() {
            StringBuilder a2 = h0.a("SentryAnalyticConfig(sentryDsn=");
            a2.append(this.f16873a);
            a2.append(", sentryEnvironment=");
            a2.append(this.f16874b);
            a2.append(", sentryCollectThreads=");
            a2.append(this.f16875c);
            a2.append(", isSentryTrackingEnabled=");
            a2.append(this.f16876d);
            a2.append(", mdsReportUrl=");
            a2.append(this.f16877e);
            a2.append(", isMdsEventTrackingEnabled=");
            a2.append(this.f16878f);
            a2.append(", initTimeoutMs=");
            a2.append(this.f16879g);
            a2.append(')');
            return a2.toString();
        }
    }

    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final String f16880a;

        /* renamed from: b  reason: collision with root package name */
        public final long f16881b;

        /* renamed from: c  reason: collision with root package name */
        public final String f16882c;

        /* renamed from: d  reason: collision with root package name */
        public final String f16883d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f16884e;

        /* renamed from: f  reason: collision with root package name */
        public final long f16885f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f16886g;

        /* renamed from: h  reason: collision with root package name */
        public final long f16887h;

        public f(String str, long j, String str2, String str3, boolean z, long j2, boolean z2, long j3) {
            Intrinsics.checkNotNullParameter(str, "reportUrl");
            Intrinsics.checkNotNullParameter(str2, "crashLogLevel");
            Intrinsics.checkNotNullParameter(str3, "reportLogLevel");
            this.f16880a = str;
            this.f16881b = j;
            this.f16882c = str2;
            this.f16883d = str3;
            this.f16884e = z;
            this.f16885f = j2;
            this.f16886g = z2;
            this.f16887h = j3;
        }

        public final String a() {
            return this.f16882c;
        }

        public final long b() {
            return this.f16887h;
        }

        public final long c() {
            return this.f16885f;
        }

        public final String d() {
            return this.f16883d;
        }

        public final long e() {
            return this.f16881b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return Intrinsics.areEqual((Object) this.f16880a, (Object) fVar.f16880a) && this.f16881b == fVar.f16881b && Intrinsics.areEqual((Object) this.f16882c, (Object) fVar.f16882c) && Intrinsics.areEqual((Object) this.f16883d, (Object) fVar.f16883d) && this.f16884e == fVar.f16884e && this.f16885f == fVar.f16885f && this.f16886g == fVar.f16886g && this.f16887h == fVar.f16887h;
        }

        public final String f() {
            return this.f16880a;
        }

        public final boolean g() {
            return this.f16884e;
        }

        public final boolean h() {
            return this.f16886g;
        }

        public final int hashCode() {
            int hashCode = C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f16881b);
            int a2 = a.a(this.f16883d, a.a(this.f16882c, (hashCode + (this.f16880a.hashCode() * 31)) * 31, 31), 31);
            boolean z = this.f16884e;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int hashCode2 = (C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f16885f) + ((a2 + (z ? 1 : 0)) * 31)) * 31;
            boolean z3 = this.f16886g;
            if (!z3) {
                z2 = z3;
            }
            return C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f16887h) + ((hashCode2 + (z2 ? 1 : 0)) * 31);
        }

        public final String toString() {
            StringBuilder a2 = h0.a("StackAnalyticConfig(reportUrl=");
            a2.append(this.f16880a);
            a2.append(", reportSize=");
            a2.append(this.f16881b);
            a2.append(", crashLogLevel=");
            a2.append(this.f16882c);
            a2.append(", reportLogLevel=");
            a2.append(this.f16883d);
            a2.append(", isEventTrackingEnabled=");
            a2.append(this.f16884e);
            a2.append(", reportIntervalMsec=");
            a2.append(this.f16885f);
            a2.append(", isNativeTrackingEnabled=");
            a2.append(this.f16886g);
            a2.append(", initTimeoutMs=");
            a2.append(this.f16887h);
            a2.append(')');
            return a2.toString();
        }
    }

    public b(C0188b bVar, a aVar, c cVar, d dVar, f fVar, e eVar) {
        this.f16842a = bVar;
        this.f16843b = aVar;
        this.f16844c = cVar;
        this.f16845d = dVar;
        this.f16846e = fVar;
        this.f16847f = eVar;
    }

    public final a a() {
        return this.f16843b;
    }

    public final C0188b b() {
        return this.f16842a;
    }

    public final c c() {
        return this.f16844c;
    }

    public final d d() {
        return this.f16845d;
    }

    public final e e() {
        return this.f16847f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual((Object) this.f16842a, (Object) bVar.f16842a) && Intrinsics.areEqual((Object) this.f16843b, (Object) bVar.f16843b) && Intrinsics.areEqual((Object) this.f16844c, (Object) bVar.f16844c) && Intrinsics.areEqual((Object) this.f16845d, (Object) bVar.f16845d) && Intrinsics.areEqual((Object) this.f16846e, (Object) bVar.f16846e) && Intrinsics.areEqual((Object) this.f16847f, (Object) bVar.f16847f);
    }

    public final f f() {
        return this.f16846e;
    }

    public final int hashCode() {
        C0188b bVar = this.f16842a;
        int i = 0;
        int hashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        a aVar = this.f16843b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        c cVar = this.f16844c;
        int hashCode3 = (hashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        d dVar = this.f16845d;
        int hashCode4 = (hashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        f fVar = this.f16846e;
        int hashCode5 = (hashCode4 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        e eVar = this.f16847f;
        if (eVar != null) {
            i = eVar.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        StringBuilder a2 = h0.a("Config(appsflyerConfig=");
        a2.append(this.f16842a);
        a2.append(", adjustConfig=");
        a2.append(this.f16843b);
        a2.append(", facebookConfig=");
        a2.append(this.f16844c);
        a2.append(", firebaseConfig=");
        a2.append(this.f16845d);
        a2.append(", stackAnalyticConfig=");
        a2.append(this.f16846e);
        a2.append(", sentryAnalyticConfig=");
        a2.append(this.f16847f);
        a2.append(')');
        return a2.toString();
    }
}
