package com.google.firebase.platforminfo;

abstract class LibraryVersion {
    public abstract String getLibraryName();

    public abstract String getVersion();

    LibraryVersion() {
    }

    /* access modifiers changed from: package-private */
    public static LibraryVersion create(String str, String str2) {
        return new AutoValue_LibraryVersion(str, str2);
    }
}
