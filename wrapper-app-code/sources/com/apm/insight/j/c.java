package com.apm.insight.j;

import android.os.Handler;
import android.text.TextUtils;
import com.apm.insight.h;
import com.apm.insight.l.q;
import com.appodeal.ads.adapters.admob.BuildConfig;

public class c extends a {
    c(Handler handler, long j, long j2) {
        super(handler, j, j2);
    }

    public void run() {
        String str;
        if (!h.c().b()) {
            String d2 = h.a().d();
            if (TextUtils.isEmpty(d2) || BuildConfig.ADAPTER_VERSION.equals(d2)) {
                a(c());
                str = "[DeviceIdTask] did is null, continue check.";
            } else {
                h.c().a(d2);
                str = "[DeviceIdTask] did is " + d2;
            }
            q.a((Object) str);
        }
    }
}
