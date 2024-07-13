package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class zzlg extends LinkedHashMap {
    private static final zzlg zza;
    private boolean zzb = true;

    static {
        zzlg zzlg = new zzlg();
        zza = zzlg;
        zzlg.zzb = false;
    }

    private zzlg() {
    }

    public static zzlg zza() {
        return zza;
    }

    private static int zzf(Object obj) {
        if (obj instanceof byte[]) {
            return zzkn.zzb((byte[]) obj);
        }
        if (!(obj instanceof zzkh)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    private final void zzg() {
        if (!this.zzb) {
            throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        zzg();
        super.clear();
    }

    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(value instanceof byte[]) || !(obj2 instanceof byte[])) {
                z = value.equals(obj2);
                continue;
            } else {
                z = Arrays.equals((byte[]) value, (byte[]) obj2);
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += zzf(entry.getValue()) ^ zzf(entry.getKey());
        }
        return i;
    }

    public final Object put(Object obj, Object obj2) {
        zzg();
        zzkn.zze(obj);
        zzkn.zze(obj2);
        return super.put(obj, obj2);
    }

    public final void putAll(Map map) {
        zzg();
        for (Object next : map.keySet()) {
            zzkn.zze(next);
            zzkn.zze(map.get(next));
        }
        super.putAll(map);
    }

    public final Object remove(Object obj) {
        zzg();
        return super.remove(obj);
    }

    public final zzlg zzb() {
        return isEmpty() ? new zzlg() : new zzlg(this);
    }

    public final void zzc() {
        this.zzb = false;
    }

    public final void zzd(zzlg zzlg) {
        zzg();
        if (!zzlg.isEmpty()) {
            putAll(zzlg);
        }
    }

    public final boolean zze() {
        return this.zzb;
    }

    private zzlg(Map map) {
        super(map);
    }
}
