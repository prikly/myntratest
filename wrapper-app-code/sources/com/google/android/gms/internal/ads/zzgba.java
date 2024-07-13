package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgba {
    public static boolean zza(Iterable iterable, zzfyf zzfyf) {
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            if (zzfyf != null) {
                boolean z = false;
                while (it.hasNext()) {
                    if (zzfyf.zza(it.next())) {
                        it.remove();
                        z = true;
                    }
                }
                return z;
            }
            throw null;
        }
        List list = (List) iterable;
        if (zzfyf != null) {
            return zzc(list, zzfyf);
        }
        throw null;
    }

    private static void zzb(List list, zzfyf zzfyf, int i, int i2) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i2) {
                break;
            } else if (zzfyf.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i2--;
            if (i2 >= i) {
                list.remove(i2);
            } else {
                return;
            }
        }
    }

    private static boolean zzc(List list, zzfyf zzfyf) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            Object obj = list.get(i);
            if (!zzfyf.zza(obj)) {
                if (i > i2) {
                    try {
                        list.set(i2, obj);
                    } catch (UnsupportedOperationException unused) {
                        zzb(list, zzfyf, i2, i);
                        return true;
                    } catch (IllegalArgumentException unused2) {
                        zzb(list, zzfyf, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        return i != i2;
    }
}
