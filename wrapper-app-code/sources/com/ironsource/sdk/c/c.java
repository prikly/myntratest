package com.ironsource.sdk.c;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.ironsource.sdk.a;
import com.ironsource.sdk.a.f;
import com.ironsource.sdk.b.b;
import com.ironsource.sdk.c.e;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.d;
import com.onesignal.outcomes.data.OutcomeEventsTable;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class c implements e {
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final String f9045e = c.class.getSimpleName();
    /* access modifiers changed from: package-private */

    /* renamed from: a  reason: collision with root package name */
    public final String f9046a;
    /* access modifiers changed from: package-private */

    /* renamed from: b  reason: collision with root package name */
    public WebView f9047b;

    /* renamed from: c  reason: collision with root package name */
    public b f9048c;

    /* renamed from: d  reason: collision with root package name */
    public a f9049d;

    /* renamed from: f  reason: collision with root package name */
    private final String f9050f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public Activity f9051g;

    public c(com.ironsource.sdk.b.a aVar, Activity activity, String str, a aVar2) {
        this.f9051g = activity;
        b bVar = new b();
        this.f9048c = bVar;
        bVar.f9020d = str;
        this.f9050f = IronSourceStorageUtils.getNetworkStorageDir(activity.getApplicationContext());
        this.f9046a = str;
        this.f9048c.f9017a = aVar;
        this.f9049d = aVar2;
    }

    static /* synthetic */ void a(c cVar, final String str) {
        Logger.i(f9045e, "ISNAdViewWebPresenter | createWebView");
        WebView webView = new WebView(cVar.f9051g);
        cVar.f9047b = webView;
        webView.addJavascriptInterface(new b(cVar), "containerMsgHandler");
        cVar.f9047b.setWebViewClient(new com.ironsource.sdk.b.c(new e.a() {
            public final void a(String str) {
                String a2 = c.f9045e;
                Logger.i(a2, "ISNAdViewWebPresenter | WebViewClient | reportOnError: " + str);
                c.this.b(str, str);
            }

            public final void b(String str) {
                String a2 = c.f9045e;
                Logger.i(a2, "ISNAdViewWebPresenter | WebViewClient | onRenderProcessGone: " + str);
                try {
                    ((ViewGroup) c.this.f9047b.getParent()).removeView(c.this.f9047b);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                c.this.c();
            }
        }));
        d.a(cVar.f9047b);
        cVar.f9048c.f9019c = cVar.f9047b;
    }

    static /* synthetic */ String b(c cVar, String str) {
        if (!str.startsWith(".")) {
            return str;
        }
        StringBuilder sb = new StringBuilder("file://");
        sb.append(cVar.f9050f);
        String substring = str.substring(str.indexOf("/") + 1);
        sb.append(substring.substring(substring.indexOf("/")));
        return sb.toString();
    }

    /* access modifiers changed from: private */
    public synchronized void c() {
        a("", "");
    }

    public final synchronized void a(final String str, final String str2) {
        if (this.f9051g != null) {
            Logger.i(f9045e, "performCleanup");
            com.ironsource.environment.e.a.f8069a.a(new Runnable() {
                public final void run() {
                    try {
                        if (c.this.f9047b != null) {
                            c.this.f9047b.destroy();
                        }
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("adViewId", c.this.f9046a);
                        if (c.this.f9048c != null) {
                            c.this.f9048c.a(str, jSONObject);
                            b c2 = c.this.f9048c;
                            c2.f9017a = null;
                            c2.f9018b = null;
                        }
                        b unused = c.this.f9048c = null;
                        Activity unused2 = c.this.f9051g = null;
                    } catch (Exception e2) {
                        String a2 = c.f9045e;
                        Log.e(a2, "performCleanup | could not destroy ISNAdView webView ID: " + c.this.f9046a);
                        com.ironsource.sdk.a.d.a(f.o, (Map<String, Object>) new com.ironsource.sdk.a.a().a("callfailreason", e2.getMessage()).f8990a);
                        c.this.b(str2, e2.getMessage());
                    }
                }
            });
        }
    }

    public final void a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            b(str3, "action parameter empty");
            return;
        }
        String str4 = f9045e;
        Logger.i(str4, "trying to perform WebView Action: " + str);
        try {
            if (str.equals("onPause")) {
                this.f9047b.onPause();
            } else if (str.equals("onResume")) {
                this.f9047b.onResume();
            } else {
                b(str3, "action not supported");
                return;
            }
            this.f9048c.a(str2);
        } catch (Exception unused) {
            b(str3, "failed to perform action");
        }
    }

    public final void a(JSONObject jSONObject, String str, String str2) {
        try {
            this.f9048c.b(str);
        } catch (Exception e2) {
            String str3 = f9045e;
            Logger.i(str3, "sendHandleGetViewVisibility fail with reason: " + e2.getMessage());
        }
    }

    public final WebView b() {
        return this.f9047b;
    }

    public final void b(String str, String str2) {
        b bVar = this.f9048c;
        if (bVar != null) {
            bVar.a(str, str2);
        }
    }

    public final void b(JSONObject jSONObject, String str, String str2) {
        try {
            this.f9048c.a(jSONObject.getString(OutcomeEventsTable.COLUMN_NAME_PARAMS), str, str2);
        } catch (Exception e2) {
            String str3 = f9045e;
            Logger.i(str3, "sendMessageToAd fail message: " + e2.getMessage());
            throw e2;
        }
    }

    @JavascriptInterface
    public void handleMessageFromAd(String str) {
        b bVar = this.f9048c;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("method");
            if (TextUtils.isEmpty(optString) || !bVar.c(optString)) {
                bVar.a("containerSendMessage", jSONObject);
            } else if (optString.equalsIgnoreCase("handleGetViewVisibility")) {
                bVar.a(bVar.a(jSONObject).toString(), (String) null, (String) null);
            }
        } catch (JSONException e2) {
            String str2 = bVar.f9021e;
            Log.e(str2, "ISNAdViewLogic | receiveMessageFromExternal | Error while trying handle message: " + str);
            e2.printStackTrace();
        }
    }
}
