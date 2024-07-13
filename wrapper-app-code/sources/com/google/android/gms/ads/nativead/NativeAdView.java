package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzep;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzbmi;
import com.google.android.gms.internal.ads.zzbmp;
import com.google.android.gms.internal.ads.zzcho;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class NativeAdView extends FrameLayout {
    private final FrameLayout zza;
    private final zzbmp zzb = zze();

    public NativeAdView(Context context) {
        super(context);
        this.zza = zzd(context);
    }

    private final FrameLayout zzd(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    private final zzbmp zze() {
        if (isInEditMode()) {
            return null;
        }
        return zzay.zza().zzh(this.zza.getContext(), this, this.zza);
    }

    private final void zzf(String str, View view) {
        zzbmp zzbmp = this.zzb;
        if (zzbmp != null) {
            try {
                zzbmp.zzby(str, ObjectWrapper.wrap(view));
            } catch (RemoteException e2) {
                zzcho.zzh("Unable to call setAssetView on delegate", e2);
            }
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.zza);
    }

    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.zza;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public void destroy() {
        zzbmp zzbmp = this.zzb;
        if (zzbmp != null) {
            try {
                zzbmp.zzc();
            } catch (RemoteException e2) {
                zzcho.zzh("Unable to destroy native ad view", e2);
            }
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.zzb != null) {
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzjw)).booleanValue()) {
                try {
                    this.zzb.zzd(ObjectWrapper.wrap(motionEvent));
                } catch (RemoteException e2) {
                    zzcho.zzh("Unable to call handleTouchEvent on delegate", e2);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public AdChoicesView getAdChoicesView() {
        View zza2 = zza("3011");
        if (zza2 instanceof AdChoicesView) {
            return (AdChoicesView) zza2;
        }
        return null;
    }

    public final View getAdvertiserView() {
        return zza("3005");
    }

    public final View getBodyView() {
        return zza("3004");
    }

    public final View getCallToActionView() {
        return zza("3002");
    }

    public final View getHeadlineView() {
        return zza("3001");
    }

    public final View getIconView() {
        return zza("3003");
    }

    public final View getImageView() {
        return zza("3008");
    }

    public final MediaView getMediaView() {
        View zza2 = zza("3010");
        if (zza2 instanceof MediaView) {
            return (MediaView) zza2;
        }
        if (zza2 == null) {
            return null;
        }
        zzcho.zze("View is not an instance of MediaView");
        return null;
    }

    public final View getPriceView() {
        return zza("3007");
    }

    public final View getStarRatingView() {
        return zza("3009");
    }

    public final View getStoreView() {
        return zza("3006");
    }

    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        zzbmp zzbmp = this.zzb;
        if (zzbmp != null) {
            try {
                zzbmp.zze(ObjectWrapper.wrap(view), i);
            } catch (RemoteException e2) {
                zzcho.zzh("Unable to call onVisibilityChanged on delegate", e2);
            }
        }
    }

    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.zza);
    }

    public final void removeView(View view) {
        if (this.zza != view) {
            super.removeView(view);
        }
    }

    public void setAdChoicesView(AdChoicesView adChoicesView) {
        zzf("3011", adChoicesView);
    }

    public final void setAdvertiserView(View view) {
        zzf("3005", view);
    }

    public final void setBodyView(View view) {
        zzf("3004", view);
    }

    public final void setCallToActionView(View view) {
        zzf("3002", view);
    }

    public final void setClickConfirmingView(View view) {
        zzbmp zzbmp = this.zzb;
        if (zzbmp != null) {
            try {
                zzbmp.zzbz(ObjectWrapper.wrap(view));
            } catch (RemoteException e2) {
                zzcho.zzh("Unable to call setClickConfirmingView on delegate", e2);
            }
        }
    }

    public final void setHeadlineView(View view) {
        zzf("3001", view);
    }

    public final void setIconView(View view) {
        zzf("3003", view);
    }

    public final void setImageView(View view) {
        zzf("3008", view);
    }

    public final void setMediaView(MediaView mediaView) {
        zzf("3010", mediaView);
        if (mediaView != null) {
            mediaView.zza(new zzb(this));
            mediaView.zzb(new zzc(this));
        }
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [com.google.android.gms.dynamic.IObjectWrapper, java.lang.Object] */
    public void setNativeAd(NativeAd nativeAd) {
        zzbmp zzbmp = this.zzb;
        if (zzbmp != null) {
            try {
                zzbmp.zzbC(nativeAd.zza());
            } catch (RemoteException e2) {
                zzcho.zzh("Unable to call setNativeAd on delegate", e2);
            }
        }
    }

    public final void setPriceView(View view) {
        zzf("3007", view);
    }

    public final void setStarRatingView(View view) {
        zzf("3009", view);
    }

    public final void setStoreView(View view) {
        zzf("3006", view);
    }

    /* access modifiers changed from: protected */
    public final View zza(String str) {
        zzbmp zzbmp = this.zzb;
        if (zzbmp != null) {
            try {
                IObjectWrapper zzb2 = zzbmp.zzb(str);
                if (zzb2 != null) {
                    return (View) ObjectWrapper.unwrap(zzb2);
                }
            } catch (RemoteException e2) {
                zzcho.zzh("Unable to call getAssetView on delegate", e2);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(MediaContent mediaContent) {
        zzbmp zzbmp = this.zzb;
        if (zzbmp != null) {
            try {
                if (mediaContent instanceof zzep) {
                    zzbmp.zzbA(((zzep) mediaContent).zzb());
                } else if (mediaContent == null) {
                    zzbmp.zzbA((zzbmi) null);
                } else {
                    zzcho.zze("Use MediaContent provided by NativeAd.getMediaContent");
                }
            } catch (RemoteException e2) {
                zzcho.zzh("Unable to call setMediaContent on delegate", e2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(ImageView.ScaleType scaleType) {
        zzbmp zzbmp = this.zzb;
        if (zzbmp != null && scaleType != null) {
            try {
                zzbmp.zzbB(ObjectWrapper.wrap(scaleType));
            } catch (RemoteException e2) {
                zzcho.zzh("Unable to call setMediaViewImageScaleType on delegate", e2);
            }
        }
    }

    public NativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zza = zzd(context);
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zza = zzd(context);
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.zza = zzd(context);
    }
}
