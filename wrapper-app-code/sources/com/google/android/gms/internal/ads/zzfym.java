package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.TTAdSdk;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
final class zzfym extends zzfyp {
    final /* synthetic */ zzfyn zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfym(zzfyn zzfyn, zzfyr zzfyr, CharSequence charSequence) {
        super(zzfyr, charSequence);
        this.zza = zzfyn;
    }

    public final int zzc(int i) {
        return i;
    }

    public final int zzd(int i) {
        int i2 = i + TTAdSdk.INIT_LOCAL_FAIL_CODE;
        if (i2 < this.zzb.length()) {
            return i2;
        }
        return -1;
    }
}
