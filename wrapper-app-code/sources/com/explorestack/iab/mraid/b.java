package com.explorestack.iab.mraid;

import java.util.Arrays;
import java.util.List;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f2986a;

    public b(List<String> list) {
        this.f2986a = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public b(String[] strArr) {
        this((List<String>) strArr != null ? Arrays.asList(strArr) : null);
    }

    public boolean a() {
        MraidLog.d("MRAIDNativeFeatureManager", "isCalendarSupported: false (deprecated)");
        return false;
    }

    public boolean b() {
        List<String> list = this.f2986a;
        boolean z = list != null && list.contains("inlineVideo");
        MraidLog.d("MRAIDNativeFeatureManager", "isInlineVideoSupported " + z);
        return z;
    }

    public boolean c() {
        MraidLog.d("MRAIDNativeFeatureManager", "isSmsSupported: false (deprecated)");
        return false;
    }

    public boolean d() {
        MraidLog.d("MRAIDNativeFeatureManager", "isStorePictureSupported: false (deprecated)");
        return false;
    }

    public boolean e() {
        MraidLog.d("MRAIDNativeFeatureManager", "isTelSupported: false (deprecated)");
        return false;
    }
}
