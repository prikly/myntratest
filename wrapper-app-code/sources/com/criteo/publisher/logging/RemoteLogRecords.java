package com.criteo.publisher.logging;

import com.applovin.sdk.AppLovinEventTypes;
import com.google.gson.annotations.SerializedName;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\b\u0018\u0000:\u0003\u001d\u001e\u001fB\u001d\u0012\u0006\u0010\b\u001a\u00020\u0001\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0002\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\b\u001a\u00020\u00018\u0016@\u0017X\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0003R\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016@\u0017X\u0004¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u0007¨\u0006 "}, d2 = {"Lcom/criteo/publisher/logging/RemoteLogRecords;", "Lcom/criteo/publisher/logging/RemoteLogRecords$RemoteLogContext;", "component1", "()Lcom/criteo/publisher/logging/RemoteLogRecords$RemoteLogContext;", "", "Lcom/criteo/publisher/logging/RemoteLogRecords$RemoteLogRecord;", "component2", "()Ljava/util/List;", "context", "logRecords", "copy", "(Lcom/criteo/publisher/logging/RemoteLogRecords$RemoteLogContext;Ljava/util/List;)Lcom/criteo/publisher/logging/RemoteLogRecords;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/criteo/publisher/logging/RemoteLogRecords$RemoteLogContext;", "getContext", "Ljava/util/List;", "getLogRecords", "<init>", "(Lcom/criteo/publisher/logging/RemoteLogRecords$RemoteLogContext;Ljava/util/List;)V", "RemoteLogContext", "RemoteLogLevel", "RemoteLogRecord", "publisher-sdk_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: RemoteLogRecords.kt */
public class RemoteLogRecords {
    @SerializedName("context")

    /* renamed from: a  reason: collision with root package name */
    private final a f2617a;
    @SerializedName("errors")

    /* renamed from: b  reason: collision with root package name */
    private final List<b> f2618b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemoteLogRecords)) {
            return false;
        }
        RemoteLogRecords remoteLogRecords = (RemoteLogRecords) obj;
        return Intrinsics.areEqual((Object) a(), (Object) remoteLogRecords.a()) && Intrinsics.areEqual((Object) b(), (Object) remoteLogRecords.b());
    }

    public int hashCode() {
        a a2 = a();
        int i = 0;
        int hashCode = (a2 != null ? a2.hashCode() : 0) * 31;
        List<b> b2 = b();
        if (b2 != null) {
            i = b2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "RemoteLogRecords(context=" + a() + ", logRecords=" + b() + ")";
    }

    public RemoteLogRecords(a aVar, List<b> list) {
        Intrinsics.checkParameterIsNotNull(aVar, "context");
        Intrinsics.checkParameterIsNotNull(list, "logRecords");
        this.f2617a = aVar;
        this.f2618b = list;
    }

    public a a() {
        return this.f2617a;
    }

    public List<b> b() {
        return this.f2618b;
    }

    /* compiled from: RemoteLogRecords.kt */
    public static final class b {
        @SerializedName("errorType")

        /* renamed from: a  reason: collision with root package name */
        private final RemoteLogLevel f2627a;
        @SerializedName("messages")

        /* renamed from: b  reason: collision with root package name */
        private final List<String> f2628b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual((Object) this.f2627a, (Object) bVar.f2627a) && Intrinsics.areEqual((Object) this.f2628b, (Object) bVar.f2628b);
        }

        public int hashCode() {
            RemoteLogLevel remoteLogLevel = this.f2627a;
            int i = 0;
            int hashCode = (remoteLogLevel != null ? remoteLogLevel.hashCode() : 0) * 31;
            List<String> list = this.f2628b;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return "RemoteLogRecord(level=" + this.f2627a + ", messages=" + this.f2628b + ")";
        }

        public b(RemoteLogLevel remoteLogLevel, List<String> list) {
            Intrinsics.checkParameterIsNotNull(remoteLogLevel, AppLovinEventTypes.USER_COMPLETED_LEVEL);
            Intrinsics.checkParameterIsNotNull(list, "messages");
            this.f2627a = remoteLogLevel;
            this.f2628b = list;
        }
    }

    /* compiled from: RemoteLogRecords.kt */
    public static class a {
        @SerializedName("version")

        /* renamed from: a  reason: collision with root package name */
        private final String f2619a;
        @SerializedName("bundleId")

        /* renamed from: b  reason: collision with root package name */
        private final String f2620b;
        @SerializedName("deviceId")

        /* renamed from: c  reason: collision with root package name */
        private String f2621c;
        @SerializedName("sessionId")

        /* renamed from: d  reason: collision with root package name */
        private final String f2622d;
        @SerializedName("profileId")

        /* renamed from: e  reason: collision with root package name */
        private final int f2623e;
        @SerializedName("exception")

        /* renamed from: f  reason: collision with root package name */
        private final String f2624f;
        @SerializedName("logId")

        /* renamed from: g  reason: collision with root package name */
        private final String f2625g;
        @SerializedName("deviceOs")

        /* renamed from: h  reason: collision with root package name */
        private final String f2626h;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual((Object) h(), (Object) aVar.h()) && Intrinsics.areEqual((Object) a(), (Object) aVar.a()) && Intrinsics.areEqual((Object) b(), (Object) aVar.b()) && Intrinsics.areEqual((Object) g(), (Object) aVar.g()) && f() == aVar.f() && Intrinsics.areEqual((Object) d(), (Object) aVar.d()) && Intrinsics.areEqual((Object) e(), (Object) aVar.e()) && Intrinsics.areEqual((Object) c(), (Object) aVar.c());
        }

        public int hashCode() {
            String h2 = h();
            int i = 0;
            int hashCode = (h2 != null ? h2.hashCode() : 0) * 31;
            String a2 = a();
            int hashCode2 = (hashCode + (a2 != null ? a2.hashCode() : 0)) * 31;
            String b2 = b();
            int hashCode3 = (hashCode2 + (b2 != null ? b2.hashCode() : 0)) * 31;
            String g2 = g();
            int hashCode4 = (((hashCode3 + (g2 != null ? g2.hashCode() : 0)) * 31) + f()) * 31;
            String d2 = d();
            int hashCode5 = (hashCode4 + (d2 != null ? d2.hashCode() : 0)) * 31;
            String e2 = e();
            int hashCode6 = (hashCode5 + (e2 != null ? e2.hashCode() : 0)) * 31;
            String c2 = c();
            if (c2 != null) {
                i = c2.hashCode();
            }
            return hashCode6 + i;
        }

        public String toString() {
            return "RemoteLogContext(version=" + h() + ", bundleId=" + a() + ", deviceId=" + b() + ", sessionId=" + g() + ", profileId=" + f() + ", exceptionType=" + d() + ", logId=" + e() + ", deviceOs=" + c() + ")";
        }

        public a(String str, String str2, String str3, String str4, int i, String str5, String str6, String str7) {
            Intrinsics.checkParameterIsNotNull(str, MediationMetaData.KEY_VERSION);
            Intrinsics.checkParameterIsNotNull(str2, "bundleId");
            Intrinsics.checkParameterIsNotNull(str4, "sessionId");
            this.f2619a = str;
            this.f2620b = str2;
            this.f2621c = str3;
            this.f2622d = str4;
            this.f2623e = i;
            this.f2624f = str5;
            this.f2625g = str6;
            this.f2626h = str7;
        }

        public String h() {
            return this.f2619a;
        }

        public String a() {
            return this.f2620b;
        }

        public void a(String str) {
            this.f2621c = str;
        }

        public String b() {
            return this.f2621c;
        }

        public String g() {
            return this.f2622d;
        }

        public int f() {
            return this.f2623e;
        }

        public String d() {
            return this.f2624f;
        }

        public String e() {
            return this.f2625g;
        }

        public String c() {
            return this.f2626h;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/criteo/publisher/logging/RemoteLogRecords$RemoteLogLevel;", "Ljava/lang/Enum;", "<init>", "(Ljava/lang/String;I)V", "Companion", "DEBUG", "INFO", "WARNING", "ERROR", "NONE", "publisher-sdk_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
    /* compiled from: RemoteLogRecords.kt */
    public enum RemoteLogLevel {
        DEBUG,
        INFO,
        WARNING,
        ERROR,
        NONE;
        
        public static final a Companion = null;

        static {
            Companion = new a((DefaultConstructorMarker) null);
        }

        /* compiled from: RemoteLogRecords.kt */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final RemoteLogLevel a(int i) {
                if (i == 3) {
                    return RemoteLogLevel.DEBUG;
                }
                if (i == 4) {
                    return RemoteLogLevel.INFO;
                }
                if (i == 5) {
                    return RemoteLogLevel.WARNING;
                }
                if (i != 6) {
                    return null;
                }
                return RemoteLogLevel.ERROR;
            }
        }
    }
}
