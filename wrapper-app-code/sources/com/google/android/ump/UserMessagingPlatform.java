package com.google.android.ump;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public final class UserMessagingPlatform {

    /* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
    public interface OnConsentFormLoadFailureListener {
        void onConsentFormLoadFailure(FormError formError);
    }

    /* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
    public interface OnConsentFormLoadSuccessListener {
        void onConsentFormLoadSuccess(ConsentForm consentForm);
    }
}
