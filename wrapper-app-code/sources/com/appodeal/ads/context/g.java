package com.appodeal.ads.context;

import android.app.Activity;
import android.content.Context;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import kotlin.jvm.internal.Intrinsics;

public final class g implements ContextProvider.Synchronizer {

    /* renamed from: b  reason: collision with root package name */
    public static final g f16345b = new g();

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f16346a = c.a();

    public final void setActivity(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f16346a.setActivity(activity);
    }

    public final void setApplicationContext(Context context) {
        Intrinsics.checkNotNullParameter(context, "applicationContext");
        this.f16346a.setApplicationContext(context);
    }

    public final void setAutomaticActivityObserving(boolean z) {
        this.f16346a.setAutomaticActivityObserving(z);
    }
}
