package com.appodeal.ads.modules.libs.network;

import com.appodeal.ads.modules.libs.network.endpoint.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0001J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0001R\u0014\u0010\u000b\u001a\u00020\u00028\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/appodeal/ads/modules/libs/network/AppodealEndpoints;", "Lcom/appodeal/ads/modules/libs/network/AppodealEndpoint;", "", "defaultBaseUrl", "", "loadedUrls", "", "init", "popNextEndpoint", "getActiveEndpoint", "()Ljava/lang/String;", "activeEndpoint", "apd_network"}, k = 1, mv = {1, 6, 0})
public final class AppodealEndpoints implements AppodealEndpoint {
    public static final AppodealEndpoints INSTANCE = new AppodealEndpoints();

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f16717a = new a();

    public String getActiveEndpoint() {
        return this.f16717a.getActiveEndpoint();
    }

    public void init(String str, Set<String> set) {
        Intrinsics.checkNotNullParameter(str, "defaultBaseUrl");
        Intrinsics.checkNotNullParameter(set, "loadedUrls");
        this.f16717a.init(str, set);
    }

    public String popNextEndpoint() {
        return this.f16717a.popNextEndpoint();
    }
}
