package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgdv extends zzgds {
    private zzgdv() {
        super((zzgdr) null);
    }

    /* synthetic */ zzgdv(zzgdu zzgdu) {
        super((zzgdr) null);
    }

    /* access modifiers changed from: package-private */
    public final int zza(zzgdw zzgdw) {
        int zzA;
        synchronized (zzgdw) {
            zzA = zzgdw.remaining - 1;
            zzgdw.remaining = zzA;
        }
        return zzA;
    }

    /* access modifiers changed from: package-private */
    public final void zzb(zzgdw zzgdw, Set set, Set set2) {
        synchronized (zzgdw) {
            if (zzgdw.seenExceptions == null) {
                zzgdw.seenExceptions = set2;
            }
        }
    }
}
