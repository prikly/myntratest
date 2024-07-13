package com.google.android.play.core.review;

import android.content.Context;

/* compiled from: com.google.android.play:review@@2.0.0 */
public class ReviewManagerFactory {
    public static ReviewManager create(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return new zzd(new zzi(context));
    }
}
