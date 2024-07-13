package com.appodeal.ads.utils;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.appodeal.ads.AdNetwork;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.n5;
import com.appodeal.ads.utils.exception_handler.a;
import java.util.EnumMap;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static final EnumMap<AdType, Pair<Handler, Runnable>> f17601a = new EnumMap<>(AdType.class);

    public static void a(AdType adType) {
        EnumMap<AdType, Pair<Handler, Runnable>> enumMap = f17601a;
        Pair pair = enumMap.get(adType);
        if (pair != null) {
            ((Handler) pair.first).removeCallbacks((Runnable) pair.second);
            enumMap.remove(adType);
        }
    }

    public static void a(AdType adType, AdNetwork<?> adNetwork) {
        Handler handler = new Handler(Looper.getMainLooper());
        $$Lambda$7bMj6mZ_Ki8j_SPHJq3YEIOUaKM r1 = new Runnable(adNetwork) {
            public final /* synthetic */ AdNetwork f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                y.b(AdType.this, this.f$1);
            }
        };
        handler.postDelayed(r1, 3000);
        f17601a.put(adType, new Pair(handler, r1));
    }

    public static void b(AdType adType, AdNetwork adNetwork) {
        Log.log(new a(String.format("%s %s was not shown", new Object[]{n5.a(adNetwork.getName()), adType.getDisplayName()})));
        f17601a.remove(adType);
    }
}
