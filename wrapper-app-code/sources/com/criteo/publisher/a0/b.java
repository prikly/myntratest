package com.criteo.publisher.a0;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import com.criteo.publisher.n0.o;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: TopActivityFinder */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2294a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public WeakReference<Activity> f2295b = new WeakReference<>((Object) null);

    public b(Context context) {
        this.f2294a = context;
    }

    public ComponentName a() {
        Activity activity = (Activity) this.f2295b.get();
        if (activity != null) {
            return activity.getComponentName();
        }
        ActivityManager activityManager = (ActivityManager) this.f2294a.getSystemService("activity");
        if (!o.a((Object) activityManager)) {
            return null;
        }
        try {
            List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(1);
            if (runningTasks.isEmpty()) {
                return null;
            }
            ComponentName componentName = runningTasks.get(0).topActivity;
            if (componentName.getPackageName().startsWith(this.f2294a.getPackageName())) {
                return componentName;
            }
            return null;
        } catch (SecurityException e2) {
            o.a((Throwable) e2);
            return null;
        }
    }

    /* compiled from: TopActivityFinder */
    class a extends a {
        a() {
        }

        public void onActivityResumed(Activity activity) {
            WeakReference unused = b.this.f2295b = new WeakReference(activity);
        }

        public void onActivityPaused(Activity activity) {
            if (activity.equals(b.this.f2295b.get())) {
                WeakReference unused = b.this.f2295b = new WeakReference((Object) null);
            }
        }
    }

    public void a(Application application) {
        application.registerActivityLifecycleCallbacks(new a());
    }
}
