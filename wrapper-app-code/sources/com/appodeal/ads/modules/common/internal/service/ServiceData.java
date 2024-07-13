package com.appodeal.ads.modules.common.internal.service;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/ServiceData;", "", "Adjust", "AppsFlyer", "FacebookAnalytics", "Firebase", "Lcom/appodeal/ads/modules/common/internal/service/ServiceData$AppsFlyer;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceData$Adjust;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceData$FacebookAnalytics;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceData$Firebase;", "apd_internal"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface ServiceData {

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/ServiceData$Adjust;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceData;", "", "a", "Ljava/lang/String;", "getAttributionId", "()Ljava/lang/String;", "attributionId", "", "", "b", "Ljava/util/Map;", "getConversionData", "()Ljava/util/Map;", "conversionData", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "apd_internal"}, k = 1, mv = {1, 6, 0})
    public static final class Adjust implements ServiceData {

        /* renamed from: a  reason: collision with root package name */
        public final String f16640a;

        /* renamed from: b  reason: collision with root package name */
        public final Map<String, Object> f16641b;

        public Adjust(String str, Map<String, ? extends Object> map) {
            Intrinsics.checkNotNullParameter(str, "attributionId");
            Intrinsics.checkNotNullParameter(map, "conversionData");
            this.f16640a = str;
            this.f16641b = map;
        }

        public final String getAttributionId() {
            return this.f16640a;
        }

        public final Map<String, Object> getConversionData() {
            return this.f16641b;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/ServiceData$AppsFlyer;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceData;", "", "a", "Ljava/lang/String;", "getAttributionId", "()Ljava/lang/String;", "attributionId", "", "", "b", "Ljava/util/Map;", "getConversionData", "()Ljava/util/Map;", "conversionData", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "apd_internal"}, k = 1, mv = {1, 6, 0})
    public static final class AppsFlyer implements ServiceData {

        /* renamed from: a  reason: collision with root package name */
        public final String f16642a;

        /* renamed from: b  reason: collision with root package name */
        public final Map<String, Object> f16643b;

        public AppsFlyer(String str, Map<String, ? extends Object> map) {
            Intrinsics.checkNotNullParameter(str, "attributionId");
            Intrinsics.checkNotNullParameter(map, "conversionData");
            this.f16642a = str;
            this.f16643b = map;
        }

        public final String getAttributionId() {
            return this.f16642a;
        }

        public final Map<String, Object> getConversionData() {
            return this.f16643b;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001f\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/ServiceData$FacebookAnalytics;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceData;", "", "component1", "component2", "userId", "appId", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "b", "getAppId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "apd_internal"}, k = 1, mv = {1, 6, 0})
    public static final class FacebookAnalytics implements ServiceData {

        /* renamed from: a  reason: collision with root package name */
        public final String f16644a;

        /* renamed from: b  reason: collision with root package name */
        public final String f16645b;

        public FacebookAnalytics(String str, String str2) {
            Intrinsics.checkNotNullParameter(str2, "appId");
            this.f16644a = str;
            this.f16645b = str2;
        }

        public static /* synthetic */ FacebookAnalytics copy$default(FacebookAnalytics facebookAnalytics, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = facebookAnalytics.f16644a;
            }
            if ((i & 2) != 0) {
                str2 = facebookAnalytics.f16645b;
            }
            return facebookAnalytics.copy(str, str2);
        }

        public final String component1() {
            return this.f16644a;
        }

        public final String component2() {
            return this.f16645b;
        }

        public final FacebookAnalytics copy(String str, String str2) {
            Intrinsics.checkNotNullParameter(str2, "appId");
            return new FacebookAnalytics(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FacebookAnalytics)) {
                return false;
            }
            FacebookAnalytics facebookAnalytics = (FacebookAnalytics) obj;
            return Intrinsics.areEqual((Object) this.f16644a, (Object) facebookAnalytics.f16644a) && Intrinsics.areEqual((Object) this.f16645b, (Object) facebookAnalytics.f16645b);
        }

        public final String getAppId() {
            return this.f16645b;
        }

        public final String getUserId() {
            return this.f16644a;
        }

        public int hashCode() {
            String str = this.f16644a;
            return this.f16645b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public String toString() {
            return "FacebookAnalytics(userId=" + this.f16644a + ", appId=" + this.f16645b + ')';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003J#\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0013¨\u0006\u001c"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/ServiceData$Firebase;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceData;", "", "component1", "", "component2", "appInstanceId", "keywords", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getAppInstanceId", "()Ljava/lang/String;", "b", "Ljava/util/List;", "getKeywords", "()Ljava/util/List;", "getKeywordsAsString", "keywordsAsString", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "apd_internal"}, k = 1, mv = {1, 6, 0})
    public static final class Firebase implements ServiceData {

        /* renamed from: a  reason: collision with root package name */
        public final String f16646a;

        /* renamed from: b  reason: collision with root package name */
        public final List<String> f16647b;

        public Firebase(String str, List<String> list) {
            Intrinsics.checkNotNullParameter(str, "appInstanceId");
            Intrinsics.checkNotNullParameter(list, "keywords");
            this.f16646a = str;
            this.f16647b = list;
        }

        public static /* synthetic */ Firebase copy$default(Firebase firebase, String str, List<String> list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = firebase.f16646a;
            }
            if ((i & 2) != 0) {
                list = firebase.f16647b;
            }
            return firebase.copy(str, list);
        }

        public final String component1() {
            return this.f16646a;
        }

        public final List<String> component2() {
            return this.f16647b;
        }

        public final Firebase copy(String str, List<String> list) {
            Intrinsics.checkNotNullParameter(str, "appInstanceId");
            Intrinsics.checkNotNullParameter(list, "keywords");
            return new Firebase(str, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Firebase)) {
                return false;
            }
            Firebase firebase = (Firebase) obj;
            return Intrinsics.areEqual((Object) this.f16646a, (Object) firebase.f16646a) && Intrinsics.areEqual((Object) this.f16647b, (Object) firebase.f16647b);
        }

        public final String getAppInstanceId() {
            return this.f16646a;
        }

        public final List<String> getKeywords() {
            return this.f16647b;
        }

        public final String getKeywordsAsString() {
            String joinToString$default = CollectionsKt.joinToString$default(this.f16647b, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
            if (!StringsKt.isBlank(joinToString$default)) {
                return joinToString$default;
            }
            return null;
        }

        public int hashCode() {
            return this.f16647b.hashCode() + (this.f16646a.hashCode() * 31);
        }

        public String toString() {
            return "Firebase(appInstanceId=" + this.f16646a + ", keywords=" + this.f16647b + ')';
        }
    }
}
