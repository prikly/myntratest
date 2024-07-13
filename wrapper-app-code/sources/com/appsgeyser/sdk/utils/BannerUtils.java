package com.appsgeyser.sdk.utils;

public class BannerUtils {
    public static boolean isDataTextHtmlUrl(String str) {
        return str.startsWith("data:text/html");
    }
}
