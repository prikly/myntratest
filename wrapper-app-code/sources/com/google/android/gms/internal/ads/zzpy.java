package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzpy extends Handler {
    final /* synthetic */ zzqa zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzpy(zzqa zzqa, Looper looper) {
        super(looper);
        this.zza = zzqa;
    }

    public final void handleMessage(Message message) {
        zzqa.zza(this.zza, message);
    }
}
