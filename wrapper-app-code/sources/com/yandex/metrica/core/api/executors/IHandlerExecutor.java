package com.yandex.metrica.core.api.executors;

import android.os.Handler;
import android.os.Looper;

public interface IHandlerExecutor extends ICommonExecutor {
    Handler getHandler();

    Looper getLooper();
}
