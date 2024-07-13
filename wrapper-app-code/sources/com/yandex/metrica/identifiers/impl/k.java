package com.yandex.metrica.identifiers.impl;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import kotlin.jvm.internal.Intrinsics;

public final class k implements i {
    public g a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            Intrinsics.checkNotNullExpressionValue(advertisingIdInfo, "AdvertisingIdClient.getAdvertisingIdInfo(context)");
            return new g(l.OK, new f("google", advertisingIdInfo.getId(), Boolean.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled())), (String) null, 4);
        } catch (GooglePlayServicesNotAvailableException unused) {
            return new g(l.IDENTIFIER_PROVIDER_UNAVAILABLE, (f) null, "could not resolve google services", 2);
        } catch (Throwable th) {
            l lVar = l.UNKNOWN;
            return new g(lVar, (f) null, "exception while fetching google adv_id: " + th.getMessage(), 2);
        }
    }
}
