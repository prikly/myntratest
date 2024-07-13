package com.appodeal.ads.modules.common.internal.context;

import android.app.Activity;
import android.content.Context;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\u0013J\n\u0010\u0012\u001a\u0004\u0018\u00010\u000bH&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;", "", "activity", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "activityFlow", "Lkotlinx/coroutines/flow/Flow;", "getActivityFlow", "()Lkotlinx/coroutines/flow/Flow;", "applicationContext", "Landroid/content/Context;", "getApplicationContext", "()Landroid/content/Context;", "topActivityFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getTopActivityFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "getApplicationContextOrNull", "Synchronizer", "apd_internal"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface ContextProvider {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/context/ContextProvider$Synchronizer;", "", "setActivity", "", "activity", "Landroid/app/Activity;", "setApplicationContext", "applicationContext", "Landroid/content/Context;", "setAutomaticActivityObserving", "isAutomatic", "", "apd_internal"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface Synchronizer {
        void setActivity(Activity activity);

        void setApplicationContext(Context context);

        void setAutomaticActivityObserving(boolean z);
    }

    Activity getActivity();

    Flow<Activity> getActivityFlow();

    Context getApplicationContext();

    Context getApplicationContextOrNull();

    StateFlow<Activity> getTopActivityFlow();
}
