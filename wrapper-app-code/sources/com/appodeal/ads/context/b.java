package com.appodeal.ads.context;

import android.app.Activity;
import android.content.Context;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

public final class b implements ContextProvider {

    /* renamed from: b  reason: collision with root package name */
    public static final b f16327b = new b();

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f16328a = c.a();

    public final Activity getActivity() {
        return this.f16328a.getActivity();
    }

    public final Flow<Activity> getActivityFlow() {
        return this.f16328a.f16337e;
    }

    public final Context getApplicationContext() {
        return this.f16328a.getApplicationContext();
    }

    public final Context getApplicationContextOrNull() {
        return this.f16328a.f16333a;
    }

    public final StateFlow<Activity> getTopActivityFlow() {
        return this.f16328a.f16338f;
    }
}
