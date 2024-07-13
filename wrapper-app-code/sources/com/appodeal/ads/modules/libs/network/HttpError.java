package com.appodeal.ads.modules.libs.network;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0010\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001dR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0001\u0010\u001e\u001f !\"#$%&'()*+,-¨\u0006."}, d2 = {"Lcom/appodeal/ads/modules/libs/network/HttpError;", "", "", "getDescription", "()Ljava/lang/String;", "description", "", "getRawResponse", "()[B", "rawResponse", "", "getCode", "()I", "code", "AdTypeNotSupportedInAdapter", "AdapterNotFound", "Canceled", "ConnectionError", "IncorrectAdUnit", "IncorrectCreative", "InternalError", "InvalidAssets", "NoFill", "RequestError", "RequestVerificationFailed", "SdkVersionNotSupported", "ServerError", "ShowFailed", "TimeoutError", "UncaughtException", "Lcom/appodeal/ads/modules/libs/network/HttpError$NoFill;", "Lcom/appodeal/ads/modules/libs/network/HttpError$InternalError;", "Lcom/appodeal/ads/modules/libs/network/HttpError$TimeoutError;", "Lcom/appodeal/ads/modules/libs/network/HttpError$ConnectionError;", "Lcom/appodeal/ads/modules/libs/network/HttpError$RequestError;", "Lcom/appodeal/ads/modules/libs/network/HttpError$ServerError;", "Lcom/appodeal/ads/modules/libs/network/HttpError$RequestVerificationFailed;", "Lcom/appodeal/ads/modules/libs/network/HttpError$SdkVersionNotSupported;", "Lcom/appodeal/ads/modules/libs/network/HttpError$InvalidAssets;", "Lcom/appodeal/ads/modules/libs/network/HttpError$AdapterNotFound;", "Lcom/appodeal/ads/modules/libs/network/HttpError$AdTypeNotSupportedInAdapter;", "Lcom/appodeal/ads/modules/libs/network/HttpError$Canceled;", "Lcom/appodeal/ads/modules/libs/network/HttpError$IncorrectAdUnit;", "Lcom/appodeal/ads/modules/libs/network/HttpError$IncorrectCreative;", "Lcom/appodeal/ads/modules/libs/network/HttpError$ShowFailed;", "Lcom/appodeal/ads/modules/libs/network/HttpError$UncaughtException;", "apd_network"}, k = 1, mv = {1, 6, 0})
public abstract class HttpError extends Throwable {

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016XD¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016XD¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/appodeal/ads/modules/libs/network/HttpError$AdTypeNotSupportedInAdapter;", "Lcom/appodeal/ads/modules/libs/network/HttpError;", "", "a", "[B", "getRawResponse", "()[B", "rawResponse", "", "b", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "", "c", "I", "getCode", "()I", "code", "<init>", "([B)V", "apd_network"}, k = 1, mv = {1, 6, 0})
    public static final class AdTypeNotSupportedInAdapter extends HttpError {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f16723a;

        /* renamed from: b  reason: collision with root package name */
        public final String f16724b = "ad type not supported in adapter";

        /* renamed from: c  reason: collision with root package name */
        public final int f16725c = 9;

        public AdTypeNotSupportedInAdapter(byte[] bArr) {
            super((DefaultConstructorMarker) null);
            this.f16723a = bArr;
        }

        public int getCode() {
            return this.f16725c;
        }

        public String getDescription() {
            return this.f16724b;
        }

        public byte[] getRawResponse() {
            return this.f16723a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016XD¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016XD¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/appodeal/ads/modules/libs/network/HttpError$AdapterNotFound;", "Lcom/appodeal/ads/modules/libs/network/HttpError;", "", "a", "[B", "getRawResponse", "()[B", "rawResponse", "", "b", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "", "c", "I", "getCode", "()I", "code", "<init>", "([B)V", "apd_network"}, k = 1, mv = {1, 6, 0})
    public static final class AdapterNotFound extends HttpError {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f16726a;

        /* renamed from: b  reason: collision with root package name */
        public final String f16727b = "adapter not found";

        /* renamed from: c  reason: collision with root package name */
        public final int f16728c = 8;

        public AdapterNotFound(byte[] bArr) {
            super((DefaultConstructorMarker) null);
            this.f16726a = bArr;
        }

        public int getCode() {
            return this.f16728c;
        }

        public String getDescription() {
            return this.f16727b;
        }

        public byte[] getRawResponse() {
            return this.f16726a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016XD¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016XD¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/appodeal/ads/modules/libs/network/HttpError$Canceled;", "Lcom/appodeal/ads/modules/libs/network/HttpError;", "", "a", "[B", "getRawResponse", "()[B", "rawResponse", "", "b", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "", "c", "I", "getCode", "()I", "code", "<init>", "([B)V", "apd_network"}, k = 1, mv = {1, 6, 0})
    public static final class Canceled extends HttpError {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f16729a;

        /* renamed from: b  reason: collision with root package name */
        public final String f16730b = "ad request canceled";

        /* renamed from: c  reason: collision with root package name */
        public final int f16731c = 2;

        public Canceled(byte[] bArr) {
            super((DefaultConstructorMarker) null);
            this.f16729a = bArr;
        }

        public int getCode() {
            return this.f16731c;
        }

        public String getDescription() {
            return this.f16730b;
        }

        public byte[] getRawResponse() {
            return this.f16729a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016XD¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016XD¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/appodeal/ads/modules/libs/network/HttpError$ConnectionError;", "Lcom/appodeal/ads/modules/libs/network/HttpError;", "", "a", "[B", "getRawResponse", "()[B", "rawResponse", "", "b", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "", "c", "I", "getCode", "()I", "code", "<init>", "([B)V", "apd_network"}, k = 1, mv = {1, 6, 0})
    public static final class ConnectionError extends HttpError {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f16732a;

        /* renamed from: b  reason: collision with root package name */
        public final String f16733b = "connection error";

        /* renamed from: c  reason: collision with root package name */
        public final int f16734c = 4;

        public ConnectionError(byte[] bArr) {
            super((DefaultConstructorMarker) null);
            this.f16732a = bArr;
        }

        public int getCode() {
            return this.f16734c;
        }

        public String getDescription() {
            return this.f16733b;
        }

        public byte[] getRawResponse() {
            return this.f16732a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016XD¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016XD¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/appodeal/ads/modules/libs/network/HttpError$IncorrectAdUnit;", "Lcom/appodeal/ads/modules/libs/network/HttpError;", "", "a", "[B", "getRawResponse", "()[B", "rawResponse", "", "b", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "", "c", "I", "getCode", "()I", "code", "<init>", "([B)V", "apd_network"}, k = 1, mv = {1, 6, 0})
    public static final class IncorrectAdUnit extends HttpError {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f16735a;

        /* renamed from: b  reason: collision with root package name */
        public final String f16736b = "incorrect adunit";

        /* renamed from: c  reason: collision with root package name */
        public final int f16737c = 2;

        public IncorrectAdUnit(byte[] bArr) {
            super((DefaultConstructorMarker) null);
            this.f16735a = bArr;
        }

        public int getCode() {
            return this.f16737c;
        }

        public String getDescription() {
            return this.f16736b;
        }

        public byte[] getRawResponse() {
            return this.f16735a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016XD¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016XD¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/appodeal/ads/modules/libs/network/HttpError$IncorrectCreative;", "Lcom/appodeal/ads/modules/libs/network/HttpError;", "", "a", "[B", "getRawResponse", "()[B", "rawResponse", "", "b", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "", "c", "I", "getCode", "()I", "code", "<init>", "([B)V", "apd_network"}, k = 1, mv = {1, 6, 0})
    public static final class IncorrectCreative extends HttpError {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f16738a;

        /* renamed from: b  reason: collision with root package name */
        public final String f16739b = "incorrect creative";

        /* renamed from: c  reason: collision with root package name */
        public final int f16740c = 4;

        public IncorrectCreative(byte[] bArr) {
            super((DefaultConstructorMarker) null);
            this.f16738a = bArr;
        }

        public int getCode() {
            return this.f16740c;
        }

        public String getDescription() {
            return this.f16739b;
        }

        public byte[] getRawResponse() {
            return this.f16738a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016XD¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016XD¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/appodeal/ads/modules/libs/network/HttpError$InternalError;", "Lcom/appodeal/ads/modules/libs/network/HttpError;", "", "a", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "", "b", "I", "getCode", "()I", "code", "", "rawResponse", "[B", "getRawResponse", "()[B", "apd_network"}, k = 1, mv = {1, 6, 0})
    public static final class InternalError extends HttpError {
        public static final InternalError INSTANCE = new InternalError();

        /* renamed from: a  reason: collision with root package name */
        public static final String f16741a = "internal error";

        /* renamed from: b  reason: collision with root package name */
        public static final int f16742b = 4;

        public InternalError() {
            super((DefaultConstructorMarker) null);
        }

        public int getCode() {
            return f16742b;
        }

        public String getDescription() {
            return f16741a;
        }

        public byte[] getRawResponse() {
            return null;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016XD¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016XD¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/appodeal/ads/modules/libs/network/HttpError$InvalidAssets;", "Lcom/appodeal/ads/modules/libs/network/HttpError;", "", "a", "[B", "getRawResponse", "()[B", "rawResponse", "", "b", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "", "c", "I", "getCode", "()I", "code", "<init>", "([B)V", "apd_network"}, k = 1, mv = {1, 6, 0})
    public static final class InvalidAssets extends HttpError {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f16743a;

        /* renamed from: b  reason: collision with root package name */
        public final String f16744b = "invalid assets";

        /* renamed from: c  reason: collision with root package name */
        public final int f16745c = 7;

        public InvalidAssets(byte[] bArr) {
            super((DefaultConstructorMarker) null);
            this.f16743a = bArr;
        }

        public int getCode() {
            return this.f16745c;
        }

        public String getDescription() {
            return this.f16744b;
        }

        public byte[] getRawResponse() {
            return this.f16743a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016XD¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016XD¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/appodeal/ads/modules/libs/network/HttpError$NoFill;", "Lcom/appodeal/ads/modules/libs/network/HttpError;", "", "a", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "", "b", "I", "getCode", "()I", "code", "", "rawResponse", "[B", "getRawResponse", "()[B", "apd_network"}, k = 1, mv = {1, 6, 0})
    public static final class NoFill extends HttpError {
        public static final NoFill INSTANCE = new NoFill();

        /* renamed from: a  reason: collision with root package name */
        public static final String f16746a = "no fill";

        /* renamed from: b  reason: collision with root package name */
        public static final int f16747b = 2;

        public NoFill() {
            super((DefaultConstructorMarker) null);
        }

        public int getCode() {
            return f16747b;
        }

        public String getDescription() {
            return f16746a;
        }

        public byte[] getRawResponse() {
            return null;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016XD¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016XD¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/appodeal/ads/modules/libs/network/HttpError$RequestError;", "Lcom/appodeal/ads/modules/libs/network/HttpError;", "", "a", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "", "b", "I", "getCode", "()I", "code", "", "rawResponse", "[B", "getRawResponse", "()[B", "apd_network"}, k = 1, mv = {1, 6, 0})
    public static final class RequestError extends HttpError {
        public static final RequestError INSTANCE = new RequestError();

        /* renamed from: a  reason: collision with root package name */
        public static final String f16748a = "request error";

        /* renamed from: b  reason: collision with root package name */
        public static final int f16749b = 4;

        public RequestError() {
            super((DefaultConstructorMarker) null);
        }

        public int getCode() {
            return f16749b;
        }

        public String getDescription() {
            return f16748a;
        }

        public byte[] getRawResponse() {
            return null;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016XD¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016XD¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/appodeal/ads/modules/libs/network/HttpError$RequestVerificationFailed;", "Lcom/appodeal/ads/modules/libs/network/HttpError;", "", "a", "[B", "getRawResponse", "()[B", "rawResponse", "", "b", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "", "c", "I", "getCode", "()I", "code", "<init>", "([B)V", "apd_network"}, k = 1, mv = {1, 6, 0})
    public static final class RequestVerificationFailed extends HttpError {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f16750a;

        /* renamed from: b  reason: collision with root package name */
        public final String f16751b = "request verification failed";

        /* renamed from: c  reason: collision with root package name */
        public final int f16752c = 4;

        public RequestVerificationFailed(byte[] bArr) {
            super((DefaultConstructorMarker) null);
            this.f16750a = bArr;
        }

        public int getCode() {
            return this.f16752c;
        }

        public String getDescription() {
            return this.f16751b;
        }

        public byte[] getRawResponse() {
            return this.f16750a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016XD¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016XD¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/appodeal/ads/modules/libs/network/HttpError$SdkVersionNotSupported;", "Lcom/appodeal/ads/modules/libs/network/HttpError;", "", "a", "[B", "getRawResponse", "()[B", "rawResponse", "", "b", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "", "c", "I", "getCode", "()I", "code", "<init>", "([B)V", "apd_network"}, k = 1, mv = {1, 6, 0})
    public static final class SdkVersionNotSupported extends HttpError {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f16753a;

        /* renamed from: b  reason: collision with root package name */
        public final String f16754b = "sdk version not supported";

        /* renamed from: c  reason: collision with root package name */
        public final int f16755c = 4;

        public SdkVersionNotSupported(byte[] bArr) {
            super((DefaultConstructorMarker) null);
            this.f16753a = bArr;
        }

        public int getCode() {
            return this.f16755c;
        }

        public String getDescription() {
            return this.f16754b;
        }

        public byte[] getRawResponse() {
            return this.f16753a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016XD¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016XD¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/appodeal/ads/modules/libs/network/HttpError$ServerError;", "Lcom/appodeal/ads/modules/libs/network/HttpError;", "", "a", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "", "b", "I", "getCode", "()I", "code", "", "rawResponse", "[B", "getRawResponse", "()[B", "apd_network"}, k = 1, mv = {1, 6, 0})
    public static final class ServerError extends HttpError {
        public static final ServerError INSTANCE = new ServerError();

        /* renamed from: a  reason: collision with root package name */
        public static final String f16756a = "server error";

        /* renamed from: b  reason: collision with root package name */
        public static final int f16757b = 4;

        public ServerError() {
            super((DefaultConstructorMarker) null);
        }

        public int getCode() {
            return f16757b;
        }

        public String getDescription() {
            return f16756a;
        }

        public byte[] getRawResponse() {
            return null;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016XD¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016XD¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/appodeal/ads/modules/libs/network/HttpError$ShowFailed;", "Lcom/appodeal/ads/modules/libs/network/HttpError;", "", "a", "[B", "getRawResponse", "()[B", "rawResponse", "", "b", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "", "c", "I", "getCode", "()I", "code", "<init>", "([B)V", "apd_network"}, k = 1, mv = {1, 6, 0})
    public static final class ShowFailed extends HttpError {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f16758a;

        /* renamed from: b  reason: collision with root package name */
        public final String f16759b = "show failed";

        /* renamed from: c  reason: collision with root package name */
        public final int f16760c = 4;

        public ShowFailed(byte[] bArr) {
            super((DefaultConstructorMarker) null);
            this.f16758a = bArr;
        }

        public int getCode() {
            return this.f16760c;
        }

        public String getDescription() {
            return this.f16759b;
        }

        public byte[] getRawResponse() {
            return this.f16758a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016XD¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016XD¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/appodeal/ads/modules/libs/network/HttpError$TimeoutError;", "Lcom/appodeal/ads/modules/libs/network/HttpError;", "", "a", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "", "b", "I", "getCode", "()I", "code", "", "rawResponse", "[B", "getRawResponse", "()[B", "apd_network"}, k = 1, mv = {1, 6, 0})
    public static final class TimeoutError extends HttpError {
        public static final TimeoutError INSTANCE = new TimeoutError();

        /* renamed from: a  reason: collision with root package name */
        public static final String f16761a = "timeout error";

        /* renamed from: b  reason: collision with root package name */
        public static final int f16762b = 3;

        public TimeoutError() {
            super((DefaultConstructorMarker) null);
        }

        public int getCode() {
            return f16762b;
        }

        public String getDescription() {
            return f16761a;
        }

        public byte[] getRawResponse() {
            return null;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016XD¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016XD¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/appodeal/ads/modules/libs/network/HttpError$UncaughtException;", "Lcom/appodeal/ads/modules/libs/network/HttpError;", "", "a", "Ljava/lang/Throwable;", "getError", "()Ljava/lang/Throwable;", "error", "", "b", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "", "c", "I", "getCode", "()I", "code", "", "rawResponse", "[B", "getRawResponse", "()[B", "<init>", "(Ljava/lang/Throwable;)V", "apd_network"}, k = 1, mv = {1, 6, 0})
    public static final class UncaughtException extends HttpError {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f16763a;

        /* renamed from: b  reason: collision with root package name */
        public final String f16764b = "";

        /* renamed from: c  reason: collision with root package name */
        public final int f16765c = -1;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public UncaughtException(Throwable th) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(th, "error");
            this.f16763a = th;
        }

        public int getCode() {
            return this.f16765c;
        }

        public String getDescription() {
            return this.f16764b;
        }

        public final Throwable getError() {
            return this.f16763a;
        }

        public byte[] getRawResponse() {
            return null;
        }
    }

    public HttpError() {
    }

    public /* synthetic */ HttpError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int getCode();

    public abstract String getDescription();

    public abstract byte[] getRawResponse();
}
