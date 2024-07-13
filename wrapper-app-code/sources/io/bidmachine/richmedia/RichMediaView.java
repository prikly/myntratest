package io.bidmachine.richmedia;

import android.content.Context;
import android.util.AttributeSet;
import io.bidmachine.AdView;
import io.bidmachine.ViewAdObject;
import io.bidmachine.unified.UnifiedFullscreenAdRequestParams;
import io.bidmachine.unified.UnifiedRichMediaAd;

public class RichMediaView extends AdView<RichMediaView, RichMediaAd, RichMediaRequest, ViewAdObject<RichMediaRequest, UnifiedRichMediaAd, UnifiedFullscreenAdRequestParams>, RichMediaListener> implements RichMediaInteractor {
    public RichMediaView(Context context) {
        super(context);
    }

    public RichMediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RichMediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public RichMediaAd createAd(Context context) {
        return new RichMediaAd(context);
    }

    public void resume() {
        resume((RichMediaAd) getPendingAd());
        resume((RichMediaAd) getCurrentAd());
    }

    private void resume(RichMediaAd richMediaAd) {
        if (richMediaAd != null) {
            richMediaAd.resume();
        }
    }

    public void pause() {
        pause((RichMediaAd) getPendingAd());
        pause((RichMediaAd) getCurrentAd());
    }

    private void pause(RichMediaAd richMediaAd) {
        if (richMediaAd != null) {
            richMediaAd.pause();
        }
    }

    public void mute() {
        mute((RichMediaAd) getPendingAd());
        mute((RichMediaAd) getCurrentAd());
    }

    private void mute(RichMediaAd richMediaAd) {
        if (richMediaAd != null) {
            richMediaAd.mute();
        }
    }

    public void unmute() {
        unmute((RichMediaAd) getPendingAd());
        unmute((RichMediaAd) getCurrentAd());
    }

    private void unmute(RichMediaAd richMediaAd) {
        if (richMediaAd != null) {
            richMediaAd.unmute();
        }
    }
}
