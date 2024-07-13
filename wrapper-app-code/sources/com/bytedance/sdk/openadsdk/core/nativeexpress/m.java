package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.app.Activity;
import android.view.View;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.multipro.b.a;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: TTNativeExpressAdStub */
public class m implements TTNativeExpressAd {

    /* renamed from: g  reason: collision with root package name */
    public AtomicBoolean f1476g = new AtomicBoolean(false);

    public void destroy() {
    }

    public String getAdCreativeToken() {
        return null;
    }

    public View getExpressAdView() {
        return null;
    }

    public List<FilterWord> getFilterWords() {
        return null;
    }

    public int getImageMode() {
        return 0;
    }

    public int getInteractionType() {
        return 0;
    }

    public Map<String, Object> getMediaExtraInfo() {
        return null;
    }

    public a getVideoModel() {
        return null;
    }

    public void loss(Double d2, String str, String str2) {
    }

    public void render() {
    }

    public void setCanInterruptVideoPlay(boolean z) {
    }

    public void setDislikeCallback(Activity activity, TTAdDislike.DislikeInteractionCallback dislikeInteractionCallback) {
    }

    public void setDislikeDialog(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
    }

    public void setExpressInteractionListener(TTNativeExpressAd.AdInteractionListener adInteractionListener) {
    }

    public void setExpressInteractionListener(TTNativeExpressAd.ExpressAdInteractionListener expressAdInteractionListener) {
    }

    public void setPrice(Double d2) {
    }

    public void setSlideIntervalTime(int i) {
    }

    public void setVideoAdListener(TTNativeExpressAd.ExpressVideoAdListener expressVideoAdListener) {
    }

    public void showInteractionExpressAd(Activity activity) {
    }

    public void win(Double d2) {
    }
}
