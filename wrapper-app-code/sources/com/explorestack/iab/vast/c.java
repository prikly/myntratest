package com.explorestack.iab.vast;

import android.text.TextUtils;
import java.util.Map;
import java.util.WeakHashMap;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<VastRequest, Boolean> f3240a = new WeakHashMap();

    public static synchronized VastRequest a(String str) {
        synchronized (c.class) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            for (Map.Entry<VastRequest, Boolean> key : f3240a.entrySet()) {
                VastRequest vastRequest = (VastRequest) key.getKey();
                if (vastRequest.getId().equals(str)) {
                    return vastRequest;
                }
            }
            return null;
        }
    }

    public static synchronized void b(VastRequest vastRequest) {
        synchronized (c.class) {
            if (vastRequest != null) {
                f3240a.put(vastRequest, Boolean.TRUE);
            }
        }
    }
}
