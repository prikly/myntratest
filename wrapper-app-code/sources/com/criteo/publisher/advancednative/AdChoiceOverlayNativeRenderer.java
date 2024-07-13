package com.criteo.publisher.advancednative;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.criteo.publisher.s;

class AdChoiceOverlayNativeRenderer implements CriteoNativeRenderer {
    private final b adChoiceOverlay;
    private final CriteoNativeRenderer delegate;

    AdChoiceOverlayNativeRenderer(CriteoNativeRenderer criteoNativeRenderer) {
        this(criteoNativeRenderer, s.c().b0());
    }

    AdChoiceOverlayNativeRenderer(CriteoNativeRenderer criteoNativeRenderer, b bVar) {
        this.delegate = criteoNativeRenderer;
        this.adChoiceOverlay = bVar;
    }

    public View createNativeView(Context context, ViewGroup viewGroup) {
        return this.adChoiceOverlay.a(this.delegate.createNativeView(context, viewGroup));
    }

    public void renderNativeView(RendererHelper rendererHelper, View view, CriteoNativeAd criteoNativeAd) {
        View c2 = this.adChoiceOverlay.c(view);
        if (c2 != null) {
            this.delegate.renderNativeView(rendererHelper, c2, criteoNativeAd);
        }
    }
}
