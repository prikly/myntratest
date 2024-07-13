package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;

public class Placeholder extends VirtualLayout {
    public void addToSolver(LinearSystem linearSystem, boolean z) {
        super.addToSolver(linearSystem, z);
        if (this.mWidgetsCount > 0) {
            ConstraintWidget constraintWidget = this.mWidgets[0];
            constraintWidget.resetAllConstraints();
            constraintWidget.connect(ConstraintAnchor.Type.LEFT, (ConstraintWidget) this, ConstraintAnchor.Type.LEFT);
            constraintWidget.connect(ConstraintAnchor.Type.RIGHT, (ConstraintWidget) this, ConstraintAnchor.Type.RIGHT);
            constraintWidget.connect(ConstraintAnchor.Type.TOP, (ConstraintWidget) this, ConstraintAnchor.Type.TOP);
            constraintWidget.connect(ConstraintAnchor.Type.BOTTOM, (ConstraintWidget) this, ConstraintAnchor.Type.BOTTOM);
        }
    }
}
