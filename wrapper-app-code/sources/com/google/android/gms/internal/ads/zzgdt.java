package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgdt extends zzgds {
    final AtomicReferenceFieldUpdater zza;
    final AtomicIntegerFieldUpdater zzb;

    zzgdt(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super((zzgdr) null);
        this.zza = atomicReferenceFieldUpdater;
        this.zzb = atomicIntegerFieldUpdater;
    }

    /* access modifiers changed from: package-private */
    public final int zza(zzgdw zzgdw) {
        return this.zzb.decrementAndGet(zzgdw);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP:0: B:1:0x0002->B:4:0x000e, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzb(com.google.android.gms.internal.ads.zzgdw r2, java.util.Set r3, java.util.Set r4) {
        /*
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = r1.zza
        L_0x0002:
            r0 = 0
            boolean r0 = r3.compareAndSet(r2, r0, r4)
            if (r0 == 0) goto L_0x000a
            goto L_0x0010
        L_0x000a:
            java.lang.Object r0 = r3.get(r2)
            if (r0 == 0) goto L_0x0002
        L_0x0010:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgdt.zzb(com.google.android.gms.internal.ads.zzgdw, java.util.Set, java.util.Set):void");
    }
}
