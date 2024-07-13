package com.appodeal.ads.utils.tracker;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.utils.Log;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class c implements a {

    public static final class a implements ComponentCallbacks2 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f17574a;

        public a(c cVar) {
            this.f17574a = cVar;
        }

        public final void onConfigurationChanged(Configuration configuration) {
            Intrinsics.checkNotNullParameter(configuration, "newConfig");
        }

        public final void onLowMemory() {
            this.f17574a.getClass();
            Log.log(LogConstants.EVENT_WARNING, "onLowMemory");
        }

        public final void onTrimMemory(int i) {
            c.a(this.f17574a, i);
        }
    }

    public static final void a(c cVar, int i) {
        cVar.getClass();
        if (i == 10 || i == 15) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("Level [%s]: %s", Arrays.copyOf(new Object[]{Integer.valueOf(i), "Critical lack of memory"}, 2));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            Log.log(LogConstants.EVENT_WARNING, "onTrimMemory", format);
        }
    }

    public final void a(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        application.registerComponentCallbacks(new a(this));
    }
}
