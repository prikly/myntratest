package com.ironsource.sdk.controller;

import android.os.Bundle;
import com.ironsource.sdk.utils.Logger;

public class InterstitialActivity extends ControllerActivity {

    /* renamed from: a  reason: collision with root package name */
    private static final String f9084a = InterstitialActivity.class.getSimpleName();

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.i(f9084a, "onCreate");
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        Logger.i(f9084a, "onPause");
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        Logger.i(f9084a, "onResume");
    }
}
