package com.appodeal.ads.utils.app;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import com.appodeal.ads.utils.c;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

@Deprecated
public enum b implements a {
    All,
    Ad,
    NotAd;
    

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentLinkedQueue f17485a;

    public final void a(a aVar) {
        if (aVar != null) {
            this.f17485a.add(new WeakReference(aVar));
        }
    }

    public final boolean a(Activity activity) {
        return this == All || (this == Ad && c.a(activity)) || (this == NotAd && !c.a(activity));
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (a(activity)) {
            Iterator it = this.f17485a.iterator();
            while (it.hasNext()) {
                a aVar = (a) ((WeakReference) it.next()).get();
                if (aVar != null) {
                    aVar.onActivityCreated(activity, bundle);
                }
            }
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        if (a(activity)) {
            Iterator it = this.f17485a.iterator();
            while (it.hasNext()) {
                a aVar = (a) ((WeakReference) it.next()).get();
                if (aVar != null) {
                    aVar.onActivityDestroyed(activity);
                }
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        if (a(activity)) {
            Iterator it = this.f17485a.iterator();
            while (it.hasNext()) {
                a aVar = (a) ((WeakReference) it.next()).get();
                if (aVar != null) {
                    aVar.onActivityPaused(activity);
                }
            }
        }
    }

    public final void onActivityResumed(Activity activity) {
        if (a(activity)) {
            Iterator it = this.f17485a.iterator();
            while (it.hasNext()) {
                a aVar = (a) ((WeakReference) it.next()).get();
                if (aVar != null) {
                    aVar.onActivityResumed(activity);
                }
            }
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        if (a(activity)) {
            Iterator it = this.f17485a.iterator();
            while (it.hasNext()) {
                a aVar = (a) ((WeakReference) it.next()).get();
                if (aVar != null) {
                    aVar.onActivitySaveInstanceState(activity, bundle);
                }
            }
        }
    }

    public final void onActivityStarted(Activity activity) {
        if (a(activity)) {
            Iterator it = this.f17485a.iterator();
            while (it.hasNext()) {
                a aVar = (a) ((WeakReference) it.next()).get();
                if (aVar != null) {
                    aVar.onActivityStarted(activity);
                }
            }
        }
    }

    public final void onActivityStopped(Activity activity) {
        if (a(activity)) {
            Iterator it = this.f17485a.iterator();
            while (it.hasNext()) {
                a aVar = (a) ((WeakReference) it.next()).get();
                if (aVar != null) {
                    aVar.onActivityStopped(activity);
                }
            }
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        Iterator it = this.f17485a.iterator();
        while (it.hasNext()) {
            a aVar = (a) ((WeakReference) it.next()).get();
            if (aVar != null) {
                aVar.onConfigurationChanged(configuration);
            }
        }
    }

    public final void onLowMemory() {
        Iterator it = this.f17485a.iterator();
        while (it.hasNext()) {
            a aVar = (a) ((WeakReference) it.next()).get();
            if (aVar != null) {
                aVar.onLowMemory();
            }
        }
    }
}
