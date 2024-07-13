package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
abstract class zzfzs implements zzgbq {
    private transient Set zza;
    private transient Collection zzb;
    private transient Map zzc;

    zzfzs() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgbq)) {
            return false;
        }
        return zzu().equals(((zzgbq) obj).zzu());
    }

    public final int hashCode() {
        return zzu().hashCode();
    }

    public final String toString() {
        return zzu().toString();
    }

    /* access modifiers changed from: package-private */
    public abstract Collection zzi();

    /* access modifiers changed from: package-private */
    public Iterator zzj() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public abstract Map zzm();

    /* access modifiers changed from: package-private */
    public abstract Set zzo();

    public boolean zzs(Object obj, Object obj2) {
        throw null;
    }

    public final Collection zzt() {
        Collection collection = this.zzb;
        if (collection != null) {
            return collection;
        }
        Collection zzi = zzi();
        this.zzb = zzi;
        return zzi;
    }

    public final Map zzu() {
        Map map = this.zzc;
        if (map != null) {
            return map;
        }
        Map zzm = zzm();
        this.zzc = zzm;
        return zzm;
    }

    public final Set zzv() {
        Set set = this.zza;
        if (set != null) {
            return set;
        }
        Set zzo = zzo();
        this.zza = zzo;
        return zzo;
    }
}
