package com.unity3d.services.ads.api;

import com.unity3d.services.ads.token.TokenError;
import com.unity3d.services.ads.token.TokenStorage;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import org.json.JSONArray;
import org.json.JSONException;

public class Token {
    @WebViewExposed
    public static void createTokens(JSONArray jSONArray, WebViewCallback webViewCallback) {
        try {
            TokenStorage.getInstance().createTokens(jSONArray);
            webViewCallback.invoke(new Object[0]);
        } catch (JSONException e2) {
            webViewCallback.error(TokenError.JSON_EXCEPTION, e2.getMessage());
        }
    }

    @WebViewExposed
    public static void appendTokens(JSONArray jSONArray, WebViewCallback webViewCallback) {
        try {
            TokenStorage.getInstance().appendTokens(jSONArray);
            webViewCallback.invoke(new Object[0]);
        } catch (JSONException e2) {
            webViewCallback.error(TokenError.JSON_EXCEPTION, e2.getMessage());
        }
    }

    @WebViewExposed
    public static void deleteTokens(WebViewCallback webViewCallback) {
        TokenStorage.getInstance().deleteTokens();
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void setPeekMode(Boolean bool, WebViewCallback webViewCallback) {
        TokenStorage.getInstance().setPeekMode(bool.booleanValue());
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void getNativeGeneratedToken(WebViewCallback webViewCallback) {
        TokenStorage.getInstance().getNativeGeneratedToken();
        webViewCallback.invoke(new Object[0]);
    }
}
