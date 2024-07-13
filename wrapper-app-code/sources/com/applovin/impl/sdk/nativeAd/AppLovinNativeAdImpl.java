package com.applovin.impl.sdk.nativeAd;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.applovin.impl.adview.d;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.a.e;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.network.i;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.h;
import com.applovin.impl.sdk.utils.k;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import io.bidmachine.utils.IabUtils;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

public class AppLovinNativeAdImpl extends AppLovinAdBase implements AppLovinNativeAd {
    private static final String AD_RESPONSE_TYPE_APPLOVIN = "applovin";
    private static final String AD_RESPONSE_TYPE_ORTB = "ortb";
    private static final String AD_RESPONSE_TYPE_UNDEFINED = "undefined";
    private static final String DEFAULT_APPLOVIN_PRIVACY_URL = "https://www.applovin.com/privacy/";
    private final e adEventTracker;
    private final String advertiser;
    private final String body;
    private final String callToAction;
    /* access modifiers changed from: private */
    public final Uri clickDestinationBackupUri;
    /* access modifiers changed from: private */
    public final Uri clickDestinationUri;
    private final a clickHandler;
    /* access modifiers changed from: private */
    public final List<String> clickTrackingUrls;
    /* access modifiers changed from: private */
    public AppLovinNativeAdEventListener eventListener;
    private Uri iconUri;
    private final List<i> impressionRequests;
    private final AtomicBoolean impressionTracked;
    private final String jsTracker;
    private Uri mainImageUri;
    private AppLovinMediaView mediaView;
    private ViewGroup nativeAdView;
    private final b onAttachStateChangeHandler;
    private AppLovinOptionsView optionsView;
    private Uri privacyDestinationUri;
    private Uri privacyIconUri;
    private final List<View> registeredViews;
    /* access modifiers changed from: private */
    public final String tag;
    private final String title;
    private final com.applovin.impl.b.a vastAd;
    private final List<i> viewableMRC100Requests;
    private final List<i> viewableMRC50Requests;
    private final List<i> viewableVideo50Requests;

    public static class Builder {
        /* access modifiers changed from: private */
        public final JSONObject adObject;
        /* access modifiers changed from: private */
        public String advertiser;
        /* access modifiers changed from: private */
        public String body;
        /* access modifiers changed from: private */
        public String callToAction;
        /* access modifiers changed from: private */
        public Uri clickDestinationBackupUri;
        /* access modifiers changed from: private */
        public Uri clickDestinationUri;
        /* access modifiers changed from: private */
        public List<String> clickTrackingUrls;
        /* access modifiers changed from: private */
        public final JSONObject fullResponse;
        /* access modifiers changed from: private */
        public Uri iconUri;
        /* access modifiers changed from: private */
        public List<i> impressionRequests;
        /* access modifiers changed from: private */
        public String jsTracker;
        /* access modifiers changed from: private */
        public Uri mainImageUri;
        /* access modifiers changed from: private */
        public Uri privacyDestinationUri;
        /* access modifiers changed from: private */
        public Uri privacyIconUri;
        /* access modifiers changed from: private */
        public final n sdk;
        /* access modifiers changed from: private */
        public String title;
        /* access modifiers changed from: private */
        public com.applovin.impl.b.a vastAd;
        /* access modifiers changed from: private */
        public List<i> viewableMRC100Requests;
        /* access modifiers changed from: private */
        public List<i> viewableMRC50Requests;
        /* access modifiers changed from: private */
        public List<i> viewableVideo50Requests;

        public Builder(JSONObject jSONObject, JSONObject jSONObject2, n nVar) {
            this.adObject = jSONObject;
            this.fullResponse = jSONObject2;
            this.sdk = nVar;
        }

        public AppLovinNativeAdImpl build() {
            return new AppLovinNativeAdImpl(this);
        }

        public Builder setAdvertiser(String str) {
            this.advertiser = str;
            return this;
        }

        public Builder setBody(String str) {
            this.body = str;
            return this;
        }

        public Builder setCallToAction(String str) {
            this.callToAction = str;
            return this;
        }

        public Builder setClickDestinationBackupUri(Uri uri) {
            this.clickDestinationBackupUri = uri;
            return this;
        }

        public Builder setClickDestinationUri(Uri uri) {
            this.clickDestinationUri = uri;
            return this;
        }

        public Builder setClickTrackingUrls(List<String> list) {
            this.clickTrackingUrls = list;
            return this;
        }

        public Builder setIconUri(Uri uri) {
            this.iconUri = uri;
            return this;
        }

        public Builder setImpressionRequests(List<i> list) {
            this.impressionRequests = list;
            return this;
        }

        public Builder setJsTracker(String str) {
            this.jsTracker = str;
            return this;
        }

        public Builder setMainImageUri(Uri uri) {
            this.mainImageUri = uri;
            return this;
        }

        public Builder setPrivacyDestinationUri(Uri uri) {
            this.privacyDestinationUri = uri;
            return this;
        }

        public Builder setPrivacyIconUri(Uri uri) {
            this.privacyIconUri = uri;
            return this;
        }

        public Builder setTitle(String str) {
            this.title = str;
            return this;
        }

        public Builder setVastAd(com.applovin.impl.b.a aVar) {
            this.vastAd = aVar;
            return this;
        }

        public Builder setViewableMRC100Requests(List<i> list) {
            this.viewableMRC100Requests = list;
            return this;
        }

        public Builder setViewableMRC50Requests(List<i> list) {
            this.viewableMRC50Requests = list;
            return this;
        }

        public Builder setViewableVideo50Requests(List<i> list) {
            this.viewableVideo50Requests = list;
            return this;
        }
    }

    private static class a implements View.OnClickListener {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final AppLovinNativeAdImpl f15616a;

        public a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
            this.f15616a = appLovinNativeAdImpl;
        }

        /* access modifiers changed from: private */
        public void a(AppLovinNativeAdImpl appLovinNativeAdImpl, Context context) {
            v D;
            String access$2200;
            StringBuilder sb;
            Uri access$3600;
            if (Utils.openUri(context, appLovinNativeAdImpl.clickDestinationUri, appLovinNativeAdImpl.sdk)) {
                appLovinNativeAdImpl.sdk.D();
                if (v.a()) {
                    D = appLovinNativeAdImpl.sdk.D();
                    access$2200 = appLovinNativeAdImpl.tag;
                    sb = new StringBuilder();
                    sb.append("Opening URL: ");
                    access$3600 = appLovinNativeAdImpl.clickDestinationUri;
                } else {
                    return;
                }
            } else if (Utils.openUri(context, appLovinNativeAdImpl.clickDestinationBackupUri, appLovinNativeAdImpl.sdk)) {
                appLovinNativeAdImpl.sdk.D();
                if (v.a()) {
                    D = appLovinNativeAdImpl.sdk.D();
                    access$2200 = appLovinNativeAdImpl.tag;
                    sb = new StringBuilder();
                    sb.append("Opening backup URL: ");
                    access$3600 = appLovinNativeAdImpl.clickDestinationBackupUri;
                } else {
                    return;
                }
            } else {
                return;
            }
            sb.append(access$3600);
            D.b(access$2200, sb.toString());
        }

        public AppLovinNativeAdImpl a() {
            return this.f15616a;
        }

        /* access modifiers changed from: protected */
        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.a((Object) this)) {
                return false;
            }
            AppLovinNativeAdImpl a2 = a();
            AppLovinNativeAdImpl a3 = aVar.a();
            return a2 != null ? a2.equals(a3) : a3 == null;
        }

        public int hashCode() {
            AppLovinNativeAdImpl a2 = a();
            return 59 + (a2 == null ? 43 : a2.hashCode());
        }

        public void onClick(final View view) {
            this.f15616a.sdk.D();
            if (v.a()) {
                this.f15616a.sdk.D().b(this.f15616a.tag, "Handle view clicked");
            }
            this.f15616a.sdk.v().maybeSubmitPersistentPostbacks(this.f15616a.getDirectClickTrackingPostbacks());
            for (String dispatchPostbackAsync : this.f15616a.clickTrackingUrls) {
                this.f15616a.sdk.aa().dispatchPostbackAsync(dispatchPostbackAsync, (AppLovinPostbackListener) null);
            }
            k.a(this.f15616a.eventListener, (AppLovinNativeAd) this.f15616a);
            if (this.f15616a.isDirectDownloadEnabled()) {
                this.f15616a.sdk.aq().startDirectDownloadActivity(this.f15616a, new ArrayService.DirectDownloadListener() {
                    public void onAppDetailsDismissed() {
                    }

                    public void onAppDetailsDisplayed() {
                    }

                    public void onFailure() {
                        a aVar = a.this;
                        aVar.a(aVar.f15616a, view.getContext());
                    }
                });
            } else {
                a(this.f15616a, view.getContext());
            }
        }

        public String toString() {
            return "AppLovinNativeAdImpl.ClickHandler(ad=" + a() + ")";
        }
    }

    private static class b implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        private final AppLovinNativeAdImpl f15619a;

        public b(AppLovinNativeAdImpl appLovinNativeAdImpl) {
            this.f15619a = appLovinNativeAdImpl;
        }

        public AppLovinNativeAdImpl a() {
            return this.f15619a;
        }

        /* access modifiers changed from: protected */
        public boolean a(Object obj) {
            return obj instanceof b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!bVar.a(this)) {
                return false;
            }
            AppLovinNativeAdImpl a2 = a();
            AppLovinNativeAdImpl a3 = bVar.a();
            return a2 != null ? a2.equals(a3) : a3 == null;
        }

        public int hashCode() {
            AppLovinNativeAdImpl a2 = a();
            return 59 + (a2 == null ? 43 : a2.hashCode());
        }

        public void onViewAttachedToWindow(View view) {
            this.f15619a.maybeHandleOnAttachedToWindow(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }

        public String toString() {
            return "AppLovinNativeAdImpl.OnAttachStateChangeHandler(ad=" + a() + ")";
        }
    }

    private AppLovinNativeAdImpl(Builder builder) {
        super(builder.adObject, builder.fullResponse, builder.sdk);
        Uri parse;
        this.impressionTracked = new AtomicBoolean();
        this.registeredViews = new ArrayList();
        this.clickHandler = new a(this);
        this.onAttachStateChangeHandler = new b(this);
        this.adEventTracker = new e(this);
        this.title = builder.title;
        this.advertiser = builder.advertiser;
        this.body = builder.body;
        this.callToAction = builder.callToAction;
        this.iconUri = builder.iconUri;
        this.mainImageUri = builder.mainImageUri;
        this.privacyIconUri = builder.privacyIconUri;
        this.vastAd = builder.vastAd;
        this.clickDestinationUri = builder.clickDestinationUri;
        this.clickDestinationBackupUri = builder.clickDestinationBackupUri;
        this.clickTrackingUrls = builder.clickTrackingUrls;
        this.jsTracker = builder.jsTracker;
        this.impressionRequests = builder.impressionRequests;
        if (builder.privacyDestinationUri != null) {
            parse = builder.privacyDestinationUri;
        } else {
            parse = (!isDspAd() || getSdk().N().a()) ? Uri.parse(DEFAULT_APPLOVIN_PRIVACY_URL) : parse;
            this.viewableMRC50Requests = builder.viewableMRC50Requests;
            this.viewableMRC100Requests = builder.viewableMRC100Requests;
            this.viewableVideo50Requests = builder.viewableVideo50Requests;
            this.tag = "AppLovinNativeAd:" + getAdIdNumber();
        }
        this.privacyDestinationUri = parse;
        this.viewableMRC50Requests = builder.viewableMRC50Requests;
        this.viewableMRC100Requests = builder.viewableMRC100Requests;
        this.viewableVideo50Requests = builder.viewableVideo50Requests;
        this.tag = "AppLovinNativeAd:" + getAdIdNumber();
    }

    /* access modifiers changed from: private */
    public List<com.applovin.impl.sdk.d.a> getDirectClickTrackingPostbacks() {
        List<com.applovin.impl.sdk.d.a> postbacks;
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("click_tracking_urls", this.adObject, getClCode(), getStringFromAdObject("click_tracking_url", (String) null), this.sdk);
        }
        return postbacks;
    }

    private boolean isDspAd() {
        return AD_RESPONSE_TYPE_ORTB.equalsIgnoreCase(getType());
    }

    /* access modifiers changed from: private */
    public void maybeHandleOnAttachedToWindow(View view) {
        if (this.impressionTracked.compareAndSet(false, true)) {
            if (StringUtils.isValidString(this.jsTracker)) {
                final d dVar = new d((com.applovin.impl.adview.e) null, this.sdk, view.getContext());
                dVar.loadData(this.jsTracker, "text/html", "UTF-8");
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                    public void run() {
                        dVar.stopLoading();
                    }
                }, TimeUnit.SECONDS.toMillis(5));
            }
            for (i dispatchPostbackRequest : this.impressionRequests) {
                this.sdk.aa().dispatchPostbackRequest(dispatchPostbackRequest, (AppLovinPostbackListener) null);
            }
            this.adEventTracker.a(view);
            this.adEventTracker.d();
        }
    }

    public void destroy() {
        unregisterViewsForInteraction();
        this.eventListener = null;
        this.adEventTracker.e();
    }

    public e getAdEventTracker() {
        return this.adEventTracker;
    }

    public long getAdIdNumber() {
        return getLongFromAdObject("ad_id", -1);
    }

    public String getAdvertiser() {
        return this.advertiser;
    }

    public String getBody() {
        return this.body;
    }

    public String getCachePrefix() {
        return getStringFromAdObject("cache_prefix", (String) null);
    }

    public String getCallToAction() {
        return this.callToAction;
    }

    public a getClickHandler() {
        return this.clickHandler;
    }

    public Bundle getDirectDownloadParameters() {
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("ah_parameters", (JSONObject) null);
        if (jsonObjectFromAdObject != null) {
            return JsonUtils.toBundle(jsonObjectFromAdObject);
        }
        return null;
    }

    public String getDirectDownloadToken() {
        return getStringFromAdObject("ah_dd_token", (String) null);
    }

    public Uri getIconUri() {
        return this.iconUri;
    }

    public Uri getMainImageUri() {
        return this.mainImageUri;
    }

    public AppLovinMediaView getMediaView() {
        return this.mediaView;
    }

    public String getOpenMeasurementContentUrl() {
        return getStringFromAdObject("omid_content_url", (String) null);
    }

    public String getOpenMeasurementCustomReferenceData() {
        return getStringFromAdObject("omid_custom_ref_data", "");
    }

    public List<VerificationScriptResource> getOpenMeasurementVerificationScriptResources() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.adObjectLock) {
            JSONArray jSONArray = JsonUtils.getJSONArray(this.adObject, "omid_verification_script_resources", (JSONArray) null);
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
                    try {
                        URL url = new URL(JsonUtils.getString(jSONObject, "url", (String) null));
                        String string = JsonUtils.getString(jSONObject, "vendor_key", (String) null);
                        String string2 = JsonUtils.getString(jSONObject, "parameters", (String) null);
                        arrayList.add((!StringUtils.isValidString(string) || !StringUtils.isValidString(string2)) ? VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url) : VerificationScriptResource.createVerificationScriptResourceWithParameters(string, url, string2));
                    } catch (Throwable th) {
                        this.sdk.D();
                        if (v.a()) {
                            this.sdk.D().b(this.tag, "Failed to parse OMID verification script resource", th);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public AppLovinOptionsView getOptionsView() {
        return this.optionsView;
    }

    public Uri getPrivacyDestinationUri() {
        return this.privacyDestinationUri;
    }

    public Uri getPrivacyIconUri() {
        return this.privacyIconUri;
    }

    public String getTitle() {
        return this.title;
    }

    public String getType() {
        return getStringFromAdObject("type", "undefined");
    }

    public com.applovin.impl.b.a getVastAd() {
        return this.vastAd;
    }

    public boolean isDirectDownloadEnabled() {
        return StringUtils.isValidString(getDirectDownloadToken());
    }

    public boolean isOpenMeasurementEnabled() {
        return getBooleanFromAdObject(IabUtils.KEY_OM_SDK_ENABLED, false);
    }

    public void registerViewsForInteraction(List<View> list, ViewGroup viewGroup) {
        String str;
        StringBuilder sb;
        String str2;
        v vVar;
        this.nativeAdView = viewGroup;
        if ((!h.c() || !this.nativeAdView.isAttachedToWindow()) && (h.c() || this.nativeAdView.getParent() == null)) {
            this.nativeAdView.addOnAttachStateChangeListener(this.onAttachStateChangeHandler);
        } else {
            maybeHandleOnAttachedToWindow(this.nativeAdView);
        }
        this.sdk.D();
        if (v.a()) {
            v D = this.sdk.D();
            String str3 = this.tag;
            D.b(str3, "Registered ad view for impressions: " + this.nativeAdView);
        }
        if (this.clickDestinationUri == null && this.clickDestinationBackupUri == null) {
            this.sdk.D();
            if (v.a()) {
                this.sdk.D().b(this.tag, "Skipping click registration - no click URLs provided");
                return;
            }
            return;
        }
        for (View next : list) {
            if (next.hasOnClickListeners()) {
                this.sdk.D();
                if (v.a()) {
                    v D2 = this.sdk.D();
                    String str4 = this.tag;
                    D2.e(str4, "View has an onClickListener already - " + next);
                }
            }
            if (!next.isClickable()) {
                this.sdk.D();
                if (v.a()) {
                    v D3 = this.sdk.D();
                    String str5 = this.tag;
                    D3.e(str5, "View is not clickable - " + next);
                }
            }
            if (!next.isEnabled()) {
                this.sdk.D();
                if (v.a()) {
                    v D4 = this.sdk.D();
                    String str6 = this.tag;
                    D4.e(str6, "View is not enabled - " + next);
                }
            }
            if (next instanceof Button) {
                this.sdk.D();
                if (v.a()) {
                    vVar = this.sdk.D();
                    str2 = this.tag;
                    sb = new StringBuilder();
                    str = "Registering click for button: ";
                } else {
                    next.setOnClickListener(this.clickHandler);
                    this.registeredViews.add(next);
                }
            } else {
                this.sdk.D();
                if (v.a()) {
                    vVar = this.sdk.D();
                    str2 = this.tag;
                    sb = new StringBuilder();
                    str = "Registering click for view: ";
                } else {
                    next.setOnClickListener(this.clickHandler);
                    this.registeredViews.add(next);
                }
            }
            sb.append(str);
            sb.append(next);
            vVar.b(str2, sb.toString());
            next.setOnClickListener(this.clickHandler);
            this.registeredViews.add(next);
        }
        this.sdk.D();
        if (v.a()) {
            v D5 = this.sdk.D();
            String str7 = this.tag;
            D5.b(str7, "Registered views: " + this.registeredViews);
        }
    }

    public void setEventListener(AppLovinNativeAdEventListener appLovinNativeAdEventListener) {
        this.eventListener = appLovinNativeAdEventListener;
    }

    public void setIconUri(Uri uri) {
        this.iconUri = uri;
    }

    public void setMainImageUri(Uri uri) {
        this.mainImageUri = uri;
    }

    public void setPrivacyIconUri(Uri uri) {
        this.privacyIconUri = uri;
    }

    public void setUpNativeAdViewComponents() {
        this.mediaView = new AppLovinMediaView(this, this.sdk, this.sdk.P());
        if (this.privacyDestinationUri != null) {
            this.optionsView = new AppLovinOptionsView(this, this.sdk, this.sdk.P());
        }
    }

    public boolean shouldInjectOpenMeasurementScriptDuringCaching() {
        return false;
    }

    public String toString() {
        return "AppLovinNativeAd{adIdNumber=" + getAdIdNumber() + " - " + getTitle() + "}";
    }

    public void unregisterViewsForInteraction() {
        for (View onClickListener : this.registeredViews) {
            onClickListener.setOnClickListener((View.OnClickListener) null);
        }
        this.sdk.D();
        if (v.a()) {
            v D = this.sdk.D();
            String str = this.tag;
            D.b(str, "Unregistered views: " + this.registeredViews);
        }
        this.registeredViews.clear();
        ViewGroup viewGroup = this.nativeAdView;
        if (viewGroup != null) {
            viewGroup.removeOnAttachStateChangeListener(this.onAttachStateChangeHandler);
            this.nativeAdView = null;
        }
        AppLovinMediaView appLovinMediaView = this.mediaView;
        if (appLovinMediaView != null) {
            appLovinMediaView.destroy();
        }
        AppLovinOptionsView appLovinOptionsView = this.optionsView;
        if (appLovinOptionsView != null) {
            appLovinOptionsView.destroy();
        }
    }
}
