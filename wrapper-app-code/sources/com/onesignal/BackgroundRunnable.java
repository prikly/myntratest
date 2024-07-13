package com.onesignal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/onesignal/BackgroundRunnable;", "Ljava/lang/Runnable;", "()V", "run", "", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: BackgroundRunnable.kt */
public class BackgroundRunnable implements Runnable {
    public void run() {
        Thread currentThread = Thread.currentThread();
        Intrinsics.checkNotNullExpressionValue(currentThread, "Thread.currentThread()");
        currentThread.setPriority(10);
    }
}
