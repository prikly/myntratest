package com.appodeal.ads.unified;

import android.app.Activity;
import com.appodeal.ads.utils.app.AppState;

public interface UnifiedAppStateChangeListener {
    void onAppStateChanged(Activity activity, AppState appState, boolean z);
}
