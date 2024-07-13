package com.appsgeyser.sdk.utils;

import java.net.URI;
import java.net.URISyntaxException;

public abstract class EndpointGetter {
    public static String getUrlWithoutArguments(String str) {
        try {
            URI uri = new URI(str);
            return new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), (String) null, uri.getFragment()).toString();
        } catch (URISyntaxException e2) {
            e2.printStackTrace();
            return str;
        }
    }
}
