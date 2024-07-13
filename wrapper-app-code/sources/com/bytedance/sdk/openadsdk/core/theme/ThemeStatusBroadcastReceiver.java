package com.bytedance.sdk.openadsdk.core.theme;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.sdk.component.utils.l;
import java.lang.ref.WeakReference;

public class ThemeStatusBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<a> f1546a;

    public void onReceive(Context context, Intent intent) {
        l.b("ThemeStatusBroadcastReceiver", "====主题状态更新====");
        if (intent != null) {
            int intExtra = intent.getIntExtra("theme_status_change", 0);
            WeakReference<a> weakReference = this.f1546a;
            if (weakReference != null && weakReference.get() != null) {
                ((a) this.f1546a.get()).a(intExtra);
            }
        }
    }
}
