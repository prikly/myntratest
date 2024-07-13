package com.explorestack.iab.mraid;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.Window;
import com.explorestack.iab.utils.Utils;

public class MraidDialogActivity extends MraidActivity {
    public void onBeforeCreate(Window window) {
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    public void onBeforeShowContent() {
        int intExtra;
        Window window = getWindow();
        Intent intent = getIntent();
        if (!(window == null || Build.VERSION.SDK_INT < 21 || (intExtra = intent.getIntExtra("param_status_bar_color", 0)) == 0)) {
            window.setStatusBarColor(intExtra);
        }
        Utils.applyFullscreenActivityFlags(this, intent.hasExtra("param_is_no_status_bar"));
    }
}
