package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.util.ArrayList;
import java.util.Iterator;

public class Direct {
    private static int hcount = 0;
    private static BasicMeasure.Measure measure = new BasicMeasure.Measure();
    private static int vcount = 0;

    public static void solvingPass(ConstraintWidgetContainer constraintWidgetContainer, BasicMeasure.Measurer measurer) {
        ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = constraintWidgetContainer.getHorizontalDimensionBehaviour();
        ConstraintWidget.DimensionBehaviour verticalDimensionBehaviour = constraintWidgetContainer.getVerticalDimensionBehaviour();
        hcount = 0;
        vcount = 0;
        constraintWidgetContainer.resetFinalResolution();
        ArrayList<ConstraintWidget> children = constraintWidgetContainer.getChildren();
        int size = children.size();
        for (int i = 0; i < size; i++) {
            children.get(i).resetFinalResolution();
        }
        boolean isRtl = constraintWidgetContainer.isRtl();
        if (horizontalDimensionBehaviour == ConstraintWidget.DimensionBehaviour.FIXED) {
            constraintWidgetContainer.setFinalHorizontal(0, constraintWidgetContainer.getWidth());
        } else {
            constraintWidgetContainer.setFinalLeft(0);
        }
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            ConstraintWidget constraintWidget = children.get(i2);
            if (constraintWidget instanceof Guideline) {
                Guideline guideline = (Guideline) constraintWidget;
                if (guideline.getOrientation() == 1) {
                    if (guideline.getRelativeBegin() != -1) {
                        guideline.setFinalValue(guideline.getRelativeBegin());
                    } else if (guideline.getRelativeEnd() != -1 && constraintWidgetContainer.isResolvedHorizontally()) {
                        guideline.setFinalValue(constraintWidgetContainer.getWidth() - guideline.getRelativeEnd());
                    } else if (constraintWidgetContainer.isResolvedHorizontally()) {
                        guideline.setFinalValue((int) ((guideline.getRelativePercent() * ((float) constraintWidgetContainer.getWidth())) + 0.5f));
                    }
                    z = true;
                }
            } else if ((constraintWidget instanceof Barrier) && ((Barrier) constraintWidget).getOrientation() == 0) {
                z2 = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                ConstraintWidget constraintWidget2 = children.get(i3);
                if (constraintWidget2 instanceof Guideline) {
                    Guideline guideline2 = (Guideline) constraintWidget2;
                    if (guideline2.getOrientation() == 1) {
                        horizontalSolvingPass(0, guideline2, measurer, isRtl);
                    }
                }
            }
        }
        horizontalSolvingPass(0, constraintWidgetContainer, measurer, isRtl);
        if (z2) {
            for (int i4 = 0; i4 < size; i4++) {
                ConstraintWidget constraintWidget3 = children.get(i4);
                if (constraintWidget3 instanceof Barrier) {
                    Barrier barrier = (Barrier) constraintWidget3;
                    if (barrier.getOrientation() == 0) {
                        solveBarrier(0, barrier, measurer, 0, isRtl);
                    }
                }
            }
        }
        if (verticalDimensionBehaviour == ConstraintWidget.DimensionBehaviour.FIXED) {
            constraintWidgetContainer.setFinalVertical(0, constraintWidgetContainer.getHeight());
        } else {
            constraintWidgetContainer.setFinalTop(0);
        }
        boolean z3 = false;
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            ConstraintWidget constraintWidget4 = children.get(i5);
            if (constraintWidget4 instanceof Guideline) {
                Guideline guideline3 = (Guideline) constraintWidget4;
                if (guideline3.getOrientation() == 0) {
                    if (guideline3.getRelativeBegin() != -1) {
                        guideline3.setFinalValue(guideline3.getRelativeBegin());
                    } else if (guideline3.getRelativeEnd() != -1 && constraintWidgetContainer.isResolvedVertically()) {
                        guideline3.setFinalValue(constraintWidgetContainer.getHeight() - guideline3.getRelativeEnd());
                    } else if (constraintWidgetContainer.isResolvedVertically()) {
                        guideline3.setFinalValue((int) ((guideline3.getRelativePercent() * ((float) constraintWidgetContainer.getHeight())) + 0.5f));
                    }
                    z3 = true;
                }
            } else if ((constraintWidget4 instanceof Barrier) && ((Barrier) constraintWidget4).getOrientation() == 1) {
                z4 = true;
            }
        }
        if (z3) {
            for (int i6 = 0; i6 < size; i6++) {
                ConstraintWidget constraintWidget5 = children.get(i6);
                if (constraintWidget5 instanceof Guideline) {
                    Guideline guideline4 = (Guideline) constraintWidget5;
                    if (guideline4.getOrientation() == 0) {
                        verticalSolvingPass(1, guideline4, measurer);
                    }
                }
            }
        }
        verticalSolvingPass(0, constraintWidgetContainer, measurer);
        if (z4) {
            for (int i7 = 0; i7 < size; i7++) {
                ConstraintWidget constraintWidget6 = children.get(i7);
                if (constraintWidget6 instanceof Barrier) {
                    Barrier barrier2 = (Barrier) constraintWidget6;
                    if (barrier2.getOrientation() == 1) {
                        solveBarrier(0, barrier2, measurer, 1, isRtl);
                    }
                }
            }
        }
        for (int i8 = 0; i8 < size; i8++) {
            ConstraintWidget constraintWidget7 = children.get(i8);
            if (constraintWidget7.isMeasureRequested() && canMeasure(0, constraintWidget7)) {
                ConstraintWidgetContainer.measure(0, constraintWidget7, measurer, measure, BasicMeasure.Measure.SELF_DIMENSIONS);
                if (!(constraintWidget7 instanceof Guideline)) {
                    horizontalSolvingPass(0, constraintWidget7, measurer, isRtl);
                    verticalSolvingPass(0, constraintWidget7, measurer);
                } else if (((Guideline) constraintWidget7).getOrientation() == 0) {
                    verticalSolvingPass(0, constraintWidget7, measurer);
                } else {
                    horizontalSolvingPass(0, constraintWidget7, measurer, isRtl);
                }
            }
        }
    }

    private static void solveBarrier(int i, Barrier barrier, BasicMeasure.Measurer measurer, int i2, boolean z) {
        if (!barrier.allSolved()) {
            return;
        }
        if (i2 == 0) {
            horizontalSolvingPass(i + 1, barrier, measurer, z);
        } else {
            verticalSolvingPass(i + 1, barrier, measurer);
        }
    }

    private static void horizontalSolvingPass(int i, ConstraintWidget constraintWidget, BasicMeasure.Measurer measurer, boolean z) {
        ConstraintWidget constraintWidget2 = constraintWidget;
        BasicMeasure.Measurer measurer2 = measurer;
        boolean z2 = z;
        if (!constraintWidget.isHorizontalSolvingPassDone()) {
            hcount++;
            if (!(constraintWidget2 instanceof ConstraintWidgetContainer) && constraintWidget.isMeasureRequested()) {
                int i2 = i + 1;
                if (canMeasure(i2, constraintWidget2)) {
                    ConstraintWidgetContainer.measure(i2, constraintWidget2, measurer2, new BasicMeasure.Measure(), BasicMeasure.Measure.SELF_DIMENSIONS);
                }
            }
            ConstraintAnchor anchor = constraintWidget2.getAnchor(ConstraintAnchor.Type.LEFT);
            ConstraintAnchor anchor2 = constraintWidget2.getAnchor(ConstraintAnchor.Type.RIGHT);
            int finalValue = anchor.getFinalValue();
            int finalValue2 = anchor2.getFinalValue();
            if (anchor.getDependents() != null && anchor.hasFinalValue()) {
                Iterator<ConstraintAnchor> it = anchor.getDependents().iterator();
                while (it.hasNext()) {
                    ConstraintAnchor next = it.next();
                    ConstraintWidget constraintWidget3 = next.mOwner;
                    int i3 = i + 1;
                    boolean canMeasure = canMeasure(i3, constraintWidget3);
                    if (constraintWidget3.isMeasureRequested() && canMeasure) {
                        ConstraintWidgetContainer.measure(i3, constraintWidget3, measurer2, new BasicMeasure.Measure(), BasicMeasure.Measure.SELF_DIMENSIONS);
                    }
                    boolean z3 = (next == constraintWidget3.mLeft && constraintWidget3.mRight.mTarget != null && constraintWidget3.mRight.mTarget.hasFinalValue()) || (next == constraintWidget3.mRight && constraintWidget3.mLeft.mTarget != null && constraintWidget3.mLeft.mTarget.hasFinalValue());
                    if (constraintWidget3.getHorizontalDimensionBehaviour() != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || canMeasure) {
                        if (!constraintWidget3.isMeasureRequested()) {
                            if (next == constraintWidget3.mLeft && constraintWidget3.mRight.mTarget == null) {
                                int margin = constraintWidget3.mLeft.getMargin() + finalValue;
                                constraintWidget3.setFinalHorizontal(margin, constraintWidget3.getWidth() + margin);
                                horizontalSolvingPass(i3, constraintWidget3, measurer2, z2);
                            } else if (next == constraintWidget3.mRight && constraintWidget3.mLeft.mTarget == null) {
                                int margin2 = finalValue - constraintWidget3.mRight.getMargin();
                                constraintWidget3.setFinalHorizontal(margin2 - constraintWidget3.getWidth(), margin2);
                                horizontalSolvingPass(i3, constraintWidget3, measurer2, z2);
                            } else if (z3 && !constraintWidget3.isInHorizontalChain()) {
                                solveHorizontalCenterConstraints(i3, measurer2, constraintWidget3, z2);
                            }
                        }
                    } else if (constraintWidget3.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget3.mMatchConstraintMaxWidth >= 0 && constraintWidget3.mMatchConstraintMinWidth >= 0 && ((constraintWidget3.getVisibility() == 8 || (constraintWidget3.mMatchConstraintDefaultWidth == 0 && constraintWidget3.getDimensionRatio() == 0.0f)) && !constraintWidget3.isInHorizontalChain() && !constraintWidget3.isInVirtualLayout() && z3 && !constraintWidget3.isInHorizontalChain())) {
                        solveHorizontalMatchConstraint(i3, constraintWidget2, measurer2, constraintWidget3, z2);
                    }
                }
            }
            if (!(constraintWidget2 instanceof Guideline)) {
                if (anchor2.getDependents() != null && anchor2.hasFinalValue()) {
                    Iterator<ConstraintAnchor> it2 = anchor2.getDependents().iterator();
                    while (it2.hasNext()) {
                        ConstraintAnchor next2 = it2.next();
                        ConstraintWidget constraintWidget4 = next2.mOwner;
                        int i4 = i + 1;
                        boolean canMeasure2 = canMeasure(i4, constraintWidget4);
                        if (constraintWidget4.isMeasureRequested() && canMeasure2) {
                            ConstraintWidgetContainer.measure(i4, constraintWidget4, measurer2, new BasicMeasure.Measure(), BasicMeasure.Measure.SELF_DIMENSIONS);
                        }
                        boolean z4 = (next2 == constraintWidget4.mLeft && constraintWidget4.mRight.mTarget != null && constraintWidget4.mRight.mTarget.hasFinalValue()) || (next2 == constraintWidget4.mRight && constraintWidget4.mLeft.mTarget != null && constraintWidget4.mLeft.mTarget.hasFinalValue());
                        if (constraintWidget4.getHorizontalDimensionBehaviour() != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || canMeasure2) {
                            if (!constraintWidget4.isMeasureRequested()) {
                                if (next2 == constraintWidget4.mLeft && constraintWidget4.mRight.mTarget == null) {
                                    int margin3 = constraintWidget4.mLeft.getMargin() + finalValue2;
                                    constraintWidget4.setFinalHorizontal(margin3, constraintWidget4.getWidth() + margin3);
                                    horizontalSolvingPass(i4, constraintWidget4, measurer2, z2);
                                } else if (next2 == constraintWidget4.mRight && constraintWidget4.mLeft.mTarget == null) {
                                    int margin4 = finalValue2 - constraintWidget4.mRight.getMargin();
                                    constraintWidget4.setFinalHorizontal(margin4 - constraintWidget4.getWidth(), margin4);
                                    horizontalSolvingPass(i4, constraintWidget4, measurer2, z2);
                                } else if (z4 && !constraintWidget4.isInHorizontalChain()) {
                                    solveHorizontalCenterConstraints(i4, measurer2, constraintWidget4, z2);
                                }
                            }
                        } else if (constraintWidget4.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget4.mMatchConstraintMaxWidth >= 0 && constraintWidget4.mMatchConstraintMinWidth >= 0) {
                            if ((constraintWidget4.getVisibility() == 8 || (constraintWidget4.mMatchConstraintDefaultWidth == 0 && constraintWidget4.getDimensionRatio() == 0.0f)) && !constraintWidget4.isInHorizontalChain() && !constraintWidget4.isInVirtualLayout() && z4 && !constraintWidget4.isInHorizontalChain()) {
                                solveHorizontalMatchConstraint(i4, constraintWidget2, measurer2, constraintWidget4, z2);
                            }
                        }
                    }
                }
                constraintWidget.markHorizontalSolvingPassDone();
            }
        }
    }

    private static void verticalSolvingPass(int i, ConstraintWidget constraintWidget, BasicMeasure.Measurer measurer) {
        ConstraintWidget constraintWidget2 = constraintWidget;
        BasicMeasure.Measurer measurer2 = measurer;
        if (!constraintWidget.isVerticalSolvingPassDone()) {
            vcount++;
            if (!(constraintWidget2 instanceof ConstraintWidgetContainer) && constraintWidget.isMeasureRequested()) {
                int i2 = i + 1;
                if (canMeasure(i2, constraintWidget2)) {
                    ConstraintWidgetContainer.measure(i2, constraintWidget2, measurer2, new BasicMeasure.Measure(), BasicMeasure.Measure.SELF_DIMENSIONS);
                }
            }
            ConstraintAnchor anchor = constraintWidget2.getAnchor(ConstraintAnchor.Type.TOP);
            ConstraintAnchor anchor2 = constraintWidget2.getAnchor(ConstraintAnchor.Type.BOTTOM);
            int finalValue = anchor.getFinalValue();
            int finalValue2 = anchor2.getFinalValue();
            if (anchor.getDependents() != null && anchor.hasFinalValue()) {
                Iterator<ConstraintAnchor> it = anchor.getDependents().iterator();
                while (it.hasNext()) {
                    ConstraintAnchor next = it.next();
                    ConstraintWidget constraintWidget3 = next.mOwner;
                    int i3 = i + 1;
                    boolean canMeasure = canMeasure(i3, constraintWidget3);
                    if (constraintWidget3.isMeasureRequested() && canMeasure) {
                        ConstraintWidgetContainer.measure(i3, constraintWidget3, measurer2, new BasicMeasure.Measure(), BasicMeasure.Measure.SELF_DIMENSIONS);
                    }
                    boolean z = (next == constraintWidget3.mTop && constraintWidget3.mBottom.mTarget != null && constraintWidget3.mBottom.mTarget.hasFinalValue()) || (next == constraintWidget3.mBottom && constraintWidget3.mTop.mTarget != null && constraintWidget3.mTop.mTarget.hasFinalValue());
                    if (constraintWidget3.getVerticalDimensionBehaviour() != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || canMeasure) {
                        if (!constraintWidget3.isMeasureRequested()) {
                            if (next == constraintWidget3.mTop && constraintWidget3.mBottom.mTarget == null) {
                                int margin = constraintWidget3.mTop.getMargin() + finalValue;
                                constraintWidget3.setFinalVertical(margin, constraintWidget3.getHeight() + margin);
                                verticalSolvingPass(i3, constraintWidget3, measurer2);
                            } else if (next == constraintWidget3.mBottom && constraintWidget3.mTop.mTarget == null) {
                                int margin2 = finalValue - constraintWidget3.mBottom.getMargin();
                                constraintWidget3.setFinalVertical(margin2 - constraintWidget3.getHeight(), margin2);
                                verticalSolvingPass(i3, constraintWidget3, measurer2);
                            } else if (z && !constraintWidget3.isInVerticalChain()) {
                                solveVerticalCenterConstraints(i3, measurer2, constraintWidget3);
                            }
                        }
                    } else if (constraintWidget3.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget3.mMatchConstraintMaxHeight >= 0 && constraintWidget3.mMatchConstraintMinHeight >= 0) {
                        if ((constraintWidget3.getVisibility() == 8 || (constraintWidget3.mMatchConstraintDefaultHeight == 0 && constraintWidget3.getDimensionRatio() == 0.0f)) && !constraintWidget3.isInVerticalChain() && !constraintWidget3.isInVirtualLayout() && z && !constraintWidget3.isInVerticalChain()) {
                            solveVerticalMatchConstraint(i3, constraintWidget2, measurer2, constraintWidget3);
                        }
                    }
                }
            }
            if (!(constraintWidget2 instanceof Guideline)) {
                if (anchor2.getDependents() != null && anchor2.hasFinalValue()) {
                    Iterator<ConstraintAnchor> it2 = anchor2.getDependents().iterator();
                    while (it2.hasNext()) {
                        ConstraintAnchor next2 = it2.next();
                        ConstraintWidget constraintWidget4 = next2.mOwner;
                        int i4 = i + 1;
                        boolean canMeasure2 = canMeasure(i4, constraintWidget4);
                        if (constraintWidget4.isMeasureRequested() && canMeasure2) {
                            ConstraintWidgetContainer.measure(i4, constraintWidget4, measurer2, new BasicMeasure.Measure(), BasicMeasure.Measure.SELF_DIMENSIONS);
                        }
                        boolean z2 = (next2 == constraintWidget4.mTop && constraintWidget4.mBottom.mTarget != null && constraintWidget4.mBottom.mTarget.hasFinalValue()) || (next2 == constraintWidget4.mBottom && constraintWidget4.mTop.mTarget != null && constraintWidget4.mTop.mTarget.hasFinalValue());
                        if (constraintWidget4.getVerticalDimensionBehaviour() != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || canMeasure2) {
                            if (!constraintWidget4.isMeasureRequested()) {
                                if (next2 == constraintWidget4.mTop && constraintWidget4.mBottom.mTarget == null) {
                                    int margin3 = constraintWidget4.mTop.getMargin() + finalValue2;
                                    constraintWidget4.setFinalVertical(margin3, constraintWidget4.getHeight() + margin3);
                                    verticalSolvingPass(i4, constraintWidget4, measurer2);
                                } else if (next2 == constraintWidget4.mBottom && constraintWidget4.mTop.mTarget == null) {
                                    int margin4 = finalValue2 - constraintWidget4.mBottom.getMargin();
                                    constraintWidget4.setFinalVertical(margin4 - constraintWidget4.getHeight(), margin4);
                                    verticalSolvingPass(i4, constraintWidget4, measurer2);
                                } else if (z2 && !constraintWidget4.isInVerticalChain()) {
                                    solveVerticalCenterConstraints(i4, measurer2, constraintWidget4);
                                }
                            }
                        } else if (constraintWidget4.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget4.mMatchConstraintMaxHeight >= 0 && constraintWidget4.mMatchConstraintMinHeight >= 0) {
                            if ((constraintWidget4.getVisibility() == 8 || (constraintWidget4.mMatchConstraintDefaultHeight == 0 && constraintWidget4.getDimensionRatio() == 0.0f)) && !constraintWidget4.isInVerticalChain() && !constraintWidget4.isInVirtualLayout() && z2 && !constraintWidget4.isInVerticalChain()) {
                                solveVerticalMatchConstraint(i4, constraintWidget2, measurer2, constraintWidget4);
                            }
                        }
                    }
                }
                ConstraintAnchor anchor3 = constraintWidget2.getAnchor(ConstraintAnchor.Type.BASELINE);
                if (anchor3.getDependents() != null && anchor3.hasFinalValue()) {
                    int finalValue3 = anchor3.getFinalValue();
                    Iterator<ConstraintAnchor> it3 = anchor3.getDependents().iterator();
                    while (it3.hasNext()) {
                        ConstraintAnchor next3 = it3.next();
                        ConstraintWidget constraintWidget5 = next3.mOwner;
                        int i5 = i + 1;
                        boolean canMeasure3 = canMeasure(i5, constraintWidget5);
                        if (constraintWidget5.isMeasureRequested() && canMeasure3) {
                            ConstraintWidgetContainer.measure(i5, constraintWidget5, measurer2, new BasicMeasure.Measure(), BasicMeasure.Measure.SELF_DIMENSIONS);
                        }
                        if ((constraintWidget5.getVerticalDimensionBehaviour() != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || canMeasure3) && !constraintWidget5.isMeasureRequested() && next3 == constraintWidget5.mBaseline) {
                            constraintWidget5.setFinalBaseline(next3.getMargin() + finalValue3);
                            try {
                                verticalSolvingPass(i5, constraintWidget5, measurer2);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }
                constraintWidget.markVerticalSolvingPassDone();
            }
        }
    }

    private static void solveHorizontalCenterConstraints(int i, BasicMeasure.Measurer measurer, ConstraintWidget constraintWidget, boolean z) {
        float horizontalBiasPercent = constraintWidget.getHorizontalBiasPercent();
        int finalValue = constraintWidget.mLeft.mTarget.getFinalValue();
        int finalValue2 = constraintWidget.mRight.mTarget.getFinalValue();
        int margin = constraintWidget.mLeft.getMargin() + finalValue;
        int margin2 = finalValue2 - constraintWidget.mRight.getMargin();
        if (finalValue == finalValue2) {
            horizontalBiasPercent = 0.5f;
        } else {
            finalValue = margin;
            finalValue2 = margin2;
        }
        int width = constraintWidget.getWidth();
        int i2 = (finalValue2 - finalValue) - width;
        if (finalValue > finalValue2) {
            i2 = (finalValue - finalValue2) - width;
        }
        int i3 = ((int) (i2 > 0 ? (horizontalBiasPercent * ((float) i2)) + 0.5f : horizontalBiasPercent * ((float) i2))) + finalValue;
        int i4 = i3 + width;
        if (finalValue > finalValue2) {
            i4 = i3 - width;
        }
        constraintWidget.setFinalHorizontal(i3, i4);
        horizontalSolvingPass(i + 1, constraintWidget, measurer, z);
    }

    private static void solveVerticalCenterConstraints(int i, BasicMeasure.Measurer measurer, ConstraintWidget constraintWidget) {
        float verticalBiasPercent = constraintWidget.getVerticalBiasPercent();
        int finalValue = constraintWidget.mTop.mTarget.getFinalValue();
        int finalValue2 = constraintWidget.mBottom.mTarget.getFinalValue();
        int margin = constraintWidget.mTop.getMargin() + finalValue;
        int margin2 = finalValue2 - constraintWidget.mBottom.getMargin();
        if (finalValue == finalValue2) {
            verticalBiasPercent = 0.5f;
        } else {
            finalValue = margin;
            finalValue2 = margin2;
        }
        int height = constraintWidget.getHeight();
        int i2 = (finalValue2 - finalValue) - height;
        if (finalValue > finalValue2) {
            i2 = (finalValue - finalValue2) - height;
        }
        int i3 = (int) (i2 > 0 ? (verticalBiasPercent * ((float) i2)) + 0.5f : verticalBiasPercent * ((float) i2));
        int i4 = finalValue + i3;
        int i5 = i4 + height;
        if (finalValue > finalValue2) {
            i4 = finalValue - i3;
            i5 = i4 - height;
        }
        constraintWidget.setFinalVertical(i4, i5);
        verticalSolvingPass(i + 1, constraintWidget, measurer);
    }

    private static void solveHorizontalMatchConstraint(int i, ConstraintWidget constraintWidget, BasicMeasure.Measurer measurer, ConstraintWidget constraintWidget2, boolean z) {
        int i2;
        float horizontalBiasPercent = constraintWidget2.getHorizontalBiasPercent();
        int finalValue = constraintWidget2.mLeft.mTarget.getFinalValue() + constraintWidget2.mLeft.getMargin();
        int finalValue2 = constraintWidget2.mRight.mTarget.getFinalValue() - constraintWidget2.mRight.getMargin();
        if (finalValue2 >= finalValue) {
            int width = constraintWidget2.getWidth();
            if (constraintWidget2.getVisibility() != 8) {
                if (constraintWidget2.mMatchConstraintDefaultWidth == 2) {
                    if (constraintWidget instanceof ConstraintWidgetContainer) {
                        i2 = constraintWidget.getWidth();
                    } else {
                        i2 = constraintWidget.getParent().getWidth();
                    }
                    width = (int) (constraintWidget2.getHorizontalBiasPercent() * 0.5f * ((float) i2));
                } else if (constraintWidget2.mMatchConstraintDefaultWidth == 0) {
                    width = finalValue2 - finalValue;
                }
                width = Math.max(constraintWidget2.mMatchConstraintMinWidth, width);
                if (constraintWidget2.mMatchConstraintMaxWidth > 0) {
                    width = Math.min(constraintWidget2.mMatchConstraintMaxWidth, width);
                }
            }
            int i3 = finalValue + ((int) ((horizontalBiasPercent * ((float) ((finalValue2 - finalValue) - width))) + 0.5f));
            constraintWidget2.setFinalHorizontal(i3, width + i3);
            horizontalSolvingPass(i + 1, constraintWidget2, measurer, z);
        }
    }

    private static void solveVerticalMatchConstraint(int i, ConstraintWidget constraintWidget, BasicMeasure.Measurer measurer, ConstraintWidget constraintWidget2) {
        int i2;
        float verticalBiasPercent = constraintWidget2.getVerticalBiasPercent();
        int finalValue = constraintWidget2.mTop.mTarget.getFinalValue() + constraintWidget2.mTop.getMargin();
        int finalValue2 = constraintWidget2.mBottom.mTarget.getFinalValue() - constraintWidget2.mBottom.getMargin();
        if (finalValue2 >= finalValue) {
            int height = constraintWidget2.getHeight();
            if (constraintWidget2.getVisibility() != 8) {
                if (constraintWidget2.mMatchConstraintDefaultHeight == 2) {
                    if (constraintWidget instanceof ConstraintWidgetContainer) {
                        i2 = constraintWidget.getHeight();
                    } else {
                        i2 = constraintWidget.getParent().getHeight();
                    }
                    height = (int) (verticalBiasPercent * 0.5f * ((float) i2));
                } else if (constraintWidget2.mMatchConstraintDefaultHeight == 0) {
                    height = finalValue2 - finalValue;
                }
                height = Math.max(constraintWidget2.mMatchConstraintMinHeight, height);
                if (constraintWidget2.mMatchConstraintMaxHeight > 0) {
                    height = Math.min(constraintWidget2.mMatchConstraintMaxHeight, height);
                }
            }
            int i3 = finalValue + ((int) ((verticalBiasPercent * ((float) ((finalValue2 - finalValue) - height))) + 0.5f));
            constraintWidget2.setFinalVertical(i3, height + i3);
            verticalSolvingPass(i + 1, constraintWidget2, measurer);
        }
    }

    private static boolean canMeasure(int i, ConstraintWidget constraintWidget) {
        ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = constraintWidget.getHorizontalDimensionBehaviour();
        ConstraintWidget.DimensionBehaviour verticalDimensionBehaviour = constraintWidget.getVerticalDimensionBehaviour();
        ConstraintWidgetContainer constraintWidgetContainer = constraintWidget.getParent() != null ? (ConstraintWidgetContainer) constraintWidget.getParent() : null;
        if (constraintWidgetContainer != null) {
            ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour2 = constraintWidgetContainer.getHorizontalDimensionBehaviour();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (constraintWidgetContainer != null) {
            ConstraintWidget.DimensionBehaviour verticalDimensionBehaviour2 = constraintWidgetContainer.getVerticalDimensionBehaviour();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        boolean z = horizontalDimensionBehaviour == ConstraintWidget.DimensionBehaviour.FIXED || constraintWidget.isResolvedHorizontally() || horizontalDimensionBehaviour == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (horizontalDimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultWidth == 0 && constraintWidget.mDimensionRatio == 0.0f && constraintWidget.hasDanglingDimension(0)) || (horizontalDimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultWidth == 1 && constraintWidget.hasResolvedTargets(0, constraintWidget.getWidth()));
        boolean z2 = verticalDimensionBehaviour == ConstraintWidget.DimensionBehaviour.FIXED || constraintWidget.isResolvedVertically() || verticalDimensionBehaviour == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (verticalDimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultHeight == 0 && constraintWidget.mDimensionRatio == 0.0f && constraintWidget.hasDanglingDimension(1)) || (verticalDimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultHeight == 1 && constraintWidget.hasResolvedTargets(1, constraintWidget.getHeight()));
        if (constraintWidget.mDimensionRatio > 0.0f && (z || z2)) {
            return true;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }
}
