package com.onesignal;

class OSEmailSubscriptionChangedInternalObserver {
    OSEmailSubscriptionChangedInternalObserver() {
    }

    /* access modifiers changed from: package-private */
    public void changed(OSEmailSubscriptionState oSEmailSubscriptionState) {
        fireChangesToPublicObserver(oSEmailSubscriptionState);
    }

    static void fireChangesToPublicObserver(OSEmailSubscriptionState oSEmailSubscriptionState) {
        if (OneSignal.getEmailSubscriptionStateChangesObserver().notifyChange(new OSEmailSubscriptionStateChanges(OneSignal.lastEmailSubscriptionState, (OSEmailSubscriptionState) oSEmailSubscriptionState.clone()))) {
            OneSignal.lastEmailSubscriptionState = (OSEmailSubscriptionState) oSEmailSubscriptionState.clone();
            OneSignal.lastEmailSubscriptionState.persistAsFrom();
        }
    }
}
