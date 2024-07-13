package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzef;
import com.google.android.gms.measurement.internal.zzhy;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.FirebaseInstallations;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.0 */
public final class FirebaseAnalytics {
    private static volatile FirebaseAnalytics zza;
    private final zzef zzb;

    public FirebaseAnalytics(zzef zzef) {
        Preconditions.checkNotNull(zzef);
        this.zzb = zzef;
    }

    public static FirebaseAnalytics getInstance(Context context) {
        if (zza == null) {
            synchronized (FirebaseAnalytics.class) {
                if (zza == null) {
                    zza = new FirebaseAnalytics(zzef.zzg(context, (String) null, (String) null, (String) null, (Bundle) null));
                }
            }
        }
        return zza;
    }

    public static zzhy getScionFrontendApiImplementation(Context context, Bundle bundle) {
        zzef zzg = zzef.zzg(context, (String) null, (String) null, (String) null, bundle);
        if (zzg == null) {
            return null;
        }
        return new zzd(zzg);
    }

    public String getFirebaseInstanceId() {
        try {
            return (String) Tasks.await(FirebaseInstallations.getInstance().getId(), 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        } catch (InterruptedException e3) {
            throw new IllegalStateException(e3);
        }
    }

    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        this.zzb.zzH(activity, str, str2);
    }
}
