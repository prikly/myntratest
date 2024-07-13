package io.bidmachine.nativead;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.explorestack.iab.vast.VastRequest;
import io.bidmachine.AdObjectImpl;
import io.bidmachine.AdProcessCallback;
import io.bidmachine.ContextProvider;
import io.bidmachine.ImageData;
import io.bidmachine.ImageDataImpl;
import io.bidmachine.MediaAssetType;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.core.VisibilityTracker;
import io.bidmachine.models.AdObjectParams;
import io.bidmachine.nativead.utils.ImageHelper;
import io.bidmachine.nativead.view.MediaView;
import io.bidmachine.nativead.view.NativeMediaView;
import io.bidmachine.unified.UnifiedNativeAd;
import io.bidmachine.unified.UnifiedNativeAdCallback;
import io.bidmachine.unified.UnifiedNativeAdRequestParams;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.ViewHelper;
import java.io.File;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public final class NativeAdObject extends AdObjectImpl<NativeRequest, AdObjectParams, UnifiedNativeAd, UnifiedNativeAdCallback, UnifiedNativeAdRequestParams> implements View.OnClickListener, NativeContainer, NativeData, NativeInteractor, NativeMediaPrivateData {
    static final float DEFAULT_RATING = -1.0f;
    private static final int ICON_VIEW_ID = 100;
    private static final String INSTALL = "Install";
    private static final int MEDIA_VIEW_ID = 200;
    private static final WeakHashMap<ViewGroup, WeakHashMap<View, View.OnClickListener>> clickStorage = new WeakHashMap<>(3);
    private ViewGroup container;
    private ImageDataImpl iconImageData;
    /* access modifiers changed from: private */
    public boolean isImpressionTracked;
    private ImageDataImpl mainImageData;
    private MediaView mediaView;
    private NativeNetworkAdapter nativeNetworkAdapter;
    private ProgressDialog progressDialog;
    private Handler progressDialogCanceller;
    private Runnable progressRunnable;
    private View providerView;
    private VastRequest vastRequest;
    private Uri videoUri;
    private boolean viewRegistered;

    public void dispatchVideoPlayFinished() {
    }

    NativeAdObject(ContextProvider contextProvider, AdProcessCallback adProcessCallback, NativeRequest nativeRequest, AdObjectParams adObjectParams, UnifiedNativeAd unifiedNativeAd) {
        super(contextProvider, adProcessCallback, nativeRequest, adObjectParams, unifiedNativeAd);
    }

    public void setNativeNetworkAdapter(NativeNetworkAdapter nativeNetworkAdapter2) {
        this.nativeNetworkAdapter = nativeNetworkAdapter2;
        if (nativeNetworkAdapter2 != null) {
            this.iconImageData = new ImageDataImpl(nativeNetworkAdapter2.getIcon());
            this.mainImageData = new ImageDataImpl(nativeNetworkAdapter2.getMainImage());
        }
    }

    public String getTitle() {
        NativeNetworkAdapter nativeNetworkAdapter2 = this.nativeNetworkAdapter;
        if (nativeNetworkAdapter2 != null) {
            return nativeNetworkAdapter2.getTitle();
        }
        return null;
    }

    public String getDescription() {
        NativeNetworkAdapter nativeNetworkAdapter2 = this.nativeNetworkAdapter;
        if (nativeNetworkAdapter2 != null) {
            return nativeNetworkAdapter2.getDescription();
        }
        return null;
    }

    public String getCallToAction() {
        NativeNetworkAdapter nativeNetworkAdapter2 = this.nativeNetworkAdapter;
        String callToAction = nativeNetworkAdapter2 != null ? nativeNetworkAdapter2.getCallToAction() : null;
        return TextUtils.isEmpty(callToAction) ? INSTALL : callToAction;
    }

    public float getRating() {
        NativeNetworkAdapter nativeNetworkAdapter2 = this.nativeNetworkAdapter;
        return nativeNetworkAdapter2 != null ? nativeNetworkAdapter2.getRating() : DEFAULT_RATING;
    }

    public ImageData getIcon() {
        return this.iconImageData;
    }

    public ImageData getMainImage() {
        return this.mainImageData;
    }

    public String getClickUrl() {
        NativeNetworkAdapter nativeNetworkAdapter2 = this.nativeNetworkAdapter;
        if (nativeNetworkAdapter2 != null) {
            return nativeNetworkAdapter2.getClickUrl();
        }
        return null;
    }

    public String getVideoUrl() {
        NativeNetworkAdapter nativeNetworkAdapter2 = this.nativeNetworkAdapter;
        if (nativeNetworkAdapter2 != null) {
            return nativeNetworkAdapter2.getVideoUrl();
        }
        return null;
    }

    public String getVideoAdm() {
        NativeNetworkAdapter nativeNetworkAdapter2 = this.nativeNetworkAdapter;
        if (nativeNetworkAdapter2 != null) {
            return nativeNetworkAdapter2.getVideoAdm();
        }
        return null;
    }

    public Drawable getIconDrawable() {
        ImageDataImpl imageDataImpl = this.iconImageData;
        if (imageDataImpl != null) {
            return imageDataImpl.getImage();
        }
        return null;
    }

    public void setIconBitmap(Bitmap bitmap) {
        ImageDataImpl imageDataImpl = this.iconImageData;
        if (imageDataImpl != null) {
            imageDataImpl.setImage(new BitmapDrawable(getApplicationContext().getResources(), bitmap));
        }
    }

    public Uri getIconUri() {
        ImageDataImpl imageDataImpl = this.iconImageData;
        if (imageDataImpl != null) {
            return imageDataImpl.getLocalUri();
        }
        return null;
    }

    public void setIconUri(Uri uri) {
        ImageDataImpl imageDataImpl = this.iconImageData;
        if (imageDataImpl != null) {
            imageDataImpl.setLocalUri(uri);
        }
    }

    public Drawable getImageDrawable() {
        ImageDataImpl imageDataImpl = this.mainImageData;
        if (imageDataImpl != null) {
            return imageDataImpl.getImage();
        }
        return null;
    }

    public void setImageBitmap(Bitmap bitmap) {
        ImageDataImpl imageDataImpl = this.mainImageData;
        if (imageDataImpl != null) {
            imageDataImpl.setImage(new BitmapDrawable(getApplicationContext().getResources(), bitmap));
        }
    }

    public Uri getImageUri() {
        ImageDataImpl imageDataImpl = this.mainImageData;
        if (imageDataImpl != null) {
            return imageDataImpl.getLocalUri();
        }
        return null;
    }

    public void setImageUri(Uri uri) {
        ImageDataImpl imageDataImpl = this.mainImageData;
        if (imageDataImpl != null) {
            imageDataImpl.setLocalUri(uri);
        }
    }

    public void setVideoUri(Uri uri) {
        this.videoUri = uri;
    }

    public Uri getVideoUri() {
        return this.videoUri;
    }

    public void setVastRequest(VastRequest vastRequest2) {
        this.vastRequest = vastRequest2;
    }

    public VastRequest getVastRequest() {
        return this.vastRequest;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.nativeNetworkAdapter;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean hasVideo() {
        /*
            r1 = this;
            android.net.Uri r0 = r1.videoUri
            if (r0 != 0) goto L_0x0011
            io.bidmachine.nativead.NativeNetworkAdapter r0 = r1.nativeNetworkAdapter
            if (r0 == 0) goto L_0x000f
            boolean r0 = r0.hasVideo()
            if (r0 == 0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            r0 = 0
            goto L_0x0012
        L_0x0011:
            r0 = 1
        L_0x0012:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.nativead.NativeAdObject.hasVideo():boolean");
    }

    public UnifiedNativeAdCallback createUnifiedCallback(AdProcessCallback adProcessCallback) {
        return new UnifiedNativeAdCallbackImpl(adProcessCallback);
    }

    public View getProviderView(Context context) {
        NativeNetworkAdapter nativeNetworkAdapter2;
        if (this.providerView == null && (nativeNetworkAdapter2 = this.nativeNetworkAdapter) != null) {
            this.providerView = nativeNetworkAdapter2.createProviderView(context);
        }
        return this.providerView;
    }

    public void registerView(ViewGroup viewGroup, View view, NativeMediaView nativeMediaView, Set<View> set) {
        try {
            if (!isNativeAdViewValid(viewGroup, view, nativeMediaView)) {
                getProcessCallback().processShowFail(BMError.internal("Native ad views are invalid"));
                return;
            }
            configureClickableView(viewGroup, set);
            ImageView configureIconView = configureIconView(view);
            configureMediaView(nativeMediaView);
            this.container = viewGroup;
            if (!this.isImpressionTracked) {
                getProcessCallback().processBeforeStartVisibilityTracker();
                VisibilityTracker.startTracking(viewGroup, getParams().getViewabilityTimeThresholdMs(), getParams().getViewabilityPixelThreshold(), getParams().isViewabilityIgnoreWindowFocus(), new VisibilityTracker.VisibilityChangeCallback() {
                    public boolean onViewShown() {
                        NativeAdObject.this.dispatchShown();
                        return true;
                    }

                    public void onViewTrackingFinished() {
                        boolean unused = NativeAdObject.this.isImpressionTracked = true;
                        NativeAdObject.this.dispatchImpression();
                    }
                });
                dispatchFillAd();
            }
            if (this.mediaView != null) {
                this.mediaView.onViewAppearOnScreen();
                this.mediaView.startVideoVisibilityCheckerTimer();
            }
            if (this.nativeNetworkAdapter != null) {
                this.nativeNetworkAdapter.registerNative(viewGroup, configureIconView, nativeMediaView, set);
            }
            this.viewRegistered = true;
        } catch (Throwable th) {
            Logger.log(th);
            unregisterView();
            getProcessCallback().processShowFail(BMError.internal("Exception when registering view for native ad object"));
        }
    }

    public void unregisterView() {
        try {
            if (this.container != null) {
                deConfigureClickableView(this.container);
                VisibilityTracker.stopTracking(this.container);
            }
            if (this.mediaView != null) {
                this.mediaView.stopVideoVisibilityCheckerTimer();
                this.mediaView.release();
            }
            if (this.nativeNetworkAdapter != null) {
                this.nativeNetworkAdapter.unregisterNative();
            }
            this.viewRegistered = false;
        } catch (Throwable th) {
            Logger.log(th);
        }
    }

    public void onDestroy() {
        try {
            super.onDestroy();
            unregisterView();
            if (this.iconImageData != null) {
                this.iconImageData.destroy();
                this.iconImageData = null;
            }
            if (this.mainImageData != null) {
                this.mainImageData.destroy();
                this.mainImageData = null;
            }
            if (!(this.videoUri == null || this.videoUri.getPath() == null)) {
                File file = new File(this.videoUri.getPath());
                if (file.exists()) {
                    file.delete();
                }
                this.videoUri = null;
            }
            if (this.nativeNetworkAdapter != null) {
                this.nativeNetworkAdapter.destroy();
            }
        } catch (Throwable th) {
            Logger.log(th);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean isNativeAdViewValid(ViewGroup viewGroup, View view, NativeMediaView nativeMediaView) {
        if (viewGroup == null) {
            Logger.log("NativeAdView cannot be null. NativeAd is NOT registered");
            return false;
        } else if (view == null && nativeMediaView == null) {
            Logger.log("ImageView or NativeMediaView cannot be null. NativeAd is NOT registered");
            return false;
        } else {
            if (view != null && !ViewHelper.belongTo(viewGroup, view)) {
                Logger.log("ImageView should belong to NativeAdView");
            }
            if (nativeMediaView == null || ViewHelper.belongTo(viewGroup, nativeMediaView)) {
                return true;
            }
            Logger.log("NativeMediaView should belong to NativeAdView");
            return true;
        }
    }

    private void configureClickableView(ViewGroup viewGroup, Set<View> set) {
        deConfigureClickableView(viewGroup);
        if (set != null && set.size() != 0) {
            WeakHashMap weakHashMap = new WeakHashMap();
            clickStorage.put(viewGroup, weakHashMap);
            for (View next : set) {
                if (next != null) {
                    next.setOnClickListener(this);
                    weakHashMap.put(next, this);
                }
            }
        }
    }

    private void deConfigureClickableView(ViewGroup viewGroup) {
        WeakHashMap weakHashMap = clickStorage.get(viewGroup);
        if (weakHashMap != null) {
            for (Map.Entry entry : weakHashMap.entrySet()) {
                if (!(entry == null || entry.getKey() == null)) {
                    ((View) entry.getKey()).setOnClickListener((View.OnClickListener) null);
                }
            }
            clickStorage.remove(viewGroup);
        }
    }

    private ImageView configureIconView(View view) {
        ImageView imageView;
        if (view instanceof ImageView) {
            imageView = (ImageView) view;
        } else if (view instanceof ViewGroup) {
            ImageView imageView2 = new ImageView(view.getContext());
            imageView2.setId(100);
            imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
            ViewGroup viewGroup = (ViewGroup) view;
            viewGroup.removeAllViews();
            viewGroup.addView(imageView2, new ViewGroup.LayoutParams(-1, -1));
            imageView = imageView2;
        } else {
            imageView = null;
        }
        if (!(imageView == null || this.iconImageData == null)) {
            ImageHelper.fillImageView(imageView.getContext(), imageView, this.iconImageData.getLocalUri(), this.iconImageData.getImage());
        }
        return imageView;
    }

    private void configureMediaView(NativeMediaView nativeMediaView) {
        if (nativeMediaView != null) {
            nativeMediaView.removeAllViews();
            NativeNetworkAdapter nativeNetworkAdapter2 = this.nativeNetworkAdapter;
            if (nativeNetworkAdapter2 == null || !nativeNetworkAdapter2.configureMediaView(nativeMediaView)) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(13, -1);
                MediaView mediaView2 = new MediaView(nativeMediaView.getContext());
                this.mediaView = mediaView2;
                mediaView2.setId(200);
                NativeAdRequestParameters nativeAdRequestParameters = (NativeAdRequestParameters) ((NativeRequest) getAdRequest()).getAdRequestParameters();
                if (nativeAdRequestParameters.containsAssetType(MediaAssetType.Image) || nativeAdRequestParameters.containsAssetType(MediaAssetType.Video)) {
                    this.mediaView.setNativeAdObject(this);
                }
                nativeMediaView.addView(this.mediaView, layoutParams);
            }
        }
    }

    private void showProgressDialog(Context context) {
        if (this.container != null && (context instanceof Activity) && mayShowProgressDialog()) {
            Activity activity = (Activity) context;
            if (Utils.canAddWindowToActivity(activity)) {
                this.container.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                    public void onViewAttachedToWindow(View view) {
                    }

                    public void onViewDetachedFromWindow(View view) {
                        view.removeOnAttachStateChangeListener(this);
                        NativeAdObject.this.hideProgressDialog();
                    }
                });
                ProgressDialog show = ProgressDialog.show(activity, "", "Loading...");
                this.progressDialog = show;
                show.setProgressStyle(0);
                this.progressDialog.setCancelable(false);
                this.progressRunnable = new Runnable() {
                    public void run() {
                        NativeAdObject.this.hideProgressDialog();
                    }
                };
                Handler handler = new Handler(Looper.getMainLooper());
                this.progressDialogCanceller = handler;
                handler.postDelayed(this.progressRunnable, 5000);
            }
        }
    }

    private boolean mayShowProgressDialog() {
        ProgressDialog progressDialog2 = this.progressDialog;
        return progressDialog2 == null || !progressDialog2.isShowing();
    }

    /* access modifiers changed from: private */
    public void hideProgressDialog() {
        Handler handler;
        ProgressDialog progressDialog2 = this.progressDialog;
        if (progressDialog2 != null && progressDialog2.isShowing()) {
            this.progressDialog.dismiss();
            this.progressDialog = null;
        }
        Runnable runnable = this.progressRunnable;
        if (runnable != null && (handler = this.progressDialogCanceller) != null) {
            handler.removeCallbacks(runnable);
            this.progressDialogCanceller = null;
            this.progressRunnable = null;
        }
    }

    /* access modifiers changed from: private */
    public void loadAsset(Context context, NativeData nativeData) {
        new AssetLoader((NativeAdRequestParameters) ((NativeRequest) getAdRequest()).getAdRequestParameters(), getProcessCallback(), nativeData, this).downloadNativeAdsImages(context);
    }

    public boolean isViewRegistered() {
        return this.viewRegistered;
    }

    public void dispatchFillAd() {
        getProcessCallback().processFillAd();
    }

    public void dispatchShown() {
        getProcessCallback().processVisibilityTrackerShown(getUnifiedAd());
    }

    public void dispatchImpression() {
        getProcessCallback().processVisibilityTrackerImpression();
    }

    public void onClick(View view) {
        dispatchClick();
    }

    public void onClicked() {
        super.onClicked();
        String clickUrl = getClickUrl();
        if (!TextUtils.isEmpty(clickUrl)) {
            showProgressDialog(getContext());
            com.explorestack.iab.utils.Utils.openBrowser(getApplicationContext(), clickUrl, new Runnable() {
                public void run() {
                    NativeAdObject.this.hideProgressDialog();
                }
            });
        }
    }

    public void dispatchClick() {
        getProcessCallback().processClicked();
    }

    private final class UnifiedNativeAdCallbackImpl extends AdObjectImpl.BaseUnifiedAdCallback implements UnifiedNativeAdCallback {
        UnifiedNativeAdCallbackImpl(AdProcessCallback adProcessCallback) {
            super(adProcessCallback);
        }

        public void onAdLoaded(NativeNetworkAdapter nativeNetworkAdapter) {
            try {
                NativeAdObject.this.setNativeNetworkAdapter(nativeNetworkAdapter);
                if (((NativeAdRequestParameters) ((NativeRequest) NativeAdObject.this.getAdRequest()).getAdRequestParameters()).isValidateAssets() && !nativeNetworkAdapter.isValid()) {
                    this.processCallback.processLoadFail(BMError.incorrectContent("Native ad does not contain all required assets"));
                } else if (nativeNetworkAdapter.isNetworkControlLoadingAssets()) {
                    this.processCallback.processLoadSuccess();
                } else {
                    NativeAdObject.this.loadAsset(NativeAdObject.this.getApplicationContext(), nativeNetworkAdapter);
                }
            } catch (Exception e2) {
                Logger.log((Throwable) e2);
                this.processCallback.processLoadFail(BMError.internal("Exception when loading assets"));
            }
        }
    }
}
