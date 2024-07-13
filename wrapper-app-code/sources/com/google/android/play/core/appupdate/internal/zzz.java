package com.google.android.play.core.appupdate.internal;

import android.content.Context;

/* compiled from: com.google.android.play:app-update@@2.0.0 */
public final class zzz {
    public static Context zza(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }
}
