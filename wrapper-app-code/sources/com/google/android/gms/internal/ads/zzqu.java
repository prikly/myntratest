package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzqu implements zzrd {
    public static final /* synthetic */ zzqu zza = new zzqu();

    private /* synthetic */ zzqu() {
    }

    public final int zza(Object obj) {
        int i = zzre.zza;
        String str = ((zzqm) obj).zza;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        if (zzen.zza >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
            return 0;
        }
        return -1;
    }
}
