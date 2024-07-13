package com.appodeal.ads;

import android.location.Location;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\u000f\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0002\u0010\u0006J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\bH&¢\u0006\u0002\u0010\tJ\n\u0010\n\u001a\u0004\u0018\u00010\u0003H&J\u000f\u0010\u000b\u001a\u0004\u0018\u00010\bH&¢\u0006\u0002\u0010\t¨\u0006\f"}, d2 = {"Lcom/appodeal/ads/LocationData;", "", "getDeviceLocation", "Landroid/location/Location;", "getDeviceLocationType", "", "()Ljava/lang/Integer;", "obtainLatitude", "", "()Ljava/lang/Float;", "obtainLocation", "obtainLongitude", "apd_core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface LocationData {
    Location getDeviceLocation();

    Integer getDeviceLocationType();

    Float obtainLatitude();

    Location obtainLocation();

    Float obtainLongitude();
}
