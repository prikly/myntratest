package io.bidmachine.models;

import android.location.Location;
import io.bidmachine.utils.Gender;

public interface TargetingInfo {
    String getCity();

    String getCountry();

    Location getDeviceLocation();

    Gender getGender();

    String[] getKeywords();

    String getStoreUrl();

    Integer getUserAge();

    Integer getUserBirthdayYear();

    String getUserId();

    String getZip();

    Boolean isPaid();
}
