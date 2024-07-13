package com.bytedance.sdk.component.adexpress.theme;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.sdk.component.utils.l;
import java.lang.ref.WeakReference;

public class ThemeStatusBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<a> f18686a;

    public void onReceive(Context context, Intent intent) {
        l.b("ThemeStatusBroadcastReceiver", "====主题状态更新====");
        if (intent != null) {
            int intExtra = intent.getIntExtra("theme_status_change", 0);
            WeakReference<a> weakReference = this.f18686a;
            if (weakReference != null && weakReference.get() != null) {
                ((a) this.f18686a.get()).b(intExtra);
            }
        }
    }

    public void a(a aVar) {
        this.f18686a = new WeakReference<>(aVar);
    }
}
