package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.internal.ads.zzcho;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {
    static final AdError zza = new AdError(0, "Could not instantiate custom event adapter", MobileAds.ERROR_DOMAIN);
    CustomEventBanner zzb;
    CustomEventInterstitial zzc;
    CustomEventNative zzd;
    /* access modifiers changed from: private */
    public View zze;

    private static Object zzb(Class cls, String str) {
        if (str != null) {
            try {
                return cls.cast(Class.forName(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (Throwable th) {
                String message = th.getMessage();
                zzcho.zzj("Could not instantiate custom event adapter: " + str + ". " + message);
                return null;
            }
        } else {
            throw null;
        }
    }

    public View getBannerView() {
        return this.zze;
    }

    public void onDestroy() {
        CustomEventBanner customEventBanner = this.zzb;
        if (customEventBanner != null) {
            customEventBanner.onDestroy();
        }
        CustomEventInterstitial customEventInterstitial = this.zzc;
        if (customEventInterstitial != null) {
            customEventInterstitial.onDestroy();
        }
        CustomEventNative customEventNative = this.zzd;
        if (customEventNative != null) {
            customEventNative.onDestroy();
        }
    }

    public void onPause() {
        CustomEventBanner customEventBanner = this.zzb;
        if (customEventBanner != null) {
            customEventBanner.onPause();
        }
        CustomEventInterstitial customEventInterstitial = this.zzc;
        if (customEventInterstitial != null) {
            customEventInterstitial.onPause();
        }
        CustomEventNative customEventNative = this.zzd;
        if (customEventNative != null) {
            customEventNative.onPause();
        }
    }

    public void onResume() {
        CustomEventBanner customEventBanner = this.zzb;
        if (customEventBanner != null) {
            customEventBanner.onResume();
        }
        CustomEventInterstitial customEventInterstitial = this.zzc;
        if (customEventInterstitial != null) {
            customEventInterstitial.onResume();
        }
        CustomEventNative customEventNative = this.zzd;
        if (customEventNative != null) {
            customEventNative.onResume();
        }
    }

    public void requestBannerAd(Context context, MediationBannerListener mediationBannerListener, Bundle bundle, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        Bundle bundle3;
        CustomEventBanner customEventBanner = (CustomEventBanner) zzb(CustomEventBanner.class, bundle.getString("class_name"));
        this.zzb = customEventBanner;
        if (customEventBanner == null) {
            mediationBannerListener.onAdFailedToLoad((MediationBannerAdapter) this, zza);
            return;
        }
        if (bundle2 == null) {
            bundle3 = null;
        } else {
            bundle3 = bundle2.getBundle(bundle.getString("class_name"));
        }
        CustomEventBanner customEventBanner2 = this.zzb;
        if (customEventBanner2 != null) {
            customEventBanner2.requestBannerAd(context, new zza(this, mediationBannerListener), bundle.getString(MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), adSize, mediationAdRequest, bundle3);
            return;
        }
        throw null;
    }

    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        Bundle bundle3;
        CustomEventInterstitial customEventInterstitial = (CustomEventInterstitial) zzb(CustomEventInterstitial.class, bundle.getString("class_name"));
        this.zzc = customEventInterstitial;
        if (customEventInterstitial == null) {
            mediationInterstitialListener.onAdFailedToLoad((MediationInterstitialAdapter) this, zza);
            return;
        }
        if (bundle2 == null) {
            bundle3 = null;
        } else {
            bundle3 = bundle2.getBundle(bundle.getString("class_name"));
        }
        CustomEventInterstitial customEventInterstitial2 = this.zzc;
        if (customEventInterstitial2 != null) {
            customEventInterstitial2.requestInterstitialAd(context, new zzb(this, this, mediationInterstitialListener), bundle.getString(MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), mediationAdRequest, bundle3);
            return;
        }
        throw null;
    }

    public void requestNativeAd(Context context, MediationNativeListener mediationNativeListener, Bundle bundle, NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle2) {
        Bundle bundle3;
        CustomEventNative customEventNative = (CustomEventNative) zzb(CustomEventNative.class, bundle.getString("class_name"));
        this.zzd = customEventNative;
        if (customEventNative == null) {
            mediationNativeListener.onAdFailedToLoad((MediationNativeAdapter) this, zza);
            return;
        }
        if (bundle2 == null) {
            bundle3 = null;
        } else {
            bundle3 = bundle2.getBundle(bundle.getString("class_name"));
        }
        CustomEventNative customEventNative2 = this.zzd;
        if (customEventNative2 != null) {
            customEventNative2.requestNativeAd(context, new zzc(this, mediationNativeListener), bundle.getString(MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), nativeMediationAdRequest, bundle3);
            return;
        }
        throw null;
    }

    public void showInterstitial() {
        CustomEventInterstitial customEventInterstitial = this.zzc;
        if (customEventInterstitial != null) {
            customEventInterstitial.showInterstitial();
        }
    }
}
