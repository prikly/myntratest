package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;

class RunGroup {
    public static int index;
    int direction;
    public boolean dual = false;
    WidgetRun firstRun = null;
    int groupIndex = 0;
    WidgetRun lastRun = null;
    public int position = 0;
    ArrayList<WidgetRun> runs = new ArrayList<>();

    public RunGroup(WidgetRun widgetRun, int i) {
        int i2 = index;
        this.groupIndex = i2;
        index = i2 + 1;
        this.firstRun = widgetRun;
        this.lastRun = widgetRun;
        this.direction = i;
    }

    public void add(WidgetRun widgetRun) {
        this.runs.add(widgetRun);
        this.lastRun = widgetRun;
    }

    private long traverseStart(DependencyNode dependencyNode, long j) {
        WidgetRun widgetRun = dependencyNode.run;
        if (widgetRun instanceof HelperReferences) {
            return j;
        }
        int size = dependencyNode.dependencies.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            Dependency dependency = dependencyNode.dependencies.get(i);
            if (dependency instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dependency;
                if (dependencyNode2.run != widgetRun) {
                    j2 = Math.max(j2, traverseStart(dependencyNode2, ((long) dependencyNode2.margin) + j));
                }
            }
        }
        if (dependencyNode != widgetRun.start) {
            return j2;
        }
        long wrapDimension = j + widgetRun.getWrapDimension();
        return Math.max(Math.max(j2, traverseStart(widgetRun.end, wrapDimension)), wrapDimension - ((long) widgetRun.end.margin));
    }

    private long traverseEnd(DependencyNode dependencyNode, long j) {
        WidgetRun widgetRun = dependencyNode.run;
        if (widgetRun instanceof HelperReferences) {
            return j;
        }
        int size = dependencyNode.dependencies.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            Dependency dependency = dependencyNode.dependencies.get(i);
            if (dependency instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dependency;
                if (dependencyNode2.run != widgetRun) {
                    j2 = Math.min(j2, traverseEnd(dependencyNode2, ((long) dependencyNode2.margin) + j));
                }
            }
        }
        if (dependencyNode != widgetRun.end) {
            return j2;
        }
        long wrapDimension = j - widgetRun.getWrapDimension();
        return Math.min(Math.min(j2, traverseEnd(widgetRun.start, wrapDimension)), wrapDimension - ((long) widgetRun.start.margin));
    }

    public long computeWrapSize(ConstraintWidgetContainer constraintWidgetContainer, int i) {
        long j;
        int i2;
        WidgetRun widgetRun = this.firstRun;
        long j2 = 0;
        if (widgetRun instanceof ChainRun) {
            if (((ChainRun) widgetRun).orientation != i) {
                return 0;
            }
        } else if (i == 0) {
            if (!(widgetRun instanceof HorizontalWidgetRun)) {
                return 0;
            }
        } else if (!(widgetRun instanceof VerticalWidgetRun)) {
            return 0;
        }
        DependencyNode dependencyNode = i == 0 ? constraintWidgetContainer.horizontalRun.start : constraintWidgetContainer.verticalRun.start;
        DependencyNode dependencyNode2 = i == 0 ? constraintWidgetContainer.horizontalRun.end : constraintWidgetContainer.verticalRun.end;
        boolean contains = this.firstRun.start.targets.contains(dependencyNode);
        boolean contains2 = this.firstRun.end.targets.contains(dependencyNode2);
        long wrapDimension = this.firstRun.getWrapDimension();
        if (contains && contains2) {
            long traverseStart = traverseStart(this.firstRun.start, 0);
            long traverseEnd = traverseEnd(this.firstRun.end, 0);
            long j3 = traverseStart - wrapDimension;
            if (j3 >= ((long) (-this.firstRun.end.margin))) {
                j3 += (long) this.firstRun.end.margin;
            }
            long j4 = ((-traverseEnd) - wrapDimension) - ((long) this.firstRun.start.margin);
            if (j4 >= ((long) this.firstRun.start.margin)) {
                j4 -= (long) this.firstRun.start.margin;
            }
            float biasPercent = this.firstRun.widget.getBiasPercent(i);
            if (biasPercent > 0.0f) {
                j2 = (long) ((((float) j4) / biasPercent) + (((float) j3) / (1.0f - biasPercent)));
            }
            float f2 = (float) j2;
            j = ((long) this.firstRun.start.margin) + ((long) ((f2 * biasPercent) + 0.5f)) + wrapDimension + ((long) ((f2 * (1.0f - biasPercent)) + 0.5f));
            i2 = this.firstRun.end.margin;
        } else if (contains) {
            return Math.max(traverseStart(this.firstRun.start, (long) this.firstRun.start.margin), ((long) this.firstRun.start.margin) + wrapDimension);
        } else {
            if (contains2) {
                return Math.max(-traverseEnd(this.firstRun.end, (long) this.firstRun.end.margin), ((long) (-this.firstRun.end.margin)) + wrapDimension);
            }
            j = ((long) this.firstRun.start.margin) + this.firstRun.getWrapDimension();
            i2 = this.firstRun.end.margin;
        }
        return j - ((long) i2);
    }
}
