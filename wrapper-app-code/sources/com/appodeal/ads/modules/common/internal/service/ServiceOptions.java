package com.appodeal.ads.modules.common.internal.service;

import android.content.Context;
import com.appodeal.ads.modules.common.internal.data.ApplicationData;
import com.appodeal.ads.modules.common.internal.data.DeviceData;
import com.appodeal.ads.modules.common.internal.data.UserPersonalData;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u000b\f\r\u000e\u000f\u0010R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u0012\u0010\t\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\bR\u0012\u0010\n\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\b\u0001\u0006\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/ServiceOptions;", "", "connectorCallback", "Lcom/appodeal/ads/modules/common/internal/service/ConnectorCallback;", "getConnectorCallback", "()Lcom/appodeal/ads/modules/common/internal/service/ConnectorCallback;", "isEventTrackingEnabled", "", "()Z", "isLoggingEnabled", "isRevenueTrackingEnabled", "Adjust", "Appsflyer", "FacebookAnalytics", "Firebase", "SentryAnalytics", "StackAnalytics", "Lcom/appodeal/ads/modules/common/internal/service/ServiceOptions$Appsflyer;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceOptions$Adjust;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceOptions$FacebookAnalytics;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceOptions$Firebase;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceOptions$StackAnalytics;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceOptions$SentryAnalytics;", "apd_internal"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface ServiceOptions {

    @Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0011\u0012\u0006\u0010\u0019\u001a\u00020\b\u0012\u0006\u0010\u001f\u001a\u00020\u001a\u0012\u0006\u0010%\u001a\u00020 \u0012\u0006\u0010)\u001a\u00020&\u0012\u0006\u0010,\u001a\u00020&\u0012\u0006\u0010.\u001a\u00020&\u0012\u0006\u00104\u001a\u00020/¢\u0006\u0004\b5\u00106R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0019\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\fR\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010%\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010)\u001a\u00020&8\u0016X\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010,\u001a\u00020&8\u0016X\u0004¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u001a\u0010.\u001a\u00020&8\u0016X\u0004¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*R\u001a\u00104\u001a\u00020/8\u0016X\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00067"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/ServiceOptions$Adjust;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceOptions;", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "", "b", "Ljava/lang/String;", "getAppToken", "()Ljava/lang/String;", "appToken", "c", "getAdId", "adId", "", "d", "Ljava/util/Map;", "getEventTokens", "()Ljava/util/Map;", "eventTokens", "e", "getEnvironment", "environment", "Lcom/appodeal/ads/modules/common/internal/service/InitializationMode;", "f", "Lcom/appodeal/ads/modules/common/internal/service/InitializationMode;", "getMode", "()Lcom/appodeal/ads/modules/common/internal/service/InitializationMode;", "mode", "", "g", "J", "getInitializationTimeout", "()J", "initializationTimeout", "", "h", "Z", "isEventTrackingEnabled", "()Z", "i", "isRevenueTrackingEnabled", "j", "isLoggingEnabled", "Lcom/appodeal/ads/modules/common/internal/service/ConnectorCallback;", "k", "Lcom/appodeal/ads/modules/common/internal/service/ConnectorCallback;", "getConnectorCallback", "()Lcom/appodeal/ads/modules/common/internal/service/ConnectorCallback;", "connectorCallback", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/appodeal/ads/modules/common/internal/service/InitializationMode;JZZZLcom/appodeal/ads/modules/common/internal/service/ConnectorCallback;)V", "apd_internal"}, k = 1, mv = {1, 6, 0})
    public static final class Adjust implements ServiceOptions {

        /* renamed from: a  reason: collision with root package name */
        public final Context f16651a;

        /* renamed from: b  reason: collision with root package name */
        public final String f16652b;

        /* renamed from: c  reason: collision with root package name */
        public final String f16653c;

        /* renamed from: d  reason: collision with root package name */
        public final Map<String, String> f16654d;

        /* renamed from: e  reason: collision with root package name */
        public final String f16655e;

        /* renamed from: f  reason: collision with root package name */
        public final InitializationMode f16656f;

        /* renamed from: g  reason: collision with root package name */
        public final long f16657g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f16658h;
        public final boolean i;
        public final boolean j;
        public final ConnectorCallback k;

        public Adjust(Context context, String str, String str2, Map<String, String> map, String str3, InitializationMode initializationMode, long j2, boolean z, boolean z2, boolean z3, ConnectorCallback connectorCallback) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(str, "appToken");
            Intrinsics.checkNotNullParameter(str2, "adId");
            Intrinsics.checkNotNullParameter(map, "eventTokens");
            Intrinsics.checkNotNullParameter(str3, "environment");
            Intrinsics.checkNotNullParameter(initializationMode, "mode");
            Intrinsics.checkNotNullParameter(connectorCallback, "connectorCallback");
            this.f16651a = context;
            this.f16652b = str;
            this.f16653c = str2;
            this.f16654d = map;
            this.f16655e = str3;
            this.f16656f = initializationMode;
            this.f16657g = j2;
            this.f16658h = z;
            this.i = z2;
            this.j = z3;
            this.k = connectorCallback;
        }

        public final String getAdId() {
            return this.f16653c;
        }

        public final String getAppToken() {
            return this.f16652b;
        }

        public ConnectorCallback getConnectorCallback() {
            return this.k;
        }

        public final Context getContext() {
            return this.f16651a;
        }

        public final String getEnvironment() {
            return this.f16655e;
        }

        public final Map<String, String> getEventTokens() {
            return this.f16654d;
        }

        public final long getInitializationTimeout() {
            return this.f16657g;
        }

        public final InitializationMode getMode() {
            return this.f16656f;
        }

        public boolean isEventTrackingEnabled() {
            return this.f16658h;
        }

        public boolean isLoggingEnabled() {
            return this.j;
        }

        public boolean isRevenueTrackingEnabled() {
            return this.i;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u0017\u0012\u0006\u0010\"\u001a\u00020\u001d\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010)\u001a\u00020#\u0012\u0006\u0010+\u001a\u00020#\u0012\u0006\u00101\u001a\u00020,¢\u0006\u0004\b2\u00103R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\"\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010&\u001a\u00020#8\u0016X\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010)\u001a\u00020#8\u0016X\u0004¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u001a\u0010+\u001a\u00020#8\u0016X\u0004¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'R\u001a\u00101\u001a\u00020,8\u0016X\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00064"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/ServiceOptions$Appsflyer;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceOptions;", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "", "b", "Ljava/lang/String;", "getAppId", "()Ljava/lang/String;", "appId", "c", "getDevKey", "devKey", "Lcom/appodeal/ads/modules/common/internal/service/InitializationMode;", "d", "Lcom/appodeal/ads/modules/common/internal/service/InitializationMode;", "getMode", "()Lcom/appodeal/ads/modules/common/internal/service/InitializationMode;", "mode", "", "e", "Ljava/util/List;", "getConversionKeys", "()Ljava/util/List;", "conversionKeys", "", "f", "J", "getInitializationTimeout", "()J", "initializationTimeout", "", "g", "Z", "isEventTrackingEnabled", "()Z", "h", "isRevenueTrackingEnabled", "i", "isLoggingEnabled", "Lcom/appodeal/ads/modules/common/internal/service/ConnectorCallback;", "j", "Lcom/appodeal/ads/modules/common/internal/service/ConnectorCallback;", "getConnectorCallback", "()Lcom/appodeal/ads/modules/common/internal/service/ConnectorCallback;", "connectorCallback", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/appodeal/ads/modules/common/internal/service/InitializationMode;Ljava/util/List;JZZZLcom/appodeal/ads/modules/common/internal/service/ConnectorCallback;)V", "apd_internal"}, k = 1, mv = {1, 6, 0})
    public static final class Appsflyer implements ServiceOptions {

        /* renamed from: a  reason: collision with root package name */
        public final Context f16659a;

        /* renamed from: b  reason: collision with root package name */
        public final String f16660b;

        /* renamed from: c  reason: collision with root package name */
        public final String f16661c;

        /* renamed from: d  reason: collision with root package name */
        public final InitializationMode f16662d;

        /* renamed from: e  reason: collision with root package name */
        public final List<String> f16663e;

        /* renamed from: f  reason: collision with root package name */
        public final long f16664f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f16665g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f16666h;
        public final boolean i;
        public final ConnectorCallback j;

        public Appsflyer(Context context, String str, String str2, InitializationMode initializationMode, List<String> list, long j2, boolean z, boolean z2, boolean z3, ConnectorCallback connectorCallback) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(str, "appId");
            Intrinsics.checkNotNullParameter(str2, "devKey");
            Intrinsics.checkNotNullParameter(initializationMode, "mode");
            Intrinsics.checkNotNullParameter(list, "conversionKeys");
            Intrinsics.checkNotNullParameter(connectorCallback, "connectorCallback");
            this.f16659a = context;
            this.f16660b = str;
            this.f16661c = str2;
            this.f16662d = initializationMode;
            this.f16663e = list;
            this.f16664f = j2;
            this.f16665g = z;
            this.f16666h = z2;
            this.i = z3;
            this.j = connectorCallback;
        }

        public final String getAppId() {
            return this.f16660b;
        }

        public ConnectorCallback getConnectorCallback() {
            return this.j;
        }

        public final Context getContext() {
            return this.f16659a;
        }

        public final List<String> getConversionKeys() {
            return this.f16663e;
        }

        public final String getDevKey() {
            return this.f16661c;
        }

        public final long getInitializationTimeout() {
            return this.f16664f;
        }

        public final InitializationMode getMode() {
            return this.f16662d;
        }

        public boolean isEventTrackingEnabled() {
            return this.f16665g;
        }

        public boolean isLoggingEnabled() {
            return this.i;
        }

        public boolean isRevenueTrackingEnabled() {
            return this.f16666h;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\u0006\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\b8\u0016X\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\u00020\b8\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\u00020\b8\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/ServiceOptions$FacebookAnalytics;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceOptions;", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "", "b", "Z", "isDebugEnabled", "()Z", "c", "isEventTrackingEnabled", "d", "isRevenueTrackingEnabled", "e", "isLoggingEnabled", "Lcom/appodeal/ads/modules/common/internal/service/ConnectorCallback;", "f", "Lcom/appodeal/ads/modules/common/internal/service/ConnectorCallback;", "getConnectorCallback", "()Lcom/appodeal/ads/modules/common/internal/service/ConnectorCallback;", "connectorCallback", "<init>", "(Landroid/content/Context;ZZZZLcom/appodeal/ads/modules/common/internal/service/ConnectorCallback;)V", "apd_internal"}, k = 1, mv = {1, 6, 0})
    public static final class FacebookAnalytics implements ServiceOptions {

        /* renamed from: a  reason: collision with root package name */
        public final Context f16667a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f16668b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f16669c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f16670d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f16671e;

        /* renamed from: f  reason: collision with root package name */
        public final ConnectorCallback f16672f;

        public FacebookAnalytics(Context context, boolean z, boolean z2, boolean z3, boolean z4, ConnectorCallback connectorCallback) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(connectorCallback, "connectorCallback");
            this.f16667a = context;
            this.f16668b = z;
            this.f16669c = z2;
            this.f16670d = z3;
            this.f16671e = z4;
            this.f16672f = connectorCallback;
        }

        public ConnectorCallback getConnectorCallback() {
            return this.f16672f;
        }

        public final Context getContext() {
            return this.f16667a;
        }

        public final boolean isDebugEnabled() {
            return this.f16668b;
        }

        public boolean isEventTrackingEnabled() {
            return this.f16669c;
        }

        public boolean isLoggingEnabled() {
            return this.f16671e;
        }

        public boolean isRevenueTrackingEnabled() {
            return this.f16670d;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 62\u00020\u0001:\u00016B_\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0019\u001a\u00020\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001a\u0012\u0006\u0010$\u001a\u00020\b\u0012\u0006\u0010(\u001a\u00020%\u0012\u0006\u0010+\u001a\u00020%\u0012\u0006\u0010-\u001a\u00020%\u0012\u0006\u00103\u001a\u00020.¢\u0006\u0004\b4\u00105R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0019\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010$\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010(\u001a\u00020%8\u0016X\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010+\u001a\u00020%8\u0016X\u0004¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u001a\u0010-\u001a\u00020%8\u0016X\u0004¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)R\u001a\u00103\u001a\u00020.8\u0016X\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00067"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/ServiceOptions$Firebase;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceOptions;", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "", "b", "Ljava/lang/Long;", "getExpirationDuration", "()Ljava/lang/Long;", "expirationDuration", "", "", "c", "Ljava/util/List;", "getConfigKeys", "()Ljava/util/List;", "configKeys", "d", "Ljava/lang/String;", "getAdRevenueKey", "()Ljava/lang/String;", "adRevenueKey", "Lcom/appodeal/ads/modules/common/internal/service/InitializationMode;", "e", "Lcom/appodeal/ads/modules/common/internal/service/InitializationMode;", "getMode", "()Lcom/appodeal/ads/modules/common/internal/service/InitializationMode;", "mode", "f", "J", "getInitializationTimeout", "()J", "initializationTimeout", "", "g", "Z", "isEventTrackingEnabled", "()Z", "h", "isRevenueTrackingEnabled", "i", "isLoggingEnabled", "Lcom/appodeal/ads/modules/common/internal/service/ConnectorCallback;", "j", "Lcom/appodeal/ads/modules/common/internal/service/ConnectorCallback;", "getConnectorCallback", "()Lcom/appodeal/ads/modules/common/internal/service/ConnectorCallback;", "connectorCallback", "<init>", "(Landroid/content/Context;Ljava/lang/Long;Ljava/util/List;Ljava/lang/String;Lcom/appodeal/ads/modules/common/internal/service/InitializationMode;JZZZLcom/appodeal/ads/modules/common/internal/service/ConnectorCallback;)V", "Companion", "apd_internal"}, k = 1, mv = {1, 6, 0})
    public static final class Firebase implements ServiceOptions {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        public static final String DefaultAdRevenueKey = "custom_ad_impression";

        /* renamed from: a  reason: collision with root package name */
        public final Context f16673a;

        /* renamed from: b  reason: collision with root package name */
        public final Long f16674b;

        /* renamed from: c  reason: collision with root package name */
        public final List<String> f16675c;

        /* renamed from: d  reason: collision with root package name */
        public final String f16676d;

        /* renamed from: e  reason: collision with root package name */
        public final InitializationMode f16677e;

        /* renamed from: f  reason: collision with root package name */
        public final long f16678f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f16679g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f16680h;
        public final boolean i;
        public final ConnectorCallback j;

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/ServiceOptions$Firebase$Companion;", "", "", "DefaultAdRevenueKey", "Ljava/lang/String;", "apd_internal"}, k = 1, mv = {1, 6, 0})
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public Firebase(Context context, Long l, List<String> list, String str, InitializationMode initializationMode, long j2, boolean z, boolean z2, boolean z3, ConnectorCallback connectorCallback) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(list, "configKeys");
            Intrinsics.checkNotNullParameter(str, "adRevenueKey");
            Intrinsics.checkNotNullParameter(initializationMode, "mode");
            Intrinsics.checkNotNullParameter(connectorCallback, "connectorCallback");
            this.f16673a = context;
            this.f16674b = l;
            this.f16675c = list;
            this.f16676d = str;
            this.f16677e = initializationMode;
            this.f16678f = j2;
            this.f16679g = z;
            this.f16680h = z2;
            this.i = z3;
            this.j = connectorCallback;
        }

        public final String getAdRevenueKey() {
            return this.f16676d;
        }

        public final List<String> getConfigKeys() {
            return this.f16675c;
        }

        public ConnectorCallback getConnectorCallback() {
            return this.j;
        }

        public final Context getContext() {
            return this.f16673a;
        }

        public final Long getExpirationDuration() {
            return this.f16674b;
        }

        public final long getInitializationTimeout() {
            return this.f16678f;
        }

        public final InitializationMode getMode() {
            return this.f16677e;
        }

        public boolean isEventTrackingEnabled() {
            return this.f16679g;
        }

        public boolean isLoggingEnabled() {
            return this.i;
        }

        public boolean isRevenueTrackingEnabled() {
            return this.f16680h;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0011\u0012\u0006\u0010\u001b\u001a\u00020\b\u0012\u0006\u0010\u001d\u001a\u00020\u0011\u0012\u0006\u0010#\u001a\u00020\u001e\u0012\u0006\u0010)\u001a\u00020$\u0012\u0006\u0010/\u001a\u00020*\u0012\b\b\u0002\u00101\u001a\u00020\u0011\u0012\b\b\u0002\u00103\u001a\u00020\u0011\u0012\b\b\u0002\u00105\u001a\u00020\u0011\u0012\u0006\u0010;\u001a\u000206¢\u0006\u0004\b<\u0010=R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0018\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u0017\u0010\u001b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u001a\u0010\fR\u0017\u0010\u001d\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010#\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010)\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010/\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u00101\u001a\u00020\u00118\u0016X\u0004¢\u0006\f\n\u0004\b0\u0010\u0013\u001a\u0004\b1\u0010\u0015R\u001a\u00103\u001a\u00020\u00118\u0016X\u0004¢\u0006\f\n\u0004\b2\u0010\u0013\u001a\u0004\b3\u0010\u0015R\u001a\u00105\u001a\u00020\u00118\u0016X\u0004¢\u0006\f\n\u0004\b4\u0010\u0013\u001a\u0004\b5\u0010\u0015R\u001a\u0010;\u001a\u0002068\u0016X\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:¨\u0006>"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/ServiceOptions$SentryAnalytics;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceOptions;", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "", "b", "Ljava/lang/String;", "getSentryDsn", "()Ljava/lang/String;", "sentryDsn", "c", "getSentryEnvironment", "sentryEnvironment", "", "d", "Z", "getSentryCollectThreads", "()Z", "sentryCollectThreads", "e", "isSentryTrackingEnabled", "f", "getMdsReportUrl", "mdsReportUrl", "g", "isMdsEventTrackingEnabled", "Lcom/appodeal/ads/modules/common/internal/data/DeviceData;", "h", "Lcom/appodeal/ads/modules/common/internal/data/DeviceData;", "getDeviceData", "()Lcom/appodeal/ads/modules/common/internal/data/DeviceData;", "deviceData", "Lcom/appodeal/ads/modules/common/internal/data/ApplicationData;", "i", "Lcom/appodeal/ads/modules/common/internal/data/ApplicationData;", "getApplicationData", "()Lcom/appodeal/ads/modules/common/internal/data/ApplicationData;", "applicationData", "Lcom/appodeal/ads/modules/common/internal/data/UserPersonalData;", "j", "Lcom/appodeal/ads/modules/common/internal/data/UserPersonalData;", "getUserPersonalData", "()Lcom/appodeal/ads/modules/common/internal/data/UserPersonalData;", "userPersonalData", "k", "isLoggingEnabled", "l", "isEventTrackingEnabled", "m", "isRevenueTrackingEnabled", "Lcom/appodeal/ads/modules/common/internal/service/ConnectorCallback;", "n", "Lcom/appodeal/ads/modules/common/internal/service/ConnectorCallback;", "getConnectorCallback", "()Lcom/appodeal/ads/modules/common/internal/service/ConnectorCallback;", "connectorCallback", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZLcom/appodeal/ads/modules/common/internal/data/DeviceData;Lcom/appodeal/ads/modules/common/internal/data/ApplicationData;Lcom/appodeal/ads/modules/common/internal/data/UserPersonalData;ZZZLcom/appodeal/ads/modules/common/internal/service/ConnectorCallback;)V", "apd_internal"}, k = 1, mv = {1, 6, 0})
    public static final class SentryAnalytics implements ServiceOptions {

        /* renamed from: a  reason: collision with root package name */
        public final Context f16681a;

        /* renamed from: b  reason: collision with root package name */
        public final String f16682b;

        /* renamed from: c  reason: collision with root package name */
        public final String f16683c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f16684d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f16685e;

        /* renamed from: f  reason: collision with root package name */
        public final String f16686f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f16687g;

        /* renamed from: h  reason: collision with root package name */
        public final DeviceData f16688h;
        public final ApplicationData i;
        public final UserPersonalData j;
        public final boolean k;
        public final boolean l;
        public final boolean m;
        public final ConnectorCallback n;

        public SentryAnalytics(Context context, String str, String str2, boolean z, boolean z2, String str3, boolean z3, DeviceData deviceData, ApplicationData applicationData, UserPersonalData userPersonalData, boolean z4, boolean z5, boolean z6, ConnectorCallback connectorCallback) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(str, "sentryDsn");
            Intrinsics.checkNotNullParameter(str2, "sentryEnvironment");
            Intrinsics.checkNotNullParameter(str3, "mdsReportUrl");
            Intrinsics.checkNotNullParameter(deviceData, "deviceData");
            Intrinsics.checkNotNullParameter(applicationData, "applicationData");
            Intrinsics.checkNotNullParameter(userPersonalData, "userPersonalData");
            Intrinsics.checkNotNullParameter(connectorCallback, "connectorCallback");
            this.f16681a = context;
            this.f16682b = str;
            this.f16683c = str2;
            this.f16684d = z;
            this.f16685e = z2;
            this.f16686f = str3;
            this.f16687g = z3;
            this.f16688h = deviceData;
            this.i = applicationData;
            this.j = userPersonalData;
            this.k = z4;
            this.l = z5;
            this.m = z6;
            this.n = connectorCallback;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ SentryAnalytics(android.content.Context r19, java.lang.String r20, java.lang.String r21, boolean r22, boolean r23, java.lang.String r24, boolean r25, com.appodeal.ads.modules.common.internal.data.DeviceData r26, com.appodeal.ads.modules.common.internal.data.ApplicationData r27, com.appodeal.ads.modules.common.internal.data.UserPersonalData r28, boolean r29, boolean r30, boolean r31, com.appodeal.ads.modules.common.internal.service.ConnectorCallback r32, int r33, kotlin.jvm.internal.DefaultConstructorMarker r34) {
            /*
                r18 = this;
                r0 = r33
                r1 = r0 & 1024(0x400, float:1.435E-42)
                r2 = 0
                if (r1 == 0) goto L_0x0009
                r14 = 0
                goto L_0x000b
            L_0x0009:
                r14 = r29
            L_0x000b:
                r1 = r0 & 2048(0x800, float:2.87E-42)
                if (r1 == 0) goto L_0x0011
                r15 = 0
                goto L_0x0013
            L_0x0011:
                r15 = r30
            L_0x0013:
                r0 = r0 & 4096(0x1000, float:5.74E-42)
                if (r0 == 0) goto L_0x001a
                r16 = 0
                goto L_0x001c
            L_0x001a:
                r16 = r31
            L_0x001c:
                r3 = r18
                r4 = r19
                r5 = r20
                r6 = r21
                r7 = r22
                r8 = r23
                r9 = r24
                r10 = r25
                r11 = r26
                r12 = r27
                r13 = r28
                r17 = r32
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.modules.common.internal.service.ServiceOptions.SentryAnalytics.<init>(android.content.Context, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, boolean, com.appodeal.ads.modules.common.internal.data.DeviceData, com.appodeal.ads.modules.common.internal.data.ApplicationData, com.appodeal.ads.modules.common.internal.data.UserPersonalData, boolean, boolean, boolean, com.appodeal.ads.modules.common.internal.service.ConnectorCallback, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final ApplicationData getApplicationData() {
            return this.i;
        }

        public ConnectorCallback getConnectorCallback() {
            return this.n;
        }

        public final Context getContext() {
            return this.f16681a;
        }

        public final DeviceData getDeviceData() {
            return this.f16688h;
        }

        public final String getMdsReportUrl() {
            return this.f16686f;
        }

        public final boolean getSentryCollectThreads() {
            return this.f16684d;
        }

        public final String getSentryDsn() {
            return this.f16682b;
        }

        public final String getSentryEnvironment() {
            return this.f16683c;
        }

        public final UserPersonalData getUserPersonalData() {
            return this.j;
        }

        public boolean isEventTrackingEnabled() {
            return this.l;
        }

        public boolean isLoggingEnabled() {
            return this.k;
        }

        public final boolean isMdsEventTrackingEnabled() {
            return this.f16687g;
        }

        public boolean isRevenueTrackingEnabled() {
            return this.m;
        }

        public final boolean isSentryTrackingEnabled() {
            return this.f16685e;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010\u0019\u001a\u00020\u000e\u0012\u0006\u0010\u001c\u001a\u00020\b\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010'\u001a\u00020\"\u0012\u0006\u0010-\u001a\u00020(\u0012\u0006\u00103\u001a\u00020.\u0012\b\b\u0002\u00105\u001a\u00020\u001d\u0012\b\b\u0002\u00107\u001a\u00020\u001d\u0012\b\b\u0002\u00109\u001a\u00020\u001d\u0012\u0006\u0010?\u001a\u00020:¢\u0006\u0004\b@\u0010AR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0019\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R\u0017\u0010\u001c\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u001b\u0010\fR\u0017\u0010 \u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010'\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010-\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u00103\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u00105\u001a\u00020\u001d8\u0016X\u0004¢\u0006\f\n\u0004\b4\u0010\u001f\u001a\u0004\b5\u0010!R\u001a\u00107\u001a\u00020\u001d8\u0016X\u0004¢\u0006\f\n\u0004\b6\u0010\u001f\u001a\u0004\b7\u0010!R\u001a\u00109\u001a\u00020\u001d8\u0016X\u0004¢\u0006\f\n\u0004\b8\u0010\u001f\u001a\u0004\b9\u0010!R\u001a\u0010?\u001a\u00020:8\u0016X\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006B"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/ServiceOptions$StackAnalytics;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceOptions;", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "", "b", "Ljava/lang/String;", "getReportUrl", "()Ljava/lang/String;", "reportUrl", "", "c", "J", "getReportSize", "()J", "reportSize", "d", "getReportLogLevel", "reportLogLevel", "e", "getReportIntervalMsec", "reportIntervalMsec", "f", "getCrashLogLevel", "crashLogLevel", "", "g", "Z", "isNativeTrackingEnabled", "()Z", "Lcom/appodeal/ads/modules/common/internal/data/DeviceData;", "h", "Lcom/appodeal/ads/modules/common/internal/data/DeviceData;", "getDeviceData", "()Lcom/appodeal/ads/modules/common/internal/data/DeviceData;", "deviceData", "Lcom/appodeal/ads/modules/common/internal/data/ApplicationData;", "i", "Lcom/appodeal/ads/modules/common/internal/data/ApplicationData;", "getApplicationData", "()Lcom/appodeal/ads/modules/common/internal/data/ApplicationData;", "applicationData", "Lcom/appodeal/ads/modules/common/internal/data/UserPersonalData;", "j", "Lcom/appodeal/ads/modules/common/internal/data/UserPersonalData;", "getUserPersonalData", "()Lcom/appodeal/ads/modules/common/internal/data/UserPersonalData;", "userPersonalData", "k", "isLoggingEnabled", "l", "isEventTrackingEnabled", "m", "isRevenueTrackingEnabled", "Lcom/appodeal/ads/modules/common/internal/service/ConnectorCallback;", "n", "Lcom/appodeal/ads/modules/common/internal/service/ConnectorCallback;", "getConnectorCallback", "()Lcom/appodeal/ads/modules/common/internal/service/ConnectorCallback;", "connectorCallback", "<init>", "(Landroid/content/Context;Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;ZLcom/appodeal/ads/modules/common/internal/data/DeviceData;Lcom/appodeal/ads/modules/common/internal/data/ApplicationData;Lcom/appodeal/ads/modules/common/internal/data/UserPersonalData;ZZZLcom/appodeal/ads/modules/common/internal/service/ConnectorCallback;)V", "apd_internal"}, k = 1, mv = {1, 6, 0})
    public static final class StackAnalytics implements ServiceOptions {

        /* renamed from: a  reason: collision with root package name */
        public final Context f16689a;

        /* renamed from: b  reason: collision with root package name */
        public final String f16690b;

        /* renamed from: c  reason: collision with root package name */
        public final long f16691c;

        /* renamed from: d  reason: collision with root package name */
        public final String f16692d;

        /* renamed from: e  reason: collision with root package name */
        public final long f16693e;

        /* renamed from: f  reason: collision with root package name */
        public final String f16694f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f16695g;

        /* renamed from: h  reason: collision with root package name */
        public final DeviceData f16696h;
        public final ApplicationData i;
        public final UserPersonalData j;
        public final boolean k;
        public final boolean l;
        public final boolean m;
        public final ConnectorCallback n;

        public StackAnalytics(Context context, String str, long j2, String str2, long j3, String str3, boolean z, DeviceData deviceData, ApplicationData applicationData, UserPersonalData userPersonalData, boolean z2, boolean z3, boolean z4, ConnectorCallback connectorCallback) {
            String str4 = str3;
            DeviceData deviceData2 = deviceData;
            ApplicationData applicationData2 = applicationData;
            UserPersonalData userPersonalData2 = userPersonalData;
            ConnectorCallback connectorCallback2 = connectorCallback;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(str, "reportUrl");
            Intrinsics.checkNotNullParameter(str2, "reportLogLevel");
            Intrinsics.checkNotNullParameter(str4, "crashLogLevel");
            Intrinsics.checkNotNullParameter(deviceData2, "deviceData");
            Intrinsics.checkNotNullParameter(applicationData2, "applicationData");
            Intrinsics.checkNotNullParameter(userPersonalData2, "userPersonalData");
            Intrinsics.checkNotNullParameter(connectorCallback2, "connectorCallback");
            this.f16689a = context;
            this.f16690b = str;
            this.f16691c = j2;
            this.f16692d = str2;
            this.f16693e = j3;
            this.f16694f = str4;
            this.f16695g = z;
            this.f16696h = deviceData2;
            this.i = applicationData2;
            this.j = userPersonalData2;
            this.k = z2;
            this.l = z3;
            this.m = z4;
            this.n = connectorCallback2;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ StackAnalytics(android.content.Context r21, java.lang.String r22, long r23, java.lang.String r25, long r26, java.lang.String r28, boolean r29, com.appodeal.ads.modules.common.internal.data.DeviceData r30, com.appodeal.ads.modules.common.internal.data.ApplicationData r31, com.appodeal.ads.modules.common.internal.data.UserPersonalData r32, boolean r33, boolean r34, boolean r35, com.appodeal.ads.modules.common.internal.service.ConnectorCallback r36, int r37, kotlin.jvm.internal.DefaultConstructorMarker r38) {
            /*
                r20 = this;
                r0 = r37
                r1 = r0 & 1024(0x400, float:1.435E-42)
                r2 = 0
                if (r1 == 0) goto L_0x000a
                r16 = 0
                goto L_0x000c
            L_0x000a:
                r16 = r33
            L_0x000c:
                r1 = r0 & 2048(0x800, float:2.87E-42)
                if (r1 == 0) goto L_0x0013
                r17 = 0
                goto L_0x0015
            L_0x0013:
                r17 = r34
            L_0x0015:
                r0 = r0 & 4096(0x1000, float:5.74E-42)
                if (r0 == 0) goto L_0x001c
                r18 = 0
                goto L_0x001e
            L_0x001c:
                r18 = r35
            L_0x001e:
                r3 = r20
                r4 = r21
                r5 = r22
                r6 = r23
                r8 = r25
                r9 = r26
                r11 = r28
                r12 = r29
                r13 = r30
                r14 = r31
                r15 = r32
                r19 = r36
                r3.<init>(r4, r5, r6, r8, r9, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.modules.common.internal.service.ServiceOptions.StackAnalytics.<init>(android.content.Context, java.lang.String, long, java.lang.String, long, java.lang.String, boolean, com.appodeal.ads.modules.common.internal.data.DeviceData, com.appodeal.ads.modules.common.internal.data.ApplicationData, com.appodeal.ads.modules.common.internal.data.UserPersonalData, boolean, boolean, boolean, com.appodeal.ads.modules.common.internal.service.ConnectorCallback, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final ApplicationData getApplicationData() {
            return this.i;
        }

        public ConnectorCallback getConnectorCallback() {
            return this.n;
        }

        public final Context getContext() {
            return this.f16689a;
        }

        public final String getCrashLogLevel() {
            return this.f16694f;
        }

        public final DeviceData getDeviceData() {
            return this.f16696h;
        }

        public final long getReportIntervalMsec() {
            return this.f16693e;
        }

        public final String getReportLogLevel() {
            return this.f16692d;
        }

        public final long getReportSize() {
            return this.f16691c;
        }

        public final String getReportUrl() {
            return this.f16690b;
        }

        public final UserPersonalData getUserPersonalData() {
            return this.j;
        }

        public boolean isEventTrackingEnabled() {
            return this.l;
        }

        public boolean isLoggingEnabled() {
            return this.k;
        }

        public final boolean isNativeTrackingEnabled() {
            return this.f16695g;
        }

        public boolean isRevenueTrackingEnabled() {
            return this.m;
        }
    }

    ConnectorCallback getConnectorCallback();

    boolean isEventTrackingEnabled();

    boolean isLoggingEnabled();

    boolean isRevenueTrackingEnabled();
}
