package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public enum zzbhj implements zzgyf {
    UNSPECIFIED(0),
    CONNECTING(1),
    CONNECTED(2),
    DISCONNECTING(3),
    DISCONNECTED(4),
    SUSPENDED(5);
    
    private static final zzgyg zzg = null;
    private final int zzi;

    static {
        zzg = new zzbhh();
    }

    private zzbhj(int i) {
        this.zzi = i;
    }

    public static zzbhj zzb(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return CONNECTING;
        }
        if (i == 2) {
            return CONNECTED;
        }
        if (i == 3) {
            return DISCONNECTING;
        }
        if (i == 4) {
            return DISCONNECTED;
        }
        if (i != 5) {
            return null;
        }
        return SUSPENDED;
    }

    public static zzgyh zzc() {
        return zzbhi.zza;
    }

    public final String toString() {
        return Integer.toString(this.zzi);
    }

    public final int zza() {
        return this.zzi;
    }
}
