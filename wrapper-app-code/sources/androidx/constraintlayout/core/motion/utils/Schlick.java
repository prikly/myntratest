package androidx.constraintlayout.core.motion.utils;

public class Schlick extends Easing {
    double mS;
    double mT;

    Schlick(String str) {
        this.str = str;
        int indexOf = str.indexOf(40);
        int indexOf2 = str.indexOf(44, indexOf);
        this.mS = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
        int i = indexOf2 + 1;
        this.mT = Double.parseDouble(str.substring(i, str.indexOf(44, i)).trim());
    }

    private double func(double d2) {
        double d3 = this.mT;
        if (d2 < d3) {
            return (d3 * d2) / (d2 + (this.mS * (d3 - d2)));
        }
        return ((1.0d - d3) * (d2 - 1.0d)) / ((1.0d - d2) - (this.mS * (d3 - d2)));
    }

    private double dfunc(double d2) {
        double d3 = this.mT;
        if (d2 < d3) {
            double d4 = this.mS;
            return ((d4 * d3) * d3) / ((((d3 - d2) * d4) + d2) * ((d4 * (d3 - d2)) + d2));
        }
        double d5 = this.mS;
        return (((d3 - 1.0d) * d5) * (d3 - 1.0d)) / (((((-d5) * (d3 - d2)) - d2) + 1.0d) * ((((-d5) * (d3 - d2)) - d2) + 1.0d));
    }

    public double getDiff(double d2) {
        return dfunc(d2);
    }

    public double get(double d2) {
        return func(d2);
    }
}
