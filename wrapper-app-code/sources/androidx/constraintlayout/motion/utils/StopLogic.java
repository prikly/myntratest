package androidx.constraintlayout.motion.utils;

import androidx.constraintlayout.core.motion.utils.SpringStopEngine;
import androidx.constraintlayout.core.motion.utils.StopEngine;
import androidx.constraintlayout.core.motion.utils.StopLogicEngine;
import androidx.constraintlayout.motion.widget.MotionInterpolator;

public class StopLogic extends MotionInterpolator {
    private StopEngine mEngine;
    private SpringStopEngine mSpringStopEngine;
    private StopLogicEngine mStopLogicEngine;

    public StopLogic() {
        StopLogicEngine stopLogicEngine = new StopLogicEngine();
        this.mStopLogicEngine = stopLogicEngine;
        this.mEngine = stopLogicEngine;
    }

    public void config(float f2, float f3, float f4, float f5, float f6, float f7) {
        StopLogicEngine stopLogicEngine = this.mStopLogicEngine;
        this.mEngine = stopLogicEngine;
        stopLogicEngine.config(f2, f3, f4, f5, f6, f7);
    }

    public void springConfig(float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i) {
        if (this.mSpringStopEngine == null) {
            this.mSpringStopEngine = new SpringStopEngine();
        }
        SpringStopEngine springStopEngine = this.mSpringStopEngine;
        this.mEngine = springStopEngine;
        springStopEngine.springConfig(f2, f3, f4, f5, f6, f7, f8, i);
    }

    public float getInterpolation(float f2) {
        return this.mEngine.getInterpolation(f2);
    }

    public float getVelocity() {
        return this.mEngine.getVelocity();
    }

    public boolean isStopped() {
        return this.mEngine.isStopped();
    }
}
