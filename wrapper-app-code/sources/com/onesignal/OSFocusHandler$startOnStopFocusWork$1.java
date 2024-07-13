package com.onesignal;

import com.onesignal.OneSignal;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 2})
/* compiled from: OSFocusHandler.kt */
final class OSFocusHandler$startOnStopFocusWork$1 implements Runnable {
    public static final OSFocusHandler$startOnStopFocusWork$1 INSTANCE = new OSFocusHandler$startOnStopFocusWork$1();

    OSFocusHandler$startOnStopFocusWork$1() {
    }

    public final void run() {
        OSFocusHandler.stopped = true;
        OneSignal.onesignalLog(OneSignal.LOG_LEVEL.DEBUG, "OSFocusHandler setting stop state: true");
    }
}
