package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzapz implements Application.ActivityLifecycleCallbacks {
    private final Application zza;
    private final WeakReference zzb;
    private boolean zzc = false;

    public zzapz(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.zzb = new WeakReference(activityLifecycleCallbacks);
        this.zza = application;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zza(new zzapr(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        zza(new zzapx(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        zza(new zzapu(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        zza(new zzapt(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zza(new zzapw(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        zza(new zzaps(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        zza(new zzapv(this, activity));
    }

    /* access modifiers changed from: protected */
    public final void zza(zzapy zzapy) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.zzb.get();
            if (activityLifecycleCallbacks != null) {
                zzapy.zza(activityLifecycleCallbacks);
            } else if (!this.zzc) {
                this.zza.unregisterActivityLifecycleCallbacks(this);
                this.zzc = true;
            }
        } catch (Exception unused) {
        }
    }
}
