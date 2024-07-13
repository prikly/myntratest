package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zze;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzbck implements Application.ActivityLifecycleCallbacks {
    private final Application zza;
    private final WeakReference zzb;
    private boolean zzc = false;

    public zzbck(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.zzb = new WeakReference(activityLifecycleCallbacks);
        this.zza = application;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zza(new zzbcc(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        zza(new zzbci(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        zza(new zzbcf(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        zza(new zzbce(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zza(new zzbch(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        zza(new zzbcd(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        zza(new zzbcg(this, activity));
    }

    /* access modifiers changed from: protected */
    public final void zza(zzbcj zzbcj) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.zzb.get();
            if (activityLifecycleCallbacks != null) {
                zzbcj.zza(activityLifecycleCallbacks);
            } else if (!this.zzc) {
                this.zza.unregisterActivityLifecycleCallbacks(this);
                this.zzc = true;
            }
        } catch (Exception e2) {
            zze.zzh("Error while dispatching lifecycle callback.", e2);
        }
    }
}
