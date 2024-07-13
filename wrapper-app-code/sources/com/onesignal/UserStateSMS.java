package com.onesignal;

class UserStateSMS extends UserState {
    private static final String SMS = "sms";

    /* access modifiers changed from: protected */
    public void addDependFields() {
    }

    /* access modifiers changed from: package-private */
    public boolean isSubscribed() {
        return true;
    }

    UserStateSMS(String str, boolean z) {
        super(SMS + str, z);
    }

    /* access modifiers changed from: package-private */
    public UserState newInstance(String str) {
        return new UserStateSMS(str, false);
    }
}
