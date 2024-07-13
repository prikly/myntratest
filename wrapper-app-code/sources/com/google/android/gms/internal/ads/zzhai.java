package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzhai {
    private static final Class zza;
    private static final zzhax zzb = zzab(false);
    private static final zzhax zzc = zzab(true);
    private static final zzhax zzd = new zzhaz();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zza = cls;
    }

    public static zzhax zzA() {
        return zzc;
    }

    public static zzhax zzB() {
        return zzd;
    }

    static Object zzC(Object obj, int i, List list, zzgyh zzgyh, Object obj2, zzhax zzhax) {
        if (zzgyh == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (zzgyh.zza(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    obj2 = zzD(obj, i, intValue, obj2, zzhax);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzgyh.zza(intValue2)) {
                    obj2 = zzD(obj, i, intValue2, obj2, zzhax);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    static Object zzD(Object obj, int i, int i2, Object obj2, zzhax zzhax) {
        if (obj2 == null) {
            obj2 = zzhax.zzc(obj);
        }
        zzhax.zzl(obj2, i, (long) i2);
        return obj2;
    }

    static void zzE(zzgxq zzgxq, Object obj, Object obj2) {
        zzgxq.zza(obj2);
        throw null;
    }

    static void zzF(zzhax zzhax, Object obj, Object obj2) {
        zzhax.zzo(obj, zzhax.zze(zzhax.zzd(obj), zzhax.zzd(obj2)));
    }

    public static void zzG(Class cls) {
        Class cls2;
        if (!zzgyd.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean zzH(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static void zzI(zzgzi zzgzi, Object obj, Object obj2, long j) {
        zzhbh.zzv(obj, j, zzgzi.zzc(zzhbh.zzh(obj, j), zzhbh.zzh(obj2, j)));
    }

    public static void zzJ(int i, List list, zzgxl zzgxl, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgxl.zzc(i, list, z);
        }
    }

    public static void zzK(int i, List list, zzgxl zzgxl) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgxl.zze(i, list);
        }
    }

    public static void zzL(int i, List list, zzgxl zzgxl, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgxl.zzg(i, list, z);
        }
    }

    public static void zzM(int i, List list, zzgxl zzgxl, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgxl.zzj(i, list, z);
        }
    }

    public static void zzN(int i, List list, zzgxl zzgxl, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgxl.zzl(i, list, z);
        }
    }

    public static void zzO(int i, List list, zzgxl zzgxl, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgxl.zzn(i, list, z);
        }
    }

    public static void zzP(int i, List list, zzgxl zzgxl, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgxl.zzp(i, list, z);
        }
    }

    public static void zzQ(int i, List list, zzgxl zzgxl, zzhag zzhag) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                zzgxl.zzq(i, list.get(i2), zzhag);
            }
        }
    }

    public static void zzR(int i, List list, zzgxl zzgxl, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgxl.zzs(i, list, z);
        }
    }

    public static void zzS(int i, List list, zzgxl zzgxl, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgxl.zzu(i, list, z);
        }
    }

    public static void zzT(int i, List list, zzgxl zzgxl, zzhag zzhag) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                zzgxl.zzv(i, list.get(i2), zzhag);
            }
        }
    }

    public static void zzU(int i, List list, zzgxl zzgxl, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgxl.zzx(i, list, z);
        }
    }

    public static void zzV(int i, List list, zzgxl zzgxl, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgxl.zzz(i, list, z);
        }
    }

    public static void zzW(int i, List list, zzgxl zzgxl, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgxl.zzB(i, list, z);
        }
    }

    public static void zzX(int i, List list, zzgxl zzgxl, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgxl.zzD(i, list, z);
        }
    }

    public static void zzY(int i, List list, zzgxl zzgxl) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgxl.zzG(i, list);
        }
    }

    public static void zzZ(int i, List list, zzgxl zzgxl, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgxl.zzI(i, list, z);
        }
    }

    static int zza(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgxk.zzE(i << 3) + 1);
    }

    public static void zzaa(int i, List list, zzgxl zzgxl, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgxl.zzK(i, list, z);
        }
    }

    private static zzhax zzab(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (zzhax) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    static int zzb(List list) {
        return list.size();
    }

    static int zzc(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzD = size * zzgxk.zzD(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzD += zzgxk.zzw((zzgwv) list.get(i2));
        }
        return zzD;
    }

    static int zzd(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzgxk.zzD(i));
    }

    static int zze(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgye) {
            zzgye zzgye = (zzgye) list;
            i = 0;
            while (i2 < size) {
                i += zzgxk.zzy(zzgye.zze(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzgxk.zzy(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzf(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgxk.zzE(i << 3) + 4);
    }

    static int zzg(List list) {
        return list.size() * 4;
    }

    static int zzh(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgxk.zzE(i << 3) + 8);
    }

    static int zzi(List list) {
        return list.size() * 8;
    }

    static int zzj(int i, List list, zzhag zzhag) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzgxk.zzx(i, (zzgzn) list.get(i3), zzhag);
        }
        return i2;
    }

    static int zzk(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzl(list) + (size * zzgxk.zzD(i));
    }

    static int zzl(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgye) {
            zzgye zzgye = (zzgye) list;
            i = 0;
            while (i2 < size) {
                i += zzgxk.zzy(zzgye.zze(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzgxk.zzy(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzm(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return zzn(list) + (list.size() * zzgxk.zzD(i));
    }

    static int zzn(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgzc) {
            zzgzc zzgzc = (zzgzc) list;
            i = 0;
            while (i2 < size) {
                i += zzgxk.zzF(zzgzc.zze(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzgxk.zzF(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    static int zzo(int i, Object obj, zzhag zzhag) {
        if (!(obj instanceof zzgyt)) {
            return zzgxk.zzE(i << 3) + zzgxk.zzA((zzgzn) obj, zzhag);
        }
        int zzE = zzgxk.zzE(i << 3);
        int zza2 = ((zzgyt) obj).zza();
        return zzE + zzgxk.zzE(zza2) + zza2;
    }

    static int zzp(int i, List list, zzhag zzhag) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzD = zzgxk.zzD(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof zzgyt) {
                i2 = zzgxk.zzz((zzgyt) obj);
            } else {
                i2 = zzgxk.zzA((zzgzn) obj, zzhag);
            }
            zzD += i2;
        }
        return zzD;
    }

    static int zzq(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzr(list) + (size * zzgxk.zzD(i));
    }

    static int zzr(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgye) {
            zzgye zzgye = (zzgye) list;
            i = 0;
            while (i2 < size) {
                int zze = zzgye.zze(i2);
                i += zzgxk.zzE((zze >> 31) ^ (zze + zze));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i3 = i + zzgxk.zzE((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    static int zzs(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzt(list) + (size * zzgxk.zzD(i));
    }

    static int zzt(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgzc) {
            zzgzc zzgzc = (zzgzc) list;
            i = 0;
            while (i2 < size) {
                long zze = zzgzc.zze(i2);
                i += zzgxk.zzF((zze >> 63) ^ (zze + zze));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i3 = i + zzgxk.zzF((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    static int zzu(int i, List list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int zzD = zzgxk.zzD(i) * size;
        if (list instanceof zzgyv) {
            zzgyv zzgyv = (zzgyv) list;
            while (i4 < size) {
                Object zzf = zzgyv.zzf(i4);
                if (zzf instanceof zzgwv) {
                    i3 = zzgxk.zzw((zzgwv) zzf);
                } else {
                    i3 = zzgxk.zzC((String) zzf);
                }
                zzD += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof zzgwv) {
                    i2 = zzgxk.zzw((zzgwv) obj);
                } else {
                    i2 = zzgxk.zzC((String) obj);
                }
                zzD += i2;
                i4++;
            }
        }
        return zzD;
    }

    static int zzv(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzw(list) + (size * zzgxk.zzD(i));
    }

    static int zzw(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgye) {
            zzgye zzgye = (zzgye) list;
            i = 0;
            while (i2 < size) {
                i += zzgxk.zzE(zzgye.zze(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzgxk.zzE(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzx(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzy(list) + (size * zzgxk.zzD(i));
    }

    static int zzy(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgzc) {
            zzgzc zzgzc = (zzgzc) list;
            i = 0;
            while (i2 < size) {
                i += zzgxk.zzF(zzgzc.zze(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzgxk.zzF(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static zzhax zzz() {
        return zzb;
    }
}
