package com.google.firebase.iid;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.firebase:firebase-iid@@20.2.3 */
final /* synthetic */ class FcmBroadcastProcessor$$Lambda$3 implements Continuation {
    static final Continuation $instance = new FcmBroadcastProcessor$$Lambda$3();

    private FcmBroadcastProcessor$$Lambda$3() {
    }

    public final Object then(Task task) {
        return Integer.valueOf(TTAdConstant.DEEPLINK_UNAVAILABLE_CODE);
    }
}
