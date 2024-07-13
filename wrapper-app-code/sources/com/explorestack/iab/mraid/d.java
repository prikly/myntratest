package com.explorestack.iab.mraid;

import java.util.Locale;

public enum d {
    INLINE,
    INTERSTITIAL;

    public String a() {
        return toString().toLowerCase(Locale.US);
    }
}
