package com.appodeal.ads.inapp;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\b\u0016\u0018\u0000 %2\u00020\u0001:\u0003$%&B\u0001\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0011¢\u0006\u0002\u0010\u0012J\b\u0010#\u001a\u00020\u0005H\u0016R\u001d\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lcom/appodeal/ads/inapp/InAppPurchase;", "", "type", "Lcom/appodeal/ads/inapp/InAppPurchase$Type;", "publicKey", "", "signature", "purchaseData", "developerPayload", "price", "currency", "sku", "orderId", "purchaseToken", "purchaseTimestamp", "", "additionalParameters", "", "(Lcom/appodeal/ads/inapp/InAppPurchase$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/util/Map;)V", "getAdditionalParameters", "()Ljava/util/Map;", "getCurrency", "()Ljava/lang/String;", "getDeveloperPayload", "getOrderId", "getPrice", "getPublicKey", "getPurchaseData", "getPurchaseTimestamp", "()J", "getPurchaseToken", "getSignature", "getSku", "getType", "()Lcom/appodeal/ads/inapp/InAppPurchase$Type;", "toString", "Builder", "Companion", "Type", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class InAppPurchase {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final Map<String, String> additionalParameters;
    private final String currency;
    private final String developerPayload;
    private final String orderId;
    private final String price;
    private final String publicKey;
    private final String purchaseData;
    private final long purchaseTimestamp;
    private final String purchaseToken;
    private final String signature;
    private final String sku;
    private final Type type;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0001\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0011¢\u0006\u0002\u0010\u0012J\u0006\u00103\u001a\u000204J\u001a\u00105\u001a\u00020\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0011J\u0010\u00106\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0005J\u0010\u00107\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0005J\u0010\u00108\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0005J\u0010\u00109\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0005J\u0010\u0010:\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u0010\u0010;\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005J\u000e\u0010<\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010=\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0005J\u0010\u0010>\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0010\u0010?\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005R&\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u001aR\u001a\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0018\"\u0004\b*\u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0018\"\u0004\b,\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0018\"\u0004\b.\u0010\u001aR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u0006@"}, d2 = {"Lcom/appodeal/ads/inapp/InAppPurchase$Builder;", "", "type", "Lcom/appodeal/ads/inapp/InAppPurchase$Type;", "publicKey", "", "signature", "purchaseData", "developerPayload", "price", "currency", "sku", "orderId", "purchaseToken", "purchaseTimestamp", "", "additionalParameters", "", "(Lcom/appodeal/ads/inapp/InAppPurchase$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/util/Map;)V", "getAdditionalParameters", "()Ljava/util/Map;", "setAdditionalParameters", "(Ljava/util/Map;)V", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "getDeveloperPayload", "setDeveloperPayload", "getOrderId", "setOrderId", "getPrice", "setPrice", "getPublicKey", "setPublicKey", "getPurchaseData", "setPurchaseData", "getPurchaseTimestamp", "()J", "setPurchaseTimestamp", "(J)V", "getPurchaseToken", "setPurchaseToken", "getSignature", "setSignature", "getSku", "setSku", "getType", "()Lcom/appodeal/ads/inapp/InAppPurchase$Type;", "setType", "(Lcom/appodeal/ads/inapp/InAppPurchase$Type;)V", "build", "Lcom/appodeal/ads/inapp/InAppPurchase;", "withAdditionalParams", "withCurrency", "withDeveloperPayload", "withOrderId", "withPrice", "withPublicKey", "withPurchaseData", "withPurchaseTimestamp", "withPurchaseToken", "withSignature", "withSku", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Builder {
        private Map<String, String> additionalParameters;
        private String currency;
        private String developerPayload;
        private String orderId;
        private String price;
        private String publicKey;
        private String purchaseData;
        private long purchaseTimestamp;
        private String purchaseToken;
        private String signature;
        private String sku;
        private Type type;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public Builder(com.appodeal.ads.inapp.InAppPurchase.Type r18) {
            /*
                r17 = this;
                java.lang.String r0 = "type"
                r2 = r18
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r14 = 0
                r15 = 4094(0xffe, float:5.737E-42)
                r16 = 0
                r1 = r17
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.inapp.InAppPurchase.Builder.<init>(com.appodeal.ads.inapp.InAppPurchase$Type):void");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public Builder(com.appodeal.ads.inapp.InAppPurchase.Type r18, java.lang.String r19) {
            /*
                r17 = this;
                java.lang.String r0 = "type"
                r2 = r18
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r14 = 0
                r15 = 4092(0xffc, float:5.734E-42)
                r16 = 0
                r1 = r17
                r3 = r19
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.inapp.InAppPurchase.Builder.<init>(com.appodeal.ads.inapp.InAppPurchase$Type, java.lang.String):void");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public Builder(com.appodeal.ads.inapp.InAppPurchase.Type r18, java.lang.String r19, java.lang.String r20) {
            /*
                r17 = this;
                java.lang.String r0 = "type"
                r2 = r18
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r14 = 0
                r15 = 4088(0xff8, float:5.729E-42)
                r16 = 0
                r1 = r17
                r3 = r19
                r4 = r20
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.inapp.InAppPurchase.Builder.<init>(com.appodeal.ads.inapp.InAppPurchase$Type, java.lang.String, java.lang.String):void");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public Builder(com.appodeal.ads.inapp.InAppPurchase.Type r18, java.lang.String r19, java.lang.String r20, java.lang.String r21) {
            /*
                r17 = this;
                java.lang.String r0 = "type"
                r2 = r18
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r14 = 0
                r15 = 4080(0xff0, float:5.717E-42)
                r16 = 0
                r1 = r17
                r3 = r19
                r4 = r20
                r5 = r21
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.inapp.InAppPurchase.Builder.<init>(com.appodeal.ads.inapp.InAppPurchase$Type, java.lang.String, java.lang.String, java.lang.String):void");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public Builder(com.appodeal.ads.inapp.InAppPurchase.Type r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22) {
            /*
                r17 = this;
                java.lang.String r0 = "type"
                r2 = r18
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r14 = 0
                r15 = 4064(0xfe0, float:5.695E-42)
                r16 = 0
                r1 = r17
                r3 = r19
                r4 = r20
                r5 = r21
                r6 = r22
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.inapp.InAppPurchase.Builder.<init>(com.appodeal.ads.inapp.InAppPurchase$Type, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public Builder(com.appodeal.ads.inapp.InAppPurchase.Type r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23) {
            /*
                r17 = this;
                java.lang.String r0 = "type"
                r2 = r18
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r14 = 0
                r15 = 4032(0xfc0, float:5.65E-42)
                r16 = 0
                r1 = r17
                r3 = r19
                r4 = r20
                r5 = r21
                r6 = r22
                r7 = r23
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.inapp.InAppPurchase.Builder.<init>(com.appodeal.ads.inapp.InAppPurchase$Type, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public Builder(com.appodeal.ads.inapp.InAppPurchase.Type r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24) {
            /*
                r17 = this;
                java.lang.String r0 = "type"
                r2 = r18
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r14 = 0
                r15 = 3968(0xf80, float:5.56E-42)
                r16 = 0
                r1 = r17
                r3 = r19
                r4 = r20
                r5 = r21
                r6 = r22
                r7 = r23
                r8 = r24
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.inapp.InAppPurchase.Builder.<init>(com.appodeal.ads.inapp.InAppPurchase$Type, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public Builder(com.appodeal.ads.inapp.InAppPurchase.Type r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25) {
            /*
                r17 = this;
                java.lang.String r0 = "type"
                r2 = r18
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r10 = 0
                r11 = 0
                r12 = 0
                r14 = 0
                r15 = 3840(0xf00, float:5.381E-42)
                r16 = 0
                r1 = r17
                r3 = r19
                r4 = r20
                r5 = r21
                r6 = r22
                r7 = r23
                r8 = r24
                r9 = r25
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.inapp.InAppPurchase.Builder.<init>(com.appodeal.ads.inapp.InAppPurchase$Type, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public Builder(com.appodeal.ads.inapp.InAppPurchase.Type r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26) {
            /*
                r17 = this;
                java.lang.String r0 = "type"
                r2 = r18
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r11 = 0
                r12 = 0
                r14 = 0
                r15 = 3584(0xe00, float:5.022E-42)
                r16 = 0
                r1 = r17
                r3 = r19
                r4 = r20
                r5 = r21
                r6 = r22
                r7 = r23
                r8 = r24
                r9 = r25
                r10 = r26
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.inapp.InAppPurchase.Builder.<init>(com.appodeal.ads.inapp.InAppPurchase$Type, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public Builder(com.appodeal.ads.inapp.InAppPurchase.Type r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27) {
            /*
                r17 = this;
                java.lang.String r0 = "type"
                r2 = r18
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r12 = 0
                r14 = 0
                r15 = 3072(0xc00, float:4.305E-42)
                r16 = 0
                r1 = r17
                r3 = r19
                r4 = r20
                r5 = r21
                r6 = r22
                r7 = r23
                r8 = r24
                r9 = r25
                r10 = r26
                r11 = r27
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.inapp.InAppPurchase.Builder.<init>(com.appodeal.ads.inapp.InAppPurchase$Type, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public Builder(com.appodeal.ads.inapp.InAppPurchase.Type r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, long r28) {
            /*
                r17 = this;
                java.lang.String r0 = "type"
                r2 = r18
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r14 = 0
                r15 = 2048(0x800, float:2.87E-42)
                r16 = 0
                r1 = r17
                r3 = r19
                r4 = r20
                r5 = r21
                r6 = r22
                r7 = r23
                r8 = r24
                r9 = r25
                r10 = r26
                r11 = r27
                r12 = r28
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.inapp.InAppPurchase.Builder.<init>(com.appodeal.ads.inapp.InAppPurchase$Type, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long):void");
        }

        public Builder(Type type2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, long j, Map<String, String> map) {
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(map, "additionalParameters");
            this.type = type2;
            this.publicKey = str;
            this.signature = str2;
            this.purchaseData = str3;
            this.developerPayload = str4;
            this.price = str5;
            this.currency = str6;
            this.sku = str7;
            this.orderId = str8;
            this.purchaseToken = str9;
            this.purchaseTimestamp = j;
            this.additionalParameters = map;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ Builder(com.appodeal.ads.inapp.InAppPurchase.Type r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, long r23, java.util.Map r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
            /*
                r12 = this;
                r0 = r26
                r1 = r0 & 2
                r2 = 0
                if (r1 == 0) goto L_0x0009
                r1 = r2
                goto L_0x000a
            L_0x0009:
                r1 = r14
            L_0x000a:
                r3 = r0 & 4
                if (r3 == 0) goto L_0x0010
                r3 = r2
                goto L_0x0011
            L_0x0010:
                r3 = r15
            L_0x0011:
                r4 = r0 & 8
                if (r4 == 0) goto L_0x0017
                r4 = r2
                goto L_0x0019
            L_0x0017:
                r4 = r16
            L_0x0019:
                r5 = r0 & 16
                if (r5 == 0) goto L_0x001f
                r5 = r2
                goto L_0x0021
            L_0x001f:
                r5 = r17
            L_0x0021:
                r6 = r0 & 32
                if (r6 == 0) goto L_0x0027
                r6 = r2
                goto L_0x0029
            L_0x0027:
                r6 = r18
            L_0x0029:
                r7 = r0 & 64
                if (r7 == 0) goto L_0x002f
                r7 = r2
                goto L_0x0031
            L_0x002f:
                r7 = r19
            L_0x0031:
                r8 = r0 & 128(0x80, float:1.794E-43)
                if (r8 == 0) goto L_0x0037
                r8 = r2
                goto L_0x0039
            L_0x0037:
                r8 = r20
            L_0x0039:
                r9 = r0 & 256(0x100, float:3.59E-43)
                if (r9 == 0) goto L_0x003f
                r9 = r2
                goto L_0x0041
            L_0x003f:
                r9 = r21
            L_0x0041:
                r10 = r0 & 512(0x200, float:7.175E-43)
                if (r10 == 0) goto L_0x0046
                goto L_0x0048
            L_0x0046:
                r2 = r22
            L_0x0048:
                r10 = r0 & 1024(0x400, float:1.435E-42)
                if (r10 == 0) goto L_0x004f
                r10 = 0
                goto L_0x0051
            L_0x004f:
                r10 = r23
            L_0x0051:
                r0 = r0 & 2048(0x800, float:2.87E-42)
                if (r0 == 0) goto L_0x005a
                java.util.Map r0 = kotlin.collections.MapsKt.emptyMap()
                goto L_0x005c
            L_0x005a:
                r0 = r25
            L_0x005c:
                r14 = r12
                r15 = r13
                r16 = r1
                r17 = r3
                r18 = r4
                r19 = r5
                r20 = r6
                r21 = r7
                r22 = r8
                r23 = r9
                r24 = r2
                r25 = r10
                r27 = r0
                r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r27)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.inapp.InAppPurchase.Builder.<init>(com.appodeal.ads.inapp.InAppPurchase$Type, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final InAppPurchase build() {
            return new InAppPurchase(this.type, this.publicKey, this.signature, this.purchaseData, this.developerPayload, this.price, this.currency, this.sku, this.orderId, this.purchaseToken, this.purchaseTimestamp, this.additionalParameters, (DefaultConstructorMarker) null);
        }

        public final Map<String, String> getAdditionalParameters() {
            return this.additionalParameters;
        }

        public final String getCurrency() {
            return this.currency;
        }

        public final String getDeveloperPayload() {
            return this.developerPayload;
        }

        public final String getOrderId() {
            return this.orderId;
        }

        public final String getPrice() {
            return this.price;
        }

        public final String getPublicKey() {
            return this.publicKey;
        }

        public final String getPurchaseData() {
            return this.purchaseData;
        }

        public final long getPurchaseTimestamp() {
            return this.purchaseTimestamp;
        }

        public final String getPurchaseToken() {
            return this.purchaseToken;
        }

        public final String getSignature() {
            return this.signature;
        }

        public final String getSku() {
            return this.sku;
        }

        public final Type getType() {
            return this.type;
        }

        public final void setAdditionalParameters(Map<String, String> map) {
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            this.additionalParameters = map;
        }

        public final void setCurrency(String str) {
            this.currency = str;
        }

        public final void setDeveloperPayload(String str) {
            this.developerPayload = str;
        }

        public final void setOrderId(String str) {
            this.orderId = str;
        }

        public final void setPrice(String str) {
            this.price = str;
        }

        public final void setPublicKey(String str) {
            this.publicKey = str;
        }

        public final void setPurchaseData(String str) {
            this.purchaseData = str;
        }

        public final void setPurchaseTimestamp(long j) {
            this.purchaseTimestamp = j;
        }

        public final void setPurchaseToken(String str) {
            this.purchaseToken = str;
        }

        public final void setSignature(String str) {
            this.signature = str;
        }

        public final void setSku(String str) {
            this.sku = str;
        }

        public final void setType(Type type2) {
            Intrinsics.checkNotNullParameter(type2, "<set-?>");
            this.type = type2;
        }

        public final Builder withAdditionalParams(Map<String, String> map) {
            Intrinsics.checkNotNullParameter(map, "additionalParameters");
            setAdditionalParameters(map);
            return this;
        }

        public final Builder withCurrency(String str) {
            setCurrency(str);
            return this;
        }

        public final Builder withDeveloperPayload(String str) {
            setDeveloperPayload(str);
            return this;
        }

        public final Builder withOrderId(String str) {
            setOrderId(str);
            return this;
        }

        public final Builder withPrice(String str) {
            setPrice(str);
            return this;
        }

        public final Builder withPublicKey(String str) {
            setPublicKey(str);
            return this;
        }

        public final Builder withPurchaseData(String str) {
            setPurchaseData(str);
            return this;
        }

        public final Builder withPurchaseTimestamp(long j) {
            setPurchaseTimestamp(j);
            return this;
        }

        public final Builder withPurchaseToken(String str) {
            setPurchaseToken(str);
            return this;
        }

        public final Builder withSignature(String str) {
            setSignature(str);
            return this;
        }

        public final Builder withSku(String str) {
            setSku(str);
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007J\b\u0010\b\u001a\u00020\u0004H\u0007¨\u0006\t"}, d2 = {"Lcom/appodeal/ads/inapp/InAppPurchase$Companion;", "", "()V", "newBuilder", "Lcom/appodeal/ads/inapp/InAppPurchase$Builder;", "type", "Lcom/appodeal/ads/inapp/InAppPurchase$Type;", "newInAppBuilder", "newSubscriptionBuilder", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Builder newBuilder(Type type) {
            Type type2 = type;
            Intrinsics.checkNotNullParameter(type2, "type");
            return new Builder(type2, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (Map) null, 4094, (DefaultConstructorMarker) null);
        }

        public final Builder newInAppBuilder() {
            return newBuilder(Type.InApp);
        }

        public final Builder newSubscriptionBuilder() {
            return newBuilder(Type.Subs);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/appodeal/ads/inapp/InAppPurchase$Type;", "", "(Ljava/lang/String;I)V", "InApp", "Subs", "apd_public"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public enum Type {
        InApp,
        Subs
    }

    private InAppPurchase(Type type2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, long j, Map<String, String> map) {
        this.type = type2;
        this.publicKey = str;
        this.signature = str2;
        this.purchaseData = str3;
        this.developerPayload = str4;
        this.price = str5;
        this.currency = str6;
        this.sku = str7;
        this.orderId = str8;
        this.purchaseToken = str9;
        this.purchaseTimestamp = j;
        this.additionalParameters = map;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ InAppPurchase(com.appodeal.ads.inapp.InAppPurchase.Type r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, long r28, java.util.Map r30, int r31, kotlin.jvm.internal.DefaultConstructorMarker r32) {
        /*
            r17 = this;
            r0 = r31
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x000a
            r1 = 0
            r14 = r1
            goto L_0x000c
        L_0x000a:
            r14 = r28
        L_0x000c:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0017
            java.util.Map r0 = kotlin.collections.MapsKt.emptyMap()
            r16 = r0
            goto L_0x0019
        L_0x0017:
            r16 = r30
        L_0x0019:
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            r12 = r26
            r13 = r27
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.inapp.InAppPurchase.<init>(com.appodeal.ads.inapp.InAppPurchase$Type, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public /* synthetic */ InAppPurchase(Type type2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, long j, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(type2, str, str2, str3, str4, str5, str6, str7, str8, str9, j, map);
    }

    public static final Builder newBuilder(Type type2) {
        return Companion.newBuilder(type2);
    }

    public static final Builder newInAppBuilder() {
        return Companion.newInAppBuilder();
    }

    public static final Builder newSubscriptionBuilder() {
        return Companion.newSubscriptionBuilder();
    }

    public final Map<String, String> getAdditionalParameters() {
        return this.additionalParameters;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getDeveloperPayload() {
        return this.developerPayload;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getPublicKey() {
        return this.publicKey;
    }

    public final String getPurchaseData() {
        return this.purchaseData;
    }

    public final long getPurchaseTimestamp() {
        return this.purchaseTimestamp;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final String getSku() {
        return this.sku;
    }

    public final Type getType() {
        return this.type;
    }

    public String toString() {
        return "price='" + this.price + "', currency='" + this.currency + '\'';
    }
}
