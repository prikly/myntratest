package com.applovin.impl.sdk;

import android.app.Activity;
import com.applovin.sdk.AppLovinUserService;

public class UserServiceImpl implements AppLovinUserService {

    /* renamed from: a  reason: collision with root package name */
    private final n f15168a;

    UserServiceImpl(n nVar) {
        this.f15168a = nVar;
    }

    public void preloadConsentDialog() {
        this.f15168a.Z().c();
    }

    public void showConsentDialog(Activity activity, AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener) {
        this.f15168a.Z().a(activity, onConsentDialogDismissListener);
    }

    public String toString() {
        return "UserService{}";
    }
}
