package com.appodeal.ads.unified.tasks;

import com.appodeal.ads.networking.LoadingError;

public interface AdParamsProcessorCallback<ResponseType> {
    void onProcessFail(LoadingError loadingError);

    void onProcessSuccess(ResponseType responsetype);
}
