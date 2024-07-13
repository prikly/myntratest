package com.appodeal.ads.unified.tasks;

import java.net.URLConnection;

public interface AdResponseProcessor<ResponseType> {
    void processResponse(URLConnection uRLConnection, String str, AdParamsProcessorCallback<ResponseType> adParamsProcessorCallback);
}
