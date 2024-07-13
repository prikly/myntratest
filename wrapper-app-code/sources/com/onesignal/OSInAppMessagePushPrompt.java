package com.onesignal;

import com.onesignal.OneSignal;

public class OSInAppMessagePushPrompt extends OSInAppMessagePrompt {
    static final String PUSH_PROMPT_KEY = "push";

    /* access modifiers changed from: package-private */
    public String getPromptKey() {
        return PUSH_PROMPT_KEY;
    }

    /* access modifiers changed from: package-private */
    public void handlePrompt(OneSignal.OSPromptActionCompletionCallback oSPromptActionCompletionCallback) {
        OneSignal.promptForPushNotifications(true, new OneSignal.PromptForPushNotificationPermissionResponseHandler() {
            public final void response(boolean z) {
                OSInAppMessagePushPrompt.lambda$handlePrompt$0(OneSignal.OSPromptActionCompletionCallback.this, z);
            }
        });
    }

    static /* synthetic */ void lambda$handlePrompt$0(OneSignal.OSPromptActionCompletionCallback oSPromptActionCompletionCallback, boolean z) {
        OneSignal.PromptActionResult promptActionResult;
        if (z) {
            promptActionResult = OneSignal.PromptActionResult.PERMISSION_GRANTED;
        } else {
            promptActionResult = OneSignal.PromptActionResult.PERMISSION_DENIED;
        }
        oSPromptActionCompletionCallback.onCompleted(promptActionResult);
    }
}
