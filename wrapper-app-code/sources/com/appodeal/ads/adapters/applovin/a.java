package com.appodeal.ads.adapters.applovin;

import com.applovin.sdk.AppLovinAd;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f16200a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap f16201b = new HashMap();

    static {
        new HashMap();
    }

    public static AppLovinAd a(String str) {
        AppLovinAd appLovinAd;
        synchronized (f16200a) {
            Queue queue = (Queue) f16201b.get(str);
            appLovinAd = (queue == null || queue.isEmpty()) ? null : (AppLovinAd) queue.poll();
        }
        return appLovinAd;
    }

    public static void a(AppLovinAd appLovinAd) {
        synchronized (f16200a) {
            HashMap hashMap = f16201b;
            Queue queue = (Queue) hashMap.get(appLovinAd.getZoneId());
            if (queue == null) {
                queue = new LinkedList();
                hashMap.put(appLovinAd.getZoneId(), queue);
            }
            queue.offer(appLovinAd);
        }
    }
}
