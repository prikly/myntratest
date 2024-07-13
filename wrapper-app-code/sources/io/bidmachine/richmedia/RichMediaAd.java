package io.bidmachine.richmedia;

import android.content.Context;
import io.bidmachine.AdListener;
import io.bidmachine.AdProcessCallback;
import io.bidmachine.AdsType;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdapter;
import io.bidmachine.ViewAd;
import io.bidmachine.ViewAdObject;
import io.bidmachine.core.Logger;
import io.bidmachine.models.AdObjectParams;
import io.bidmachine.unified.UnifiedFullscreenAdRequestParams;
import io.bidmachine.unified.UnifiedRichMediaAd;

class RichMediaAd extends ViewAd<RichMediaAd, RichMediaRequest, ViewAdObject<RichMediaRequest, UnifiedRichMediaAd, UnifiedFullscreenAdRequestParams>, UnifiedFullscreenAdRequestParams, AdListener<RichMediaAd>> implements RichMediaInteractor {
    protected RichMediaAd(Context context) {
        super(context, AdsType.RichMedia);
    }

    /* access modifiers changed from: protected */
    public ViewAdObject<RichMediaRequest, UnifiedRichMediaAd, UnifiedFullscreenAdRequestParams> createAdObject(ContextProvider contextProvider, RichMediaRequest richMediaRequest, NetworkAdapter networkAdapter, AdObjectParams adObjectParams, AdProcessCallback adProcessCallback) {
        UnifiedRichMediaAd createRichMedia = networkAdapter.createRichMedia();
        if (createRichMedia == null) {
            return null;
        }
        ViewAdObject viewAdObject = new ViewAdObject(contextProvider, adProcessCallback, richMediaRequest, adObjectParams, createRichMedia);
        viewAdObject.setWidthMeasureMode(ViewAdObject.MeasureMode.Match);
        viewAdObject.setHeightMeasureMode(ViewAdObject.MeasureMode.Match);
        return viewAdObject;
    }

    public void resume() {
        try {
            ViewAdObject viewAdObject = (ViewAdObject) getLoadedAdObject();
            if (viewAdObject != null) {
                ((UnifiedRichMediaAd) viewAdObject.getUnifiedAd()).onResume();
            }
        } catch (Throwable th) {
            Logger.log(th);
        }
    }

    public void pause() {
        try {
            ViewAdObject viewAdObject = (ViewAdObject) getLoadedAdObject();
            if (viewAdObject != null) {
                ((UnifiedRichMediaAd) viewAdObject.getUnifiedAd()).onPause();
            }
        } catch (Throwable th) {
            Logger.log(th);
        }
    }

    public void mute() {
        try {
            ViewAdObject viewAdObject = (ViewAdObject) getLoadedAdObject();
            if (viewAdObject != null) {
                ((UnifiedRichMediaAd) viewAdObject.getUnifiedAd()).onMute();
            }
        } catch (Throwable th) {
            Logger.log(th);
        }
    }

    public void unmute() {
        try {
            ViewAdObject viewAdObject = (ViewAdObject) getLoadedAdObject();
            if (viewAdObject != null) {
                ((UnifiedRichMediaAd) viewAdObject.getUnifiedAd()).onUnMute();
            }
        } catch (Throwable th) {
            Logger.log(th);
        }
    }
}
