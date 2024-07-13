package com.unity3d.services.ads.token;

import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.reader.DeviceInfoReaderBuilder;
import com.unity3d.services.core.device.reader.GameSessionIdReader;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONException;

public class TokenStorage {
    private static TokenStorage _instance;
    private int _accessCounter = 0;
    private final ExecutorService _executorService = Executors.newSingleThreadExecutor();
    private String _initToken = null;
    private final Object _lock = new Object();
    private boolean _peekMode = false;
    private ConcurrentLinkedQueue<String> _queue;

    public static TokenStorage getInstance() {
        if (_instance == null) {
            _instance = new TokenStorage();
        }
        return _instance;
    }

    private TokenStorage() {
    }

    public void createTokens(JSONArray jSONArray) throws JSONException {
        boolean z;
        synchronized (this._lock) {
            this._queue = new ConcurrentLinkedQueue<>();
            this._accessCounter = 0;
            for (int i = 0; i < jSONArray.length(); i++) {
                this._queue.add(jSONArray.getString(i));
            }
            z = !this._queue.isEmpty();
        }
        if (z) {
            triggerTokenAvailable(false);
            AsyncTokenStorage.getInstance().onTokenAvailable();
        }
    }

    public void appendTokens(JSONArray jSONArray) throws JSONException {
        boolean z;
        synchronized (this._lock) {
            if (this._queue == null) {
                this._queue = new ConcurrentLinkedQueue<>();
                this._accessCounter = 0;
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                this._queue.add(jSONArray.getString(i));
            }
            z = !this._queue.isEmpty();
        }
        if (z) {
            triggerTokenAvailable(false);
            AsyncTokenStorage.getInstance().onTokenAvailable();
        }
    }

    public void deleteTokens() {
        synchronized (this._lock) {
            this._queue = null;
            this._accessCounter = 0;
        }
    }

    public String getToken() {
        synchronized (this._lock) {
            if (this._queue == null) {
                String str = this._initToken;
                return str;
            } else if (this._queue.isEmpty()) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.TOKEN, TokenEvent.QUEUE_EMPTY, new Object[0]);
                return null;
            } else if (this._peekMode) {
                WebViewApp currentApp = WebViewApp.getCurrentApp();
                WebViewEventCategory webViewEventCategory = WebViewEventCategory.TOKEN;
                TokenEvent tokenEvent = TokenEvent.TOKEN_ACCESS;
                int i = this._accessCounter;
                this._accessCounter = i + 1;
                currentApp.sendEvent(webViewEventCategory, tokenEvent, Integer.valueOf(i));
                String peek = this._queue.peek();
                return peek;
            } else {
                WebViewApp currentApp2 = WebViewApp.getCurrentApp();
                WebViewEventCategory webViewEventCategory2 = WebViewEventCategory.TOKEN;
                TokenEvent tokenEvent2 = TokenEvent.TOKEN_ACCESS;
                int i2 = this._accessCounter;
                this._accessCounter = i2 + 1;
                currentApp2.sendEvent(webViewEventCategory2, tokenEvent2, Integer.valueOf(i2));
                String poll = this._queue.poll();
                return poll;
            }
        }
    }

    public void setPeekMode(boolean z) {
        synchronized (this._lock) {
            this._peekMode = z;
        }
    }

    public void getNativeGeneratedToken() {
        new NativeTokenGenerator(this._executorService, new DeviceInfoReaderBuilder(new ConfigurationReader(), PrivacyConfigStorage.getInstance(), GameSessionIdReader.getInstance()), (String) null).generateToken(new INativeTokenGeneratorListener() {
            public void onReady(String str) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.TOKEN, TokenEvent.TOKEN_NATIVE_DATA, str);
            }
        });
    }

    public void setInitToken(String str) {
        boolean z;
        synchronized (this._lock) {
            this._initToken = str;
            z = str != null;
        }
        if (z) {
            triggerTokenAvailable(true);
            AsyncTokenStorage.getInstance().onTokenAvailable();
        }
    }

    private void triggerTokenAvailable(Boolean bool) {
        InitializeEventsMetricSender.getInstance().sdkTokenDidBecomeAvailableWithConfig(bool.booleanValue());
    }
}
