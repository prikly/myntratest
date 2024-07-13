package com.google.android.gms.internal.ads;

import java.util.List;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzguf extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzguf zzb;
    private String zzd = "";
    private zzgym zze = zzaL();

    static {
        zzguf zzguf = new zzguf();
        zzb = zzguf;
        zzgyd.zzaS(zzguf.class, zzguf);
    }

    private zzguf() {
    }

    public static zzguf zzc() {
        return zzb;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzd", "zze", zzgte.class});
        } else if (i2 == 3) {
            return new zzguf();
        } else {
            if (i2 == 4) {
                return new zzgue((zzgud) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final List zzd() {
        return this.zze;
    }
}
