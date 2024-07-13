package org.altbeacon.beacon.distance;

import org.altbeacon.beacon.logging.LogManager;

public class CurveFittedDistanceCalculator implements DistanceCalculator {
    private double mCoefficient1;
    private double mCoefficient2;
    private double mCoefficient3;

    public CurveFittedDistanceCalculator(double d2, double d3, double d4) {
        this.mCoefficient1 = d2;
        this.mCoefficient2 = d3;
        this.mCoefficient3 = d4;
    }

    public double calculateDistance(int i, double d2) {
        double d3;
        if (d2 == 0.0d) {
            return -1.0d;
        }
        LogManager.d("CurveFittedDistanceCalculator", "calculating distance based on mRssi of %s and txPower of %s", Double.valueOf(d2), Integer.valueOf(i));
        double d4 = (d2 * 1.0d) / ((double) i);
        if (d4 < 1.0d) {
            d3 = Math.pow(d4, 10.0d);
        } else {
            d3 = (this.mCoefficient1 * Math.pow(d4, this.mCoefficient2)) + this.mCoefficient3;
        }
        LogManager.d("CurveFittedDistanceCalculator", "avg mRssi: %s distance: %s", Double.valueOf(d2), Double.valueOf(d3));
        return d3;
    }
}
