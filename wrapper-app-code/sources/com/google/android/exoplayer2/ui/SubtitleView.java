package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SubtitleView extends FrameLayout {
    private boolean applyEmbeddedFontSizes = true;
    private boolean applyEmbeddedStyles = true;
    private float bottomPaddingFraction = 0.08f;
    private List<Cue> cues = Collections.emptyList();
    private float defaultTextSize = 0.0533f;
    private int defaultTextSizeType = 0;
    private View innerSubtitleView;
    private Output output;
    private CaptionStyleCompat style = CaptionStyleCompat.DEFAULT;
    private int viewType;

    interface Output {
        void update(List<Cue> list, CaptionStyleCompat captionStyleCompat, float f2, int i, float f3);
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context);
        this.output = canvasSubtitleOutput;
        this.innerSubtitleView = canvasSubtitleOutput;
        addView(canvasSubtitleOutput);
        this.viewType = 1;
    }

    public void setCues(List<Cue> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.cues = list;
        updateOutput();
    }

    public void setViewType(int i) {
        if (this.viewType != i) {
            if (i == 1) {
                setView(new CanvasSubtitleOutput(getContext()));
            } else if (i == 2) {
                setView(new WebViewSubtitleOutput(getContext()));
            } else {
                throw new IllegalArgumentException();
            }
            this.viewType = i;
        }
    }

    private <T extends View & Output> void setView(T t) {
        removeView(this.innerSubtitleView);
        View view = this.innerSubtitleView;
        if (view instanceof WebViewSubtitleOutput) {
            ((WebViewSubtitleOutput) view).destroy();
        }
        this.innerSubtitleView = t;
        this.output = (Output) t;
        addView(t);
    }

    public void setFractionalTextSize(float f2) {
        setFractionalTextSize(f2, false);
    }

    public void setFractionalTextSize(float f2, boolean z) {
        setTextSize(z ? 1 : 0, f2);
    }

    private void setTextSize(int i, float f2) {
        this.defaultTextSizeType = i;
        this.defaultTextSize = f2;
        updateOutput();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.applyEmbeddedStyles = z;
        updateOutput();
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.applyEmbeddedFontSizes = z;
        updateOutput();
    }

    public void setStyle(CaptionStyleCompat captionStyleCompat) {
        this.style = captionStyleCompat;
        updateOutput();
    }

    public void setBottomPaddingFraction(float f2) {
        this.bottomPaddingFraction = f2;
        updateOutput();
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (Util.SDK_INT < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private CaptionStyleCompat getUserCaptionStyle() {
        if (Util.SDK_INT < 19 || isInEditMode()) {
            return CaptionStyleCompat.DEFAULT;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        if (captioningManager == null || !captioningManager.isEnabled()) {
            return CaptionStyleCompat.DEFAULT;
        }
        return CaptionStyleCompat.createFromCaptionStyle(captioningManager.getUserStyle());
    }

    private void updateOutput() {
        this.output.update(getCuesWithStylingPreferencesApplied(), this.style, this.defaultTextSize, this.defaultTextSizeType, this.bottomPaddingFraction);
    }

    private List<Cue> getCuesWithStylingPreferencesApplied() {
        if (this.applyEmbeddedStyles && this.applyEmbeddedFontSizes) {
            return this.cues;
        }
        ArrayList arrayList = new ArrayList(this.cues.size());
        for (int i = 0; i < this.cues.size(); i++) {
            arrayList.add(removeEmbeddedStyling(this.cues.get(i)));
        }
        return arrayList;
    }

    private Cue removeEmbeddedStyling(Cue cue) {
        Cue.Builder buildUpon = cue.buildUpon();
        if (!this.applyEmbeddedStyles) {
            SubtitleViewUtils.removeAllEmbeddedStyling(buildUpon);
        } else if (!this.applyEmbeddedFontSizes) {
            SubtitleViewUtils.removeEmbeddedFontSizes(buildUpon);
        }
        return buildUpon.build();
    }
}
