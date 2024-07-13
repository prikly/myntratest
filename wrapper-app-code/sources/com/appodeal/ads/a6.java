package com.appodeal.ads;

import android.app.Activity;
import android.content.Context;
import com.appodeal.ads.context.b;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.r5;
import com.appodeal.ads.s;
import com.appodeal.ads.segments.h;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.utils.app.AppState;
import com.appodeal.ads.utils.c;
import com.appodeal.ads.x5;
import com.appodeal.ads.z5;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

public abstract class a6<AdObjectType extends r5<AdRequestType, ?, ?, ?>, AdRequestType extends z5<AdObjectType>, RequestParamsType extends s<RequestParamsType>> extends u<AdObjectType, AdRequestType, RequestParamsType> {
    public a6(b6 b6Var, AdType adType) {
        super(b6Var, adType, h.b());
    }

    public final void a(Activity activity, AppState appState) {
        x5 x = x();
        if (appState == AppState.Resumed && this.i && !c.a(activity)) {
            x5.d a2 = x.a(activity);
            if (a2.f17695b == f0.VISIBLE || a2.f17694a != null) {
                x.a(activity, new y5(e(), x.b(activity)), this);
            }
        }
        if (appState == AppState.Destroyed) {
            for (Map.Entry entry : x.l.entrySet()) {
                if (((WeakReference) entry.getKey()).get() == activity) {
                    x.l.remove(entry.getKey());
                    Log.debug(x.f17682a, "handleActivityDestroy", activity.toString());
                    return;
                }
            }
        }
    }

    public final void b(Context context) {
        b(context, w());
    }

    public final void t() {
        Activity activity = b.f16327b.f16328a.getActivity();
        if (activity != null) {
            x5 x = x();
            a aVar = x.a(activity).f17694a;
            if (!(aVar != null ? x.a(activity, new y5(e(), aVar), this) : false)) {
                super.t();
            }
        }
    }

    public final boolean u() {
        return this.u && f() == null;
    }

    public abstract RequestParamsType w();

    public abstract x5<AdRequestType, AdObjectType> x();

    public final void a(JSONObject jSONObject) {
        x5 x = x();
        x.getClass();
        if (jSONObject.has("refresh_period")) {
            x.f17683b = Integer.valueOf(jSONObject.optInt("refresh_period") * 1000);
        }
    }
}
