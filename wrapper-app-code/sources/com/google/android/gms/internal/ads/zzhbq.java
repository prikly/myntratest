package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzhbq implements zzgyh {
    static final zzgyh zza = new zzhbq();

    private zzhbq() {
    }

    public final boolean zza(int i) {
        if (!(i == 0 || i == 1 || i == 2 || i == 1999)) {
            switch (i) {
                case 1000:
                case 1001:
                case 1002:
                case 1003:
                case 1004:
                case 1005:
                case 1006:
                case IronSourceError.AUCTION_REQUEST_ERROR_MISSING_PARAMS /*1007*/:
                case IronSourceError.AUCTION_ERROR_DECOMPRESSION /*1008*/:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
