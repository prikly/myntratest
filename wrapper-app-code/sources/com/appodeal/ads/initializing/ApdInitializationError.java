package com.appodeal.ads.initializing;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/appodeal/ads/initializing/ApdInitializationError;", "", "()V", "Critical", "InternalError", "NonCritical", "Lcom/appodeal/ads/initializing/ApdInitializationError$Critical;", "Lcom/appodeal/ads/initializing/ApdInitializationError$InternalError;", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical;", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class ApdInitializationError extends Throwable {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/appodeal/ads/initializing/ApdInitializationError$Critical;", "Lcom/appodeal/ads/initializing/ApdInitializationError;", "description", "", "(Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "ActivityIsNull", "AppKeyIsNullOrEmpty", "SdkVersionIsNotSupported", "Lcom/appodeal/ads/initializing/ApdInitializationError$Critical$SdkVersionIsNotSupported;", "Lcom/appodeal/ads/initializing/ApdInitializationError$Critical$ActivityIsNull;", "Lcom/appodeal/ads/initializing/ApdInitializationError$Critical$AppKeyIsNullOrEmpty;", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static abstract class Critical extends ApdInitializationError {
        private final String description;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/appodeal/ads/initializing/ApdInitializationError$Critical$ActivityIsNull;", "Lcom/appodeal/ads/initializing/ApdInitializationError$Critical;", "()V", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class ActivityIsNull extends Critical {
            public static final ActivityIsNull INSTANCE = new ActivityIsNull();

            private ActivityIsNull() {
                super("The Activity instance passed to Appodeal initialization method is null. Appodeal SDK is disabled", (DefaultConstructorMarker) null);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/appodeal/ads/initializing/ApdInitializationError$Critical$AppKeyIsNullOrEmpty;", "Lcom/appodeal/ads/initializing/ApdInitializationError$Critical;", "bundleId", "", "(Ljava/lang/String;)V", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class AppKeyIsNullOrEmpty extends Critical {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public AppKeyIsNullOrEmpty(String str) {
                super(Intrinsics.stringPlus("The Appodeal APP KEY passed to Appodeal initialization method is null or empty. \nYou may check https://app.appodeal.com/apps to find the corresponding App Key for ", str), (DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(str, "bundleId");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/appodeal/ads/initializing/ApdInitializationError$Critical$SdkVersionIsNotSupported;", "Lcom/appodeal/ads/initializing/ApdInitializationError$Critical;", "()V", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class SdkVersionIsNotSupported extends Critical {
            public static final SdkVersionIsNotSupported INSTANCE = new SdkVersionIsNotSupported();

            private SdkVersionIsNotSupported() {
                super("Minimum supported Android api version is 21. Appodeal SDK is disabled", (DefaultConstructorMarker) null);
            }
        }

        private Critical(String str) {
            super((DefaultConstructorMarker) null);
            this.description = str;
        }

        public /* synthetic */ Critical(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public final String getDescription() {
            return this.description;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0005\u0006B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/appodeal/ads/initializing/ApdInitializationError$InternalError;", "Lcom/appodeal/ads/initializing/ApdInitializationError;", "error", "", "(Ljava/lang/Throwable;)V", "PreparingSdkError", "SdkConfigurationError", "Lcom/appodeal/ads/initializing/ApdInitializationError$InternalError$SdkConfigurationError;", "Lcom/appodeal/ads/initializing/ApdInitializationError$InternalError$PreparingSdkError;", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static abstract class InternalError extends ApdInitializationError {

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/appodeal/ads/initializing/ApdInitializationError$InternalError$PreparingSdkError;", "Lcom/appodeal/ads/initializing/ApdInitializationError$InternalError;", "error", "", "(Ljava/lang/Throwable;)V", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class PreparingSdkError extends InternalError {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public PreparingSdkError(Throwable th) {
                super(th, (DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(th, "error");
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/appodeal/ads/initializing/ApdInitializationError$InternalError$SdkConfigurationError;", "Lcom/appodeal/ads/initializing/ApdInitializationError$InternalError;", "error", "", "(Ljava/lang/Throwable;)V", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class SdkConfigurationError extends InternalError {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public SdkConfigurationError(Throwable th) {
                super(th, (DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(th, "error");
            }
        }

        private InternalError(Throwable th) {
            super((DefaultConstructorMarker) null);
        }

        public /* synthetic */ InternalError(Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
            this(th);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\t\n\u000b\fB\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u0001\u0004\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical;", "Lcom/appodeal/ads/initializing/ApdInitializationError;", "componentName", "", "description", "(Ljava/lang/String;Ljava/lang/String;)V", "getComponentName", "()Ljava/lang/String;", "getDescription", "AdjustNotInitialized", "AppsflyerNotInitialized", "FacebookAnalyticsNotInitialized", "OtherError", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$OtherError;", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$AdjustNotInitialized;", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$AppsflyerNotInitialized;", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$FacebookAnalyticsNotInitialized;", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static abstract class NonCritical extends ApdInitializationError {
        private final String componentName;
        private final String description;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0005\u0006\u0007\b\tB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$AdjustNotInitialized;", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical;", "description", "", "(Ljava/lang/String;)V", "InAppPurchaseTrackError", "NoAppToken", "NoEnvironment", "PurchaseValidationError", "SubscriptionTrackError", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$AdjustNotInitialized$NoAppToken;", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$AdjustNotInitialized$NoEnvironment;", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$AdjustNotInitialized$InAppPurchaseTrackError;", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$AdjustNotInitialized$SubscriptionTrackError;", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$AdjustNotInitialized$PurchaseValidationError;", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static abstract class AdjustNotInitialized extends NonCritical {

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$AdjustNotInitialized$InAppPurchaseTrackError;", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$AdjustNotInitialized;", "()V", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
            public static final class InAppPurchaseTrackError extends AdjustNotInitialized {
                public static final InAppPurchaseTrackError INSTANCE = new InAppPurchaseTrackError();

                private InAppPurchaseTrackError() {
                    super("Purchase track error", (DefaultConstructorMarker) null);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$AdjustNotInitialized$NoAppToken;", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$AdjustNotInitialized;", "()V", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
            public static final class NoAppToken extends AdjustNotInitialized {
                public static final NoAppToken INSTANCE = new NoAppToken();

                private NoAppToken() {
                    super("App token not provided, see https://help.adjust.com/en/article/app-settings#view-your-app-token", (DefaultConstructorMarker) null);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$AdjustNotInitialized$NoEnvironment;", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$AdjustNotInitialized;", "()V", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
            public static final class NoEnvironment extends AdjustNotInitialized {
                public static final NoEnvironment INSTANCE = new NoEnvironment();

                private NoEnvironment() {
                    super("Environment not provided", (DefaultConstructorMarker) null);
                }
            }

            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$AdjustNotInitialized$PurchaseValidationError;", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$AdjustNotInitialized;", "description", "", "(Ljava/lang/String;)V", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
            public static final class PurchaseValidationError extends AdjustNotInitialized {
                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public PurchaseValidationError(String str) {
                    super(str, (DefaultConstructorMarker) null);
                    Intrinsics.checkNotNullParameter(str, "description");
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$AdjustNotInitialized$SubscriptionTrackError;", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$AdjustNotInitialized;", "()V", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
            public static final class SubscriptionTrackError extends AdjustNotInitialized {
                public static final SubscriptionTrackError INSTANCE = new SubscriptionTrackError();

                private SubscriptionTrackError() {
                    super("Subscription track error", (DefaultConstructorMarker) null);
                }
            }

            private AdjustNotInitialized(String str) {
                super("Adjust", str, (DefaultConstructorMarker) null);
            }

            public /* synthetic */ AdjustNotInitialized(String str, DefaultConstructorMarker defaultConstructorMarker) {
                this(str);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0005\u0006\u0007\bB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$AppsflyerNotInitialized;", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical;", "description", "", "(Ljava/lang/String;)V", "ConversionDataFail", "NoAppIdProvided", "NoDevKeyProvided", "PurchaseValidationError", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$AppsflyerNotInitialized$NoDevKeyProvided;", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$AppsflyerNotInitialized$NoAppIdProvided;", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$AppsflyerNotInitialized$PurchaseValidationError;", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$AppsflyerNotInitialized$ConversionDataFail;", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static abstract class AppsflyerNotInitialized extends NonCritical {

            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$AppsflyerNotInitialized$ConversionDataFail;", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$AppsflyerNotInitialized;", "description", "", "(Ljava/lang/String;)V", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
            public static final class ConversionDataFail extends AppsflyerNotInitialized {
                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public ConversionDataFail(String str) {
                    super(str == null ? "" : str, (DefaultConstructorMarker) null);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$AppsflyerNotInitialized$NoAppIdProvided;", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$AppsflyerNotInitialized;", "()V", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
            public static final class NoAppIdProvided extends AppsflyerNotInitialized {
                public static final NoAppIdProvided INSTANCE = new NoAppIdProvided();

                private NoAppIdProvided() {
                    super("AppId not provided", (DefaultConstructorMarker) null);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$AppsflyerNotInitialized$NoDevKeyProvided;", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$AppsflyerNotInitialized;", "()V", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
            public static final class NoDevKeyProvided extends AppsflyerNotInitialized {
                public static final NoDevKeyProvided INSTANCE = new NoDevKeyProvided();

                private NoDevKeyProvided() {
                    super("DevKey not provided, see https://support.appsflyer.com/hc/en-us/articles/207032066-Basic-SDK-integration-guide#retrieving-the-dev-key", (DefaultConstructorMarker) null);
                }
            }

            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$AppsflyerNotInitialized$PurchaseValidationError;", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$AppsflyerNotInitialized;", "description", "", "(Ljava/lang/String;)V", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
            public static final class PurchaseValidationError extends AppsflyerNotInitialized {
                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public PurchaseValidationError(String str) {
                    super(str == null ? "" : str, (DefaultConstructorMarker) null);
                }
            }

            private AppsflyerNotInitialized(String str) {
                super("AppsFlyer", str, (DefaultConstructorMarker) null);
            }

            public /* synthetic */ AppsflyerNotInitialized(String str, DefaultConstructorMarker defaultConstructorMarker) {
                this(str);
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0005\u0006B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$FacebookAnalyticsNotInitialized;", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical;", "description", "", "(Ljava/lang/String;)V", "AppIdIsNotOverridden", "ClientTokenIsNotOverridden", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$FacebookAnalyticsNotInitialized$AppIdIsNotOverridden;", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$FacebookAnalyticsNotInitialized$ClientTokenIsNotOverridden;", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static abstract class FacebookAnalyticsNotInitialized extends NonCritical {

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$FacebookAnalyticsNotInitialized$AppIdIsNotOverridden;", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$FacebookAnalyticsNotInitialized;", "()V", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
            public static final class AppIdIsNotOverridden extends FacebookAnalyticsNotInitialized {
                public static final AppIdIsNotOverridden INSTANCE = new AppIdIsNotOverridden();

                private AppIdIsNotOverridden() {
                    super("R.string.facebook_app_id string resource not overridden, see https://developers.facebook.com/docs/android/getting-started/#add-app_id", (DefaultConstructorMarker) null);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$FacebookAnalyticsNotInitialized$ClientTokenIsNotOverridden;", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$FacebookAnalyticsNotInitialized;", "()V", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
            public static final class ClientTokenIsNotOverridden extends FacebookAnalyticsNotInitialized {
                public static final ClientTokenIsNotOverridden INSTANCE = new ClientTokenIsNotOverridden();

                private ClientTokenIsNotOverridden() {
                    super("R.facebook_client_token string resource not overridden, see https://developers.facebook.com/docs/android/getting-started/#client-token", (DefaultConstructorMarker) null);
                }
            }

            private FacebookAnalyticsNotInitialized(String str) {
                super("Facebook Analytics", str, (DefaultConstructorMarker) null);
            }

            public /* synthetic */ FacebookAnalyticsNotInitialized(String str, DefaultConstructorMarker defaultConstructorMarker) {
                this(str);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical$OtherError;", "Lcom/appodeal/ads/initializing/ApdInitializationError$NonCritical;", "componentName", "", "description", "(Ljava/lang/String;Ljava/lang/String;)V", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class OtherError extends NonCritical {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public OtherError(String str, String str2) {
                super(str, str2, (DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(str, "componentName");
            }
        }

        private NonCritical(String str, String str2) {
            super((DefaultConstructorMarker) null);
            this.componentName = str;
            this.description = str2;
        }

        public /* synthetic */ NonCritical(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }

        public final String getComponentName() {
            return this.componentName;
        }

        public final String getDescription() {
            return this.description;
        }
    }

    private ApdInitializationError() {
    }

    public /* synthetic */ ApdInitializationError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
