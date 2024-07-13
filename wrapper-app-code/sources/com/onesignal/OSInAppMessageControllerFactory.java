package com.onesignal;

import android.os.Build;
import com.onesignal.language.LanguageContext;

class OSInAppMessageControllerFactory {
    private static final Object LOCK = new Object();
    private OSInAppMessageController controller;

    OSInAppMessageControllerFactory() {
    }

    public OSInAppMessageController getController(OneSignalDbHelper oneSignalDbHelper, OSTaskController oSTaskController, OSLogger oSLogger, OSSharedPreferences oSSharedPreferences, LanguageContext languageContext) {
        if (this.controller == null) {
            synchronized (LOCK) {
                if (this.controller == null) {
                    if (Build.VERSION.SDK_INT <= 18) {
                        this.controller = new OSInAppMessageDummyController((OneSignalDbHelper) null, oSTaskController, oSLogger, oSSharedPreferences, languageContext);
                    } else {
                        this.controller = new OSInAppMessageController(oneSignalDbHelper, oSTaskController, oSLogger, oSSharedPreferences, languageContext);
                    }
                }
            }
        }
        return this.controller;
    }
}
