package com.yandex.metrica.networktasks.api;

import com.yandex.metrica.networktasks.api.DefaultResponseParser;

public class DefaultNetworkResponseHandler implements NetworkResponseHandler {

    /* renamed from: a  reason: collision with root package name */
    private final DefaultResponseParser f7293a;

    public DefaultNetworkResponseHandler() {
        this(new DefaultResponseParser());
    }

    DefaultNetworkResponseHandler(DefaultResponseParser defaultResponseParser) {
        this.f7293a = defaultResponseParser;
    }

    public DefaultResponseParser.Response handle(ResponseDataHolder responseDataHolder) {
        if (200 == responseDataHolder.getResponseCode()) {
            return this.f7293a.parse(responseDataHolder.getResponseData());
        }
        return null;
    }
}
