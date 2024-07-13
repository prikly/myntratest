package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Guideline extends View {
    private boolean mFilterRedundantCalls = true;

    public void draw(Canvas canvas) {
    }

    public void setVisibility(int i) {
    }

    public Guideline(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        if (!this.mFilterRedundantCalls || layoutParams.guideBegin != i) {
            layoutParams.guideBegin = i;
            setLayoutParams(layoutParams);
        }
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        if (!this.mFilterRedundantCalls || layoutParams.guideEnd != i) {
            layoutParams.guideEnd = i;
            setLayoutParams(layoutParams);
        }
    }

    public void setGuidelinePercent(float f2) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        if (!this.mFilterRedundantCalls || layoutParams.guidePercent != f2) {
            layoutParams.guidePercent = f2;
            setLayoutParams(layoutParams);
        }
    }

    public void setFilterRedundantCalls(boolean z) {
        this.mFilterRedundantCalls = z;
    }
}
