package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public abstract class zzgax implements Serializable, Map {
    private transient zzgaz zza;
    private transient zzgaz zzb;
    private transient zzgap zzc;

    zzgax() {
    }

    public static zzgax zzc(Map map) {
        Set entrySet = map.entrySet();
        zzgaw zzgaw = new zzgaw(entrySet instanceof Collection ? entrySet.size() : 4);
        zzgaw.zzb(entrySet);
        return zzgaw.zzc();
    }

    public static zzgax zzd() {
        return zzgci.zza;
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public final boolean equals(Object obj) {
        return zzgbp.zzb(this, obj);
    }

    public abstract Object get(Object obj);

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    public final int hashCode() {
        return zzgcp.zza(entrySet());
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        zzfzt.zza(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public abstract zzgap zza();

    /* renamed from: zzb */
    public final zzgap values() {
        zzgap zzgap = this.zzc;
        if (zzgap != null) {
            return zzgap;
        }
        zzgap zza2 = zza();
        this.zzc = zza2;
        return zza2;
    }

    /* access modifiers changed from: package-private */
    public abstract zzgaz zze();

    /* access modifiers changed from: package-private */
    public abstract zzgaz zzf();

    /* renamed from: zzg */
    public final zzgaz entrySet() {
        zzgaz zzgaz = this.zza;
        if (zzgaz != null) {
            return zzgaz;
        }
        zzgaz zze = zze();
        this.zza = zze;
        return zze;
    }

    /* renamed from: zzh */
    public final zzgaz keySet() {
        zzgaz zzgaz = this.zzb;
        if (zzgaz != null) {
            return zzgaz;
        }
        zzgaz zzf = zzf();
        this.zzb = zzf;
        return zzf;
    }
}
