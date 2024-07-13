package com.ironsource.environment;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ConcurrentHashMap;

public class ContextProvider {

    /* renamed from: e  reason: collision with root package name */
    private static volatile ContextProvider f8009e;

    /* renamed from: a  reason: collision with root package name */
    private Activity f8010a;

    /* renamed from: b  reason: collision with root package name */
    private Context f8011b;

    /* renamed from: c  reason: collision with root package name */
    private ConcurrentHashMap<String, a> f8012c = new ConcurrentHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private Handler f8013d = new Handler(Looper.getMainLooper());

    public interface a {
        void onPause(Activity activity);

        void onResume(Activity activity);
    }

    private ContextProvider() {
    }

    public static ContextProvider getInstance() {
        if (f8009e == null) {
            synchronized (ContextProvider.class) {
                if (f8009e == null) {
                    f8009e = new ContextProvider();
                }
            }
        }
        return f8009e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f8010a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.Context getApplicationContext() {
        /*
            r1 = this;
            android.content.Context r0 = r1.f8011b
            if (r0 != 0) goto L_0x000d
            android.app.Activity r0 = r1.f8010a
            if (r0 == 0) goto L_0x000d
            android.content.Context r0 = r0.getApplicationContext()
            return r0
        L_0x000d:
            android.content.Context r0 = r1.f8011b
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.environment.ContextProvider.getApplicationContext():android.content.Context");
    }

    public Activity getCurrentActiveActivity() {
        return this.f8010a;
    }

    public void onPause(Activity activity) {
        if (activity != null) {
            for (a onPause : this.f8012c.values()) {
                onPause.onPause(activity);
            }
        }
    }

    public void onResume(Activity activity) {
        if (activity != null) {
            this.f8010a = activity;
            for (a onResume : this.f8012c.values()) {
                onResume.onResume(this.f8010a);
            }
        }
    }

    @Deprecated
    public void postOnUIThread(Runnable runnable) {
        Handler handler = this.f8013d;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    public void registerLifeCycleListener(a aVar) {
        this.f8012c.put(aVar.getClass().getSimpleName(), aVar);
    }

    public void updateActivity(Activity activity) {
        if (activity != null) {
            this.f8010a = activity;
        }
    }

    public void updateAppContext(Context context) {
        if (context != null) {
            this.f8011b = context;
        }
    }
}
