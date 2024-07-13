package com.yandex.metrica.impl.ob;

import android.content.ComponentName;
import android.content.Context;
import com.yandex.metrica.PreloadInfoContentProvider;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class Y {

    /* renamed from: a  reason: collision with root package name */
    private static volatile CountDownLatch f5358a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile PreloadInfoContentProvider f5359b;

    public static final void a(PreloadInfoContentProvider preloadInfoContentProvider) {
        f5358a = new CountDownLatch(1);
        f5359b = preloadInfoContentProvider;
    }

    public static final void a() {
        CountDownLatch countDownLatch = f5358a;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public static final void a(Context context) {
        CountDownLatch countDownLatch = f5358a;
        if (countDownLatch != null) {
            countDownLatch.await(1, TimeUnit.SECONDS);
            try {
                context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, PreloadInfoContentProvider.class), 2, 1);
                PreloadInfoContentProvider preloadInfoContentProvider = f5359b;
                if (preloadInfoContentProvider != null) {
                    preloadInfoContentProvider.disable();
                }
            } catch (Throwable unused) {
            }
            f5358a = null;
        }
    }
}
