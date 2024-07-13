package io.bidmachine;

import android.app.Activity;
import android.content.Context;

final class SimpleContextProvider implements ContextProvider {
    private final Context context;

    SimpleContextProvider(Context context2) {
        this.context = context2;
    }

    public Context getApplicationContext() {
        return getContext().getApplicationContext();
    }

    public Context getContext() {
        return this.context;
    }

    public Activity getActivity() {
        Context context2 = getContext();
        if (context2 instanceof Activity) {
            return (Activity) context2;
        }
        return BidMachineActivityManager.getTopActivity();
    }
}
