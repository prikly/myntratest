package com.google.android.gms.ads.appopen;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbdy;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzbkx;
import com.google.android.gms.internal.ads.zzchd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public abstract class AppOpenAd {
    public static final int APP_OPEN_AD_ORIENTATION_LANDSCAPE = 2;
    public static final int APP_OPEN_AD_ORIENTATION_PORTRAIT = 1;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
    public static abstract class AppOpenAdLoadCallback extends AdLoadCallback<AppOpenAd> {
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
    public @interface AppOpenAdOrientation {
    }

    @Deprecated
    public static void load(Context context, String str, AdRequest adRequest, int i, AppOpenAdLoadCallback appOpenAdLoadCallback) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(str, "adUnitId cannot be null.");
        Preconditions.checkNotNull(adRequest, "AdRequest cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbjj.zzc(context);
        if (((Boolean) zzbkx.zzd.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzjn)).booleanValue()) {
                zzchd.zzb.execute(new zzc(context, str, adRequest, i, appOpenAdLoadCallback));
                return;
            }
        }
        new zzbdy(context, str, adRequest.zza(), i, appOpenAdLoadCallback).zza();
    }

    public abstract String getAdUnitId();

    public abstract FullScreenContentCallback getFullScreenContentCallback();

    public abstract OnPaidEventListener getOnPaidEventListener();

    public abstract ResponseInfo getResponseInfo();

    public abstract void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback);

    public abstract void setImmersiveMode(boolean z);

    public abstract void setOnPaidEventListener(OnPaidEventListener onPaidEventListener);

    public abstract void show(Activity activity);

    public static void load(Context context, String str, AdRequest adRequest, AppOpenAdLoadCallback appOpenAdLoadCallback) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(str, "adUnitId cannot be null.");
        Preconditions.checkNotNull(adRequest, "AdRequest cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbjj.zzc(context);
        if (((Boolean) zzbkx.zzd.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzjn)).booleanValue()) {
                zzchd.zzb.execute(new zzb(context, str, adRequest, appOpenAdLoadCallback));
                return;
            }
        }
        new zzbdy(context, str, adRequest.zza(), 3, appOpenAdLoadCallback).zza();
    }

    @Deprecated
    public static void load(Context context, String str, AdManagerAdRequest adManagerAdRequest, int i, AppOpenAdLoadCallback appOpenAdLoadCallback) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(str, "adUnitId cannot be null.");
        Preconditions.checkNotNull(adManagerAdRequest, "AdManagerAdRequest cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbjj.zzc(context);
        if (((Boolean) zzbkx.zzd.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzjn)).booleanValue()) {
                zzchd.zzb.execute(new zza(context, str, adManagerAdRequest, i, appOpenAdLoadCallback));
                return;
            }
        }
        new zzbdy(context, str, adManagerAdRequest.zza(), i, appOpenAdLoadCallback).zza();
    }
}
