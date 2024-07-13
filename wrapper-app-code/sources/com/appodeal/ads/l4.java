package com.appodeal.ads;

import com.appodeal.ads.modules.libs.network.AppodealEndpoint;
import com.appodeal.ads.modules.libs.network.AppodealEndpoints;
import kotlin.jvm.internal.Intrinsics;

public final class l4 implements k4 {

    /* renamed from: a  reason: collision with root package name */
    public final AppodealEndpoint f16588a;

    public /* synthetic */ l4() {
        this(AppodealEndpoints.INSTANCE);
    }

    public l4(AppodealEndpoint appodealEndpoint) {
        Intrinsics.checkNotNullParameter(appodealEndpoint, "appodealEndpoint");
        this.f16588a = appodealEndpoint;
    }

    public final boolean b() {
        return this.f16588a.popNextEndpoint() != null;
    }
}
