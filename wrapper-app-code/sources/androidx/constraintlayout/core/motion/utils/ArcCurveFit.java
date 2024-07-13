package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

public class ArcCurveFit extends CurveFit {
    Arc[] mArcs;
    private boolean mExtrapolate = true;
    private final double[] mTime;

    public void getPos(double d2, double[] dArr) {
        if (!this.mExtrapolate) {
            if (d2 < this.mArcs[0].mTime1) {
                d2 = this.mArcs[0].mTime1;
            }
            Arc[] arcArr = this.mArcs;
            if (d2 > arcArr[arcArr.length - 1].mTime2) {
                Arc[] arcArr2 = this.mArcs;
                d2 = arcArr2[arcArr2.length - 1].mTime2;
            }
        } else if (d2 < this.mArcs[0].mTime1) {
            double d3 = this.mArcs[0].mTime1;
            double d4 = d2 - this.mArcs[0].mTime1;
            if (this.mArcs[0].linear) {
                dArr[0] = this.mArcs[0].getLinearX(d3) + (this.mArcs[0].getLinearDX(d3) * d4);
                dArr[1] = this.mArcs[0].getLinearY(d3) + (d4 * this.mArcs[0].getLinearDY(d3));
                return;
            }
            this.mArcs[0].setPoint(d3);
            dArr[0] = this.mArcs[0].getX() + (this.mArcs[0].getDX() * d4);
            dArr[1] = this.mArcs[0].getY() + (d4 * this.mArcs[0].getDY());
            return;
        } else {
            Arc[] arcArr3 = this.mArcs;
            if (d2 > arcArr3[arcArr3.length - 1].mTime2) {
                Arc[] arcArr4 = this.mArcs;
                double d5 = arcArr4[arcArr4.length - 1].mTime2;
                double d6 = d2 - d5;
                Arc[] arcArr5 = this.mArcs;
                int length = arcArr5.length - 1;
                if (arcArr5[length].linear) {
                    dArr[0] = this.mArcs[length].getLinearX(d5) + (this.mArcs[length].getLinearDX(d5) * d6);
                    dArr[1] = this.mArcs[length].getLinearY(d5) + (d6 * this.mArcs[length].getLinearDY(d5));
                    return;
                }
                this.mArcs[length].setPoint(d2);
                dArr[0] = this.mArcs[length].getX() + (this.mArcs[length].getDX() * d6);
                dArr[1] = this.mArcs[length].getY() + (d6 * this.mArcs[length].getDY());
                return;
            }
        }
        int i = 0;
        while (true) {
            Arc[] arcArr6 = this.mArcs;
            if (i >= arcArr6.length) {
                return;
            }
            if (d2 > arcArr6[i].mTime2) {
                i++;
            } else if (this.mArcs[i].linear) {
                dArr[0] = this.mArcs[i].getLinearX(d2);
                dArr[1] = this.mArcs[i].getLinearY(d2);
                return;
            } else {
                this.mArcs[i].setPoint(d2);
                dArr[0] = this.mArcs[i].getX();
                dArr[1] = this.mArcs[i].getY();
                return;
            }
        }
    }

    public void getPos(double d2, float[] fArr) {
        if (this.mExtrapolate) {
            if (d2 < this.mArcs[0].mTime1) {
                double d3 = this.mArcs[0].mTime1;
                double d4 = d2 - this.mArcs[0].mTime1;
                if (this.mArcs[0].linear) {
                    fArr[0] = (float) (this.mArcs[0].getLinearX(d3) + (this.mArcs[0].getLinearDX(d3) * d4));
                    fArr[1] = (float) (this.mArcs[0].getLinearY(d3) + (d4 * this.mArcs[0].getLinearDY(d3)));
                    return;
                }
                this.mArcs[0].setPoint(d3);
                fArr[0] = (float) (this.mArcs[0].getX() + (this.mArcs[0].getDX() * d4));
                fArr[1] = (float) (this.mArcs[0].getY() + (d4 * this.mArcs[0].getDY()));
                return;
            }
            Arc[] arcArr = this.mArcs;
            if (d2 > arcArr[arcArr.length - 1].mTime2) {
                Arc[] arcArr2 = this.mArcs;
                double d5 = arcArr2[arcArr2.length - 1].mTime2;
                double d6 = d2 - d5;
                Arc[] arcArr3 = this.mArcs;
                int length = arcArr3.length - 1;
                if (arcArr3[length].linear) {
                    fArr[0] = (float) (this.mArcs[length].getLinearX(d5) + (this.mArcs[length].getLinearDX(d5) * d6));
                    fArr[1] = (float) (this.mArcs[length].getLinearY(d5) + (d6 * this.mArcs[length].getLinearDY(d5)));
                    return;
                }
                this.mArcs[length].setPoint(d2);
                fArr[0] = (float) this.mArcs[length].getX();
                fArr[1] = (float) this.mArcs[length].getY();
                return;
            }
        } else if (d2 < this.mArcs[0].mTime1) {
            d2 = this.mArcs[0].mTime1;
        } else {
            Arc[] arcArr4 = this.mArcs;
            if (d2 > arcArr4[arcArr4.length - 1].mTime2) {
                Arc[] arcArr5 = this.mArcs;
                d2 = arcArr5[arcArr5.length - 1].mTime2;
            }
        }
        int i = 0;
        while (true) {
            Arc[] arcArr6 = this.mArcs;
            if (i >= arcArr6.length) {
                return;
            }
            if (d2 > arcArr6[i].mTime2) {
                i++;
            } else if (this.mArcs[i].linear) {
                fArr[0] = (float) this.mArcs[i].getLinearX(d2);
                fArr[1] = (float) this.mArcs[i].getLinearY(d2);
                return;
            } else {
                this.mArcs[i].setPoint(d2);
                fArr[0] = (float) this.mArcs[i].getX();
                fArr[1] = (float) this.mArcs[i].getY();
                return;
            }
        }
    }

    public void getSlope(double d2, double[] dArr) {
        if (d2 < this.mArcs[0].mTime1) {
            d2 = this.mArcs[0].mTime1;
        } else {
            Arc[] arcArr = this.mArcs;
            if (d2 > arcArr[arcArr.length - 1].mTime2) {
                Arc[] arcArr2 = this.mArcs;
                d2 = arcArr2[arcArr2.length - 1].mTime2;
            }
        }
        int i = 0;
        while (true) {
            Arc[] arcArr3 = this.mArcs;
            if (i >= arcArr3.length) {
                return;
            }
            if (d2 > arcArr3[i].mTime2) {
                i++;
            } else if (this.mArcs[i].linear) {
                dArr[0] = this.mArcs[i].getLinearDX(d2);
                dArr[1] = this.mArcs[i].getLinearDY(d2);
                return;
            } else {
                this.mArcs[i].setPoint(d2);
                dArr[0] = this.mArcs[i].getDX();
                dArr[1] = this.mArcs[i].getDY();
                return;
            }
        }
    }

    public double getPos(double d2, int i) {
        double d3;
        double linearY;
        double linearDY;
        double y;
        double dy;
        int i2 = 0;
        if (this.mExtrapolate) {
            if (d2 < this.mArcs[0].mTime1) {
                double d4 = this.mArcs[0].mTime1;
                d3 = d2 - this.mArcs[0].mTime1;
                if (!this.mArcs[0].linear) {
                    this.mArcs[0].setPoint(d4);
                    if (i == 0) {
                        y = this.mArcs[0].getX();
                        dy = this.mArcs[0].getDX();
                    } else {
                        y = this.mArcs[0].getY();
                        dy = this.mArcs[0].getDY();
                    }
                    return y + (d3 * dy);
                } else if (i == 0) {
                    linearY = this.mArcs[0].getLinearX(d4);
                    linearDY = this.mArcs[0].getLinearDX(d4);
                } else {
                    linearY = this.mArcs[0].getLinearY(d4);
                    linearDY = this.mArcs[0].getLinearDY(d4);
                }
            } else {
                Arc[] arcArr = this.mArcs;
                if (d2 > arcArr[arcArr.length - 1].mTime2) {
                    Arc[] arcArr2 = this.mArcs;
                    double d5 = arcArr2[arcArr2.length - 1].mTime2;
                    d3 = d2 - d5;
                    Arc[] arcArr3 = this.mArcs;
                    int length = arcArr3.length - 1;
                    if (i == 0) {
                        linearY = arcArr3[length].getLinearX(d5);
                        linearDY = this.mArcs[length].getLinearDX(d5);
                    } else {
                        linearY = arcArr3[length].getLinearY(d5);
                        linearDY = this.mArcs[length].getLinearDY(d5);
                    }
                }
            }
            return linearY + (d3 * linearDY);
        } else if (d2 < this.mArcs[0].mTime1) {
            d2 = this.mArcs[0].mTime1;
        } else {
            Arc[] arcArr4 = this.mArcs;
            if (d2 > arcArr4[arcArr4.length - 1].mTime2) {
                Arc[] arcArr5 = this.mArcs;
                d2 = arcArr5[arcArr5.length - 1].mTime2;
            }
        }
        while (true) {
            Arc[] arcArr6 = this.mArcs;
            if (i2 >= arcArr6.length) {
                return Double.NaN;
            }
            if (d2 > arcArr6[i2].mTime2) {
                i2++;
            } else if (!this.mArcs[i2].linear) {
                this.mArcs[i2].setPoint(d2);
                if (i == 0) {
                    return this.mArcs[i2].getX();
                }
                return this.mArcs[i2].getY();
            } else if (i == 0) {
                return this.mArcs[i2].getLinearX(d2);
            } else {
                return this.mArcs[i2].getLinearY(d2);
            }
        }
    }

    public double[] getTimePoints() {
        return this.mTime;
    }

    public ArcCurveFit(int[] iArr, double[] dArr, double[][] dArr2) {
        int i;
        double[] dArr3 = dArr;
        this.mTime = dArr3;
        this.mArcs = new Arc[(dArr3.length - 1)];
        int i2 = 0;
        int i3 = 1;
        int i4 = 1;
        while (i2 < this.mArcs.length) {
            int i5 = iArr[i2];
            if (i5 == 0) {
                i = 3;
            } else if (i5 == 1) {
                i3 = 1;
                i = 1;
            } else if (i5 == 2) {
                i3 = 2;
                i = 2;
            } else if (i5 != 3) {
                i = i4;
            } else {
                i3 = i3 == 1 ? 2 : 1;
                i = i3;
            }
            int i6 = i2 + 1;
            this.mArcs[i2] = new Arc(i, dArr3[i2], dArr3[i6], dArr2[i2][0], dArr2[i2][1], dArr2[i6][0], dArr2[i6][1]);
            i4 = i;
            i2 = i6;
        }
    }

    private static class Arc {
        private static double[] ourPercent = new double[91];
        boolean linear = false;
        double mArcDistance;
        double mArcVelocity;
        double mEllipseA;
        double mEllipseB;
        double mEllipseCenterX;
        double mEllipseCenterY;
        double[] mLut;
        double mOneOverDeltaTime;
        double mTime1;
        double mTime2;
        double mTmpCosAngle;
        double mTmpSinAngle;
        boolean mVertical;
        double mX1;
        double mX2;
        double mY1;
        double mY2;

        Arc(int i, double d2, double d3, double d4, double d5, double d6, double d7) {
            int i2 = i;
            double d8 = d2;
            double d9 = d3;
            double d10 = d4;
            double d11 = d5;
            double d12 = d6;
            double d13 = d7;
            boolean z = false;
            this.mVertical = i2 == 1 ? true : z;
            this.mTime1 = d8;
            this.mTime2 = d9;
            this.mOneOverDeltaTime = 1.0d / (d9 - d8);
            if (3 == i2) {
                this.linear = true;
            }
            double d14 = d12 - d10;
            double d15 = d13 - d11;
            if (this.linear || Math.abs(d14) < 0.001d || Math.abs(d15) < 0.001d) {
                this.linear = true;
                this.mX1 = d10;
                this.mX2 = d12;
                this.mY1 = d11;
                this.mY2 = d13;
                double hypot = Math.hypot(d15, d14);
                this.mArcDistance = hypot;
                this.mArcVelocity = hypot * this.mOneOverDeltaTime;
                double d16 = this.mTime2;
                double d17 = this.mTime1;
                this.mEllipseCenterX = d14 / (d16 - d17);
                this.mEllipseCenterY = d15 / (d16 - d17);
                return;
            }
            this.mLut = new double[101];
            this.mEllipseA = d14 * ((double) (this.mVertical ? -1 : 1));
            this.mEllipseB = d15 * ((double) (this.mVertical ? 1 : -1));
            this.mEllipseCenterX = this.mVertical ? d12 : d10;
            this.mEllipseCenterY = this.mVertical ? d11 : d13;
            buildTable(d4, d5, d6, d7);
            this.mArcVelocity = this.mArcDistance * this.mOneOverDeltaTime;
        }

        /* access modifiers changed from: package-private */
        public void setPoint(double d2) {
            double lookup = lookup((this.mVertical ? this.mTime2 - d2 : d2 - this.mTime1) * this.mOneOverDeltaTime) * 1.5707963267948966d;
            this.mTmpSinAngle = Math.sin(lookup);
            this.mTmpCosAngle = Math.cos(lookup);
        }

        /* access modifiers changed from: package-private */
        public double getX() {
            return this.mEllipseCenterX + (this.mEllipseA * this.mTmpSinAngle);
        }

        /* access modifiers changed from: package-private */
        public double getY() {
            return this.mEllipseCenterY + (this.mEllipseB * this.mTmpCosAngle);
        }

        /* access modifiers changed from: package-private */
        public double getDX() {
            double d2 = this.mEllipseA * this.mTmpCosAngle;
            double hypot = this.mArcVelocity / Math.hypot(d2, (-this.mEllipseB) * this.mTmpSinAngle);
            if (this.mVertical) {
                d2 = -d2;
            }
            return d2 * hypot;
        }

        /* access modifiers changed from: package-private */
        public double getDY() {
            double d2 = this.mEllipseA * this.mTmpCosAngle;
            double d3 = (-this.mEllipseB) * this.mTmpSinAngle;
            double hypot = this.mArcVelocity / Math.hypot(d2, d3);
            return this.mVertical ? (-d3) * hypot : d3 * hypot;
        }

        public double getLinearX(double d2) {
            double d3 = (d2 - this.mTime1) * this.mOneOverDeltaTime;
            double d4 = this.mX1;
            return d4 + (d3 * (this.mX2 - d4));
        }

        public double getLinearY(double d2) {
            double d3 = (d2 - this.mTime1) * this.mOneOverDeltaTime;
            double d4 = this.mY1;
            return d4 + (d3 * (this.mY2 - d4));
        }

        public double getLinearDX(double d2) {
            return this.mEllipseCenterX;
        }

        public double getLinearDY(double d2) {
            return this.mEllipseCenterY;
        }

        /* access modifiers changed from: package-private */
        public double lookup(double d2) {
            if (d2 <= 0.0d) {
                return 0.0d;
            }
            if (d2 >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.mLut;
            double length = d2 * ((double) (dArr.length - 1));
            int i = (int) length;
            return dArr[i] + ((length - ((double) i)) * (dArr[i + 1] - dArr[i]));
        }

        private void buildTable(double d2, double d3, double d4, double d5) {
            double d6;
            double d7 = d4 - d2;
            double d8 = d3 - d5;
            int i = 0;
            double d9 = 0.0d;
            double d10 = 0.0d;
            double d11 = 0.0d;
            while (true) {
                double[] dArr = ourPercent;
                if (i >= dArr.length) {
                    break;
                }
                double d12 = d9;
                double radians = Math.toRadians((((double) i) * 90.0d) / ((double) (dArr.length - 1)));
                double sin = Math.sin(radians) * d7;
                double cos = Math.cos(radians) * d8;
                if (i > 0) {
                    d6 = d12 + Math.hypot(sin - d10, cos - d11);
                    ourPercent[i] = d6;
                } else {
                    d6 = d12;
                }
                i++;
                d11 = cos;
                double d13 = sin;
                d9 = d6;
                d10 = d13;
            }
            double d14 = d9;
            this.mArcDistance = d14;
            int i2 = 0;
            while (true) {
                double[] dArr2 = ourPercent;
                if (i2 >= dArr2.length) {
                    break;
                }
                dArr2[i2] = dArr2[i2] / d14;
                i2++;
            }
            int i3 = 0;
            while (true) {
                double[] dArr3 = this.mLut;
                if (i3 < dArr3.length) {
                    double length = ((double) i3) / ((double) (dArr3.length - 1));
                    int binarySearch = Arrays.binarySearch(ourPercent, length);
                    if (binarySearch >= 0) {
                        this.mLut[i3] = ((double) binarySearch) / ((double) (ourPercent.length - 1));
                    } else if (binarySearch == -1) {
                        this.mLut[i3] = 0.0d;
                    } else {
                        int i4 = -binarySearch;
                        int i5 = i4 - 2;
                        double[] dArr4 = ourPercent;
                        this.mLut[i3] = (((double) i5) + ((length - dArr4[i5]) / (dArr4[i4 - 1] - dArr4[i5]))) / ((double) (dArr4.length - 1));
                    }
                    i3++;
                } else {
                    return;
                }
            }
        }
    }
}
