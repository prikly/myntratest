package androidx.constraintlayout.core.motion.utils;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public abstract class KeyCycleOscillator {
    private CurveFit mCurveFit;
    private CycleOscillator mCycleOscillator;
    private String mType;
    public int mVariesBy = 0;
    ArrayList<WavePoint> mWavePoints = new ArrayList<>();
    private int mWaveShape = 0;
    private String mWaveString = null;

    /* access modifiers changed from: protected */
    public void setCustom(Object obj) {
    }

    public boolean variesByPath() {
        return this.mVariesBy == 1;
    }

    static class WavePoint {
        float mOffset;
        float mPeriod;
        float mPhase;
        int mPosition;
        float mValue;

        public WavePoint(int i, float f2, float f3, float f4, float f5) {
            this.mPosition = i;
            this.mValue = f5;
            this.mOffset = f3;
            this.mPeriod = f2;
            this.mPhase = f4;
        }
    }

    public String toString() {
        String str = this.mType;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<WavePoint> it = this.mWavePoints.iterator();
        while (it.hasNext()) {
            WavePoint next = it.next();
            str = str + "[" + next.mPosition + " , " + decimalFormat.format((double) next.mValue) + "] ";
        }
        return str;
    }

    public void setType(String str) {
        this.mType = str;
    }

    public float get(float f2) {
        return (float) this.mCycleOscillator.getValues(f2);
    }

    public void setPoint(int i, int i2, String str, int i3, float f2, float f3, float f4, float f5, Object obj) {
        int i4 = i3;
        this.mWavePoints.add(new WavePoint(i, f2, f3, f4, f5));
        if (i4 != -1) {
            this.mVariesBy = i4;
        }
        this.mWaveShape = i2;
        setCustom(obj);
        this.mWaveString = str;
    }

    public void setPoint(int i, int i2, String str, int i3, float f2, float f3, float f4, float f5) {
        int i4 = i3;
        this.mWavePoints.add(new WavePoint(i, f2, f3, f4, f5));
        if (i4 != -1) {
            this.mVariesBy = i4;
        }
        this.mWaveShape = i2;
        this.mWaveString = str;
    }

    public void setup(float f2) {
        int size = this.mWavePoints.size();
        if (size != 0) {
            Collections.sort(this.mWavePoints, new Comparator<WavePoint>() {
                public int compare(WavePoint wavePoint, WavePoint wavePoint2) {
                    return Integer.compare(wavePoint.mPosition, wavePoint2.mPosition);
                }
            });
            double[] dArr = new double[size];
            int[] iArr = new int[2];
            iArr[1] = 3;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr);
            this.mCycleOscillator = new CycleOscillator(this.mWaveShape, this.mWaveString, this.mVariesBy, size);
            Iterator<WavePoint> it = this.mWavePoints.iterator();
            int i = 0;
            while (it.hasNext()) {
                WavePoint next = it.next();
                dArr[i] = ((double) next.mPeriod) * 0.01d;
                dArr2[i][0] = (double) next.mValue;
                dArr2[i][1] = (double) next.mOffset;
                dArr2[i][2] = (double) next.mPhase;
                this.mCycleOscillator.setPoint(i, next.mPosition, next.mPeriod, next.mOffset, next.mPhase, next.mValue);
                i++;
            }
            this.mCycleOscillator.setup(f2);
            this.mCurveFit = CurveFit.get(0, dArr, dArr2);
        }
    }

    static class CycleOscillator {
        private final int OFFST = 0;
        private final int PHASE = 1;
        private final int VALUE = 2;
        CurveFit mCurveFit;
        float[] mOffset;
        Oscillator mOscillator;
        float mPathLength;
        float[] mPeriod;
        float[] mPhase;
        double[] mPosition;
        float[] mScale;
        double[] mSplineSlopeCache;
        double[] mSplineValueCache;
        float[] mValues;
        private final int mVariesBy;
        int mWaveShape;

        CycleOscillator(int i, String str, int i2, int i3) {
            Oscillator oscillator = new Oscillator();
            this.mOscillator = oscillator;
            this.mWaveShape = i;
            this.mVariesBy = i2;
            oscillator.setType(i, str);
            this.mValues = new float[i3];
            this.mPosition = new double[i3];
            this.mPeriod = new float[i3];
            this.mOffset = new float[i3];
            this.mPhase = new float[i3];
            this.mScale = new float[i3];
        }

        public double getValues(float f2) {
            CurveFit curveFit = this.mCurveFit;
            if (curveFit != null) {
                curveFit.getPos((double) f2, this.mSplineValueCache);
            } else {
                double[] dArr = this.mSplineValueCache;
                dArr[0] = (double) this.mOffset[0];
                dArr[1] = (double) this.mPhase[0];
                dArr[2] = (double) this.mValues[0];
            }
            double[] dArr2 = this.mSplineValueCache;
            return dArr2[0] + (this.mOscillator.getValue((double) f2, dArr2[1]) * this.mSplineValueCache[2]);
        }

        public void setPoint(int i, int i2, float f2, float f3, float f4, float f5) {
            this.mPosition[i] = ((double) i2) / 100.0d;
            this.mPeriod[i] = f2;
            this.mOffset[i] = f3;
            this.mPhase[i] = f4;
            this.mValues[i] = f5;
        }

        public void setup(float f2) {
            this.mPathLength = f2;
            int length = this.mPosition.length;
            int[] iArr = new int[2];
            iArr[1] = 3;
            iArr[0] = length;
            double[][] dArr = (double[][]) Array.newInstance(double.class, iArr);
            float[] fArr = this.mValues;
            this.mSplineValueCache = new double[(fArr.length + 2)];
            this.mSplineSlopeCache = new double[(fArr.length + 2)];
            if (this.mPosition[0] > 0.0d) {
                this.mOscillator.addPoint(0.0d, this.mPeriod[0]);
            }
            double[] dArr2 = this.mPosition;
            int length2 = dArr2.length - 1;
            if (dArr2[length2] < 1.0d) {
                this.mOscillator.addPoint(1.0d, this.mPeriod[length2]);
            }
            for (int i = 0; i < dArr.length; i++) {
                dArr[i][0] = (double) this.mOffset[i];
                dArr[i][1] = (double) this.mPhase[i];
                dArr[i][2] = (double) this.mValues[i];
                this.mOscillator.addPoint(this.mPosition[i], this.mPeriod[i]);
            }
            this.mOscillator.normalize();
            double[] dArr3 = this.mPosition;
            if (dArr3.length > 1) {
                this.mCurveFit = CurveFit.get(0, dArr3, dArr);
            } else {
                this.mCurveFit = null;
            }
        }
    }
}
