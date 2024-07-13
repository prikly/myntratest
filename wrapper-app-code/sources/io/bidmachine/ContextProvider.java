package io.bidmachine;

import android.app.Activity;
import android.content.Context;

public interface ContextProvider {
    Activity getActivity();

    Context getApplicationContext();

    Context getContext();
}
