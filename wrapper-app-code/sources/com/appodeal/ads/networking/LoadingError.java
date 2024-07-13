package com.appodeal.ads.networking;

import com.appodeal.ads.e0;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0016\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b ¨\u0006!"}, d2 = {"Lcom/appodeal/ads/networking/LoadingError;", "", "", "toString", "description", "Ljava/lang/String;", "Lcom/appodeal/ads/e0;", "requestResult", "Lcom/appodeal/ads/e0;", "getRequestResult", "()Lcom/appodeal/ads/e0;", "", "code", "I", "getCode", "()I", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lcom/appodeal/ads/e0;I)V", "NoFill", "InternalError", "TimeoutError", "ConnectionError", "RequestError", "ServerError", "RequestVerificationFailed", "SdkVersionNotSupported", "InvalidAssets", "AdapterNotFound", "AdTypeNotSupportedInAdapter", "Canceled", "IncorrectAdunit", "IncorrectCreative", "ShowFailed", "apd_core"}, k = 1, mv = {1, 6, 0})
public enum LoadingError {
    NoFill("no fill", e0.NoFill, 2),
    InternalError("internal error", r13, 4),
    TimeoutError("timeout error", e0.TimeOutReached, 3),
    ConnectionError("connection error", r5, 4),
    RequestError("request error", r5, 4),
    ServerError("server error", r5, 4),
    RequestVerificationFailed("request verification failed", r5, 4),
    SdkVersionNotSupported("sdk version not supported", r5, 4),
    InvalidAssets("invalid assets", e0.InvalidAssets, 7),
    AdapterNotFound("adapter not found", e0.UndefinedAdapter, 8),
    AdTypeNotSupportedInAdapter("ad type not supported in adapter", r5, 9),
    Canceled("ad request canceled", e0.Canceled, 2),
    IncorrectAdunit("incorrect adunit", r5, 2),
    IncorrectCreative("incorrect creative", e0.IncorrectCreative, 4),
    ShowFailed("show failed", r13, 4);
    
    private final int code;
    private final String description;
    private final e0 requestResult;

    private LoadingError(String str, e0 e0Var, int i) {
        this.description = str;
        this.requestResult = e0Var;
        this.code = i;
    }

    public final int getCode() {
        return this.code;
    }

    public final e0 getRequestResult() {
        return this.requestResult;
    }

    public String toString() {
        return this.description;
    }
}
