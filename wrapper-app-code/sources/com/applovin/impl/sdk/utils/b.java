package com.applovin.impl.sdk.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.WindowInsets;
import android.view.WindowInsetsController;

public class b {

    public interface a<T extends Activity> {
        void a(T t);
    }

    public static void a(Context context, final Class cls, final com.applovin.impl.sdk.a aVar, final a aVar2) {
        aVar.a(new a() {
            public void onActivityCreated(Activity activity, Bundle bundle) {
                if (cls.isInstance(activity)) {
                    aVar2.a(activity);
                    aVar.b(this);
                }
            }
        });
        context.startActivity(new Intent(context, cls));
    }

    public static void a(boolean z, Activity activity) {
        WindowInsetsController insetsController;
        if (!z || !h.j() || (insetsController = activity.getWindow().getInsetsController()) == null) {
            activity.getWindow().getDecorView().setSystemUiVisibility(5894);
            return;
        }
        insetsController.setSystemBarsBehavior(2);
        insetsController.hide(WindowInsets.Type.systemBars());
    }

    public static boolean a(Activity activity) {
        return activity == null || activity.isFinishing() || activity.isChangingConfigurations() || (h.b() && activity.isDestroyed());
    }
}
