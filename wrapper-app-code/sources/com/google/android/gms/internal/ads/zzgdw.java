package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgdf;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
abstract class zzgdw extends zzgdf.zzi {
    private static final zzgds zzaZ;
    private static final Logger zzba;
    /* access modifiers changed from: private */
    public volatile int remaining;
    /* access modifiers changed from: private */
    public volatile Set<Throwable> seenExceptions = null;

    static {
        Throwable th;
        zzgds zzgds;
        Class<zzgdw> cls = zzgdw.class;
        zzba = Logger.getLogger(cls.getName());
        try {
            zzgds = new zzgdt(AtomicReferenceFieldUpdater.newUpdater(cls, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(cls, "remaining"));
            th = null;
        } catch (Error | RuntimeException e2) {
            zzgds = new zzgdv((zzgdu) null);
            th = e2;
        }
        zzaZ = zzgds;
        if (th != null) {
            zzba.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    zzgdw(int i) {
        this.remaining = i;
    }

    /* access modifiers changed from: package-private */
    public final int zzB() {
        return zzaZ.zza(this);
    }

    /* access modifiers changed from: package-private */
    public final Set zzD() {
        Set<Throwable> set = this.seenExceptions;
        if (set != null) {
            return set;
        }
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        zzf(newSetFromMap);
        zzaZ.zzb(this, (Set) null, newSetFromMap);
        Set<Throwable> set2 = this.seenExceptions;
        set2.getClass();
        return set2;
    }

    /* access modifiers changed from: package-private */
    public final void zzG() {
        this.seenExceptions = null;
    }

    /* access modifiers changed from: package-private */
    public abstract void zzf(Set set);
}
