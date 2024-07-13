package com.yandex.metrica.uiaccessor;

import android.app.Activity;

public interface b {
    void subscribe(Activity activity) throws Throwable;

    void unsubscribe(Activity activity) throws Throwable;
}
