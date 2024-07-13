package com.appodeal.ads.networking;

import com.appodeal.ads.modules.libs.network.HttpError;
import kotlin.jvm.internal.Intrinsics;

public final class f {
    public static final LoadingError a(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        if (th instanceof HttpError.ConnectionError) {
            return LoadingError.ConnectionError;
        }
        if (th instanceof HttpError.TimeoutError) {
            return LoadingError.TimeoutError;
        }
        if (th instanceof HttpError.RequestError) {
            return LoadingError.RequestError;
        }
        if (!(th instanceof HttpError.InternalError)) {
            if (th instanceof HttpError.ServerError) {
                return LoadingError.ServerError;
            }
            if (th instanceof HttpError.AdapterNotFound) {
                return LoadingError.AdapterNotFound;
            }
            if (th instanceof HttpError.AdTypeNotSupportedInAdapter) {
                return LoadingError.AdTypeNotSupportedInAdapter;
            }
            if (th instanceof HttpError.Canceled) {
                return LoadingError.Canceled;
            }
            if (th instanceof HttpError.IncorrectAdUnit) {
                return LoadingError.IncorrectAdunit;
            }
            if (th instanceof HttpError.IncorrectCreative) {
                return LoadingError.IncorrectCreative;
            }
            if (th instanceof HttpError.InvalidAssets) {
                return LoadingError.InvalidAssets;
            }
            if (th instanceof HttpError.NoFill) {
                return LoadingError.NoFill;
            }
            if (th instanceof HttpError.RequestVerificationFailed) {
                return LoadingError.RequestVerificationFailed;
            }
            if (th instanceof HttpError.SdkVersionNotSupported) {
                return LoadingError.SdkVersionNotSupported;
            }
            if (th instanceof HttpError.ShowFailed) {
                return LoadingError.ShowFailed;
            }
        }
        return LoadingError.InternalError;
    }
}
