package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import java.util.ArrayList;
import java.util.HashMap;

public class Flow extends VirtualLayout {
    private ConstraintWidget[] mAlignedBiggestElementsInCols = null;
    private ConstraintWidget[] mAlignedBiggestElementsInRows = null;
    private int[] mAlignedDimensions = null;
    private ArrayList<WidgetsList> mChainList = new ArrayList<>();
    /* access modifiers changed from: private */
    public ConstraintWidget[] mDisplayedWidgets;
    /* access modifiers changed from: private */
    public int mDisplayedWidgetsCount = 0;
    /* access modifiers changed from: private */
    public float mFirstHorizontalBias = 0.5f;
    /* access modifiers changed from: private */
    public int mFirstHorizontalStyle = -1;
    /* access modifiers changed from: private */
    public float mFirstVerticalBias = 0.5f;
    /* access modifiers changed from: private */
    public int mFirstVerticalStyle = -1;
    /* access modifiers changed from: private */
    public int mHorizontalAlign = 2;
    /* access modifiers changed from: private */
    public float mHorizontalBias = 0.5f;
    /* access modifiers changed from: private */
    public int mHorizontalGap = 0;
    /* access modifiers changed from: private */
    public int mHorizontalStyle = -1;
    /* access modifiers changed from: private */
    public float mLastHorizontalBias = 0.5f;
    /* access modifiers changed from: private */
    public int mLastHorizontalStyle = -1;
    /* access modifiers changed from: private */
    public float mLastVerticalBias = 0.5f;
    /* access modifiers changed from: private */
    public int mLastVerticalStyle = -1;
    private int mMaxElementsWrap = -1;
    private int mOrientation = 0;
    /* access modifiers changed from: private */
    public int mVerticalAlign = 2;
    /* access modifiers changed from: private */
    public float mVerticalBias = 0.5f;
    /* access modifiers changed from: private */
    public int mVerticalGap = 0;
    /* access modifiers changed from: private */
    public int mVerticalStyle = -1;
    private int mWrapMode = 0;

    public void copy(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.copy(constraintWidget, hashMap);
        Flow flow = (Flow) constraintWidget;
        this.mHorizontalStyle = flow.mHorizontalStyle;
        this.mVerticalStyle = flow.mVerticalStyle;
        this.mFirstHorizontalStyle = flow.mFirstHorizontalStyle;
        this.mFirstVerticalStyle = flow.mFirstVerticalStyle;
        this.mLastHorizontalStyle = flow.mLastHorizontalStyle;
        this.mLastVerticalStyle = flow.mLastVerticalStyle;
        this.mHorizontalBias = flow.mHorizontalBias;
        this.mVerticalBias = flow.mVerticalBias;
        this.mFirstHorizontalBias = flow.mFirstHorizontalBias;
        this.mFirstVerticalBias = flow.mFirstVerticalBias;
        this.mLastHorizontalBias = flow.mLastHorizontalBias;
        this.mLastVerticalBias = flow.mLastVerticalBias;
        this.mHorizontalGap = flow.mHorizontalGap;
        this.mVerticalGap = flow.mVerticalGap;
        this.mHorizontalAlign = flow.mHorizontalAlign;
        this.mVerticalAlign = flow.mVerticalAlign;
        this.mWrapMode = flow.mWrapMode;
        this.mMaxElementsWrap = flow.mMaxElementsWrap;
        this.mOrientation = flow.mOrientation;
    }

    private class WidgetsList {
        private ConstraintWidget biggest;
        private ConstraintAnchor mBottom;
        private int mCount;
        private ConstraintAnchor mLeft;
        private int mOrientation;
        private int mPaddingBottom;
        private int mPaddingLeft;
        private int mPaddingRight;
        private int mPaddingTop;
        private ConstraintAnchor mRight;
        private int mStartIndex;
        private ConstraintAnchor mTop;
        final /* synthetic */ Flow this$0;

        /* JADX WARNING: Removed duplicated region for block: B:57:0x00e1  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void createConstraints(boolean r17, int r18, boolean r19) {
            /*
                r16 = this;
                r0 = r16
                int r1 = r0.mCount
                r2 = 0
                r3 = 0
            L_0x0006:
                if (r3 >= r1) goto L_0x0027
                int r4 = r0.mStartIndex
                int r4 = r4 + r3
                androidx.constraintlayout.core.widgets.Flow r5 = r0.this$0
                int r5 = r5.mDisplayedWidgetsCount
                if (r4 < r5) goto L_0x0014
                goto L_0x0027
            L_0x0014:
                androidx.constraintlayout.core.widgets.Flow r4 = r0.this$0
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r4 = r4.mDisplayedWidgets
                int r5 = r0.mStartIndex
                int r5 = r5 + r3
                r4 = r4[r5]
                if (r4 == 0) goto L_0x0024
                r4.resetAnchors()
            L_0x0024:
                int r3 = r3 + 1
                goto L_0x0006
            L_0x0027:
                if (r1 == 0) goto L_0x0382
                androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.biggest
                if (r3 != 0) goto L_0x002f
                goto L_0x0382
            L_0x002f:
                if (r19 == 0) goto L_0x0035
                if (r18 != 0) goto L_0x0035
                r4 = 1
                goto L_0x0036
            L_0x0035:
                r4 = 0
            L_0x0036:
                r5 = -1
                r6 = 0
                r7 = -1
                r8 = -1
            L_0x003a:
                if (r6 >= r1) goto L_0x0069
                if (r17 == 0) goto L_0x0042
                int r9 = r1 + -1
                int r9 = r9 - r6
                goto L_0x0043
            L_0x0042:
                r9 = r6
            L_0x0043:
                int r10 = r0.mStartIndex
                int r10 = r10 + r9
                androidx.constraintlayout.core.widgets.Flow r11 = r0.this$0
                int r11 = r11.mDisplayedWidgetsCount
                if (r10 < r11) goto L_0x004f
                goto L_0x0069
            L_0x004f:
                androidx.constraintlayout.core.widgets.Flow r10 = r0.this$0
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r10 = r10.mDisplayedWidgets
                int r11 = r0.mStartIndex
                int r11 = r11 + r9
                r9 = r10[r11]
                if (r9 == 0) goto L_0x0066
                int r9 = r9.getVisibility()
                if (r9 != 0) goto L_0x0066
                if (r7 != r5) goto L_0x0065
                r7 = r6
            L_0x0065:
                r8 = r6
            L_0x0066:
                int r6 = r6 + 1
                goto L_0x003a
            L_0x0069:
                r6 = 0
                int r9 = r0.mOrientation
                if (r9 != 0) goto L_0x020c
                androidx.constraintlayout.core.widgets.ConstraintWidget r9 = r0.biggest
                androidx.constraintlayout.core.widgets.Flow r10 = r0.this$0
                int r10 = r10.mVerticalStyle
                r9.setVerticalChainStyle(r10)
                int r10 = r0.mPaddingTop
                if (r18 <= 0) goto L_0x0084
                androidx.constraintlayout.core.widgets.Flow r11 = r0.this$0
                int r11 = r11.mVerticalGap
                int r10 = r10 + r11
            L_0x0084:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r9.mTop
                androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r0.mTop
                r11.connect(r12, r10)
                if (r19 == 0) goto L_0x0096
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r9.mBottom
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.mBottom
                int r12 = r0.mPaddingBottom
                r10.connect(r11, r12)
            L_0x0096:
                if (r18 <= 0) goto L_0x00a3
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r0.mTop
                androidx.constraintlayout.core.widgets.ConstraintWidget r10 = r10.mOwner
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r10.mBottom
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r9.mTop
                r10.connect(r11, r2)
            L_0x00a3:
                androidx.constraintlayout.core.widgets.Flow r10 = r0.this$0
                int r10 = r10.mVerticalAlign
                r11 = 3
                if (r10 != r11) goto L_0x00dd
                boolean r10 = r9.hasBaseline()
                if (r10 != 0) goto L_0x00dd
                r10 = 0
            L_0x00b3:
                if (r10 >= r1) goto L_0x00dd
                if (r17 == 0) goto L_0x00bb
                int r12 = r1 + -1
                int r12 = r12 - r10
                goto L_0x00bc
            L_0x00bb:
                r12 = r10
            L_0x00bc:
                int r13 = r0.mStartIndex
                int r13 = r13 + r12
                androidx.constraintlayout.core.widgets.Flow r14 = r0.this$0
                int r14 = r14.mDisplayedWidgetsCount
                if (r13 < r14) goto L_0x00c8
                goto L_0x00dd
            L_0x00c8:
                androidx.constraintlayout.core.widgets.Flow r13 = r0.this$0
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r13 = r13.mDisplayedWidgets
                int r14 = r0.mStartIndex
                int r14 = r14 + r12
                r12 = r13[r14]
                boolean r13 = r12.hasBaseline()
                if (r13 == 0) goto L_0x00da
                goto L_0x00de
            L_0x00da:
                int r10 = r10 + 1
                goto L_0x00b3
            L_0x00dd:
                r12 = r9
            L_0x00de:
                r10 = 0
            L_0x00df:
                if (r10 >= r1) goto L_0x0382
                if (r17 == 0) goto L_0x00e7
                int r13 = r1 + -1
                int r13 = r13 - r10
                goto L_0x00e8
            L_0x00e7:
                r13 = r10
            L_0x00e8:
                int r14 = r0.mStartIndex
                int r14 = r14 + r13
                androidx.constraintlayout.core.widgets.Flow r15 = r0.this$0
                int r15 = r15.mDisplayedWidgetsCount
                if (r14 < r15) goto L_0x00f5
                goto L_0x0382
            L_0x00f5:
                androidx.constraintlayout.core.widgets.Flow r14 = r0.this$0
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r14 = r14.mDisplayedWidgets
                int r15 = r0.mStartIndex
                int r15 = r15 + r13
                r14 = r14[r15]
                if (r14 != 0) goto L_0x0106
                r14 = r6
            L_0x0103:
                r6 = 3
                goto L_0x0206
            L_0x0106:
                if (r10 != 0) goto L_0x0111
                androidx.constraintlayout.core.widgets.ConstraintAnchor r15 = r14.mLeft
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.mLeft
                int r3 = r0.mPaddingLeft
                r14.connect((androidx.constraintlayout.core.widgets.ConstraintAnchor) r15, (androidx.constraintlayout.core.widgets.ConstraintAnchor) r11, (int) r3)
            L_0x0111:
                if (r13 != 0) goto L_0x016f
                androidx.constraintlayout.core.widgets.Flow r3 = r0.this$0
                int r3 = r3.mHorizontalStyle
                r11 = 1065353216(0x3f800000, float:1.0)
                androidx.constraintlayout.core.widgets.Flow r13 = r0.this$0
                float r13 = r13.mHorizontalBias
                if (r17 == 0) goto L_0x0125
                float r13 = r11 - r13
            L_0x0125:
                int r15 = r0.mStartIndex
                if (r15 != 0) goto L_0x0149
                androidx.constraintlayout.core.widgets.Flow r15 = r0.this$0
                int r15 = r15.mFirstHorizontalStyle
                if (r15 == r5) goto L_0x0149
                androidx.constraintlayout.core.widgets.Flow r3 = r0.this$0
                int r3 = r3.mFirstHorizontalStyle
                if (r17 == 0) goto L_0x0141
                androidx.constraintlayout.core.widgets.Flow r13 = r0.this$0
                float r13 = r13.mFirstHorizontalBias
            L_0x013f:
                float r11 = r11 - r13
                goto L_0x0147
            L_0x0141:
                androidx.constraintlayout.core.widgets.Flow r11 = r0.this$0
                float r11 = r11.mFirstHorizontalBias
            L_0x0147:
                r13 = r11
                goto L_0x0169
            L_0x0149:
                if (r19 == 0) goto L_0x0169
                androidx.constraintlayout.core.widgets.Flow r15 = r0.this$0
                int r15 = r15.mLastHorizontalStyle
                if (r15 == r5) goto L_0x0169
                androidx.constraintlayout.core.widgets.Flow r3 = r0.this$0
                int r3 = r3.mLastHorizontalStyle
                if (r17 == 0) goto L_0x0162
                androidx.constraintlayout.core.widgets.Flow r13 = r0.this$0
                float r13 = r13.mLastHorizontalBias
                goto L_0x013f
            L_0x0162:
                androidx.constraintlayout.core.widgets.Flow r11 = r0.this$0
                float r11 = r11.mLastHorizontalBias
                goto L_0x0147
            L_0x0169:
                r14.setHorizontalChainStyle(r3)
                r14.setHorizontalBiasPercent(r13)
            L_0x016f:
                int r3 = r1 + -1
                if (r10 != r3) goto L_0x017c
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.mRight
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.mRight
                int r13 = r0.mPaddingRight
                r14.connect((androidx.constraintlayout.core.widgets.ConstraintAnchor) r3, (androidx.constraintlayout.core.widgets.ConstraintAnchor) r11, (int) r13)
            L_0x017c:
                if (r6 == 0) goto L_0x01a7
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.mLeft
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r6.mRight
                androidx.constraintlayout.core.widgets.Flow r13 = r0.this$0
                int r13 = r13.mHorizontalGap
                r3.connect(r11, r13)
                if (r10 != r7) goto L_0x0194
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.mLeft
                int r11 = r0.mPaddingLeft
                r3.setGoneMargin(r11)
            L_0x0194:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r6.mRight
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r14.mLeft
                r3.connect(r11, r2)
                r3 = 1
                int r11 = r8 + 1
                if (r10 != r11) goto L_0x01a7
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r6.mRight
                int r6 = r0.mPaddingRight
                r3.setGoneMargin(r6)
            L_0x01a7:
                if (r14 == r9) goto L_0x0103
                androidx.constraintlayout.core.widgets.Flow r3 = r0.this$0
                int r3 = r3.mVerticalAlign
                r6 = 3
                if (r3 != r6) goto L_0x01c8
                boolean r3 = r12.hasBaseline()
                if (r3 == 0) goto L_0x01c8
                if (r14 == r12) goto L_0x01c8
                boolean r3 = r14.hasBaseline()
                if (r3 == 0) goto L_0x01c8
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.mBaseline
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r12.mBaseline
                r3.connect(r11, r2)
                goto L_0x0206
            L_0x01c8:
                androidx.constraintlayout.core.widgets.Flow r3 = r0.this$0
                int r3 = r3.mVerticalAlign
                if (r3 == 0) goto L_0x01ff
                r11 = 1
                if (r3 == r11) goto L_0x01f7
                if (r4 == 0) goto L_0x01e8
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.mTop
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.mTop
                int r13 = r0.mPaddingTop
                r3.connect(r11, r13)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.mBottom
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.mBottom
                int r13 = r0.mPaddingBottom
                r3.connect(r11, r13)
                goto L_0x0206
            L_0x01e8:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.mTop
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r9.mTop
                r3.connect(r11, r2)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.mBottom
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r9.mBottom
                r3.connect(r11, r2)
                goto L_0x0206
            L_0x01f7:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.mBottom
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r9.mBottom
                r3.connect(r11, r2)
                goto L_0x0206
            L_0x01ff:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.mTop
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r9.mTop
                r3.connect(r11, r2)
            L_0x0206:
                int r10 = r10 + 1
                r6 = r14
                r11 = 3
                goto L_0x00df
            L_0x020c:
                androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.biggest
                androidx.constraintlayout.core.widgets.Flow r9 = r0.this$0
                int r9 = r9.mHorizontalStyle
                r3.setHorizontalChainStyle(r9)
                int r9 = r0.mPaddingLeft
                if (r18 <= 0) goto L_0x0222
                androidx.constraintlayout.core.widgets.Flow r10 = r0.this$0
                int r10 = r10.mHorizontalGap
                int r9 = r9 + r10
            L_0x0222:
                if (r17 == 0) goto L_0x0244
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r3.mRight
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.mRight
                r10.connect(r11, r9)
                if (r19 == 0) goto L_0x0236
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r3.mLeft
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r0.mLeft
                int r11 = r0.mPaddingRight
                r9.connect(r10, r11)
            L_0x0236:
                if (r18 <= 0) goto L_0x0263
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r0.mRight
                androidx.constraintlayout.core.widgets.ConstraintWidget r9 = r9.mOwner
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r9.mLeft
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r3.mRight
                r9.connect(r10, r2)
                goto L_0x0263
            L_0x0244:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r3.mLeft
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.mLeft
                r10.connect(r11, r9)
                if (r19 == 0) goto L_0x0256
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r3.mRight
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r0.mRight
                int r11 = r0.mPaddingRight
                r9.connect(r10, r11)
            L_0x0256:
                if (r18 <= 0) goto L_0x0263
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r0.mLeft
                androidx.constraintlayout.core.widgets.ConstraintWidget r9 = r9.mOwner
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r9.mRight
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r3.mLeft
                r9.connect(r10, r2)
            L_0x0263:
                r9 = 0
            L_0x0264:
                if (r9 >= r1) goto L_0x0382
                int r10 = r0.mStartIndex
                int r10 = r10 + r9
                androidx.constraintlayout.core.widgets.Flow r11 = r0.this$0
                int r11 = r11.mDisplayedWidgetsCount
                if (r10 < r11) goto L_0x0273
                goto L_0x0382
            L_0x0273:
                androidx.constraintlayout.core.widgets.Flow r10 = r0.this$0
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r10 = r10.mDisplayedWidgets
                int r11 = r0.mStartIndex
                int r11 = r11 + r9
                r10 = r10[r11]
                if (r10 != 0) goto L_0x0283
                r12 = 1
                goto L_0x037e
            L_0x0283:
                if (r9 != 0) goto L_0x02cf
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r10.mTop
                androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r0.mTop
                int r13 = r0.mPaddingTop
                r10.connect((androidx.constraintlayout.core.widgets.ConstraintAnchor) r11, (androidx.constraintlayout.core.widgets.ConstraintAnchor) r12, (int) r13)
                androidx.constraintlayout.core.widgets.Flow r11 = r0.this$0
                int r11 = r11.mVerticalStyle
                androidx.constraintlayout.core.widgets.Flow r12 = r0.this$0
                float r12 = r12.mVerticalBias
                int r13 = r0.mStartIndex
                if (r13 != 0) goto L_0x02b3
                androidx.constraintlayout.core.widgets.Flow r13 = r0.this$0
                int r13 = r13.mFirstVerticalStyle
                if (r13 == r5) goto L_0x02b3
                androidx.constraintlayout.core.widgets.Flow r11 = r0.this$0
                int r11 = r11.mFirstVerticalStyle
                androidx.constraintlayout.core.widgets.Flow r12 = r0.this$0
                float r12 = r12.mFirstVerticalBias
                goto L_0x02c9
            L_0x02b3:
                if (r19 == 0) goto L_0x02c9
                androidx.constraintlayout.core.widgets.Flow r13 = r0.this$0
                int r13 = r13.mLastVerticalStyle
                if (r13 == r5) goto L_0x02c9
                androidx.constraintlayout.core.widgets.Flow r11 = r0.this$0
                int r11 = r11.mLastVerticalStyle
                androidx.constraintlayout.core.widgets.Flow r12 = r0.this$0
                float r12 = r12.mLastVerticalBias
            L_0x02c9:
                r10.setVerticalChainStyle(r11)
                r10.setVerticalBiasPercent(r12)
            L_0x02cf:
                int r11 = r1 + -1
                if (r9 != r11) goto L_0x02dc
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r10.mBottom
                androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r0.mBottom
                int r13 = r0.mPaddingBottom
                r10.connect((androidx.constraintlayout.core.widgets.ConstraintAnchor) r11, (androidx.constraintlayout.core.widgets.ConstraintAnchor) r12, (int) r13)
            L_0x02dc:
                if (r6 == 0) goto L_0x0307
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r10.mTop
                androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r6.mBottom
                androidx.constraintlayout.core.widgets.Flow r13 = r0.this$0
                int r13 = r13.mVerticalGap
                r11.connect(r12, r13)
                if (r9 != r7) goto L_0x02f4
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r10.mTop
                int r12 = r0.mPaddingTop
                r11.setGoneMargin(r12)
            L_0x02f4:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r6.mBottom
                androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r10.mTop
                r11.connect(r12, r2)
                r11 = 1
                int r12 = r8 + 1
                if (r9 != r12) goto L_0x0307
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r6.mBottom
                int r11 = r0.mPaddingBottom
                r6.setGoneMargin(r11)
            L_0x0307:
                if (r10 == r3) goto L_0x037c
                r6 = 2
                if (r17 == 0) goto L_0x0339
                androidx.constraintlayout.core.widgets.Flow r11 = r0.this$0
                int r11 = r11.mHorizontalAlign
                if (r11 == 0) goto L_0x0331
                r12 = 1
                if (r11 == r12) goto L_0x0329
                if (r11 == r6) goto L_0x031a
                goto L_0x037c
            L_0x031a:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r10.mLeft
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.mLeft
                r6.connect(r11, r2)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r10.mRight
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.mRight
                r6.connect(r11, r2)
                goto L_0x037c
            L_0x0329:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r10.mLeft
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.mLeft
                r6.connect(r11, r2)
                goto L_0x037c
            L_0x0331:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r10.mRight
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.mRight
                r6.connect(r11, r2)
                goto L_0x037c
            L_0x0339:
                androidx.constraintlayout.core.widgets.Flow r11 = r0.this$0
                int r11 = r11.mHorizontalAlign
                if (r11 == 0) goto L_0x0373
                r12 = 1
                if (r11 == r12) goto L_0x036b
                if (r11 == r6) goto L_0x0347
                goto L_0x037d
            L_0x0347:
                if (r4 == 0) goto L_0x035c
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r10.mLeft
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.mLeft
                int r13 = r0.mPaddingLeft
                r6.connect(r11, r13)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r10.mRight
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.mRight
                int r13 = r0.mPaddingRight
                r6.connect(r11, r13)
                goto L_0x037d
            L_0x035c:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r10.mLeft
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.mLeft
                r6.connect(r11, r2)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r10.mRight
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.mRight
                r6.connect(r11, r2)
                goto L_0x037d
            L_0x036b:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r10.mRight
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.mRight
                r6.connect(r11, r2)
                goto L_0x037d
            L_0x0373:
                r12 = 1
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r10.mLeft
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.mLeft
                r6.connect(r11, r2)
                goto L_0x037d
            L_0x037c:
                r12 = 1
            L_0x037d:
                r6 = r10
            L_0x037e:
                int r9 = r9 + 1
                goto L_0x0264
            L_0x0382:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.Flow.WidgetsList.createConstraints(boolean, int, boolean):void");
        }
    }

    private void createAlignedConstraints(boolean z) {
        ConstraintWidget constraintWidget;
        float f2;
        int i;
        if (this.mAlignedDimensions != null && this.mAlignedBiggestElementsInCols != null && this.mAlignedBiggestElementsInRows != null) {
            for (int i2 = 0; i2 < this.mDisplayedWidgetsCount; i2++) {
                this.mDisplayedWidgets[i2].resetAnchors();
            }
            int[] iArr = this.mAlignedDimensions;
            int i3 = iArr[0];
            int i4 = iArr[1];
            ConstraintWidget constraintWidget2 = null;
            float f3 = this.mHorizontalBias;
            int i5 = 0;
            while (i5 < i3) {
                if (z) {
                    i = (i3 - i5) - 1;
                    f2 = 1.0f - this.mHorizontalBias;
                } else {
                    f2 = f3;
                    i = i5;
                }
                ConstraintWidget constraintWidget3 = this.mAlignedBiggestElementsInCols[i];
                if (!(constraintWidget3 == null || constraintWidget3.getVisibility() == 8)) {
                    if (i5 == 0) {
                        constraintWidget3.connect(constraintWidget3.mLeft, this.mLeft, getPaddingLeft());
                        constraintWidget3.setHorizontalChainStyle(this.mHorizontalStyle);
                        constraintWidget3.setHorizontalBiasPercent(f2);
                    }
                    if (i5 == i3 - 1) {
                        constraintWidget3.connect(constraintWidget3.mRight, this.mRight, getPaddingRight());
                    }
                    if (i5 > 0 && constraintWidget2 != null) {
                        constraintWidget3.connect(constraintWidget3.mLeft, constraintWidget2.mRight, this.mHorizontalGap);
                        constraintWidget2.connect(constraintWidget2.mRight, constraintWidget3.mLeft, 0);
                    }
                    constraintWidget2 = constraintWidget3;
                }
                i5++;
                f3 = f2;
            }
            for (int i6 = 0; i6 < i4; i6++) {
                ConstraintWidget constraintWidget4 = this.mAlignedBiggestElementsInRows[i6];
                if (!(constraintWidget4 == null || constraintWidget4.getVisibility() == 8)) {
                    if (i6 == 0) {
                        constraintWidget4.connect(constraintWidget4.mTop, this.mTop, getPaddingTop());
                        constraintWidget4.setVerticalChainStyle(this.mVerticalStyle);
                        constraintWidget4.setVerticalBiasPercent(this.mVerticalBias);
                    }
                    if (i6 == i4 - 1) {
                        constraintWidget4.connect(constraintWidget4.mBottom, this.mBottom, getPaddingBottom());
                    }
                    if (i6 > 0 && constraintWidget2 != null) {
                        constraintWidget4.connect(constraintWidget4.mTop, constraintWidget2.mBottom, this.mVerticalGap);
                        constraintWidget2.connect(constraintWidget2.mBottom, constraintWidget4.mTop, 0);
                    }
                    constraintWidget2 = constraintWidget4;
                }
            }
            for (int i7 = 0; i7 < i3; i7++) {
                for (int i8 = 0; i8 < i4; i8++) {
                    int i9 = (i8 * i3) + i7;
                    if (this.mOrientation == 1) {
                        i9 = (i7 * i4) + i8;
                    }
                    ConstraintWidget[] constraintWidgetArr = this.mDisplayedWidgets;
                    if (!(i9 >= constraintWidgetArr.length || (constraintWidget = constraintWidgetArr[i9]) == null || constraintWidget.getVisibility() == 8)) {
                        ConstraintWidget constraintWidget5 = this.mAlignedBiggestElementsInCols[i7];
                        ConstraintWidget constraintWidget6 = this.mAlignedBiggestElementsInRows[i8];
                        if (constraintWidget != constraintWidget5) {
                            constraintWidget.connect(constraintWidget.mLeft, constraintWidget5.mLeft, 0);
                            constraintWidget.connect(constraintWidget.mRight, constraintWidget5.mRight, 0);
                        }
                        if (constraintWidget != constraintWidget6) {
                            constraintWidget.connect(constraintWidget.mTop, constraintWidget6.mTop, 0);
                            constraintWidget.connect(constraintWidget.mBottom, constraintWidget6.mBottom, 0);
                        }
                    }
                }
            }
        }
    }

    public void addToSolver(LinearSystem linearSystem, boolean z) {
        super.addToSolver(linearSystem, z);
        boolean z2 = getParent() != null && ((ConstraintWidgetContainer) getParent()).isRtl();
        int i = this.mWrapMode;
        if (i != 0) {
            if (i == 1) {
                int size = this.mChainList.size();
                int i2 = 0;
                while (i2 < size) {
                    this.mChainList.get(i2).createConstraints(z2, i2, i2 == size + -1);
                    i2++;
                }
            } else if (i == 2) {
                createAlignedConstraints(z2);
            } else if (i == 3) {
                int size2 = this.mChainList.size();
                int i3 = 0;
                while (i3 < size2) {
                    this.mChainList.get(i3).createConstraints(z2, i3, i3 == size2 + -1);
                    i3++;
                }
            }
        } else if (this.mChainList.size() > 0) {
            this.mChainList.get(0).createConstraints(z2, 0, true);
        }
        needsCallbackFromSolver(false);
    }
}
