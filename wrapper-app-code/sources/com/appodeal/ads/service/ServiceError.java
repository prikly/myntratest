package com.appodeal.ads.service;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\t\n\u000b\f\r\u000e\u000f\u0010B\u001b\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u0001\b\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lcom/appodeal/ads/service/ServiceError;", "", "componentName", "", "description", "(Ljava/lang/String;Ljava/lang/String;)V", "getComponentName", "()Ljava/lang/String;", "getDescription", "Adjust", "Appsflyer", "FacebookAnalytics", "IAPValidationTimeout", "InitializationTimeout", "Internal", "PurchaseValidationServiceNotFound", "SentryAnalytics", "Lcom/appodeal/ads/service/ServiceError$Internal;", "Lcom/appodeal/ads/service/ServiceError$InitializationTimeout;", "Lcom/appodeal/ads/service/ServiceError$IAPValidationTimeout;", "Lcom/appodeal/ads/service/ServiceError$PurchaseValidationServiceNotFound;", "Lcom/appodeal/ads/service/ServiceError$Adjust;", "Lcom/appodeal/ads/service/ServiceError$Appsflyer;", "Lcom/appodeal/ads/service/ServiceError$FacebookAnalytics;", "Lcom/appodeal/ads/service/ServiceError$SentryAnalytics;", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class ServiceError extends Throwable {
    private final String componentName;
    private final String description;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0005\u0006\u0007\b\tB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/appodeal/ads/service/ServiceError$Adjust;", "Lcom/appodeal/ads/service/ServiceError;", "description", "", "(Ljava/lang/String;)V", "InAppPurchaseTrackError", "NoAppToken", "NoEnvironment", "PurchaseValidationError", "SubscriptionTrackError", "Lcom/appodeal/ads/service/ServiceError$Adjust$NoAppToken;", "Lcom/appodeal/ads/service/ServiceError$Adjust$NoEnvironment;", "Lcom/appodeal/ads/service/ServiceError$Adjust$InAppPurchaseTrackError;", "Lcom/appodeal/ads/service/ServiceError$Adjust$SubscriptionTrackError;", "Lcom/appodeal/ads/service/ServiceError$Adjust$PurchaseValidationError;", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static abstract class Adjust extends ServiceError {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/appodeal/ads/service/ServiceError$Adjust$InAppPurchaseTrackError;", "Lcom/appodeal/ads/service/ServiceError$Adjust;", "()V", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class InAppPurchaseTrackError extends Adjust {
            public static final InAppPurchaseTrackError INSTANCE = new InAppPurchaseTrackError();

            private InAppPurchaseTrackError() {
                super("Purchase track error", (DefaultConstructorMarker) null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/appodeal/ads/service/ServiceError$Adjust$NoAppToken;", "Lcom/appodeal/ads/service/ServiceError$Adjust;", "()V", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class NoAppToken extends Adjust {
            public static final NoAppToken INSTANCE = new NoAppToken();

            private NoAppToken() {
                super("App token not provided, see https://help.adjust.com/en/article/app-settings#view-your-app-token", (DefaultConstructorMarker) null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/appodeal/ads/service/ServiceError$Adjust$NoEnvironment;", "Lcom/appodeal/ads/service/ServiceError$Adjust;", "()V", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class NoEnvironment extends Adjust {
            public static final NoEnvironment INSTANCE = new NoEnvironment();

            private NoEnvironment() {
                super("Environment not provided", (DefaultConstructorMarker) null);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/appodeal/ads/service/ServiceError$Adjust$PurchaseValidationError;", "Lcom/appodeal/ads/service/ServiceError$Adjust;", "description", "", "(Ljava/lang/String;)V", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class PurchaseValidationError extends Adjust {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public PurchaseValidationError(String str) {
                super(str, (DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(str, "description");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/appodeal/ads/service/ServiceError$Adjust$SubscriptionTrackError;", "Lcom/appodeal/ads/service/ServiceError$Adjust;", "()V", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class SubscriptionTrackError extends Adjust {
            public static final SubscriptionTrackError INSTANCE = new SubscriptionTrackError();

            private SubscriptionTrackError() {
                super("Subscription track error", (DefaultConstructorMarker) null);
            }
        }

        private Adjust(String str) {
            super("Adjust", str, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ Adjust(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0005\u0006\u0007\bB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/appodeal/ads/service/ServiceError$Appsflyer;", "Lcom/appodeal/ads/service/ServiceError;", "description", "", "(Ljava/lang/String;)V", "ConversionDataFail", "NoAppIdProvided", "NoDevKeyProvided", "PurchaseValidationError", "Lcom/appodeal/ads/service/ServiceError$Appsflyer$NoDevKeyProvided;", "Lcom/appodeal/ads/service/ServiceError$Appsflyer$NoAppIdProvided;", "Lcom/appodeal/ads/service/ServiceError$Appsflyer$PurchaseValidationError;", "Lcom/appodeal/ads/service/ServiceError$Appsflyer$ConversionDataFail;", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static abstract class Appsflyer extends ServiceError {

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/appodeal/ads/service/ServiceError$Appsflyer$ConversionDataFail;", "Lcom/appodeal/ads/service/ServiceError$Appsflyer;", "description", "", "(Ljava/lang/String;)V", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class ConversionDataFail extends Appsflyer {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public ConversionDataFail(String str) {
                super(str == null ? "" : str, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/appodeal/ads/service/ServiceError$Appsflyer$NoAppIdProvided;", "Lcom/appodeal/ads/service/ServiceError$Appsflyer;", "()V", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class NoAppIdProvided extends Appsflyer {
            public static final NoAppIdProvided INSTANCE = new NoAppIdProvided();

            private NoAppIdProvided() {
                super("AppId not provided", (DefaultConstructorMarker) null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/appodeal/ads/service/ServiceError$Appsflyer$NoDevKeyProvided;", "Lcom/appodeal/ads/service/ServiceError$Appsflyer;", "()V", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class NoDevKeyProvided extends Appsflyer {
            public static final NoDevKeyProvided INSTANCE = new NoDevKeyProvided();

            private NoDevKeyProvided() {
                super("DevKey not provided, see https://support.appsflyer.com/hc/en-us/articles/207032066-Basic-SDK-integration-guide#retrieving-the-dev-key", (DefaultConstructorMarker) null);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/appodeal/ads/service/ServiceError$Appsflyer$PurchaseValidationError;", "Lcom/appodeal/ads/service/ServiceError$Appsflyer;", "description", "", "(Ljava/lang/String;)V", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class PurchaseValidationError extends Appsflyer {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public PurchaseValidationError(String str) {
                super(str == null ? "" : str, (DefaultConstructorMarker) null);
            }
        }

        private Appsflyer(String str) {
            super("AppsFlyer", str, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ Appsflyer(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0005\u0006B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/appodeal/ads/service/ServiceError$FacebookAnalytics;", "Lcom/appodeal/ads/service/ServiceError;", "description", "", "(Ljava/lang/String;)V", "AppIdIsNotOverridden", "ClientTokenIsNotOverridden", "Lcom/appodeal/ads/service/ServiceError$FacebookAnalytics$AppIdIsNotOverridden;", "Lcom/appodeal/ads/service/ServiceError$FacebookAnalytics$ClientTokenIsNotOverridden;", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static abstract class FacebookAnalytics extends ServiceError {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/appodeal/ads/service/ServiceError$FacebookAnalytics$AppIdIsNotOverridden;", "Lcom/appodeal/ads/service/ServiceError$FacebookAnalytics;", "()V", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class AppIdIsNotOverridden extends FacebookAnalytics {
            public static final AppIdIsNotOverridden INSTANCE = new AppIdIsNotOverridden();

            private AppIdIsNotOverridden() {
                super("R.string.facebook_app_id string resource not overridden, see https://developers.facebook.com/docs/android/getting-started/#add-app_id", (DefaultConstructorMarker) null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/appodeal/ads/service/ServiceError$FacebookAnalytics$ClientTokenIsNotOverridden;", "Lcom/appodeal/ads/service/ServiceError$FacebookAnalytics;", "()V", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class ClientTokenIsNotOverridden extends FacebookAnalytics {
            public static final ClientTokenIsNotOverridden INSTANCE = new ClientTokenIsNotOverridden();

            private ClientTokenIsNotOverridden() {
                super("R.facebook_client_token string resource not overridden, see https://developers.facebook.com/docs/android/getting-started/#client-token", (DefaultConstructorMarker) null);
            }
        }

        private FacebookAnalytics(String str) {
            super("Facebook Analytics", str, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ FacebookAnalytics(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/appodeal/ads/service/ServiceError$IAPValidationTimeout;", "Lcom/appodeal/ads/service/ServiceError;", "()V", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class IAPValidationTimeout extends ServiceError {
        public static final IAPValidationTimeout INSTANCE = new IAPValidationTimeout();

        private IAPValidationTimeout() {
            super((String) null, (String) null, 3, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/appodeal/ads/service/ServiceError$InitializationTimeout;", "Lcom/appodeal/ads/service/ServiceError;", "()V", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class InitializationTimeout extends ServiceError {
        public static final InitializationTimeout INSTANCE = new InitializationTimeout();

        private InitializationTimeout() {
            super((String) null, (String) null, 3, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/appodeal/ads/service/ServiceError$Internal;", "Lcom/appodeal/ads/service/ServiceError;", "()V", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Internal extends ServiceError {
        public static final Internal INSTANCE = new Internal();

        private Internal() {
            super((String) null, (String) null, 3, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/appodeal/ads/service/ServiceError$PurchaseValidationServiceNotFound;", "Lcom/appodeal/ads/service/ServiceError;", "()V", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class PurchaseValidationServiceNotFound extends ServiceError {
        public static final PurchaseValidationServiceNotFound INSTANCE = new PurchaseValidationServiceNotFound();

        private PurchaseValidationServiceNotFound() {
            super((String) null, (String) null, 3, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0005\u0006B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/appodeal/ads/service/ServiceError$SentryAnalytics;", "Lcom/appodeal/ads/service/ServiceError;", "description", "", "(Ljava/lang/String;)V", "NoDsnProvided", "NoEnvironmentProvided", "Lcom/appodeal/ads/service/ServiceError$SentryAnalytics$NoDsnProvided;", "Lcom/appodeal/ads/service/ServiceError$SentryAnalytics$NoEnvironmentProvided;", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static abstract class SentryAnalytics extends ServiceError {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/appodeal/ads/service/ServiceError$SentryAnalytics$NoDsnProvided;", "Lcom/appodeal/ads/service/ServiceError$SentryAnalytics;", "()V", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class NoDsnProvided extends SentryAnalytics {
            public static final NoDsnProvided INSTANCE = new NoDsnProvided();

            private NoDsnProvided() {
                super("DSN not provided", (DefaultConstructorMarker) null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/appodeal/ads/service/ServiceError$SentryAnalytics$NoEnvironmentProvided;", "Lcom/appodeal/ads/service/ServiceError$SentryAnalytics;", "()V", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class NoEnvironmentProvided extends SentryAnalytics {
            public static final NoEnvironmentProvided INSTANCE = new NoEnvironmentProvided();

            private NoEnvironmentProvided() {
                super("Environment not provided", (DefaultConstructorMarker) null);
            }
        }

        private SentryAnalytics(String str) {
            super("Sentry Analytics", str, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ SentryAnalytics(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    private ServiceError(String str, String str2) {
        this.componentName = str;
        this.description = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ServiceError(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new String() : str, (i & 2) != 0 ? new String() : str2, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ ServiceError(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    public final String getComponentName() {
        return this.componentName;
    }

    public final String getDescription() {
        return this.description;
    }
}
