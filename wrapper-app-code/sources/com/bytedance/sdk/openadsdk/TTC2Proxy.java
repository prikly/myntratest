package com.bytedance.sdk.openadsdk;

import android.content.Context;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.component.c;
import com.bytedance.sdk.openadsdk.component.f.a;

public class TTC2Proxy {
    private TTC2Proxy() {
    }

    public static void load(Context context, AdSlot adSlot, TTAdNative.AppOpenAdListener appOpenAdListener, int i) {
        adSlot.setDurationSlotType(3);
        c.a(context).a(adSlot, appOpenAdListener, i);
    }

    public static void a(Context context) {
        a.a(context);
    }
}
