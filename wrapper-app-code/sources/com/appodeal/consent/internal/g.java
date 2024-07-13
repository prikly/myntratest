package com.appodeal.consent.internal;

import android.content.Context;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.consent.Consent;
import com.appodeal.consent.IConsentInfoUpdateListener;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.bidmachine.protobuf.EventTypeExtended;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.json.JSONObject;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final Lazy f17867a = LazyKt.lazy(a.f17872a);

    /* renamed from: b  reason: collision with root package name */
    public static final CoroutineScope f17868b = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO());

    /* renamed from: c  reason: collision with root package name */
    public static String f17869c = new String();

    /* renamed from: d  reason: collision with root package name */
    public static boolean f17870d;

    /* renamed from: e  reason: collision with root package name */
    public static Consent f17871e = new Consent((Consent.Status) null, (Consent.Zone) null, 0, (String) null, 0, 0, (JSONObject) null, (JSONObject) null, (List) null, EventTypeExtended.EVENT_TYPE_EXTENDED_AD_EXPIRED_VALUE, (DefaultConstructorMarker) null);

    public static final class a extends Lambda implements Function0<k> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f17872a = new a();

        public a() {
            super(0);
        }

        public final Object invoke() {
            return new k();
        }
    }

    public static final k a() {
        return (k) f17867a.getValue();
    }

    public static void a(Context context, String str, IConsentInfoUpdateListener iConsentInfoUpdateListener, Consent consent, Consent.Status status, Consent.Zone zone) {
        Consent consent2;
        Consent consent3;
        Context context2 = context;
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(str, Constants.APP_KEY);
        Intrinsics.checkNotNullParameter(iConsentInfoUpdateListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        if (consent != null) {
            consent2 = consent;
        } else {
            if (status == null || zone == null) {
                consent3 = b.a(Consent.Companion, context2);
                if (consent3 == null) {
                    consent3 = f17871e;
                }
            } else {
                consent3 = new Consent(status, zone, 0, (String) null, 0, 0, (JSONObject) null, (JSONObject) null, (List) null, 508, (DefaultConstructorMarker) null);
            }
            consent2 = consent3;
        }
        Job unused = BuildersKt__Builders_commonKt.launch$default(f17868b, (CoroutineContext) null, (CoroutineStart) null, new f(str, context, consent2, iConsentInfoUpdateListener, (Continuation<? super f>) null), 3, (Object) null);
    }

    public static void a(Consent consent) {
        Intrinsics.checkNotNullParameter(consent, "<set-?>");
        f17871e = consent;
    }

    public static void a(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        f17869c = str;
    }

    public static void a(boolean z) {
        f17870d = z;
    }

    public static Consent b() {
        return f17871e;
    }
}
