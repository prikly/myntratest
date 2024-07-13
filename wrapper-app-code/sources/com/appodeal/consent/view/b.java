package com.appodeal.consent.view;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.JavascriptInterface;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.appodeal.consent.Consent;
import com.appodeal.consent.Vendor;
import com.appodeal.consent.internal.d;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b extends WebView {

    /* renamed from: a  reason: collision with root package name */
    public final c f17895a;

    /* renamed from: b  reason: collision with root package name */
    public final String f17896b;

    /* renamed from: c  reason: collision with root package name */
    public final Consent f17897c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, Vendor> f17898d;

    /* renamed from: e  reason: collision with root package name */
    public final CoroutineScope f17899e = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain());

    /* renamed from: f  reason: collision with root package name */
    public AtomicBoolean f17900f = new AtomicBoolean(false);

    /* renamed from: g  reason: collision with root package name */
    public AtomicBoolean f17901g = new AtomicBoolean(false);

    /* renamed from: h  reason: collision with root package name */
    public final a f17902h;

    public final class a extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f17903a;

        public a(b bVar) {
            Intrinsics.checkNotNullParameter(bVar, "this$0");
            this.f17903a = bVar;
        }

        public final void onPageFinished(WebView webView, String str) {
            Intrinsics.checkNotNullParameter(webView, "view");
            Intrinsics.checkNotNullParameter(str, "url");
            super.onPageFinished(webView, str);
            boolean z = false;
            if (!(str == null || str.length() == 0) && StringsKt.startsWith$default(str, this.f17903a.f17896b, false, 2, (Object) null)) {
                z = true;
            }
            if (z) {
                b bVar = this.f17903a;
                b.a(bVar, bVar.getConsentJs());
                if (!this.f17903a.f17900f.getAndSet(true)) {
                    this.f17903a.f17895a.a();
                }
            }
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            c cVar = this.f17903a.f17895a;
            cVar.a("WebResourceError: " + str2 + " [" + i + "] " + str);
        }

        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            Intrinsics.checkNotNullParameter(webView, "view");
            Intrinsics.checkNotNullParameter(webResourceRequest, "request");
            Intrinsics.checkNotNullParameter(webResourceError, "error");
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            this.f17903a.f17895a.a(webResourceError.toString());
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Intrinsics.checkNotNullParameter(webView, "view");
            Intrinsics.checkNotNullParameter(str, "url");
            if (!(str == null || str.length() == 0) && StringsKt.startsWith$default(str, this.f17903a.f17896b, false, 2, (Object) null)) {
                return false;
            }
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.setFlags(268435456);
                this.f17903a.getContext().startActivity(intent);
            } catch (Throwable unused) {
                this.f17903a.f17895a.a("No Activity found to handle browser intent.");
            }
            return true;
        }
    }

    /* renamed from: com.appodeal.consent.view.b$b  reason: collision with other inner class name */
    public final class C0214b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f17904a;

        @DebugMetadata(c = "com.appodeal.consent.view.ConsentWebView$ConsentJSInterface$closeWebView$1", f = "ConsentWebView.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.appodeal.consent.view.b$b$a */
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ b f17905a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(b bVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f17905a = bVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f17905a, continuation);
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                this.f17905a.loadUrl("about:blank");
                return Unit.INSTANCE;
            }
        }

        public C0214b(b bVar) {
            Intrinsics.checkNotNullParameter(bVar, "this$0");
            this.f17904a = bVar;
        }

        @JavascriptInterface
        public final void closeWebView() {
            Job unused = BuildersKt__Builders_commonKt.launch$default(this.f17904a.f17899e, (CoroutineContext) null, (CoroutineStart) null, new a(this.f17904a, (Continuation<? super a>) null), 3, (Object) null);
        }

        @JavascriptInterface
        public final void send(String str) {
            Intrinsics.checkNotNullParameter(str, "consentString");
            if (!this.f17904a.f17901g.getAndSet(true)) {
                this.f17904a.f17895a.a(d.b(str));
            }
        }
    }

    public interface c {
        void a();

        void a(String str);

        void a(JSONObject jSONObject);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context, d dVar, String str, Consent consent, Map map) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Intrinsics.checkNotNullParameter(str, "consentDialogUrl");
        Intrinsics.checkNotNullParameter(consent, "consent");
        Intrinsics.checkNotNullParameter(map, "customVendors");
        this.f17895a = dVar;
        this.f17896b = str;
        this.f17897c = consent;
        this.f17898d = map;
        addJavascriptInterface(new C0214b(this), "ConsentManager");
        setWebViewClient(new a(this));
        getSettings().setJavaScriptEnabled(true);
        this.f17902h = d.a(this, new c(this));
    }

    public static final void a(b bVar, String str) {
        bVar.getClass();
        bVar.loadUrl(Intrinsics.stringPlus("javascript: ", str));
    }

    /* access modifiers changed from: private */
    public final String getCloseJs() {
        return "closeConsentDialog()";
    }

    /* access modifiers changed from: private */
    public final String getConsentJs() {
        String jSONObject = this.f17897c.toJson().toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "consent.toJson().toString()");
        String replace = new Regex("\"").replace(jSONObject, "\\\\\"");
        Map<String, Vendor> map = this.f17898d;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, Vendor> value : map.entrySet()) {
            arrayList.add(((Vendor) value.getValue()).toJson$apd_consent());
        }
        String str = "showConsentDialog(" + "\"" + replace + "\"," + "\"" + d.b(this) + "\"," + "\"" + d.a(this) + "\"," + new JSONArray(arrayList) + ")";
        Intrinsics.checkNotNullExpressionValue(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }

    public final void a() {
        this.f17900f.set(false);
        this.f17901g.set(false);
        clearCache(true);
    }

    public final a getCloseButton() {
        return this.f17902h;
    }
}
