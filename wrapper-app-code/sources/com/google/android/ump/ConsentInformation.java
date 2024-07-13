package com.google.android.ump;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public interface ConsentInformation {

    /* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
    public interface OnConsentInfoUpdateFailureListener {
        void onConsentInfoUpdateFailure(FormError formError);
    }

    /* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
    public interface OnConsentInfoUpdateSuccessListener {
        void onConsentInfoUpdateSuccess();
    }
}
