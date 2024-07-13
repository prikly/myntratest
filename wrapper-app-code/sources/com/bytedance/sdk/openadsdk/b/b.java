package com.bytedance.sdk.openadsdk.b;

import com.appodeal.ads.modules.common.internal.Constants;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: AdEventConstants */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Set<String> f225a = new HashSet(Arrays.asList(new String[]{Constants.CLICK, Constants.SHOW, "insight_log"}));

    public static boolean a(String str) {
        return "embeded_ad".equals(str) || "banner_ad".equals(str) || "interaction".equals(str) || "slide_banner_ad".equals(str);
    }
}
