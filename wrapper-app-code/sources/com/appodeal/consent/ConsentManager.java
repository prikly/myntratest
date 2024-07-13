package com.appodeal.consent;

import android.content.Context;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.consent.Consent;
import com.appodeal.consent.internal.g;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001CJF\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007J\u0012\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0007R(\u0010\u001c\u001a\u00020\u00138\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R \u0010\"\u001a\u00020\u00048\u0006XD¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\u001b\u001a\u0004\b\u001f\u0010 R\u001a\u0010&\u001a\u00020\b8FX\u0004¢\u0006\f\u0012\u0004\b%\u0010\u001b\u001a\u0004\b#\u0010$R\u001a\u0010*\u001a\u00020\f8FX\u0004¢\u0006\f\u0012\u0004\b)\u0010\u001b\u001a\u0004\b'\u0010(R\u001a\u0010.\u001a\u00020\n8FX\u0004¢\u0006\f\u0012\u0004\b-\u0010\u001b\u001a\u0004\b+\u0010,R\u001a\u00101\u001a\u00020\u00048FX\u0004¢\u0006\f\u0012\u0004\b0\u0010\u001b\u001a\u0004\b/\u0010 R\u001a\u00104\u001a\u00020\u00048FX\u0004¢\u0006\f\u0012\u0004\b3\u0010\u001b\u001a\u0004\b2\u0010 R\u001a\u00108\u001a\u00020\u00118FX\u0004¢\u0006\f\u0012\u0004\b7\u0010\u001b\u001a\u0004\b5\u00106R,\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001098\u0006X\u0004¢\u0006\u0012\n\u0004\b:\u0010;\u0012\u0004\b>\u0010\u001b\u001a\u0004\b<\u0010=R,\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020?098\u0006X\u0004¢\u0006\u0012\n\u0004\b@\u0010;\u0012\u0004\bB\u0010\u001b\u001a\u0004\bA\u0010=¨\u0006D"}, d2 = {"Lcom/appodeal/consent/ConsentManager;", "", "Landroid/content/Context;", "context", "", "appKey", "Lcom/appodeal/consent/IConsentInfoUpdateListener;", "listener", "Lcom/appodeal/consent/Consent;", "publisherConsent", "Lcom/appodeal/consent/Consent$Status;", "status", "Lcom/appodeal/consent/Consent$Zone;", "zone", "", "requestConsentInfoUpdate", "bundle", "", "hasConsentForVendor", "Lcom/appodeal/consent/ConsentManager$Storage;", "a", "Lcom/appodeal/consent/ConsentManager$Storage;", "getStorage", "()Lcom/appodeal/consent/ConsentManager$Storage;", "setStorage", "(Lcom/appodeal/consent/ConsentManager$Storage;)V", "getStorage$annotations", "()V", "storage", "d", "Ljava/lang/String;", "getVersion", "()Ljava/lang/String;", "getVersion$annotations", "version", "getConsent", "()Lcom/appodeal/consent/Consent;", "getConsent$annotations", "consent", "getConsentZone", "()Lcom/appodeal/consent/Consent$Zone;", "getConsentZone$annotations", "consentZone", "getConsentStatus", "()Lcom/appodeal/consent/Consent$Status;", "getConsentStatus$annotations", "consentStatus", "getIABConsentString", "getIABConsentString$annotations", "IABConsentString", "getUSPrivacyString", "getUSPrivacyString$annotations", "USPrivacyString", "getShouldShow", "()Z", "getShouldShow$annotations", "shouldShow", "", "extraData", "Ljava/util/Map;", "getExtraData", "()Ljava/util/Map;", "getExtraData$annotations", "Lcom/appodeal/consent/Vendor;", "customVendors", "getCustomVendors", "getCustomVendors$annotations", "Storage", "apd_consent"}, k = 1, mv = {1, 6, 0})
public final class ConsentManager {
    public static final ConsentManager INSTANCE = new ConsentManager();

    /* renamed from: a  reason: collision with root package name */
    public static Storage f17795a = Storage.NONE;

    /* renamed from: b  reason: collision with root package name */
    public static final LinkedHashMap f17796b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    public static final LinkedHashMap f17797c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    public static final String f17798d = "3.0.1";

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/appodeal/consent/ConsentManager$Storage;", "", "NONE", "SHARED_PREFERENCE", "apd_consent"}, k = 1, mv = {1, 6, 0})
    public enum Storage {
        NONE,
        SHARED_PREFERENCE
    }

    public static final Consent getConsent() {
        Lazy lazy = g.f17867a;
        return g.f17871e;
    }

    public static /* synthetic */ void getConsent$annotations() {
    }

    public static final Consent.Status getConsentStatus() {
        return getConsent().getStatus();
    }

    public static /* synthetic */ void getConsentStatus$annotations() {
    }

    public static final Consent.Zone getConsentZone() {
        return getConsent().getZone();
    }

    public static /* synthetic */ void getConsentZone$annotations() {
    }

    public static final Map<String, Vendor> getCustomVendors() {
        return f17797c;
    }

    public static /* synthetic */ void getCustomVendors$annotations() {
    }

    public static final Map<String, Object> getExtraData() {
        return f17796b;
    }

    public static /* synthetic */ void getExtraData$annotations() {
    }

    public static final String getIABConsentString() {
        return getConsent().getIABConsentString();
    }

    public static /* synthetic */ void getIABConsentString$annotations() {
    }

    public static final boolean getShouldShow() {
        Lazy lazy = g.f17867a;
        return g.f17870d;
    }

    public static /* synthetic */ void getShouldShow$annotations() {
    }

    public static final Storage getStorage() {
        return f17795a;
    }

    public static /* synthetic */ void getStorage$annotations() {
    }

    public static final String getUSPrivacyString() {
        return getConsent().getUSPrivacyString();
    }

    public static /* synthetic */ void getUSPrivacyString$annotations() {
    }

    public static final String getVersion() {
        return f17798d;
    }

    public static /* synthetic */ void getVersion$annotations() {
    }

    public static final boolean hasConsentForVendor(String str) {
        return getConsent().hasConsentForVendor(str);
    }

    public static final void requestConsentInfoUpdate(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, Constants.APP_KEY);
        requestConsentInfoUpdate$default(context, str, (IConsentInfoUpdateListener) null, (Consent) null, (Consent.Status) null, (Consent.Zone) null, 60, (Object) null);
    }

    public static final void requestConsentInfoUpdate(Context context, String str, IConsentInfoUpdateListener iConsentInfoUpdateListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, Constants.APP_KEY);
        Intrinsics.checkNotNullParameter(iConsentInfoUpdateListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        requestConsentInfoUpdate$default(context, str, iConsentInfoUpdateListener, (Consent) null, (Consent.Status) null, (Consent.Zone) null, 56, (Object) null);
    }

    public static final void requestConsentInfoUpdate(Context context, String str, IConsentInfoUpdateListener iConsentInfoUpdateListener, Consent consent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, Constants.APP_KEY);
        Intrinsics.checkNotNullParameter(iConsentInfoUpdateListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        requestConsentInfoUpdate$default(context, str, iConsentInfoUpdateListener, consent, (Consent.Status) null, (Consent.Zone) null, 48, (Object) null);
    }

    public static final void requestConsentInfoUpdate(Context context, String str, IConsentInfoUpdateListener iConsentInfoUpdateListener, Consent consent, Consent.Status status) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, Constants.APP_KEY);
        Intrinsics.checkNotNullParameter(iConsentInfoUpdateListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        requestConsentInfoUpdate$default(context, str, iConsentInfoUpdateListener, consent, status, (Consent.Zone) null, 32, (Object) null);
    }

    public static final void requestConsentInfoUpdate(Context context, String str, IConsentInfoUpdateListener iConsentInfoUpdateListener, Consent consent, Consent.Status status, Consent.Zone zone) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, Constants.APP_KEY);
        Intrinsics.checkNotNullParameter(iConsentInfoUpdateListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Lazy lazy = g.f17867a;
        g.a(context, str, iConsentInfoUpdateListener, consent, status, zone);
    }

    public static /* synthetic */ void requestConsentInfoUpdate$default(Context context, String str, IConsentInfoUpdateListener iConsentInfoUpdateListener, Consent consent, Consent.Status status, Consent.Zone zone, int i, Object obj) {
        if ((i & 4) != 0) {
            iConsentInfoUpdateListener = new ConsentInfoUpdateListener();
        }
        requestConsentInfoUpdate(context, str, iConsentInfoUpdateListener, (i & 8) != 0 ? null : consent, (i & 16) != 0 ? null : status, (i & 32) != 0 ? null : zone);
    }

    public static final void setStorage(Storage storage) {
        Intrinsics.checkNotNullParameter(storage, "<set-?>");
        f17795a = storage;
    }
}
