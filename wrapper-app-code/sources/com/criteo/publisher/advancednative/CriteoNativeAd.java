package com.criteo.publisher.advancednative;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.criteo.publisher.model.b0.n;

public class CriteoNativeAd {
    private final b adChoiceOverlay;
    private final n assets;
    private final e clickDetection;
    private final n clickOnAdChoiceHandler;
    private final n clickOnProductHandler;
    private final j impressionTask;
    private CriteoNativeRenderer renderer;
    private final RendererHelper rendererHelper;
    private final q visibilityTracker;

    public CriteoNativeAd(n nVar, q qVar, j jVar, e eVar, n nVar2, n nVar3, b bVar, CriteoNativeRenderer criteoNativeRenderer, RendererHelper rendererHelper2) {
        this.assets = nVar;
        this.visibilityTracker = qVar;
        this.impressionTask = jVar;
        this.clickDetection = eVar;
        this.clickOnProductHandler = nVar2;
        this.clickOnAdChoiceHandler = nVar3;
        this.adChoiceOverlay = bVar;
        this.renderer = criteoNativeRenderer;
        this.rendererHelper = rendererHelper2;
    }

    public String getTitle() {
        return this.assets.n().g();
    }

    public String getDescription() {
        return this.assets.n().c();
    }

    public String getPrice() {
        return this.assets.n().f();
    }

    public String getCallToAction() {
        return this.assets.n().a();
    }

    public CriteoMedia getProductMedia() {
        return CriteoMedia.create(this.assets.n().e());
    }

    public String getAdvertiserDomain() {
        return this.assets.d();
    }

    public String getAdvertiserDescription() {
        return this.assets.c();
    }

    public CriteoMedia getAdvertiserLogoMedia() {
        return CriteoMedia.create(this.assets.f());
    }

    public String getLegalText() {
        return this.assets.k();
    }

    public View createNativeRenderedView(Context context, ViewGroup viewGroup) {
        View createNativeView = this.renderer.createNativeView(context, viewGroup);
        renderNativeView(createNativeView);
        return createNativeView;
    }

    public void renderNativeView(View view) {
        this.renderer.renderNativeView(this.rendererHelper, view, this);
        watchForImpression(view);
        setProductClickableView(view);
        ImageView b2 = this.adChoiceOverlay.b(view);
        if (b2 != null) {
            setAdChoiceClickableView(b2);
            this.rendererHelper.setMediaInView(this.assets.m(), b2, (Drawable) null);
        }
    }

    /* access modifiers changed from: package-private */
    public void setRenderer(CriteoNativeRenderer criteoNativeRenderer) {
        this.renderer = criteoNativeRenderer;
    }

    /* access modifiers changed from: package-private */
    public void watchForImpression(View view) {
        this.visibilityTracker.a(view, this.impressionTask);
    }

    /* access modifiers changed from: package-private */
    public void setProductClickableView(View view) {
        this.clickDetection.a(view, this.clickOnProductHandler);
    }

    /* access modifiers changed from: package-private */
    public void setAdChoiceClickableView(View view) {
        this.clickDetection.a(view, this.clickOnAdChoiceHandler);
    }

    /* access modifiers changed from: package-private */
    public ImageView getAdChoiceView(View view) {
        return this.adChoiceOverlay.b(view);
    }
}
