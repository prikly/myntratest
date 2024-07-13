package com.appodeal.ads;

import android.location.Location;

public final class z1 implements LocationData {

    /* renamed from: d  reason: collision with root package name */
    public static Location f17745d;

    /* renamed from: a  reason: collision with root package name */
    public final RestrictedData f17746a;

    /* renamed from: b  reason: collision with root package name */
    public final Location f17747b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f17748c;

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public z1(android.content.Context r1, com.appodeal.ads.RestrictedData r2) {
        /*
            r0 = this;
            r0.<init>()
            r0.f17746a = r2
            if (r1 == 0) goto L_0x001d
            com.appodeal.ads.q4 r2 = com.appodeal.ads.q4.f17047a
            r2.getClass()
            boolean r2 = com.appodeal.ads.q4.p()
            if (r2 != 0) goto L_0x001d
            android.location.Location r1 = com.appodeal.ads.f1.i(r1)
            r0.f17747b = r1
            if (r1 == 0) goto L_0x0021
            f17745d = r1
            goto L_0x0021
        L_0x001d:
            android.location.Location r1 = f17745d
            r0.f17747b = r1
        L_0x0021:
            android.location.Location r1 = r0.f17747b
            if (r1 != 0) goto L_0x0027
            r1 = 0
            goto L_0x0028
        L_0x0027:
            r1 = 1
        L_0x0028:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.f17748c = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.z1.<init>(android.content.Context, com.appodeal.ads.RestrictedData):void");
    }

    public final Location getDeviceLocation() {
        if (this.f17746a.canSendLocation()) {
            return this.f17747b;
        }
        return null;
    }

    public final Integer getDeviceLocationType() {
        if (this.f17746a.canSendLocationType()) {
            return this.f17748c;
        }
        return null;
    }

    public final Float obtainLatitude() {
        if (!this.f17746a.canSendLocation()) {
            return null;
        }
        Location location = this.f17747b;
        return location != null ? Float.valueOf(Double.valueOf(location.getLatitude()).floatValue()) : l5.a().f16596h;
    }

    public final Location obtainLocation() {
        Float obtainLatitude;
        Float obtainLongitude;
        if (!this.f17746a.canSendLocation() || (obtainLatitude = obtainLatitude()) == null || (obtainLongitude = obtainLongitude()) == null) {
            return null;
        }
        Location location = new Location(DtbDeviceDataRetriever.ORIENTATION_UNKNOWN);
        location.setLatitude((double) obtainLatitude.floatValue());
        location.setLongitude((double) obtainLongitude.floatValue());
        return location;
    }

    public final Float obtainLongitude() {
        if (!this.f17746a.canSendLocation()) {
            return null;
        }
        Location location = this.f17747b;
        return location != null ? Float.valueOf(Double.valueOf(location.getLongitude()).floatValue()) : l5.a().i;
    }
}
