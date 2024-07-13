package com.appodeal.consent.internal;

import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilder;
import com.appodeal.advertising.AdvertisingInfo;
import com.onesignal.outcomes.OSOutcomeConstants;
import io.bidmachine.utils.IabUtils;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function1<JsonObjectBuilder, Unit> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AdvertisingInfo.AdvertisingProfile f17874a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f17875b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Pair<Integer, Integer> f17876c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(AdvertisingInfo.AdvertisingProfile advertisingProfile, a aVar, Pair<Integer, Integer> pair) {
        super(1);
        this.f17874a = advertisingProfile;
        this.f17875b = aVar;
        this.f17876c = pair;
    }

    public final Object invoke(Object obj) {
        JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "$this$jsonObject");
        jsonObjectBuilder.hasValue(OSOutcomeConstants.OUTCOME_ID, this.f17874a.getId());
        jsonObjectBuilder.hasValue("advertisingTracking", Boolean.valueOf(this.f17874a.isLimitAdTrackingEnabled()));
        jsonObjectBuilder.hasValue("type", this.f17875b.h());
        jsonObjectBuilder.hasValue("locale", this.f17875b.j());
        jsonObjectBuilder.hasValue(IabUtils.KEY_WIDTH, this.f17876c.getFirst());
        jsonObjectBuilder.hasValue(IabUtils.KEY_HEIGHT, this.f17876c.getSecond());
        jsonObjectBuilder.hasValue("hwv", this.f17875b.g());
        jsonObjectBuilder.hasValue("make", this.f17875b.f());
        jsonObjectBuilder.hasValue("os", this.f17875b.k());
        jsonObjectBuilder.hasValue("osv", this.f17875b.l());
        return Unit.INSTANCE;
    }
}
