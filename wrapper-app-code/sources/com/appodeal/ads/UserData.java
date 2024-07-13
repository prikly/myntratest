package com.appodeal.ads;

public interface UserData extends UserSettings {
    String getAddress();

    String getCity();

    String getCountryId();

    String getIp();

    String getIpv6();

    Float getLat();

    Float getLon();

    String getZip();
}
