package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzasv extends Handler {
    final /* synthetic */ zzasw zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzasv(zzasw zzasw, Looper looper) {
        super(looper);
        this.zza = zzasw;
    }

    public final void handleMessage(Message message) {
        this.zza.zzt(message);
    }
}
