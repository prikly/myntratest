package com.google.android.exoplayer2;

import java.util.HashSet;

public final class ExoPlayerLibraryInfo {
    private static final HashSet<String> registeredModules = new HashSet<>();
    private static String registeredModulesString = "goog.exo.core";

    public static synchronized void registerModule(String str) {
        synchronized (ExoPlayerLibraryInfo.class) {
            if (registeredModules.add(str)) {
                String str2 = registeredModulesString;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 2 + String.valueOf(str).length());
                sb.append(str2);
                sb.append(", ");
                sb.append(str);
                registeredModulesString = sb.toString();
            }
        }
    }
}
