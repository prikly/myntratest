package com.yandex.metrica.impl.ob;

import android.app.Activity;
import java.util.WeakHashMap;

public class r {

    /* renamed from: a  reason: collision with root package name */
    private final WeakHashMap<Activity, a> f6663a = new WeakHashMap<>();

    public enum a {
        UNDEFINED,
        RESUMED,
        PAUSED
    }

    public boolean a(Activity activity, a aVar) {
        if (activity != null && this.f6663a.get(activity) == aVar) {
            return false;
        }
        if (activity == null) {
            return true;
        }
        this.f6663a.put(activity, aVar);
        return true;
    }
}
