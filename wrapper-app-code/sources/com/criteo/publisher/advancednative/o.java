package com.criteo.publisher.advancednative;

import android.graphics.Rect;
import android.view.View;

/* compiled from: VisibilityChecker */
public class o {
    /* access modifiers changed from: package-private */
    public boolean a(View view) {
        if (!view.isShown()) {
            return false;
        }
        if (view.getWidth() == 0 || view.getHeight() == 0) {
            return false;
        }
        return view.getGlobalVisibleRect(new Rect());
    }
}
