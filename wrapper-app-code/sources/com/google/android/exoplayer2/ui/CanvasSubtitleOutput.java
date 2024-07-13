package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.ui.SubtitleView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class CanvasSubtitleOutput extends View implements SubtitleView.Output {
    private float bottomPaddingFraction;
    private List<Cue> cues;
    private final List<SubtitlePainter> painters;
    private CaptionStyleCompat style;
    private float textSize;
    private int textSizeType;

    public CanvasSubtitleOutput(Context context) {
        this(context, (AttributeSet) null);
    }

    public CanvasSubtitleOutput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.painters = new ArrayList();
        this.cues = Collections.emptyList();
        this.textSizeType = 0;
        this.textSize = 0.0533f;
        this.style = CaptionStyleCompat.DEFAULT;
        this.bottomPaddingFraction = 0.08f;
    }

    public void update(List<Cue> list, CaptionStyleCompat captionStyleCompat, float f2, int i, float f3) {
        this.cues = list;
        this.style = captionStyleCompat;
        this.textSize = f2;
        this.textSizeType = i;
        this.bottomPaddingFraction = f3;
        while (this.painters.size() < list.size()) {
            this.painters.add(new SubtitlePainter(getContext()));
        }
        invalidate();
    }

    public void dispatchDraw(Canvas canvas) {
        List<Cue> list = this.cues;
        if (!list.isEmpty()) {
            int height = getHeight();
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int paddingBottom = height - getPaddingBottom();
            if (paddingBottom > paddingTop && width > paddingLeft) {
                int i = paddingBottom - paddingTop;
                float resolveTextSize = SubtitleViewUtils.resolveTextSize(this.textSizeType, this.textSize, height, i);
                if (resolveTextSize > 0.0f) {
                    int size = list.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Cue cue = list.get(i2);
                        if (cue.verticalType != Integer.MIN_VALUE) {
                            cue = repositionVerticalCue(cue);
                        }
                        Cue cue2 = cue;
                        float f2 = resolveTextSize;
                        int i3 = paddingBottom;
                        this.painters.get(i2).draw(cue2, this.style, f2, SubtitleViewUtils.resolveTextSize(cue2.textSizeType, cue2.textSize, height, i), this.bottomPaddingFraction, canvas, paddingLeft, paddingTop, width, i3);
                        i2++;
                        size = size;
                        i = i;
                        paddingBottom = i3;
                        width = width;
                    }
                }
            }
        }
    }

    private static Cue repositionVerticalCue(Cue cue) {
        Cue.Builder textAlignment = cue.buildUpon().setPosition(-3.4028235E38f).setPositionAnchor(RecyclerView.UNDEFINED_DURATION).setTextAlignment((Layout.Alignment) null);
        if (cue.lineType == 0) {
            textAlignment.setLine(1.0f - cue.line, 0);
        } else {
            textAlignment.setLine((-cue.line) - 1.0f, 1);
        }
        int i = cue.lineAnchor;
        if (i == 0) {
            textAlignment.setLineAnchor(2);
        } else if (i == 2) {
            textAlignment.setLineAnchor(0);
        }
        return textAlignment.build();
    }
}