package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzfxx {
    private final String zza;
    private final zzfxw zzb;
    private zzfxw zzc;

    /* synthetic */ zzfxx(String str, zzfxv zzfxv) {
        zzfxw zzfxw = new zzfxw((zzfxv) null);
        this.zzb = zzfxw;
        this.zzc = zzfxw;
        if (str != null) {
            this.zza = str;
            return;
        }
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.zza);
        sb.append('{');
        zzfxw zzfxw = this.zzb.zzb;
        String str = "";
        while (zzfxw != null) {
            Object obj = zzfxw.zza;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append(deepToString, 1, deepToString.length() - 1);
            }
            zzfxw = zzfxw.zzb;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public final zzfxx zza(Object obj) {
        zzfxw zzfxw = new zzfxw((zzfxv) null);
        this.zzc.zzb = zzfxw;
        this.zzc = zzfxw;
        zzfxw.zza = obj;
        return this;
    }
}
