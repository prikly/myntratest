package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@5.1.0 */
enum zza {
    RESPONSE_CODE_UNSPECIFIED(OSUtils.UNINITIALIZABLE_STATUS),
    SERVICE_TIMEOUT(-3),
    FEATURE_NOT_SUPPORTED(-2),
    SERVICE_DISCONNECTED(-1),
    OK(0),
    USER_CANCELED(1),
    SERVICE_UNAVAILABLE(2),
    BILLING_UNAVAILABLE(3),
    ITEM_UNAVAILABLE(4),
    DEVELOPER_ERROR(5),
    ERROR(6),
    ITEM_ALREADY_OWNED(7),
    ITEM_NOT_OWNED(8),
    EXPIRED_OFFER_TOKEN(11);
    
    private static final zzx zzo = null;
    private final int zzq;

    static {
        int i;
        zzw zzw = new zzw();
        for (zza zza : values()) {
            zzw.zza(Integer.valueOf(zza.zzq), zza);
        }
        zzo = zzw.zzb();
    }

    private zza(int i) {
        this.zzq = i;
    }

    static zza zza(int i) {
        zzx zzx = zzo;
        Integer valueOf = Integer.valueOf(i);
        if (!zzx.containsKey(valueOf)) {
            return RESPONSE_CODE_UNSPECIFIED;
        }
        return (zza) zzo.get(valueOf);
    }
}
