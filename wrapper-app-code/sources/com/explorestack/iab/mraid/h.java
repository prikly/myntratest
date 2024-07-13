package com.explorestack.iab.mraid;

import java.util.Locale;

public enum h {
    LOADING,
    DEFAULT,
    RESIZED,
    EXPANDED,
    HIDDEN;

    public String a() {
        return toString().toLowerCase(Locale.US);
    }
}
