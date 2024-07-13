package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public class zzazz extends IOException {
    public final zzazv zza;

    public zzazz(IOException iOException, zzazv zzazv, int i) {
        super(iOException);
        this.zza = zzazv;
    }

    public zzazz(String str, zzazv zzazv, int i) {
        super(str);
        this.zza = zzazv;
    }

    public zzazz(String str, IOException iOException, zzazv zzazv, int i) {
        super(str, iOException);
        this.zza = zzazv;
    }
}
