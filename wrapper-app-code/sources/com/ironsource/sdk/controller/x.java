package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.DownloadListener;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.amazon.aps.shared.APSAnalytics;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.ironsource.environment.a;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.controller.f;
import com.ironsource.sdk.controller.k;
import com.ironsource.sdk.controller.l;
import com.ironsource.sdk.controller.r;
import com.ironsource.sdk.controller.v;
import com.ironsource.sdk.f.a;
import com.ironsource.sdk.g.d;
import com.ironsource.sdk.h.b;
import com.ironsource.sdk.k.c;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import io.bidmachine.BidMachineFetcher;
import io.bidmachine.utils.IabUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class x extends WebView implements DownloadListener, m, com.ironsource.sdk.k.c {
    /* access modifiers changed from: private */
    public static String ab = "success";
    /* access modifiers changed from: private */
    public static String ac = "fail";

    /* renamed from: b  reason: collision with root package name */
    public static String f9293b = "is_store";

    /* renamed from: c  reason: collision with root package name */
    public static String f9294c = "external_url";

    /* renamed from: d  reason: collision with root package name */
    public static String f9295d = "secondary_web_view";
    private static int y;
    /* access modifiers changed from: private */
    public String A;
    /* access modifiers changed from: private */
    public String B;
    private Map<String, String> C;
    /* access modifiers changed from: private */
    public com.ironsource.sdk.k.b D;
    /* access modifiers changed from: private */
    public boolean E;
    /* access modifiers changed from: private */
    public boolean F;
    /* access modifiers changed from: private */
    public CountDownTimer G;
    /* access modifiers changed from: private */
    public int H = 50;
    /* access modifiers changed from: private */
    public int I = 50;
    /* access modifiers changed from: private */
    public String J = "top-right";
    /* access modifiers changed from: private */
    public FrameLayout K;
    /* access modifiers changed from: private */
    public WebChromeClient.CustomViewCallback L;
    /* access modifiers changed from: private */
    public com.ironsource.sdk.j.a.d M;
    /* access modifiers changed from: private */
    public com.ironsource.sdk.j.a.c N;
    /* access modifiers changed from: private */
    public com.ironsource.sdk.j.e O;
    /* access modifiers changed from: private */
    public com.ironsource.sdk.j.a.b P;
    /* access modifiers changed from: private */
    public Boolean Q = null;
    /* access modifiers changed from: private */
    public String R;
    /* access modifiers changed from: private */
    public f S;
    private Object T = new Object();
    /* access modifiers changed from: private */
    public boolean U = false;
    /* access modifiers changed from: private */
    public j V;
    /* access modifiers changed from: private */
    public e W;
    /* access modifiers changed from: package-private */

    /* renamed from: a  reason: collision with root package name */
    public String f9296a = x.class.getSimpleName();
    /* access modifiers changed from: private */
    public com.ironsource.sdk.service.Connectivity.b aa;
    /* access modifiers changed from: package-private */

    /* renamed from: e  reason: collision with root package name */
    public b f9297e;

    /* renamed from: f  reason: collision with root package name */
    public CountDownTimer f9298f;

    /* renamed from: g  reason: collision with root package name */
    a f9299g;
    /* access modifiers changed from: package-private */

    /* renamed from: h  reason: collision with root package name */
    public View f9300h;
    /* access modifiers changed from: package-private */
    public FrameLayout i;
    /* access modifiers changed from: package-private */
    public g j;
    String k;
    /* access modifiers changed from: package-private */
    public w l;
    /* access modifiers changed from: package-private */
    public com.ironsource.sdk.g.b m;
    /* access modifiers changed from: package-private */
    public q n;
    /* access modifiers changed from: package-private */
    public r o;
    /* access modifiers changed from: package-private */
    public v p;
    /* access modifiers changed from: package-private */
    public k q;
    /* access modifiers changed from: package-private */
    public a r;
    /* access modifiers changed from: package-private */
    public l s;
    y t;
    c u;
    /* access modifiers changed from: package-private */
    public com.ironsource.sdk.j.g v;
    private final com.ironsource.environment.e.a w;
    /* access modifiers changed from: private */
    public String x = IronSourceConstants.IRONSOURCE_CONFIG_NAME;
    private final String z = "We're sorry, some error occurred. we will investigate it";

    class a extends WebChromeClient {
        private a() {
        }

        /* synthetic */ a(x xVar, byte b2) {
            this();
        }

        public final View getVideoLoadingProgressView() {
            FrameLayout frameLayout = new FrameLayout(x.this.u.a());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return frameLayout;
        }

        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            Logger.i("MyApplication", consoleMessage.message() + " -- From line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId());
            return true;
        }

        public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebChromeClient(this);
            webView2.setWebViewClient(new c(x.this, (byte) 0));
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            Logger.i("onCreateWindow", "onCreateWindow");
            return true;
        }

        public final void onHideCustomView() {
            Logger.i("Test", "onHideCustomView");
            if (x.this.f9300h != null) {
                x.this.f9300h.setVisibility(8);
                x.this.K.removeView(x.this.f9300h);
                View unused = x.this.f9300h = null;
                x.this.K.setVisibility(8);
                x.this.L.onCustomViewHidden();
                x.this.setVisibility(0);
            }
        }

        public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            Logger.i("Test", "onShowCustomView");
            x.this.setVisibility(8);
            if (x.this.f9300h != null) {
                Logger.i("Test", "mCustomView != null");
                customViewCallback.onCustomViewHidden();
                return;
            }
            Logger.i("Test", "mCustomView == null");
            x.this.K.addView(view);
            View unused = x.this.f9300h = view;
            WebChromeClient.CustomViewCallback unused2 = x.this.L = customViewCallback;
            x.this.K.setVisibility(0);
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        d.e f9336a;

        /* renamed from: b  reason: collision with root package name */
        String f9337b;

        public b(d.e eVar, String str) {
            this.f9336a = eVar;
            this.f9337b = str;
        }
    }

    class c extends WebViewClient {
        private c() {
        }

        /* synthetic */ c(x xVar, byte b2) {
            this();
        }

        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            String b2 = x.this.f9296a;
            Logger.e(b2, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            return true;
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Activity a2 = x.this.u.a();
            Intent intent = new Intent(a2, OpenUrlActivity.class);
            intent.putExtra(x.f9294c, str);
            intent.putExtra(x.f9295d, false);
            a2.startActivity(intent);
            return true;
        }
    }

    public class d {

        public class a {
            public a() {
            }

            /* access modifiers changed from: package-private */
            public final void a(boolean z, String str, com.ironsource.sdk.g.f fVar) {
                fVar.a(z ? x.ab : x.ac, str);
                x.a(x.this, fVar.toString(), z, (String) null, (String) null);
            }

            public final void a(boolean z, String str, JSONObject jSONObject) {
                String str2;
                if (z) {
                    try {
                        str2 = x.ab;
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                        e2.getMessage();
                        return;
                    }
                } else {
                    str2 = x.ac;
                }
                jSONObject.put(str2, str);
                x.a(x.this, jSONObject.toString(), z, (String) null, (String) null);
            }
        }

        public d() {
        }

        private void a(String str, boolean z) {
            com.ironsource.sdk.g.c a2 = x.this.V.a(d.e.Interstitial, str);
            if (a2 != null) {
                a2.f9520f = z;
            }
        }

        private void a(JSONObject jSONObject) {
            try {
                FeaturesManager instance = FeaturesManager.getInstance();
                if (!instance.a().isEmpty()) {
                    jSONObject.put("nativeFeatures", new JSONArray(instance.a()));
                }
            } catch (Exception e2) {
                com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.m, (Map<String, Object>) new com.ironsource.sdk.a.a().a("callfailreason", e2.getMessage()).f8990a);
                Logger.d(x.this.f9296a, "getControllerConfig Error while adding supported features data from FeaturesManager");
            }
        }

        private void a(JSONObject jSONObject, String str) {
            if (a(str)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(str);
                    jSONObject.putOpt("testerABGroup", jSONObject2.get("testerABGroup"));
                    jSONObject.putOpt("testFriendlyName", jSONObject2.get("testFriendlyName"));
                } catch (JSONException unused) {
                    Logger.d(x.this.f9296a, "getControllerConfig Error while parsing Tester AB Group parameters");
                }
            }
        }

        private static boolean a(String str) {
            if (TextUtils.isEmpty(str) || str.contains("-1")) {
                return false;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return !jSONObject.getString("testerABGroup").isEmpty() && !jSONObject.getString("testFriendlyName").isEmpty();
            } catch (JSONException e2) {
                e2.printStackTrace();
                return false;
            }
        }

        private void b(JSONObject jSONObject) {
            try {
                jSONObject.put("controllerSourceData", x.this.S.f());
            } catch (Exception unused) {
            }
        }

        @JavascriptInterface
        public void adClicked(String str) {
            String b2 = x.this.f9296a;
            Logger.i(b2, "adClicked(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d2 = fVar.d("productType");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            if (!TextUtils.isEmpty(fetchDemandSourceId)) {
                final d.e e2 = x.h(d2);
                final com.ironsource.sdk.j.a.a a2 = x.this.b(e2);
                if (e2 != null && a2 != null) {
                    x.this.c((Runnable) new Runnable() {
                        public final void run() {
                            a2.b(e2, fetchDemandSourceId);
                        }
                    });
                }
            }
        }

        @JavascriptInterface
        public void adCredited(String str) {
            final String str2;
            final boolean z;
            final boolean z2;
            com.ironsource.sdk.g.c a2;
            Log.d(x.this.x, "adCredited(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d2 = fVar.d("credits");
            boolean z3 = false;
            final int parseInt = d2 != null ? Integer.parseInt(d2) : 0;
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            final String d3 = fVar.d("productType");
            if (TextUtils.isEmpty(d3)) {
                Log.d(x.this.x, "adCredited | product type is missing");
            }
            if (!d.e.Interstitial.toString().equalsIgnoreCase(d3)) {
                String d4 = fVar.d("total");
                final int parseInt2 = d4 != null ? Integer.parseInt(d4) : 0;
                if (!d.e.OfferWall.toString().equalsIgnoreCase(d3)) {
                    str2 = null;
                    z2 = false;
                    z = false;
                } else if (fVar.b(InAppPurchaseMetaData.KEY_SIGNATURE) || fVar.b("timestamp") || fVar.b("totalCreditsFlag")) {
                    x.a(x.this, str, false, "One of the keys are missing: signature/timestamp/totalCreditsFlag", (String) null);
                    return;
                } else {
                    if (fVar.d(InAppPurchaseMetaData.KEY_SIGNATURE).equalsIgnoreCase(SDKUtils.getMD5(d4 + x.this.A + x.this.B))) {
                        z3 = true;
                    } else {
                        x.a(x.this, str, false, "Controller signature is not equal to SDK signature", (String) null);
                    }
                    boolean e2 = fVar.e("totalCreditsFlag");
                    str2 = fVar.d("timestamp");
                    z = e2;
                    z2 = z3;
                }
                if (x.this.a(d3)) {
                    final String str3 = str;
                    x.this.c((Runnable) new Runnable() {
                        public final void run() {
                            if (d3.equalsIgnoreCase(d.e.RewardedVideo.toString())) {
                                x.this.M.a(fetchDemandSourceId, parseInt);
                            } else if (d3.equalsIgnoreCase(d.e.OfferWall.toString()) && z2 && x.this.O.onOWAdCredited(parseInt, parseInt2, z) && !TextUtils.isEmpty(str2)) {
                                if (com.ironsource.sdk.utils.b.a().a(str2, x.this.A, x.this.B)) {
                                    x.a(x.this, str3, true, (String) null, (String) null);
                                } else {
                                    x.a(x.this, str3, false, "Time Stamp could not be stored", (String) null);
                                }
                            }
                        }
                    });
                }
            } else if (x.this.a(d.e.Interstitial.toString()) && (a2 = x.this.V.a(d.e.Interstitial, fetchDemandSourceId)) != null) {
                if (a2.f9518d != null && a2.f9518d.containsKey("rewarded")) {
                    z3 = Boolean.parseBoolean(a2.f9518d.get("rewarded"));
                }
                if (z3) {
                    x.this.c((Runnable) new Runnable() {
                        public final void run() {
                            x.this.N.b(fetchDemandSourceId, parseInt);
                        }
                    });
                }
            }
        }

        @JavascriptInterface
        public void adUnitsReady(String str) {
            String b2 = x.this.f9296a;
            Logger.i(b2, "adUnitsReady(" + str + ")");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new com.ironsource.sdk.g.f(str));
            final com.ironsource.sdk.g.a aVar = new com.ironsource.sdk.g.a(str);
            if (!aVar.f9506c) {
                x.a(x.this, str, false, "Num Of Ad Units Do Not Exist", (String) null);
                return;
            }
            x.a(x.this, str, true, (String) null, (String) null);
            String str2 = aVar.f9504a;
            if (d.e.RewardedVideo.toString().equalsIgnoreCase(str2) && x.this.a(str2)) {
                final int parseInt = Integer.parseInt(aVar.f9505b);
                x.this.c((Runnable) new Runnable() {
                    public final void run() {
                        if (parseInt > 0) {
                            Log.d(x.this.f9296a, "onRVInitSuccess()");
                            x.this.M.a(d.e.RewardedVideo, fetchDemandSourceId, aVar);
                            return;
                        }
                        x.this.M.b(fetchDemandSourceId);
                    }
                });
            }
        }

        @JavascriptInterface
        public void adViewAPI(String str) {
            try {
                String b2 = x.this.f9296a;
                Logger.i(b2, "adViewAPI(" + str + ")");
                x.this.r.a(new com.ironsource.sdk.g.f(str).toString(), new a());
            } catch (Exception e2) {
                e2.printStackTrace();
                String b3 = x.this.f9296a;
                Logger.i(b3, "adViewAPI failed with exception " + e2.getMessage());
            }
        }

        @JavascriptInterface
        public void bannerViewAPI(String str) {
            Logger.e(x.this.f9296a, "bannerViewAPI is not supported in this native version, only adview API");
        }

        @JavascriptInterface
        public void cleanAdInstance(String str) {
            d.e e2;
            Map<String, com.ironsource.sdk.g.c> a2;
            com.ironsource.sdk.g.c remove;
            try {
                String b2 = x.this.f9296a;
                Logger.i(b2, "cleanAdInstance(" + str + ")");
                com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
                String d2 = fVar.d("productType");
                String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
                if (!TextUtils.isEmpty(fetchDemandSourceId) && (e2 = x.h(d2)) != null) {
                    j y = x.this.V;
                    if (!TextUtils.isEmpty(fetchDemandSourceId) && (a2 = y.a(e2)) != null && (remove = a2.remove(fetchDemandSourceId)) != null) {
                        remove.f9521g = null;
                        if (remove.f9518d != null) {
                            remove.f9518d.clear();
                        }
                        remove.f9518d = null;
                    }
                }
            } catch (Exception e3) {
                x.a(x.this, str, false, e3.getMessage(), (String) null);
                e3.printStackTrace();
            }
        }

        @JavascriptInterface
        public void clearLastUpdateTimeData(String str) {
            try {
                com.ironsource.sdk.utils.b a2 = com.ironsource.sdk.utils.b.a();
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) a2.f9627a.getAll().keySet().toArray(new String[0]);
                SharedPreferences.Editor edit = a2.f9627a.edit();
                for (String str2 : strArr) {
                    if (com.ironsource.sdk.utils.b.b(str2)) {
                        arrayList.add(str2);
                        edit.remove(str2);
                    }
                }
                edit.apply();
                com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
                if (!arrayList.isEmpty()) {
                    fVar.a("removedAdsLastUpdateTime", arrayList.toString());
                }
                x.a(x.this, fVar.toString(), true, (String) null, (String) null);
            } catch (Exception e2) {
                x.a(x.this, str, false, e2.getMessage(), (String) null);
                e2.printStackTrace();
            }
        }

        @JavascriptInterface
        public void deleteFile(String str) {
            try {
                String b2 = x.this.f9296a;
                Logger.i(b2, "deleteFile(" + str + ")");
                com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
                String d2 = fVar.d("file");
                String d3 = fVar.d("path");
                if (d3 != null) {
                    if (!TextUtils.isEmpty(d2)) {
                        com.ironsource.sdk.h.c cVar = new com.ironsource.sdk.h.c(IronSourceStorageUtils.buildAbsolutePathToDirInCache(x.this.R, d3), d2);
                        if (!cVar.exists()) {
                            x.a(x.this, str, false, "File not exist", "1");
                            return;
                        }
                        x.a(x.this, str, IronSourceStorageUtils.deleteFile(cVar), (String) null, (String) null);
                        return;
                    }
                }
                x.a(x.this, str, false, "Missing parameters for file", "1");
            } catch (Exception e2) {
                x.a(x.this, str, false, e2.getMessage(), (String) null);
                e2.printStackTrace();
            }
        }

        @JavascriptInterface
        public void deleteFolder(String str) {
            try {
                String b2 = x.this.f9296a;
                Logger.i(b2, "deleteFolder(" + str + ")");
                String d2 = new com.ironsource.sdk.g.f(str).d("path");
                if (d2 == null) {
                    x.a(x.this, str, false, "Missing parameters for file", "1");
                    return;
                }
                com.ironsource.sdk.h.c cVar = new com.ironsource.sdk.h.c(IronSourceStorageUtils.buildAbsolutePathToDirInCache(x.this.R, d2));
                if (!cVar.exists()) {
                    x.a(x.this, str, false, "Folder not exist", "1");
                    return;
                }
                x.a(x.this, str, IronSourceStorageUtils.deleteFolder(cVar.getPath()), (String) null, (String) null);
            } catch (Exception e2) {
                x.a(x.this, str, false, e2.getMessage(), (String) null);
                e2.printStackTrace();
            }
        }

        @JavascriptInterface
        public void deviceDataAPI(String str) {
            try {
                String b2 = x.this.f9296a;
                Logger.i(b2, "deviceDataAPI(" + str + ")");
                com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
                k I = x.this.q;
                String fVar2 = fVar.toString();
                a aVar = new a();
                JSONObject jSONObject = new JSONObject(fVar2);
                k.a aVar2 = new k.a((byte) 0);
                aVar2.f9210a = jSONObject.optString("deviceDataFunction");
                aVar2.f9211b = jSONObject.optJSONObject("deviceDataParams");
                aVar2.f9212c = jSONObject.optString("success");
                aVar2.f9213d = jSONObject.optString("fail");
                if ("getDeviceData".equals(aVar2.f9210a)) {
                    String str2 = aVar2.f9212c;
                    com.ironsource.sdk.g.f fVar3 = new com.ironsource.sdk.g.f();
                    fVar3.a(SDKUtils.encodeString("sdCardAvailable"), SDKUtils.encodeString(String.valueOf(com.ironsource.environment.h.d())));
                    fVar3.a(SDKUtils.encodeString("totalDeviceRAM"), SDKUtils.encodeString(String.valueOf(com.ironsource.environment.h.d(I.f9209a))));
                    fVar3.a(SDKUtils.encodeString("isCharging"), SDKUtils.encodeString(String.valueOf(com.ironsource.environment.h.e(I.f9209a))));
                    fVar3.a(SDKUtils.encodeString("chargingType"), SDKUtils.encodeString(String.valueOf(com.ironsource.environment.h.f(I.f9209a))));
                    fVar3.a(SDKUtils.encodeString("airplaneMode"), SDKUtils.encodeString(String.valueOf(com.ironsource.environment.h.g(I.f9209a))));
                    fVar3.a(SDKUtils.encodeString("stayOnWhenPluggedIn"), SDKUtils.encodeString(String.valueOf(com.ironsource.environment.h.h(I.f9209a))));
                    aVar.a(true, str2, fVar3);
                    return;
                }
                String str3 = k.f9208b;
                Logger.i(str3, "unhandled API request " + fVar2);
            } catch (Exception e2) {
                e2.printStackTrace();
                String b3 = x.this.f9296a;
                Logger.i(b3, "deviceDataAPI failed with exception " + e2.getMessage());
            }
        }

        @JavascriptInterface
        public void displayWebView(String str) {
            int i;
            String b2 = x.this.f9296a;
            Logger.i(b2, "displayWebView(" + str + ")");
            x.a(x.this, str, true, (String) null, (String) null);
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            boolean booleanValue = ((Boolean) fVar.c(BidMachineFetcher.AD_TYPE_DISPLAY)).booleanValue();
            String d2 = fVar.d("productType");
            boolean e2 = fVar.e("standaloneView");
            String d3 = fVar.d("adViewId");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            boolean e3 = fVar.e("ctrWVPauseResume");
            if (booleanValue) {
                boolean unused = x.this.U = fVar.e("immersive");
                boolean e4 = fVar.e("activityThemeTranslucent");
                if (x.this.j != g.Display) {
                    x.this.j = g.Display;
                    String b3 = x.this.f9296a;
                    Logger.i(b3, "State: " + x.this.j);
                    Activity a2 = x.this.u.a();
                    String str2 = x.this.k;
                    int k = com.ironsource.environment.h.k(a2);
                    if (e2) {
                        i iVar = new i(a2);
                        iVar.addView(x.this.i);
                        iVar.f9202b = x.this;
                        iVar.f9202b.v = iVar;
                        iVar.f9202b.requestFocus();
                        iVar.f9201a = iVar.f9202b.u.a();
                        if (((((Activity) iVar.f9201a).getWindow().getAttributes().flags & 1024) != 0) || (i = iVar.a()) <= 0) {
                            i = 0;
                        }
                        int b4 = iVar.b();
                        try {
                            if (iVar.f9201a != null) {
                                int o = com.ironsource.environment.h.o(iVar.f9201a);
                                if (o == 1) {
                                    iVar.setPadding(0, i, 0, b4);
                                } else if (o == 2) {
                                    iVar.setPadding(0, i, b4, 0);
                                }
                            }
                        } catch (Exception unused2) {
                        }
                        ((Activity) iVar.f9201a).runOnUiThread(new Runnable() {
                            public final void run(
/*
Method generation error in method: com.ironsource.sdk.controller.i.1.run():void, dex: classes3.dex
                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ironsource.sdk.controller.i.1.run():void, class status: UNLOADED
                            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.util.ArrayList.forEach(ArrayList.java:1259)
                            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.util.ArrayList.forEach(ArrayList.java:1259)
                            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                            	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.util.ArrayList.forEach(ArrayList.java:1259)
                            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                            
*/
                        });
                        return;
                    }
                    Intent intent = e4 ? new Intent(a2, InterstitialActivity.class) : new Intent(a2, ControllerActivity.class);
                    if (d.e.RewardedVideo.toString().equalsIgnoreCase(d2)) {
                        if ("application".equals(str2)) {
                            str2 = SDKUtils.translateRequestedOrientation(com.ironsource.environment.h.m(a2));
                        }
                        intent.putExtra("productType", d.e.RewardedVideo.toString());
                        x.this.m.f9511e = d.e.RewardedVideo.ordinal();
                        x.this.m.f9509c = fetchDemandSourceId;
                        if (x.this.a(d.e.RewardedVideo.toString())) {
                            x.this.M.c(d.e.RewardedVideo, fetchDemandSourceId);
                        }
                    } else if (d.e.OfferWall.toString().equalsIgnoreCase(d2)) {
                        intent.putExtra("productType", d.e.OfferWall.toString());
                        x.this.m.f9511e = d.e.OfferWall.ordinal();
                    } else if (d.e.Interstitial.toString().equalsIgnoreCase(d2)) {
                        if ("application".equals(str2)) {
                            str2 = SDKUtils.translateRequestedOrientation(com.ironsource.environment.h.m(a2));
                        }
                        intent.putExtra("productType", d.e.Interstitial.toString());
                    }
                    if (d3 != null) {
                        intent.putExtra("adViewId", d3);
                    }
                    intent.putExtra("ctrWVPauseResume", e3);
                    intent.setFlags(536870912);
                    intent.putExtra("immersive", x.this.U);
                    intent.putExtra("orientation_set_flag", str2);
                    intent.putExtra("rotation_set_flag", k);
                    x xVar = x.this;
                    b unused3 = xVar.f9297e = new b(x.h(d2), fetchDemandSourceId);
                    a2.startActivity(intent);
                    return;
                }
                String b5 = x.this.f9296a;
                Logger.i(b5, "State: " + x.this.j);
                return;
            }
            x.this.j = g.Gone;
            x.this.j();
        }

        @JavascriptInterface
        public void fileSystemAPI(final String str) {
            String b2 = x.this.f9296a;
            Logger.i(b2, "fileSystemAPI(" + str + ")");
            x.this.b((Runnable) new Runnable() {
                public final void run() {
                    JSONObject a2;
                    try {
                        l r = x.this.s;
                        JSONObject jSONObject = new JSONObject(str);
                        a aVar = new a();
                        n nVar = new n(jSONObject);
                        o oVar = new o(aVar);
                        try {
                            String str = nVar.f9219a;
                            JSONObject jSONObject2 = nVar.f9220b;
                            char c2 = 65535;
                            boolean z = false;
                            switch (str.hashCode()) {
                                case -2073025383:
                                    if (str.equals("saveFile")) {
                                        c2 = 0;
                                        break;
                                    }
                                    break;
                                case -1137024519:
                                    if (str.equals("deleteFolder")) {
                                        c2 = 2;
                                        break;
                                    }
                                    break;
                                case -318115535:
                                    if (str.equals("getTotalSizeOfFiles")) {
                                        c2 = 4;
                                        break;
                                    }
                                    break;
                                case 537556755:
                                    if (str.equals("updateAttributesOfFile")) {
                                        c2 = 5;
                                        break;
                                    }
                                    break;
                                case 1764172231:
                                    if (str.equals("deleteFile")) {
                                        c2 = 1;
                                        break;
                                    }
                                    break;
                                case 1953259713:
                                    if (str.equals("getFiles")) {
                                        c2 = 3;
                                        break;
                                    }
                                    break;
                            }
                            if (c2 != 0) {
                                if (c2 == 1) {
                                    com.ironsource.sdk.h.c a3 = l.a(jSONObject2, r.f9214a);
                                    com.ironsource.sdk.h.b bVar = r.f9215b;
                                    if (a3.exists()) {
                                        if (a3.delete()) {
                                            bVar.f9562d.a(a3.getName());
                                        } else {
                                            throw new Exception("Failed to delete file");
                                        }
                                    }
                                    a2 = l.a(nVar, a3.a());
                                } else if (c2 == 2) {
                                    com.ironsource.sdk.h.c b2 = l.b(jSONObject2, r.f9214a);
                                    com.ironsource.sdk.h.b bVar2 = r.f9215b;
                                    if (b2.exists()) {
                                        ArrayList<com.ironsource.sdk.h.c> filesInFolderRecursive = IronSourceStorageUtils.getFilesInFolderRecursive(b2);
                                        if (IronSourceStorageUtils.deleteFolderContentRecursive(b2) && b2.delete()) {
                                            z = true;
                                        }
                                        if (z) {
                                            bVar2.f9562d.a(filesInFolderRecursive);
                                        } else {
                                            throw new Exception("Failed to delete folder");
                                        }
                                    }
                                    a2 = l.a(nVar, b2.a());
                                } else if (c2 == 3) {
                                    com.ironsource.sdk.h.c b3 = l.b(jSONObject2, r.f9214a);
                                    com.ironsource.sdk.h.b bVar3 = r.f9215b;
                                    if (b3.exists()) {
                                        a2 = l.a(nVar, IronSourceStorageUtils.buildFilesMapOfDirectory(b3, bVar3.f9562d.a()));
                                    } else {
                                        throw new Exception("Folder does not exist");
                                    }
                                } else if (c2 == 4) {
                                    com.ironsource.sdk.h.c b4 = l.b(jSONObject2, r.f9214a);
                                    if (b4.exists()) {
                                        a2 = l.a(nVar, IronSourceStorageUtils.getTotalSizeOfDir(b4));
                                    } else {
                                        throw new Exception("Folder does not exist");
                                    }
                                } else if (c2 == 5) {
                                    com.ironsource.sdk.h.c a4 = l.a(jSONObject2, r.f9214a);
                                    JSONObject optJSONObject = jSONObject2.optJSONObject("attributesToUpdate");
                                    com.ironsource.sdk.h.b bVar4 = r.f9215b;
                                    if (optJSONObject == null) {
                                        throw new Exception("Missing attributes to update");
                                    } else if (!a4.exists()) {
                                        throw new Exception("File does not exist");
                                    } else if (bVar4.f9562d.b(a4.getName(), optJSONObject)) {
                                        oVar.a(nVar, l.a(nVar, a4.a()));
                                        return;
                                    } else {
                                        throw new Exception("Failed to update attribute");
                                    }
                                } else {
                                    return;
                                }
                                oVar.a(nVar, a2);
                                return;
                            }
                            com.ironsource.sdk.h.c a5 = l.a(jSONObject2, r.f9214a);
                            String optString = jSONObject2.optString("fileUrl");
                            l.AnonymousClass1 r5 = new com.ironsource.sdk.k.c(oVar, nVar) {

                                /* renamed from: a */
                                private /* synthetic */ o f9216a;

                                /* renamed from: b */
                                private /* synthetic */ n f9217b;

                                public final void a(
/*
Method generation error in method: com.ironsource.sdk.controller.l.1.a(com.ironsource.sdk.h.c):void, dex: classes3.dex
                                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ironsource.sdk.controller.l.1.a(com.ironsource.sdk.h.c):void, class status: UNLOADED
                                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                                
*/

                                public final void a(
/*
Method generation error in method: com.ironsource.sdk.controller.l.1.a(com.ironsource.sdk.h.c, com.ironsource.sdk.g.e):void, dex: classes3.dex
                                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ironsource.sdk.controller.l.1.a(com.ironsource.sdk.h.c, com.ironsource.sdk.g.e):void, class status: UNLOADED
                                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                                
*/
                            };
                            com.ironsource.sdk.h.b bVar5 = r.f9215b;
                            if (TextUtils.isEmpty(optString)) {
                                throw new Exception("Missing params for file");
                            } else if (com.ironsource.environment.h.a(bVar5.f9560b.f9572b) <= 0) {
                                throw new Exception("no_disk_space");
                            } else if (!SDKUtils.isExternalStorageAvailable()) {
                                throw new Exception("sotrage_unavailable");
                            } else if (a.AnonymousClass1.b(bVar5.f9559a)) {
                                com.ironsource.sdk.h.a aVar2 = bVar5.f9561c;
                                String path = a5.getPath();
                                b.AnonymousClass1 r8 = new com.ironsource.sdk.k.c(r5) {

                                    /* renamed from: a */
                                    private /* synthetic */ c f9563a;

                                    public final void a(
/*
Method generation error in method: com.ironsource.sdk.h.b.1.a(com.ironsource.sdk.h.c):void, dex: classes3.dex
                                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ironsource.sdk.h.b.1.a(com.ironsource.sdk.h.c):void, class status: UNLOADED
                                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                                    
*/

                                    public final void a(
/*
Method generation error in method: com.ironsource.sdk.h.b.1.a(com.ironsource.sdk.h.c, com.ironsource.sdk.g.e):void, dex: classes3.dex
                                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ironsource.sdk.h.b.1.a(com.ironsource.sdk.h.c, com.ironsource.sdk.g.e):void, class status: UNLOADED
                                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                                    
*/
                                };
                                if (path != null) {
                                    aVar2.f9558a.put(path, r8);
                                }
                                if (a5.exists()) {
                                    Message message = new Message();
                                    message.obj = a5;
                                    message.what = IronSourceError.ERROR_SESSION_KEY_ENCRYPTION_FAILURE;
                                    bVar5.f9561c.sendMessage(message);
                                    return;
                                }
                                bVar5.f9560b.a(a5, optString, bVar5.f9561c);
                            } else {
                                throw new Exception("no_network_connection");
                            }
                        } catch (Exception e2) {
                            oVar.b(nVar, l.a(nVar, e2.getMessage()));
                        }
                    } catch (Exception e3) {
                        e3.printStackTrace();
                        String b5 = x.this.f9296a;
                        Logger.i(b5, "fileSystemAPI failed with exception " + e3.getMessage());
                    }
                }
            });
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0059, code lost:
            if (android.text.TextUtils.isEmpty(r0) == false) goto L_0x005d;
         */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x0063  */
        /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
        @android.webkit.JavascriptInterface
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void getApplicationInfo(java.lang.String r5) {
            /*
                r4 = this;
                com.ironsource.sdk.controller.x r0 = com.ironsource.sdk.controller.x.this
                java.lang.String r0 = r0.f9296a
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "getApplicationInfo("
                r1.<init>(r2)
                r1.append(r5)
                java.lang.String r2 = ")"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.ironsource.sdk.utils.Logger.i(r0, r1)
                com.ironsource.sdk.controller.x r0 = com.ironsource.sdk.controller.x.this
                java.lang.String r0 = new com.ironsource.sdk.g.f(r5).d(com.ironsource.sdk.controller.x.ab)
                com.ironsource.sdk.controller.x r1 = com.ironsource.sdk.controller.x.this
                java.lang.String r1 = new com.ironsource.sdk.g.f(r5).d(com.ironsource.sdk.controller.x.ac)
                com.ironsource.sdk.g.f r2 = new com.ironsource.sdk.g.f
                r2.<init>(r5)
                java.lang.String r5 = "productType"
                java.lang.String r5 = r2.d(r5)
                java.lang.String r2 = com.ironsource.sdk.utils.SDKUtils.fetchDemandSourceId((com.ironsource.sdk.g.f) r2)
                com.ironsource.sdk.controller.x r3 = com.ironsource.sdk.controller.x.this
                java.lang.Object[] r5 = r3.c((java.lang.String) r5, (java.lang.String) r2)
                r2 = 0
                r2 = r5[r2]
                java.lang.String r2 = (java.lang.String) r2
                r3 = 1
                r5 = r5[r3]
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L_0x0055
                boolean r5 = android.text.TextUtils.isEmpty(r1)
                if (r5 != 0) goto L_0x005c
                r0 = r1
                goto L_0x005d
            L_0x0055:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L_0x005c
                goto L_0x005d
            L_0x005c:
                r0 = 0
            L_0x005d:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L_0x0072
                com.ironsource.sdk.controller.x r5 = com.ironsource.sdk.controller.x.this
                java.lang.String r1 = "onGetApplicationInfoSuccess"
                java.lang.String r3 = "onGetApplicationInfoFail"
                java.lang.String r5 = com.ironsource.sdk.controller.x.a((java.lang.String) r0, (java.lang.String) r2, (java.lang.String) r1, (java.lang.String) r3)
                com.ironsource.sdk.controller.x r0 = com.ironsource.sdk.controller.x.this
                r0.b((java.lang.String) r5)
            L_0x0072:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.x.d.getApplicationInfo(java.lang.String):void");
        }

        @JavascriptInterface
        public void getCachedFilesMap(String str) {
            x xVar;
            String str2;
            String b2 = x.this.f9296a;
            Logger.i(b2, "getCachedFilesMap(" + str + ")");
            String b3 = new com.ironsource.sdk.g.f(str).d(x.ab);
            if (!TextUtils.isEmpty(b3)) {
                com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
                if (!fVar.a("path")) {
                    xVar = x.this;
                    str2 = "path key does not exist";
                } else {
                    String str3 = (String) fVar.c("path");
                    if (!IronSourceStorageUtils.isPathExist(x.this.R, str3)) {
                        xVar = x.this;
                        str2 = "path file does not exist on disk";
                    } else {
                        x.this.b(x.a(b3, IronSourceStorageUtils.getCachedFilesMap(x.this.R, str3), "onGetCachedFilesMapSuccess", "onGetCachedFilesMapFail"));
                        return;
                    }
                }
                x.a(xVar, str, false, str2, (String) null);
            }
        }

        @JavascriptInterface
        public void getConnectivityInfo(String str) {
            String str2;
            String b2 = x.this.f9296a;
            Logger.i(b2, "getConnectivityInfo(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d2 = fVar.d(x.ab);
            String d3 = fVar.d(x.ac);
            JSONObject jSONObject = new JSONObject();
            if (x.this.aa != null) {
                com.ironsource.sdk.service.Connectivity.b m = x.this.aa;
                jSONObject = m.f9592a.c(x.this.getContext());
            }
            if (jSONObject.length() > 0) {
                str2 = x.b(d2, jSONObject.toString());
            } else {
                str2 = x.b(d3, x.a("errMsg", "failed to retrieve connection info", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false));
            }
            x.this.b(str2);
        }

        @JavascriptInterface
        public void getControllerConfig(String str) {
            String b2 = x.this.f9296a;
            Logger.i(b2, "getControllerConfig(" + str + ")");
            String d2 = new com.ironsource.sdk.g.f(str).d(x.ab);
            if (!TextUtils.isEmpty(d2)) {
                JSONObject controllerConfigAsJSONObject = SDKUtils.getControllerConfigAsJSONObject();
                a(controllerConfigAsJSONObject);
                a(controllerConfigAsJSONObject, SDKUtils.getTesterParameters());
                b(controllerConfigAsJSONObject);
                x.this.b(x.b(d2, controllerConfigAsJSONObject.toString()));
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0080 A[Catch:{ Exception -> 0x008c }] */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        @android.webkit.JavascriptInterface
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void getDemandSourceState(java.lang.String r9) {
            /*
                r8 = this;
                com.ironsource.sdk.controller.x r0 = com.ironsource.sdk.controller.x.this
                java.lang.String r0 = r0.f9296a
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "getMediationState("
                r1.<init>(r2)
                r1.append(r9)
                java.lang.String r2 = ")"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.ironsource.sdk.utils.Logger.i(r0, r1)
                com.ironsource.sdk.g.f r0 = new com.ironsource.sdk.g.f
                r0.<init>(r9)
                java.lang.String r1 = "demandSourceName"
                java.lang.String r2 = r0.d(r1)
                java.lang.String r3 = com.ironsource.sdk.utils.SDKUtils.fetchDemandSourceId((com.ironsource.sdk.g.f) r0)
                java.lang.String r4 = "productType"
                java.lang.String r0 = r0.d(r4)
                if (r0 == 0) goto L_0x009a
                if (r2 == 0) goto L_0x009a
                r5 = 0
                com.ironsource.sdk.g.d$e r6 = com.ironsource.sdk.utils.SDKUtils.getProductType(r0)     // Catch:{ Exception -> 0x008c }
                if (r6 == 0) goto L_0x009a
                com.ironsource.sdk.controller.x r7 = com.ironsource.sdk.controller.x.this     // Catch:{ Exception -> 0x008c }
                com.ironsource.sdk.controller.j r7 = r7.V     // Catch:{ Exception -> 0x008c }
                com.ironsource.sdk.g.c r6 = r7.a(r6, r3)     // Catch:{ Exception -> 0x008c }
                org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x008c }
                r7.<init>()     // Catch:{ Exception -> 0x008c }
                r7.put(r4, r0)     // Catch:{ Exception -> 0x008c }
                r7.put(r1, r2)     // Catch:{ Exception -> 0x008c }
                java.lang.String r0 = "demandSourceId"
                r7.put(r0, r3)     // Catch:{ Exception -> 0x008c }
                if (r6 == 0) goto L_0x0070
                int r0 = r6.f9517c     // Catch:{ Exception -> 0x008c }
                r1 = -1
                if (r0 != r1) goto L_0x005f
                r0 = 1
                goto L_0x0060
            L_0x005f:
                r0 = 0
            L_0x0060:
                if (r0 != 0) goto L_0x0070
                com.ironsource.sdk.controller.x r0 = com.ironsource.sdk.controller.x.this     // Catch:{ Exception -> 0x008c }
                java.lang.String r0 = new com.ironsource.sdk.g.f(r9).d(com.ironsource.sdk.controller.x.ab)     // Catch:{ Exception -> 0x008c }
                java.lang.String r1 = "state"
                int r2 = r6.f9517c     // Catch:{ Exception -> 0x008c }
                r7.put(r1, r2)     // Catch:{ Exception -> 0x008c }
                goto L_0x0076
            L_0x0070:
                com.ironsource.sdk.controller.x r0 = com.ironsource.sdk.controller.x.this     // Catch:{ Exception -> 0x008c }
                java.lang.String r0 = new com.ironsource.sdk.g.f(r9).d(com.ironsource.sdk.controller.x.ac)     // Catch:{ Exception -> 0x008c }
            L_0x0076:
                java.lang.String r1 = r7.toString()     // Catch:{ Exception -> 0x008c }
                boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x008c }
                if (r2 != 0) goto L_0x009a
                com.ironsource.sdk.controller.x r2 = com.ironsource.sdk.controller.x.this     // Catch:{ Exception -> 0x008c }
                java.lang.String r0 = com.ironsource.sdk.controller.x.b((java.lang.String) r0, (java.lang.String) r1)     // Catch:{ Exception -> 0x008c }
                com.ironsource.sdk.controller.x r1 = com.ironsource.sdk.controller.x.this     // Catch:{ Exception -> 0x008c }
                r1.b((java.lang.String) r0)     // Catch:{ Exception -> 0x008c }
                goto L_0x009a
            L_0x008c:
                r0 = move-exception
                com.ironsource.sdk.controller.x r1 = com.ironsource.sdk.controller.x.this
                java.lang.String r2 = r0.getMessage()
                r3 = 0
                com.ironsource.sdk.controller.x.a((com.ironsource.sdk.controller.x) r1, (java.lang.String) r9, (boolean) r5, (java.lang.String) r2, (java.lang.String) r3)
                r0.printStackTrace()
            L_0x009a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.x.d.getDemandSourceState(java.lang.String):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x004e, code lost:
            if (android.text.TextUtils.isEmpty(r0) == false) goto L_0x0052;
         */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x0058  */
        /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
        @android.webkit.JavascriptInterface
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void getDeviceStatus(java.lang.String r5) {
            /*
                r4 = this;
                com.ironsource.sdk.controller.x r0 = com.ironsource.sdk.controller.x.this
                java.lang.String r0 = r0.f9296a
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "getDeviceStatus("
                r1.<init>(r2)
                r1.append(r5)
                java.lang.String r2 = ")"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.ironsource.sdk.utils.Logger.i(r0, r1)
                com.ironsource.sdk.controller.x r0 = com.ironsource.sdk.controller.x.this
                java.lang.String r0 = new com.ironsource.sdk.g.f(r5).d(com.ironsource.sdk.controller.x.ab)
                com.ironsource.sdk.controller.x r1 = com.ironsource.sdk.controller.x.this
                java.lang.String r5 = new com.ironsource.sdk.g.f(r5).d(com.ironsource.sdk.controller.x.ac)
                com.ironsource.sdk.controller.x r1 = com.ironsource.sdk.controller.x.this
                android.content.Context r2 = r1.getContext()
                java.lang.Object[] r1 = r1.c((android.content.Context) r2)
                r2 = 0
                r2 = r1[r2]
                java.lang.String r2 = (java.lang.String) r2
                r3 = 1
                r1 = r1[r3]
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto L_0x004a
                boolean r0 = android.text.TextUtils.isEmpty(r5)
                if (r0 != 0) goto L_0x0051
                r0 = r5
                goto L_0x0052
            L_0x004a:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L_0x0051
                goto L_0x0052
            L_0x0051:
                r0 = 0
            L_0x0052:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L_0x0067
                com.ironsource.sdk.controller.x r5 = com.ironsource.sdk.controller.x.this
                java.lang.String r1 = "onGetDeviceStatusSuccess"
                java.lang.String r3 = "onGetDeviceStatusFail"
                java.lang.String r5 = com.ironsource.sdk.controller.x.a((java.lang.String) r0, (java.lang.String) r2, (java.lang.String) r1, (java.lang.String) r3)
                com.ironsource.sdk.controller.x r0 = com.ironsource.sdk.controller.x.this
                r0.b((java.lang.String) r5)
            L_0x0067:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.x.d.getDeviceStatus(java.lang.String):void");
        }

        @JavascriptInterface
        public void getDeviceVolume(String str) {
            String b2 = x.this.f9296a;
            Logger.i(b2, "getDeviceVolume(" + str + ")");
            try {
                com.ironsource.sdk.utils.a.a(x.this.u.a());
                float b3 = com.ironsource.sdk.utils.a.b(x.this.u.a());
                com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
                fVar.a("deviceVolume", String.valueOf(b3));
                x.a(x.this, fVar.toString(), true, (String) null, (String) null);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        @JavascriptInterface
        public void getOrientation(String str) {
            Activity a2 = x.this.u.a();
            if (a2 != null) {
                String b2 = new com.ironsource.sdk.g.f(str).d(x.ab);
                String jSONObject = SDKUtils.getOrientation(a2).toString();
                if (!TextUtils.isEmpty(b2)) {
                    x.this.b(x.a(b2, jSONObject, "onGetOrientationSuccess", "onGetOrientationFail"));
                }
            }
        }

        @JavascriptInterface
        public void getUserData(String str) {
            String str2 = str;
            String b2 = x.this.f9296a;
            Logger.i(b2, "getUserData(" + str2 + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str2);
            if (!fVar.a("key")) {
                x.a(x.this, str2, false, "key does not exist", (String) null);
                return;
            }
            String b3 = new com.ironsource.sdk.g.f(str2).d(x.ab);
            String d2 = fVar.d("key");
            String string = com.ironsource.sdk.utils.b.a().f9627a.getString(d2, (String) null);
            if (string == null) {
                string = JsonUtils.EMPTY_JSON;
            }
            x.this.b(x.b(b3, x.a(d2, string, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
        }

        @JavascriptInterface
        public void iabTokenAPI(String str) {
            try {
                String b2 = x.this.f9296a;
                Logger.i(b2, "iabTokenAPI(" + str + ")");
                com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
                v q = x.this.p;
                String fVar2 = fVar.toString();
                a aVar = new a();
                JSONObject jSONObject = new JSONObject(fVar2);
                v.a aVar2 = new v.a((byte) 0);
                aVar2.f9289a = jSONObject.optString("functionName");
                aVar2.f9290b = jSONObject.optJSONObject("functionParams");
                aVar2.f9291c = jSONObject.optString("success");
                aVar2.f9292d = jSONObject.optString("fail");
                if ("updateToken".equals(aVar2.f9289a)) {
                    JSONObject jSONObject2 = aVar2.f9290b;
                    com.ironsource.sdk.g.f fVar3 = new com.ironsource.sdk.g.f();
                    try {
                        com.ironsource.sdk.service.c cVar = q.f9285c;
                        com.ironsource.mediationsdk.adunit.a.a.a("ctgp", jSONObject2);
                        q.f9284b.a(jSONObject2);
                        aVar.a(true, aVar2.f9291c, fVar3);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        String str2 = v.f9283a;
                        Logger.i(str2, "updateToken exception " + e2.getMessage());
                        aVar.a(false, aVar2.f9292d, fVar3);
                    }
                } else if ("getToken".equals(aVar2.f9289a)) {
                    try {
                        aVar.a(true, aVar2.f9291c, SDKUtils.getControllerConfigAsJSONObject().optBoolean("oneToken") ? q.a() : q.f9284b.b(q.f9286d));
                    } catch (Exception e3) {
                        String str3 = aVar2.f9292d;
                        String message = e3.getMessage();
                        com.ironsource.sdk.g.f fVar4 = new com.ironsource.sdk.g.f();
                        fVar4.a(x.ac, str3);
                        fVar4.a("data", message);
                        x.a(x.this, fVar4.toString(), false, (String) null, (String) null);
                    }
                } else {
                    String str4 = v.f9283a;
                    Logger.i(str4, "unhandled API request " + fVar2);
                }
            } catch (Exception e4) {
                e4.printStackTrace();
                String b3 = x.this.f9296a;
                Logger.i(b3, "iabTokenAPI failed with exception " + e4.getMessage());
            }
        }

        @JavascriptInterface
        public void initController(String str) {
            String b2 = x.this.f9296a;
            Logger.i(b2, "initController(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            if (x.this.f9298f != null) {
                x.this.f9298f.cancel();
                x.this.f9298f = null;
            }
            if (fVar.a("stage")) {
                String d2 = fVar.d("stage");
                if ("ready".equalsIgnoreCase(d2)) {
                    boolean unused = x.this.E = true;
                    x.this.W.b();
                } else if ("loaded".equalsIgnoreCase(d2)) {
                    x.this.W.a();
                } else if ("failed".equalsIgnoreCase(d2)) {
                    String d3 = fVar.d("errMsg");
                    e h2 = x.this.W;
                    h2.a("controller js failed to initialize : " + d3);
                } else {
                    Logger.i(x.this.f9296a, "No STAGE mentioned! should not get here!");
                }
            }
        }

        @JavascriptInterface
        public void omidAPI(final String str) {
            x.this.a((Runnable) new Runnable() {
                public final void run() {
                    try {
                        String b2 = x.this.f9296a;
                        Logger.i(b2, "omidAPI(" + str + ")");
                        x.this.n.a(new com.ironsource.sdk.g.f(str).toString(), new a());
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        String b3 = x.this.f9296a;
                        Logger.i(b3, "omidAPI failed with exception " + e2.getMessage());
                    }
                }
            });
        }

        @JavascriptInterface
        public void onAdWindowsClosed(String str) {
            String b2 = x.this.f9296a;
            Logger.i(b2, "onAdWindowsClosed(" + str + ")");
            x.this.m.f9511e = -1;
            x.this.m.f9509c = null;
            b unused = x.this.f9297e = null;
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d2 = fVar.d("productType");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            d.e e2 = x.h(d2);
            String z = x.this.x;
            Log.d(z, "onAdClosed() with type " + e2);
            if (x.this.a(d2)) {
                x.this.a(e2, fetchDemandSourceId);
            }
        }

        @JavascriptInterface
        public void onCleanUpNonDisplayBannersSuccess(String str) {
            String b2 = x.this.f9296a;
            Logger.i(b2, "onCleanUpNonDisplayBannersSuccess() value=" + str);
        }

        @JavascriptInterface
        public void onGetApplicationInfoFail(String str) {
            String b2 = x.this.f9296a;
            Logger.i(b2, "onGetApplicationInfoFail(" + str + ")");
            x.a(x.this, str, true, (String) null, (String) null);
            x.c(x.this, "onGetApplicationInfoFail", str);
        }

        @JavascriptInterface
        public void onGetApplicationInfoSuccess(String str) {
            String b2 = x.this.f9296a;
            Logger.i(b2, "onGetApplicationInfoSuccess(" + str + ")");
            x.a(x.this, str, true, (String) null, (String) null);
            x.c(x.this, "onGetApplicationInfoSuccess", str);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapFail(String str) {
            String b2 = x.this.f9296a;
            Logger.i(b2, "onGetCachedFilesMapFail(" + str + ")");
            x.a(x.this, str, true, (String) null, (String) null);
            x.c(x.this, "onGetCachedFilesMapFail", str);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapSuccess(String str) {
            String b2 = x.this.f9296a;
            Logger.i(b2, "onGetCachedFilesMapSuccess(" + str + ")");
            x.a(x.this, str, true, (String) null, (String) null);
            x.c(x.this, "onGetCachedFilesMapSuccess", str);
        }

        @JavascriptInterface
        public void onGetDeviceStatusFail(String str) {
            String b2 = x.this.f9296a;
            Logger.i(b2, "onGetDeviceStatusFail(" + str + ")");
            x.a(x.this, str, true, (String) null, (String) null);
            x.c(x.this, "onGetDeviceStatusFail", str);
        }

        @JavascriptInterface
        public void onGetDeviceStatusSuccess(String str) {
            String b2 = x.this.f9296a;
            Logger.i(b2, "onGetDeviceStatusSuccess(" + str + ")");
            x.a(x.this, str, true, (String) null, (String) null);
            x.c(x.this, "onGetDeviceStatusSuccess", str);
        }

        @JavascriptInterface
        public void onGetUserCreditsFail(String str) {
            String b2 = x.this.f9296a;
            Logger.i(b2, "onGetUserCreditsFail(" + str + ")");
            final String d2 = new com.ironsource.sdk.g.f(str).d("errMsg");
            if (x.this.a(d.e.OfferWall.toString())) {
                x.this.c((Runnable) new Runnable() {
                    public final void run() {
                        String str = d2;
                        if (str == null) {
                            str = "We're sorry, some error occurred. we will investigate it";
                        }
                        x.this.O.onGetOWCreditsFailed(str);
                    }
                });
            }
            x.a(x.this, str, true, (String) null, (String) null);
            x.c(x.this, "onGetUserCreditsFail", str);
        }

        @JavascriptInterface
        public void onInitBannerFail(String str) {
            String b2 = x.this.f9296a;
            Logger.i(b2, "onInitBannerFail(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            final String d2 = fVar.d("errMsg");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.i(x.this.f9296a, "onInitBannerFail failed with no demand source");
                return;
            }
            com.ironsource.sdk.g.c a2 = x.this.V.a(d.e.Banner, fetchDemandSourceId);
            if (a2 != null) {
                a2.a(3);
            }
            if (x.this.a(d.e.Banner.toString())) {
                x.this.c((Runnable) new Runnable() {
                    public final void run() {
                        String str = d2;
                        if (str == null) {
                            str = "We're sorry, some error occurred. we will investigate it";
                        }
                        String b2 = x.this.f9296a;
                        Log.d(b2, "onBannerInitFail(message:" + str + ")");
                        x.this.P.a(d.e.Banner, fetchDemandSourceId, str);
                    }
                });
            }
            x.a(x.this, str, true, (String) null, (String) null);
            x.c(x.this, "onInitBannerFail", str);
        }

        @JavascriptInterface
        public void onInitBannerSuccess(String str) {
            Logger.i(x.this.f9296a, "onInitBannerSuccess()");
            x.c(x.this, "onInitBannerSuccess", "true");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new com.ironsource.sdk.g.f(str));
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.i(x.this.f9296a, "onInitBannerSuccess failed with no demand source");
            } else if (x.this.a(d.e.Banner.toString())) {
                x.this.c((Runnable) new Runnable() {
                    public final void run() {
                        Log.d(x.this.f9296a, "onBannerInitSuccess()");
                        x.this.P.a(d.e.Banner, fetchDemandSourceId, (com.ironsource.sdk.g.a) null);
                    }
                });
            }
        }

        @JavascriptInterface
        public void onInitInterstitialFail(String str) {
            String b2 = x.this.f9296a;
            Logger.i(b2, "onInitInterstitialFail(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            final String d2 = fVar.d("errMsg");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.i(x.this.f9296a, "onInitInterstitialSuccess failed with no demand source");
                return;
            }
            com.ironsource.sdk.g.c a2 = x.this.V.a(d.e.Interstitial, fetchDemandSourceId);
            if (a2 != null) {
                a2.a(3);
            }
            if (x.this.a(d.e.Interstitial.toString())) {
                x.this.c((Runnable) new Runnable() {
                    public final void run() {
                        String str = d2;
                        if (str == null) {
                            str = "We're sorry, some error occurred. we will investigate it";
                        }
                        String b2 = x.this.f9296a;
                        Log.d(b2, "onInterstitialInitFail(message:" + str + ")");
                        x.this.N.a(d.e.Interstitial, fetchDemandSourceId, str);
                    }
                });
            }
            x.a(x.this, str, true, (String) null, (String) null);
            x.c(x.this, "onInitInterstitialFail", str);
        }

        @JavascriptInterface
        public void onInitInterstitialSuccess(String str) {
            Logger.i(x.this.f9296a, "onInitInterstitialSuccess()");
            x.c(x.this, "onInitInterstitialSuccess", "true");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new com.ironsource.sdk.g.f(str));
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.i(x.this.f9296a, "onInitInterstitialSuccess failed with no demand source");
            } else if (x.this.a(d.e.Interstitial.toString())) {
                x.this.c((Runnable) new Runnable() {
                    public final void run() {
                        Log.d(x.this.f9296a, "onInterstitialInitSuccess()");
                        x.this.N.a(d.e.Interstitial, fetchDemandSourceId, (com.ironsource.sdk.g.a) null);
                    }
                });
            }
        }

        @JavascriptInterface
        public void onInitOfferWallFail(String str) {
            String b2 = x.this.f9296a;
            Logger.i(b2, "onInitOfferWallFail(" + str + ")");
            x.this.m.i = false;
            final String d2 = new com.ironsource.sdk.g.f(str).d("errMsg");
            if (x.this.m.f9514h) {
                x.this.m.f9514h = false;
                if (x.this.a(d.e.OfferWall.toString())) {
                    x.this.c((Runnable) new Runnable() {
                        public final void run() {
                            String str = d2;
                            if (str == null) {
                                str = "We're sorry, some error occurred. we will investigate it";
                            }
                            String b2 = x.this.f9296a;
                            Log.d(b2, "onOfferWallInitFail(message:" + str + ")");
                            x.this.O.onOfferwallInitFail(str);
                        }
                    });
                }
            }
            x.a(x.this, str, true, (String) null, (String) null);
            x.c(x.this, "onInitOfferWallFail", str);
        }

        @JavascriptInterface
        public void onInitOfferWallSuccess(String str) {
            x.c(x.this, "onInitOfferWallSuccess", "true");
            x.this.m.i = true;
            if (x.this.m.f9514h) {
                x.this.m.f9514h = false;
                if (x.this.a(d.e.OfferWall.toString())) {
                    x.this.c((Runnable) new Runnable() {
                        public final void run() {
                            Log.d(x.this.f9296a, "onOfferWallInitSuccess()");
                            x.this.O.onOfferwallInitSuccess();
                        }
                    });
                }
            }
        }

        @JavascriptInterface
        public void onInitRewardedVideoFail(String str) {
            String b2 = x.this.f9296a;
            Logger.i(b2, "onInitRewardedVideoFail(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            final String d2 = fVar.d("errMsg");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            com.ironsource.sdk.g.c a2 = x.this.V.a(d.e.RewardedVideo, fetchDemandSourceId);
            if (a2 != null) {
                a2.a(3);
            }
            if (x.this.a(d.e.RewardedVideo.toString())) {
                x.this.c((Runnable) new Runnable() {
                    public final void run() {
                        String str = d2;
                        if (str == null) {
                            str = "We're sorry, some error occurred. we will investigate it";
                        }
                        String b2 = x.this.f9296a;
                        Log.d(b2, "onRVInitFail(message:" + str + ")");
                        x.this.M.a(d.e.RewardedVideo, fetchDemandSourceId, str);
                    }
                });
            }
            x.a(x.this, str, true, (String) null, (String) null);
            x.c(x.this, "onInitRewardedVideoFail", str);
        }

        @JavascriptInterface
        public void onLoadBannerFail(String str) {
            Logger.i(x.this.f9296a, "onLoadBannerFail()");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            final String d2 = fVar.d("errMsg");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            x.a(x.this, str, true, (String) null, (String) null);
            if (!TextUtils.isEmpty(fetchDemandSourceId) && x.this.a(d.e.Banner.toString())) {
                x.this.c((Runnable) new Runnable() {
                    public final void run() {
                        Log.d(x.this.f9296a, "onLoadBannerFail()");
                        String str = d2;
                        if (str == null) {
                            str = "We're sorry, some error occurred. we will investigate it";
                        }
                        x.this.P.d(fetchDemandSourceId, str);
                    }
                });
            }
        }

        @JavascriptInterface
        public void onLoadBannerSuccess(String str) {
            Logger.i(x.this.f9296a, "onLoadBannerSuccess()");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            String d2 = fVar.d("adViewId");
            x.a(x.this, str, true, (String) null, (String) null);
            com.ironsource.sdk.c.e a2 = com.ironsource.sdk.c.d.a().a(d2);
            if (a2 == null) {
                com.ironsource.sdk.j.a.b E = x.this.P;
                E.d(fetchDemandSourceId, "not found view for the current adViewId= " + d2);
            } else if (a2 instanceof com.ironsource.sdk.c.a) {
                final com.ironsource.sdk.c.a aVar = (com.ironsource.sdk.c.a) a2;
                if (x.this.a(d.e.Banner.toString())) {
                    x.this.c((Runnable) new Runnable() {
                        public final void run() {
                            Log.d(x.this.f9296a, "onBannerLoadSuccess()");
                            x.this.P.a(fetchDemandSourceId, aVar);
                        }
                    });
                }
            }
        }

        @JavascriptInterface
        public void onLoadInterstitialFail(String str) {
            String b2 = x.this.f9296a;
            Logger.i(b2, "onLoadInterstitialFail(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            final String d2 = fVar.d("errMsg");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            x.a(x.this, str, true, (String) null, (String) null);
            if (!TextUtils.isEmpty(fetchDemandSourceId)) {
                a(fetchDemandSourceId, false);
                if (x.this.a(d.e.Interstitial.toString())) {
                    x.this.c((Runnable) new Runnable() {
                        public final void run() {
                            String str = d2;
                            if (str == null) {
                                str = "We're sorry, some error occurred. we will investigate it";
                            }
                            x.this.N.b(fetchDemandSourceId, str);
                        }
                    });
                }
                x.c(x.this, "onLoadInterstitialFail", "true");
            }
        }

        @JavascriptInterface
        public void onLoadInterstitialSuccess(String str) {
            String b2 = x.this.f9296a;
            Logger.i(b2, "onLoadInterstitialSuccess(" + str + ")");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new com.ironsource.sdk.g.f(str));
            a(fetchDemandSourceId, true);
            x.a(x.this, str, true, (String) null, (String) null);
            if (x.this.a(d.e.Interstitial.toString())) {
                x.this.c((Runnable) new Runnable() {
                    public final void run() {
                        x.this.N.c(fetchDemandSourceId);
                    }
                });
            }
            x.c(x.this, "onLoadInterstitialSuccess", "true");
        }

        @JavascriptInterface
        public void onOfferWallGeneric(String str) {
            String b2 = x.this.f9296a;
            Logger.i(b2, "onOfferWallGeneric(" + str + ")");
        }

        @JavascriptInterface
        public void onShowInterstitialFail(String str) {
            String b2 = x.this.f9296a;
            Logger.i(b2, "onShowInterstitialFail(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            final String d2 = fVar.d("errMsg");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            x.a(x.this, str, true, (String) null, (String) null);
            if (!TextUtils.isEmpty(fetchDemandSourceId)) {
                a(fetchDemandSourceId, false);
                if (x.this.a(d.e.Interstitial.toString())) {
                    x.this.c((Runnable) new Runnable() {
                        public final void run() {
                            String str = d2;
                            if (str == null) {
                                str = "We're sorry, some error occurred. we will investigate it";
                            }
                            x.this.N.c(fetchDemandSourceId, str);
                        }
                    });
                }
                x.c(x.this, "onShowInterstitialFail", str);
            }
        }

        @JavascriptInterface
        public void onShowInterstitialSuccess(String str) {
            String b2 = x.this.f9296a;
            Logger.i(b2, "onShowInterstitialSuccess(" + str + ")");
            x.a(x.this, str, true, (String) null, (String) null);
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new com.ironsource.sdk.g.f(str));
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.i(x.this.f9296a, "onShowInterstitialSuccess called with no demand");
                return;
            }
            x.this.m.f9511e = d.e.Interstitial.ordinal();
            x.this.m.f9509c = fetchDemandSourceId;
            if (x.this.a(d.e.Interstitial.toString())) {
                x.this.c((Runnable) new Runnable() {
                    public final void run() {
                        x.this.N.c(d.e.Interstitial, fetchDemandSourceId);
                        x.this.N.d(fetchDemandSourceId);
                    }
                });
                x.c(x.this, "onShowInterstitialSuccess", str);
            }
            a(fetchDemandSourceId, false);
        }

        @JavascriptInterface
        public void onShowOfferWallFail(String str) {
            String b2 = x.this.f9296a;
            Logger.i(b2, "onShowOfferWallFail(" + str + ")");
            final String d2 = new com.ironsource.sdk.g.f(str).d("errMsg");
            if (x.this.a(d.e.OfferWall.toString())) {
                x.this.c((Runnable) new Runnable() {
                    public final void run() {
                        String str = d2;
                        if (str == null) {
                            str = "We're sorry, some error occurred. we will investigate it";
                        }
                        x.this.O.onOWShowFail(str);
                    }
                });
            }
            x.a(x.this, str, true, (String) null, (String) null);
            x.c(x.this, "onShowOfferWallFail", str);
        }

        @JavascriptInterface
        public void onShowOfferWallSuccess(String str) {
            String b2 = x.this.f9296a;
            Logger.i(b2, "onShowOfferWallSuccess(" + str + ")");
            x.this.m.f9511e = d.e.OfferWall.ordinal();
            final String valueFromJsonObject = SDKUtils.getValueFromJsonObject(str, "placementId");
            if (x.this.a(d.e.OfferWall.toString())) {
                x.this.c((Runnable) new Runnable() {
                    public final void run() {
                        x.this.O.onOWShowSuccess(valueFromJsonObject);
                    }
                });
            }
            x.a(x.this, str, true, (String) null, (String) null);
            x.c(x.this, "onShowOfferWallSuccess", str);
        }

        @JavascriptInterface
        public void onShowRewardedVideoFail(String str) {
            String b2 = x.this.f9296a;
            Logger.i(b2, "onShowRewardedVideoFail(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            final String d2 = fVar.d("errMsg");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            if (x.this.a(d.e.RewardedVideo.toString())) {
                x.this.c((Runnable) new Runnable() {
                    public final void run() {
                        String str = d2;
                        if (str == null) {
                            str = "We're sorry, some error occurred. we will investigate it";
                        }
                        String b2 = x.this.f9296a;
                        Log.d(b2, "onRVShowFail(message:" + d2 + ")");
                        x.this.M.a(fetchDemandSourceId, str);
                    }
                });
            }
            x.a(x.this, str, true, (String) null, (String) null);
            x.c(x.this, "onShowRewardedVideoFail", str);
        }

        @JavascriptInterface
        public void onShowRewardedVideoSuccess(String str) {
            String b2 = x.this.f9296a;
            Logger.i(b2, "onShowRewardedVideoSuccess(" + str + ")");
            x.a(x.this, str, true, (String) null, (String) null);
            x.c(x.this, "onShowRewardedVideoSuccess", str);
        }

        @JavascriptInterface
        public void onVideoStatusChanged(String str) {
            String b2 = x.this.f9296a;
            Log.d(b2, "onVideoStatusChanged(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d2 = fVar.d("productType");
            if (x.this.l != null && !TextUtils.isEmpty(d2)) {
                String d3 = fVar.d("status");
                if ("started".equalsIgnoreCase(d3)) {
                    x.this.l.onVideoStarted();
                } else if ("paused".equalsIgnoreCase(d3)) {
                    x.this.l.onVideoPaused();
                } else if ("playing".equalsIgnoreCase(d3)) {
                    x.this.l.onVideoResumed();
                } else if ("ended".equalsIgnoreCase(d3)) {
                    x.this.l.onVideoEnded();
                } else if ("stopped".equalsIgnoreCase(d3)) {
                    x.this.l.onVideoStopped();
                } else {
                    String b3 = x.this.f9296a;
                    Logger.i(b3, "onVideoStatusChanged: unknown status: " + d3);
                }
            }
        }

        @JavascriptInterface
        public void openUrl(String str) {
            String b2 = x.this.f9296a;
            Logger.i(b2, "openUrl(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d2 = fVar.d("url");
            String d3 = fVar.d("method");
            String d4 = fVar.d("package_name");
            Activity a2 = x.this.u.a();
            try {
                String lowerCase = d3.toLowerCase();
                char c2 = 65535;
                int hashCode = lowerCase.hashCode();
                if (hashCode != -1455867212) {
                    if (hashCode != 109770977) {
                        if (hashCode == 1224424441) {
                            if (lowerCase.equals("webview")) {
                                c2 = 1;
                            }
                        }
                    } else if (lowerCase.equals("store")) {
                        c2 = 2;
                    }
                } else if (lowerCase.equals("external_browser")) {
                    c2 = 0;
                }
                if (c2 == 0) {
                    a.AnonymousClass1.a(a2, d2, d4);
                } else if (c2 == 1) {
                    Intent intent = new Intent(a2, OpenUrlActivity.class);
                    intent.putExtra(x.f9294c, d2);
                    intent.putExtra(x.f9295d, true);
                    intent.putExtra("immersive", x.this.U);
                    a2.startActivity(intent);
                } else if (c2 == 2) {
                    Intent intent2 = new Intent(a2, OpenUrlActivity.class);
                    intent2.putExtra(x.f9294c, d2);
                    intent2.putExtra(x.f9293b, true);
                    intent2.putExtra(x.f9295d, true);
                    a2.startActivity(intent2);
                }
            } catch (Exception e2) {
                x.a(x.this, str, false, e2.getMessage(), (String) null);
                e2.printStackTrace();
            }
        }

        @JavascriptInterface
        public void pauseControllerWebview() {
            x.this.a((Runnable) new Runnable() {
                public final void run() {
                    x.this.k();
                }
            });
        }

        @JavascriptInterface
        public void permissionsAPI(String str) {
            com.ironsource.sdk.g.f fVar;
            String str2;
            try {
                String b2 = x.this.f9296a;
                Logger.i(b2, "permissionsAPI(" + str + ")");
                com.ironsource.sdk.g.f fVar2 = new com.ironsource.sdk.g.f(str);
                r H = x.this.o;
                String fVar3 = fVar2.toString();
                a aVar = new a();
                JSONObject jSONObject = new JSONObject(fVar3);
                r.a aVar2 = new r.a((byte) 0);
                aVar2.f9267a = jSONObject.optString("functionName");
                aVar2.f9268b = jSONObject.optJSONObject("functionParams");
                aVar2.f9269c = jSONObject.optString("success");
                aVar2.f9270d = jSONObject.optString("fail");
                if ("getPermissions".equals(aVar2.f9267a)) {
                    JSONObject jSONObject2 = aVar2.f9268b;
                    fVar = new com.ironsource.sdk.g.f();
                    try {
                        fVar.a("permissions", com.ironsource.environment.c.a(H.f9266a, jSONObject2.getJSONArray("permissions")));
                        aVar.a(true, aVar2.f9269c, fVar);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        String str3 = r.f9265b;
                        Logger.i(str3, "PermissionsJSAdapter getPermissions JSON Exception when getting permissions parameter " + e2.getMessage());
                        fVar.a("errMsg", e2.getMessage());
                        str2 = aVar2.f9270d;
                        aVar.a(false, str2, fVar);
                    }
                } else if ("isPermissionGranted".equals(aVar2.f9267a)) {
                    JSONObject jSONObject3 = aVar2.f9268b;
                    fVar = new com.ironsource.sdk.g.f();
                    try {
                        String string = jSONObject3.getString("permission");
                        fVar.a("permission", string);
                        if (com.ironsource.environment.c.a(H.f9266a, string)) {
                            fVar.a("status", String.valueOf(com.ironsource.environment.c.b(H.f9266a, string)));
                            aVar.a(true, aVar2.f9269c, fVar);
                            return;
                        }
                        fVar.a("status", "unhandledPermission");
                        aVar.a(false, aVar2.f9270d, fVar);
                    } catch (Exception e3) {
                        e3.printStackTrace();
                        fVar.a("errMsg", e3.getMessage());
                        str2 = aVar2.f9270d;
                        aVar.a(false, str2, fVar);
                    }
                } else {
                    String str4 = r.f9265b;
                    Logger.i(str4, "PermissionsJSAdapter unhandled API request " + fVar3);
                }
            } catch (Exception e4) {
                e4.printStackTrace();
                String b3 = x.this.f9296a;
                Logger.i(b3, "permissionsAPI failed with exception " + e4.getMessage());
            }
        }

        @JavascriptInterface
        public void postAdEventNotification(String str) {
            String str2 = str;
            try {
                String b2 = x.this.f9296a;
                Logger.i(b2, "postAdEventNotification(" + str2 + ")");
                com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str2);
                final String d2 = fVar.d("eventName");
                if (TextUtils.isEmpty(d2)) {
                    x.a(x.this, str2, false, "eventName does not exist", (String) null);
                    return;
                }
                String d3 = fVar.d("dsName");
                String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
                String str3 = !TextUtils.isEmpty(fetchDemandSourceId) ? fetchDemandSourceId : d3;
                JSONObject jSONObject = (JSONObject) fVar.c("extData");
                String d4 = fVar.d("productType");
                d.e e2 = x.h(d4);
                if (x.this.a(d4)) {
                    String b3 = new com.ironsource.sdk.g.f(str2).d(x.ab);
                    if (!TextUtils.isEmpty(b3)) {
                        x.this.b(x.a(b3, x.a("productType", d4, "eventName", d2, "demandSourceName", d3, "demandSourceId", str3, (String) null, false), "postAdEventNotificationSuccess", "postAdEventNotificationFail"));
                    }
                    final d.e eVar = e2;
                    final String str4 = str3;
                    final JSONObject jSONObject2 = jSONObject;
                    x.this.c((Runnable) new Runnable() {
                        public final void run() {
                            if (eVar == d.e.Interstitial || eVar == d.e.RewardedVideo || eVar == d.e.Banner) {
                                com.ironsource.sdk.j.a.a a2 = x.this.b(eVar);
                                if (a2 != null) {
                                    a2.a(eVar, str4, d2, jSONObject2);
                                }
                            } else if (eVar == d.e.OfferWall) {
                                x.this.O.onOfferwallEventNotificationReceived(d2, jSONObject2);
                            }
                        }
                    });
                    return;
                }
                x.a(x.this, str2, false, "productType does not exist", (String) null);
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }

        @JavascriptInterface
        public void removeCloseEventHandler(String str) {
            String b2 = x.this.f9296a;
            Logger.i(b2, "removeCloseEventHandler(" + str + ")");
            if (x.this.G != null) {
                x.this.G.cancel();
            }
            boolean unused = x.this.F = true;
        }

        @JavascriptInterface
        public void removeMessagingInterface(String str) {
            x.this.a((Runnable) new Runnable() {
                public final void run() {
                    x.this.removeJavascriptInterface("GenerateTokenForMessaging");
                }
            });
        }

        @JavascriptInterface
        public void requestToDestroyBanner(String str) {
            String b2 = x.this.f9296a;
            Logger.i(b2, "onCleanUpNonDisplayBannersFail() value=" + str);
        }

        @JavascriptInterface
        public void resumeControllerWebview() {
            x.this.a((Runnable) new Runnable() {
                public final void run() {
                    x.this.l();
                }
            });
        }

        @JavascriptInterface
        public void saveFile(String str) {
            try {
                String b2 = x.this.f9296a;
                Logger.i(b2, "saveFile(" + str + ")");
                com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
                String d2 = fVar.d("path");
                String d3 = fVar.d("file");
                if (TextUtils.isEmpty(d3)) {
                    x.a(x.this, str, false, "Missing parameters for file", "1");
                    return;
                }
                com.ironsource.sdk.h.c cVar = new com.ironsource.sdk.h.c(IronSourceStorageUtils.buildAbsolutePathToDirInCache(x.this.R, d2), SDKUtils.getFileName(d3));
                if (com.ironsource.environment.h.a(x.this.R) <= 0) {
                    x.a(x.this, str, false, "no_disk_space", (String) null);
                } else if (!SDKUtils.isExternalStorageAvailable()) {
                    x.a(x.this, str, false, "sotrage_unavailable", (String) null);
                } else if (cVar.exists()) {
                    x.a(x.this, str, false, "file_already_exist", (String) null);
                } else if (!a.AnonymousClass1.b(x.this.getContext())) {
                    x.a(x.this, str, false, "no_network_connection", (String) null);
                } else {
                    x.a(x.this, str, true, (String) null, (String) null);
                    com.ironsource.sdk.k.b o = x.this.D;
                    o.a(cVar, d3, o.f9571a);
                }
            } catch (Exception e2) {
                x.a(x.this, str, false, e2.getMessage(), (String) null);
                e2.printStackTrace();
            }
        }

        @JavascriptInterface
        public void setBackButtonState(String str) {
            String b2 = x.this.f9296a;
            Logger.i(b2, "setBackButtonState(" + str + ")");
            String d2 = new com.ironsource.sdk.g.f(str).d(AdOperationMetric.INIT_STATE);
            SharedPreferences.Editor edit = com.ironsource.sdk.utils.b.a().f9627a.edit();
            edit.putString("back_button_state", d2);
            edit.apply();
        }

        @JavascriptInterface
        public void setForceClose(String str) {
            String b2 = x.this.f9296a;
            Logger.i(b2, "setForceClose(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d2 = fVar.d(IabUtils.KEY_WIDTH);
            String d3 = fVar.d(IabUtils.KEY_HEIGHT);
            int unused = x.this.H = Integer.parseInt(d2);
            int unused2 = x.this.I = Integer.parseInt(d3);
            String unused3 = x.this.J = fVar.d("position");
        }

        @JavascriptInterface
        public void setMixedContentAlwaysAllow(String str) {
            String b2 = x.this.f9296a;
            Logger.i(b2, "setMixedContentAlwaysAllow(" + str + ")");
            x.this.a((Runnable) new Runnable() {
                public final void run() {
                    if (Build.VERSION.SDK_INT >= 21) {
                        x.this.getSettings().setMixedContentMode(0);
                    }
                }
            });
        }

        @JavascriptInterface
        public void setOrientation(String str) {
            String b2 = x.this.f9296a;
            Logger.i(b2, "setOrientation(" + str + ")");
            String d2 = new com.ironsource.sdk.g.f(str).d(AdUnitActivity.EXTRA_ORIENTATION);
            x.this.k = d2;
            if (x.this.v != null) {
                x.this.v.onOrientationChanged(d2, com.ironsource.environment.h.k(x.this.getContext()));
            }
        }

        @JavascriptInterface
        public void setStoreSearchKeys(String str) {
            String b2 = x.this.f9296a;
            Logger.i(b2, "setStoreSearchKeys(" + str + ")");
            SharedPreferences.Editor edit = com.ironsource.sdk.utils.b.a().f9627a.edit();
            edit.putString("search_keys", str);
            edit.apply();
        }

        @JavascriptInterface
        public void setTouchListener(String str) {
            String b2 = x.this.f9296a;
            Logger.i(b2, "removeCloseEventHandler(" + str + ")");
            x.this.a((Runnable) new Runnable() {
                public final void run() {
                    x.this.setOnTouchListener(new h(x.this, (byte) 0));
                }
            });
        }

        @JavascriptInterface
        public void setUserData(String str) {
            String str2 = str;
            String b2 = x.this.f9296a;
            Logger.i(b2, "setUserData(" + str2 + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str2);
            if (!fVar.a("key")) {
                x.a(x.this, str2, false, "key does not exist", (String) null);
            } else if (!fVar.a(AppMeasurementSdk.ConditionalUserProperty.VALUE)) {
                x.a(x.this, str2, false, "value does not exist", (String) null);
            } else {
                String d2 = fVar.d("key");
                String d3 = fVar.d(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                SharedPreferences.Editor edit = com.ironsource.sdk.utils.b.a().f9627a.edit();
                edit.putString(d2, d3);
                if (edit.commit()) {
                    x.this.b(x.b(new com.ironsource.sdk.g.f(str2).d(x.ab), x.a(d2, d3, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
                    return;
                }
                x.a(x.this, str2, false, "SetUserData failed writing to shared preferences", (String) null);
            }
        }

        @JavascriptInterface
        public void setWebviewBackgroundColor(String str) {
            String b2 = x.this.f9296a;
            Logger.i(b2, "setWebviewBackgroundColor(" + str + ")");
            x.g(x.this, str);
        }
    }

    interface e {
        void a(String str, d.e eVar, com.ironsource.sdk.g.c cVar);
    }

    static class f {

        /* renamed from: a  reason: collision with root package name */
        String f9415a;

        /* renamed from: b  reason: collision with root package name */
        String f9416b;

        f() {
        }
    }

    public enum g {
        Display,
        Gone
    }

    class h implements View.OnTouchListener {
        private h() {
        }

        /* synthetic */ h(x xVar, byte b2) {
            this();
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                String b2 = x.this.f9296a;
                StringBuilder sb = new StringBuilder("X:");
                int i = (int) x;
                sb.append(i);
                sb.append(" Y:");
                int i2 = (int) y;
                sb.append(i2);
                Logger.i(b2, sb.toString());
                int m = com.ironsource.environment.h.m();
                int n = com.ironsource.environment.h.n();
                String b3 = x.this.f9296a;
                Logger.i(b3, "Width:" + m + " Height:" + n);
                int dpToPx = SDKUtils.dpToPx((long) x.this.H);
                int dpToPx2 = SDKUtils.dpToPx((long) x.this.I);
                if ("top-right".equalsIgnoreCase(x.this.J)) {
                    i = m - i;
                } else if (!"top-left".equalsIgnoreCase(x.this.J)) {
                    if ("bottom-right".equalsIgnoreCase(x.this.J)) {
                        i = m - i;
                    } else if (!"bottom-left".equalsIgnoreCase(x.this.J)) {
                        i = 0;
                        i2 = 0;
                    }
                    i2 = n - i2;
                }
                if (i <= dpToPx && i2 <= dpToPx2) {
                    boolean unused = x.this.F = false;
                    if (x.this.G != null) {
                        x.this.G.cancel();
                    }
                    CountDownTimer unused2 = x.this.G = new CountDownTimer(2000, 500) {
                        public final void onFinish() {
                            Logger.i(x.this.f9296a, "Close Event Timer Finish");
                            if (x.this.F) {
                                boolean unused = x.this.F = false;
                            } else {
                                x.this.e("forceClose");
                            }
                        }

                        public final void onTick(long j) {
                            String b2 = x.this.f9296a;
                            Logger.i(b2, "Close Event Timer Tick " + j);
                        }
                    }.start();
                }
            }
            return false;
        }
    }

    class i extends WebViewClient {
        private i() {
        }

        /* synthetic */ i(x xVar, byte b2) {
            this();
        }

        public final void onPageFinished(WebView webView, String str) {
            Logger.i("onPageFinished", str);
            if (str.contains("adUnit") || str.contains("index.html")) {
                x.this.b(x.g("pageFinished"));
            }
            super.onPageFinished(webView, str);
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Logger.i("onPageStarted", str);
            super.onPageStarted(webView, str, bitmap);
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            Logger.i("onReceivedError", str2 + " " + str);
            if (str2.contains("mobileController.html") && x.this.W != null) {
                e h2 = x.this.W;
                h2.a("controller html - web-view receivedError on loading - " + str + " (errorCode: " + i + ")");
            }
            super.onReceivedError(webView, i, str, str2);
        }

        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            String b2 = x.this.f9296a;
            Log.e(b2, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            String str = renderProcessGoneDetail.didCrash() ? "Render process was observed to crash" : "Render process was killed by the system";
            if (x.this.W != null) {
                x.this.W.b(str);
            }
            x xVar = x.this;
            if (xVar.f9297e == null) {
                return true;
            }
            xVar.j();
            d.e eVar = xVar.f9297e.f9336a;
            String str2 = xVar.f9297e.f9337b;
            if (!xVar.a(eVar.toString())) {
                return true;
            }
            xVar.a(eVar, str2);
            return true;
        }

        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            boolean z;
            Logger.i("shouldInterceptRequest", str);
            try {
                z = new URL(str).getFile().contains("mraid.js");
            } catch (MalformedURLException unused) {
                z = false;
            }
            if (z) {
                String str2 = "file://" + x.this.R + File.separator + "mraid.js";
                try {
                    new FileInputStream(new File(str2));
                    return new WebResourceResponse("text/javascript", "UTF-8", getClass().getResourceAsStream(str2));
                } catch (FileNotFoundException unused2) {
                }
            }
            return super.shouldInterceptRequest(webView, str);
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.i("shouldOverrideUrlLoading", str);
            try {
                if (x.this.f(str)) {
                    x.this.i();
                    return true;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    public x(Context context, j jVar, c cVar, e eVar, com.ironsource.environment.e.a aVar) {
        super(context);
        Logger.i(this.f9296a, "C'tor");
        this.u = cVar;
        this.W = eVar;
        this.w = aVar;
        this.R = IronSourceStorageUtils.getNetworkStorageDir(context);
        this.V = jVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.i = new FrameLayout(context);
        this.K = new FrameLayout(context);
        this.K.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.K.setVisibility(8);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(this);
        this.i.addView(this.K, layoutParams);
        this.i.addView(frameLayout);
        this.m = new com.ironsource.sdk.g.b();
        com.ironsource.sdk.k.b a2 = a();
        this.D = a2;
        a2.f9571a.f9569a = this;
        this.S = new f(SDKUtils.getNetworkConfiguration(), this.R, SDKUtils.getControllerUrl(), this.D);
        this.f9299g = new a(this, (byte) 0);
        setWebViewClient(new i(this, (byte) 0));
        setWebChromeClient(this.f9299g);
        com.ironsource.sdk.utils.d.a(this);
        t tVar = new t(UUID.randomUUID().toString());
        addJavascriptInterface(new h(new d(new d()), tVar), APSAnalytics.OS_NAME);
        addJavascriptInterface(new s(tVar), "GenerateTokenForMessaging");
        setDownloadListener(this);
        this.aa = new com.ironsource.sdk.service.Connectivity.b(SDKUtils.getControllerConfigAsJSONObject(), context) {
            public final void a() {
                if (x.this.E) {
                    x.this.d("none");
                }
            }

            public final void a(String str) {
                if (x.this.E) {
                    x.this.d(str);
                }
            }

            public final void a(String str, JSONObject jSONObject) {
                if (jSONObject != null && x.this.E) {
                    try {
                        jSONObject.put("connectionType", str);
                        x xVar = x.this;
                        String str2 = xVar.f9296a;
                        Logger.i(str2, "device connection info changed: " + jSONObject.toString());
                        xVar.b(x.b("connectionInfoChanged", x.a("connectionInfo", jSONObject.toString(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        };
        a(context);
        y = FeaturesManager.getInstance().getDebugMode();
    }

    private String a(d.e eVar, JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.toString(jSONObject.optInt(IronSourceConstants.KEY_SESSION_DEPTH)));
        String optString = jSONObject.optString("demandSourceName");
        String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(jSONObject);
        com.ironsource.sdk.g.c a2 = this.V.a(eVar, fetchDemandSourceId);
        if (a2 != null) {
            if (a2.f9518d != null) {
                hashMap.putAll(a2.f9518d);
            }
            if (!TextUtils.isEmpty(optString)) {
                hashMap.put("demandSourceName", optString);
            }
            if (!TextUtils.isEmpty(fetchDemandSourceId)) {
                hashMap.put("demandSourceId", fetchDemandSourceId);
            }
        }
        Map<String, String> a3 = a(eVar);
        if (a3 != null) {
            hashMap.putAll(a3);
        }
        String flatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(hashMap);
        a.C0089a a4 = a.C0089a.a(eVar);
        return a(a4.f9495a, flatMapToJsonAsString, a4.f9496b, a4.f9497c);
    }

    /* access modifiers changed from: private */
    public static String a(String str, String str2, String str3, String str4) {
        return "SSA_CORE.SDKController.runFunction('" + str + "?parameters=" + str2 + "','" + str3 + "','" + str4 + "');";
    }

    public static String a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                jSONObject.put(str, SDKUtils.encodeString(str2));
            }
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                jSONObject.put(str3, SDKUtils.encodeString(str4));
            }
            if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str6)) {
                jSONObject.put(str5, SDKUtils.encodeString(str6));
            }
            if (!TextUtils.isEmpty(str7) && !TextUtils.isEmpty(str8)) {
                jSONObject.put(str7, SDKUtils.encodeString(str8));
            }
            if (!TextUtils.isEmpty(str9)) {
                jSONObject.put(str9, z2);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject.toString();
    }

    private Map<String, String> a(d.e eVar) {
        if (eVar == d.e.OfferWall) {
            return this.C;
        }
        return null;
    }

    static /* synthetic */ void a(x xVar, final String str, final d.e eVar, final com.ironsource.sdk.g.c cVar) {
        if (xVar.a(eVar.toString())) {
            xVar.c((Runnable) new Runnable() {
                public final void run() {
                    if (d.e.RewardedVideo == eVar || d.e.Interstitial == eVar || d.e.Banner == eVar) {
                        com.ironsource.sdk.g.c cVar = cVar;
                        if (cVar != null && !TextUtils.isEmpty(cVar.f9516b)) {
                            com.ironsource.sdk.j.a.a a2 = x.this.b(eVar);
                            String b2 = x.this.f9296a;
                            Log.d(b2, "onAdProductInitFailed (message:" + str + ")(" + eVar + ")");
                            if (a2 != null) {
                                a2.a(eVar, cVar.f9516b, str);
                            }
                        }
                    } else if (d.e.OfferWall == eVar) {
                        x.this.O.onOfferwallInitFail(str);
                    } else if (d.e.OfferWallCredits == eVar) {
                        x.this.O.onGetOWCreditsFailed(str);
                    }
                }
            });
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x0023;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void a(com.ironsource.sdk.controller.x r3, java.lang.String r4, boolean r5, java.lang.String r6, java.lang.String r7) {
        /*
            com.ironsource.sdk.g.f r0 = new com.ironsource.sdk.g.f
            r0.<init>(r4)
            java.lang.String r1 = ab
            java.lang.String r1 = r0.d(r1)
            java.lang.String r2 = ac
            java.lang.String r0 = r0.d(r2)
            if (r5 == 0) goto L_0x001a
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 != 0) goto L_0x0022
            goto L_0x0023
        L_0x001a:
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 != 0) goto L_0x0022
            r1 = r0
            goto L_0x0023
        L_0x0022:
            r1 = 0
        L_0x0023:
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 != 0) goto L_0x005c
            boolean r5 = android.text.TextUtils.isEmpty(r6)
            if (r5 != 0) goto L_0x0040
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x003f }
            r5.<init>(r4)     // Catch:{ JSONException -> 0x003f }
            java.lang.String r0 = "errMsg"
            org.json.JSONObject r5 = r5.put(r0, r6)     // Catch:{ JSONException -> 0x003f }
            java.lang.String r4 = r5.toString()     // Catch:{ JSONException -> 0x003f }
            goto L_0x0040
        L_0x003f:
        L_0x0040:
            boolean r5 = android.text.TextUtils.isEmpty(r7)
            if (r5 != 0) goto L_0x0055
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0055 }
            r5.<init>(r4)     // Catch:{ JSONException -> 0x0055 }
            java.lang.String r6 = "errCode"
            org.json.JSONObject r5 = r5.put(r6, r7)     // Catch:{ JSONException -> 0x0055 }
            java.lang.String r4 = r5.toString()     // Catch:{ JSONException -> 0x0055 }
        L_0x0055:
            java.lang.String r4 = b((java.lang.String) r1, (java.lang.String) r4)
            r3.b((java.lang.String) r4)
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.x.a(com.ironsource.sdk.controller.x, java.lang.String, boolean, java.lang.String, java.lang.String):void");
    }

    static /* synthetic */ void a(x xVar, JSONObject jSONObject) {
        if (jSONObject.optBoolean("inspectWebview") && Build.VERSION.SDK_INT >= 19) {
            setWebContentsDebuggingEnabled(true);
        }
    }

    private void a(String str, String str2, d.e eVar, com.ironsource.sdk.g.c cVar, e eVar2) {
        String str3;
        String str4;
        String str5;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            eVar2.a("User id or Application key are missing", eVar, cVar);
            return;
        }
        f fVar = new f();
        if (eVar == d.e.RewardedVideo || eVar == d.e.Interstitial || eVar == d.e.OfferWall || eVar == d.e.Banner) {
            HashMap hashMap = new HashMap();
            hashMap.put("applicationKey", this.A);
            hashMap.put("applicationUserId", this.B);
            if (cVar != null) {
                if (cVar.f9518d != null) {
                    hashMap.putAll(cVar.f9518d);
                    com.ironsource.sdk.service.a aVar = com.ironsource.sdk.service.a.f9599a;
                    hashMap.put("loadStartTime", String.valueOf(com.ironsource.sdk.service.a.a(cVar.f9516b)));
                }
                hashMap.put("demandSourceName", cVar.f9515a);
                hashMap.put("demandSourceId", cVar.f9516b);
            }
            Map<String, String> a2 = a(eVar);
            if (a2 != null) {
                hashMap.putAll(a2);
            }
            String flatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(hashMap);
            a.C0089a aVar2 = new a.C0089a();
            if (eVar == d.e.RewardedVideo) {
                aVar2.f9495a = "initRewardedVideo";
                aVar2.f9496b = "onInitRewardedVideoSuccess";
                str5 = "onInitRewardedVideoFail";
            } else if (eVar == d.e.Interstitial) {
                aVar2.f9495a = "initInterstitial";
                aVar2.f9496b = "onInitInterstitialSuccess";
                str5 = "onInitInterstitialFail";
            } else if (eVar == d.e.OfferWall) {
                aVar2.f9495a = "initOfferWall";
                aVar2.f9496b = "onInitOfferWallSuccess";
                str5 = "onInitOfferWallFail";
            } else {
                if (eVar == d.e.Banner) {
                    aVar2.f9495a = "initBanner";
                    aVar2.f9496b = "onInitBannerSuccess";
                    str5 = "onInitBannerFail";
                }
                str4 = a(aVar2.f9495a, flatMapToJsonAsString, aVar2.f9496b, aVar2.f9497c);
                str3 = aVar2.f9495a;
            }
            aVar2.f9497c = str5;
            str4 = a(aVar2.f9495a, flatMapToJsonAsString, aVar2.f9496b, aVar2.f9497c);
            str3 = aVar2.f9495a;
        } else {
            if (eVar == d.e.OfferWallCredits) {
                str3 = "getUserCredits";
                str4 = a(str3, a("productType", "OfferWall", "applicationKey", this.A, "applicationUserId", this.B, (String) null, (String) null, (String) null, false), "null", "onGetUserCreditsFail");
            }
            b(fVar.f9416b);
        }
        fVar.f9415a = str3;
        fVar.f9416b = str4;
        b(fVar.f9416b);
    }

    private void a(String str, String str2, String str3) {
        try {
            b(b("assetCachedFailed", a("file", str, "path", i(str2), "errMsg", str3, (String) null, (String) null, (String) null, false)));
        } catch (Exception unused) {
        }
    }

    public static int b() {
        return y;
    }

    /* access modifiers changed from: private */
    public com.ironsource.sdk.j.a.a b(d.e eVar) {
        if (eVar == d.e.Interstitial) {
            return this.N;
        }
        if (eVar == d.e.RewardedVideo) {
            return this.M;
        }
        if (eVar == d.e.Banner) {
            return this.P;
        }
        return null;
    }

    public static String b(String str, String str2) {
        return "SSA_CORE.SDKController.runFunction('" + str + "?parameters=" + str2 + "');";
    }

    private String b(JSONObject jSONObject) {
        com.ironsource.sdk.utils.a a2 = com.ironsource.sdk.utils.a.a(getContext());
        StringBuilder sb = new StringBuilder();
        String sDKVersion = SDKUtils.getSDKVersion();
        if (!TextUtils.isEmpty(sDKVersion)) {
            sb.append("SDKVersion=");
            sb.append(sDKVersion);
            sb.append("&");
        }
        String str = a2.f9622c;
        if (!TextUtils.isEmpty(str)) {
            sb.append("deviceOs=");
            sb.append(str);
        }
        Uri parse = Uri.parse(SDKUtils.getControllerUrl());
        if (parse != null) {
            String str2 = parse.getScheme() + ":";
            String host = parse.getHost();
            int port = parse.getPort();
            if (port != -1) {
                host = host + ":" + port;
            }
            sb.append("&protocol");
            sb.append("=");
            sb.append(str2);
            sb.append("&domain");
            sb.append("=");
            sb.append(host);
            if (jSONObject.keys().hasNext()) {
                try {
                    String jSONObject2 = new JSONObject(jSONObject, new String[]{"isSecured", "applicationKey"}).toString();
                    if (!TextUtils.isEmpty(jSONObject2)) {
                        sb.append("&controllerConfig");
                        sb.append("=");
                        sb.append(jSONObject2);
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
            sb.append("&debug");
            sb.append("=");
            sb.append(y);
        }
        return sb.toString();
    }

    static /* synthetic */ void b(x xVar, Context context) {
        try {
            if (xVar.aa != null) {
                xVar.aa.f9592a.a(context);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    static /* synthetic */ void c(x xVar, Context context) {
        try {
            if (xVar.aa != null) {
                xVar.aa.f9592a.b(context);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    static /* synthetic */ void c(x xVar, final String str, String str2) {
        final String d2 = new com.ironsource.sdk.g.f(str2).d("errMsg");
        if (!TextUtils.isEmpty(d2)) {
            xVar.a((Runnable) new Runnable() {
                public final void run() {
                    if (x.b() == d.C0090d.MODE_3.f9547d) {
                        Activity a2 = x.this.u.a();
                        Toast.makeText(a2, str + " : " + d2, 1).show();
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public Object[] c(Context context) {
        boolean z2;
        com.ironsource.sdk.utils.a a2 = com.ironsource.sdk.utils.a.a(context);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appOrientation", "none");
            jSONObject.put("deviceOrientation", SDKUtils.translateDeviceOrientation(com.ironsource.environment.h.o(context)));
            String str = a2.f9620a;
            if (str != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOEM"), SDKUtils.encodeString(str));
            }
            String str2 = a2.f9621b;
            if (str2 != null) {
                jSONObject.put(SDKUtils.encodeString("deviceModel"), SDKUtils.encodeString(str2));
                z2 = false;
            } else {
                z2 = true;
            }
            try {
                SDKUtils.loadGoogleAdvertiserInfo(context);
                String advertiserId = SDKUtils.getAdvertiserId();
                Boolean valueOf = Boolean.valueOf(SDKUtils.isLimitAdTrackingEnabled());
                if (!TextUtils.isEmpty(advertiserId)) {
                    Logger.i(this.f9296a, "add AID and LAT");
                    jSONObject.put("isLimitAdTrackingEnabled", valueOf);
                    jSONObject.put("deviceIds" + "[AID" + "]", SDKUtils.encodeString(advertiserId));
                }
                String str3 = a2.f9622c;
                if (str3 != null) {
                    jSONObject.put(SDKUtils.encodeString("deviceOs"), SDKUtils.encodeString(str3));
                } else {
                    z2 = true;
                }
                String str4 = a2.f9623d;
                if (str4 != null) {
                    jSONObject.put(SDKUtils.encodeString("deviceOSVersion"), str4.replaceAll("[^0-9/.]", ""));
                } else {
                    z2 = true;
                }
                String str5 = a2.f9623d;
                if (str5 != null) {
                    jSONObject.put(SDKUtils.encodeString("deviceOSVersionFull"), SDKUtils.encodeString(str5));
                }
                String valueOf2 = String.valueOf(a2.f9624e);
                if (valueOf2 != null) {
                    jSONObject.put(SDKUtils.encodeString("deviceApiLevel"), valueOf2);
                } else {
                    z2 = true;
                }
                String sDKVersion = SDKUtils.getSDKVersion();
                if (sDKVersion != null) {
                    jSONObject.put(SDKUtils.encodeString("SDKVersion"), SDKUtils.encodeString(sDKVersion));
                }
                if (a2.f9625f != null && a2.f9625f.length() > 0) {
                    jSONObject.put(SDKUtils.encodeString("mobileCarrier"), SDKUtils.encodeString(a2.f9625f));
                }
                String a3 = com.ironsource.d.a.a(context);
                if (!a3.equals("none")) {
                    jSONObject.put(SDKUtils.encodeString("connectionType"), SDKUtils.encodeString(a3));
                } else {
                    z2 = true;
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    jSONObject.put(SDKUtils.encodeString("hasVPN"), com.ironsource.d.a.c(context));
                }
                String language = context.getResources().getConfiguration().locale.getLanguage();
                if (!TextUtils.isEmpty(language)) {
                    jSONObject.put(SDKUtils.encodeString("deviceLanguage"), SDKUtils.encodeString(language.toUpperCase()));
                }
                if (SDKUtils.isExternalStorageAvailable()) {
                    jSONObject.put(SDKUtils.encodeString("diskFreeSize"), SDKUtils.encodeString(String.valueOf(com.ironsource.environment.h.a(this.R))));
                } else {
                    z2 = true;
                }
                String valueOf3 = String.valueOf(com.ironsource.environment.h.m());
                if (!TextUtils.isEmpty(valueOf3)) {
                    jSONObject.put(SDKUtils.encodeString("deviceScreenSize") + "[" + SDKUtils.encodeString(IabUtils.KEY_WIDTH) + "]", SDKUtils.encodeString(valueOf3));
                } else {
                    z2 = true;
                }
                String valueOf4 = String.valueOf(com.ironsource.environment.h.n());
                jSONObject.put(SDKUtils.encodeString("deviceScreenSize") + "[" + SDKUtils.encodeString(IabUtils.KEY_HEIGHT) + "]", SDKUtils.encodeString(valueOf4));
                String packageName = getContext().getPackageName();
                if (!TextUtils.isEmpty(packageName)) {
                    jSONObject.put(SDKUtils.encodeString("bundleId"), SDKUtils.encodeString(packageName));
                }
                String valueOf5 = String.valueOf(com.ironsource.environment.h.o());
                if (!TextUtils.isEmpty(valueOf5)) {
                    jSONObject.put(SDKUtils.encodeString("deviceScreenScale"), SDKUtils.encodeString(valueOf5));
                }
                String valueOf6 = String.valueOf(com.ironsource.environment.h.j());
                if (!TextUtils.isEmpty(valueOf6)) {
                    jSONObject.put(SDKUtils.encodeString("unLocked"), SDKUtils.encodeString(valueOf6));
                }
                com.ironsource.sdk.utils.a.a(context);
                jSONObject.put(SDKUtils.encodeString("deviceVolume"), (double) com.ironsource.sdk.utils.a.b(context));
                jSONObject.put(SDKUtils.encodeString("batteryLevel"), com.ironsource.environment.h.v(context));
                jSONObject.put(SDKUtils.encodeString("mcc"), a.AnonymousClass1.c(context));
                jSONObject.put(SDKUtils.encodeString("mnc"), a.AnonymousClass1.d(context));
                jSONObject.put(SDKUtils.encodeString("phoneType"), a.AnonymousClass1.f(context));
                jSONObject.put(SDKUtils.encodeString("simOperator"), SDKUtils.encodeString(a.AnonymousClass1.e(context)));
                jSONObject.put(SDKUtils.encodeString("lastUpdateTime"), com.ironsource.environment.c.b(context));
                jSONObject.put(SDKUtils.encodeString("firstInstallTime"), com.ironsource.environment.c.a(context));
                jSONObject.put(SDKUtils.encodeString("appVersion"), SDKUtils.encodeString(com.ironsource.environment.c.c(context)));
                String d2 = com.ironsource.environment.c.d(context);
                if (!TextUtils.isEmpty(d2)) {
                    jSONObject.put(SDKUtils.encodeString("installerPackageName"), SDKUtils.encodeString(d2));
                }
                jSONObject.put(SDKUtils.encodeString("gpi"), com.ironsource.environment.k.a(getContext()));
                jSONObject.put(SDKUtils.encodeString("screenBrightness"), com.ironsource.environment.h.z(context));
            } catch (JSONException e2) {
                e = e2;
                e.printStackTrace();
                return new Object[]{jSONObject.toString(), Boolean.valueOf(z2)};
            }
        } catch (JSONException e3) {
            e = e3;
            z2 = false;
            e.printStackTrace();
            return new Object[]{jSONObject.toString(), Boolean.valueOf(z2)};
        }
        return new Object[]{jSONObject.toString(), Boolean.valueOf(z2)};
    }

    /* access modifiers changed from: private */
    public Object[] c(String str, String str2) {
        boolean z2;
        JSONObject jSONObject = new JSONObject();
        Map<String, String> map = null;
        if (!TextUtils.isEmpty(str)) {
            d.e h2 = h(str);
            if (h2 == d.e.OfferWall) {
                map = this.C;
            } else {
                com.ironsource.sdk.g.c a2 = this.V.a(h2, str2);
                if (a2 != null) {
                    Map<String, String> map2 = a2.f9518d;
                    map2.put("demandSourceName", a2.f9515a);
                    map2.put("demandSourceId", a2.f9516b);
                    map = map2;
                }
            }
            try {
                jSONObject.put("productType", str);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            try {
                Map<String, String> initSDKParams = SDKUtils.getInitSDKParams();
                if (initSDKParams != null) {
                    jSONObject = SDKUtils.mergeJSONObjects(jSONObject, new JSONObject(initSDKParams));
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            z2 = false;
        } else {
            z2 = true;
        }
        if (!TextUtils.isEmpty(this.B)) {
            try {
                jSONObject.put(SDKUtils.encodeString("applicationUserId"), SDKUtils.encodeString(this.B));
            } catch (JSONException e4) {
                e4.printStackTrace();
            }
        } else {
            z2 = true;
        }
        if (!TextUtils.isEmpty(this.A)) {
            try {
                jSONObject.put(SDKUtils.encodeString("applicationKey"), SDKUtils.encodeString(this.A));
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
        } else {
            z2 = true;
        }
        if (map != null && !map.isEmpty()) {
            for (Map.Entry next : map.entrySet()) {
                if (((String) next.getKey()).equalsIgnoreCase("sdkWebViewCache")) {
                    if (((String) next.getValue()).equalsIgnoreCase(BuildConfig.ADAPTER_VERSION)) {
                        getSettings().setCacheMode(2);
                    } else {
                        getSettings().setCacheMode(-1);
                    }
                }
                try {
                    jSONObject.put(SDKUtils.encodeString((String) next.getKey()), SDKUtils.encodeString((String) next.getValue()));
                } catch (JSONException e6) {
                    e6.printStackTrace();
                }
            }
        }
        return new Object[]{jSONObject.toString(), Boolean.valueOf(z2)};
    }

    static String g(String str) {
        return "SSA_CORE.SDKController.runFunction('" + str + "');";
    }

    static /* synthetic */ void g(x xVar, String str) {
        com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
        String d2 = fVar.d("color");
        String d3 = fVar.d("adViewId");
        int parseColor = !"transparent".equalsIgnoreCase(d2) ? Color.parseColor(d2) : 0;
        if (d3 != null) {
            WebView b2 = com.ironsource.sdk.c.d.a().a(d3).b();
            if (b2 != null) {
                b2.setBackgroundColor(parseColor);
                return;
            }
            return;
        }
        xVar.setBackgroundColor(parseColor);
    }

    /* access modifiers changed from: private */
    public static d.e h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equalsIgnoreCase(d.e.Interstitial.toString())) {
            return d.e.Interstitial;
        }
        if (str.equalsIgnoreCase(d.e.RewardedVideo.toString())) {
            return d.e.RewardedVideo;
        }
        if (str.equalsIgnoreCase(d.e.OfferWall.toString())) {
            return d.e.OfferWall;
        }
        if (str.equalsIgnoreCase(d.e.Banner.toString())) {
            return d.e.Banner;
        }
        return null;
    }

    static /* synthetic */ void h(x xVar, String str) {
        try {
            String str2 = xVar.f9296a;
            Logger.i(str2, "load(): " + str);
            xVar.loadUrl(str);
        } catch (Throwable th) {
            String str3 = xVar.f9296a;
            Logger.e(str3, "WebViewController::load: " + th);
        }
    }

    private String i(String str) {
        String str2 = this.R + File.separator;
        return str.contains(str2) ? str.substring(str2.length()) : str;
    }

    /* access modifiers changed from: package-private */
    public final com.ironsource.sdk.k.b a() {
        return com.ironsource.sdk.k.b.a(this.R, this.w);
    }

    public final void a(int i2) {
        if (this.S.a()) {
            final JSONObject controllerConfigAsJSONObject = SDKUtils.getControllerConfigAsJSONObject();
            String b2 = b(controllerConfigAsJSONObject);
            Map<String, String> initSDKParams = SDKUtils.getInitSDKParams();
            if (initSDKParams != null && initSDKParams.containsKey("sessionid")) {
                b2 = String.format("%s&sessionid=%s", new Object[]{b2, initSDKParams.get("sessionid")});
            }
            final String str = this.S.d().toURI().toString() + "?" + b2;
            this.w.a(new Runnable() {
                public final void run() {
                    x.a(x.this, controllerConfigAsJSONObject);
                    x.h(x.this, "about:blank");
                    x.h(x.this, str);
                }
            });
            this.f9298f = new CountDownTimer(50000, 1000, i2) {

                /* renamed from: b  reason: collision with root package name */
                private /* synthetic */ int f9310b;

                {
                    this.f9310b = r6;
                }

                public final void onFinish() {
                    Logger.i(x.this.f9296a, "Loading Controller Timer Finish");
                    int i = this.f9310b;
                    if (i == 3) {
                        x.this.c((Runnable) new Runnable() {
                            public final void run() {
                                x.this.W.a("controller html - failed to load into web-view");
                            }
                        });
                    } else {
                        x.this.a(i + 1);
                    }
                }

                public final void onTick(long j) {
                    String b2 = x.this.f9296a;
                    Logger.i(b2, "Loading Controller Timer Tick " + j);
                }
            }.start();
            return;
        }
        Logger.i(this.f9296a, "load(): Mobile Controller HTML Does not exist");
    }

    public final void a(final Context context) {
        b((Runnable) new Runnable() {
            public final void run() {
                x.b(x.this, context);
            }
        });
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        if (android.text.TextUtils.isEmpty(r3) == false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ironsource.sdk.g.b r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.T
            monitor-enter(r0)
            boolean r1 = r11.f9510d     // Catch:{ all -> 0x0144 }
            if (r1 == 0) goto L_0x0140
            boolean r1 = r10.E     // Catch:{ all -> 0x0144 }
            if (r1 == 0) goto L_0x0140
            java.lang.String r1 = r10.f9296a     // Catch:{ all -> 0x0144 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0144 }
            java.lang.String r3 = "restoreState(state:"
            r2.<init>(r3)     // Catch:{ all -> 0x0144 }
            r2.append(r11)     // Catch:{ all -> 0x0144 }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x0144 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0144 }
            android.util.Log.d(r1, r2)     // Catch:{ all -> 0x0144 }
            int r1 = r11.f9511e     // Catch:{ all -> 0x0144 }
            r2 = -1
            if (r1 == r2) goto L_0x0089
            com.ironsource.sdk.g.d$e r3 = com.ironsource.sdk.g.d.e.RewardedVideo     // Catch:{ all -> 0x0144 }
            int r3 = r3.ordinal()     // Catch:{ all -> 0x0144 }
            if (r1 != r3) goto L_0x004b
            java.lang.String r1 = r10.f9296a     // Catch:{ all -> 0x0144 }
            java.lang.String r3 = "onRVAdClosed()"
            android.util.Log.d(r1, r3)     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.g.d$e r1 = com.ironsource.sdk.g.d.e.RewardedVideo     // Catch:{ all -> 0x0144 }
            java.lang.String r3 = r11.f9509c     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.j.a.a r4 = r10.b((com.ironsource.sdk.g.d.e) r1)     // Catch:{ all -> 0x0144 }
            if (r4 == 0) goto L_0x0083
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0144 }
            if (r5 != 0) goto L_0x0083
        L_0x0047:
            r4.a(r1, r3)     // Catch:{ all -> 0x0144 }
            goto L_0x0083
        L_0x004b:
            com.ironsource.sdk.g.d$e r3 = com.ironsource.sdk.g.d.e.Interstitial     // Catch:{ all -> 0x0144 }
            int r3 = r3.ordinal()     // Catch:{ all -> 0x0144 }
            if (r1 != r3) goto L_0x006b
            java.lang.String r1 = r10.f9296a     // Catch:{ all -> 0x0144 }
            java.lang.String r3 = "onInterstitialAdClosed()"
            android.util.Log.d(r1, r3)     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.g.d$e r1 = com.ironsource.sdk.g.d.e.Interstitial     // Catch:{ all -> 0x0144 }
            java.lang.String r3 = r11.f9509c     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.j.a.a r4 = r10.b((com.ironsource.sdk.g.d.e) r1)     // Catch:{ all -> 0x0144 }
            if (r4 == 0) goto L_0x0083
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0144 }
            if (r5 != 0) goto L_0x0083
            goto L_0x0047
        L_0x006b:
            com.ironsource.sdk.g.d$e r3 = com.ironsource.sdk.g.d.e.OfferWall     // Catch:{ all -> 0x0144 }
            int r3 = r3.ordinal()     // Catch:{ all -> 0x0144 }
            if (r1 != r3) goto L_0x0083
            java.lang.String r1 = r10.f9296a     // Catch:{ all -> 0x0144 }
            java.lang.String r3 = "onOWAdClosed()"
            android.util.Log.d(r1, r3)     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.j.e r1 = r10.O     // Catch:{ all -> 0x0144 }
            if (r1 == 0) goto L_0x0083
            com.ironsource.sdk.j.e r1 = r10.O     // Catch:{ all -> 0x0144 }
            r1.onOWAdClosed()     // Catch:{ all -> 0x0144 }
        L_0x0083:
            r11.f9511e = r2     // Catch:{ all -> 0x0144 }
            r1 = 0
            r11.f9509c = r1     // Catch:{ all -> 0x0144 }
            goto L_0x0090
        L_0x0089:
            java.lang.String r1 = r10.f9296a     // Catch:{ all -> 0x0144 }
            java.lang.String r2 = "No ad was opened"
            android.util.Log.d(r1, r2)     // Catch:{ all -> 0x0144 }
        L_0x0090:
            java.lang.String r1 = r11.f9512f     // Catch:{ all -> 0x0144 }
            java.lang.String r2 = r11.f9513g     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.controller.j r3 = r10.V     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.g.d$e r4 = com.ironsource.sdk.g.d.e.Interstitial     // Catch:{ all -> 0x0144 }
            java.util.Collection r3 = r3.b(r4)     // Catch:{ all -> 0x0144 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0144 }
        L_0x00a0:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0144 }
            r5 = 2
            if (r4 == 0) goto L_0x00e1
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.g.c r4 = (com.ironsource.sdk.g.c) r4     // Catch:{ all -> 0x0144 }
            int r6 = r4.f9519e     // Catch:{ all -> 0x0144 }
            if (r6 != r5) goto L_0x00a0
            java.lang.String r5 = r10.f9296a     // Catch:{ all -> 0x0144 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0144 }
            java.lang.String r7 = "initInterstitial(appKey:"
            r6.<init>(r7)     // Catch:{ all -> 0x0144 }
            r6.append(r1)     // Catch:{ all -> 0x0144 }
            java.lang.String r7 = ", userId:"
            r6.append(r7)     // Catch:{ all -> 0x0144 }
            r6.append(r2)     // Catch:{ all -> 0x0144 }
            java.lang.String r7 = ", demandSource:"
            r6.append(r7)     // Catch:{ all -> 0x0144 }
            java.lang.String r7 = r4.f9515a     // Catch:{ all -> 0x0144 }
            r6.append(r7)     // Catch:{ all -> 0x0144 }
            java.lang.String r7 = ")"
            r6.append(r7)     // Catch:{ all -> 0x0144 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0144 }
            android.util.Log.d(r5, r6)     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.j.a.c r5 = r10.N     // Catch:{ all -> 0x0144 }
            r10.a((java.lang.String) r1, (java.lang.String) r2, (com.ironsource.sdk.g.c) r4, (com.ironsource.sdk.j.a.c) r5)     // Catch:{ all -> 0x0144 }
            goto L_0x00a0
        L_0x00e1:
            java.lang.String r1 = r11.f9507a     // Catch:{ all -> 0x0144 }
            java.lang.String r2 = r11.f9508b     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.controller.j r3 = r10.V     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.g.d$e r4 = com.ironsource.sdk.g.d.e.RewardedVideo     // Catch:{ all -> 0x0144 }
            java.util.Collection r3 = r3.b(r4)     // Catch:{ all -> 0x0144 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0144 }
        L_0x00f1:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0144 }
            if (r4 == 0) goto L_0x013d
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.g.c r4 = (com.ironsource.sdk.g.c) r4     // Catch:{ all -> 0x0144 }
            int r6 = r4.f9519e     // Catch:{ all -> 0x0144 }
            if (r6 != r5) goto L_0x00f1
            java.lang.String r6 = r4.f9515a     // Catch:{ all -> 0x0144 }
            java.lang.String r7 = r10.f9296a     // Catch:{ all -> 0x0144 }
            java.lang.String r8 = "onRVNoMoreOffers()"
            android.util.Log.d(r7, r8)     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.j.a.d r7 = r10.M     // Catch:{ all -> 0x0144 }
            r7.b(r6)     // Catch:{ all -> 0x0144 }
            java.lang.String r7 = r10.f9296a     // Catch:{ all -> 0x0144 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0144 }
            java.lang.String r9 = "initRewardedVideo(appKey:"
            r8.<init>(r9)     // Catch:{ all -> 0x0144 }
            r8.append(r1)     // Catch:{ all -> 0x0144 }
            java.lang.String r9 = ", userId:"
            r8.append(r9)     // Catch:{ all -> 0x0144 }
            r8.append(r2)     // Catch:{ all -> 0x0144 }
            java.lang.String r9 = ", demandSource:"
            r8.append(r9)     // Catch:{ all -> 0x0144 }
            r8.append(r6)     // Catch:{ all -> 0x0144 }
            java.lang.String r6 = ")"
            r8.append(r6)     // Catch:{ all -> 0x0144 }
            java.lang.String r6 = r8.toString()     // Catch:{ all -> 0x0144 }
            android.util.Log.d(r7, r6)     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.j.a.d r6 = r10.M     // Catch:{ all -> 0x0144 }
            r10.a((java.lang.String) r1, (java.lang.String) r2, (com.ironsource.sdk.g.c) r4, (com.ironsource.sdk.j.a.d) r6)     // Catch:{ all -> 0x0144 }
            goto L_0x00f1
        L_0x013d:
            r1 = 0
            r11.f9510d = r1     // Catch:{ all -> 0x0144 }
        L_0x0140:
            r10.m = r11     // Catch:{ all -> 0x0144 }
            monitor-exit(r0)     // Catch:{ all -> 0x0144 }
            return
        L_0x0144:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0144 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.x.a(com.ironsource.sdk.g.b):void");
    }

    public final void a(com.ironsource.sdk.g.c cVar, Map<String, String> map, com.ironsource.sdk.j.a.b bVar) {
        Map<String, String> mergeHashMaps = SDKUtils.mergeHashMaps(new Map[]{map, cVar.a()});
        if (map != null) {
            b(a("loadBanner", SDKUtils.flatMapToJsonAsString(mergeHashMaps), "onLoadBannerSuccess", "onLoadBannerFail"));
        }
    }

    public final void a(com.ironsource.sdk.g.c cVar, Map<String, String> map, com.ironsource.sdk.j.a.c cVar2) {
        Map<String, String> mergeHashMaps = SDKUtils.mergeHashMaps(new Map[]{map, cVar.a()});
        this.m.a(cVar.f9516b, true);
        b(a("loadInterstitial", SDKUtils.flatMapToJsonAsString(mergeHashMaps), "onLoadInterstitialSuccess", "onLoadInterstitialFail"));
    }

    /* access modifiers changed from: package-private */
    public final void a(final d.e eVar, final String str) {
        c((Runnable) new Runnable() {
            public final void run() {
                if (eVar == d.e.RewardedVideo || eVar == d.e.Interstitial) {
                    com.ironsource.sdk.j.a.a a2 = x.this.b(eVar);
                    if (a2 != null) {
                        a2.a(eVar, str);
                    }
                } else if (eVar == d.e.OfferWall) {
                    x.this.O.onOWAdClosed();
                }
            }
        });
    }

    public final void a(com.ironsource.sdk.h.c cVar) {
        if (cVar.getName().contains("mobileController.html")) {
            f fVar = this.S;
            AnonymousClass4 r0 = new Runnable() {
                public final void run() {
                    x.this.a(1);
                }
            };
            if (!fVar.a()) {
                if (fVar.f9114c == f.a.f9122b) {
                    fVar.c();
                }
                fVar.f9115d = f.b.CONTROLLER_FROM_SERVER;
                fVar.a(fVar.f9115d);
                r0.run();
                return;
            }
            return;
        }
        String name = cVar.getName();
        String parent = cVar.getParent();
        try {
            b(b("assetCached", a("file", name, "path", i(parent), (String) null, (String) null, (String) null, (String) null, (String) null, false)));
        } catch (Exception e2) {
            a(name, parent, e2.getMessage());
        }
    }

    public final void a(com.ironsource.sdk.h.c cVar, final com.ironsource.sdk.g.e eVar) {
        if (cVar.getName().contains("mobileController.html")) {
            f fVar = this.S;
            AnonymousClass5 r0 = new Runnable() {
                public final void run() {
                    x.this.a(1);
                }
            };
            AnonymousClass6 r1 = new Runnable() {
                public final void run() {
                    e h2 = x.this.W;
                    h2.a("controller html - failed to download - " + eVar.f9555a);
                }
            };
            if (fVar.a()) {
                return;
            }
            if (fVar.f9114c != f.a.f9122b || !fVar.e()) {
                com.ironsource.sdk.a.a a2 = new com.ironsource.sdk.a.a().a("generalmessage", Integer.valueOf(fVar.f9113b));
                if (fVar.f9112a > 0) {
                    a2.a("timingvalue", Long.valueOf(System.currentTimeMillis() - fVar.f9112a));
                }
                com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.t, (Map<String, Object>) a2.f8990a);
                r1.run();
                return;
            }
            fVar.f9115d = f.b.FALLBACK_CONTROLLER_RECOVERY;
            fVar.a(fVar.f9115d);
            r0.run();
            return;
        }
        a(cVar.getName(), cVar.getParent(), eVar.f9555a);
    }

    /* access modifiers changed from: package-private */
    public final void a(Runnable runnable) {
        com.ironsource.environment.e.a aVar = this.w;
        if (aVar != null) {
            aVar.a(runnable);
        }
    }

    public final void a(String str, com.ironsource.sdk.j.a.c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("demandSourceName", str);
        String flatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(hashMap);
        this.m.a(str, true);
        b(a("loadInterstitial", flatMapToJsonAsString, "onLoadInterstitialSuccess", "onLoadInterstitialFail"));
    }

    public final void a(String str, String str2) {
        b(b("onNativeLifeCycleEvent", a("lifeCycleEvent", str2, "productType", str, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
    }

    public final void a(String str, String str2, com.ironsource.sdk.g.c cVar, com.ironsource.sdk.j.a.b bVar) {
        this.A = str;
        this.B = str2;
        this.P = bVar;
        a(str, str2, d.e.Banner, cVar, (e) new e() {
            public final void a(String str, d.e eVar, com.ironsource.sdk.g.c cVar) {
                x.a(x.this, str, eVar, cVar);
            }
        });
    }

    public final void a(String str, String str2, com.ironsource.sdk.g.c cVar, com.ironsource.sdk.j.a.c cVar2) {
        this.A = str;
        this.B = str2;
        this.N = cVar2;
        this.m.f9512f = str;
        this.m.f9513g = this.B;
        a(this.A, this.B, d.e.Interstitial, cVar, (e) new e() {
            public final void a(String str, d.e eVar, com.ironsource.sdk.g.c cVar) {
                x.a(x.this, str, eVar, cVar);
            }
        });
    }

    public final void a(String str, String str2, com.ironsource.sdk.g.c cVar, com.ironsource.sdk.j.a.d dVar) {
        this.A = str;
        this.B = str2;
        this.M = dVar;
        this.m.f9507a = str;
        this.m.f9508b = str2;
        a(str, str2, d.e.RewardedVideo, cVar, (e) new e() {
            public final void a(String str, d.e eVar, com.ironsource.sdk.g.c cVar) {
                x.a(x.this, str, eVar, cVar);
            }
        });
    }

    public final void a(String str, String str2, com.ironsource.sdk.j.e eVar) {
        this.A = str;
        this.B = str2;
        this.O = eVar;
        a(str, str2, d.e.OfferWallCredits, (com.ironsource.sdk.g.c) null, (e) new e() {
            public final void a(String str, d.e eVar, com.ironsource.sdk.g.c cVar) {
                x.a(x.this, str, eVar, cVar);
            }
        });
    }

    public final void a(String str, String str2, Map<String, String> map, com.ironsource.sdk.j.e eVar) {
        this.A = str;
        this.B = str2;
        this.C = map;
        this.O = eVar;
        this.m.j = map;
        this.m.f9514h = true;
        a(this.A, this.B, d.e.OfferWall, (com.ironsource.sdk.g.c) null, (e) new e() {
            public final void a(String str, d.e eVar, com.ironsource.sdk.g.c cVar) {
                x.a(x.this, str, eVar, cVar);
            }
        });
    }

    public final void a(Map<String, String> map, com.ironsource.sdk.j.e eVar) {
        this.C = map;
        b("SSA_CORE.SDKController.runFunction('" + "showOfferWall" + "','" + "onShowOfferWallSuccess" + "','" + "onShowOfferWallFail" + "');");
    }

    public final void a(JSONObject jSONObject) {
        b(b("updateConsentInfo", jSONObject != null ? jSONObject.toString() : null));
    }

    public final void a(JSONObject jSONObject, com.ironsource.sdk.j.a.c cVar) {
        b(a(d.e.Interstitial, jSONObject));
    }

    public final void a(JSONObject jSONObject, com.ironsource.sdk.j.a.d dVar) {
        b(a(d.e.RewardedVideo, jSONObject));
    }

    public final void a(boolean z2, String str) {
        b(b("viewableChange", a("webview", str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, "isViewable", z2)));
    }

    /* access modifiers changed from: package-private */
    public boolean a(String str) {
        boolean z2 = false;
        if (TextUtils.isEmpty(str)) {
            Logger.d(this.f9296a, "Trying to trigger a listener - no product was found");
            return false;
        }
        if (!str.equalsIgnoreCase(d.e.Interstitial.toString()) ? !str.equalsIgnoreCase(d.e.RewardedVideo.toString()) ? !str.equalsIgnoreCase(d.e.Banner.toString()) ? (str.equalsIgnoreCase(d.e.OfferWall.toString()) || str.equalsIgnoreCase(d.e.OfferWallCredits.toString())) && this.O != null : this.P != null : this.M != null : this.N != null) {
            z2 = true;
        }
        if (!z2) {
            String str2 = this.f9296a;
            Logger.d(str2, "Trying to trigger a listener - no listener was found for product " + str);
        }
        return z2;
    }

    public final void b(final Context context) {
        b((Runnable) new Runnable() {
            public final void run() {
                x.c(x.this, context);
            }
        });
    }

    public final void b(com.ironsource.sdk.g.c cVar, Map<String, String> map, com.ironsource.sdk.j.a.c cVar2) {
        b(a(d.e.Interstitial, new JSONObject(SDKUtils.mergeHashMaps(new Map[]{map, cVar.a()}))));
    }

    /* access modifiers changed from: package-private */
    public final void b(Runnable runnable) {
        com.ironsource.environment.e.a aVar = this.w;
        if (aVar != null) {
            aVar.b(runnable);
        }
    }

    public void b(String str) {
        if (!TextUtils.isEmpty(str)) {
            String str2 = "console.log(\"JS exeption: \" + JSON.stringify(e));";
            if (y != d.C0090d.MODE_0.f9547d && (y < d.C0090d.MODE_1.f9547d || y > d.C0090d.MODE_3.f9547d)) {
                str2 = "empty";
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("try{");
            sb.append(str);
            sb.append("}catch(e){");
            sb.append(str2);
            sb.append("}");
            final String str3 = "javascript:" + sb.toString();
            Logger.i(this.f9296a, str3);
            a((Runnable) new Runnable() {
                public final void run() {
                    try {
                        if (x.this.Q != null) {
                            if (x.this.Q.booleanValue()) {
                                x.this.evaluateJavascript(sb.toString(), (ValueCallback) null);
                            } else {
                                x.this.loadUrl(str3);
                            }
                        } else if (Build.VERSION.SDK_INT >= 19) {
                            x.this.evaluateJavascript(sb.toString(), (ValueCallback) null);
                            Boolean unused = x.this.Q = Boolean.TRUE;
                        } else {
                            x.this.loadUrl(str3);
                            Boolean unused2 = x.this.Q = Boolean.FALSE;
                        }
                    } catch (Throwable th) {
                        String b2 = x.this.f9296a;
                        Logger.e(b2, "injectJavascript: " + th.toString());
                    }
                }
            });
        }
    }

    public final d.c c() {
        return d.c.Web;
    }

    /* access modifiers changed from: package-private */
    public final void c(Runnable runnable) {
        com.ironsource.environment.e.a aVar = this.w;
        if (aVar != null) {
            aVar.c(runnable);
        }
    }

    public final boolean c(String str) {
        com.ironsource.sdk.g.c a2 = this.V.a(d.e.Interstitial, str);
        return a2 != null && a2.f9520f;
    }

    public final void d() {
        b(a("destroyBanner", "", "onDestroyBannersSuccess", "onDestroyBannersFail"));
    }

    public final void d(String str) {
        String str2 = this.f9296a;
        Logger.i(str2, "device status changed, connection type " + str);
        com.ironsource.sdk.a.b.a(str);
        b(b("deviceStatusChanged", a("connectionType", str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
    }

    public void destroy() {
        super.destroy();
        com.ironsource.sdk.k.b bVar = this.D;
        if (bVar != null) {
            bVar.a();
        }
        com.ironsource.sdk.service.Connectivity.b bVar2 = this.aa;
        if (bVar2 != null) {
            bVar2.f9592a.a();
        }
        CountDownTimer countDownTimer = this.f9298f;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    public final void e() {
        b(g("enterForeground"));
    }

    public final void e(String str) {
        if (str.equals("forceClose")) {
            j();
        }
        b(b("engageEnd", a("action", str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
    }

    public final void f() {
        b(g("enterBackground"));
    }

    public final boolean f(String str) {
        List<String> b2 = com.ironsource.sdk.utils.b.a().b();
        try {
            if (b2.isEmpty()) {
                return false;
            }
            for (String contains : b2) {
                if (str.contains(contains)) {
                    a.AnonymousClass1.a(this.u.a(), str, (String) null);
                    return true;
                }
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public final void g() {
        a(this.m);
    }

    public final void h() {
        com.ironsource.sdk.a.a aVar = new com.ironsource.sdk.a.a();
        f fVar = this.S;
        aVar.a("generalmessage", Integer.valueOf(fVar.f9113b));
        com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.r, (Map<String, Object>) aVar.f8990a);
        fVar.f9112a = System.currentTimeMillis();
        if (this.S.b()) {
            a(1);
        }
    }

    public final void i() {
        b(g("interceptedUrlToStore"));
    }

    /* access modifiers changed from: package-private */
    public void j() {
        com.ironsource.sdk.j.g gVar = this.v;
        if (gVar != null) {
            gVar.onCloseRequested();
        }
    }

    public final void k() {
        try {
            onPause();
        } catch (Throwable th) {
            String str = this.f9296a;
            Logger.i(str, "WebViewController: onPause() - " + th);
        }
    }

    public final void l() {
        try {
            onResume();
        } catch (Throwable th) {
            String str = this.f9296a;
            Logger.i(str, "WebViewController: onResume() - " + th);
        }
    }

    public void onDownloadStart(String str, String str2, String str3, String str4, long j2) {
        String str5 = this.f9296a;
        Logger.i(str5, str + " " + str4);
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        com.ironsource.sdk.j.g gVar;
        if (i2 != 4 || (gVar = this.v) == null || !gVar.onBackButtonPressed()) {
            return super.onKeyDown(i2, keyEvent);
        }
        return true;
    }

    public WebBackForwardList saveState(Bundle bundle) {
        return super.saveState(bundle);
    }
}
