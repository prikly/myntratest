package com.onesignal;

import android.app.Activity;
import android.graphics.Paint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.onesignal.ActivityLifecycleHandler;
import com.onesignal.InAppMessageView;
import com.onesignal.OneSignal;
import com.onesignal.outcomes.OSOutcomeConstants;
import io.bidmachine.utils.IabUtils;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

class WebViewManager extends ActivityLifecycleHandler.ActivityAvailableListener {
    private static final int IN_APP_MESSAGE_INIT_DELAY = 200;
    private static final int MARGIN_PX_SIZE = OSViewUtils.dpToPx(24);
    private static final String TAG = WebViewManager.class.getCanonicalName();
    protected static WebViewManager lastInstance = null;
    /* access modifiers changed from: private */
    public Activity activity;
    /* access modifiers changed from: private */
    public boolean closing = false;
    private String currentActivityName = null;
    /* access modifiers changed from: private */
    public boolean dismissFired = false;
    private Integer lastPageHeight = null;
    /* access modifiers changed from: private */
    public OSInAppMessageInternal message;
    /* access modifiers changed from: private */
    public OSInAppMessageContent messageContent;
    /* access modifiers changed from: private */
    public InAppMessageView messageView;
    private final Object messageViewSyncLock = new Object() {
    };
    /* access modifiers changed from: private */
    public OSWebView webView;

    interface OneSignalGenericCallback {
        void onComplete();
    }

    /* renamed from: com.onesignal.WebViewManager$10  reason: invalid class name */
    static /* synthetic */ class AnonymousClass10 {
        static final /* synthetic */ int[] $SwitchMap$com$onesignal$WebViewManager$Position;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.onesignal.WebViewManager$Position[] r0 = com.onesignal.WebViewManager.Position.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$onesignal$WebViewManager$Position = r0
                com.onesignal.WebViewManager$Position r1 = com.onesignal.WebViewManager.Position.TOP_BANNER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$onesignal$WebViewManager$Position     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onesignal.WebViewManager$Position r1 = com.onesignal.WebViewManager.Position.BOTTOM_BANNER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.WebViewManager.AnonymousClass10.<clinit>():void");
        }
    }

    enum Position {
        TOP_BANNER,
        BOTTOM_BANNER,
        CENTER_MODAL,
        FULL_SCREEN;

        /* access modifiers changed from: package-private */
        public boolean isBanner() {
            int i = AnonymousClass10.$SwitchMap$com$onesignal$WebViewManager$Position[ordinal()];
            return i == 1 || i == 2;
        }
    }

    protected WebViewManager(OSInAppMessageInternal oSInAppMessageInternal, Activity activity2, OSInAppMessageContent oSInAppMessageContent) {
        this.message = oSInAppMessageInternal;
        this.activity = activity2;
        this.messageContent = oSInAppMessageContent;
    }

    static void showMessageContent(final OSInAppMessageInternal oSInAppMessageInternal, final OSInAppMessageContent oSInAppMessageContent) {
        final Activity currentActivity = OneSignal.getCurrentActivity();
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        OneSignal.onesignalLog(log_level, "in app message showMessageContent on currentActivity: " + currentActivity);
        if (currentActivity == null) {
            Looper.prepare();
            new Handler().postDelayed(new Runnable() {
                public void run() {
                    WebViewManager.showMessageContent(OSInAppMessageInternal.this, oSInAppMessageContent);
                }
            }, 200);
        } else if (lastInstance == null || !oSInAppMessageInternal.isPreview) {
            initInAppMessage(currentActivity, oSInAppMessageInternal, oSInAppMessageContent);
        } else {
            lastInstance.dismissAndAwaitNextMessage(new OneSignalGenericCallback() {
                public void onComplete() {
                    WebViewManager.lastInstance = null;
                    WebViewManager.initInAppMessage(currentActivity, oSInAppMessageInternal, oSInAppMessageContent);
                }
            });
        }
    }

    static void dismissCurrentInAppMessage() {
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        OneSignal.onesignalLog(log_level, "WebViewManager IAM dismissAndAwaitNextMessage lastInstance: " + lastInstance);
        WebViewManager webViewManager = lastInstance;
        if (webViewManager != null) {
            webViewManager.dismissAndAwaitNextMessage((OneSignalGenericCallback) null);
        }
    }

    private static void setContentSafeAreaInsets(OSInAppMessageContent oSInAppMessageContent, Activity activity2) {
        String contentHtml = oSInAppMessageContent.getContentHtml();
        int[] cutoutAndStatusBarInsets = OSViewUtils.getCutoutAndStatusBarInsets(activity2);
        String format = String.format("\n\n<script>\n    setSafeAreaInsets(%s);\n</script>", new Object[]{String.format("{\n   top: %d,\n   bottom: %d,\n   right: %d,\n   left: %d,\n}", new Object[]{Integer.valueOf(cutoutAndStatusBarInsets[0]), Integer.valueOf(cutoutAndStatusBarInsets[1]), Integer.valueOf(cutoutAndStatusBarInsets[2]), Integer.valueOf(cutoutAndStatusBarInsets[3])})});
        oSInAppMessageContent.setContentHtml(contentHtml + format);
    }

    /* access modifiers changed from: private */
    public static void initInAppMessage(final Activity activity2, OSInAppMessageInternal oSInAppMessageInternal, final OSInAppMessageContent oSInAppMessageContent) {
        if (oSInAppMessageContent.isFullBleed()) {
            setContentSafeAreaInsets(oSInAppMessageContent, activity2);
        }
        try {
            final String encodeToString = Base64.encodeToString(oSInAppMessageContent.getContentHtml().getBytes("UTF-8"), 2);
            WebViewManager webViewManager = new WebViewManager(oSInAppMessageInternal, activity2, oSInAppMessageContent);
            lastInstance = webViewManager;
            OSUtils.runOnMainUIThread(new Runnable() {
                public void run() {
                    try {
                        WebViewManager.this.setupWebView(activity2, encodeToString, oSInAppMessageContent.isFullBleed());
                    } catch (Exception e2) {
                        if (e2.getMessage() == null || !e2.getMessage().contains("No WebView installed")) {
                            throw e2;
                        }
                        OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Error setting up WebView: ", e2);
                    }
                }
            });
        } catch (UnsupportedEncodingException e2) {
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Catch on initInAppMessage: ", e2);
            e2.printStackTrace();
        }
    }

    class OSJavaScriptInterface {
        static final String EVENT_TYPE_ACTION_TAKEN = "action_taken";
        static final String EVENT_TYPE_KEY = "type";
        static final String EVENT_TYPE_PAGE_CHANGE = "page_change";
        static final String EVENT_TYPE_RENDERING_COMPLETE = "rendering_complete";
        static final String EVENT_TYPE_RESIZE = "resize";
        static final String GET_PAGE_META_DATA_JS_FUNCTION = "getPageMetaData()";
        static final String IAM_DISPLAY_LOCATION_KEY = "displayLocation";
        static final String IAM_DRAG_TO_DISMISS_DISABLED_KEY = "dragToDismissDisabled";
        static final String IAM_PAGE_META_DATA_KEY = "pageMetaData";
        static final String JS_OBJ_NAME = "OSAndroid";
        static final String SAFE_AREA_JS_OBJECT = "{\n   top: %d,\n   bottom: %d,\n   right: %d,\n   left: %d,\n}";
        static final String SET_SAFE_AREA_INSETS_JS_FUNCTION = "setSafeAreaInsets(%s)";
        static final String SET_SAFE_AREA_INSETS_SCRIPT = "\n\n<script>\n    setSafeAreaInsets(%s);\n</script>";

        OSJavaScriptInterface() {
        }

        @JavascriptInterface
        public void postMessage(String str) {
            try {
                OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
                OneSignal.onesignalLog(log_level, "OSJavaScriptInterface:postMessage: " + str);
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString(EVENT_TYPE_KEY);
                char c2 = 65535;
                switch (string.hashCode()) {
                    case -1484226720:
                        if (string.equals(EVENT_TYPE_PAGE_CHANGE)) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case -934437708:
                        if (string.equals(EVENT_TYPE_RESIZE)) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 42998156:
                        if (string.equals(EVENT_TYPE_RENDERING_COMPLETE)) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case 1851145598:
                        if (string.equals(EVENT_TYPE_ACTION_TAKEN)) {
                            c2 = 1;
                            break;
                        }
                        break;
                }
                if (c2 == 0) {
                    handleRenderComplete(jSONObject);
                } else if (c2 != 1) {
                    if (c2 == 3) {
                        handlePageChange(jSONObject);
                    }
                } else if (!WebViewManager.this.messageView.isDragging()) {
                    handleActionTaken(jSONObject);
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }

        private void handleRenderComplete(JSONObject jSONObject) {
            Position displayLocation = getDisplayLocation(jSONObject);
            int pageHeightData = displayLocation == Position.FULL_SCREEN ? -1 : getPageHeightData(jSONObject);
            boolean dragToDismissDisabled = getDragToDismissDisabled(jSONObject);
            WebViewManager.this.messageContent.setDisplayLocation(displayLocation);
            WebViewManager.this.messageContent.setPageHeight(pageHeightData);
            WebViewManager.this.createNewInAppMessageView(dragToDismissDisabled);
        }

        private int getPageHeightData(JSONObject jSONObject) {
            try {
                return WebViewManager.this.pageRectToViewHeight(WebViewManager.this.activity, jSONObject.getJSONObject(IAM_PAGE_META_DATA_KEY));
            } catch (JSONException unused) {
                return -1;
            }
        }

        private Position getDisplayLocation(JSONObject jSONObject) {
            Position position = Position.FULL_SCREEN;
            try {
                if (!jSONObject.has(IAM_DISPLAY_LOCATION_KEY) || jSONObject.get(IAM_DISPLAY_LOCATION_KEY).equals("")) {
                    return position;
                }
                return Position.valueOf(jSONObject.optString(IAM_DISPLAY_LOCATION_KEY, "FULL_SCREEN").toUpperCase());
            } catch (JSONException e2) {
                e2.printStackTrace();
                return position;
            }
        }

        private boolean getDragToDismissDisabled(JSONObject jSONObject) {
            try {
                return jSONObject.getBoolean(IAM_DRAG_TO_DISMISS_DISABLED_KEY);
            } catch (JSONException unused) {
                return false;
            }
        }

        private void handleActionTaken(JSONObject jSONObject) throws JSONException {
            JSONObject jSONObject2 = jSONObject.getJSONObject("body");
            String optString = jSONObject2.optString(OSOutcomeConstants.OUTCOME_ID, (String) null);
            boolean unused = WebViewManager.this.closing = jSONObject2.getBoolean("close");
            if (WebViewManager.this.message.isPreview) {
                OneSignal.getInAppMessageController().onMessageActionOccurredOnPreview(WebViewManager.this.message, jSONObject2);
            } else if (optString != null) {
                OneSignal.getInAppMessageController().onMessageActionOccurredOnMessage(WebViewManager.this.message, jSONObject2);
            }
            if (WebViewManager.this.closing) {
                WebViewManager.this.dismissAndAwaitNextMessage((OneSignalGenericCallback) null);
            }
        }

        private void handlePageChange(JSONObject jSONObject) throws JSONException {
            OneSignal.getInAppMessageController().onPageChanged(WebViewManager.this.message, jSONObject);
        }
    }

    /* access modifiers changed from: private */
    public int pageRectToViewHeight(Activity activity2, JSONObject jSONObject) {
        try {
            int dpToPx = OSViewUtils.dpToPx(jSONObject.getJSONObject("rect").getInt(IabUtils.KEY_HEIGHT));
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
            OneSignal.onesignalLog(log_level, "getPageHeightData:pxHeight: " + dpToPx);
            int webViewMaxSizeY = getWebViewMaxSizeY(activity2);
            if (dpToPx <= webViewMaxSizeY) {
                return dpToPx;
            }
            OneSignal.LOG_LEVEL log_level2 = OneSignal.LOG_LEVEL.DEBUG;
            OneSignal.Log(log_level2, "getPageHeightData:pxHeight is over screen max: " + webViewMaxSizeY);
            return webViewMaxSizeY;
        } catch (JSONException e2) {
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "pageRectToViewHeight could not get page height", e2);
            return -1;
        }
    }

    /* access modifiers changed from: private */
    public void updateSafeAreaInsets() {
        OSUtils.runOnMainUIThread(new Runnable() {
            public void run() {
                int[] cutoutAndStatusBarInsets = OSViewUtils.getCutoutAndStatusBarInsets(WebViewManager.this.activity);
                WebViewManager.this.webView.evaluateJavascript(String.format("setSafeAreaInsets(%s)", new Object[]{String.format("{\n   top: %d,\n   bottom: %d,\n   right: %d,\n   left: %d,\n}", new Object[]{Integer.valueOf(cutoutAndStatusBarInsets[0]), Integer.valueOf(cutoutAndStatusBarInsets[1]), Integer.valueOf(cutoutAndStatusBarInsets[2]), Integer.valueOf(cutoutAndStatusBarInsets[3])})}), (ValueCallback) null);
            }
        });
    }

    private void calculateHeightAndShowWebViewAfterNewActivity() {
        InAppMessageView inAppMessageView = this.messageView;
        if (inAppMessageView != null) {
            if (inAppMessageView.getDisplayPosition() != Position.FULL_SCREEN || this.messageContent.isFullBleed()) {
                OneSignal.Log(OneSignal.LOG_LEVEL.DEBUG, "In app message new activity, calculate height and show ");
                OSViewUtils.decorViewReady(this.activity, new Runnable() {
                    public void run() {
                        WebViewManager webViewManager = WebViewManager.this;
                        webViewManager.setWebViewToMaxSize(webViewManager.activity);
                        if (WebViewManager.this.messageContent.isFullBleed()) {
                            WebViewManager.this.updateSafeAreaInsets();
                        }
                        WebViewManager.this.webView.evaluateJavascript("getPageMetaData()", new ValueCallback<String>() {
                            public void onReceiveValue(String str) {
                                try {
                                    WebViewManager.this.showMessageView(Integer.valueOf(WebViewManager.this.pageRectToViewHeight(WebViewManager.this.activity, new JSONObject(str))));
                                } catch (JSONException e2) {
                                    e2.printStackTrace();
                                }
                            }
                        });
                    }
                });
                return;
            }
            showMessageView((Integer) null);
        }
    }

    /* access modifiers changed from: package-private */
    public void available(Activity activity2) {
        String str = this.currentActivityName;
        this.activity = activity2;
        this.currentActivityName = activity2.getLocalClassName();
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        OneSignal.Log(log_level, "In app message activity available currentActivityName: " + this.currentActivityName + " lastActivityName: " + str);
        if (str == null) {
            showMessageView((Integer) null);
        } else if (str.equals(this.currentActivityName)) {
            calculateHeightAndShowWebViewAfterNewActivity();
        } else if (!this.closing) {
            InAppMessageView inAppMessageView = this.messageView;
            if (inAppMessageView != null) {
                inAppMessageView.removeAllViews();
            }
            showMessageView(this.lastPageHeight);
        }
    }

    /* access modifiers changed from: package-private */
    public void stopped(Activity activity2) {
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        OneSignal.Log(log_level, "In app message activity stopped, cleaning views, currentActivityName: " + this.currentActivityName + "\nactivity: " + this.activity + "\nmessageView: " + this.messageView);
        if (this.messageView != null && activity2.getLocalClassName().equals(this.currentActivityName)) {
            this.messageView.removeAllViews();
        }
    }

    /* access modifiers changed from: private */
    public void showMessageView(Integer num) {
        synchronized (this.messageViewSyncLock) {
            if (this.messageView == null) {
                OneSignal.Log(OneSignal.LOG_LEVEL.WARN, "No messageView found to update a with a new height.");
                return;
            }
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
            OneSignal.Log(log_level, "In app message, showing first one with height: " + num);
            this.messageView.setWebView(this.webView);
            if (num != null) {
                this.lastPageHeight = num;
                this.messageView.updateHeight(num.intValue());
            }
            this.messageView.showView(this.activity);
            this.messageView.checkIfShouldDismiss();
        }
    }

    /* access modifiers changed from: private */
    public void setupWebView(final Activity activity2, final String str, boolean z) {
        enableWebViewRemoteDebugging();
        OSWebView oSWebView = new OSWebView(activity2);
        this.webView = oSWebView;
        oSWebView.setOverScrollMode(2);
        this.webView.setVerticalScrollBarEnabled(false);
        this.webView.setHorizontalScrollBarEnabled(false);
        this.webView.getSettings().setJavaScriptEnabled(true);
        this.webView.addJavascriptInterface(new OSJavaScriptInterface(), "OSAndroid");
        if (z) {
            this.webView.setSystemUiVisibility(3074);
            if (Build.VERSION.SDK_INT >= 30) {
                this.webView.setFitsSystemWindows(false);
            }
        }
        blurryRenderingWebViewForKitKatWorkAround(this.webView);
        OSViewUtils.decorViewReady(activity2, new Runnable() {
            public void run() {
                WebViewManager.this.setWebViewToMaxSize(activity2);
                WebViewManager.this.webView.loadData(str, "text/html; charset=utf-8", "base64");
            }
        });
    }

    private void blurryRenderingWebViewForKitKatWorkAround(WebView webView2) {
        if (Build.VERSION.SDK_INT == 19) {
            webView2.setLayerType(1, (Paint) null);
        }
    }

    /* access modifiers changed from: private */
    public void setWebViewToMaxSize(Activity activity2) {
        this.webView.layout(0, 0, getWebViewMaxSizeX(activity2), getWebViewMaxSizeY(activity2));
    }

    /* access modifiers changed from: private */
    public void setMessageView(InAppMessageView inAppMessageView) {
        synchronized (this.messageViewSyncLock) {
            this.messageView = inAppMessageView;
        }
    }

    /* access modifiers changed from: private */
    public void createNewInAppMessageView(boolean z) {
        this.lastPageHeight = Integer.valueOf(this.messageContent.getPageHeight());
        setMessageView(new InAppMessageView(this.webView, this.messageContent, z));
        this.messageView.setMessageController(new InAppMessageView.InAppMessageViewListener() {
            public void onMessageWasShown() {
                OneSignal.getInAppMessageController().onMessageWasShown(WebViewManager.this.message);
            }

            public void onMessageWillDismiss() {
                OneSignal.getInAppMessageController().onMessageWillDismiss(WebViewManager.this.message);
            }

            public void onMessageWasDismissed() {
                OneSignal.getInAppMessageController().messageWasDismissed(WebViewManager.this.message);
                WebViewManager.this.removeActivityListener();
            }
        });
        ActivityLifecycleHandler activityLifecycleHandler = ActivityLifecycleListener.getActivityLifecycleHandler();
        if (activityLifecycleHandler != null) {
            activityLifecycleHandler.addActivityAvailableListener(TAG + this.message.messageId, this);
        }
    }

    private static void enableWebViewRemoteDebugging() {
        if (Build.VERSION.SDK_INT >= 19 && OneSignal.atLogLevel(OneSignal.LOG_LEVEL.DEBUG)) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
    }

    private int getWebViewMaxSizeX(Activity activity2) {
        if (this.messageContent.isFullBleed()) {
            return OSViewUtils.getFullbleedWindowWidth(activity2);
        }
        return OSViewUtils.getWindowWidth(activity2) - (MARGIN_PX_SIZE * 2);
    }

    private int getWebViewMaxSizeY(Activity activity2) {
        return OSViewUtils.getWindowHeight(activity2) - (this.messageContent.isFullBleed() ? 0 : MARGIN_PX_SIZE * 2);
    }

    /* access modifiers changed from: private */
    public void removeActivityListener() {
        ActivityLifecycleHandler activityLifecycleHandler = ActivityLifecycleListener.getActivityLifecycleHandler();
        if (activityLifecycleHandler != null) {
            activityLifecycleHandler.removeActivityAvailableListener(TAG + this.message.messageId);
        }
    }

    /* access modifiers changed from: protected */
    public void dismissAndAwaitNextMessage(final OneSignalGenericCallback oneSignalGenericCallback) {
        InAppMessageView inAppMessageView = this.messageView;
        if (inAppMessageView != null && !this.dismissFired) {
            if (!(this.message == null || inAppMessageView == null)) {
                OneSignal.getInAppMessageController().onMessageWillDismiss(this.message);
            }
            this.messageView.dismissAndAwaitNextMessage(new OneSignalGenericCallback() {
                public void onComplete() {
                    boolean unused = WebViewManager.this.dismissFired = false;
                    WebViewManager.this.setMessageView((InAppMessageView) null);
                    OneSignalGenericCallback oneSignalGenericCallback = oneSignalGenericCallback;
                    if (oneSignalGenericCallback != null) {
                        oneSignalGenericCallback.onComplete();
                    }
                }
            });
            this.dismissFired = true;
        } else if (oneSignalGenericCallback != null) {
            oneSignalGenericCallback.onComplete();
        }
    }
}
